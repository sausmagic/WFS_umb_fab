//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
import org.w3c.dom.Element;


/**
 * GML property which refers to, or contains, a set of homogeneously typed Values.
 * 
 * <p>Java-Klasse für ValueArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValueArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}Value" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueArrayPropertyType", propOrder = {
    "value"
})
public class ValueArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "Category", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "QuantityList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CountList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CompositeValue", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Count", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "BooleanList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CountExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Null", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Boolean", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CategoryList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CategoryExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "Quantity", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "QuantityExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    })
    @XmlAnyElement
    protected List<Object> value;

    /**
     * Gets the value of the value property.
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
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
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
            List<Object> theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValueArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ValueArrayPropertyType that = ((ValueArrayPropertyType) object);
        {
            List<Object> lhsValue;
            lhsValue = this.getValue();
            List<Object> rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            List<Object> theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
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
        if (draftCopy instanceof ValueArrayPropertyType) {
            final ValueArrayPropertyType copy = ((ValueArrayPropertyType) draftCopy);
            if (this.isSetValue()) {
                List<Object> sourceValue;
                sourceValue = this.getValue();
                @SuppressWarnings("unchecked")
                List<Object> copyValue = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.unsetValue();
                List<Object> uniqueValuel = copy.getValue();
                uniqueValuel.addAll(copyValue);
            } else {
                copy.unsetValue();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ValueArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof ValueArrayPropertyType) {
            final ValueArrayPropertyType target = this;
            final ValueArrayPropertyType leftObject = ((ValueArrayPropertyType) left);
            final ValueArrayPropertyType rightObject = ((ValueArrayPropertyType) right);
            {
                List<Object> lhsValue;
                lhsValue = leftObject.getValue();
                List<Object> rhsValue;
                rhsValue = rightObject.getValue();
                target.unsetValue();
                List<Object> uniqueValuel = target.getValue();
                uniqueValuel.addAll(((List<Object> ) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
        }
    }

    public void setValue(List<Object> value) {
        List<Object> draftl = this.getValue();
        draftl.addAll(value);
    }

}
