/* 
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.fileio.filetypes.xmlbased;

/**
 * Simple holder for a byte offset in file and length of an entry.
 * Used when string index to do effective reads.
 * @author Dmitry Avtonomov
 */
public class OffsetLength {
    /** Offset in bytes in a file (for use with RandomAccessFiles) */
    public final long offset;
    /** The length of data entry in bytes */
    public final int length;

    public OffsetLength(long offset, int length) {
        this.offset = offset;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[offset: " + offset + ", len: " + length + "]";
    }
}
