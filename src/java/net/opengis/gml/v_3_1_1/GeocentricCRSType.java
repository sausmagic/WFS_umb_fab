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
 * A 3D coordinate reference system with the origin at the approximate centre of mass of the earth. A geocentric CRS deals with the earth's curvature by taking a 3D spatial view, which obviates the need to model the earth's curvature. 
 * 
 * <p>Java-Klasse für GeocentricCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeocentricCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml}usesSphericalCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}usesGeodeticDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocentricCRSType", propOrder = {
    "usesCartesianCS",
    "usesSphericalCS",
    "usesGeodeticDatum"
})
public class GeocentricCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected CartesianCSRefType usesCartesianCS;
    protected SphericalCSRefType usesSphericalCS;
    @XmlElement(required = true)
    protected GeodeticDatumRefType usesGeodeticDatum;

    /**
     * Ruft den Wert der usesCartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSRefType }
     *     
     */
    public CartesianCSRefType getUsesCartesianCS() {
        return usesCartesianCS;
    }

    /**
     * Legt den Wert der usesCartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSRefType }
     *     
     */
    public void setUsesCartesianCS(CartesianCSRefType value) {
        this.usesCartesianCS = value;
    }

    public boolean isSetUsesCartesianCS() {
        return (this.usesCartesianCS!= null);
    }

    /**
     * Ruft den Wert der usesSphericalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SphericalCSRefType }
     *     
     */
    public SphericalCSRefType getUsesSphericalCS() {
        return usesSphericalCS;
    }

    /**
     * Legt den Wert der usesSphericalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SphericalCSRefType }
     *     
     */
    public void setUsesSphericalCS(SphericalCSRefType value) {
        this.usesSphericalCS = value;
    }

    public boolean isSetUsesSphericalCS() {
        return (this.usesSphericalCS!= null);
    }

    /**
     * Ruft den Wert der usesGeodeticDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatumRefType }
     *     
     */
    public GeodeticDatumRefType getUsesGeodeticDatum() {
        return usesGeodeticDatum;
    }

    /**
     * Legt den Wert der usesGeodeticDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatumRefType }
     *     
     */
    public void setUsesGeodeticDatum(GeodeticDatumRefType value) {
        this.usesGeodeticDatum = value;
    }

    public boolean isSetUsesGeodeticDatum() {
        return (this.usesGeodeticDatum!= null);
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
            CartesianCSRefType theUsesCartesianCS;
            theUsesCartesianCS = this.getUsesCartesianCS();
            strategy.appendField(locator, this, "usesCartesianCS", buffer, theUsesCartesianCS);
        }
        {
            SphericalCSRefType theUsesSphericalCS;
            theUsesSphericalCS = this.getUsesSphericalCS();
            strategy.appendField(locator, this, "usesSphericalCS", buffer, theUsesSphericalCS);
        }
        {
            GeodeticDatumRefType theUsesGeodeticDatum;
            theUsesGeodeticDatum = this.getUsesGeodeticDatum();
            strategy.appendField(locator, this, "usesGeodeticDatum", buffer, theUsesGeodeticDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeocentricCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeocentricCRSType that = ((GeocentricCRSType) object);
        {
            CartesianCSRefType lhsUsesCartesianCS;
            lhsUsesCartesianCS = this.getUsesCartesianCS();
            CartesianCSRefType rhsUsesCartesianCS;
            rhsUsesCartesianCS = that.getUsesCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(thatLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)) {
                return false;
            }
        }
        {
            SphericalCSRefType lhsUsesSphericalCS;
            lhsUsesSphericalCS = this.getUsesSphericalCS();
            SphericalCSRefType rhsUsesSphericalCS;
            rhsUsesSphericalCS = that.getUsesSphericalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesSphericalCS", lhsUsesSphericalCS), LocatorUtils.property(thatLocator, "usesSphericalCS", rhsUsesSphericalCS), lhsUsesSphericalCS, rhsUsesSphericalCS)) {
                return false;
            }
        }
        {
            GeodeticDatumRefType lhsUsesGeodeticDatum;
            lhsUsesGeodeticDatum = this.getUsesGeodeticDatum();
            GeodeticDatumRefType rhsUsesGeodeticDatum;
            rhsUsesGeodeticDatum = that.getUsesGeodeticDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesGeodeticDatum", lhsUsesGeodeticDatum), LocatorUtils.property(thatLocator, "usesGeodeticDatum", rhsUsesGeodeticDatum), lhsUsesGeodeticDatum, rhsUsesGeodeticDatum)) {
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
            CartesianCSRefType theUsesCartesianCS;
            theUsesCartesianCS = this.getUsesCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesCartesianCS", theUsesCartesianCS), currentHashCode, theUsesCartesianCS);
        }
        {
            SphericalCSRefType theUsesSphericalCS;
            theUsesSphericalCS = this.getUsesSphericalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesSphericalCS", theUsesSphericalCS), currentHashCode, theUsesSphericalCS);
        }
        {
            GeodeticDatumRefType theUsesGeodeticDatum;
            theUsesGeodeticDatum = this.getUsesGeodeticDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesGeodeticDatum", theUsesGeodeticDatum), currentHashCode, theUsesGeodeticDatum);
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
        if (draftCopy instanceof GeocentricCRSType) {
            final GeocentricCRSType copy = ((GeocentricCRSType) draftCopy);
            if (this.isSetUsesCartesianCS()) {
                CartesianCSRefType sourceUsesCartesianCS;
                sourceUsesCartesianCS = this.getUsesCartesianCS();
                CartesianCSRefType copyUsesCartesianCS = ((CartesianCSRefType) strategy.copy(LocatorUtils.property(locator, "usesCartesianCS", sourceUsesCartesianCS), sourceUsesCartesianCS));
                copy.setUsesCartesianCS(copyUsesCartesianCS);
            } else {
                copy.usesCartesianCS = null;
            }
            if (this.isSetUsesSphericalCS()) {
                SphericalCSRefType sourceUsesSphericalCS;
                sourceUsesSphericalCS = this.getUsesSphericalCS();
                SphericalCSRefType copyUsesSphericalCS = ((SphericalCSRefType) strategy.copy(LocatorUtils.property(locator, "usesSphericalCS", sourceUsesSphericalCS), sourceUsesSphericalCS));
                copy.setUsesSphericalCS(copyUsesSphericalCS);
            } else {
                copy.usesSphericalCS = null;
            }
            if (this.isSetUsesGeodeticDatum()) {
                GeodeticDatumRefType sourceUsesGeodeticDatum;
                sourceUsesGeodeticDatum = this.getUsesGeodeticDatum();
                GeodeticDatumRefType copyUsesGeodeticDatum = ((GeodeticDatumRefType) strategy.copy(LocatorUtils.property(locator, "usesGeodeticDatum", sourceUsesGeodeticDatum), sourceUsesGeodeticDatum));
                copy.setUsesGeodeticDatum(copyUsesGeodeticDatum);
            } else {
                copy.usesGeodeticDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeocentricCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeocentricCRSType) {
            final GeocentricCRSType target = this;
            final GeocentricCRSType leftObject = ((GeocentricCRSType) left);
            final GeocentricCRSType rightObject = ((GeocentricCRSType) right);
            {
                CartesianCSRefType lhsUsesCartesianCS;
                lhsUsesCartesianCS = leftObject.getUsesCartesianCS();
                CartesianCSRefType rhsUsesCartesianCS;
                rhsUsesCartesianCS = rightObject.getUsesCartesianCS();
                target.setUsesCartesianCS(((CartesianCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(rightLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)));
            }
            {
                SphericalCSRefType lhsUsesSphericalCS;
                lhsUsesSphericalCS = leftObject.getUsesSphericalCS();
                SphericalCSRefType rhsUsesSphericalCS;
                rhsUsesSphericalCS = rightObject.getUsesSphericalCS();
                target.setUsesSphericalCS(((SphericalCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesSphericalCS", lhsUsesSphericalCS), LocatorUtils.property(rightLocator, "usesSphericalCS", rhsUsesSphericalCS), lhsUsesSphericalCS, rhsUsesSphericalCS)));
            }
            {
                GeodeticDatumRefType lhsUsesGeodeticDatum;
                lhsUsesGeodeticDatum = leftObject.getUsesGeodeticDatum();
                GeodeticDatumRefType rhsUsesGeodeticDatum;
                rhsUsesGeodeticDatum = rightObject.getUsesGeodeticDatum();
                target.setUsesGeodeticDatum(((GeodeticDatumRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesGeodeticDatum", lhsUsesGeodeticDatum), LocatorUtils.property(rightLocator, "usesGeodeticDatum", rhsUsesGeodeticDatum), lhsUsesGeodeticDatum, rhsUsesGeodeticDatum)));
            }
        }
    }

}
