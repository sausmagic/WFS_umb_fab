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
 * [complexType of] The style descriptor for geometries of a feature.
 * 
 * <p>Java-Klasse für GeometryStyleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeometryStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}symbol"/>
 *           &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geometryProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geometryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryStyleType", propOrder = {
    "symbol",
    "style",
    "labelStyle"
})
public class GeometryStyleType
    extends BaseStyleDescriptorType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected SymbolType symbol;
    protected String style;
    protected LabelStylePropertyType labelStyle;
    @XmlAttribute(name = "geometryProperty")
    protected String geometryProperty;
    @XmlAttribute(name = "geometryType")
    protected String geometryType;

    /**
     * Ruft den Wert der symbol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getSymbol() {
        return symbol;
    }

    /**
     * Legt den Wert der symbol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setSymbol(SymbolType value) {
        this.symbol = value;
    }

    public boolean isSetSymbol() {
        return (this.symbol!= null);
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    public boolean isSetStyle() {
        return (this.style!= null);
    }

    /**
     * Ruft den Wert der labelStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabelStylePropertyType }
     *     
     */
    public LabelStylePropertyType getLabelStyle() {
        return labelStyle;
    }

    /**
     * Legt den Wert der labelStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStylePropertyType }
     *     
     */
    public void setLabelStyle(LabelStylePropertyType value) {
        this.labelStyle = value;
    }

    public boolean isSetLabelStyle() {
        return (this.labelStyle!= null);
    }

    /**
     * Ruft den Wert der geometryProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryProperty() {
        return geometryProperty;
    }

    /**
     * Legt den Wert der geometryProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryProperty(String value) {
        this.geometryProperty = value;
    }

    public boolean isSetGeometryProperty() {
        return (this.geometryProperty!= null);
    }

    /**
     * Ruft den Wert der geometryType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryType() {
        return geometryType;
    }

    /**
     * Legt den Wert der geometryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryType(String value) {
        this.geometryType = value;
    }

    public boolean isSetGeometryType() {
        return (this.geometryType!= null);
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
            SymbolType theSymbol;
            theSymbol = this.getSymbol();
            strategy.appendField(locator, this, "symbol", buffer, theSymbol);
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            strategy.appendField(locator, this, "style", buffer, theStyle);
        }
        {
            LabelStylePropertyType theLabelStyle;
            theLabelStyle = this.getLabelStyle();
            strategy.appendField(locator, this, "labelStyle", buffer, theLabelStyle);
        }
        {
            String theGeometryProperty;
            theGeometryProperty = this.getGeometryProperty();
            strategy.appendField(locator, this, "geometryProperty", buffer, theGeometryProperty);
        }
        {
            String theGeometryType;
            theGeometryType = this.getGeometryType();
            strategy.appendField(locator, this, "geometryType", buffer, theGeometryType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeometryStyleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GeometryStyleType that = ((GeometryStyleType) object);
        {
            SymbolType lhsSymbol;
            lhsSymbol = this.getSymbol();
            SymbolType rhsSymbol;
            rhsSymbol = that.getSymbol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "symbol", lhsSymbol), LocatorUtils.property(thatLocator, "symbol", rhsSymbol), lhsSymbol, rhsSymbol)) {
                return false;
            }
        }
        {
            String lhsStyle;
            lhsStyle = this.getStyle();
            String rhsStyle;
            rhsStyle = that.getStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsStyle), LocatorUtils.property(thatLocator, "style", rhsStyle), lhsStyle, rhsStyle)) {
                return false;
            }
        }
        {
            LabelStylePropertyType lhsLabelStyle;
            lhsLabelStyle = this.getLabelStyle();
            LabelStylePropertyType rhsLabelStyle;
            rhsLabelStyle = that.getLabelStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "labelStyle", lhsLabelStyle), LocatorUtils.property(thatLocator, "labelStyle", rhsLabelStyle), lhsLabelStyle, rhsLabelStyle)) {
                return false;
            }
        }
        {
            String lhsGeometryProperty;
            lhsGeometryProperty = this.getGeometryProperty();
            String rhsGeometryProperty;
            rhsGeometryProperty = that.getGeometryProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometryProperty", lhsGeometryProperty), LocatorUtils.property(thatLocator, "geometryProperty", rhsGeometryProperty), lhsGeometryProperty, rhsGeometryProperty)) {
                return false;
            }
        }
        {
            String lhsGeometryType;
            lhsGeometryType = this.getGeometryType();
            String rhsGeometryType;
            rhsGeometryType = that.getGeometryType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometryType", lhsGeometryType), LocatorUtils.property(thatLocator, "geometryType", rhsGeometryType), lhsGeometryType, rhsGeometryType)) {
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
            SymbolType theSymbol;
            theSymbol = this.getSymbol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "symbol", theSymbol), currentHashCode, theSymbol);
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "style", theStyle), currentHashCode, theStyle);
        }
        {
            LabelStylePropertyType theLabelStyle;
            theLabelStyle = this.getLabelStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelStyle", theLabelStyle), currentHashCode, theLabelStyle);
        }
        {
            String theGeometryProperty;
            theGeometryProperty = this.getGeometryProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometryProperty", theGeometryProperty), currentHashCode, theGeometryProperty);
        }
        {
            String theGeometryType;
            theGeometryType = this.getGeometryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometryType", theGeometryType), currentHashCode, theGeometryType);
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
        if (draftCopy instanceof GeometryStyleType) {
            final GeometryStyleType copy = ((GeometryStyleType) draftCopy);
            if (this.isSetSymbol()) {
                SymbolType sourceSymbol;
                sourceSymbol = this.getSymbol();
                SymbolType copySymbol = ((SymbolType) strategy.copy(LocatorUtils.property(locator, "symbol", sourceSymbol), sourceSymbol));
                copy.setSymbol(copySymbol);
            } else {
                copy.symbol = null;
            }
            if (this.isSetStyle()) {
                String sourceStyle;
                sourceStyle = this.getStyle();
                String copyStyle = ((String) strategy.copy(LocatorUtils.property(locator, "style", sourceStyle), sourceStyle));
                copy.setStyle(copyStyle);
            } else {
                copy.style = null;
            }
            if (this.isSetLabelStyle()) {
                LabelStylePropertyType sourceLabelStyle;
                sourceLabelStyle = this.getLabelStyle();
                LabelStylePropertyType copyLabelStyle = ((LabelStylePropertyType) strategy.copy(LocatorUtils.property(locator, "labelStyle", sourceLabelStyle), sourceLabelStyle));
                copy.setLabelStyle(copyLabelStyle);
            } else {
                copy.labelStyle = null;
            }
            if (this.isSetGeometryProperty()) {
                String sourceGeometryProperty;
                sourceGeometryProperty = this.getGeometryProperty();
                String copyGeometryProperty = ((String) strategy.copy(LocatorUtils.property(locator, "geometryProperty", sourceGeometryProperty), sourceGeometryProperty));
                copy.setGeometryProperty(copyGeometryProperty);
            } else {
                copy.geometryProperty = null;
            }
            if (this.isSetGeometryType()) {
                String sourceGeometryType;
                sourceGeometryType = this.getGeometryType();
                String copyGeometryType = ((String) strategy.copy(LocatorUtils.property(locator, "geometryType", sourceGeometryType), sourceGeometryType));
                copy.setGeometryType(copyGeometryType);
            } else {
                copy.geometryType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeometryStyleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GeometryStyleType) {
            final GeometryStyleType target = this;
            final GeometryStyleType leftObject = ((GeometryStyleType) left);
            final GeometryStyleType rightObject = ((GeometryStyleType) right);
            {
                SymbolType lhsSymbol;
                lhsSymbol = leftObject.getSymbol();
                SymbolType rhsSymbol;
                rhsSymbol = rightObject.getSymbol();
                target.setSymbol(((SymbolType) strategy.merge(LocatorUtils.property(leftLocator, "symbol", lhsSymbol), LocatorUtils.property(rightLocator, "symbol", rhsSymbol), lhsSymbol, rhsSymbol)));
            }
            {
                String lhsStyle;
                lhsStyle = leftObject.getStyle();
                String rhsStyle;
                rhsStyle = rightObject.getStyle();
                target.setStyle(((String) strategy.merge(LocatorUtils.property(leftLocator, "style", lhsStyle), LocatorUtils.property(rightLocator, "style", rhsStyle), lhsStyle, rhsStyle)));
            }
            {
                LabelStylePropertyType lhsLabelStyle;
                lhsLabelStyle = leftObject.getLabelStyle();
                LabelStylePropertyType rhsLabelStyle;
                rhsLabelStyle = rightObject.getLabelStyle();
                target.setLabelStyle(((LabelStylePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "labelStyle", lhsLabelStyle), LocatorUtils.property(rightLocator, "labelStyle", rhsLabelStyle), lhsLabelStyle, rhsLabelStyle)));
            }
            {
                String lhsGeometryProperty;
                lhsGeometryProperty = leftObject.getGeometryProperty();
                String rhsGeometryProperty;
                rhsGeometryProperty = rightObject.getGeometryProperty();
                target.setGeometryProperty(((String) strategy.merge(LocatorUtils.property(leftLocator, "geometryProperty", lhsGeometryProperty), LocatorUtils.property(rightLocator, "geometryProperty", rhsGeometryProperty), lhsGeometryProperty, rhsGeometryProperty)));
            }
            {
                String lhsGeometryType;
                lhsGeometryType = leftObject.getGeometryType();
                String rhsGeometryType;
                rhsGeometryType = rightObject.getGeometryType();
                target.setGeometryType(((String) strategy.merge(LocatorUtils.property(leftLocator, "geometryType", lhsGeometryType), LocatorUtils.property(rightLocator, "geometryType", rhsGeometryType), lhsGeometryType, rhsGeometryType)));
            }
        }
    }

}
