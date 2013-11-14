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
 * [complexType of] The style descriptor for a graph consisting of a number of features. Describes graph-specific style attributes.
 * 
 * <p>Java-Klasse für GraphStyleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GraphStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;element name="planar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="directed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="grid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="graphType" type="{http://www.opengis.net/gml}GraphTypeType" minOccurs="0"/>
 *         &lt;element name="drawingType" type="{http://www.opengis.net/gml}DrawingTypeType" minOccurs="0"/>
 *         &lt;element name="lineType" type="{http://www.opengis.net/gml}LineTypeType" minOccurs="0"/>
 *         &lt;element name="aestheticCriteria" type="{http://www.opengis.net/gml}AesheticCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphStyleType", propOrder = {
    "planar",
    "directed",
    "grid",
    "minDistance",
    "minAngle",
    "graphType",
    "drawingType",
    "lineType",
    "aestheticCriteria"
})
public class GraphStyleType
    extends BaseStyleDescriptorType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected Boolean planar;
    protected Boolean directed;
    protected Boolean grid;
    protected Double minDistance;
    protected Double minAngle;
    protected GraphTypeType graphType;
    protected DrawingTypeType drawingType;
    protected LineTypeType lineType;
    protected List<AesheticCriteriaType> aestheticCriteria;

    /**
     * Ruft den Wert der planar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanar() {
        return planar;
    }

    /**
     * Legt den Wert der planar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanar(Boolean value) {
        this.planar = value;
    }

    public boolean isSetPlanar() {
        return (this.planar!= null);
    }

    /**
     * Ruft den Wert der directed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirected() {
        return directed;
    }

    /**
     * Legt den Wert der directed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirected(Boolean value) {
        this.directed = value;
    }

    public boolean isSetDirected() {
        return (this.directed!= null);
    }

    /**
     * Ruft den Wert der grid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrid() {
        return grid;
    }

    /**
     * Legt den Wert der grid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrid(Boolean value) {
        this.grid = value;
    }

    public boolean isSetGrid() {
        return (this.grid!= null);
    }

    /**
     * Ruft den Wert der minDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDistance() {
        return minDistance;
    }

    /**
     * Legt den Wert der minDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDistance(Double value) {
        this.minDistance = value;
    }

    public boolean isSetMinDistance() {
        return (this.minDistance!= null);
    }

    /**
     * Ruft den Wert der minAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAngle() {
        return minAngle;
    }

    /**
     * Legt den Wert der minAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAngle(Double value) {
        this.minAngle = value;
    }

    public boolean isSetMinAngle() {
        return (this.minAngle!= null);
    }

    /**
     * Ruft den Wert der graphType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GraphTypeType }
     *     
     */
    public GraphTypeType getGraphType() {
        return graphType;
    }

    /**
     * Legt den Wert der graphType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphTypeType }
     *     
     */
    public void setGraphType(GraphTypeType value) {
        this.graphType = value;
    }

    public boolean isSetGraphType() {
        return (this.graphType!= null);
    }

    /**
     * Ruft den Wert der drawingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DrawingTypeType }
     *     
     */
    public DrawingTypeType getDrawingType() {
        return drawingType;
    }

    /**
     * Legt den Wert der drawingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawingTypeType }
     *     
     */
    public void setDrawingType(DrawingTypeType value) {
        this.drawingType = value;
    }

    public boolean isSetDrawingType() {
        return (this.drawingType!= null);
    }

    /**
     * Ruft den Wert der lineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeType }
     *     
     */
    public LineTypeType getLineType() {
        return lineType;
    }

    /**
     * Legt den Wert der lineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeType }
     *     
     */
    public void setLineType(LineTypeType value) {
        this.lineType = value;
    }

    public boolean isSetLineType() {
        return (this.lineType!= null);
    }

    /**
     * Gets the value of the aestheticCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aestheticCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAestheticCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AesheticCriteriaType }
     * 
     * 
     */
    public List<AesheticCriteriaType> getAestheticCriteria() {
        if (aestheticCriteria == null) {
            aestheticCriteria = new ArrayList<AesheticCriteriaType>();
        }
        return this.aestheticCriteria;
    }

    public boolean isSetAestheticCriteria() {
        return ((this.aestheticCriteria!= null)&&(!this.aestheticCriteria.isEmpty()));
    }

    public void unsetAestheticCriteria() {
        this.aestheticCriteria = null;
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
            Boolean thePlanar;
            thePlanar = this.isPlanar();
            strategy.appendField(locator, this, "planar", buffer, thePlanar);
        }
        {
            Boolean theDirected;
            theDirected = this.isDirected();
            strategy.appendField(locator, this, "directed", buffer, theDirected);
        }
        {
            Boolean theGrid;
            theGrid = this.isGrid();
            strategy.appendField(locator, this, "grid", buffer, theGrid);
        }
        {
            Double theMinDistance;
            theMinDistance = this.getMinDistance();
            strategy.appendField(locator, this, "minDistance", buffer, theMinDistance);
        }
        {
            Double theMinAngle;
            theMinAngle = this.getMinAngle();
            strategy.appendField(locator, this, "minAngle", buffer, theMinAngle);
        }
        {
            GraphTypeType theGraphType;
            theGraphType = this.getGraphType();
            strategy.appendField(locator, this, "graphType", buffer, theGraphType);
        }
        {
            DrawingTypeType theDrawingType;
            theDrawingType = this.getDrawingType();
            strategy.appendField(locator, this, "drawingType", buffer, theDrawingType);
        }
        {
            LineTypeType theLineType;
            theLineType = this.getLineType();
            strategy.appendField(locator, this, "lineType", buffer, theLineType);
        }
        {
            List<AesheticCriteriaType> theAestheticCriteria;
            theAestheticCriteria = this.getAestheticCriteria();
            strategy.appendField(locator, this, "aestheticCriteria", buffer, theAestheticCriteria);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GraphStyleType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GraphStyleType that = ((GraphStyleType) object);
        {
            Boolean lhsPlanar;
            lhsPlanar = this.isPlanar();
            Boolean rhsPlanar;
            rhsPlanar = that.isPlanar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "planar", lhsPlanar), LocatorUtils.property(thatLocator, "planar", rhsPlanar), lhsPlanar, rhsPlanar)) {
                return false;
            }
        }
        {
            Boolean lhsDirected;
            lhsDirected = this.isDirected();
            Boolean rhsDirected;
            rhsDirected = that.isDirected();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directed", lhsDirected), LocatorUtils.property(thatLocator, "directed", rhsDirected), lhsDirected, rhsDirected)) {
                return false;
            }
        }
        {
            Boolean lhsGrid;
            lhsGrid = this.isGrid();
            Boolean rhsGrid;
            rhsGrid = that.isGrid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grid", lhsGrid), LocatorUtils.property(thatLocator, "grid", rhsGrid), lhsGrid, rhsGrid)) {
                return false;
            }
        }
        {
            Double lhsMinDistance;
            lhsMinDistance = this.getMinDistance();
            Double rhsMinDistance;
            rhsMinDistance = that.getMinDistance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDistance", lhsMinDistance), LocatorUtils.property(thatLocator, "minDistance", rhsMinDistance), lhsMinDistance, rhsMinDistance)) {
                return false;
            }
        }
        {
            Double lhsMinAngle;
            lhsMinAngle = this.getMinAngle();
            Double rhsMinAngle;
            rhsMinAngle = that.getMinAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minAngle", lhsMinAngle), LocatorUtils.property(thatLocator, "minAngle", rhsMinAngle), lhsMinAngle, rhsMinAngle)) {
                return false;
            }
        }
        {
            GraphTypeType lhsGraphType;
            lhsGraphType = this.getGraphType();
            GraphTypeType rhsGraphType;
            rhsGraphType = that.getGraphType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "graphType", lhsGraphType), LocatorUtils.property(thatLocator, "graphType", rhsGraphType), lhsGraphType, rhsGraphType)) {
                return false;
            }
        }
        {
            DrawingTypeType lhsDrawingType;
            lhsDrawingType = this.getDrawingType();
            DrawingTypeType rhsDrawingType;
            rhsDrawingType = that.getDrawingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "drawingType", lhsDrawingType), LocatorUtils.property(thatLocator, "drawingType", rhsDrawingType), lhsDrawingType, rhsDrawingType)) {
                return false;
            }
        }
        {
            LineTypeType lhsLineType;
            lhsLineType = this.getLineType();
            LineTypeType rhsLineType;
            rhsLineType = that.getLineType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineType", lhsLineType), LocatorUtils.property(thatLocator, "lineType", rhsLineType), lhsLineType, rhsLineType)) {
                return false;
            }
        }
        {
            List<AesheticCriteriaType> lhsAestheticCriteria;
            lhsAestheticCriteria = this.getAestheticCriteria();
            List<AesheticCriteriaType> rhsAestheticCriteria;
            rhsAestheticCriteria = that.getAestheticCriteria();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aestheticCriteria", lhsAestheticCriteria), LocatorUtils.property(thatLocator, "aestheticCriteria", rhsAestheticCriteria), lhsAestheticCriteria, rhsAestheticCriteria)) {
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
            Boolean thePlanar;
            thePlanar = this.isPlanar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "planar", thePlanar), currentHashCode, thePlanar);
        }
        {
            Boolean theDirected;
            theDirected = this.isDirected();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directed", theDirected), currentHashCode, theDirected);
        }
        {
            Boolean theGrid;
            theGrid = this.isGrid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grid", theGrid), currentHashCode, theGrid);
        }
        {
            Double theMinDistance;
            theMinDistance = this.getMinDistance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minDistance", theMinDistance), currentHashCode, theMinDistance);
        }
        {
            Double theMinAngle;
            theMinAngle = this.getMinAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minAngle", theMinAngle), currentHashCode, theMinAngle);
        }
        {
            GraphTypeType theGraphType;
            theGraphType = this.getGraphType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "graphType", theGraphType), currentHashCode, theGraphType);
        }
        {
            DrawingTypeType theDrawingType;
            theDrawingType = this.getDrawingType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "drawingType", theDrawingType), currentHashCode, theDrawingType);
        }
        {
            LineTypeType theLineType;
            theLineType = this.getLineType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineType", theLineType), currentHashCode, theLineType);
        }
        {
            List<AesheticCriteriaType> theAestheticCriteria;
            theAestheticCriteria = this.getAestheticCriteria();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aestheticCriteria", theAestheticCriteria), currentHashCode, theAestheticCriteria);
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
        if (draftCopy instanceof GraphStyleType) {
            final GraphStyleType copy = ((GraphStyleType) draftCopy);
            if (this.isSetPlanar()) {
                Boolean sourcePlanar;
                sourcePlanar = this.isPlanar();
                Boolean copyPlanar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "planar", sourcePlanar), sourcePlanar));
                copy.setPlanar(copyPlanar);
            } else {
                copy.planar = null;
            }
            if (this.isSetDirected()) {
                Boolean sourceDirected;
                sourceDirected = this.isDirected();
                Boolean copyDirected = ((Boolean) strategy.copy(LocatorUtils.property(locator, "directed", sourceDirected), sourceDirected));
                copy.setDirected(copyDirected);
            } else {
                copy.directed = null;
            }
            if (this.isSetGrid()) {
                Boolean sourceGrid;
                sourceGrid = this.isGrid();
                Boolean copyGrid = ((Boolean) strategy.copy(LocatorUtils.property(locator, "grid", sourceGrid), sourceGrid));
                copy.setGrid(copyGrid);
            } else {
                copy.grid = null;
            }
            if (this.isSetMinDistance()) {
                Double sourceMinDistance;
                sourceMinDistance = this.getMinDistance();
                Double copyMinDistance = ((Double) strategy.copy(LocatorUtils.property(locator, "minDistance", sourceMinDistance), sourceMinDistance));
                copy.setMinDistance(copyMinDistance);
            } else {
                copy.minDistance = null;
            }
            if (this.isSetMinAngle()) {
                Double sourceMinAngle;
                sourceMinAngle = this.getMinAngle();
                Double copyMinAngle = ((Double) strategy.copy(LocatorUtils.property(locator, "minAngle", sourceMinAngle), sourceMinAngle));
                copy.setMinAngle(copyMinAngle);
            } else {
                copy.minAngle = null;
            }
            if (this.isSetGraphType()) {
                GraphTypeType sourceGraphType;
                sourceGraphType = this.getGraphType();
                GraphTypeType copyGraphType = ((GraphTypeType) strategy.copy(LocatorUtils.property(locator, "graphType", sourceGraphType), sourceGraphType));
                copy.setGraphType(copyGraphType);
            } else {
                copy.graphType = null;
            }
            if (this.isSetDrawingType()) {
                DrawingTypeType sourceDrawingType;
                sourceDrawingType = this.getDrawingType();
                DrawingTypeType copyDrawingType = ((DrawingTypeType) strategy.copy(LocatorUtils.property(locator, "drawingType", sourceDrawingType), sourceDrawingType));
                copy.setDrawingType(copyDrawingType);
            } else {
                copy.drawingType = null;
            }
            if (this.isSetLineType()) {
                LineTypeType sourceLineType;
                sourceLineType = this.getLineType();
                LineTypeType copyLineType = ((LineTypeType) strategy.copy(LocatorUtils.property(locator, "lineType", sourceLineType), sourceLineType));
                copy.setLineType(copyLineType);
            } else {
                copy.lineType = null;
            }
            if (this.isSetAestheticCriteria()) {
                List<AesheticCriteriaType> sourceAestheticCriteria;
                sourceAestheticCriteria = this.getAestheticCriteria();
                @SuppressWarnings("unchecked")
                List<AesheticCriteriaType> copyAestheticCriteria = ((List<AesheticCriteriaType> ) strategy.copy(LocatorUtils.property(locator, "aestheticCriteria", sourceAestheticCriteria), sourceAestheticCriteria));
                copy.unsetAestheticCriteria();
                List<AesheticCriteriaType> uniqueAestheticCriterial = copy.getAestheticCriteria();
                uniqueAestheticCriterial.addAll(copyAestheticCriteria);
            } else {
                copy.unsetAestheticCriteria();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GraphStyleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GraphStyleType) {
            final GraphStyleType target = this;
            final GraphStyleType leftObject = ((GraphStyleType) left);
            final GraphStyleType rightObject = ((GraphStyleType) right);
            {
                Boolean lhsPlanar;
                lhsPlanar = leftObject.isPlanar();
                Boolean rhsPlanar;
                rhsPlanar = rightObject.isPlanar();
                target.setPlanar(((Boolean) strategy.merge(LocatorUtils.property(leftLocator, "planar", lhsPlanar), LocatorUtils.property(rightLocator, "planar", rhsPlanar), lhsPlanar, rhsPlanar)));
            }
            {
                Boolean lhsDirected;
                lhsDirected = leftObject.isDirected();
                Boolean rhsDirected;
                rhsDirected = rightObject.isDirected();
                target.setDirected(((Boolean) strategy.merge(LocatorUtils.property(leftLocator, "directed", lhsDirected), LocatorUtils.property(rightLocator, "directed", rhsDirected), lhsDirected, rhsDirected)));
            }
            {
                Boolean lhsGrid;
                lhsGrid = leftObject.isGrid();
                Boolean rhsGrid;
                rhsGrid = rightObject.isGrid();
                target.setGrid(((Boolean) strategy.merge(LocatorUtils.property(leftLocator, "grid", lhsGrid), LocatorUtils.property(rightLocator, "grid", rhsGrid), lhsGrid, rhsGrid)));
            }
            {
                Double lhsMinDistance;
                lhsMinDistance = leftObject.getMinDistance();
                Double rhsMinDistance;
                rhsMinDistance = rightObject.getMinDistance();
                target.setMinDistance(((Double) strategy.merge(LocatorUtils.property(leftLocator, "minDistance", lhsMinDistance), LocatorUtils.property(rightLocator, "minDistance", rhsMinDistance), lhsMinDistance, rhsMinDistance)));
            }
            {
                Double lhsMinAngle;
                lhsMinAngle = leftObject.getMinAngle();
                Double rhsMinAngle;
                rhsMinAngle = rightObject.getMinAngle();
                target.setMinAngle(((Double) strategy.merge(LocatorUtils.property(leftLocator, "minAngle", lhsMinAngle), LocatorUtils.property(rightLocator, "minAngle", rhsMinAngle), lhsMinAngle, rhsMinAngle)));
            }
            {
                GraphTypeType lhsGraphType;
                lhsGraphType = leftObject.getGraphType();
                GraphTypeType rhsGraphType;
                rhsGraphType = rightObject.getGraphType();
                target.setGraphType(((GraphTypeType) strategy.merge(LocatorUtils.property(leftLocator, "graphType", lhsGraphType), LocatorUtils.property(rightLocator, "graphType", rhsGraphType), lhsGraphType, rhsGraphType)));
            }
            {
                DrawingTypeType lhsDrawingType;
                lhsDrawingType = leftObject.getDrawingType();
                DrawingTypeType rhsDrawingType;
                rhsDrawingType = rightObject.getDrawingType();
                target.setDrawingType(((DrawingTypeType) strategy.merge(LocatorUtils.property(leftLocator, "drawingType", lhsDrawingType), LocatorUtils.property(rightLocator, "drawingType", rhsDrawingType), lhsDrawingType, rhsDrawingType)));
            }
            {
                LineTypeType lhsLineType;
                lhsLineType = leftObject.getLineType();
                LineTypeType rhsLineType;
                rhsLineType = rightObject.getLineType();
                target.setLineType(((LineTypeType) strategy.merge(LocatorUtils.property(leftLocator, "lineType", lhsLineType), LocatorUtils.property(rightLocator, "lineType", rhsLineType), lhsLineType, rhsLineType)));
            }
            {
                List<AesheticCriteriaType> lhsAestheticCriteria;
                lhsAestheticCriteria = leftObject.getAestheticCriteria();
                List<AesheticCriteriaType> rhsAestheticCriteria;
                rhsAestheticCriteria = rightObject.getAestheticCriteria();
                target.unsetAestheticCriteria();
                List<AesheticCriteriaType> uniqueAestheticCriterial = target.getAestheticCriteria();
                uniqueAestheticCriterial.addAll(((List<AesheticCriteriaType> ) strategy.merge(LocatorUtils.property(leftLocator, "aestheticCriteria", lhsAestheticCriteria), LocatorUtils.property(rightLocator, "aestheticCriteria", rhsAestheticCriteria), lhsAestheticCriteria, rhsAestheticCriteria)));
            }
        }
    }

    public void setAestheticCriteria(List<AesheticCriteriaType> value) {
        List<AesheticCriteriaType> draftl = this.getAestheticCriteria();
        draftl.addAll(value);
    }

}
