
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="posmodel_distribution">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="negmodel_distribution">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "posmodelDistribution",
    "negmodelDistribution"
})
public class MixturemodelDistribution {

    @XmlElement(name = "posmodel_distribution", required = true)
    protected PosmodelDistribution posmodelDistribution;
    @XmlElement(name = "negmodel_distribution", required = true)
    protected NegmodelDistribution negmodelDistribution;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the posmodelDistribution property.
     *
     * @return
     *     possible object is
     *     {@link PosmodelDistribution }
     *
     */
    public PosmodelDistribution getPosmodelDistribution() {
        return posmodelDistribution;
    }

    /**
     * Sets the value of the posmodelDistribution property.
     *
     * @param value
     *     allowed object is
     *     {@link PosmodelDistribution }
     *
     */
    public void setPosmodelDistribution(PosmodelDistribution value) {
        this.posmodelDistribution = value;
    }

    /**
     * Gets the value of the negmodelDistribution property.
     *
     * @return
     *     possible object is
     *     {@link NegmodelDistribution }
     *
     */
    public NegmodelDistribution getNegmodelDistribution() {
        return negmodelDistribution;
    }

    /**
     * Sets the value of the negmodelDistribution property.
     *
     * @param value
     *     allowed object is
     *     {@link NegmodelDistribution }
     *
     */
    public void setNegmodelDistribution(NegmodelDistribution value) {
        this.negmodelDistribution = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}
