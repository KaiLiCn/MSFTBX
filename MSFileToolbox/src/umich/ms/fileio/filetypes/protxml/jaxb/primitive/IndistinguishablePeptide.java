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
package umich.ms.fileio.filetypes.protxml.jaxb.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modification_info" type="{http://regis-web.systemsbiology.net/protXML}modification_info" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="peptide_sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="charge" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="calc_neutral_pep_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modificationInfo"
})
public class IndistinguishablePeptide {

    @XmlElement(name = "modification_info")
    protected List<ModificationInfo> modificationInfo;
    @XmlAttribute(name = "peptide_sequence", required = true)
    protected String peptideSequence;
    @XmlAttribute(name = "charge", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer charge;
    @XmlAttribute(name = "calc_neutral_pep_mass")
    protected double calcNeutralPepMass;

    /**
     * Gets the value of the modificationInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modificationInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModificationInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationInfo }
     *
     *
     */
    public List<ModificationInfo> getModificationInfo() {
        if (modificationInfo == null) {
            modificationInfo = new ArrayList<ModificationInfo>(1);
        }
        return this.modificationInfo;
    }

    /**
     * Gets the value of the peptideSequence property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPeptideSequence() {
        return peptideSequence;
    }

    /**
     * Sets the value of the peptideSequence property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPeptideSequence(String value) {
        this.peptideSequence = value;
    }

    /**
     * Gets the value of the charge property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Integer getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCharge(Integer value) {
        this.charge = value;
    }

    /**
     * Gets the value of the calcNeutralPepMass property.
     *
     */
    public double getCalcNeutralPepMass() {
        return calcNeutralPepMass;
    }

    /**
     * Sets the value of the calcNeutralPepMass property.
     *
     */
    public void setCalcNeutralPepMass(double value) {
        this.calcNeutralPepMass = value;
    }

}
