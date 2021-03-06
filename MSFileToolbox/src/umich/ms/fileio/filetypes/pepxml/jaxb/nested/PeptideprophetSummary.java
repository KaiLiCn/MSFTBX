
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

package umich.ms.fileio.filetypes.pepxml.jaxb.nested;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="inputfile" type="{http://regis-web.systemsbiology.net/pepXML}inputFileType" maxOccurs="unbounded"/>
 *         &lt;element name="roc_error_data" type="{http://regis-web.systemsbiology.net/pepXML}rocErrorDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distribution_point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="fvalue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_1_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_1_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_1_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_2_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_2_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_2_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_3_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_3_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_3_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_4_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_4_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_4_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_5_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_5_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_5_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_6_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_6_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_6_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="obs_7_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="model_7_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="model_7_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mixture_model" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="mixturemodel_distribution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="posmodel_distribution">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="negmodel_distribution">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mixturemodel" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="point" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="pos_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="neg_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="precursor_ion_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="comments" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="prior_probability" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="est_tot_correct" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="tot_num_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="num_iterations" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="author" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="options" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="est_tot_num_correct" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputfile",
    "rocErrorData",
    "distributionPoint",
    "mixtureModel"
})
@XmlRootElement(name = "peptideprophet_summary")
public class PeptideprophetSummary {

    @XmlElement(required = true)
    protected List<InputFileType> inputfile;
    @XmlElement(name = "roc_error_data")
    protected List<RocErrorDataType> rocErrorData;
    @XmlElement(name = "distribution_point")
    protected List<PeptideprophetSummary.DistributionPoint> distributionPoint;
    @XmlElement(name = "mixture_model")
    protected List<PeptideprophetSummary.MixtureModelling> mixtureModel;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "author", required = true)
    protected String author;
    @XmlAttribute(name = "min_prob", required = true)
    protected float minProb;
    @XmlAttribute(name = "options")
    protected String options;
    @XmlAttribute(name = "est_tot_num_correct")
    protected Float estTotNumCorrect;

    /**
     * Gets the value of the inputfile property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputfile property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputfile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputFileType }
     *
     *
     */
    public List<InputFileType> getInputfile() {
        if (inputfile == null) {
            inputfile = new ArrayList<InputFileType>(1);
        }
        return this.inputfile;
    }

    /**
     * Gets the value of the rocErrorData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rocErrorData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRocErrorData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RocErrorDataType }
     *
     *
     */
    public List<RocErrorDataType> getRocErrorData() {
        if (rocErrorData == null) {
            rocErrorData = new ArrayList<RocErrorDataType>(1);
        }
        return this.rocErrorData;
    }

    /**
     * Gets the value of the distributionPoint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionPoint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionPoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeptideprophetSummary.DistributionPoint }
     *
     *
     */
    public List<PeptideprophetSummary.DistributionPoint> getDistributionPoint() {
        if (distributionPoint == null) {
            distributionPoint = new ArrayList<PeptideprophetSummary.DistributionPoint>(1);
        }
        return this.distributionPoint;
    }

    /**
     * Gets the value of the mixtureModel property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mixtureModel property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMixtureModel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeptideprophetSummary.MixtureModelling }
     *
     *
     */
    public List<PeptideprophetSummary.MixtureModelling> getMixtureModel() {
        if (mixtureModel == null) {
            mixtureModel = new ArrayList<PeptideprophetSummary.MixtureModelling>(1);
        }
        return this.mixtureModel;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the author property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the minProb property.
     *
     */
    public float getMinProb() {
        return minProb;
    }

    /**
     * Sets the value of the minProb property.
     *
     */
    public void setMinProb(float value) {
        this.minProb = value;
    }

    /**
     * Gets the value of the options property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * Gets the value of the estTotNumCorrect property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getEstTotNumCorrect() {
        return estTotNumCorrect;
    }

    /**
     * Sets the value of the estTotNumCorrect property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setEstTotNumCorrect(Float value) {
        this.estTotNumCorrect = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="fvalue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_1_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_1_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_1_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_2_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_2_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_2_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_3_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_3_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_3_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_4_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_4_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_4_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_5_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_5_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_5_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_6_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_6_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_6_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="obs_7_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="model_7_pos_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="model_7_neg_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DistributionPoint {

        @XmlAttribute(name = "fvalue", required = true)
        protected float fvalue;
        @XmlAttribute(name = "obs_1_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs1Distr;
        @XmlAttribute(name = "model_1_pos_distr", required = true)
        protected float model1PosDistr;
        @XmlAttribute(name = "model_1_neg_distr", required = true)
        protected float model1NegDistr;
        @XmlAttribute(name = "obs_2_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs2Distr;
        @XmlAttribute(name = "model_2_pos_distr", required = true)
        protected float model2PosDistr;
        @XmlAttribute(name = "model_2_neg_distr", required = true)
        protected float model2NegDistr;
        @XmlAttribute(name = "obs_3_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs3Distr;
        @XmlAttribute(name = "model_3_pos_distr", required = true)
        protected float model3PosDistr;
        @XmlAttribute(name = "model_3_neg_distr", required = true)
        protected float model3NegDistr;
        @XmlAttribute(name = "obs_4_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs4Distr;
        @XmlAttribute(name = "model_4_pos_distr", required = true)
        protected float model4PosDistr;
        @XmlAttribute(name = "model_4_neg_distr", required = true)
        protected float model4NegDistr;
        @XmlAttribute(name = "obs_5_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs5Distr;
        @XmlAttribute(name = "model_5_pos_distr", required = true)
        protected float model5PosDistr;
        @XmlAttribute(name = "model_5_neg_distr", required = true)
        protected float model5NegDistr;
        @XmlAttribute(name = "obs_6_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs6Distr;
        @XmlAttribute(name = "model_6_pos_distr", required = true)
        protected float model6PosDistr;
        @XmlAttribute(name = "model_6_neg_distr", required = true)
        protected float model6NegDistr;
        @XmlAttribute(name = "obs_7_distr", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer obs7Distr;
        @XmlAttribute(name = "model_7_pos_distr", required = true)
        protected float model7PosDistr;
        @XmlAttribute(name = "model_7_neg_distr", required = true)
        protected float model7NegDistr;

        /**
         * Gets the value of the fvalue property.
         *
         */
        public float getFvalue() {
            return fvalue;
        }

        /**
         * Sets the value of the fvalue property.
         *
         */
        public void setFvalue(float value) {
            this.fvalue = value;
        }

        /**
         * Gets the value of the obs1Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs1Distr() {
            return obs1Distr;
        }

        /**
         * Sets the value of the obs1Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs1Distr(Integer value) {
            this.obs1Distr = value;
        }

        /**
         * Gets the value of the model1PosDistr property.
         *
         */
        public float getModel1PosDistr() {
            return model1PosDistr;
        }

        /**
         * Sets the value of the model1PosDistr property.
         *
         */
        public void setModel1PosDistr(float value) {
            this.model1PosDistr = value;
        }

        /**
         * Gets the value of the model1NegDistr property.
         *
         */
        public float getModel1NegDistr() {
            return model1NegDistr;
        }

        /**
         * Sets the value of the model1NegDistr property.
         *
         */
        public void setModel1NegDistr(float value) {
            this.model1NegDistr = value;
        }

        /**
         * Gets the value of the obs2Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs2Distr() {
            return obs2Distr;
        }

        /**
         * Sets the value of the obs2Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs2Distr(Integer value) {
            this.obs2Distr = value;
        }

        /**
         * Gets the value of the model2PosDistr property.
         *
         */
        public float getModel2PosDistr() {
            return model2PosDistr;
        }

        /**
         * Sets the value of the model2PosDistr property.
         *
         */
        public void setModel2PosDistr(float value) {
            this.model2PosDistr = value;
        }

        /**
         * Gets the value of the model2NegDistr property.
         *
         */
        public float getModel2NegDistr() {
            return model2NegDistr;
        }

        /**
         * Sets the value of the model2NegDistr property.
         *
         */
        public void setModel2NegDistr(float value) {
            this.model2NegDistr = value;
        }

        /**
         * Gets the value of the obs3Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs3Distr() {
            return obs3Distr;
        }

        /**
         * Sets the value of the obs3Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs3Distr(Integer value) {
            this.obs3Distr = value;
        }

        /**
         * Gets the value of the model3PosDistr property.
         *
         */
        public float getModel3PosDistr() {
            return model3PosDistr;
        }

        /**
         * Sets the value of the model3PosDistr property.
         *
         */
        public void setModel3PosDistr(float value) {
            this.model3PosDistr = value;
        }

        /**
         * Gets the value of the model3NegDistr property.
         *
         */
        public float getModel3NegDistr() {
            return model3NegDistr;
        }

        /**
         * Sets the value of the model3NegDistr property.
         *
         */
        public void setModel3NegDistr(float value) {
            this.model3NegDistr = value;
        }

        /**
         * Gets the value of the obs4Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs4Distr() {
            return obs4Distr;
        }

        /**
         * Sets the value of the obs4Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs4Distr(Integer value) {
            this.obs4Distr = value;
        }

        /**
         * Gets the value of the model4PosDistr property.
         *
         */
        public float getModel4PosDistr() {
            return model4PosDistr;
        }

        /**
         * Sets the value of the model4PosDistr property.
         *
         */
        public void setModel4PosDistr(float value) {
            this.model4PosDistr = value;
        }

        /**
         * Gets the value of the model4NegDistr property.
         *
         */
        public float getModel4NegDistr() {
            return model4NegDistr;
        }

        /**
         * Sets the value of the model4NegDistr property.
         *
         */
        public void setModel4NegDistr(float value) {
            this.model4NegDistr = value;
        }

        /**
         * Gets the value of the obs5Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs5Distr() {
            return obs5Distr;
        }

        /**
         * Sets the value of the obs5Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs5Distr(Integer value) {
            this.obs5Distr = value;
        }

        /**
         * Gets the value of the model5PosDistr property.
         *
         */
        public float getModel5PosDistr() {
            return model5PosDistr;
        }

        /**
         * Sets the value of the model5PosDistr property.
         *
         */
        public void setModel5PosDistr(float value) {
            this.model5PosDistr = value;
        }

        /**
         * Gets the value of the model5NegDistr property.
         *
         */
        public float getModel5NegDistr() {
            return model5NegDistr;
        }

        /**
         * Sets the value of the model5NegDistr property.
         *
         */
        public void setModel5NegDistr(float value) {
            this.model5NegDistr = value;
        }

        /**
         * Gets the value of the obs6Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs6Distr() {
            return obs6Distr;
        }

        /**
         * Sets the value of the obs6Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs6Distr(Integer value) {
            this.obs6Distr = value;
        }

        /**
         * Gets the value of the model6PosDistr property.
         *
         */
        public float getModel6PosDistr() {
            return model6PosDistr;
        }

        /**
         * Sets the value of the model6PosDistr property.
         *
         */
        public void setModel6PosDistr(float value) {
            this.model6PosDistr = value;
        }

        /**
         * Gets the value of the model6NegDistr property.
         *
         */
        public float getModel6NegDistr() {
            return model6NegDistr;
        }

        /**
         * Sets the value of the model6NegDistr property.
         *
         */
        public void setModel6NegDistr(float value) {
            this.model6NegDistr = value;
        }

        /**
         * Gets the value of the obs7Distr property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getObs7Distr() {
            return obs7Distr;
        }

        /**
         * Sets the value of the obs7Distr property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObs7Distr(Integer value) {
            this.obs7Distr = value;
        }

        /**
         * Gets the value of the model7PosDistr property.
         *
         */
        public float getModel7PosDistr() {
            return model7PosDistr;
        }

        /**
         * Sets the value of the model7PosDistr property.
         *
         */
        public void setModel7PosDistr(float value) {
            this.model7PosDistr = value;
        }

        /**
         * Gets the value of the model7NegDistr property.
         *
         */
        public float getModel7NegDistr() {
            return model7NegDistr;
        }

        /**
         * Sets the value of the model7NegDistr property.
         *
         */
        public void setModel7NegDistr(float value) {
            this.model7NegDistr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="mixturemodel_distribution" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="posmodel_distribution">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="negmodel_distribution">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mixturemodel" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="point" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="pos_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="neg_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="precursor_ion_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="comments" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="prior_probability" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="est_tot_correct" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="tot_num_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="num_iterations" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mixturemodelDistributionOrMixturemodel"
    })
    public static class MixtureModelling {

        @XmlElements({
            @XmlElement(name = "mixturemodel_distribution", type = PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.class),
            @XmlElement(name = "mixturemodel", type = PeptideprophetSummary.MixtureModelling.Mixturemodel.class)
        })
        protected List<Object> mixturemodelDistributionOrMixturemodel;
        @XmlAttribute(name = "precursor_ion_charge", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer precursorIonCharge;
        @XmlAttribute(name = "comments", required = true)
        protected String comments;
        @XmlAttribute(name = "prior_probability", required = true)
        protected float priorProbability;
        @XmlAttribute(name = "est_tot_correct", required = true)
        protected float estTotCorrect;
        @XmlAttribute(name = "tot_num_spectra", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer totNumSpectra;
        @XmlAttribute(name = "num_iterations", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer numIterations;

        /**
         * Gets the value of the mixturemodelDistributionOrMixturemodel property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mixturemodelDistributionOrMixturemodel property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMixturemodelDistributionOrMixturemodel().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PeptideprophetSummary.MixtureModelling.MixturemodelDistribution }
         * {@link PeptideprophetSummary.MixtureModelling.Mixturemodel }
         *
         *
         */
        public List<Object> getMixturemodelDistributionOrMixturemodel() {
            if (mixturemodelDistributionOrMixturemodel == null) {
                mixturemodelDistributionOrMixturemodel = new ArrayList<Object>(1);
            }
            return this.mixturemodelDistributionOrMixturemodel;
        }

        /**
         * Gets the value of the precursorIonCharge property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getPrecursorIonCharge() {
            return precursorIonCharge;
        }

        /**
         * Sets the value of the precursorIonCharge property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPrecursorIonCharge(Integer value) {
            this.precursorIonCharge = value;
        }

        /**
         * Gets the value of the comments property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setComments(String value) {
            this.comments = value;
        }

        /**
         * Gets the value of the priorProbability property.
         *
         */
        public float getPriorProbability() {
            return priorProbability;
        }

        /**
         * Sets the value of the priorProbability property.
         *
         */
        public void setPriorProbability(float value) {
            this.priorProbability = value;
        }

        /**
         * Gets the value of the estTotCorrect property.
         *
         */
        public float getEstTotCorrect() {
            return estTotCorrect;
        }

        /**
         * Sets the value of the estTotCorrect property.
         *
         */
        public void setEstTotCorrect(float value) {
            this.estTotCorrect = value;
        }

        /**
         * Gets the value of the totNumSpectra property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getTotNumSpectra() {
            return totNumSpectra;
        }

        /**
         * Sets the value of the totNumSpectra property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTotNumSpectra(Integer value) {
            this.totNumSpectra = value;
        }

        /**
         * Gets the value of the numIterations property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getNumIterations() {
            return numIterations;
        }

        /**
         * Sets the value of the numIterations property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumIterations(Integer value) {
            this.numIterations = value;
        }


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
         *         &lt;element name="point" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="pos_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="neg_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "point"
        })
        public static class Mixturemodel {

            @XmlElement(required = true)
            protected List<PeptideprophetSummary.MixtureModelling.Mixturemodel.Point> point;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "pos_bandwidth", required = true)
            protected float posBandwidth;
            @XmlAttribute(name = "neg_bandwidth", required = true)
            protected float negBandwidth;

            /**
             * Gets the value of the point property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the point property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPoint().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PeptideprophetSummary.MixtureModelling.Mixturemodel.Point }
             *
             *
             */
            public List<PeptideprophetSummary.MixtureModelling.Mixturemodel.Point> getPoint() {
                if (point == null) {
                    point = new ArrayList<PeptideprophetSummary.MixtureModelling.Mixturemodel.Point>(1);
                }
                return this.point;
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

            /**
             * Gets the value of the posBandwidth property.
             *
             */
            public float getPosBandwidth() {
                return posBandwidth;
            }

            /**
             * Sets the value of the posBandwidth property.
             *
             */
            public void setPosBandwidth(float value) {
                this.posBandwidth = value;
            }

            /**
             * Gets the value of the negBandwidth property.
             *
             */
            public float getNegBandwidth() {
                return negBandwidth;
            }

            /**
             * Sets the value of the negBandwidth property.
             *
             */
            public void setNegBandwidth(float value) {
                this.negBandwidth = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Point {

                @XmlAttribute(name = "value")
                protected Float value;
                @XmlAttribute(name = "pos_dens")
                protected Float posDens;
                @XmlAttribute(name = "neg_dens")
                protected Float negDens;

                /**
                 * Gets the value of the value property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *
                 */
                public Float getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *
                 */
                public void setValue(Float value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the posDens property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *
                 */
                public Float getPosDens() {
                    return posDens;
                }

                /**
                 * Sets the value of the posDens property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *
                 */
                public void setPosDens(Float value) {
                    this.posDens = value;
                }

                /**
                 * Gets the value of the negDens property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *
                 */
                public Float getNegDens() {
                    return negDens;
                }

                /**
                 * Sets the value of the negDens property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *
                 */
                public void setNegDens(Float value) {
                    this.negDens = value;
                }

            }

        }


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
        public static class MixturemodelDistribution {

            @XmlElement(name = "posmodel_distribution", required = true)
            protected PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.PosmodelDistribution posmodelDistribution;
            @XmlElement(name = "negmodel_distribution", required = true)
            protected PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.NegmodelDistribution negmodelDistribution;
            @XmlAttribute(name = "name", required = true)
            protected String name;

            /**
             * Gets the value of the posmodelDistribution property.
             *
             * @return
             *     possible object is
             *     {@link PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.PosmodelDistribution }
             *
             */
            public PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.PosmodelDistribution getPosmodelDistribution() {
                return posmodelDistribution;
            }

            /**
             * Sets the value of the posmodelDistribution property.
             *
             * @param value
             *     allowed object is
             *     {@link PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.PosmodelDistribution }
             *
             */
            public void setPosmodelDistribution(PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.PosmodelDistribution value) {
                this.posmodelDistribution = value;
            }

            /**
             * Gets the value of the negmodelDistribution property.
             *
             * @return
             *     possible object is
             *     {@link PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.NegmodelDistribution }
             *
             */
            public PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.NegmodelDistribution getNegmodelDistribution() {
                return negmodelDistribution;
            }

            /**
             * Sets the value of the negmodelDistribution property.
             *
             * @param value
             *     allowed object is
             *     {@link PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.NegmodelDistribution }
             *
             */
            public void setNegmodelDistribution(PeptideprophetSummary.MixtureModelling.MixturemodelDistribution.NegmodelDistribution value) {
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
             *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *       &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "parameter"
            })
            public static class NegmodelDistribution {

                @XmlElement(required = true)
                protected List<NameValueType> parameter;
                @XmlAttribute(name = "type")
                protected ModelDisType type;

                /**
                 * Gets the value of the parameter property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the parameter property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParameter().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NameValueType }
                 *
                 *
                 */
                public List<NameValueType> getParameter() {
                    if (parameter == null) {
                        parameter = new ArrayList<NameValueType>(1);
                    }
                    return this.parameter;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ModelDisType }
                 *
                 */
                public ModelDisType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ModelDisType }
                 *
                 */
                public void setType(ModelDisType value) {
                    this.type = value;
                }

            }


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
             *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *       &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "parameter"
            })
            public static class PosmodelDistribution {

                @XmlElement(required = true)
                protected List<NameValueType> parameter;
                @XmlAttribute(name = "type")
                protected ModelDisType type;

                /**
                 * Gets the value of the parameter property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the parameter property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParameter().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NameValueType }
                 *
                 *
                 */
                public List<NameValueType> getParameter() {
                    if (parameter == null) {
                        parameter = new ArrayList<NameValueType>(1);
                    }
                    return this.parameter;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ModelDisType }
                 *
                 */
                public ModelDisType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ModelDisType }
                 *
                 */
                public void setType(ModelDisType value) {
                    this.type = value;
                }

            }

        }

    }

}
