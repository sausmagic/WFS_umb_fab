//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="traverseXlinkDepth" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="traverseXlinkExpiry" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "XlinkPropertyName")
public class XlinkPropertyName implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "traverseXlinkDepth", required = true)
    protected String traverseXlinkDepth;
    @XmlAttribute(name = "traverseXlinkExpiry")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger traverseXlinkExpiry;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der traverseXlinkDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraverseXlinkDepth() {
        return traverseXlinkDepth;
    }

    /**
     * Legt den Wert der traverseXlinkDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraverseXlinkDepth(String value) {
        this.traverseXlinkDepth = value;
    }

    /**
     * Ruft den Wert der traverseXlinkExpiry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTraverseXlinkExpiry() {
        return traverseXlinkExpiry;
    }

    /**
     * Legt den Wert der traverseXlinkExpiry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTraverseXlinkExpiry(BigInteger value) {
        this.traverseXlinkExpiry = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theTraverseXlinkDepth;
            theTraverseXlinkDepth = this.getTraverseXlinkDepth();
            strategy.appendField(locator, this, "traverseXlinkDepth", buffer, theTraverseXlinkDepth);
        }
        {
            BigInteger theTraverseXlinkExpiry;
            theTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
            strategy.appendField(locator, this, "traverseXlinkExpiry", buffer, theTraverseXlinkExpiry);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof XlinkPropertyName)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final XlinkPropertyName that = ((XlinkPropertyName) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsTraverseXlinkDepth;
            lhsTraverseXlinkDepth = this.getTraverseXlinkDepth();
            String rhsTraverseXlinkDepth;
            rhsTraverseXlinkDepth = that.getTraverseXlinkDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traverseXlinkDepth", lhsTraverseXlinkDepth), LocatorUtils.property(thatLocator, "traverseXlinkDepth", rhsTraverseXlinkDepth), lhsTraverseXlinkDepth, rhsTraverseXlinkDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsTraverseXlinkExpiry;
            lhsTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
            BigInteger rhsTraverseXlinkExpiry;
            rhsTraverseXlinkExpiry = that.getTraverseXlinkExpiry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traverseXlinkExpiry", lhsTraverseXlinkExpiry), LocatorUtils.property(thatLocator, "traverseXlinkExpiry", rhsTraverseXlinkExpiry), lhsTraverseXlinkExpiry, rhsTraverseXlinkExpiry)) {
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
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theTraverseXlinkDepth;
            theTraverseXlinkDepth = this.getTraverseXlinkDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traverseXlinkDepth", theTraverseXlinkDepth), currentHashCode, theTraverseXlinkDepth);
        }
        {
            BigInteger theTraverseXlinkExpiry;
            theTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traverseXlinkExpiry", theTraverseXlinkExpiry), currentHashCode, theTraverseXlinkExpiry);
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
        if (draftCopy instanceof XlinkPropertyName) {
            final XlinkPropertyName copy = ((XlinkPropertyName) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.traverseXlinkDepth!= null) {
                String sourceTraverseXlinkDepth;
                sourceTraverseXlinkDepth = this.getTraverseXlinkDepth();
                String copyTraverseXlinkDepth = ((String) strategy.copy(LocatorUtils.property(locator, "traverseXlinkDepth", sourceTraverseXlinkDepth), sourceTraverseXlinkDepth));
                copy.setTraverseXlinkDepth(copyTraverseXlinkDepth);
            } else {
                copy.traverseXlinkDepth = null;
            }
            if (this.traverseXlinkExpiry!= null) {
                BigInteger sourceTraverseXlinkExpiry;
                sourceTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
                BigInteger copyTraverseXlinkExpiry = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "traverseXlinkExpiry", sourceTraverseXlinkExpiry), sourceTraverseXlinkExpiry));
                copy.setTraverseXlinkExpiry(copyTraverseXlinkExpiry);
            } else {
                copy.traverseXlinkExpiry = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new XlinkPropertyName();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof XlinkPropertyName) {
            final XlinkPropertyName target = this;
            final XlinkPropertyName leftObject = ((XlinkPropertyName) left);
            final XlinkPropertyName rightObject = ((XlinkPropertyName) right);
            {
                String lhsValue;
                lhsValue = leftObject.getValue();
                String rhsValue;
                rhsValue = rightObject.getValue();
                target.setValue(((String) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsTraverseXlinkDepth;
                lhsTraverseXlinkDepth = leftObject.getTraverseXlinkDepth();
                String rhsTraverseXlinkDepth;
                rhsTraverseXlinkDepth = rightObject.getTraverseXlinkDepth();
                target.setTraverseXlinkDepth(((String) strategy.merge(LocatorUtils.property(leftLocator, "traverseXlinkDepth", lhsTraverseXlinkDepth), LocatorUtils.property(rightLocator, "traverseXlinkDepth", rhsTraverseXlinkDepth), lhsTraverseXlinkDepth, rhsTraverseXlinkDepth)));
            }
            {
                BigInteger lhsTraverseXlinkExpiry;
                lhsTraverseXlinkExpiry = leftObject.getTraverseXlinkExpiry();
                BigInteger rhsTraverseXlinkExpiry;
                rhsTraverseXlinkExpiry = rightObject.getTraverseXlinkExpiry();
                target.setTraverseXlinkExpiry(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "traverseXlinkExpiry", lhsTraverseXlinkExpiry), LocatorUtils.property(rightLocator, "traverseXlinkExpiry", rhsTraverseXlinkExpiry), lhsTraverseXlinkExpiry, rhsTraverseXlinkExpiry)));
            }
        }
    }

}
