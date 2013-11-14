//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * Container for features - follow gml:ArrayAssociationType pattern.
 * 
 * <p>Java-Klasse für FeatureArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Feature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureArrayPropertyType", propOrder = {
    "feature"
})
public class FeatureArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_Feature", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractFeatureType>> feature;

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
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractDiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridCoverageType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFeatureType>> getFeature() {
        if (feature == null) {
            feature = new ArrayList<JAXBElement<? extends AbstractFeatureType>>();
        }
        return this.feature;
    }

    public boolean isSetFeature() {
        return ((this.feature!= null)&&(!this.feature.isEmpty()));
    }

    public void unsetFeature() {
        this.feature = null;
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
            List<JAXBElement<? extends AbstractFeatureType>> theFeature;
            theFeature = this.getFeature();
            strategy.appendField(locator, this, "feature", buffer, theFeature);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeatureArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeatureArrayPropertyType that = ((FeatureArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractFeatureType>> lhsFeature;
            lhsFeature = this.getFeature();
            List<JAXBElement<? extends AbstractFeatureType>> rhsFeature;
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
            List<JAXBElement<? extends AbstractFeatureType>> theFeature;
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
        if (draftCopy instanceof FeatureArrayPropertyType) {
            final FeatureArrayPropertyType copy = ((FeatureArrayPropertyType) draftCopy);
            if (this.isSetFeature()) {
                List<JAXBElement<? extends AbstractFeatureType>> sourceFeature;
                sourceFeature = this.getFeature();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractFeatureType>> copyFeature = ((List<JAXBElement<? extends AbstractFeatureType>> ) strategy.copy(LocatorUtils.property(locator, "feature", sourceFeature), sourceFeature));
                copy.unsetFeature();
                List<JAXBElement<? extends AbstractFeatureType>> uniqueFeaturel = copy.getFeature();
                uniqueFeaturel.addAll(copyFeature);
            } else {
                copy.unsetFeature();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeatureArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof FeatureArrayPropertyType) {
            final FeatureArrayPropertyType target = this;
            final FeatureArrayPropertyType leftObject = ((FeatureArrayPropertyType) left);
            final FeatureArrayPropertyType rightObject = ((FeatureArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractFeatureType>> lhsFeature;
                lhsFeature = leftObject.getFeature();
                List<JAXBElement<? extends AbstractFeatureType>> rhsFeature;
                rhsFeature = rightObject.getFeature();
                target.unsetFeature();
                List<JAXBElement<? extends AbstractFeatureType>> uniqueFeaturel = target.getFeature();
                uniqueFeaturel.addAll(((List<JAXBElement<? extends AbstractFeatureType>> ) strategy.merge(LocatorUtils.property(leftLocator, "feature", lhsFeature), LocatorUtils.property(rightLocator, "feature", rhsFeature), lhsFeature, rhsFeature)));
            }
        }
    }

    public void setFeature(List<JAXBElement<? extends AbstractFeatureType>> value) {
        List<JAXBElement<? extends AbstractFeatureType>> draftl = this.getFeature();
        draftl.addAll(value);
    }

}
