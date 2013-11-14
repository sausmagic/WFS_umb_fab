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
 * A contextually local coordinate reference system; which can be divided into two broad categories:
 * - earth-fixed systems applied to engineering activities on or near the surface of the earth;
 * - CRSs on moving platforms such as road vehicles, vessels, aircraft, or spacecraft.
 * For further information, see OGC Abstract Specification Topic 2. 
 * 
 * <p>Java-Klasse für EngineeringCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EngineeringCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEngineeringDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "usesCS",
    "usesEngineeringDatum"
})
public class EngineeringCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected CoordinateSystemRefType usesCS;
    @XmlElement(required = true)
    protected EngineeringDatumRefType usesEngineeringDatum;

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

    /**
     * Ruft den Wert der usesEngineeringDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EngineeringDatumRefType }
     *     
     */
    public EngineeringDatumRefType getUsesEngineeringDatum() {
        return usesEngineeringDatum;
    }

    /**
     * Legt den Wert der usesEngineeringDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineeringDatumRefType }
     *     
     */
    public void setUsesEngineeringDatum(EngineeringDatumRefType value) {
        this.usesEngineeringDatum = value;
    }

    public boolean isSetUsesEngineeringDatum() {
        return (this.usesEngineeringDatum!= null);
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
            CoordinateSystemRefType theUsesCS;
            theUsesCS = this.getUsesCS();
            strategy.appendField(locator, this, "usesCS", buffer, theUsesCS);
        }
        {
            EngineeringDatumRefType theUsesEngineeringDatum;
            theUsesEngineeringDatum = this.getUsesEngineeringDatum();
            strategy.appendField(locator, this, "usesEngineeringDatum", buffer, theUsesEngineeringDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EngineeringCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EngineeringCRSType that = ((EngineeringCRSType) object);
        {
            CoordinateSystemRefType lhsUsesCS;
            lhsUsesCS = this.getUsesCS();
            CoordinateSystemRefType rhsUsesCS;
            rhsUsesCS = that.getUsesCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesCS", lhsUsesCS), LocatorUtils.property(thatLocator, "usesCS", rhsUsesCS), lhsUsesCS, rhsUsesCS)) {
                return false;
            }
        }
        {
            EngineeringDatumRefType lhsUsesEngineeringDatum;
            lhsUsesEngineeringDatum = this.getUsesEngineeringDatum();
            EngineeringDatumRefType rhsUsesEngineeringDatum;
            rhsUsesEngineeringDatum = that.getUsesEngineeringDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesEngineeringDatum", lhsUsesEngineeringDatum), LocatorUtils.property(thatLocator, "usesEngineeringDatum", rhsUsesEngineeringDatum), lhsUsesEngineeringDatum, rhsUsesEngineeringDatum)) {
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
            CoordinateSystemRefType theUsesCS;
            theUsesCS = this.getUsesCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesCS", theUsesCS), currentHashCode, theUsesCS);
        }
        {
            EngineeringDatumRefType theUsesEngineeringDatum;
            theUsesEngineeringDatum = this.getUsesEngineeringDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesEngineeringDatum", theUsesEngineeringDatum), currentHashCode, theUsesEngineeringDatum);
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
        if (draftCopy instanceof EngineeringCRSType) {
            final EngineeringCRSType copy = ((EngineeringCRSType) draftCopy);
            if (this.isSetUsesCS()) {
                CoordinateSystemRefType sourceUsesCS;
                sourceUsesCS = this.getUsesCS();
                CoordinateSystemRefType copyUsesCS = ((CoordinateSystemRefType) strategy.copy(LocatorUtils.property(locator, "usesCS", sourceUsesCS), sourceUsesCS));
                copy.setUsesCS(copyUsesCS);
            } else {
                copy.usesCS = null;
            }
            if (this.isSetUsesEngineeringDatum()) {
                EngineeringDatumRefType sourceUsesEngineeringDatum;
                sourceUsesEngineeringDatum = this.getUsesEngineeringDatum();
                EngineeringDatumRefType copyUsesEngineeringDatum = ((EngineeringDatumRefType) strategy.copy(LocatorUtils.property(locator, "usesEngineeringDatum", sourceUsesEngineeringDatum), sourceUsesEngineeringDatum));
                copy.setUsesEngineeringDatum(copyUsesEngineeringDatum);
            } else {
                copy.usesEngineeringDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EngineeringCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EngineeringCRSType) {
            final EngineeringCRSType target = this;
            final EngineeringCRSType leftObject = ((EngineeringCRSType) left);
            final EngineeringCRSType rightObject = ((EngineeringCRSType) right);
            {
                CoordinateSystemRefType lhsUsesCS;
                lhsUsesCS = leftObject.getUsesCS();
                CoordinateSystemRefType rhsUsesCS;
                rhsUsesCS = rightObject.getUsesCS();
                target.setUsesCS(((CoordinateSystemRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesCS", lhsUsesCS), LocatorUtils.property(rightLocator, "usesCS", rhsUsesCS), lhsUsesCS, rhsUsesCS)));
            }
            {
                EngineeringDatumRefType lhsUsesEngineeringDatum;
                lhsUsesEngineeringDatum = leftObject.getUsesEngineeringDatum();
                EngineeringDatumRefType rhsUsesEngineeringDatum;
                rhsUsesEngineeringDatum = rightObject.getUsesEngineeringDatum();
                target.setUsesEngineeringDatum(((EngineeringDatumRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesEngineeringDatum", lhsUsesEngineeringDatum), LocatorUtils.property(rightLocator, "usesEngineeringDatum", rhsUsesEngineeringDatum), lhsUsesEngineeringDatum, rhsUsesEngineeringDatum)));
            }
        }
    }

}
