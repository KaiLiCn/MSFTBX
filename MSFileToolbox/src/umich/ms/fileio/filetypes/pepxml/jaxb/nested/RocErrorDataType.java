
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Tag for encapsulating roc curves for pepXML
 *
 * <p>Java class for rocErrorDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="rocErrorDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roc_data_point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="sensitivity" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="error" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="num_corr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="num_incorr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="error_point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="error" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="num_corr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="num_incorr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="charge" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="charge_est_correct" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rocErrorDataType", propOrder = {
    "rocDataPoint",
    "errorPoint"
})
public class RocErrorDataType {

    @XmlElement(name = "roc_data_point")
    protected List<RocErrorDataType.RocDataPoint> rocDataPoint;
    @XmlElement(name = "error_point")
    protected List<RocErrorDataType.ErrorPoint> errorPoint;
    @XmlAttribute(name = "charge", required = true)
    protected String charge;
    @XmlAttribute(name = "charge_est_correct")
    protected Float chargeEstCorrect;

    /**
     * Gets the value of the rocDataPoint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rocDataPoint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRocDataPoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RocErrorDataType.RocDataPoint }
     *
     *
     */
    public List<RocErrorDataType.RocDataPoint> getRocDataPoint() {
        if (rocDataPoint == null) {
            rocDataPoint = new ArrayList<RocErrorDataType.RocDataPoint>(1);
        }
        return this.rocDataPoint;
    }

    /**
     * Gets the value of the errorPoint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorPoint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorPoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RocErrorDataType.ErrorPoint }
     *
     *
     */
    public List<RocErrorDataType.ErrorPoint> getErrorPoint() {
        if (errorPoint == null) {
            errorPoint = new ArrayList<RocErrorDataType.ErrorPoint>(1);
        }
        return this.errorPoint;
    }

    /**
     * Gets the value of the charge property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCharge() {
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
    public void setCharge(String value) {
        this.charge = value;
    }

    /**
     * Gets the value of the chargeEstCorrect property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getChargeEstCorrect() {
        return chargeEstCorrect;
    }

    /**
     * Sets the value of the chargeEstCorrect property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setChargeEstCorrect(Float value) {
        this.chargeEstCorrect = value;
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
     *       &lt;attribute name="error" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="num_corr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="num_incorr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ErrorPoint {

        @XmlAttribute(name = "error", required = true)
        protected float error;
        @XmlAttribute(name = "min_prob", required = true)
        protected float minProb;
        @XmlAttribute(name = "num_corr", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long numCorr;
        @XmlAttribute(name = "num_incorr", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long numIncorr;

        /**
         * Gets the value of the error property.
         *
         */
        public float getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         *
         */
        public void setError(float value) {
            this.error = value;
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
         * Gets the value of the numCorr property.
         *
         */
        public long getNumCorr() {
            return numCorr;
        }

        /**
         * Sets the value of the numCorr property.
         *
         */
        public void setNumCorr(long value) {
            this.numCorr = value;
        }

        /**
         * Gets the value of the numIncorr property.
         *
         */
        public long getNumIncorr() {
            return numIncorr;
        }

        /**
         * Sets the value of the numIncorr property.
         *
         */
        public void setNumIncorr(long value) {
            this.numIncorr = value;
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
     *       &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="sensitivity" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="error" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="num_corr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *       &lt;attribute name="num_incorr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RocDataPoint {

        @XmlAttribute(name = "min_prob", required = true)
        protected float minProb;
        @XmlAttribute(name = "sensitivity", required = true)
        protected float sensitivity;
        @XmlAttribute(name = "error", required = true)
        protected float error;
        @XmlAttribute(name = "num_corr", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long numCorr;
        @XmlAttribute(name = "num_incorr", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long numIncorr;

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
         * Gets the value of the sensitivity property.
         *
         */
        public float getSensitivity() {
            return sensitivity;
        }

        /**
         * Sets the value of the sensitivity property.
         *
         */
        public void setSensitivity(float value) {
            this.sensitivity = value;
        }

        /**
         * Gets the value of the error property.
         *
         */
        public float getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         *
         */
        public void setError(float value) {
            this.error = value;
        }

        /**
         * Gets the value of the numCorr property.
         *
         */
        public long getNumCorr() {
            return numCorr;
        }

        /**
         * Sets the value of the numCorr property.
         *
         */
        public void setNumCorr(long value) {
            this.numCorr = value;
        }

        /**
         * Gets the value of the numIncorr property.
         *
         */
        public long getNumIncorr() {
            return numIncorr;
        }

        /**
         * Sets the value of the numIncorr property.
         *
         */
        public void setNumIncorr(long value) {
            this.numIncorr = value;
        }

    }

}
