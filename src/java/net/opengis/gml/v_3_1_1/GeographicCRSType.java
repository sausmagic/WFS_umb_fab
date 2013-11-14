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
 * A coordinate reference system based on an ellipsoidal approximation of the geoid; this provides an accurate representation of the geometry of geographic features for a large portion of the earth's surface.
 * 
 * <p>Java-Klasse für GeographicCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeographicCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEllipsoidalCS"/>
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
@XmlType(name = "GeographicCRSType", propOrder = {
    "usesEllipsoidalCS",
    "usesGeodeticDatum"
})
public class GeographicCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected EllipsoidalCSRefType usesEllipsoidalCS;
    @XmlElement(required = true)
    protected GeodeticDatumRefType usesGeodeticDatum;

    /**
     * Ruft den Wert der usesEllipsoidalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidalCSRefType }
     *     
     */
    public EllipsoidalCSRefType getUsesEllipsoidalCS() {
        return usesEllipsoidalCS;
    }

    /**
     * Legt den Wert der usesEllipsoidalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidalCSRefType }
     *     
     */
    public void setUsesEllipsoidalCS(EllipsoidalCSRefType value) {
        this.usesEllipsoidalCS = value;
    }

    public boolean isSetUsesEllipsoidalCS() {
        return (this.usesEllipsoidalCS!= null);
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
            EllipsoidalCSRefType theUsesEllipsoidalCS;
            theUsesEllipsoidalCS = this.getUsesEllipsoidalCS();
            strategy.appendField(locator, this, "usesEllipsoidalCS", buffer, theUsesEllipsoidalCS);
        }
        {
            GeodeticDatumRefType theUsesGeodeticDatum;
            theUsesGeodeticDatum = this.getUsesGeodeticDatum();
            strategy.appendField(locator, this, "usesGeodeticDatum", buffer, theUsesGeodeticDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeographicCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeographicCRSType that = ((GeographicCRSType) object);
        {
            EllipsoidalCSRefType lhsUsesEllipsoidalCS;
            lhsUsesEllipsoidalCS = this.getUsesEllipsoidalCS();
            EllipsoidalCSRefType rhsUsesEllipsoidalCS;
            rhsUsesEllipsoidalCS = that.getUsesEllipsoidalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesEllipsoidalCS", lhsUsesEllipsoidalCS), LocatorUtils.property(thatLocator, "usesEllipsoidalCS", rhsUsesEllipsoidalCS), lhsUsesEllipsoidalCS, rhsUsesEllipsoidalCS)) {
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
            EllipsoidalCSRefType theUsesEllipsoidalCS;
            theUsesEllipsoidalCS = this.getUsesEllipsoidalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesEllipsoidalCS", theUsesEllipsoidalCS), currentHashCode, theUsesEllipsoidalCS);
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
        if (draftCopy instanceof GeographicCRSType) {
            final GeographicCRSType copy = ((GeographicCRSType) draftCopy);
            if (this.isSetUsesEllipsoidalCS()) {
                EllipsoidalCSRefType sourceUsesEllipsoidalCS;
                sourceUsesEllipsoidalCS = this.getUsesEllipsoidalCS();
                EllipsoidalCSRefType copyUsesEllipsoidalCS = ((EllipsoidalCSRefType) strategy.copy(LocatorUtils.property(locator, "usesEllipsoidalCS", sourceUsesEllipsoidalCS), sourceUsesEllipsoidalCS));
                copy.setUsesEllipsoidalCS(copyUsesEllipsoidalCS);
            } else {
                copy.usesEllipsoidalCS = null;
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
        return new GeographicCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeographicCRSType) {
            final GeographicCRSType target = this;
            final GeographicCRSType leftObject = ((GeographicCRSType) left);
            final GeographicCRSType rightObject = ((GeographicCRSType) right);
            {
                EllipsoidalCSRefType lhsUsesEllipsoidalCS;
                lhsUsesEllipsoidalCS = leftObject.getUsesEllipsoidalCS();
                EllipsoidalCSRefType rhsUsesEllipsoidalCS;
                rhsUsesEllipsoidalCS = rightObject.getUsesEllipsoidalCS();
                target.setUsesEllipsoidalCS(((EllipsoidalCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesEllipsoidalCS", lhsUsesEllipsoidalCS), LocatorUtils.property(rightLocator, "usesEllipsoidalCS", rhsUsesEllipsoidalCS), lhsUsesEllipsoidalCS, rhsUsesEllipsoidalCS)));
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
