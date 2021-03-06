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
package umich.ms.fileio.filetypes.mzml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The method of precursor ion selection and activation
 * 
 * <p>Java class for PrecursorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecursorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isolationWindow" type="{http://psi.hupo.org/ms/mzml}ParamGroupType" minOccurs="0"/>
 *         &lt;element name="selectedIonList" type="{http://psi.hupo.org/ms/mzml}SelectedIonListType" minOccurs="0"/>
 *         &lt;element name="activation" type="{http://psi.hupo.org/ms/mzml}ParamGroupType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="spectrumRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceFileRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="externalSpectrumID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecursorType", propOrder = {
    "isolationWindow",
    "selectedIonList",
    "activation"
})
public class PrecursorType {

    protected ParamGroupType isolationWindow;
    protected SelectedIonListType selectedIonList;
    @XmlElement(required = true)
    protected ParamGroupType activation;
    @XmlAttribute(name = "spectrumRef")
    protected String spectrumRef;
    @XmlAttribute(name = "sourceFileRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sourceFileRef;
    @XmlAttribute(name = "externalSpectrumID")
    protected String externalSpectrumID;

    /**
     * Gets the value of the isolationWindow property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGroupType }
     *     
     */
    public ParamGroupType getIsolationWindow() {
        return isolationWindow;
    }

    /**
     * Sets the value of the isolationWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGroupType }
     *     
     */
    public void setIsolationWindow(ParamGroupType value) {
        this.isolationWindow = value;
    }

    /**
     * Gets the value of the selectedIonList property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedIonListType }
     *     
     */
    public SelectedIonListType getSelectedIonList() {
        return selectedIonList;
    }

    /**
     * Sets the value of the selectedIonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedIonListType }
     *     
     */
    public void setSelectedIonList(SelectedIonListType value) {
        this.selectedIonList = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGroupType }
     *     
     */
    public ParamGroupType getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGroupType }
     *     
     */
    public void setActivation(ParamGroupType value) {
        this.activation = value;
    }

    /**
     * Gets the value of the spectrumRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpectrumRef() {
        return spectrumRef;
    }

    /**
     * Sets the value of the spectrumRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpectrumRef(String value) {
        this.spectrumRef = value;
    }

    /**
     * Gets the value of the sourceFileRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceFileRef() {
        return sourceFileRef;
    }

    /**
     * Sets the value of the sourceFileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceFileRef(Object value) {
        this.sourceFileRef = value;
    }

    /**
     * Gets the value of the externalSpectrumID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSpectrumID() {
        return externalSpectrumID;
    }

    /**
     * Sets the value of the externalSpectrumID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSpectrumID(String value) {
        this.externalSpectrumID = value;
    }

}
