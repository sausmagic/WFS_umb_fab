//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java-Klasse für ActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="locator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionType", propOrder = {
    "message"
})
public class ActionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Message")
    protected String message;
    @XmlAttribute(name = "locator", required = true)
    protected String locator;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der locator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Legt den Wert der locator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        {
            String theLocator;
            theLocator = this.getLocator();
            strategy.appendField(locator, this, "locator", buffer, theLocator);
        }
        {
            String theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ActionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ActionType that = ((ActionType) object);
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
                return false;
            }
        }
        {
            String lhsLocator;
            lhsLocator = this.getLocator();
            String rhsLocator;
            rhsLocator = that.getLocator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locator", lhsLocator), LocatorUtils.property(thatLocator, "locator", rhsLocator), lhsLocator, rhsLocator)) {
                return false;
            }
        }
        {
            String lhsCode;
            lhsCode = this.getCode();
            String rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
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
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
        }
        {
            String theLocator;
            theLocator = this.getLocator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locator", theLocator), currentHashCode, theLocator);
        }
        {
            String theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
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
        if (draftCopy instanceof ActionType) {
            final ActionType copy = ((ActionType) draftCopy);
            if (this.message!= null) {
                String sourceMessage;
                sourceMessage = this.getMessage();
                String copyMessage = ((String) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage));
                copy.setMessage(copyMessage);
            } else {
                copy.message = null;
            }
            if (this.locator!= null) {
                String sourceLocator;
                sourceLocator = this.getLocator();
                String copyLocator = ((String) strategy.copy(LocatorUtils.property(locator, "locator", sourceLocator), sourceLocator));
                copy.setLocator(copyLocator);
            } else {
                copy.locator = null;
            }
            if (this.code!= null) {
                String sourceCode;
                sourceCode = this.getCode();
                String copyCode = ((String) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
                copy.setCode(copyCode);
            } else {
                copy.code = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ActionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof ActionType) {
            final ActionType target = this;
            final ActionType leftObject = ((ActionType) left);
            final ActionType rightObject = ((ActionType) right);
            {
                String lhsMessage;
                lhsMessage = leftObject.getMessage();
                String rhsMessage;
                rhsMessage = rightObject.getMessage();
                target.setMessage(((String) strategy.merge(LocatorUtils.property(leftLocator, "message", lhsMessage), LocatorUtils.property(rightLocator, "message", rhsMessage), lhsMessage, rhsMessage)));
            }
            {
                String lhsLocator;
                lhsLocator = leftObject.getLocator();
                String rhsLocator;
                rhsLocator = rightObject.getLocator();
                target.setLocator(((String) strategy.merge(LocatorUtils.property(leftLocator, "locator", lhsLocator), LocatorUtils.property(rightLocator, "locator", rhsLocator), lhsLocator, rhsLocator)));
            }
            {
                String lhsCode;
                lhsCode = leftObject.getCode();
                String rhsCode;
                rhsCode = rightObject.getCode();
                target.setCode(((String) strategy.merge(LocatorUtils.property(leftLocator, "code", lhsCode), LocatorUtils.property(rightLocator, "code", rhsCode), lhsCode, rhsCode)));
            }
        }
    }

}
