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
 * The definition of a parameter used by an operation method. Most parameter values are numeric, but other types of parameter values are possible. This complexType is expected to be used or extended for all operation methods, without defining operation-method-specialized element names.  
 * 
 * <p>Java-Klasse für OperationParameterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}OperationParameterBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}parameterID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterType", propOrder = {
    "parameterID",
    "remarks"
})
public class OperationParameterType
    extends OperationParameterBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> parameterID;
    protected StringOrRefType remarks;

    /**
     * Set of alternative identifications of this operation parameter. The first parameterID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the parameterID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getParameterID() {
        if (parameterID == null) {
            parameterID = new ArrayList<IdentifierType>();
        }
        return this.parameterID;
    }

    public boolean isSetParameterID() {
        return ((this.parameterID!= null)&&(!this.parameterID.isEmpty()));
    }

    public void unsetParameterID() {
        this.parameterID = null;
    }

    /**
     * Comments on or information about this operation parameter, including source information. 
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
            List<IdentifierType> theParameterID;
            theParameterID = this.getParameterID();
            strategy.appendField(locator, this, "parameterID", buffer, theParameterID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationParameterType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OperationParameterType that = ((OperationParameterType) object);
        {
            List<IdentifierType> lhsParameterID;
            lhsParameterID = this.getParameterID();
            List<IdentifierType> rhsParameterID;
            rhsParameterID = that.getParameterID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterID", lhsParameterID), LocatorUtils.property(thatLocator, "parameterID", rhsParameterID), lhsParameterID, rhsParameterID)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<IdentifierType> theParameterID;
            theParameterID = this.getParameterID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterID", theParameterID), currentHashCode, theParameterID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
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
        if (draftCopy instanceof OperationParameterType) {
            final OperationParameterType copy = ((OperationParameterType) draftCopy);
            if (this.isSetParameterID()) {
                List<IdentifierType> sourceParameterID;
                sourceParameterID = this.getParameterID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyParameterID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "parameterID", sourceParameterID), sourceParameterID));
                copy.unsetParameterID();
                List<IdentifierType> uniqueParameterIDl = copy.getParameterID();
                uniqueParameterIDl.addAll(copyParameterID);
            } else {
                copy.unsetParameterID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OperationParameterType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof OperationParameterType) {
            final OperationParameterType target = this;
            final OperationParameterType leftObject = ((OperationParameterType) left);
            final OperationParameterType rightObject = ((OperationParameterType) right);
            {
                List<IdentifierType> lhsParameterID;
                lhsParameterID = leftObject.getParameterID();
                List<IdentifierType> rhsParameterID;
                rhsParameterID = rightObject.getParameterID();
                target.unsetParameterID();
                List<IdentifierType> uniqueParameterIDl = target.getParameterID();
                uniqueParameterIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "parameterID", lhsParameterID), LocatorUtils.property(rightLocator, "parameterID", rhsParameterID), lhsParameterID, rhsParameterID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
        }
    }

    public void setParameterID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getParameterID();
        draftl.addAll(value);
    }

}
