//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Tables or arrays of tuples.  
 *         May be used for text-encoding of values from a table.  
 *         Actually just a string, but allows the user to indicate which characters are used as separators.  
 *         The value of the 'cs' attribute is the separator for coordinate values, 
 *         and the value of the 'ts' attribute gives the tuple separator (a single space by default); 
 *         the default values may be changed to reflect local usage.
 *         Defaults to CSV within a tuple, space between tuples.  
 *         However, any string content will be schema-valid.  
 * 
 * <p>Java-Klasse für CoordinatesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoordinatesType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="decimal" type="{http://www.w3.org/2001/XMLSchema}string" default="." />
 *       &lt;attribute name="cs" type="{http://www.w3.org/2001/XMLSchema}string" default="," />
 *       &lt;attribute name="ts" type="{http://www.w3.org/2001/XMLSchema}string" default=" " />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinatesType", propOrder = {
    "value"
})
public class CoordinatesType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "decimal")
    protected String decimal;
    @XmlAttribute(name = "cs")
    protected String cs;
    @XmlAttribute(name = "ts")
    protected String ts;

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

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Ruft den Wert der decimal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimal() {
        if (decimal == null) {
            return ".";
        } else {
            return decimal;
        }
    }

    /**
     * Legt den Wert der decimal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimal(String value) {
        this.decimal = value;
    }

    public boolean isSetDecimal() {
        return (this.decimal!= null);
    }

    /**
     * Ruft den Wert der cs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs() {
        if (cs == null) {
            return ",";
        } else {
            return cs;
        }
    }

    /**
     * Legt den Wert der cs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs(String value) {
        this.cs = value;
    }

    public boolean isSetCs() {
        return (this.cs!= null);
    }

    /**
     * Ruft den Wert der ts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTs() {
        if (ts == null) {
            return " ";
        } else {
            return ts;
        }
    }

    /**
     * Legt den Wert der ts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTs(String value) {
        this.ts = value;
    }

    public boolean isSetTs() {
        return (this.ts!= null);
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
            String theDecimal;
            theDecimal = this.getDecimal();
            strategy.appendField(locator, this, "decimal", buffer, theDecimal);
        }
        {
            String theCs;
            theCs = this.getCs();
            strategy.appendField(locator, this, "cs", buffer, theCs);
        }
        {
            String theTs;
            theTs = this.getTs();
            strategy.appendField(locator, this, "ts", buffer, theTs);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CoordinatesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CoordinatesType that = ((CoordinatesType) object);
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
            String lhsDecimal;
            lhsDecimal = this.getDecimal();
            String rhsDecimal;
            rhsDecimal = that.getDecimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decimal", lhsDecimal), LocatorUtils.property(thatLocator, "decimal", rhsDecimal), lhsDecimal, rhsDecimal)) {
                return false;
            }
        }
        {
            String lhsCs;
            lhsCs = this.getCs();
            String rhsCs;
            rhsCs = that.getCs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cs", lhsCs), LocatorUtils.property(thatLocator, "cs", rhsCs), lhsCs, rhsCs)) {
                return false;
            }
        }
        {
            String lhsTs;
            lhsTs = this.getTs();
            String rhsTs;
            rhsTs = that.getTs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ts", lhsTs), LocatorUtils.property(thatLocator, "ts", rhsTs), lhsTs, rhsTs)) {
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
            String theDecimal;
            theDecimal = this.getDecimal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decimal", theDecimal), currentHashCode, theDecimal);
        }
        {
            String theCs;
            theCs = this.getCs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cs", theCs), currentHashCode, theCs);
        }
        {
            String theTs;
            theTs = this.getTs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ts", theTs), currentHashCode, theTs);
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
        if (draftCopy instanceof CoordinatesType) {
            final CoordinatesType copy = ((CoordinatesType) draftCopy);
            if (this.isSetValue()) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.isSetDecimal()) {
                String sourceDecimal;
                sourceDecimal = this.getDecimal();
                String copyDecimal = ((String) strategy.copy(LocatorUtils.property(locator, "decimal", sourceDecimal), sourceDecimal));
                copy.setDecimal(copyDecimal);
            } else {
                copy.decimal = null;
            }
            if (this.isSetCs()) {
                String sourceCs;
                sourceCs = this.getCs();
                String copyCs = ((String) strategy.copy(LocatorUtils.property(locator, "cs", sourceCs), sourceCs));
                copy.setCs(copyCs);
            } else {
                copy.cs = null;
            }
            if (this.isSetTs()) {
                String sourceTs;
                sourceTs = this.getTs();
                String copyTs = ((String) strategy.copy(LocatorUtils.property(locator, "ts", sourceTs), sourceTs));
                copy.setTs(copyTs);
            } else {
                copy.ts = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CoordinatesType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CoordinatesType) {
            final CoordinatesType target = this;
            final CoordinatesType leftObject = ((CoordinatesType) left);
            final CoordinatesType rightObject = ((CoordinatesType) right);
            {
                String lhsValue;
                lhsValue = leftObject.getValue();
                String rhsValue;
                rhsValue = rightObject.getValue();
                target.setValue(((String) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsDecimal;
                lhsDecimal = leftObject.getDecimal();
                String rhsDecimal;
                rhsDecimal = rightObject.getDecimal();
                target.setDecimal(((String) strategy.merge(LocatorUtils.property(leftLocator, "decimal", lhsDecimal), LocatorUtils.property(rightLocator, "decimal", rhsDecimal), lhsDecimal, rhsDecimal)));
            }
            {
                String lhsCs;
                lhsCs = leftObject.getCs();
                String rhsCs;
                rhsCs = rightObject.getCs();
                target.setCs(((String) strategy.merge(LocatorUtils.property(leftLocator, "cs", lhsCs), LocatorUtils.property(rightLocator, "cs", rhsCs), lhsCs, rhsCs)));
            }
            {
                String lhsTs;
                lhsTs = leftObject.getTs();
                String rhsTs;
                rhsTs = rightObject.getTs();
                target.setTs(((String) strategy.merge(LocatorUtils.property(leftLocator, "ts", lhsTs), LocatorUtils.property(rightLocator, "ts", rhsTs), lhsTs, rhsTs)));
            }
        }
    }

}
