
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

package umich.ms.fileio.filetypes.pepxml.jaxb.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for engineType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="engineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEQUEST"/>
 *     &lt;enumeration value="MASCOT"/>
 *     &lt;enumeration value="Comet"/>
 *     &lt;enumeration value="SpectraST"/>
 *     &lt;enumeration value="PROBID"/>
 *     &lt;enumeration value="OMSSA"/>
 *     &lt;enumeration value="YABSE"/>
 *     &lt;enumeration value="MS-GFDB"/>
 *     &lt;enumeration value="MS-GF+"/>
 *     &lt;enumeration value="MyriMatch"/>
 *     &lt;enumeration value="X! Tandem (k-score)"/>
 *     &lt;enumeration value="X! Tandem"/>
 *     &lt;enumeration value="InsPecT"/>
 *     &lt;enumeration value="ProteinPilot"/>
 *     &lt;enumeration value="ProteinLynx"/>
 *     &lt;enumeration value="Spectrum Mill"/>
 *     &lt;enumeration value="greylag"/>
 *     &lt;enumeration value="Phenyx"/>
 *     &lt;enumeration value="Proteios"/>
 *     &lt;enumeration value="Crux"/>
 *     &lt;enumeration value="Tide"/>
 *     &lt;enumeration value="Kojak"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "engineType")
@XmlEnum
public enum EngineType {

    SEQUEST("SEQUEST"),
    MASCOT("MASCOT"),
    @XmlEnumValue("Comet")
    COMET("Comet"),
    @XmlEnumValue("SpectraST")
    SPECTRA_ST("SpectraST"),
    PROBID("PROBID"),
    OMSSA("OMSSA"),
    YABSE("YABSE"),
    @XmlEnumValue("MS-GFDB")
    MS_GFDB("MS-GFDB"),
    @XmlEnumValue("MS-GF+")
    MS_GF("MS-GF+"),
    @XmlEnumValue("MyriMatch")
    MYRI_MATCH("MyriMatch"),
    @XmlEnumValue("X! Tandem (k-score)")
    X_TANDEM_K_SCORE("X! Tandem (k-score)"),
    @XmlEnumValue("X! Tandem")
    X_TANDEM("X! Tandem"),
    @XmlEnumValue("InsPecT")
    INS_PEC_T("InsPecT"),
    @XmlEnumValue("ProteinPilot")
    PROTEIN_PILOT("ProteinPilot"),
    @XmlEnumValue("ProteinLynx")
    PROTEIN_LYNX("ProteinLynx"),
    @XmlEnumValue("Spectrum Mill")
    SPECTRUM_MILL("Spectrum Mill"),
    @XmlEnumValue("greylag")
    GREYLAG("greylag"),
    @XmlEnumValue("Phenyx")
    PHENYX("Phenyx"),
    @XmlEnumValue("Proteios")
    PROTEIOS("Proteios"),
    @XmlEnumValue("Crux")
    CRUX("Crux"),
    @XmlEnumValue("Tide")
    TIDE("Tide"),
    @XmlEnumValue("Kojak")
    KOJAK("Kojak");
    private final String value;

    EngineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineType fromValue(String v) {
        for (EngineType c: EngineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
