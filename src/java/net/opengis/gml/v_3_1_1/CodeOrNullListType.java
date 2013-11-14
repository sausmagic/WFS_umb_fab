//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * List of values on a uniform nominal scale.  List of text tokens.   
 *       In a list context a token should not include any spaces, so xsd:Name is used instead of xsd:string.  
 *       A member of the list may be a typed null.  
 *       If a codeSpace attribute is present, then its value is a reference to 
 *       a Reference System for the value, a dictionary or code list.
 * 
 * <p>Java-Klasse für CodeOrNullListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CodeOrNullListType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>NameOrNullList">
 *       &lt;attribute name="codeSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeOrNullListType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CategoryExtentType.class
})
public class CodeOrNullListType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected List<String> value;
    @XmlAttribute(name = "codeSpace")
    @XmlSchemaType(name = "anyURI")
    protected String codeSpace;

    /**
     * XML List based on the union type defined above.  An element declared with this type contains a space-separated list of Name values with null values interspersed as needed Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
    }

    /**
     * Ruft den Wert der codeSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSpace() {
        return codeSpace;
    }

    /**
     * Legt den Wert der codeSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSpace(String value) {
        this.codeSpace = value;
    }

    public boolean isSetCodeSpace() {
        return (this.codeSpace!= null);
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
            List<String> theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theCodeSpace;
            theCodeSpace = this.getCodeSpace();
            strategy.appendField(locator, this, "codeSpace", buffer, theCodeSpace);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CodeOrNullListType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CodeOrNullListType that = ((CodeOrNullListType) object);
        {
            List<String> lhsValue;
            lhsValue = this.getValue();
            List<String> rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsCodeSpace;
            lhsCodeSpace = this.getCodeSpace();
            String rhsCodeSpace;
            rhsCodeSpace = that.getCodeSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeSpace", lhsCodeSpace), LocatorUtils.property(thatLocator, "codeSpace", rhsCodeSpace), lhsCodeSpace, rhsCodeSpace)) {
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
            List<String> theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theCodeSpace;
            theCodeSpace = this.getCodeSpace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeSpace", theCodeSpace), currentHashCode, theCodeSpace);
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
        if (draftCopy instanceof CodeOrNullListType) {
            final CodeOrNullListType copy = ((CodeOrNullListType) draftCopy);
            if (this.isSetValue()) {
                List<String> sourceValue;
                sourceValue = this.getValue();
                @SuppressWarnings("unchecked")
                List<String> copyValue = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.unsetValue();
                List<String> uniqueValuel = copy.getValue();
                uniqueValuel.addAll(copyValue);
            } else {
                copy.unsetValue();
            }
            if (this.isSetCodeSpace()) {
                String sourceCodeSpace;
                sourceCodeSpace = this.getCodeSpace();
                String copyCodeSpace = ((String) strategy.copy(LocatorUtils.property(locator, "codeSpace", sourceCodeSpace), sourceCodeSpace));
                copy.setCodeSpace(copyCodeSpace);
            } else {
                copy.codeSpace = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CodeOrNullListType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CodeOrNullListType) {
            final CodeOrNullListType target = this;
            final CodeOrNullListType leftObject = ((CodeOrNullListType) left);
            final CodeOrNullListType rightObject = ((CodeOrNullListType) right);
            {
                List<String> lhsValue;
                lhsValue = leftObject.getValue();
                List<String> rhsValue;
                rhsValue = rightObject.getValue();
                target.unsetValue();
                List<String> uniqueValuel = target.getValue();
                uniqueValuel.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsCodeSpace;
                lhsCodeSpace = leftObject.getCodeSpace();
                String rhsCodeSpace;
                rhsCodeSpace = rightObject.getCodeSpace();
                target.setCodeSpace(((String) strategy.merge(LocatorUtils.property(leftLocator, "codeSpace", lhsCodeSpace), LocatorUtils.property(rightLocator, "codeSpace", rhsCodeSpace), lhsCodeSpace, rhsCodeSpace)));
            }
        }
    }

    public void setValue(List<String> value) {
        List<String> draftl = this.getValue();
        draftl.addAll(value);
    }

}
