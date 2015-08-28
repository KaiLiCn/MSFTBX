/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umich.ms.datatypes;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import umich.ms.util.DoubleRange;

/**
 * <b>NOT IN USE YET, SUPPOSED TO REPLACE {@link LCMSDataSubset}</b>
 * A union of several {@link LCMSRange} objects. It will not store the objects
 * added to it, so there is no way to retrieve an added object.
 * @author Dmitry Avtonomov
 */
public class LCMSRangeSet {

    RangeSet<Integer> anyLvlSet;
    Map<Integer, MsLevelRangeSet> lvlMap;

    public LCMSRangeSet() {
        anyLvlSet = TreeRangeSet.create();
        lvlMap = new TreeMap<>();
    }


//    private RangeSet<Integer> findRangeSetFor(LCMSRange range) {
//        Integer msLevel = range.getMsLevel();
//        if (msLevel == null) {
//            return anyLvlSet;
//        }
//
//        MsLevelRangeSet msLvlRanges = lvlMap.get(msLevel);
//        if (msLvlRanges == null) {
//            msLvlRanges = new MsLevelRangeSet();
//            lvlMap.put(msLevel, msLvlRanges);
//        }
//
//        DoubleRange mzRange = range.getMzRange();
//        if (mzRange == null) {
//            return msLvlRanges.anyPrecursorSet;
//        }
//
//        RangeSet<Integer> rangeSet = msLvlRanges.rngMap.get(mzRange);
//        if (rangeSet == null) {
//            rangeSet = TreeRangeSet.create();
//            msLvlRanges.rngMap.put(mzRange, rangeSet);
//        }
//        return rangeSet;
//    }
//
//    public void add(LCMSRange range) {
//        RangeSet<Integer> rangeSetForRange = findRangeSetFor(range);
//        if (rangeSetForRange == null) {
//            throw new IllegalStateException("Could not find a suitable range-set"
//                    + " for the provided LCMSRange. This is a bug, this condition"
//                    + " should never happen.");
//        }
//        rangeSetForRange.add(range.getScanRange());
//    }

    /**
     * This add method gradually removes scan-ranges from the input range as it
     * descends down the hierarchy.
     * @param range
     */
    public void add(LCMSRange range) {
        Integer msLevel = range.getMsLevel();
        DoubleRange mzRange = range.getMzRange();
        Range<Integer> scanRange = range.getScanRange();

        if (msLevel == null) {
            // add to the top level range set
            anyLvlSet.add(scanRange);
            // remove from all underlying sets
            for (Map.Entry<Integer, MsLevelRangeSet> lvlMapEntry : lvlMap.entrySet()) {
                MsLevelRangeSet msLevelRangeSet = lvlMapEntry.getValue();
                msLevelRangeSet.removeFromAll(range);
            }
            return;
        }

        TreeRangeSet<Integer> scanRangeLeft = TreeRangeSet.create();
        scanRangeLeft.removeAll(anyLvlSet);
        if (scanRangeLeft.isEmpty()) {
            return; // if there's nothing left in the scan range, just stop
        }

        MsLevelRangeSet msLvlRanges = lvlMap.get(msLevel);
        if (msLvlRanges == null) {
            msLvlRanges = new MsLevelRangeSet();
            lvlMap.put(msLevel, msLvlRanges);
        }
        if (mzRange == null) {
            // add to any-mz-range range set
            msLvlRanges.anyPrecursorSet.addAll(scanRangeLeft);
            // remove from all specific mz-range sets
            msLvlRanges.removeFromSpecific(range);
            return;
        }

        scanRangeLeft.removeAll(msLvlRanges.anyPrecursorSet);
        if (scanRangeLeft.isEmpty()) {
            return;
        }

        RangeSet<Integer> rangeSetForMzRange = msLvlRanges.rngMap.get(mzRange);
        if (rangeSetForMzRange == null) {
            rangeSetForMzRange = TreeRangeSet.create();
            msLvlRanges.rngMap.put(mzRange, rangeSetForMzRange);
        }
        rangeSetForMzRange.addAll(scanRangeLeft);
    }

    /**
     * Will modify the set. Intended usage - when unloading data in LCMSData, create one
     * range set for data loaded by other users, then create a separate range set
     * for the LCMSRange that you want to unload. Subtract the "loaded by others"
     * from the range set you want to unload. Use this range set for unloading.
     * @param other
     */
    public void subtract(LCMSRangeSet other) {
        anyLvlSet.removeAll(other.anyLvlSet);
        for (Map.Entry<Integer, MsLevelRangeSet> lvlMapEntry : lvlMap.entrySet()) {
            Integer msLevel = lvlMapEntry.getKey();
            MsLevelRangeSet msLevelRangeSet = lvlMapEntry.getValue();

            // remove any top level scan ranges from the "any precursor" map at
            // this ms level
            msLevelRangeSet.anyPrecursorSet.removeAll(other.anyLvlSet);

            // if the other range set had this level, remove entries contained in it
            MsLevelRangeSet otherMsLevelRangeSet = other.lvlMap.get(msLevel);
            msLevelRangeSet.anyPrecursorSet.removeAll(otherMsLevelRangeSet.anyPrecursorSet);

            for (Map.Entry<DoubleRange, RangeSet<Integer>> rngMapEntry : msLevelRangeSet.rngMap.entrySet()) {
                if (rngMapEntry.getValue().isEmpty()) {
                    continue;
                }
                DoubleRange mzRange = rngMapEntry.getKey();
                RangeSet<Integer> rangeSet = rngMapEntry.getValue();
                rangeSet.removeAll(other.anyLvlSet);
                if (!rangeSet.isEmpty()) {
                    rangeSet.removeAll(otherMsLevelRangeSet.anyPrecursorSet);
                }
                if (!rangeSet.isEmpty()) {
                    RangeSet<Integer> otherRangeSetAtMsLevelForPrecursorRange = otherMsLevelRangeSet.rngMap.get(mzRange);
                    if (otherRangeSetAtMsLevelForPrecursorRange != null) {
                        rangeSet.removeAll(otherRangeSetAtMsLevelForPrecursorRange);
                    }
                }
            }
        }
    }

    public boolean isEmpty() {
        
        if (!anyLvlSet.isEmpty()) {
            return false;
        }

        for (Map.Entry<Integer, MsLevelRangeSet> lvlMapEntry : lvlMap.entrySet()) {
            MsLevelRangeSet msLevelRangeSet = lvlMapEntry.getValue();
            if (!msLevelRangeSet.anyPrecursorSet.isEmpty()) {
                return false;
            }
            for (Map.Entry<DoubleRange, RangeSet<Integer>> rngMapEntry : msLevelRangeSet.rngMap.entrySet()) {
                if (!rngMapEntry.getValue().isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }

    protected class MsLevelRangeSet {
        RangeSet<Integer> anyPrecursorSet;
        Map<DoubleRange, RangeSet<Integer>> rngMap;

        public MsLevelRangeSet() {
            anyPrecursorSet = TreeRangeSet.create();
            rngMap = new HashMap<>(3);
        }
        
        /**
         * Remove the range from all range sets in this ms level.
         * @param range 
         */
        public final void removeFromAll(LCMSRange range) {
            anyPrecursorSet.remove(range.getScanRange());
            removeFromSpecific(range);
        }
        
        /**
         * Remove range from all specific precursor ranges at this ms level.
         * @param range 
         */
        public final void removeFromSpecific(LCMSRange range) {
            for (Map.Entry<DoubleRange, RangeSet<Integer>> rngMapEntry : rngMap.entrySet()) {
                RangeSet<Integer> rangeSet = rngMapEntry.getValue();
                rangeSet.remove(range.getScanRange());
            }
        }
    }
}