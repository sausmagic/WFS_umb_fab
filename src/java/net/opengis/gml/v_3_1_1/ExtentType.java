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
 * Information about the spatial, vertical, and/or temporal extent of a reference system object. Constraints: At least one of the elements "description", "boundingBox", "boundingPolygon", "verticalExtent", and temporalExtent" must be included, but more that one can be included when appropriate. Furthermore, more than one "boundingBox", "boundingPolygon", "verticalExtent", and/or temporalExtent" element can be included, with more than one meaning the union of the individual domains.
 * 
 * <p>Java-Klasse für ExtentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}description" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}boundingBox" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.opengis.net/gml}boundingPolygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}verticalExtent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}temporalExtent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtentType", propOrder = {
    "description",
    "boundingBox",
    "boundingPolygon",
    "verticalExtent",
    "temporalExtent"
})
public class ExtentType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected StringOrRefType description;
    protected List<EnvelopeType> boundingBox;
    protected List<PolygonType> boundingPolygon;
    protected List<EnvelopeType> verticalExtent;
    protected List<TimePeriodType> temporalExtent;

    /**
     * Description of spatial and/or temporal extent of this object.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDescription(StringOrRefType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Unordered list of bounding boxes (or envelopes) whose union describes the spatial domain of this object.Gets the value of the boundingBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvelopeType }
     * 
     * 
     */
    public List<EnvelopeType> getBoundingBox() {
        if (boundingBox == null) {
            boundingBox = new ArrayList<EnvelopeType>();
        }
        return this.boundingBox;
    }

    public boolean isSetBoundingBox() {
        return ((this.boundingBox!= null)&&(!this.boundingBox.isEmpty()));
    }

    public void unsetBoundingBox() {
        this.boundingBox = null;
    }

    /**
     * Unordered list of bounding polygons whose union describes the spatial domain of this object.Gets the value of the boundingPolygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundingPolygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundingPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolygonType }
     * 
     * 
     */
    public List<PolygonType> getBoundingPolygon() {
        if (boundingPolygon == null) {
            boundingPolygon = new ArrayList<PolygonType>();
        }
        return this.boundingPolygon;
    }

    public boolean isSetBoundingPolygon() {
        return ((this.boundingPolygon!= null)&&(!this.boundingPolygon.isEmpty()));
    }

    public void unsetBoundingPolygon() {
        this.boundingPolygon = null;
    }

    /**
     * Unordered list of vertical intervals whose union describes the spatial domain of this object.Gets the value of the verticalExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvelopeType }
     * 
     * 
     */
    public List<EnvelopeType> getVerticalExtent() {
        if (verticalExtent == null) {
            verticalExtent = new ArrayList<EnvelopeType>();
        }
        return this.verticalExtent;
    }

    public boolean isSetVerticalExtent() {
        return ((this.verticalExtent!= null)&&(!this.verticalExtent.isEmpty()));
    }

    public void unsetVerticalExtent() {
        this.verticalExtent = null;
    }

    /**
     * Unordered list of time periods whose union describes the spatial domain of this object.Gets the value of the temporalExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getTemporalExtent() {
        if (temporalExtent == null) {
            temporalExtent = new ArrayList<TimePeriodType>();
        }
        return this.temporalExtent;
    }

    public boolean isSetTemporalExtent() {
        return ((this.temporalExtent!= null)&&(!this.temporalExtent.isEmpty()));
    }

    public void unsetTemporalExtent() {
        this.temporalExtent = null;
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
            StringOrRefType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            List<EnvelopeType> theBoundingBox;
            theBoundingBox = this.getBoundingBox();
            strategy.appendField(locator, this, "boundingBox", buffer, theBoundingBox);
        }
        {
            List<PolygonType> theBoundingPolygon;
            theBoundingPolygon = this.getBoundingPolygon();
            strategy.appendField(locator, this, "boundingPolygon", buffer, theBoundingPolygon);
        }
        {
            List<EnvelopeType> theVerticalExtent;
            theVerticalExtent = this.getVerticalExtent();
            strategy.appendField(locator, this, "verticalExtent", buffer, theVerticalExtent);
        }
        {
            List<TimePeriodType> theTemporalExtent;
            theTemporalExtent = this.getTemporalExtent();
            strategy.appendField(locator, this, "temporalExtent", buffer, theTemporalExtent);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExtentType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExtentType that = ((ExtentType) object);
        {
            StringOrRefType lhsDescription;
            lhsDescription = this.getDescription();
            StringOrRefType rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            List<EnvelopeType> lhsBoundingBox;
            lhsBoundingBox = this.getBoundingBox();
            List<EnvelopeType> rhsBoundingBox;
            rhsBoundingBox = that.getBoundingBox();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "boundingBox", lhsBoundingBox), LocatorUtils.property(thatLocator, "boundingBox", rhsBoundingBox), lhsBoundingBox, rhsBoundingBox)) {
                return false;
            }
        }
        {
            List<PolygonType> lhsBoundingPolygon;
            lhsBoundingPolygon = this.getBoundingPolygon();
            List<PolygonType> rhsBoundingPolygon;
            rhsBoundingPolygon = that.getBoundingPolygon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "boundingPolygon", lhsBoundingPolygon), LocatorUtils.property(thatLocator, "boundingPolygon", rhsBoundingPolygon), lhsBoundingPolygon, rhsBoundingPolygon)) {
                return false;
            }
        }
        {
            List<EnvelopeType> lhsVerticalExtent;
            lhsVerticalExtent = this.getVerticalExtent();
            List<EnvelopeType> rhsVerticalExtent;
            rhsVerticalExtent = that.getVerticalExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalExtent", lhsVerticalExtent), LocatorUtils.property(thatLocator, "verticalExtent", rhsVerticalExtent), lhsVerticalExtent, rhsVerticalExtent)) {
                return false;
            }
        }
        {
            List<TimePeriodType> lhsTemporalExtent;
            lhsTemporalExtent = this.getTemporalExtent();
            List<TimePeriodType> rhsTemporalExtent;
            rhsTemporalExtent = that.getTemporalExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "temporalExtent", lhsTemporalExtent), LocatorUtils.property(thatLocator, "temporalExtent", rhsTemporalExtent), lhsTemporalExtent, rhsTemporalExtent)) {
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
            StringOrRefType theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            List<EnvelopeType> theBoundingBox;
            theBoundingBox = this.getBoundingBox();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "boundingBox", theBoundingBox), currentHashCode, theBoundingBox);
        }
        {
            List<PolygonType> theBoundingPolygon;
            theBoundingPolygon = this.getBoundingPolygon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "boundingPolygon", theBoundingPolygon), currentHashCode, theBoundingPolygon);
        }
        {
            List<EnvelopeType> theVerticalExtent;
            theVerticalExtent = this.getVerticalExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalExtent", theVerticalExtent), currentHashCode, theVerticalExtent);
        }
        {
            List<TimePeriodType> theTemporalExtent;
            theTemporalExtent = this.getTemporalExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "temporalExtent", theTemporalExtent), currentHashCode, theTemporalExtent);
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
        if (draftCopy instanceof ExtentType) {
            final ExtentType copy = ((ExtentType) draftCopy);
            if (this.isSetDescription()) {
                StringOrRefType sourceDescription;
                sourceDescription = this.getDescription();
                StringOrRefType copyDescription = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
            if (this.isSetBoundingBox()) {
                List<EnvelopeType> sourceBoundingBox;
                sourceBoundingBox = this.getBoundingBox();
                @SuppressWarnings("unchecked")
                List<EnvelopeType> copyBoundingBox = ((List<EnvelopeType> ) strategy.copy(LocatorUtils.property(locator, "boundingBox", sourceBoundingBox), sourceBoundingBox));
                copy.unsetBoundingBox();
                List<EnvelopeType> uniqueBoundingBoxl = copy.getBoundingBox();
                uniqueBoundingBoxl.addAll(copyBoundingBox);
            } else {
                copy.unsetBoundingBox();
            }
            if (this.isSetBoundingPolygon()) {
                List<PolygonType> sourceBoundingPolygon;
                sourceBoundingPolygon = this.getBoundingPolygon();
                @SuppressWarnings("unchecked")
                List<PolygonType> copyBoundingPolygon = ((List<PolygonType> ) strategy.copy(LocatorUtils.property(locator, "boundingPolygon", sourceBoundingPolygon), sourceBoundingPolygon));
                copy.unsetBoundingPolygon();
                List<PolygonType> uniqueBoundingPolygonl = copy.getBoundingPolygon();
                uniqueBoundingPolygonl.addAll(copyBoundingPolygon);
            } else {
                copy.unsetBoundingPolygon();
            }
            if (this.isSetVerticalExtent()) {
                List<EnvelopeType> sourceVerticalExtent;
                sourceVerticalExtent = this.getVerticalExtent();
                @SuppressWarnings("unchecked")
                List<EnvelopeType> copyVerticalExtent = ((List<EnvelopeType> ) strategy.copy(LocatorUtils.property(locator, "verticalExtent", sourceVerticalExtent), sourceVerticalExtent));
                copy.unsetVerticalExtent();
                List<EnvelopeType> uniqueVerticalExtentl = copy.getVerticalExtent();
                uniqueVerticalExtentl.addAll(copyVerticalExtent);
            } else {
                copy.unsetVerticalExtent();
            }
            if (this.isSetTemporalExtent()) {
                List<TimePeriodType> sourceTemporalExtent;
                sourceTemporalExtent = this.getTemporalExtent();
                @SuppressWarnings("unchecked")
                List<TimePeriodType> copyTemporalExtent = ((List<TimePeriodType> ) strategy.copy(LocatorUtils.property(locator, "temporalExtent", sourceTemporalExtent), sourceTemporalExtent));
                copy.unsetTemporalExtent();
                List<TimePeriodType> uniqueTemporalExtentl = copy.getTemporalExtent();
                uniqueTemporalExtentl.addAll(copyTemporalExtent);
            } else {
                copy.unsetTemporalExtent();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ExtentType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof ExtentType) {
            final ExtentType target = this;
            final ExtentType leftObject = ((ExtentType) left);
            final ExtentType rightObject = ((ExtentType) right);
            {
                StringOrRefType lhsDescription;
                lhsDescription = leftObject.getDescription();
                StringOrRefType rhsDescription;
                rhsDescription = rightObject.getDescription();
                target.setDescription(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "description", lhsDescription), LocatorUtils.property(rightLocator, "description", rhsDescription), lhsDescription, rhsDescription)));
            }
            {
                List<EnvelopeType> lhsBoundingBox;
                lhsBoundingBox = leftObject.getBoundingBox();
                List<EnvelopeType> rhsBoundingBox;
                rhsBoundingBox = rightObject.getBoundingBox();
                target.unsetBoundingBox();
                List<EnvelopeType> uniqueBoundingBoxl = target.getBoundingBox();
                uniqueBoundingBoxl.addAll(((List<EnvelopeType> ) strategy.merge(LocatorUtils.property(leftLocator, "boundingBox", lhsBoundingBox), LocatorUtils.property(rightLocator, "boundingBox", rhsBoundingBox), lhsBoundingBox, rhsBoundingBox)));
            }
            {
                List<PolygonType> lhsBoundingPolygon;
                lhsBoundingPolygon = leftObject.getBoundingPolygon();
                List<PolygonType> rhsBoundingPolygon;
                rhsBoundingPolygon = rightObject.getBoundingPolygon();
                target.unsetBoundingPolygon();
                List<PolygonType> uniqueBoundingPolygonl = target.getBoundingPolygon();
                uniqueBoundingPolygonl.addAll(((List<PolygonType> ) strategy.merge(LocatorUtils.property(leftLocator, "boundingPolygon", lhsBoundingPolygon), LocatorUtils.property(rightLocator, "boundingPolygon", rhsBoundingPolygon), lhsBoundingPolygon, rhsBoundingPolygon)));
            }
            {
                List<EnvelopeType> lhsVerticalExtent;
                lhsVerticalExtent = leftObject.getVerticalExtent();
                List<EnvelopeType> rhsVerticalExtent;
                rhsVerticalExtent = rightObject.getVerticalExtent();
                target.unsetVerticalExtent();
                List<EnvelopeType> uniqueVerticalExtentl = target.getVerticalExtent();
                uniqueVerticalExtentl.addAll(((List<EnvelopeType> ) strategy.merge(LocatorUtils.property(leftLocator, "verticalExtent", lhsVerticalExtent), LocatorUtils.property(rightLocator, "verticalExtent", rhsVerticalExtent), lhsVerticalExtent, rhsVerticalExtent)));
            }
            {
                List<TimePeriodType> lhsTemporalExtent;
                lhsTemporalExtent = leftObject.getTemporalExtent();
                List<TimePeriodType> rhsTemporalExtent;
                rhsTemporalExtent = rightObject.getTemporalExtent();
                target.unsetTemporalExtent();
                List<TimePeriodType> uniqueTemporalExtentl = target.getTemporalExtent();
                uniqueTemporalExtentl.addAll(((List<TimePeriodType> ) strategy.merge(LocatorUtils.property(leftLocator, "temporalExtent", lhsTemporalExtent), LocatorUtils.property(rightLocator, "temporalExtent", rhsTemporalExtent), lhsTemporalExtent, rhsTemporalExtent)));
            }
        }
    }

    public void setBoundingBox(List<EnvelopeType> value) {
        List<EnvelopeType> draftl = this.getBoundingBox();
        draftl.addAll(value);
    }

    public void setBoundingPolygon(List<PolygonType> value) {
        List<PolygonType> draftl = this.getBoundingPolygon();
        draftl.addAll(value);
    }

    public void setVerticalExtent(List<EnvelopeType> value) {
        List<EnvelopeType> draftl = this.getVerticalExtent();
        draftl.addAll(value);
    }

    public void setTemporalExtent(List<TimePeriodType> value) {
        List<TimePeriodType> draftl = this.getTemporalExtent();
        draftl.addAll(value);
    }

}
