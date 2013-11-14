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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * A gridded surface is a parametric curve
 *    surface derived from a rectangular grid in the parameter
 *    space. The rows from this grid are control points for
 *    horizontal surface curves; the columns are control points
 *    for vertical surface curves. The working assumption is that
 *    for a pair of parametric co-ordinates (s, t) that the
 *    horizontal curves for each integer offset are calculated
 *    and evaluated at "s". The defines a sequence of control
 *    points:
 *    
 *    cn(s) : s  1 .....columns 
 * 
 *    From this sequence a vertical curve is calculated for "s",
 *    and evaluated at "t". In most cases, the order of
 *    calculation (horizontal-vertical vs. vertical-horizontal)
 *    does not make a difference. Where it does, the horizontal-   
 *    vertical order shall be the one used.
 * 
 *    Logically, any pair of curve interpolation types can lead
 *    to a subtype of GriddedSurface. The following clauses
 *    define some most commonly encountered surfaces that can
 *    be represented in this manner.
 * 
 * <p>Java-Klasse für AbstractGriddedSurfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGriddedSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractParametricCurveSurfaceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}PointGrid"/>
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGriddedSurfaceType", propOrder = {
    "row",
    "rows",
    "columns"
})
@XmlSeeAlso({
    CylinderType.class,
    ConeType.class,
    SphereType.class
})
public class AbstractGriddedSurfaceType
    extends AbstractParametricCurveSurfaceType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<AbstractGriddedSurfaceType.Row> row;
    protected BigInteger rows;
    protected BigInteger columns;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGriddedSurfaceType.Row }
     * 
     * 
     */
    public List<AbstractGriddedSurfaceType.Row> getRow() {
        if (row == null) {
            row = new ArrayList<AbstractGriddedSurfaceType.Row>();
        }
        return this.row;
    }

    public boolean isSetRow() {
        return ((this.row!= null)&&(!this.row.isEmpty()));
    }

    public void unsetRow() {
        this.row = null;
    }

    /**
     * Ruft den Wert der rows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows() {
        return rows;
    }

    /**
     * Legt den Wert der rows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRows(BigInteger value) {
        this.rows = value;
    }

    public boolean isSetRows() {
        return (this.rows!= null);
    }

    /**
     * Ruft den Wert der columns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        return columns;
    }

    /**
     * Legt den Wert der columns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
    }

    public boolean isSetColumns() {
        return (this.columns!= null);
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
            List<AbstractGriddedSurfaceType.Row> theRow;
            theRow = this.getRow();
            strategy.appendField(locator, this, "row", buffer, theRow);
        }
        {
            BigInteger theRows;
            theRows = this.getRows();
            strategy.appendField(locator, this, "rows", buffer, theRows);
        }
        {
            BigInteger theColumns;
            theColumns = this.getColumns();
            strategy.appendField(locator, this, "columns", buffer, theColumns);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractGriddedSurfaceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractGriddedSurfaceType that = ((AbstractGriddedSurfaceType) object);
        {
            List<AbstractGriddedSurfaceType.Row> lhsRow;
            lhsRow = this.getRow();
            List<AbstractGriddedSurfaceType.Row> rhsRow;
            rhsRow = that.getRow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "row", lhsRow), LocatorUtils.property(thatLocator, "row", rhsRow), lhsRow, rhsRow)) {
                return false;
            }
        }
        {
            BigInteger lhsRows;
            lhsRows = this.getRows();
            BigInteger rhsRows;
            rhsRows = that.getRows();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rows", lhsRows), LocatorUtils.property(thatLocator, "rows", rhsRows), lhsRows, rhsRows)) {
                return false;
            }
        }
        {
            BigInteger lhsColumns;
            lhsColumns = this.getColumns();
            BigInteger rhsColumns;
            rhsColumns = that.getColumns();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columns", lhsColumns), LocatorUtils.property(thatLocator, "columns", rhsColumns), lhsColumns, rhsColumns)) {
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
            List<AbstractGriddedSurfaceType.Row> theRow;
            theRow = this.getRow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "row", theRow), currentHashCode, theRow);
        }
        {
            BigInteger theRows;
            theRows = this.getRows();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rows", theRows), currentHashCode, theRows);
        }
        {
            BigInteger theColumns;
            theColumns = this.getColumns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columns", theColumns), currentHashCode, theColumns);
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
        if (draftCopy instanceof AbstractGriddedSurfaceType) {
            final AbstractGriddedSurfaceType copy = ((AbstractGriddedSurfaceType) draftCopy);
            if (this.isSetRow()) {
                List<AbstractGriddedSurfaceType.Row> sourceRow;
                sourceRow = this.getRow();
                @SuppressWarnings("unchecked")
                List<AbstractGriddedSurfaceType.Row> copyRow = ((List<AbstractGriddedSurfaceType.Row> ) strategy.copy(LocatorUtils.property(locator, "row", sourceRow), sourceRow));
                copy.unsetRow();
                List<AbstractGriddedSurfaceType.Row> uniqueRowl = copy.getRow();
                uniqueRowl.addAll(copyRow);
            } else {
                copy.unsetRow();
            }
            if (this.isSetRows()) {
                BigInteger sourceRows;
                sourceRows = this.getRows();
                BigInteger copyRows = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "rows", sourceRows), sourceRows));
                copy.setRows(copyRows);
            } else {
                copy.rows = null;
            }
            if (this.isSetColumns()) {
                BigInteger sourceColumns;
                sourceColumns = this.getColumns();
                BigInteger copyColumns = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "columns", sourceColumns), sourceColumns));
                copy.setColumns(copyColumns);
            } else {
                copy.columns = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AbstractGriddedSurfaceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof AbstractGriddedSurfaceType) {
            final AbstractGriddedSurfaceType target = this;
            final AbstractGriddedSurfaceType leftObject = ((AbstractGriddedSurfaceType) left);
            final AbstractGriddedSurfaceType rightObject = ((AbstractGriddedSurfaceType) right);
            {
                List<AbstractGriddedSurfaceType.Row> lhsRow;
                lhsRow = leftObject.getRow();
                List<AbstractGriddedSurfaceType.Row> rhsRow;
                rhsRow = rightObject.getRow();
                target.unsetRow();
                List<AbstractGriddedSurfaceType.Row> uniqueRowl = target.getRow();
                uniqueRowl.addAll(((List<AbstractGriddedSurfaceType.Row> ) strategy.merge(LocatorUtils.property(leftLocator, "row", lhsRow), LocatorUtils.property(rightLocator, "row", rhsRow), lhsRow, rhsRow)));
            }
            {
                BigInteger lhsRows;
                lhsRows = leftObject.getRows();
                BigInteger rhsRows;
                rhsRows = rightObject.getRows();
                target.setRows(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "rows", lhsRows), LocatorUtils.property(rightLocator, "rows", rhsRows), lhsRows, rhsRows)));
            }
            {
                BigInteger lhsColumns;
                lhsColumns = leftObject.getColumns();
                BigInteger rhsColumns;
                rhsColumns = rightObject.getColumns();
                target.setColumns(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "columns", lhsColumns), LocatorUtils.property(rightLocator, "columns", rhsColumns), lhsColumns, rhsColumns)));
            }
        }
    }

    public void setRow(List<AbstractGriddedSurfaceType.Row> value) {
        List<AbstractGriddedSurfaceType.Row> draftl = this.getRow();
        draftl.addAll(value);
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.opengis.net/gml}geometricPositionListGroup"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "posList",
        "geometricPositionGroup"
    })
    public static class Row
        implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
    {

        protected DirectPositionListType posList;
        @XmlElements({
            @XmlElement(name = "pos", type = DirectPositionType.class),
            @XmlElement(name = "pointProperty", type = PointPropertyType.class)
        })
        protected List<Object> geometricPositionGroup;

        /**
         * Ruft den Wert der posList-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DirectPositionListType }
         *     
         */
        public DirectPositionListType getPosList() {
            return posList;
        }

        /**
         * Legt den Wert der posList-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectPositionListType }
         *     
         */
        public void setPosList(DirectPositionListType value) {
            this.posList = value;
        }

        public boolean isSetPosList() {
            return (this.posList!= null);
        }

        /**
         * Gets the value of the geometricPositionGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geometricPositionGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeometricPositionGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DirectPositionType }
         * {@link PointPropertyType }
         * 
         * 
         */
        public List<Object> getGeometricPositionGroup() {
            if (geometricPositionGroup == null) {
                geometricPositionGroup = new ArrayList<Object>();
            }
            return this.geometricPositionGroup;
        }

        public boolean isSetGeometricPositionGroup() {
            return ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
        }

        public void unsetGeometricPositionGroup() {
            this.geometricPositionGroup = null;
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
                DirectPositionListType thePosList;
                thePosList = this.getPosList();
                strategy.appendField(locator, this, "posList", buffer, thePosList);
            }
            {
                List<Object> theGeometricPositionGroup;
                theGeometricPositionGroup = this.getGeometricPositionGroup();
                strategy.appendField(locator, this, "geometricPositionGroup", buffer, theGeometricPositionGroup);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof AbstractGriddedSurfaceType.Row)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AbstractGriddedSurfaceType.Row that = ((AbstractGriddedSurfaceType.Row) object);
            {
                DirectPositionListType lhsPosList;
                lhsPosList = this.getPosList();
                DirectPositionListType rhsPosList;
                rhsPosList = that.getPosList();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "posList", lhsPosList), LocatorUtils.property(thatLocator, "posList", rhsPosList), lhsPosList, rhsPosList)) {
                    return false;
                }
            }
            {
                List<Object> lhsGeometricPositionGroup;
                lhsGeometricPositionGroup = this.getGeometricPositionGroup();
                List<Object> rhsGeometricPositionGroup;
                rhsGeometricPositionGroup = that.getGeometricPositionGroup();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "geometricPositionGroup", lhsGeometricPositionGroup), LocatorUtils.property(thatLocator, "geometricPositionGroup", rhsGeometricPositionGroup), lhsGeometricPositionGroup, rhsGeometricPositionGroup)) {
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
                DirectPositionListType thePosList;
                thePosList = this.getPosList();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posList", thePosList), currentHashCode, thePosList);
            }
            {
                List<Object> theGeometricPositionGroup;
                theGeometricPositionGroup = this.getGeometricPositionGroup();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometricPositionGroup", theGeometricPositionGroup), currentHashCode, theGeometricPositionGroup);
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
            if (draftCopy instanceof AbstractGriddedSurfaceType.Row) {
                final AbstractGriddedSurfaceType.Row copy = ((AbstractGriddedSurfaceType.Row) draftCopy);
                if (this.isSetPosList()) {
                    DirectPositionListType sourcePosList;
                    sourcePosList = this.getPosList();
                    DirectPositionListType copyPosList = ((DirectPositionListType) strategy.copy(LocatorUtils.property(locator, "posList", sourcePosList), sourcePosList));
                    copy.setPosList(copyPosList);
                } else {
                    copy.posList = null;
                }
                if (this.isSetGeometricPositionGroup()) {
                    List<Object> sourceGeometricPositionGroup;
                    sourceGeometricPositionGroup = this.getGeometricPositionGroup();
                    @SuppressWarnings("unchecked")
                    List<Object> copyGeometricPositionGroup = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "geometricPositionGroup", sourceGeometricPositionGroup), sourceGeometricPositionGroup));
                    copy.unsetGeometricPositionGroup();
                    List<Object> uniqueGeometricPositionGroupl = copy.getGeometricPositionGroup();
                    uniqueGeometricPositionGroupl.addAll(copyGeometricPositionGroup);
                } else {
                    copy.unsetGeometricPositionGroup();
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AbstractGriddedSurfaceType.Row();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
            if (right instanceof AbstractGriddedSurfaceType.Row) {
                final AbstractGriddedSurfaceType.Row target = this;
                final AbstractGriddedSurfaceType.Row leftObject = ((AbstractGriddedSurfaceType.Row) left);
                final AbstractGriddedSurfaceType.Row rightObject = ((AbstractGriddedSurfaceType.Row) right);
                {
                    DirectPositionListType lhsPosList;
                    lhsPosList = leftObject.getPosList();
                    DirectPositionListType rhsPosList;
                    rhsPosList = rightObject.getPosList();
                    target.setPosList(((DirectPositionListType) strategy.merge(LocatorUtils.property(leftLocator, "posList", lhsPosList), LocatorUtils.property(rightLocator, "posList", rhsPosList), lhsPosList, rhsPosList)));
                }
                {
                    List<Object> lhsGeometricPositionGroup;
                    lhsGeometricPositionGroup = leftObject.getGeometricPositionGroup();
                    List<Object> rhsGeometricPositionGroup;
                    rhsGeometricPositionGroup = rightObject.getGeometricPositionGroup();
                    target.unsetGeometricPositionGroup();
                    List<Object> uniqueGeometricPositionGroupl = target.getGeometricPositionGroup();
                    uniqueGeometricPositionGroupl.addAll(((List<Object> ) strategy.merge(LocatorUtils.property(leftLocator, "geometricPositionGroup", lhsGeometricPositionGroup), LocatorUtils.property(rightLocator, "geometricPositionGroup", rhsGeometricPositionGroup), lhsGeometricPositionGroup, rhsGeometricPositionGroup)));
                }
            }
        }

        public void setGeometricPositionGroup(List<Object> value) {
            List<Object> draftl = this.getGeometricPositionGroup();
            draftl.addAll(value);
        }

    }

}
