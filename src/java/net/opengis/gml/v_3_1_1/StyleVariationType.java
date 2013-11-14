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
 * Used to vary individual graphic parameters and attributes of the style, symbol or text.
 * 
 * <p>Java-Klasse für StyleVariationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StyleVariationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="styleProperty" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="featurePropertyRange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleVariationType", propOrder = {
    "value"
})
public class StyleVariationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "styleProperty", required = true)
    protected String styleProperty;
    @XmlAttribute(name = "featurePropertyRange")
    protected String featurePropertyRange;

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
     * Ruft den Wert der styleProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleProperty() {
        return styleProperty;
    }

    /**
     * Legt den Wert der styleProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleProperty(String value) {
        this.styleProperty = value;
    }

    public boolean isSetStyleProperty() {
        return (this.styleProperty!= null);
    }

    /**
     * Ruft den Wert der featurePropertyRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturePropertyRange() {
        return featurePropertyRange;
    }

    /**
     * Legt den Wert der featurePropertyRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturePropertyRange(String value) {
        this.featurePropertyRange = value;
    }

    public boolean isSetFeaturePropertyRange() {
        return (this.featurePropertyRange!= null);
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
            String theStyleProperty;
            theStyleProperty = this.getStyleProperty();
            strategy.appendField(locator, this, "styleProperty", buffer, theStyleProperty);
        }
        {
            String theFeaturePropertyRange;
            theFeaturePropertyRange = this.getFeaturePropertyRange();
            strategy.appendField(locator, this, "featurePropertyRange", buffer, theFeaturePropertyRange);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StyleVariationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StyleVariationType that = ((StyleVariationType) object);
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
            String lhsStyleProperty;
            lhsStyleProperty = this.getStyleProperty();
            String rhsStyleProperty;
            rhsStyleProperty = that.getStyleProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "styleProperty", lhsStyleProperty), LocatorUtils.property(thatLocator, "styleProperty", rhsStyleProperty), lhsStyleProperty, rhsStyleProperty)) {
                return false;
            }
        }
        {
            String lhsFeaturePropertyRange;
            lhsFeaturePropertyRange = this.getFeaturePropertyRange();
            String rhsFeaturePropertyRange;
            rhsFeaturePropertyRange = that.getFeaturePropertyRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featurePropertyRange", lhsFeaturePropertyRange), LocatorUtils.property(thatLocator, "featurePropertyRange", rhsFeaturePropertyRange), lhsFeaturePropertyRange, rhsFeaturePropertyRange)) {
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
            String theStyleProperty;
            theStyleProperty = this.getStyleProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "styleProperty", theStyleProperty), currentHashCode, theStyleProperty);
        }
        {
            String theFeaturePropertyRange;
            theFeaturePropertyRange = this.getFeaturePropertyRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featurePropertyRange", theFeaturePropertyRange), currentHashCode, theFeaturePropertyRange);
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
        if (draftCopy instanceof StyleVariationType) {
            final StyleVariationType copy = ((StyleVariationType) draftCopy);
            if (this.isSetValue()) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.isSetStyleProperty()) {
                String sourceStyleProperty;
                sourceStyleProperty = this.getStyleProperty();
                String copyStyleProperty = ((String) strategy.copy(LocatorUtils.property(locator, "styleProperty", sourceStyleProperty), sourceStyleProperty));
                copy.setStyleProperty(copyStyleProperty);
            } else {
                copy.styleProperty = null;
            }
            if (this.isSetFeaturePropertyRange()) {
                String sourceFeaturePropertyRange;
                sourceFeaturePropertyRange = this.getFeaturePropertyRange();
                String copyFeaturePropertyRange = ((String) strategy.copy(LocatorUtils.property(locator, "featurePropertyRange", sourceFeaturePropertyRange), sourceFeaturePropertyRange));
                copy.setFeaturePropertyRange(copyFeaturePropertyRange);
            } else {
                copy.featurePropertyRange = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StyleVariationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof StyleVariationType) {
            final StyleVariationType target = this;
            final StyleVariationType leftObject = ((StyleVariationType) left);
            final StyleVariationType rightObject = ((StyleVariationType) right);
            {
                String lhsValue;
                lhsValue = leftObject.getValue();
                String rhsValue;
                rhsValue = rightObject.getValue();
                target.setValue(((String) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsStyleProperty;
                lhsStyleProperty = leftObject.getStyleProperty();
                String rhsStyleProperty;
                rhsStyleProperty = rightObject.getStyleProperty();
                target.setStyleProperty(((String) strategy.merge(LocatorUtils.property(leftLocator, "styleProperty", lhsStyleProperty), LocatorUtils.property(rightLocator, "styleProperty", rhsStyleProperty), lhsStyleProperty, rhsStyleProperty)));
            }
            {
                String lhsFeaturePropertyRange;
                lhsFeaturePropertyRange = leftObject.getFeaturePropertyRange();
                String rhsFeaturePropertyRange;
                rhsFeaturePropertyRange = rightObject.getFeaturePropertyRange();
                target.setFeaturePropertyRange(((String) strategy.merge(LocatorUtils.property(leftLocator, "featurePropertyRange", lhsFeaturePropertyRange), LocatorUtils.property(rightLocator, "featurePropertyRange", rhsFeaturePropertyRange), lhsFeaturePropertyRange, rhsFeaturePropertyRange)));
            }
        }
    }

}
