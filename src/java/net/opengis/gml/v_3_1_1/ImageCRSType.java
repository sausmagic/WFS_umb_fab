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
 * An engineering coordinate reference system applied to locations in images. Image coordinate reference systems are treated as a separate sub-type because a separate user community exists for images with its own terms of reference. 
 * 
 * <p>Java-Klasse für ImageCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml}usesObliqueCartesianCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}usesImageDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
    "usesCartesianCS",
    "usesObliqueCartesianCS",
    "usesImageDatum"
})
public class ImageCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected CartesianCSRefType usesCartesianCS;
    protected ObliqueCartesianCSRefType usesObliqueCartesianCS;
    @XmlElement(required = true)
    protected ImageDatumRefType usesImageDatum;

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
     * Ruft den Wert der usesObliqueCartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObliqueCartesianCSRefType }
     *     
     */
    public ObliqueCartesianCSRefType getUsesObliqueCartesianCS() {
        return usesObliqueCartesianCS;
    }

    /**
     * Legt den Wert der usesObliqueCartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObliqueCartesianCSRefType }
     *     
     */
    public void setUsesObliqueCartesianCS(ObliqueCartesianCSRefType value) {
        this.usesObliqueCartesianCS = value;
    }

    public boolean isSetUsesObliqueCartesianCS() {
        return (this.usesObliqueCartesianCS!= null);
    }

    /**
     * Ruft den Wert der usesImageDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImageDatumRefType }
     *     
     */
    public ImageDatumRefType getUsesImageDatum() {
        return usesImageDatum;
    }

    /**
     * Legt den Wert der usesImageDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDatumRefType }
     *     
     */
    public void setUsesImageDatum(ImageDatumRefType value) {
        this.usesImageDatum = value;
    }

    public boolean isSetUsesImageDatum() {
        return (this.usesImageDatum!= null);
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
            ObliqueCartesianCSRefType theUsesObliqueCartesianCS;
            theUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
            strategy.appendField(locator, this, "usesObliqueCartesianCS", buffer, theUsesObliqueCartesianCS);
        }
        {
            ImageDatumRefType theUsesImageDatum;
            theUsesImageDatum = this.getUsesImageDatum();
            strategy.appendField(locator, this, "usesImageDatum", buffer, theUsesImageDatum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImageCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImageCRSType that = ((ImageCRSType) object);
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
            ObliqueCartesianCSRefType lhsUsesObliqueCartesianCS;
            lhsUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
            ObliqueCartesianCSRefType rhsUsesObliqueCartesianCS;
            rhsUsesObliqueCartesianCS = that.getUsesObliqueCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesObliqueCartesianCS", lhsUsesObliqueCartesianCS), LocatorUtils.property(thatLocator, "usesObliqueCartesianCS", rhsUsesObliqueCartesianCS), lhsUsesObliqueCartesianCS, rhsUsesObliqueCartesianCS)) {
                return false;
            }
        }
        {
            ImageDatumRefType lhsUsesImageDatum;
            lhsUsesImageDatum = this.getUsesImageDatum();
            ImageDatumRefType rhsUsesImageDatum;
            rhsUsesImageDatum = that.getUsesImageDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesImageDatum", lhsUsesImageDatum), LocatorUtils.property(thatLocator, "usesImageDatum", rhsUsesImageDatum), lhsUsesImageDatum, rhsUsesImageDatum)) {
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
            ObliqueCartesianCSRefType theUsesObliqueCartesianCS;
            theUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesObliqueCartesianCS", theUsesObliqueCartesianCS), currentHashCode, theUsesObliqueCartesianCS);
        }
        {
            ImageDatumRefType theUsesImageDatum;
            theUsesImageDatum = this.getUsesImageDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesImageDatum", theUsesImageDatum), currentHashCode, theUsesImageDatum);
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
        if (draftCopy instanceof ImageCRSType) {
            final ImageCRSType copy = ((ImageCRSType) draftCopy);
            if (this.isSetUsesCartesianCS()) {
                CartesianCSRefType sourceUsesCartesianCS;
                sourceUsesCartesianCS = this.getUsesCartesianCS();
                CartesianCSRefType copyUsesCartesianCS = ((CartesianCSRefType) strategy.copy(LocatorUtils.property(locator, "usesCartesianCS", sourceUsesCartesianCS), sourceUsesCartesianCS));
                copy.setUsesCartesianCS(copyUsesCartesianCS);
            } else {
                copy.usesCartesianCS = null;
            }
            if (this.isSetUsesObliqueCartesianCS()) {
                ObliqueCartesianCSRefType sourceUsesObliqueCartesianCS;
                sourceUsesObliqueCartesianCS = this.getUsesObliqueCartesianCS();
                ObliqueCartesianCSRefType copyUsesObliqueCartesianCS = ((ObliqueCartesianCSRefType) strategy.copy(LocatorUtils.property(locator, "usesObliqueCartesianCS", sourceUsesObliqueCartesianCS), sourceUsesObliqueCartesianCS));
                copy.setUsesObliqueCartesianCS(copyUsesObliqueCartesianCS);
            } else {
                copy.usesObliqueCartesianCS = null;
            }
            if (this.isSetUsesImageDatum()) {
                ImageDatumRefType sourceUsesImageDatum;
                sourceUsesImageDatum = this.getUsesImageDatum();
                ImageDatumRefType copyUsesImageDatum = ((ImageDatumRefType) strategy.copy(LocatorUtils.property(locator, "usesImageDatum", sourceUsesImageDatum), sourceUsesImageDatum));
                copy.setUsesImageDatum(copyUsesImageDatum);
            } else {
                copy.usesImageDatum = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImageCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ImageCRSType) {
            final ImageCRSType target = this;
            final ImageCRSType leftObject = ((ImageCRSType) left);
            final ImageCRSType rightObject = ((ImageCRSType) right);
            {
                CartesianCSRefType lhsUsesCartesianCS;
                lhsUsesCartesianCS = leftObject.getUsesCartesianCS();
                CartesianCSRefType rhsUsesCartesianCS;
                rhsUsesCartesianCS = rightObject.getUsesCartesianCS();
                target.setUsesCartesianCS(((CartesianCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(rightLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)));
            }
            {
                ObliqueCartesianCSRefType lhsUsesObliqueCartesianCS;
                lhsUsesObliqueCartesianCS = leftObject.getUsesObliqueCartesianCS();
                ObliqueCartesianCSRefType rhsUsesObliqueCartesianCS;
                rhsUsesObliqueCartesianCS = rightObject.getUsesObliqueCartesianCS();
                target.setUsesObliqueCartesianCS(((ObliqueCartesianCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesObliqueCartesianCS", lhsUsesObliqueCartesianCS), LocatorUtils.property(rightLocator, "usesObliqueCartesianCS", rhsUsesObliqueCartesianCS), lhsUsesObliqueCartesianCS, rhsUsesObliqueCartesianCS)));
            }
            {
                ImageDatumRefType lhsUsesImageDatum;
                lhsUsesImageDatum = leftObject.getUsesImageDatum();
                ImageDatumRefType rhsUsesImageDatum;
                rhsUsesImageDatum = rightObject.getUsesImageDatum();
                target.setUsesImageDatum(((ImageDatumRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesImageDatum", lhsUsesImageDatum), LocatorUtils.property(rightLocator, "usesImageDatum", rhsUsesImageDatum), lhsUsesImageDatum, rhsUsesImageDatum)));
            }
        }
    }

}
