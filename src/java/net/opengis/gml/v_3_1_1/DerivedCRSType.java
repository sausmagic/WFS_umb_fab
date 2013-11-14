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
 * A coordinate reference system that is defined by its coordinate conversion from another coordinate reference system but is not a projected coordinate reference system. This category includes coordinate reference systems derived from a projected coordinate reference system. 
 * 
 * <p>Java-Klasse für DerivedCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}derivedCRSType"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
    "derivedCRSType",
    "usesCS"
})
public class DerivedCRSType
    extends AbstractGeneralDerivedCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected DerivedCRSTypeType derivedCRSType;
    @XmlElement(required = true)
    protected CoordinateSystemRefType usesCS;

    /**
     * Ruft den Wert der derivedCRSType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DerivedCRSTypeType }
     *     
     */
    public DerivedCRSTypeType getDerivedCRSType() {
        return derivedCRSType;
    }

    /**
     * Legt den Wert der derivedCRSType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedCRSTypeType }
     *     
     */
    public void setDerivedCRSType(DerivedCRSTypeType value) {
        this.derivedCRSType = value;
    }

    public boolean isSetDerivedCRSType() {
        return (this.derivedCRSType!= null);
    }

    /**
     * Ruft den Wert der usesCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemRefType }
     *     
     */
    public CoordinateSystemRefType getUsesCS() {
        return usesCS;
    }

    /**
     * Legt den Wert der usesCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemRefType }
     *     
     */
    public void setUsesCS(CoordinateSystemRefType value) {
        this.usesCS = value;
    }

    public boolean isSetUsesCS() {
        return (this.usesCS!= null);
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
            DerivedCRSTypeType theDerivedCRSType;
            theDerivedCRSType = this.getDerivedCRSType();
            strategy.appendField(locator, this, "derivedCRSType", buffer, theDerivedCRSType);
        }
        {
            CoordinateSystemRefType theUsesCS;
            theUsesCS = this.getUsesCS();
            strategy.appendField(locator, this, "usesCS", buffer, theUsesCS);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivedCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DerivedCRSType that = ((DerivedCRSType) object);
        {
            DerivedCRSTypeType lhsDerivedCRSType;
            lhsDerivedCRSType = this.getDerivedCRSType();
            DerivedCRSTypeType rhsDerivedCRSType;
            rhsDerivedCRSType = that.getDerivedCRSType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "derivedCRSType", lhsDerivedCRSType), LocatorUtils.property(thatLocator, "derivedCRSType", rhsDerivedCRSType), lhsDerivedCRSType, rhsDerivedCRSType)) {
                return false;
            }
        }
        {
            CoordinateSystemRefType lhsUsesCS;
            lhsUsesCS = this.getUsesCS();
            CoordinateSystemRefType rhsUsesCS;
            rhsUsesCS = that.getUsesCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesCS", lhsUsesCS), LocatorUtils.property(thatLocator, "usesCS", rhsUsesCS), lhsUsesCS, rhsUsesCS)) {
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
            DerivedCRSTypeType theDerivedCRSType;
            theDerivedCRSType = this.getDerivedCRSType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "derivedCRSType", theDerivedCRSType), currentHashCode, theDerivedCRSType);
        }
        {
            CoordinateSystemRefType theUsesCS;
            theUsesCS = this.getUsesCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesCS", theUsesCS), currentHashCode, theUsesCS);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof DerivedCRSType) {
            final DerivedCRSType copy = ((DerivedCRSType) draftCopy);
            if (this.isSetDerivedCRSType()) {
                DerivedCRSTypeType sourceDerivedCRSType;
                sourceDerivedCRSType = this.getDerivedCRSType();
                DerivedCRSTypeType copyDerivedCRSType = ((DerivedCRSTypeType) strategy.copy(LocatorUtils.property(locator, "derivedCRSType", sourceDerivedCRSType), sourceDerivedCRSType));
                copy.setDerivedCRSType(copyDerivedCRSType);
            } else {
                copy.derivedCRSType = null;
            }
            if (this.isSetUsesCS()) {
                CoordinateSystemRefType sourceUsesCS;
                sourceUsesCS = this.getUsesCS();
                CoordinateSystemRefType copyUsesCS = ((CoordinateSystemRefType) strategy.copy(LocatorUtils.property(locator, "usesCS", sourceUsesCS), sourceUsesCS));
                copy.setUsesCS(copyUsesCS);
            } else {
                copy.usesCS = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DerivedCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DerivedCRSType) {
            final DerivedCRSType target = this;
            final DerivedCRSType leftObject = ((DerivedCRSType) left);
            final DerivedCRSType rightObject = ((DerivedCRSType) right);
            {
                DerivedCRSTypeType lhsDerivedCRSType;
                lhsDerivedCRSType = leftObject.getDerivedCRSType();
                DerivedCRSTypeType rhsDerivedCRSType;
                rhsDerivedCRSType = rightObject.getDerivedCRSType();
                target.setDerivedCRSType(((DerivedCRSTypeType) strategy.merge(LocatorUtils.property(leftLocator, "derivedCRSType", lhsDerivedCRSType), LocatorUtils.property(rightLocator, "derivedCRSType", rhsDerivedCRSType), lhsDerivedCRSType, rhsDerivedCRSType)));
            }
            {
                CoordinateSystemRefType lhsUsesCS;
                lhsUsesCS = leftObject.getUsesCS();
                CoordinateSystemRefType rhsUsesCS;
                rhsUsesCS = rightObject.getUsesCS();
                target.setUsesCS(((CoordinateSystemRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesCS", lhsUsesCS), LocatorUtils.property(rightLocator, "usesCS", rhsUsesCS), lhsUsesCS, rhsUsesCS)));
            }
        }
    }

}
