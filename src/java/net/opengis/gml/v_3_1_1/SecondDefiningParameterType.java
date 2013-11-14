//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
 * 
 * <p>Java-Klasse für SecondDefiningParameterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecondDefiningParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}inverseFlattening"/>
 *         &lt;element ref="{http://www.opengis.net/gml}semiMinorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml}isSphere"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondDefiningParameterType", propOrder = {
    "inverseFlattening",
    "semiMinorAxis",
    "isSphere"
})
public class SecondDefiningParameterType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected MeasureType inverseFlattening;
    protected MeasureType semiMinorAxis;
    protected String isSphere;

    /**
     * Ruft den Wert der inverseFlattening-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInverseFlattening() {
        return inverseFlattening;
    }

    /**
     * Legt den Wert der inverseFlattening-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInverseFlattening(MeasureType value) {
        this.inverseFlattening = value;
    }

    public boolean isSetInverseFlattening() {
        return (this.inverseFlattening!= null);
    }

    /**
     * Ruft den Wert der semiMinorAxis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSemiMinorAxis() {
        return semiMinorAxis;
    }

    /**
     * Legt den Wert der semiMinorAxis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSemiMinorAxis(MeasureType value) {
        this.semiMinorAxis = value;
    }

    public boolean isSetSemiMinorAxis() {
        return (this.semiMinorAxis!= null);
    }

    /**
     * Ruft den Wert der isSphere-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSphere() {
        return isSphere;
    }

    /**
     * Legt den Wert der isSphere-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSphere(String value) {
        this.isSphere = value;
    }

    public boolean isSetIsSphere() {
        return (this.isSphere!= null);
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
            MeasureType theInverseFlattening;
            theInverseFlattening = this.getInverseFlattening();
            strategy.appendField(locator, this, "inverseFlattening", buffer, theInverseFlattening);
        }
        {
            MeasureType theSemiMinorAxis;
            theSemiMinorAxis = this.getSemiMinorAxis();
            strategy.appendField(locator, this, "semiMinorAxis", buffer, theSemiMinorAxis);
        }
        {
            String theIsSphere;
            theIsSphere = this.getIsSphere();
            strategy.appendField(locator, this, "isSphere", buffer, theIsSphere);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecondDefiningParameterType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SecondDefiningParameterType that = ((SecondDefiningParameterType) object);
        {
            MeasureType lhsInverseFlattening;
            lhsInverseFlattening = this.getInverseFlattening();
            MeasureType rhsInverseFlattening;
            rhsInverseFlattening = that.getInverseFlattening();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inverseFlattening", lhsInverseFlattening), LocatorUtils.property(thatLocator, "inverseFlattening", rhsInverseFlattening), lhsInverseFlattening, rhsInverseFlattening)) {
                return false;
            }
        }
        {
            MeasureType lhsSemiMinorAxis;
            lhsSemiMinorAxis = this.getSemiMinorAxis();
            MeasureType rhsSemiMinorAxis;
            rhsSemiMinorAxis = that.getSemiMinorAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "semiMinorAxis", lhsSemiMinorAxis), LocatorUtils.property(thatLocator, "semiMinorAxis", rhsSemiMinorAxis), lhsSemiMinorAxis, rhsSemiMinorAxis)) {
                return false;
            }
        }
        {
            String lhsIsSphere;
            lhsIsSphere = this.getIsSphere();
            String rhsIsSphere;
            rhsIsSphere = that.getIsSphere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSphere", lhsIsSphere), LocatorUtils.property(thatLocator, "isSphere", rhsIsSphere), lhsIsSphere, rhsIsSphere)) {
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
            MeasureType theInverseFlattening;
            theInverseFlattening = this.getInverseFlattening();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inverseFlattening", theInverseFlattening), currentHashCode, theInverseFlattening);
        }
        {
            MeasureType theSemiMinorAxis;
            theSemiMinorAxis = this.getSemiMinorAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semiMinorAxis", theSemiMinorAxis), currentHashCode, theSemiMinorAxis);
        }
        {
            String theIsSphere;
            theIsSphere = this.getIsSphere();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSphere", theIsSphere), currentHashCode, theIsSphere);
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
        if (draftCopy instanceof SecondDefiningParameterType) {
            final SecondDefiningParameterType copy = ((SecondDefiningParameterType) draftCopy);
            if (this.isSetInverseFlattening()) {
                MeasureType sourceInverseFlattening;
                sourceInverseFlattening = this.getInverseFlattening();
                MeasureType copyInverseFlattening = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "inverseFlattening", sourceInverseFlattening), sourceInverseFlattening));
                copy.setInverseFlattening(copyInverseFlattening);
            } else {
                copy.inverseFlattening = null;
            }
            if (this.isSetSemiMinorAxis()) {
                MeasureType sourceSemiMinorAxis;
                sourceSemiMinorAxis = this.getSemiMinorAxis();
                MeasureType copySemiMinorAxis = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "semiMinorAxis", sourceSemiMinorAxis), sourceSemiMinorAxis));
                copy.setSemiMinorAxis(copySemiMinorAxis);
            } else {
                copy.semiMinorAxis = null;
            }
            if (this.isSetIsSphere()) {
                String sourceIsSphere;
                sourceIsSphere = this.getIsSphere();
                String copyIsSphere = ((String) strategy.copy(LocatorUtils.property(locator, "isSphere", sourceIsSphere), sourceIsSphere));
                copy.setIsSphere(copyIsSphere);
            } else {
                copy.isSphere = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SecondDefiningParameterType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SecondDefiningParameterType) {
            final SecondDefiningParameterType target = this;
            final SecondDefiningParameterType leftObject = ((SecondDefiningParameterType) left);
            final SecondDefiningParameterType rightObject = ((SecondDefiningParameterType) right);
            {
                MeasureType lhsInverseFlattening;
                lhsInverseFlattening = leftObject.getInverseFlattening();
                MeasureType rhsInverseFlattening;
                rhsInverseFlattening = rightObject.getInverseFlattening();
                target.setInverseFlattening(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "inverseFlattening", lhsInverseFlattening), LocatorUtils.property(rightLocator, "inverseFlattening", rhsInverseFlattening), lhsInverseFlattening, rhsInverseFlattening)));
            }
            {
                MeasureType lhsSemiMinorAxis;
                lhsSemiMinorAxis = leftObject.getSemiMinorAxis();
                MeasureType rhsSemiMinorAxis;
                rhsSemiMinorAxis = rightObject.getSemiMinorAxis();
                target.setSemiMinorAxis(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "semiMinorAxis", lhsSemiMinorAxis), LocatorUtils.property(rightLocator, "semiMinorAxis", rhsSemiMinorAxis), lhsSemiMinorAxis, rhsSemiMinorAxis)));
            }
            {
                String lhsIsSphere;
                lhsIsSphere = leftObject.getIsSphere();
                String rhsIsSphere;
                rhsIsSphere = rightObject.getIsSphere();
                target.setIsSphere(((String) strategy.merge(LocatorUtils.property(leftLocator, "isSphere", lhsIsSphere), LocatorUtils.property(rightLocator, "isSphere", rhsIsSphere), lhsIsSphere, rhsIsSphere)));
            }
        }
    }

}
