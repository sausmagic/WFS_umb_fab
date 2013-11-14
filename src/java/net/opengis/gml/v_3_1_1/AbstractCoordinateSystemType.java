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
 * A coordinate system (CS) is the set of coordinate system axes that spans a given coordinate space. A CS is derived from a set of (mathematical) rules for specifying how coordinates in a given space are to be assigned to points. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded, whenever those coordinates use a coordinate reference system that uses this coordinate system. This abstract complexType shall not be used, extended, or restricted, in an Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document. 
 * 
 * <p>Java-Klasse für AbstractCoordinateSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoordinateSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateSystemBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}csID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesAxis" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateSystemType", propOrder = {
    "csID",
    "remarks",
    "usesAxis"
})
@XmlSeeAlso({
    ObliqueCartesianCSType.class,
    VerticalCSType.class,
    LinearCSType.class,
    SphericalCSType.class,
    EllipsoidalCSType.class,
    CartesianCSType.class,
    CylindricalCSType.class,
    TemporalCSType.class,
    UserDefinedCSType.class,
    PolarCSType.class
})
public abstract class AbstractCoordinateSystemType
    extends AbstractCoordinateSystemBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> csID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected List<CoordinateSystemAxisRefType> usesAxis;

    /**
     * Set of alternative identifications of this coordinate system. The first csID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the csID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCsID() {
        if (csID == null) {
            csID = new ArrayList<IdentifierType>();
        }
        return this.csID;
    }

    public boolean isSetCsID() {
        return ((this.csID!= null)&&(!this.csID.isEmpty()));
    }

    public void unsetCsID() {
        this.csID = null;
    }

    /**
     * Comments on or information about this coordinate system, including data source information. 
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRemarks() {
        return remarks;
    }

    /**
     * Legt den Wert der remarks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRemarks(StringOrRefType value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
    }

    /**
     * Ordered sequence of associations to the coordinate system axes included in this coordinate system. Gets the value of the usesAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateSystemAxisRefType }
     * 
     * 
     */
    public List<CoordinateSystemAxisRefType> getUsesAxis() {
        if (usesAxis == null) {
            usesAxis = new ArrayList<CoordinateSystemAxisRefType>();
        }
        return this.usesAxis;
    }

    public boolean isSetUsesAxis() {
        return ((this.usesAxis!= null)&&(!this.usesAxis.isEmpty()));
    }

    public void unsetUsesAxis() {
        this.usesAxis = null;
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
            List<IdentifierType> theCsID;
            theCsID = this.getCsID();
            strategy.appendField(locator, this, "csID", buffer, theCsID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            List<CoordinateSystemAxisRefType> theUsesAxis;
            theUsesAxis = this.getUsesAxis();
            strategy.appendField(locator, this, "usesAxis", buffer, theUsesAxis);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractCoordinateSystemType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractCoordinateSystemType that = ((AbstractCoordinateSystemType) object);
        {
            List<IdentifierType> lhsCsID;
            lhsCsID = this.getCsID();
            List<IdentifierType> rhsCsID;
            rhsCsID = that.getCsID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "csID", lhsCsID), LocatorUtils.property(thatLocator, "csID", rhsCsID), lhsCsID, rhsCsID)) {
                return false;
            }
        }
        {
            StringOrRefType lhsRemarks;
            lhsRemarks = this.getRemarks();
            StringOrRefType rhsRemarks;
            rhsRemarks = that.getRemarks();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remarks", lhsRemarks), LocatorUtils.property(thatLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)) {
                return false;
            }
        }
        {
            List<CoordinateSystemAxisRefType> lhsUsesAxis;
            lhsUsesAxis = this.getUsesAxis();
            List<CoordinateSystemAxisRefType> rhsUsesAxis;
            rhsUsesAxis = that.getUsesAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesAxis", lhsUsesAxis), LocatorUtils.property(thatLocator, "usesAxis", rhsUsesAxis), lhsUsesAxis, rhsUsesAxis)) {
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
            List<IdentifierType> theCsID;
            theCsID = this.getCsID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "csID", theCsID), currentHashCode, theCsID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            List<CoordinateSystemAxisRefType> theUsesAxis;
            theUsesAxis = this.getUsesAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesAxis", theUsesAxis), currentHashCode, theUsesAxis);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AbstractCoordinateSystemType) {
            final AbstractCoordinateSystemType copy = ((AbstractCoordinateSystemType) target);
            if (this.isSetCsID()) {
                List<IdentifierType> sourceCsID;
                sourceCsID = this.getCsID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyCsID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "csID", sourceCsID), sourceCsID));
                copy.unsetCsID();
                List<IdentifierType> uniqueCsIDl = copy.getCsID();
                uniqueCsIDl.addAll(copyCsID);
            } else {
                copy.unsetCsID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetUsesAxis()) {
                List<CoordinateSystemAxisRefType> sourceUsesAxis;
                sourceUsesAxis = this.getUsesAxis();
                @SuppressWarnings("unchecked")
                List<CoordinateSystemAxisRefType> copyUsesAxis = ((List<CoordinateSystemAxisRefType> ) strategy.copy(LocatorUtils.property(locator, "usesAxis", sourceUsesAxis), sourceUsesAxis));
                copy.unsetUsesAxis();
                List<CoordinateSystemAxisRefType> uniqueUsesAxisl = copy.getUsesAxis();
                uniqueUsesAxisl.addAll(copyUsesAxis);
            } else {
                copy.unsetUsesAxis();
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof AbstractCoordinateSystemType) {
            final AbstractCoordinateSystemType target = this;
            final AbstractCoordinateSystemType leftObject = ((AbstractCoordinateSystemType) left);
            final AbstractCoordinateSystemType rightObject = ((AbstractCoordinateSystemType) right);
            {
                List<IdentifierType> lhsCsID;
                lhsCsID = leftObject.getCsID();
                List<IdentifierType> rhsCsID;
                rhsCsID = rightObject.getCsID();
                target.unsetCsID();
                List<IdentifierType> uniqueCsIDl = target.getCsID();
                uniqueCsIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "csID", lhsCsID), LocatorUtils.property(rightLocator, "csID", rhsCsID), lhsCsID, rhsCsID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                List<CoordinateSystemAxisRefType> lhsUsesAxis;
                lhsUsesAxis = leftObject.getUsesAxis();
                List<CoordinateSystemAxisRefType> rhsUsesAxis;
                rhsUsesAxis = rightObject.getUsesAxis();
                target.unsetUsesAxis();
                List<CoordinateSystemAxisRefType> uniqueUsesAxisl = target.getUsesAxis();
                uniqueUsesAxisl.addAll(((List<CoordinateSystemAxisRefType> ) strategy.merge(LocatorUtils.property(leftLocator, "usesAxis", lhsUsesAxis), LocatorUtils.property(rightLocator, "usesAxis", rhsUsesAxis), lhsUsesAxis, rhsUsesAxis)));
            }
        }
    }

    public void setCsID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getCsID();
        draftl.addAll(value);
    }

    public void setUsesAxis(List<CoordinateSystemAxisRefType> value) {
        List<CoordinateSystemAxisRefType> draftl = this.getUsesAxis();
        draftl.addAll(value);
    }

}
