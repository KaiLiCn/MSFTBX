/*
 * Copyright (c) 2016 Dmitry Avtonomov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package umich.ms.msfiletoolbox;

import java.util.*;

/**
 * @author Dmitry Avtonomov
 */
public class MsftbxInfo {
    public static final String version = "1.3.1";

    private static TreeMap<String, List<String>> changelog = new TreeMap<>();
    private static Map<String, List<String>> changelogImmutable = Collections.unmodifiableMap(changelog);

    static {
        String v131 = "v1.3.1";
        List<String> v131notes = new LinkedList<>();
        v131notes.add("PepXML parser updated to pepxml schema v120. Includes PTM Prophet and related changes.");
        changelog.put(v131, v131notes);

        String v130 = "v1.3.0";
        List<String> v130notes = new LinkedList<>();
        v130notes.add("Multiple improvements to mzML parsing.");
        v130notes.add("Support for ReferenceableParamGroups in mzML.");
        v130notes.add("Significant non-indexed files parsing speed up.");
        changelog.put(v130, v130notes);

        String v123 = "v1.2.3";
        List<String> v123notes = new LinkedList<>();
        v123notes.add("Add test resources path to Maven POM.");
        v123notes.add("If anything goes wrong during index parsing, tries to re-index the file instead of throwing exceptions.");
        v123notes.add("Support for ReferenceableParamGroups in mzML.");
        v123notes.add("Fix BOM for mzML/mzXML files.");
        v123notes.add("Change deps to Javolution-MSFTBX v6.11.7");
        v123notes.add("Use CharArray.contentEquals() in mzML parser");
        changelog.put(v123, v123notes);

        String v121 = "v1.2.1";
        List<String> v121notes = new LinkedList<>();
        v121notes.add("Mavenized, published to Maven Central");
        changelog.put(v121, v121notes);

        String v120 = "v1.2.0";
        List<String> v120notes = new LinkedList<>();
        v120notes.add("Added fragmentation energy and reaction time");
        changelog.put(v120, v120notes);
    }

    public static String getVersion() {
        return version;
    }

    public static Map<String, List<String>> getChangelog() {
        return changelogImmutable;
    }
}
