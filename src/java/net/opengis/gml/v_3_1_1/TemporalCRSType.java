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
 * A 1D coordinate reference system used for the recording of time. 
 * 
 * <p>Java-Klasse für TemporalCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TemporalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesTemporalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesTemporalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalCRSType", propOrder = {
    "usesTemporalCS",
    "usesTemporalDatum"
})
public class TemporalCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected TemporalCSRefType usesTemporalCS;
    @XmlElement(required = true)
    protected TemporalDatumRefType usesTemporalDatum;

    /**
     * Ruft den Wert der usesTemporalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCSRefType }
     *     
     */
    public TemporalCSRefType getUsesTemporalCS() {
        return usesTemporalCS;
    }

    /**
     * Legt den Wert der usesTemporalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCSRefType }
     *     
     */
    public void setUsesTemporalCS(TemporalCSRefType value) {
        this.usesTemporalCS = value;
    }

    public boolean isSetUsesTemporalCS() {
        return (this.usesTemporalCS!= null);
    }

    /**
     * Ruft den Wert der usesTemporalDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemporalDatumRefType }
     *     
     */
    public TemporalDatumRefType getUsesTemporalDatum() {
        return usesTemporalDatum;
    }

    /**
     * Legt den Wert der usesTemporalDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalDatumRefType }
     *     
     */
    public void setUsesTemporalDatum(TemporalDatumRefType value) {
        this.usesTemporalDatum = value;
    }

    public boolean isSetUsesTemporalDatum() {
        return (this.usesTemporalDatum!= null);
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
            TemporalCSRefType theUsesTemporalCS;
            theUsesTemporalCS = this.getUsesTemporalCS();
            strategy.appendField(locator, this, "usesTemporalCS", buffer, theUsesTemporalCS);
        }
        {
            TemporalDatumRefType theUsesTemporalDatum;
            theUsesTemporalDatum = this.getUsesTemporalDatum();
            strategy.appendField(locator, this, "usesTemporalDatum", buffer, theUsesTemporalDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TemporalCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TemporalCRSType that = ((TemporalCRSType) object);
        {
            TemporalCSRefType lhsUsesTemporalCS;
            lhsUsesTemporalCS = this.getUsesTemporalCS();
            TemporalCSRefType rhsUsesTemporalCS;
            rhsUsesTemporalCS = that.getUsesTemporalCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesTemporalCS", lhsUsesTemporalCS), LocatorUtils.property(thatLocator, "usesTemporalCS", rhsUsesTemporalCS), lhsUsesTemporalCS, rhsUsesTemporalCS)) {
                return false;
            }
        }
        {
            TemporalDatumRefType lhsUsesTemporalDatum;
            lhsUsesTemporalDatum = this.getUsesTemporalDatum();
            TemporalDatumRefType rhsUsesTemporalDatum;
            rhsUsesTemporalDatum = that.getUsesTemporalDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesTemporalDatum", lhsUsesTemporalDatum), LocatorUtils.property(thatLocator, "usesTemporalDatum", rhsUsesTemporalDatum), lhsUsesTemporalDatum, rhsUsesTemporalDatum)) {
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
            TemporalCSRefType theUsesTemporalCS;
            theUsesTemporalCS = this.getUsesTemporalCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesTemporalCS", theUsesTemporalCS), currentHashCode, theUsesTemporalCS);
        }
        {
            TemporalDatumRefType theUsesTemporalDatum;
            theUsesTemporalDatum = this.getUsesTemporalDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesTemporalDatum", theUsesTemporalDatum), currentHashCode, theUsesTemporalDatum);
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
        if (draftCopy instanceof TemporalCRSType) {
            final TemporalCRSType copy = ((TemporalCRSType) draftCopy);
            if (this.isSetUsesTemporalCS()) {
                TemporalCSRefType sourceUsesTemporalCS;
                sourceUsesTemporalCS = this.getUsesTemporalCS();
                TemporalCSRefType copyUsesTemporalCS = ((TemporalCSRefType) strategy.copy(LocatorUtils.property(locator, "usesTemporalCS", sourceUsesTemporalCS), sourceUsesTemporalCS));
                copy.setUsesTemporalCS(copyUsesTemporalCS);
            } else {
                copy.usesTemporalCS = null;
            }
            if (this.isSetUsesTemporalDatum()) {
                TemporalDatumRefType sourceUsesTemporalDatum;
                sourceUsesTemporalDatum = this.getUsesTemporalDatum();
                TemporalDatumRefType copyUsesTemporalDatum = ((TemporalDatumRefType) strategy.copy(LocatorUtils.property(locator, "usesTemporalDatum", sourceUsesTemporalDatum), sourceUsesTemporalDatum));
                copy.setUsesTemporalDatum(copyUsesTemporalDatum);
            } else {
                copy.usesTemporalDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TemporalCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TemporalCRSType) {
            final TemporalCRSType target = this;
            final TemporalCRSType leftObject = ((TemporalCRSType) left);
            final TemporalCRSType rightObject = ((TemporalCRSType) right);
            {
                TemporalCSRefType lhsUsesTemporalCS;
                lhsUsesTemporalCS = leftObject.getUsesTemporalCS();
                TemporalCSRefType rhsUsesTemporalCS;
                rhsUsesTemporalCS = rightObject.getUsesTemporalCS();
                target.setUsesTemporalCS(((TemporalCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesTemporalCS", lhsUsesTemporalCS), LocatorUtils.property(rightLocator, "usesTemporalCS", rhsUsesTemporalCS), lhsUsesTemporalCS, rhsUsesTemporalCS)));
            }
            {
                TemporalDatumRefType lhsUsesTemporalDatum;
                lhsUsesTemporalDatum = leftObject.getUsesTemporalDatum();
                TemporalDatumRefType rhsUsesTemporalDatum;
                rhsUsesTemporalDatum = rightObject.getUsesTemporalDatum();
                target.setUsesTemporalDatum(((TemporalDatumRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesTemporalDatum", lhsUsesTemporalDatum), LocatorUtils.property(rightLocator, "usesTemporalDatum", rhsUsesTemporalDatum), lhsUsesTemporalDatum, rhsUsesTemporalDatum)));
            }
        }
    }

}
