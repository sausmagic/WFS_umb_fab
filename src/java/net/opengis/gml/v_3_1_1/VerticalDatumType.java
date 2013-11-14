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
 * A textual description and/or a set of parameters identifying a particular reference level surface used as a zero-height surface, including its position with respect to the Earth for any of the height types recognized by this standard. There are several types of Vertical Datums, and each may place constraints on the Coordinate Axis with which it is combined to create a Vertical CRS. 
 * 
 * <p>Java-Klasse für VerticalDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VerticalDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}verticalDatumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalDatumType", propOrder = {
    "verticalDatumType"
})
public class VerticalDatumType
    extends AbstractDatumType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected VerticalDatumTypeType verticalDatumType;

    /**
     * Ruft den Wert der verticalDatumType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDatumTypeType }
     *     
     */
    public VerticalDatumTypeType getVerticalDatumType() {
        return verticalDatumType;
    }

    /**
     * Legt den Wert der verticalDatumType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDatumTypeType }
     *     
     */
    public void setVerticalDatumType(VerticalDatumTypeType value) {
        this.verticalDatumType = value;
    }

    public boolean isSetVerticalDatumType() {
        return (this.verticalDatumType!= null);
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
            VerticalDatumTypeType theVerticalDatumType;
            theVerticalDatumType = this.getVerticalDatumType();
            strategy.appendField(locator, this, "verticalDatumType", buffer, theVerticalDatumType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VerticalDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final VerticalDatumType that = ((VerticalDatumType) object);
        {
            VerticalDatumTypeType lhsVerticalDatumType;
            lhsVerticalDatumType = this.getVerticalDatumType();
            VerticalDatumTypeType rhsVerticalDatumType;
            rhsVerticalDatumType = that.getVerticalDatumType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalDatumType", lhsVerticalDatumType), LocatorUtils.property(thatLocator, "verticalDatumType", rhsVerticalDatumType), lhsVerticalDatumType, rhsVerticalDatumType)) {
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
            VerticalDatumTypeType theVerticalDatumType;
            theVerticalDatumType = this.getVerticalDatumType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalDatumType", theVerticalDatumType), currentHashCode, theVerticalDatumType);
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
        if (draftCopy instanceof VerticalDatumType) {
            final VerticalDatumType copy = ((VerticalDatumType) draftCopy);
            if (this.isSetVerticalDatumType()) {
                VerticalDatumTypeType sourceVerticalDatumType;
                sourceVerticalDatumType = this.getVerticalDatumType();
                VerticalDatumTypeType copyVerticalDatumType = ((VerticalDatumTypeType) strategy.copy(LocatorUtils.property(locator, "verticalDatumType", sourceVerticalDatumType), sourceVerticalDatumType));
                copy.setVerticalDatumType(copyVerticalDatumType);
            } else {
                copy.verticalDatumType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VerticalDatumType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof VerticalDatumType) {
            final VerticalDatumType target = this;
            final VerticalDatumType leftObject = ((VerticalDatumType) left);
            final VerticalDatumType rightObject = ((VerticalDatumType) right);
            {
                VerticalDatumTypeType lhsVerticalDatumType;
                lhsVerticalDatumType = leftObject.getVerticalDatumType();
                VerticalDatumTypeType rhsVerticalDatumType;
                rhsVerticalDatumType = rightObject.getVerticalDatumType();
                target.setVerticalDatumType(((VerticalDatumTypeType) strategy.merge(LocatorUtils.property(leftLocator, "verticalDatumType", lhsVerticalDatumType), LocatorUtils.property(rightLocator, "verticalDatumType", rhsVerticalDatumType), lhsVerticalDatumType, rhsVerticalDatumType)));
            }
        }
    }

}
