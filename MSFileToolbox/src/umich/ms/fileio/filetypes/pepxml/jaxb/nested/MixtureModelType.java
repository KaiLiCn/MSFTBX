
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mixtureModelType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="mixtureModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="pos_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
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
@XmlType(name = "mixtureModelType", propOrder = {
    "point"
})
public class MixtureModelType {

    protected List<MixtureModelType.MixtureModelPoint> point;
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
     * {@link MixtureModelType.MixtureModelPoint }
     *
     *
     */
    public List<MixtureModelType.MixtureModelPoint> getPoint() {
        if (point == null) {
            point = new ArrayList<MixtureModelType.MixtureModelPoint>(1);
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
     *       &lt;attribute name="neg_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="pos_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MixtureModelPoint {

        @XmlAttribute(name = "value")
        protected Float value;
        @XmlAttribute(name = "pos_dens")
        protected Float posDens;
        @XmlAttribute(name = "neg_dens")
        protected Float negDens;
        @XmlAttribute(name = "neg_obs_dens")
        protected Float negObsDens;
        @XmlAttribute(name = "pos_obs_dens")
        protected Float posObsDens;

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

        /**
         * Gets the value of the negObsDens property.
         *
         * @return
         *     possible object is
         *     {@link Float }
         *
         */
        public Float getNegObsDens() {
            return negObsDens;
        }

        /**
         * Sets the value of the negObsDens property.
         *
         * @param value
         *     allowed object is
         *     {@link Float }
         *
         */
        public void setNegObsDens(Float value) {
            this.negObsDens = value;
        }

        /**
         * Gets the value of the posObsDens property.
         *
         * @return
         *     possible object is
         *     {@link Float }
         *
         */
        public Float getPosObsDens() {
            return posObsDens;
        }

        /**
         * Sets the value of the posObsDens property.
         *
         * @param value
         *     allowed object is
         *     {@link Float }
         *
         */
        public void setPosObsDens(Float value) {
            this.posObsDens = value;
        }

    }

}
