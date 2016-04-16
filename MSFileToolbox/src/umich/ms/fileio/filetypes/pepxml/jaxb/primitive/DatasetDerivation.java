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
package umich.ms.fileio.filetypes.pepxml.jaxb.primitive;

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
 *         &lt;element name="data_filter" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="parent_file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="windows_parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="generation_no" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataFilter"
})
public class DatasetDerivation {

    @XmlElement(name = "data_filter")
    protected List<DataFilter> dataFilter;
    @XmlAttribute(name = "generation_no", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer generationNo;

    /**
     * Gets the value of the dataFilter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFilter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFilter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFilter }
     *
     *
     */
    public List<DataFilter> getDataFilter() {
        if (dataFilter == null) {
            dataFilter = new ArrayList<DataFilter>(1);
        }
        return this.dataFilter;
    }

    /**
     * Gets the value of the generationNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Integer getGenerationNo() {
        return generationNo;
    }

    /**
     * Sets the value of the generationNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGenerationNo(Integer value) {
        this.generationNo = value;
    }

}
