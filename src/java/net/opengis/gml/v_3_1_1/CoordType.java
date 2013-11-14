//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.math.BigDecimal;
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
 * Represents a coordinate tuple in one, two, or three dimensions. Deprecated with GML 3.0 and replaced by 
 * 			DirectPositionType.
 * 
 * <p>Java-Klasse für CoordType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordType", propOrder = {
    "x",
    "y",
    "z"
})
public class CoordType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "X", required = true)
    protected BigDecimal x;
    @XmlElement(name = "Y")
    protected BigDecimal y;
    @XmlElement(name = "Z")
    protected BigDecimal z;

    /**
     * Ruft den Wert der x-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * Legt den Wert der x-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setX(BigDecimal value) {
        this.x = value;
    }

    public boolean isSetX() {
        return (this.x!= null);
    }

    /**
     * Ruft den Wert der y-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * Legt den Wert der y-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setY(BigDecimal value) {
        this.y = value;
    }

    public boolean isSetY() {
        return (this.y!= null);
    }

    /**
     * Ruft den Wert der z-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZ() {
        return z;
    }

    /**
     * Legt den Wert der z-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZ(BigDecimal value) {
        this.z = value;
    }

    public boolean isSetZ() {
        return (this.z!= null);
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
            BigDecimal theX;
            theX = this.getX();
            strategy.appendField(locator, this, "x", buffer, theX);
        }
        {
            BigDecimal theY;
            theY = this.getY();
            strategy.appendField(locator, this, "y", buffer, theY);
        }
        {
            BigDecimal theZ;
            theZ = this.getZ();
            strategy.appendField(locator, this, "z", buffer, theZ);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CoordType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CoordType that = ((CoordType) object);
        {
            BigDecimal lhsX;
            lhsX = this.getX();
            BigDecimal rhsX;
            rhsX = that.getX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x", lhsX), LocatorUtils.property(thatLocator, "x", rhsX), lhsX, rhsX)) {
                return false;
            }
        }
        {
            BigDecimal lhsY;
            lhsY = this.getY();
            BigDecimal rhsY;
            rhsY = that.getY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "y", lhsY), LocatorUtils.property(thatLocator, "y", rhsY), lhsY, rhsY)) {
                return false;
            }
        }
        {
            BigDecimal lhsZ;
            lhsZ = this.getZ();
            BigDecimal rhsZ;
            rhsZ = that.getZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "z", lhsZ), LocatorUtils.property(thatLocator, "z", rhsZ), lhsZ, rhsZ)) {
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
            BigDecimal theX;
            theX = this.getX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x", theX), currentHashCode, theX);
        }
        {
            BigDecimal theY;
            theY = this.getY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "y", theY), currentHashCode, theY);
        }
        {
            BigDecimal theZ;
            theZ = this.getZ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "z", theZ), currentHashCode, theZ);
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
        if (draftCopy instanceof CoordType) {
            final CoordType copy = ((CoordType) draftCopy);
            if (this.isSetX()) {
                BigDecimal sourceX;
                sourceX = this.getX();
                BigDecimal copyX = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "x", sourceX), sourceX));
                copy.setX(copyX);
            } else {
                copy.x = null;
            }
            if (this.isSetY()) {
                BigDecimal sourceY;
                sourceY = this.getY();
                BigDecimal copyY = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "y", sourceY), sourceY));
                copy.setY(copyY);
            } else {
                copy.y = null;
            }
            if (this.isSetZ()) {
                BigDecimal sourceZ;
                sourceZ = this.getZ();
                BigDecimal copyZ = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "z", sourceZ), sourceZ));
                copy.setZ(copyZ);
            } else {
                copy.z = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CoordType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CoordType) {
            final CoordType target = this;
            final CoordType leftObject = ((CoordType) left);
            final CoordType rightObject = ((CoordType) right);
            {
                BigDecimal lhsX;
                lhsX = leftObject.getX();
                BigDecimal rhsX;
                rhsX = rightObject.getX();
                target.setX(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "x", lhsX), LocatorUtils.property(rightLocator, "x", rhsX), lhsX, rhsX)));
            }
            {
                BigDecimal lhsY;
                lhsY = leftObject.getY();
                BigDecimal rhsY;
                rhsY = rightObject.getY();
                target.setY(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "y", lhsY), LocatorUtils.property(rightLocator, "y", rhsY), lhsY, rhsY)));
            }
            {
                BigDecimal lhsZ;
                lhsZ = leftObject.getZ();
                BigDecimal rhsZ;
                rhsZ = rightObject.getZ();
                target.setZ(((BigDecimal) strategy.merge(LocatorUtils.property(leftLocator, "z", lhsZ), LocatorUtils.property(rightLocator, "z", rhsZ), lhsZ, rhsZ)));
            }
        }
    }

}
