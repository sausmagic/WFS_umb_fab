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
import javax.xml.bind.annotation.XmlSchemaType;
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
 * The definition of a group of parameters used by an operation method. This complexType is expected to be used or extended for all applicable operation methods, without defining operation-method-specialized element names.  
 * 
 * <p>Java-Klasse für OperationParameterGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationParameterGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}OperationParameterGroupBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}groupID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}maximumOccurs" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}includesParameter" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterGroupType", propOrder = {
    "groupID",
    "remarks",
    "maximumOccurs",
    "includesParameter"
})
public class OperationParameterGroupType
    extends OperationParameterGroupBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> groupID;
    protected StringOrRefType remarks;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumOccurs;
    @XmlElement(required = true)
    protected List<AbstractGeneralOperationParameterRefType> includesParameter;

    /**
     * Set of alternative identifications of this operation parameter group. The first groupID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the groupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getGroupID() {
        if (groupID == null) {
            groupID = new ArrayList<IdentifierType>();
        }
        return this.groupID;
    }

    public boolean isSetGroupID() {
        return ((this.groupID!= null)&&(!this.groupID.isEmpty()));
    }

    public void unsetGroupID() {
        this.groupID = null;
    }

    /**
     * Comments on or information about this operation parameter group, including source information. 
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
     * Ruft den Wert der maximumOccurs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumOccurs() {
        return maximumOccurs;
    }

    /**
     * Legt den Wert der maximumOccurs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumOccurs(BigInteger value) {
        this.maximumOccurs = value;
    }

    public boolean isSetMaximumOccurs() {
        return (this.maximumOccurs!= null);
    }

    /**
     * Unordered list of associations to the set of operation parameters that are members of this group. Gets the value of the includesParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGeneralOperationParameterRefType }
     * 
     * 
     */
    public List<AbstractGeneralOperationParameterRefType> getIncludesParameter() {
        if (includesParameter == null) {
            includesParameter = new ArrayList<AbstractGeneralOperationParameterRefType>();
        }
        return this.includesParameter;
    }

    public boolean isSetIncludesParameter() {
        return ((this.includesParameter!= null)&&(!this.includesParameter.isEmpty()));
    }

    public void unsetIncludesParameter() {
        this.includesParameter = null;
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
            List<IdentifierType> theGroupID;
            theGroupID = this.getGroupID();
            strategy.appendField(locator, this, "groupID", buffer, theGroupID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            BigInteger theMaximumOccurs;
            theMaximumOccurs = this.getMaximumOccurs();
            strategy.appendField(locator, this, "maximumOccurs", buffer, theMaximumOccurs);
        }
        {
            List<AbstractGeneralOperationParameterRefType> theIncludesParameter;
            theIncludesParameter = this.getIncludesParameter();
            strategy.appendField(locator, this, "includesParameter", buffer, theIncludesParameter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationParameterGroupType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OperationParameterGroupType that = ((OperationParameterGroupType) object);
        {
            List<IdentifierType> lhsGroupID;
            lhsGroupID = this.getGroupID();
            List<IdentifierType> rhsGroupID;
            rhsGroupID = that.getGroupID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupID", lhsGroupID), LocatorUtils.property(thatLocator, "groupID", rhsGroupID), lhsGroupID, rhsGroupID)) {
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
            BigInteger lhsMaximumOccurs;
            lhsMaximumOccurs = this.getMaximumOccurs();
            BigInteger rhsMaximumOccurs;
            rhsMaximumOccurs = that.getMaximumOccurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumOccurs", lhsMaximumOccurs), LocatorUtils.property(thatLocator, "maximumOccurs", rhsMaximumOccurs), lhsMaximumOccurs, rhsMaximumOccurs)) {
                return false;
            }
        }
        {
            List<AbstractGeneralOperationParameterRefType> lhsIncludesParameter;
            lhsIncludesParameter = this.getIncludesParameter();
            List<AbstractGeneralOperationParameterRefType> rhsIncludesParameter;
            rhsIncludesParameter = that.getIncludesParameter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includesParameter", lhsIncludesParameter), LocatorUtils.property(thatLocator, "includesParameter", rhsIncludesParameter), lhsIncludesParameter, rhsIncludesParameter)) {
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
            List<IdentifierType> theGroupID;
            theGroupID = this.getGroupID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupID", theGroupID), currentHashCode, theGroupID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            BigInteger theMaximumOccurs;
            theMaximumOccurs = this.getMaximumOccurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumOccurs", theMaximumOccurs), currentHashCode, theMaximumOccurs);
        }
        {
            List<AbstractGeneralOperationParameterRefType> theIncludesParameter;
            theIncludesParameter = this.getIncludesParameter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includesParameter", theIncludesParameter), currentHashCode, theIncludesParameter);
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
        if (draftCopy instanceof OperationParameterGroupType) {
            final OperationParameterGroupType copy = ((OperationParameterGroupType) draftCopy);
            if (this.isSetGroupID()) {
                List<IdentifierType> sourceGroupID;
                sourceGroupID = this.getGroupID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyGroupID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "groupID", sourceGroupID), sourceGroupID));
                copy.unsetGroupID();
                List<IdentifierType> uniqueGroupIDl = copy.getGroupID();
                uniqueGroupIDl.addAll(copyGroupID);
            } else {
                copy.unsetGroupID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetMaximumOccurs()) {
                BigInteger sourceMaximumOccurs;
                sourceMaximumOccurs = this.getMaximumOccurs();
                BigInteger copyMaximumOccurs = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maximumOccurs", sourceMaximumOccurs), sourceMaximumOccurs));
                copy.setMaximumOccurs(copyMaximumOccurs);
            } else {
                copy.maximumOccurs = null;
            }
            if (this.isSetIncludesParameter()) {
                List<AbstractGeneralOperationParameterRefType> sourceIncludesParameter;
                sourceIncludesParameter = this.getIncludesParameter();
                @SuppressWarnings("unchecked")
                List<AbstractGeneralOperationParameterRefType> copyIncludesParameter = ((List<AbstractGeneralOperationParameterRefType> ) strategy.copy(LocatorUtils.property(locator, "includesParameter", sourceIncludesParameter), sourceIncludesParameter));
                copy.unsetIncludesParameter();
                List<AbstractGeneralOperationParameterRefType> uniqueIncludesParameterl = copy.getIncludesParameter();
                uniqueIncludesParameterl.addAll(copyIncludesParameter);
            } else {
                copy.unsetIncludesParameter();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OperationParameterGroupType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof OperationParameterGroupType) {
            final OperationParameterGroupType target = this;
            final OperationParameterGroupType leftObject = ((OperationParameterGroupType) left);
            final OperationParameterGroupType rightObject = ((OperationParameterGroupType) right);
            {
                List<IdentifierType> lhsGroupID;
                lhsGroupID = leftObject.getGroupID();
                List<IdentifierType> rhsGroupID;
                rhsGroupID = rightObject.getGroupID();
                target.unsetGroupID();
                List<IdentifierType> uniqueGroupIDl = target.getGroupID();
                uniqueGroupIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "groupID", lhsGroupID), LocatorUtils.property(rightLocator, "groupID", rhsGroupID), lhsGroupID, rhsGroupID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                BigInteger lhsMaximumOccurs;
                lhsMaximumOccurs = leftObject.getMaximumOccurs();
                BigInteger rhsMaximumOccurs;
                rhsMaximumOccurs = rightObject.getMaximumOccurs();
                target.setMaximumOccurs(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "maximumOccurs", lhsMaximumOccurs), LocatorUtils.property(rightLocator, "maximumOccurs", rhsMaximumOccurs), lhsMaximumOccurs, rhsMaximumOccurs)));
            }
            {
                List<AbstractGeneralOperationParameterRefType> lhsIncludesParameter;
                lhsIncludesParameter = leftObject.getIncludesParameter();
                List<AbstractGeneralOperationParameterRefType> rhsIncludesParameter;
                rhsIncludesParameter = rightObject.getIncludesParameter();
                target.unsetIncludesParameter();
                List<AbstractGeneralOperationParameterRefType> uniqueIncludesParameterl = target.getIncludesParameter();
                uniqueIncludesParameterl.addAll(((List<AbstractGeneralOperationParameterRefType> ) strategy.merge(LocatorUtils.property(leftLocator, "includesParameter", lhsIncludesParameter), LocatorUtils.property(rightLocator, "includesParameter", rhsIncludesParameter), lhsIncludesParameter, rhsIncludesParameter)));
            }
        }
    }

    public void setGroupID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getGroupID();
        draftl.addAll(value);
    }

    public void setIncludesParameter(List<AbstractGeneralOperationParameterRefType> value) {
        List<AbstractGeneralOperationParameterRefType> draftl = this.getIncludesParameter();
        draftl.addAll(value);
    }

}
