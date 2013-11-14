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
 * <p>Java-Klasse für TopoCurvePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoCurvePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoCurve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoCurvePropertyType", propOrder = {
    "topoCurve"
})
public class TopoCurvePropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "TopoCurve", required = true)
    protected TopoCurveType topoCurve;

    /**
     * Ruft den Wert der topoCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopoCurveType }
     *     
     */
    public TopoCurveType getTopoCurve() {
        return topoCurve;
    }

    /**
     * Legt den Wert der topoCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoCurveType }
     *     
     */
    public void setTopoCurve(TopoCurveType value) {
        this.topoCurve = value;
    }

    public boolean isSetTopoCurve() {
        return (this.topoCurve!= null);
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
            TopoCurveType theTopoCurve;
            theTopoCurve = this.getTopoCurve();
            strategy.appendField(locator, this, "topoCurve", buffer, theTopoCurve);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TopoCurvePropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TopoCurvePropertyType that = ((TopoCurvePropertyType) object);
        {
            TopoCurveType lhsTopoCurve;
            lhsTopoCurve = this.getTopoCurve();
            TopoCurveType rhsTopoCurve;
            rhsTopoCurve = that.getTopoCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topoCurve", lhsTopoCurve), LocatorUtils.property(thatLocator, "topoCurve", rhsTopoCurve), lhsTopoCurve, rhsTopoCurve)) {
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
            TopoCurveType theTopoCurve;
            theTopoCurve = this.getTopoCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topoCurve", theTopoCurve), currentHashCode, theTopoCurve);
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
        if (draftCopy instanceof TopoCurvePropertyType) {
            final TopoCurvePropertyType copy = ((TopoCurvePropertyType) draftCopy);
            if (this.isSetTopoCurve()) {
                TopoCurveType sourceTopoCurve;
                sourceTopoCurve = this.getTopoCurve();
                TopoCurveType copyTopoCurve = ((TopoCurveType) strategy.copy(LocatorUtils.property(locator, "topoCurve", sourceTopoCurve), sourceTopoCurve));
                copy.setTopoCurve(copyTopoCurve);
            } else {
                copy.topoCurve = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TopoCurvePropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof TopoCurvePropertyType) {
            final TopoCurvePropertyType target = this;
            final TopoCurvePropertyType leftObject = ((TopoCurvePropertyType) left);
            final TopoCurvePropertyType rightObject = ((TopoCurvePropertyType) right);
            {
                TopoCurveType lhsTopoCurve;
                lhsTopoCurve = leftObject.getTopoCurve();
                TopoCurveType rhsTopoCurve;
                rhsTopoCurve = rightObject.getTopoCurve();
                target.setTopoCurve(((TopoCurveType) strategy.merge(LocatorUtils.property(leftLocator, "topoCurve", lhsTopoCurve), LocatorUtils.property(rightLocator, "topoCurve", rhsTopoCurve), lhsTopoCurve, rhsTopoCurve)));
            }
        }
    }

}
