//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 *             Reports the list of identifiers of all features created 
 *             by a transaction request.  New features are created using
 *             the Insert action and the list of idetifiers must be 
 *             presented in the same order as the Insert actions were
 *             encountered in the transaction request.  Features may
 *             optionally be correlated with identifiers using the 
 *             handle attribute (if it was specified on the Insert 
 *             element).
 *          
 * 
 * <p>Java-Klasse für InsertResultsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InsertResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" type="{http://www.opengis.net/wfs}InsertedFeatureType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertResultsType", propOrder = {
    "feature"
})
public class InsertResultsType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Feature", required = true)
    protected List<InsertedFeatureType> feature;

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertedFeatureType }
     * 
     * 
     */
    public List<InsertedFeatureType> getFeature() {
        if (feature == null) {
            feature = new ArrayList<InsertedFeatureType>();
        }
        return this.feature;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<InsertedFeatureType> theFeature;
            theFeature = this.getFeature();
            strategy.appendField(locator, this, "feature", buffer, theFeature);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InsertResultsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InsertResultsType that = ((InsertResultsType) object);
        {
            List<InsertedFeatureType> lhsFeature;
            lhsFeature = this.getFeature();
            List<InsertedFeatureType> rhsFeature;
            rhsFeature = that.getFeature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feature", lhsFeature), LocatorUtils.property(thatLocator, "feature", rhsFeature), lhsFeature, rhsFeature)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<InsertedFeatureType> theFeature;
            theFeature = this.getFeature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feature", theFeature), currentHashCode, theFeature);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof InsertResultsType) {
            final InsertResultsType copy = ((InsertResultsType) draftCopy);
            if ((this.feature!= null)&&(!this.feature.isEmpty())) {
                List<InsertedFeatureType> sourceFeature;
                sourceFeature = this.getFeature();
                @SuppressWarnings("unchecked")
                List<InsertedFeatureType> copyFeature = ((List<InsertedFeatureType> ) strategy.copy(LocatorUtils.property(locator, "feature", sourceFeature), sourceFeature));
                copy.feature = null;
                List<InsertedFeatureType> uniqueFeaturel = copy.getFeature();
                uniqueFeaturel.addAll(copyFeature);
            } else {
                copy.feature = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InsertResultsType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof InsertResultsType) {
            final InsertResultsType target = this;
            final InsertResultsType leftObject = ((InsertResultsType) left);
            final InsertResultsType rightObject = ((InsertResultsType) right);
            {
                List<InsertedFeatureType> lhsFeature;
                lhsFeature = leftObject.getFeature();
                List<InsertedFeatureType> rhsFeature;
                rhsFeature = rightObject.getFeature();
                target.feature = null;
                List<InsertedFeatureType> uniqueFeaturel = target.getFeature();
                uniqueFeaturel.addAll(((List<InsertedFeatureType> ) strategy.merge(LocatorUtils.property(leftLocator, "feature", lhsFeature), LocatorUtils.property(rightLocator, "feature", rhsFeature), lhsFeature, rhsFeature)));
            }
        }
    }

    public void setFeature(List<InsertedFeatureType> value) {
        List<InsertedFeatureType> draftl = this.getFeature();
        draftl.addAll(value);
    }

}
