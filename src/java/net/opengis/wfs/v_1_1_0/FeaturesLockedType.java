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
import net.opengis.filter.v_1_1_0.FeatureIdType;
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
 * <p>Java-Klasse für FeaturesLockedType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeaturesLockedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://www.opengis.net/ogc}FeatureId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesLockedType", propOrder = {
    "featureId"
})
public class FeaturesLockedType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "FeatureId", namespace = "http://www.opengis.net/ogc", required = true)
    protected List<FeatureIdType> featureId;

    /**
     * Gets the value of the featureId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureIdType }
     * 
     * 
     */
    public List<FeatureIdType> getFeatureId() {
        if (featureId == null) {
            featureId = new ArrayList<FeatureIdType>();
        }
        return this.featureId;
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
            List<FeatureIdType> theFeatureId;
            theFeatureId = this.getFeatureId();
            strategy.appendField(locator, this, "featureId", buffer, theFeatureId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeaturesLockedType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeaturesLockedType that = ((FeaturesLockedType) object);
        {
            List<FeatureIdType> lhsFeatureId;
            lhsFeatureId = this.getFeatureId();
            List<FeatureIdType> rhsFeatureId;
            rhsFeatureId = that.getFeatureId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureId", lhsFeatureId), LocatorUtils.property(thatLocator, "featureId", rhsFeatureId), lhsFeatureId, rhsFeatureId)) {
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
            List<FeatureIdType> theFeatureId;
            theFeatureId = this.getFeatureId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureId", theFeatureId), currentHashCode, theFeatureId);
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
        if (draftCopy instanceof FeaturesLockedType) {
            final FeaturesLockedType copy = ((FeaturesLockedType) draftCopy);
            if ((this.featureId!= null)&&(!this.featureId.isEmpty())) {
                List<FeatureIdType> sourceFeatureId;
                sourceFeatureId = this.getFeatureId();
                @SuppressWarnings("unchecked")
                List<FeatureIdType> copyFeatureId = ((List<FeatureIdType> ) strategy.copy(LocatorUtils.property(locator, "featureId", sourceFeatureId), sourceFeatureId));
                copy.featureId = null;
                List<FeatureIdType> uniqueFeatureIdl = copy.getFeatureId();
                uniqueFeatureIdl.addAll(copyFeatureId);
            } else {
                copy.featureId = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeaturesLockedType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof FeaturesLockedType) {
            final FeaturesLockedType target = this;
            final FeaturesLockedType leftObject = ((FeaturesLockedType) left);
            final FeaturesLockedType rightObject = ((FeaturesLockedType) right);
            {
                List<FeatureIdType> lhsFeatureId;
                lhsFeatureId = leftObject.getFeatureId();
                List<FeatureIdType> rhsFeatureId;
                rhsFeatureId = rightObject.getFeatureId();
                target.featureId = null;
                List<FeatureIdType> uniqueFeatureIdl = target.getFeatureId();
                uniqueFeatureIdl.addAll(((List<FeatureIdType> ) strategy.merge(LocatorUtils.property(leftLocator, "featureId", lhsFeatureId), LocatorUtils.property(rightLocator, "featureId", rhsFeatureId), lhsFeatureId, rhsFeatureId)));
            }
        }
    }

    public void setFeatureId(List<FeatureIdType> value) {
        List<FeatureIdType> draftl = this.getFeatureId();
        draftl.addAll(value);
    }

}
