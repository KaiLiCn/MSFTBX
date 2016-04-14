
package umich.ms.fileio.filetypes.mzidentml.jaxb.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the types of measures that will be reported in generic arrays for each SpectrumIdentificationItem e.g. product ion m/z, product ion intensity, product ion m/z error
 *
 * <p>Java class for FragmentationTableType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FragmentationTableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measure" type="{http://psidev.info/psi/pi/mzIdentML/1.2}MeasureType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FragmentationTableType", propOrder = {
    "measure"
})
public class FragmentationTableType {

    @XmlElement(name = "Measure", required = true)
    protected List<MeasureType> measure;

    /**
     * Gets the value of the measure property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measure property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasure().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     *
     *
     */
    public List<MeasureType> getMeasure() {
        if (measure == null) {
            measure = new ArrayList<MeasureType>(1);
        }
        return this.measure;
    }

}
