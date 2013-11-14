//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * A coordinate reference system that is defined by its coordinate conversion from another coordinate reference system (not by a datum). This abstract complexType shall not be used, extended, or restricted, in an Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document. 
 * 
 * <p>Java-Klasse für AbstractGeneralDerivedCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralDerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}baseCRS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}definedByConversion"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", propOrder = {
    "baseCRS",
    "definedByConversion"
})
@XmlSeeAlso({
    DerivedCRSType.class,
    ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected CoordinateReferenceSystemRefType baseCRS;
    @XmlElement(required = true)
    protected GeneralConversionRefType definedByConversion;

    /**
     * Ruft den Wert der baseCRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateReferenceSystemRefType }
     *     
     */
    public CoordinateReferenceSystemRefType getBaseCRS() {
        return baseCRS;
    }

    /**
     * Legt den Wert der baseCRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateReferenceSystemRefType }
     *     
     */
    public void setBaseCRS(CoordinateReferenceSystemRefType value) {
        this.baseCRS = value;
    }

    public boolean isSetBaseCRS() {
        return (this.baseCRS!= null);
    }

    /**
     * Ruft den Wert der definedByConversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralConversionRefType }
     *     
     */
    public GeneralConversionRefType getDefinedByConversion() {
        return definedByConversion;
    }

    /**
     * Legt den Wert der definedByConversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralConversionRefType }
     *     
     */
    public void setDefinedByConversion(GeneralConversionRefType value) {
        this.definedByConversion = value;
    }

    public boolean isSetDefinedByConversion() {
        return (this.definedByConversion!= null);
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
        super.appendFields(locator, buffer, strategy);
        {
            CoordinateReferenceSystemRefType theBaseCRS;
            theBaseCRS = this.getBaseCRS();
            strategy.appendField(locator, this, "baseCRS", buffer, theBaseCRS);
        }
        {
            GeneralConversionRefType theDefinedByConversion;
            theDefinedByConversion = this.getDefinedByConversion();
            strategy.appendField(locator, this, "definedByConversion", buffer, theDefinedByConversion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractGeneralDerivedCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractGeneralDerivedCRSType that = ((AbstractGeneralDerivedCRSType) object);
        {
            CoordinateReferenceSystemRefType lhsBaseCRS;
            lhsBaseCRS = this.getBaseCRS();
            CoordinateReferenceSystemRefType rhsBaseCRS;
            rhsBaseCRS = that.getBaseCRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseCRS", lhsBaseCRS), LocatorUtils.property(thatLocator, "baseCRS", rhsBaseCRS), lhsBaseCRS, rhsBaseCRS)) {
                return false;
            }
        }
        {
            GeneralConversionRefType lhsDefinedByConversion;
            lhsDefinedByConversion = this.getDefinedByConversion();
            GeneralConversionRefType rhsDefinedByConversion;
            rhsDefinedByConversion = that.getDefinedByConversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "definedByConversion", lhsDefinedByConversion), LocatorUtils.property(thatLocator, "definedByConversion", rhsDefinedByConversion), lhsDefinedByConversion, rhsDefinedByConversion)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            CoordinateReferenceSystemRefType theBaseCRS;
            theBaseCRS = this.getBaseCRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseCRS", theBaseCRS), currentHashCode, theBaseCRS);
        }
        {
            GeneralConversionRefType theDefinedByConversion;
            theDefinedByConversion = this.getDefinedByConversion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "definedByConversion", theDefinedByConversion), currentHashCode, theDefinedByConversion);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AbstractGeneralDerivedCRSType) {
            final AbstractGeneralDerivedCRSType copy = ((AbstractGeneralDerivedCRSType) target);
            if (this.isSetBaseCRS()) {
                CoordinateReferenceSystemRefType sourceBaseCRS;
                sourceBaseCRS = this.getBaseCRS();
                CoordinateReferenceSystemRefType copyBaseCRS = ((CoordinateReferenceSystemRefType) strategy.copy(LocatorUtils.property(locator, "baseCRS", sourceBaseCRS), sourceBaseCRS));
                copy.setBaseCRS(copyBaseCRS);
            } else {
                copy.baseCRS = null;
            }
            if (this.isSetDefinedByConversion()) {
                GeneralConversionRefType sourceDefinedByConversion;
                sourceDefinedByConversion = this.getDefinedByConversion();
                GeneralConversionRefType copyDefinedByConversion = ((GeneralConversionRefType) strategy.copy(LocatorUtils.property(locator, "definedByConversion", sourceDefinedByConversion), sourceDefinedByConversion));
                copy.setDefinedByConversion(copyDefinedByConversion);
            } else {
                copy.definedByConversion = null;
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof AbstractGeneralDerivedCRSType) {
            final AbstractGeneralDerivedCRSType target = this;
            final AbstractGeneralDerivedCRSType leftObject = ((AbstractGeneralDerivedCRSType) left);
            final AbstractGeneralDerivedCRSType rightObject = ((AbstractGeneralDerivedCRSType) right);
            {
                CoordinateReferenceSystemRefType lhsBaseCRS;
                lhsBaseCRS = leftObject.getBaseCRS();
                CoordinateReferenceSystemRefType rhsBaseCRS;
                rhsBaseCRS = rightObject.getBaseCRS();
                target.setBaseCRS(((CoordinateReferenceSystemRefType) strategy.merge(LocatorUtils.property(leftLocator, "baseCRS", lhsBaseCRS), LocatorUtils.property(rightLocator, "baseCRS", rhsBaseCRS), lhsBaseCRS, rhsBaseCRS)));
            }
            {
                GeneralConversionRefType lhsDefinedByConversion;
                lhsDefinedByConversion = leftObject.getDefinedByConversion();
                GeneralConversionRefType rhsDefinedByConversion;
                rhsDefinedByConversion = rightObject.getDefinedByConversion();
                target.setDefinedByConversion(((GeneralConversionRefType) strategy.merge(LocatorUtils.property(leftLocator, "definedByConversion", lhsDefinedByConversion), LocatorUtils.property(rightLocator, "definedByConversion", rhsDefinedByConversion), lhsDefinedByConversion, rhsDefinedByConversion)));
            }
        }
    }

}
