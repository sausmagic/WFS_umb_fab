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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * A datum specifies the relationship of a coordinate system to the earth, thus creating a coordinate reference system. A datum uses a parameter or set of parameters that determine the location of the origin of the coordinate reference system. Each datum subtype can be associated with only specific types of coordinate systems. This abstract complexType shall not be used, extended, or restricted, in an Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document. 
 * 
 * <p>Java-Klasse für AbstractDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}datumID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}anchorPoint" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}realizationEpoch" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}scope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumType", propOrder = {
    "datumID",
    "remarks",
    "anchorPoint",
    "realizationEpoch",
    "validArea",
    "scope"
})
@XmlSeeAlso({
    VerticalDatumType.class,
    EngineeringDatumType.class,
    ImageDatumType.class,
    GeodeticDatumType.class,
    TemporalDatumBaseType.class
})
public abstract class AbstractDatumType
    extends AbstractDatumBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> datumID;
    protected StringOrRefType remarks;
    protected CodeType anchorPoint;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realizationEpoch;
    protected ExtentType validArea;
    protected String scope;

    /**
     * Set of alternative identifications of this datum. The first datumID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the datumID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datumID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatumID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getDatumID() {
        if (datumID == null) {
            datumID = new ArrayList<IdentifierType>();
        }
        return this.datumID;
    }

    public boolean isSetDatumID() {
        return ((this.datumID!= null)&&(!this.datumID.isEmpty()));
    }

    public void unsetDatumID() {
        this.datumID = null;
    }

    /**
     * Comments on this reference system, including source information. 
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
     * Ruft den Wert der anchorPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAnchorPoint() {
        return anchorPoint;
    }

    /**
     * Legt den Wert der anchorPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAnchorPoint(CodeType value) {
        this.anchorPoint = value;
    }

    public boolean isSetAnchorPoint() {
        return (this.anchorPoint!= null);
    }

    /**
     * Ruft den Wert der realizationEpoch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealizationEpoch() {
        return realizationEpoch;
    }

    /**
     * Legt den Wert der realizationEpoch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealizationEpoch(XMLGregorianCalendar value) {
        this.realizationEpoch = value;
    }

    public boolean isSetRealizationEpoch() {
        return (this.realizationEpoch!= null);
    }

    /**
     * Ruft den Wert der validArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtentType }
     *     
     */
    public ExtentType getValidArea() {
        return validArea;
    }

    /**
     * Legt den Wert der validArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentType }
     *     
     */
    public void setValidArea(ExtentType value) {
        this.validArea = value;
    }

    public boolean isSetValidArea() {
        return (this.validArea!= null);
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    public boolean isSetScope() {
        return (this.scope!= null);
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
            List<IdentifierType> theDatumID;
            theDatumID = this.getDatumID();
            strategy.appendField(locator, this, "datumID", buffer, theDatumID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            CodeType theAnchorPoint;
            theAnchorPoint = this.getAnchorPoint();
            strategy.appendField(locator, this, "anchorPoint", buffer, theAnchorPoint);
        }
        {
            XMLGregorianCalendar theRealizationEpoch;
            theRealizationEpoch = this.getRealizationEpoch();
            strategy.appendField(locator, this, "realizationEpoch", buffer, theRealizationEpoch);
        }
        {
            ExtentType theValidArea;
            theValidArea = this.getValidArea();
            strategy.appendField(locator, this, "validArea", buffer, theValidArea);
        }
        {
            String theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractDatumType that = ((AbstractDatumType) object);
        {
            List<IdentifierType> lhsDatumID;
            lhsDatumID = this.getDatumID();
            List<IdentifierType> rhsDatumID;
            rhsDatumID = that.getDatumID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datumID", lhsDatumID), LocatorUtils.property(thatLocator, "datumID", rhsDatumID), lhsDatumID, rhsDatumID)) {
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
            CodeType lhsAnchorPoint;
            lhsAnchorPoint = this.getAnchorPoint();
            CodeType rhsAnchorPoint;
            rhsAnchorPoint = that.getAnchorPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anchorPoint", lhsAnchorPoint), LocatorUtils.property(thatLocator, "anchorPoint", rhsAnchorPoint), lhsAnchorPoint, rhsAnchorPoint)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRealizationEpoch;
            lhsRealizationEpoch = this.getRealizationEpoch();
            XMLGregorianCalendar rhsRealizationEpoch;
            rhsRealizationEpoch = that.getRealizationEpoch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realizationEpoch", lhsRealizationEpoch), LocatorUtils.property(thatLocator, "realizationEpoch", rhsRealizationEpoch), lhsRealizationEpoch, rhsRealizationEpoch)) {
                return false;
            }
        }
        {
            ExtentType lhsValidArea;
            lhsValidArea = this.getValidArea();
            ExtentType rhsValidArea;
            rhsValidArea = that.getValidArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validArea", lhsValidArea), LocatorUtils.property(thatLocator, "validArea", rhsValidArea), lhsValidArea, rhsValidArea)) {
                return false;
            }
        }
        {
            String lhsScope;
            lhsScope = this.getScope();
            String rhsScope;
            rhsScope = that.getScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scope", lhsScope), LocatorUtils.property(thatLocator, "scope", rhsScope), lhsScope, rhsScope)) {
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
            List<IdentifierType> theDatumID;
            theDatumID = this.getDatumID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datumID", theDatumID), currentHashCode, theDatumID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            CodeType theAnchorPoint;
            theAnchorPoint = this.getAnchorPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anchorPoint", theAnchorPoint), currentHashCode, theAnchorPoint);
        }
        {
            XMLGregorianCalendar theRealizationEpoch;
            theRealizationEpoch = this.getRealizationEpoch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realizationEpoch", theRealizationEpoch), currentHashCode, theRealizationEpoch);
        }
        {
            ExtentType theValidArea;
            theValidArea = this.getValidArea();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validArea", theValidArea), currentHashCode, theValidArea);
        }
        {
            String theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
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
        if (target instanceof AbstractDatumType) {
            final AbstractDatumType copy = ((AbstractDatumType) target);
            if (this.isSetDatumID()) {
                List<IdentifierType> sourceDatumID;
                sourceDatumID = this.getDatumID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyDatumID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "datumID", sourceDatumID), sourceDatumID));
                copy.unsetDatumID();
                List<IdentifierType> uniqueDatumIDl = copy.getDatumID();
                uniqueDatumIDl.addAll(copyDatumID);
            } else {
                copy.unsetDatumID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetAnchorPoint()) {
                CodeType sourceAnchorPoint;
                sourceAnchorPoint = this.getAnchorPoint();
                CodeType copyAnchorPoint = ((CodeType) strategy.copy(LocatorUtils.property(locator, "anchorPoint", sourceAnchorPoint), sourceAnchorPoint));
                copy.setAnchorPoint(copyAnchorPoint);
            } else {
                copy.anchorPoint = null;
            }
            if (this.isSetRealizationEpoch()) {
                XMLGregorianCalendar sourceRealizationEpoch;
                sourceRealizationEpoch = this.getRealizationEpoch();
                XMLGregorianCalendar copyRealizationEpoch = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "realizationEpoch", sourceRealizationEpoch), sourceRealizationEpoch));
                copy.setRealizationEpoch(copyRealizationEpoch);
            } else {
                copy.realizationEpoch = null;
            }
            if (this.isSetValidArea()) {
                ExtentType sourceValidArea;
                sourceValidArea = this.getValidArea();
                ExtentType copyValidArea = ((ExtentType) strategy.copy(LocatorUtils.property(locator, "validArea", sourceValidArea), sourceValidArea));
                copy.setValidArea(copyValidArea);
            } else {
                copy.validArea = null;
            }
            if (this.isSetScope()) {
                String sourceScope;
                sourceScope = this.getScope();
                String copyScope = ((String) strategy.copy(LocatorUtils.property(locator, "scope", sourceScope), sourceScope));
                copy.setScope(copyScope);
            } else {
                copy.scope = null;
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
        if (right instanceof AbstractDatumType) {
            final AbstractDatumType target = this;
            final AbstractDatumType leftObject = ((AbstractDatumType) left);
            final AbstractDatumType rightObject = ((AbstractDatumType) right);
            {
                List<IdentifierType> lhsDatumID;
                lhsDatumID = leftObject.getDatumID();
                List<IdentifierType> rhsDatumID;
                rhsDatumID = rightObject.getDatumID();
                target.unsetDatumID();
                List<IdentifierType> uniqueDatumIDl = target.getDatumID();
                uniqueDatumIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "datumID", lhsDatumID), LocatorUtils.property(rightLocator, "datumID", rhsDatumID), lhsDatumID, rhsDatumID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                CodeType lhsAnchorPoint;
                lhsAnchorPoint = leftObject.getAnchorPoint();
                CodeType rhsAnchorPoint;
                rhsAnchorPoint = rightObject.getAnchorPoint();
                target.setAnchorPoint(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "anchorPoint", lhsAnchorPoint), LocatorUtils.property(rightLocator, "anchorPoint", rhsAnchorPoint), lhsAnchorPoint, rhsAnchorPoint)));
            }
            {
                XMLGregorianCalendar lhsRealizationEpoch;
                lhsRealizationEpoch = leftObject.getRealizationEpoch();
                XMLGregorianCalendar rhsRealizationEpoch;
                rhsRealizationEpoch = rightObject.getRealizationEpoch();
                target.setRealizationEpoch(((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "realizationEpoch", lhsRealizationEpoch), LocatorUtils.property(rightLocator, "realizationEpoch", rhsRealizationEpoch), lhsRealizationEpoch, rhsRealizationEpoch)));
            }
            {
                ExtentType lhsValidArea;
                lhsValidArea = leftObject.getValidArea();
                ExtentType rhsValidArea;
                rhsValidArea = rightObject.getValidArea();
                target.setValidArea(((ExtentType) strategy.merge(LocatorUtils.property(leftLocator, "validArea", lhsValidArea), LocatorUtils.property(rightLocator, "validArea", rhsValidArea), lhsValidArea, rhsValidArea)));
            }
            {
                String lhsScope;
                lhsScope = leftObject.getScope();
                String rhsScope;
                rhsScope = rightObject.getScope();
                target.setScope(((String) strategy.merge(LocatorUtils.property(leftLocator, "scope", lhsScope), LocatorUtils.property(rightLocator, "scope", rhsScope), lhsScope, rhsScope)));
            }
        }
    }

    public void setDatumID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getDatumID();
        draftl.addAll(value);
    }

}
