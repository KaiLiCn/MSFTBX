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
package umich.ms.fileio.filetypes.mzidentml.jaxb.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The protein list resulting from a protein detection process.
 *
 * <p>Java class for ProteinDetectionListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProteinDetectionListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.2}IdentifiableType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProteinAmbiguityGroup" type="{http://psidev.info/psi/pi/mzIdentML/1.2}ProteinAmbiguityGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://psidev.info/psi/pi/mzIdentML/1.2}ParamGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProteinDetectionListType", propOrder = {
    "proteinAmbiguityGroup",
    "paramGroup"
})
public class ProteinDetectionListType
    extends IdentifiableType
{

    @XmlElement(name = "ProteinAmbiguityGroup")
    protected List<ProteinAmbiguityGroupType> proteinAmbiguityGroup;
    @XmlElements({
        @XmlElement(name = "cvParam", type = CVParamType.class),
        @XmlElement(name = "userParam", type = UserParamType.class)
    })
    protected List<AbstractParamType> paramGroup;

    /**
     * Gets the value of the proteinAmbiguityGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proteinAmbiguityGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProteinAmbiguityGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinAmbiguityGroupType }
     *
     *
     */
    public List<ProteinAmbiguityGroupType> getProteinAmbiguityGroup() {
        if (proteinAmbiguityGroup == null) {
            proteinAmbiguityGroup = new ArrayList<ProteinAmbiguityGroupType>(1);
        }
        return this.proteinAmbiguityGroup;
    }

    /**
     * Scores or output parameters associated with the whole ProteinDetectionList Gets the value of the paramGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVParamType }
     * {@link UserParamType }
     *
     *
     */
    public List<AbstractParamType> getParamGroup() {
        if (paramGroup == null) {
            paramGroup = new ArrayList<AbstractParamType>(1);
        }
        return this.paramGroup;
    }

}
