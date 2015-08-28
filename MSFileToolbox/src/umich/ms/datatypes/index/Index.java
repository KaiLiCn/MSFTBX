package umich.ms.datatypes.index;

import java.util.Map;
import java.util.NavigableMap;

/**
 * @author Dmitry Avtonomov
 * @param <T>
 */
public interface Index<T extends IndexElement> {
    /**
     * Add a new index element to this index.
     * @param indexElement
     */
    void add(T indexElement);

    /**
     * Retrieves a value by the internal scan number.
     * Internal scan numbers start from 1 and increment by 1 for each consecutive scan.
     * @param num
     * @return
     */
    T getByNum(int num);

    /**
     * Retrieves a value by the raw scan number from the original file.
     * @param num raw scan number from the original file
     * @return
     */
    T getByRawNum(int num);

    /**
     * Retrieves a value by the textual ID of a scan.
     * @param id
     * @return
     */
    T getById(String id);

    /**
     * Current size of the index.
     * @return
     */
    int size();

    /**
     * A mapping from internal scan numbers.
     * @return
     */
    NavigableMap<Integer, T> getMapByNum();

    /**
     * A mapping from original raw scan numbers (or "spectrum index" values in mzML).
     * @return
     */
    NavigableMap<Integer, T> getMapByRawNum();

    /**
     * A mapping from textual scan IDs. For now only mzML uses that, other
     * implementations default to providing a string representation of
     * {@link IndexElement#getRawNumber() }.
     * @return
     */
    Map<String, T> getMapById();
}