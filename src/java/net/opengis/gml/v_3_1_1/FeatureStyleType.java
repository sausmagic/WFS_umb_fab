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
 * [complexType of] The style descriptor for features.
 * 
 * <p>Java-Klasse für FeatureStyleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="featureConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}geometryStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}topologyStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="baseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queryGrammar" type="{http://www.opengis.net/gml}QueryGrammarEnumeration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureStyleType", propOrder = {
    "featureConstraint",
    "geometryStyle",
    "topologyStyle",
    "labelStyle"
})
public class FeatureStyleType
    extends AbstractGMLType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected String featureConstraint;
    protected List<GeometryStylePropertyType> geometryStyle;
    protected List<TopologyStylePropertyType> topologyStyle;
    protected LabelStylePropertyType labelStyle;
    @XmlAttribute(name = "featureType")
    protected String featureType;
    @XmlAttribute(name = "baseType")
    protected String baseType;
    @XmlAttribute(name = "queryGrammar")
    protected QueryGrammarEnumeration queryGrammar;

    /**
     * Ruft den Wert der featureConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureConstraint() {
        return featureConstraint;
    }

    /**
     * Legt den Wert der featureConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureConstraint(String value) {
        this.featureConstraint = value;
    }

    public boolean isSetFeatureConstraint() {
        return (this.featureConstraint!= null);
    }

    /**
     * Gets the value of the geometryStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeometryStylePropertyType }
     * 
     * 
     */
    public List<GeometryStylePropertyType> getGeometryStyle() {
        if (geometryStyle == null) {
            geometryStyle = new ArrayList<GeometryStylePropertyType>();
        }
        return this.geometryStyle;
    }

    public boolean isSetGeometryStyle() {
        return ((this.geometryStyle!= null)&&(!this.geometryStyle.isEmpty()));
    }

    public void unsetGeometryStyle() {
        this.geometryStyle = null;
    }

    /**
     * Gets the value of the topologyStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topologyStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopologyStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopologyStylePropertyType }
     * 
     * 
     */
    public List<TopologyStylePropertyType> getTopologyStyle() {
        if (topologyStyle == null) {
            topologyStyle = new ArrayList<TopologyStylePropertyType>();
        }
        return this.topologyStyle;
    }

    public boolean isSetTopologyStyle() {
        return ((this.topologyStyle!= null)&&(!this.topologyStyle.isEmpty()));
    }

    public void unsetTopologyStyle() {
        this.topologyStyle = null;
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
     * Ruft den Wert der featureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Legt den Wert der featureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    public boolean isSetFeatureType() {
        return (this.featureType!= null);
    }

    /**
     * Ruft den Wert der baseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Legt den Wert der baseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    public boolean isSetBaseType() {
        return (this.baseType!= null);
    }

    /**
     * Ruft den Wert der queryGrammar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QueryGrammarEnumeration }
     *     
     */
    public QueryGrammarEnumeration getQueryGrammar() {
        return queryGrammar;
    }

    /**
     * Legt den Wert der queryGrammar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryGrammarEnumeration }
     *     
     */
    public void setQueryGrammar(QueryGrammarEnumeration value) {
        this.queryGrammar = value;
    }

    public boolean isSetQueryGrammar() {
        return (this.queryGrammar!= null);
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
            String theFeatureConstraint;
            theFeatureConstraint = this.getFeatureConstraint();
            strategy.appendField(locator, this, "featureConstraint", buffer, theFeatureConstraint);
        }
        {
            List<GeometryStylePropertyType> theGeometryStyle;
            theGeometryStyle = this.getGeometryStyle();
            strategy.appendField(locator, this, "geometryStyle", buffer, theGeometryStyle);
        }
        {
            List<TopologyStylePropertyType> theTopologyStyle;
            theTopologyStyle = this.getTopologyStyle();
            strategy.appendField(locator, this, "topologyStyle", buffer, theTopologyStyle);
        }
        {
            LabelStylePropertyType theLabelStyle;
            theLabelStyle = this.getLabelStyle();
            strategy.appendField(locator, this, "labelStyle", buffer, theLabelStyle);
        }
        {
            String theFeatureType;
            theFeatureType = this.getFeatureType();
            strategy.appendField(locator, this, "featureType", buffer, theFeatureType);
        }
        {
            String theBaseType;
            theBaseType = this.getBaseType();
            strategy.appendField(locator, this, "baseType", buffer, theBaseType);
        }
        {
            QueryGrammarEnumeration theQueryGrammar;
            theQueryGrammar = this.getQueryGrammar();
            strategy.appendField(locator, this, "queryGrammar", buffer, theQueryGrammar);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeatureStyleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FeatureStyleType that = ((FeatureStyleType) object);
        {
            String lhsFeatureConstraint;
            lhsFeatureConstraint = this.getFeatureConstraint();
            String rhsFeatureConstraint;
            rhsFeatureConstraint = that.getFeatureConstraint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureConstraint", lhsFeatureConstraint), LocatorUtils.property(thatLocator, "featureConstraint", rhsFeatureConstraint), lhsFeatureConstraint, rhsFeatureConstraint)) {
                return false;
            }
        }
        {
            List<GeometryStylePropertyType> lhsGeometryStyle;
            lhsGeometryStyle = this.getGeometryStyle();
            List<GeometryStylePropertyType> rhsGeometryStyle;
            rhsGeometryStyle = that.getGeometryStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometryStyle", lhsGeometryStyle), LocatorUtils.property(thatLocator, "geometryStyle", rhsGeometryStyle), lhsGeometryStyle, rhsGeometryStyle)) {
                return false;
            }
        }
        {
            List<TopologyStylePropertyType> lhsTopologyStyle;
            lhsTopologyStyle = this.getTopologyStyle();
            List<TopologyStylePropertyType> rhsTopologyStyle;
            rhsTopologyStyle = that.getTopologyStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topologyStyle", lhsTopologyStyle), LocatorUtils.property(thatLocator, "topologyStyle", rhsTopologyStyle), lhsTopologyStyle, rhsTopologyStyle)) {
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
            String lhsFeatureType;
            lhsFeatureType = this.getFeatureType();
            String rhsFeatureType;
            rhsFeatureType = that.getFeatureType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureType", lhsFeatureType), LocatorUtils.property(thatLocator, "featureType", rhsFeatureType), lhsFeatureType, rhsFeatureType)) {
                return false;
            }
        }
        {
            String lhsBaseType;
            lhsBaseType = this.getBaseType();
            String rhsBaseType;
            rhsBaseType = that.getBaseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseType", lhsBaseType), LocatorUtils.property(thatLocator, "baseType", rhsBaseType), lhsBaseType, rhsBaseType)) {
                return false;
            }
        }
        {
            QueryGrammarEnumeration lhsQueryGrammar;
            lhsQueryGrammar = this.getQueryGrammar();
            QueryGrammarEnumeration rhsQueryGrammar;
            rhsQueryGrammar = that.getQueryGrammar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryGrammar", lhsQueryGrammar), LocatorUtils.property(thatLocator, "queryGrammar", rhsQueryGrammar), lhsQueryGrammar, rhsQueryGrammar)) {
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
            String theFeatureConstraint;
            theFeatureConstraint = this.getFeatureConstraint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureConstraint", theFeatureConstraint), currentHashCode, theFeatureConstraint);
        }
        {
            List<GeometryStylePropertyType> theGeometryStyle;
            theGeometryStyle = this.getGeometryStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometryStyle", theGeometryStyle), currentHashCode, theGeometryStyle);
        }
        {
            List<TopologyStylePropertyType> theTopologyStyle;
            theTopologyStyle = this.getTopologyStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topologyStyle", theTopologyStyle), currentHashCode, theTopologyStyle);
        }
        {
            LabelStylePropertyType theLabelStyle;
            theLabelStyle = this.getLabelStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelStyle", theLabelStyle), currentHashCode, theLabelStyle);
        }
        {
            String theFeatureType;
            theFeatureType = this.getFeatureType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureType", theFeatureType), currentHashCode, theFeatureType);
        }
        {
            String theBaseType;
            theBaseType = this.getBaseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseType", theBaseType), currentHashCode, theBaseType);
        }
        {
            QueryGrammarEnumeration theQueryGrammar;
            theQueryGrammar = this.getQueryGrammar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryGrammar", theQueryGrammar), currentHashCode, theQueryGrammar);
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
        if (draftCopy instanceof FeatureStyleType) {
            final FeatureStyleType copy = ((FeatureStyleType) draftCopy);
            if (this.isSetFeatureConstraint()) {
                String sourceFeatureConstraint;
                sourceFeatureConstraint = this.getFeatureConstraint();
                String copyFeatureConstraint = ((String) strategy.copy(LocatorUtils.property(locator, "featureConstraint", sourceFeatureConstraint), sourceFeatureConstraint));
                copy.setFeatureConstraint(copyFeatureConstraint);
            } else {
                copy.featureConstraint = null;
            }
            if (this.isSetGeometryStyle()) {
                List<GeometryStylePropertyType> sourceGeometryStyle;
                sourceGeometryStyle = this.getGeometryStyle();
                @SuppressWarnings("unchecked")
                List<GeometryStylePropertyType> copyGeometryStyle = ((List<GeometryStylePropertyType> ) strategy.copy(LocatorUtils.property(locator, "geometryStyle", sourceGeometryStyle), sourceGeometryStyle));
                copy.unsetGeometryStyle();
                List<GeometryStylePropertyType> uniqueGeometryStylel = copy.getGeometryStyle();
                uniqueGeometryStylel.addAll(copyGeometryStyle);
            } else {
                copy.unsetGeometryStyle();
            }
            if (this.isSetTopologyStyle()) {
                List<TopologyStylePropertyType> sourceTopologyStyle;
                sourceTopologyStyle = this.getTopologyStyle();
                @SuppressWarnings("unchecked")
                List<TopologyStylePropertyType> copyTopologyStyle = ((List<TopologyStylePropertyType> ) strategy.copy(LocatorUtils.property(locator, "topologyStyle", sourceTopologyStyle), sourceTopologyStyle));
                copy.unsetTopologyStyle();
                List<TopologyStylePropertyType> uniqueTopologyStylel = copy.getTopologyStyle();
                uniqueTopologyStylel.addAll(copyTopologyStyle);
            } else {
                copy.unsetTopologyStyle();
            }
            if (this.isSetLabelStyle()) {
                LabelStylePropertyType sourceLabelStyle;
                sourceLabelStyle = this.getLabelStyle();
                LabelStylePropertyType copyLabelStyle = ((LabelStylePropertyType) strategy.copy(LocatorUtils.property(locator, "labelStyle", sourceLabelStyle), sourceLabelStyle));
                copy.setLabelStyle(copyLabelStyle);
            } else {
                copy.labelStyle = null;
            }
            if (this.isSetFeatureType()) {
                String sourceFeatureType;
                sourceFeatureType = this.getFeatureType();
                String copyFeatureType = ((String) strategy.copy(LocatorUtils.property(locator, "featureType", sourceFeatureType), sourceFeatureType));
                copy.setFeatureType(copyFeatureType);
            } else {
                copy.featureType = null;
            }
            if (this.isSetBaseType()) {
                String sourceBaseType;
                sourceBaseType = this.getBaseType();
                String copyBaseType = ((String) strategy.copy(LocatorUtils.property(locator, "baseType", sourceBaseType), sourceBaseType));
                copy.setBaseType(copyBaseType);
            } else {
                copy.baseType = null;
            }
            if (this.isSetQueryGrammar()) {
                QueryGrammarEnumeration sourceQueryGrammar;
                sourceQueryGrammar = this.getQueryGrammar();
                QueryGrammarEnumeration copyQueryGrammar = ((QueryGrammarEnumeration) strategy.copy(LocatorUtils.property(locator, "queryGrammar", sourceQueryGrammar), sourceQueryGrammar));
                copy.setQueryGrammar(copyQueryGrammar);
            } else {
                copy.queryGrammar = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeatureStyleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof FeatureStyleType) {
            final FeatureStyleType target = this;
            final FeatureStyleType leftObject = ((FeatureStyleType) left);
            final FeatureStyleType rightObject = ((FeatureStyleType) right);
            {
                String lhsFeatureConstraint;
                lhsFeatureConstraint = leftObject.getFeatureConstraint();
                String rhsFeatureConstraint;
                rhsFeatureConstraint = rightObject.getFeatureConstraint();
                target.setFeatureConstraint(((String) strategy.merge(LocatorUtils.property(leftLocator, "featureConstraint", lhsFeatureConstraint), LocatorUtils.property(rightLocator, "featureConstraint", rhsFeatureConstraint), lhsFeatureConstraint, rhsFeatureConstraint)));
            }
            {
                List<GeometryStylePropertyType> lhsGeometryStyle;
                lhsGeometryStyle = leftObject.getGeometryStyle();
                List<GeometryStylePropertyType> rhsGeometryStyle;
                rhsGeometryStyle = rightObject.getGeometryStyle();
                target.unsetGeometryStyle();
                List<GeometryStylePropertyType> uniqueGeometryStylel = target.getGeometryStyle();
                uniqueGeometryStylel.addAll(((List<GeometryStylePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "geometryStyle", lhsGeometryStyle), LocatorUtils.property(rightLocator, "geometryStyle", rhsGeometryStyle), lhsGeometryStyle, rhsGeometryStyle)));
            }
            {
                List<TopologyStylePropertyType> lhsTopologyStyle;
                lhsTopologyStyle = leftObject.getTopologyStyle();
                List<TopologyStylePropertyType> rhsTopologyStyle;
                rhsTopologyStyle = rightObject.getTopologyStyle();
                target.unsetTopologyStyle();
                List<TopologyStylePropertyType> uniqueTopologyStylel = target.getTopologyStyle();
                uniqueTopologyStylel.addAll(((List<TopologyStylePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "topologyStyle", lhsTopologyStyle), LocatorUtils.property(rightLocator, "topologyStyle", rhsTopologyStyle), lhsTopologyStyle, rhsTopologyStyle)));
            }
            {
                LabelStylePropertyType lhsLabelStyle;
                lhsLabelStyle = leftObject.getLabelStyle();
                LabelStylePropertyType rhsLabelStyle;
                rhsLabelStyle = rightObject.getLabelStyle();
                target.setLabelStyle(((LabelStylePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "labelStyle", lhsLabelStyle), LocatorUtils.property(rightLocator, "labelStyle", rhsLabelStyle), lhsLabelStyle, rhsLabelStyle)));
            }
            {
                String lhsFeatureType;
                lhsFeatureType = leftObject.getFeatureType();
                String rhsFeatureType;
                rhsFeatureType = rightObject.getFeatureType();
                target.setFeatureType(((String) strategy.merge(LocatorUtils.property(leftLocator, "featureType", lhsFeatureType), LocatorUtils.property(rightLocator, "featureType", rhsFeatureType), lhsFeatureType, rhsFeatureType)));
            }
            {
                String lhsBaseType;
                lhsBaseType = leftObject.getBaseType();
                String rhsBaseType;
                rhsBaseType = rightObject.getBaseType();
                target.setBaseType(((String) strategy.merge(LocatorUtils.property(leftLocator, "baseType", lhsBaseType), LocatorUtils.property(rightLocator, "baseType", rhsBaseType), lhsBaseType, rhsBaseType)));
            }
            {
                QueryGrammarEnumeration lhsQueryGrammar;
                lhsQueryGrammar = leftObject.getQueryGrammar();
                QueryGrammarEnumeration rhsQueryGrammar;
                rhsQueryGrammar = rightObject.getQueryGrammar();
                target.setQueryGrammar(((QueryGrammarEnumeration) strategy.merge(LocatorUtils.property(leftLocator, "queryGrammar", lhsQueryGrammar), LocatorUtils.property(rightLocator, "queryGrammar", rhsQueryGrammar), lhsQueryGrammar, rhsQueryGrammar)));
            }
        }
    }

    public void setGeometryStyle(List<GeometryStylePropertyType> value) {
        List<GeometryStylePropertyType> draftl = this.getGeometryStyle();
        draftl.addAll(value);
    }

    public void setTopologyStyle(List<TopologyStylePropertyType> value) {
        List<TopologyStylePropertyType> draftl = this.getTopologyStyle();
        draftl.addAll(value);
    }

}
