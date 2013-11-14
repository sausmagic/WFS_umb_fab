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
 * [complexType of] Predefined concrete value of the top-level property. Encapsulates all other styling information.
 * 
 * <p>Java-Klasse für StyleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}featureStyle" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}graphStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {
    "featureStyle",
    "graphStyle"
})
public class StyleType
    extends AbstractStyleType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<FeatureStylePropertyType> featureStyle;
    protected GraphStylePropertyType graphStyle;

    /**
     * Gets the value of the featureStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureStylePropertyType }
     * 
     * 
     */
    public List<FeatureStylePropertyType> getFeatureStyle() {
        if (featureStyle == null) {
            featureStyle = new ArrayList<FeatureStylePropertyType>();
        }
        return this.featureStyle;
    }

    public boolean isSetFeatureStyle() {
        return ((this.featureStyle!= null)&&(!this.featureStyle.isEmpty()));
    }

    public void unsetFeatureStyle() {
        this.featureStyle = null;
    }

    /**
     * Ruft den Wert der graphStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GraphStylePropertyType }
     *     
     */
    public GraphStylePropertyType getGraphStyle() {
        return graphStyle;
    }

    /**
     * Legt den Wert der graphStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphStylePropertyType }
     *     
     */
    public void setGraphStyle(GraphStylePropertyType value) {
        this.graphStyle = value;
    }

    public boolean isSetGraphStyle() {
        return (this.graphStyle!= null);
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
            List<FeatureStylePropertyType> theFeatureStyle;
            theFeatureStyle = this.getFeatureStyle();
            strategy.appendField(locator, this, "featureStyle", buffer, theFeatureStyle);
        }
        {
            GraphStylePropertyType theGraphStyle;
            theGraphStyle = this.getGraphStyle();
            strategy.appendField(locator, this, "graphStyle", buffer, theGraphStyle);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StyleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StyleType that = ((StyleType) object);
        {
            List<FeatureStylePropertyType> lhsFeatureStyle;
            lhsFeatureStyle = this.getFeatureStyle();
            List<FeatureStylePropertyType> rhsFeatureStyle;
            rhsFeatureStyle = that.getFeatureStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureStyle", lhsFeatureStyle), LocatorUtils.property(thatLocator, "featureStyle", rhsFeatureStyle), lhsFeatureStyle, rhsFeatureStyle)) {
                return false;
            }
        }
        {
            GraphStylePropertyType lhsGraphStyle;
            lhsGraphStyle = this.getGraphStyle();
            GraphStylePropertyType rhsGraphStyle;
            rhsGraphStyle = that.getGraphStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "graphStyle", lhsGraphStyle), LocatorUtils.property(thatLocator, "graphStyle", rhsGraphStyle), lhsGraphStyle, rhsGraphStyle)) {
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
            List<FeatureStylePropertyType> theFeatureStyle;
            theFeatureStyle = this.getFeatureStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureStyle", theFeatureStyle), currentHashCode, theFeatureStyle);
        }
        {
            GraphStylePropertyType theGraphStyle;
            theGraphStyle = this.getGraphStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "graphStyle", theGraphStyle), currentHashCode, theGraphStyle);
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
        if (draftCopy instanceof StyleType) {
            final StyleType copy = ((StyleType) draftCopy);
            if (this.isSetFeatureStyle()) {
                List<FeatureStylePropertyType> sourceFeatureStyle;
                sourceFeatureStyle = this.getFeatureStyle();
                @SuppressWarnings("unchecked")
                List<FeatureStylePropertyType> copyFeatureStyle = ((List<FeatureStylePropertyType> ) strategy.copy(LocatorUtils.property(locator, "featureStyle", sourceFeatureStyle), sourceFeatureStyle));
                copy.unsetFeatureStyle();
                List<FeatureStylePropertyType> uniqueFeatureStylel = copy.getFeatureStyle();
                uniqueFeatureStylel.addAll(copyFeatureStyle);
            } else {
                copy.unsetFeatureStyle();
            }
            if (this.isSetGraphStyle()) {
                GraphStylePropertyType sourceGraphStyle;
                sourceGraphStyle = this.getGraphStyle();
                GraphStylePropertyType copyGraphStyle = ((GraphStylePropertyType) strategy.copy(LocatorUtils.property(locator, "graphStyle", sourceGraphStyle), sourceGraphStyle));
                copy.setGraphStyle(copyGraphStyle);
            } else {
                copy.graphStyle = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StyleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof StyleType) {
            final StyleType target = this;
            final StyleType leftObject = ((StyleType) left);
            final StyleType rightObject = ((StyleType) right);
            {
                List<FeatureStylePropertyType> lhsFeatureStyle;
                lhsFeatureStyle = leftObject.getFeatureStyle();
                List<FeatureStylePropertyType> rhsFeatureStyle;
                rhsFeatureStyle = rightObject.getFeatureStyle();
                target.unsetFeatureStyle();
                List<FeatureStylePropertyType> uniqueFeatureStylel = target.getFeatureStyle();
                uniqueFeatureStylel.addAll(((List<FeatureStylePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "featureStyle", lhsFeatureStyle), LocatorUtils.property(rightLocator, "featureStyle", rhsFeatureStyle), lhsFeatureStyle, rhsFeatureStyle)));
            }
            {
                GraphStylePropertyType lhsGraphStyle;
                lhsGraphStyle = leftObject.getGraphStyle();
                GraphStylePropertyType rhsGraphStyle;
                rhsGraphStyle = rightObject.getGraphStyle();
                target.setGraphStyle(((GraphStylePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "graphStyle", lhsGraphStyle), LocatorUtils.property(rightLocator, "graphStyle", rhsGraphStyle), lhsGraphStyle, rhsGraphStyle)));
            }
        }
    }

    public void setFeatureStyle(List<FeatureStylePropertyType> value) {
        List<FeatureStylePropertyType> draftl = this.getFeatureStyle();
        draftl.addAll(value);
    }

}
