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
 * A geodetic datum defines the precise location and orientation in 3-dimensional space of a defined ellipsoid (or sphere) that approximates the shape of the earth, or of a Cartesian coordinate system centered in this ellipsoid (or sphere). 
 * 
 * <p>Java-Klasse für GeodeticDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesPrimeMeridian"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEllipsoid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "usesPrimeMeridian",
    "usesEllipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected PrimeMeridianRefType usesPrimeMeridian;
    @XmlElement(required = true)
    protected EllipsoidRefType usesEllipsoid;

    /**
     * Ruft den Wert der usesPrimeMeridian-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrimeMeridianRefType }
     *     
     */
    public PrimeMeridianRefType getUsesPrimeMeridian() {
        return usesPrimeMeridian;
    }

    /**
     * Legt den Wert der usesPrimeMeridian-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeMeridianRefType }
     *     
     */
    public void setUsesPrimeMeridian(PrimeMeridianRefType value) {
        this.usesPrimeMeridian = value;
    }

    public boolean isSetUsesPrimeMeridian() {
        return (this.usesPrimeMeridian!= null);
    }

    /**
     * Ruft den Wert der usesEllipsoid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidRefType }
     *     
     */
    public EllipsoidRefType getUsesEllipsoid() {
        return usesEllipsoid;
    }

    /**
     * Legt den Wert der usesEllipsoid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidRefType }
     *     
     */
    public void setUsesEllipsoid(EllipsoidRefType value) {
        this.usesEllipsoid = value;
    }

    public boolean isSetUsesEllipsoid() {
        return (this.usesEllipsoid!= null);
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
            PrimeMeridianRefType theUsesPrimeMeridian;
            theUsesPrimeMeridian = this.getUsesPrimeMeridian();
            strategy.appendField(locator, this, "usesPrimeMeridian", buffer, theUsesPrimeMeridian);
        }
        {
            EllipsoidRefType theUsesEllipsoid;
            theUsesEllipsoid = this.getUsesEllipsoid();
            strategy.appendField(locator, this, "usesEllipsoid", buffer, theUsesEllipsoid);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeodeticDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeodeticDatumType that = ((GeodeticDatumType) object);
        {
            PrimeMeridianRefType lhsUsesPrimeMeridian;
            lhsUsesPrimeMeridian = this.getUsesPrimeMeridian();
            PrimeMeridianRefType rhsUsesPrimeMeridian;
            rhsUsesPrimeMeridian = that.getUsesPrimeMeridian();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesPrimeMeridian", lhsUsesPrimeMeridian), LocatorUtils.property(thatLocator, "usesPrimeMeridian", rhsUsesPrimeMeridian), lhsUsesPrimeMeridian, rhsUsesPrimeMeridian)) {
                return false;
            }
        }
        {
            EllipsoidRefType lhsUsesEllipsoid;
            lhsUsesEllipsoid = this.getUsesEllipsoid();
            EllipsoidRefType rhsUsesEllipsoid;
            rhsUsesEllipsoid = that.getUsesEllipsoid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesEllipsoid", lhsUsesEllipsoid), LocatorUtils.property(thatLocator, "usesEllipsoid", rhsUsesEllipsoid), lhsUsesEllipsoid, rhsUsesEllipsoid)) {
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
            PrimeMeridianRefType theUsesPrimeMeridian;
            theUsesPrimeMeridian = this.getUsesPrimeMeridian();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesPrimeMeridian", theUsesPrimeMeridian), currentHashCode, theUsesPrimeMeridian);
        }
        {
            EllipsoidRefType theUsesEllipsoid;
            theUsesEllipsoid = this.getUsesEllipsoid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesEllipsoid", theUsesEllipsoid), currentHashCode, theUsesEllipsoid);
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
        if (draftCopy instanceof GeodeticDatumType) {
            final GeodeticDatumType copy = ((GeodeticDatumType) draftCopy);
            if (this.isSetUsesPrimeMeridian()) {
                PrimeMeridianRefType sourceUsesPrimeMeridian;
                sourceUsesPrimeMeridian = this.getUsesPrimeMeridian();
                PrimeMeridianRefType copyUsesPrimeMeridian = ((PrimeMeridianRefType) strategy.copy(LocatorUtils.property(locator, "usesPrimeMeridian", sourceUsesPrimeMeridian), sourceUsesPrimeMeridian));
                copy.setUsesPrimeMeridian(copyUsesPrimeMeridian);
            } else {
                copy.usesPrimeMeridian = null;
            }
            if (this.isSetUsesEllipsoid()) {
                EllipsoidRefType sourceUsesEllipsoid;
                sourceUsesEllipsoid = this.getUsesEllipsoid();
                EllipsoidRefType copyUsesEllipsoid = ((EllipsoidRefType) strategy.copy(LocatorUtils.property(locator, "usesEllipsoid", sourceUsesEllipsoid), sourceUsesEllipsoid));
                copy.setUsesEllipsoid(copyUsesEllipsoid);
            } else {
                copy.usesEllipsoid = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeodeticDatumType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeodeticDatumType) {
            final GeodeticDatumType target = this;
            final GeodeticDatumType leftObject = ((GeodeticDatumType) left);
            final GeodeticDatumType rightObject = ((GeodeticDatumType) right);
            {
                PrimeMeridianRefType lhsUsesPrimeMeridian;
                lhsUsesPrimeMeridian = leftObject.getUsesPrimeMeridian();
                PrimeMeridianRefType rhsUsesPrimeMeridian;
                rhsUsesPrimeMeridian = rightObject.getUsesPrimeMeridian();
                target.setUsesPrimeMeridian(((PrimeMeridianRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesPrimeMeridian", lhsUsesPrimeMeridian), LocatorUtils.property(rightLocator, "usesPrimeMeridian", rhsUsesPrimeMeridian), lhsUsesPrimeMeridian, rhsUsesPrimeMeridian)));
            }
            {
                EllipsoidRefType lhsUsesEllipsoid;
                lhsUsesEllipsoid = leftObject.getUsesEllipsoid();
                EllipsoidRefType rhsUsesEllipsoid;
                rhsUsesEllipsoid = rightObject.getUsesEllipsoid();
                target.setUsesEllipsoid(((EllipsoidRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesEllipsoid", lhsUsesEllipsoid), LocatorUtils.property(rightLocator, "usesEllipsoid", rhsUsesEllipsoid), lhsUsesEllipsoid, rhsUsesEllipsoid)));
            }
        }
    }

}
