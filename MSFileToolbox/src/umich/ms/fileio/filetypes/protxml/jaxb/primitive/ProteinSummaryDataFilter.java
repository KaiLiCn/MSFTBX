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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="min_probability" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sensitivity" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="false_positive_error_rate" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="predicted_num_correct" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="predicted_num_incorrect" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ProteinSummaryDataFilter {

    @XmlAttribute(name = "min_probability", required = true)
    protected double minProbability;
    @XmlAttribute(name = "sensitivity", required = true)
    protected double sensitivity;
    @XmlAttribute(name = "false_positive_error_rate", required = true)
    protected double falsePositiveErrorRate;
    @XmlAttribute(name = "predicted_num_correct")
    protected double predictedNumCorrect;
    @XmlAttribute(name = "predicted_num_incorrect")
    protected double predictedNumIncorrect;

    /**
     * Gets the value of the minProbability property.
     * 
     */
    public double getMinProbability() {
        return minProbability;
    }

    /**
     * Sets the value of the minProbability property.
     * 
     */
    public void setMinProbability(double value) {
        this.minProbability = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     */
    public double getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     */
    public void setSensitivity(double value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the falsePositiveErrorRate property.
     * 
     */
    public double getFalsePositiveErrorRate() {
        return falsePositiveErrorRate;
    }

    /**
     * Sets the value of the falsePositiveErrorRate property.
     * 
     */
    public void setFalsePositiveErrorRate(double value) {
        this.falsePositiveErrorRate = value;
    }

    /**
     * Gets the value of the predictedNumCorrect property.
     * 
     */
    public double getPredictedNumCorrect() {
        return predictedNumCorrect;
    }

    /**
     * Sets the value of the predictedNumCorrect property.
     * 
     */
    public void setPredictedNumCorrect(double value) {
        this.predictedNumCorrect = value;
    }

    /**
     * Gets the value of the predictedNumIncorrect property.
     * 
     */
    public double getPredictedNumIncorrect() {
        return predictedNumIncorrect;
    }

    /**
     * Sets the value of the predictedNumIncorrect property.
     * 
     */
    public void setPredictedNumIncorrect(double value) {
        this.predictedNumIncorrect = value;
    }

}
