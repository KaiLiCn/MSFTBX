//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.11 at 10:25:05 PM EDT 
//


package umich.ms.fileio.filetypes.protxml.jaxb.primitive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="adj_ratio_mean" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="adj_ratio_standard_dev" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="heavy2light_adj_ratio_mean" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="heavy2light_adj_ratio_standard_dev" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="pvalue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="decimal_pvalue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ASAPRatio_pvalue")
public class ASAPRatioPvalue {

    @XmlAttribute(name = "adj_ratio_mean", required = true)
    protected double adjRatioMean;
    @XmlAttribute(name = "adj_ratio_standard_dev", required = true)
    protected double adjRatioStandardDev;
    @XmlAttribute(name = "heavy2light_adj_ratio_mean")
    protected double heavy2LightAdjRatioMean;
    @XmlAttribute(name = "heavy2light_adj_ratio_standard_dev")
    protected double heavy2LightAdjRatioStandardDev;
    @XmlAttribute(name = "pvalue")
    protected double pvalue;
    @XmlAttribute(name = "decimal_pvalue")
    protected double decimalPvalue;

    /**
     * Gets the value of the adjRatioMean property.
     * 
     */
    public double getAdjRatioMean() {
        return adjRatioMean;
    }

    /**
     * Sets the value of the adjRatioMean property.
     * 
     */
    public void setAdjRatioMean(double value) {
        this.adjRatioMean = value;
    }

    /**
     * Gets the value of the adjRatioStandardDev property.
     * 
     */
    public double getAdjRatioStandardDev() {
        return adjRatioStandardDev;
    }

    /**
     * Sets the value of the adjRatioStandardDev property.
     * 
     */
    public void setAdjRatioStandardDev(double value) {
        this.adjRatioStandardDev = value;
    }

    /**
     * Gets the value of the heavy2LightAdjRatioMean property.
     * 
     */
    public double getHeavy2LightAdjRatioMean() {
        return heavy2LightAdjRatioMean;
    }

    /**
     * Sets the value of the heavy2LightAdjRatioMean property.
     * 
     */
    public void setHeavy2LightAdjRatioMean(double value) {
        this.heavy2LightAdjRatioMean = value;
    }

    /**
     * Gets the value of the heavy2LightAdjRatioStandardDev property.
     * 
     */
    public double getHeavy2LightAdjRatioStandardDev() {
        return heavy2LightAdjRatioStandardDev;
    }

    /**
     * Sets the value of the heavy2LightAdjRatioStandardDev property.
     * 
     */
    public void setHeavy2LightAdjRatioStandardDev(double value) {
        this.heavy2LightAdjRatioStandardDev = value;
    }

    /**
     * Gets the value of the pvalue property.
     * 
     */
    public double getPvalue() {
        return pvalue;
    }

    /**
     * Sets the value of the pvalue property.
     * 
     */
    public void setPvalue(double value) {
        this.pvalue = value;
    }

    /**
     * Gets the value of the decimalPvalue property.
     * 
     */
    public double getDecimalPvalue() {
        return decimalPvalue;
    }

    /**
     * Sets the value of the decimalPvalue property.
     * 
     */
    public void setDecimalPvalue(double value) {
        this.decimalPvalue = value;
    }

}