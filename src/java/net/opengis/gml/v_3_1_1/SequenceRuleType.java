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
 * <p>Java-Klasse für SequenceRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SequenceRuleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>SequenceRuleNames">
 *       &lt;attribute name="order" type="{http://www.opengis.net/gml}IncrementOrder" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRuleType", propOrder = {
    "value"
})
public class SequenceRuleType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected SequenceRuleNames value;
    @XmlAttribute(name = "order")
    protected IncrementOrder order;

    /**
     * List of codes (adopted from ISO 19123 Annex C) that identifies the rule for traversing a grid to correspond with the sequence of members of the rangeSet.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleNames }
     *     
     */
    public SequenceRuleNames getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleNames }
     *     
     */
    public void setValue(SequenceRuleNames value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IncrementOrder }
     *     
     */
    public IncrementOrder getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IncrementOrder }
     *     
     */
    public void setOrder(IncrementOrder value) {
        this.order = value;
    }

    public boolean isSetOrder() {
        return (this.order!= null);
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
            SequenceRuleNames theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            IncrementOrder theOrder;
            theOrder = this.getOrder();
            strategy.appendField(locator, this, "order", buffer, theOrder);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SequenceRuleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SequenceRuleType that = ((SequenceRuleType) object);
        {
            SequenceRuleNames lhsValue;
            lhsValue = this.getValue();
            SequenceRuleNames rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            IncrementOrder lhsOrder;
            lhsOrder = this.getOrder();
            IncrementOrder rhsOrder;
            rhsOrder = that.getOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "order", lhsOrder), LocatorUtils.property(thatLocator, "order", rhsOrder), lhsOrder, rhsOrder)) {
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
            SequenceRuleNames theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            IncrementOrder theOrder;
            theOrder = this.getOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "order", theOrder), currentHashCode, theOrder);
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
        if (draftCopy instanceof SequenceRuleType) {
            final SequenceRuleType copy = ((SequenceRuleType) draftCopy);
            if (this.isSetValue()) {
                SequenceRuleNames sourceValue;
                sourceValue = this.getValue();
                SequenceRuleNames copyValue = ((SequenceRuleNames) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.isSetOrder()) {
                IncrementOrder sourceOrder;
                sourceOrder = this.getOrder();
                IncrementOrder copyOrder = ((IncrementOrder) strategy.copy(LocatorUtils.property(locator, "order", sourceOrder), sourceOrder));
                copy.setOrder(copyOrder);
            } else {
                copy.order = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SequenceRuleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SequenceRuleType) {
            final SequenceRuleType target = this;
            final SequenceRuleType leftObject = ((SequenceRuleType) left);
            final SequenceRuleType rightObject = ((SequenceRuleType) right);
            {
                SequenceRuleNames lhsValue;
                lhsValue = leftObject.getValue();
                SequenceRuleNames rhsValue;
                rhsValue = rightObject.getValue();
                target.setValue(((SequenceRuleNames) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                IncrementOrder lhsOrder;
                lhsOrder = leftObject.getOrder();
                IncrementOrder rhsOrder;
                rhsOrder = rightObject.getOrder();
                target.setOrder(((IncrementOrder) strategy.merge(LocatorUtils.property(leftLocator, "order", lhsOrder), LocatorUtils.property(rightLocator, "order", rhsOrder), lhsOrder, rhsOrder)));
            }
        }
    }

}
