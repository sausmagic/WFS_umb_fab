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
 * Definition of an algorithm used to perform a coordinate operation. Most operation methods use a number of operation parameters, although some coordinate conversions use none. Each coordinate operation using the method assigns values to these parameters. 
 * 
 * <p>Java-Klasse für OperationMethodType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationMethodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}OperationMethodBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}methodID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}methodFormula"/>
 *         &lt;element ref="{http://www.opengis.net/gml}sourceDimensions"/>
 *         &lt;element ref="{http://www.opengis.net/gml}targetDimensions"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMethodType", propOrder = {
    "methodID",
    "remarks",
    "methodFormula",
    "sourceDimensions",
    "targetDimensions",
    "usesParameter"
})
public class OperationMethodType
    extends OperationMethodBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> methodID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected CodeType methodFormula;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceDimensions;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetDimensions;
    protected List<AbstractGeneralOperationParameterRefType> usesParameter;

    /**
     * Set of alternative identifications of this operation method. The first methodID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the methodID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getMethodID() {
        if (methodID == null) {
            methodID = new ArrayList<IdentifierType>();
        }
        return this.methodID;
    }

    public boolean isSetMethodID() {
        return ((this.methodID!= null)&&(!this.methodID.isEmpty()));
    }

    public void unsetMethodID() {
        this.methodID = null;
    }

    /**
     * Comments on or information about this operation method, including source information.
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
     * Ruft den Wert der methodFormula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMethodFormula() {
        return methodFormula;
    }

    /**
     * Legt den Wert der methodFormula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMethodFormula(CodeType value) {
        this.methodFormula = value;
    }

    public boolean isSetMethodFormula() {
        return (this.methodFormula!= null);
    }

    /**
     * Ruft den Wert der sourceDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDimensions() {
        return sourceDimensions;
    }

    /**
     * Legt den Wert der sourceDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceDimensions(BigInteger value) {
        this.sourceDimensions = value;
    }

    public boolean isSetSourceDimensions() {
        return (this.sourceDimensions!= null);
    }

    /**
     * Ruft den Wert der targetDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetDimensions() {
        return targetDimensions;
    }

    /**
     * Legt den Wert der targetDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetDimensions(BigInteger value) {
        this.targetDimensions = value;
    }

    public boolean isSetTargetDimensions() {
        return (this.targetDimensions!= null);
    }

    /**
     * Unordered list of associations to the set of operation parameters and parameter groups used by this operation method. Gets the value of the usesParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGeneralOperationParameterRefType }
     * 
     * 
     */
    public List<AbstractGeneralOperationParameterRefType> getUsesParameter() {
        if (usesParameter == null) {
            usesParameter = new ArrayList<AbstractGeneralOperationParameterRefType>();
        }
        return this.usesParameter;
    }

    public boolean isSetUsesParameter() {
        return ((this.usesParameter!= null)&&(!this.usesParameter.isEmpty()));
    }

    public void unsetUsesParameter() {
        this.usesParameter = null;
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
            List<IdentifierType> theMethodID;
            theMethodID = this.getMethodID();
            strategy.appendField(locator, this, "methodID", buffer, theMethodID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            CodeType theMethodFormula;
            theMethodFormula = this.getMethodFormula();
            strategy.appendField(locator, this, "methodFormula", buffer, theMethodFormula);
        }
        {
            BigInteger theSourceDimensions;
            theSourceDimensions = this.getSourceDimensions();
            strategy.appendField(locator, this, "sourceDimensions", buffer, theSourceDimensions);
        }
        {
            BigInteger theTargetDimensions;
            theTargetDimensions = this.getTargetDimensions();
            strategy.appendField(locator, this, "targetDimensions", buffer, theTargetDimensions);
        }
        {
            List<AbstractGeneralOperationParameterRefType> theUsesParameter;
            theUsesParameter = this.getUsesParameter();
            strategy.appendField(locator, this, "usesParameter", buffer, theUsesParameter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationMethodType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OperationMethodType that = ((OperationMethodType) object);
        {
            List<IdentifierType> lhsMethodID;
            lhsMethodID = this.getMethodID();
            List<IdentifierType> rhsMethodID;
            rhsMethodID = that.getMethodID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "methodID", lhsMethodID), LocatorUtils.property(thatLocator, "methodID", rhsMethodID), lhsMethodID, rhsMethodID)) {
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
            CodeType lhsMethodFormula;
            lhsMethodFormula = this.getMethodFormula();
            CodeType rhsMethodFormula;
            rhsMethodFormula = that.getMethodFormula();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "methodFormula", lhsMethodFormula), LocatorUtils.property(thatLocator, "methodFormula", rhsMethodFormula), lhsMethodFormula, rhsMethodFormula)) {
                return false;
            }
        }
        {
            BigInteger lhsSourceDimensions;
            lhsSourceDimensions = this.getSourceDimensions();
            BigInteger rhsSourceDimensions;
            rhsSourceDimensions = that.getSourceDimensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceDimensions", lhsSourceDimensions), LocatorUtils.property(thatLocator, "sourceDimensions", rhsSourceDimensions), lhsSourceDimensions, rhsSourceDimensions)) {
                return false;
            }
        }
        {
            BigInteger lhsTargetDimensions;
            lhsTargetDimensions = this.getTargetDimensions();
            BigInteger rhsTargetDimensions;
            rhsTargetDimensions = that.getTargetDimensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetDimensions", lhsTargetDimensions), LocatorUtils.property(thatLocator, "targetDimensions", rhsTargetDimensions), lhsTargetDimensions, rhsTargetDimensions)) {
                return false;
            }
        }
        {
            List<AbstractGeneralOperationParameterRefType> lhsUsesParameter;
            lhsUsesParameter = this.getUsesParameter();
            List<AbstractGeneralOperationParameterRefType> rhsUsesParameter;
            rhsUsesParameter = that.getUsesParameter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesParameter", lhsUsesParameter), LocatorUtils.property(thatLocator, "usesParameter", rhsUsesParameter), lhsUsesParameter, rhsUsesParameter)) {
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
            List<IdentifierType> theMethodID;
            theMethodID = this.getMethodID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "methodID", theMethodID), currentHashCode, theMethodID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            CodeType theMethodFormula;
            theMethodFormula = this.getMethodFormula();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "methodFormula", theMethodFormula), currentHashCode, theMethodFormula);
        }
        {
            BigInteger theSourceDimensions;
            theSourceDimensions = this.getSourceDimensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceDimensions", theSourceDimensions), currentHashCode, theSourceDimensions);
        }
        {
            BigInteger theTargetDimensions;
            theTargetDimensions = this.getTargetDimensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetDimensions", theTargetDimensions), currentHashCode, theTargetDimensions);
        }
        {
            List<AbstractGeneralOperationParameterRefType> theUsesParameter;
            theUsesParameter = this.getUsesParameter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesParameter", theUsesParameter), currentHashCode, theUsesParameter);
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
        if (draftCopy instanceof OperationMethodType) {
            final OperationMethodType copy = ((OperationMethodType) draftCopy);
            if (this.isSetMethodID()) {
                List<IdentifierType> sourceMethodID;
                sourceMethodID = this.getMethodID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyMethodID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "methodID", sourceMethodID), sourceMethodID));
                copy.unsetMethodID();
                List<IdentifierType> uniqueMethodIDl = copy.getMethodID();
                uniqueMethodIDl.addAll(copyMethodID);
            } else {
                copy.unsetMethodID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetMethodFormula()) {
                CodeType sourceMethodFormula;
                sourceMethodFormula = this.getMethodFormula();
                CodeType copyMethodFormula = ((CodeType) strategy.copy(LocatorUtils.property(locator, "methodFormula", sourceMethodFormula), sourceMethodFormula));
                copy.setMethodFormula(copyMethodFormula);
            } else {
                copy.methodFormula = null;
            }
            if (this.isSetSourceDimensions()) {
                BigInteger sourceSourceDimensions;
                sourceSourceDimensions = this.getSourceDimensions();
                BigInteger copySourceDimensions = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "sourceDimensions", sourceSourceDimensions), sourceSourceDimensions));
                copy.setSourceDimensions(copySourceDimensions);
            } else {
                copy.sourceDimensions = null;
            }
            if (this.isSetTargetDimensions()) {
                BigInteger sourceTargetDimensions;
                sourceTargetDimensions = this.getTargetDimensions();
                BigInteger copyTargetDimensions = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "targetDimensions", sourceTargetDimensions), sourceTargetDimensions));
                copy.setTargetDimensions(copyTargetDimensions);
            } else {
                copy.targetDimensions = null;
            }
            if (this.isSetUsesParameter()) {
                List<AbstractGeneralOperationParameterRefType> sourceUsesParameter;
                sourceUsesParameter = this.getUsesParameter();
                @SuppressWarnings("unchecked")
                List<AbstractGeneralOperationParameterRefType> copyUsesParameter = ((List<AbstractGeneralOperationParameterRefType> ) strategy.copy(LocatorUtils.property(locator, "usesParameter", sourceUsesParameter), sourceUsesParameter));
                copy.unsetUsesParameter();
                List<AbstractGeneralOperationParameterRefType> uniqueUsesParameterl = copy.getUsesParameter();
                uniqueUsesParameterl.addAll(copyUsesParameter);
            } else {
                copy.unsetUsesParameter();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OperationMethodType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof OperationMethodType) {
            final OperationMethodType target = this;
            final OperationMethodType leftObject = ((OperationMethodType) left);
            final OperationMethodType rightObject = ((OperationMethodType) right);
            {
                List<IdentifierType> lhsMethodID;
                lhsMethodID = leftObject.getMethodID();
                List<IdentifierType> rhsMethodID;
                rhsMethodID = rightObject.getMethodID();
                target.unsetMethodID();
                List<IdentifierType> uniqueMethodIDl = target.getMethodID();
                uniqueMethodIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "methodID", lhsMethodID), LocatorUtils.property(rightLocator, "methodID", rhsMethodID), lhsMethodID, rhsMethodID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                CodeType lhsMethodFormula;
                lhsMethodFormula = leftObject.getMethodFormula();
                CodeType rhsMethodFormula;
                rhsMethodFormula = rightObject.getMethodFormula();
                target.setMethodFormula(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "methodFormula", lhsMethodFormula), LocatorUtils.property(rightLocator, "methodFormula", rhsMethodFormula), lhsMethodFormula, rhsMethodFormula)));
            }
            {
                BigInteger lhsSourceDimensions;
                lhsSourceDimensions = leftObject.getSourceDimensions();
                BigInteger rhsSourceDimensions;
                rhsSourceDimensions = rightObject.getSourceDimensions();
                target.setSourceDimensions(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "sourceDimensions", lhsSourceDimensions), LocatorUtils.property(rightLocator, "sourceDimensions", rhsSourceDimensions), lhsSourceDimensions, rhsSourceDimensions)));
            }
            {
                BigInteger lhsTargetDimensions;
                lhsTargetDimensions = leftObject.getTargetDimensions();
                BigInteger rhsTargetDimensions;
                rhsTargetDimensions = rightObject.getTargetDimensions();
                target.setTargetDimensions(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "targetDimensions", lhsTargetDimensions), LocatorUtils.property(rightLocator, "targetDimensions", rhsTargetDimensions), lhsTargetDimensions, rhsTargetDimensions)));
            }
            {
                List<AbstractGeneralOperationParameterRefType> lhsUsesParameter;
                lhsUsesParameter = leftObject.getUsesParameter();
                List<AbstractGeneralOperationParameterRefType> rhsUsesParameter;
                rhsUsesParameter = rightObject.getUsesParameter();
                target.unsetUsesParameter();
                List<AbstractGeneralOperationParameterRefType> uniqueUsesParameterl = target.getUsesParameter();
                uniqueUsesParameterl.addAll(((List<AbstractGeneralOperationParameterRefType> ) strategy.merge(LocatorUtils.property(leftLocator, "usesParameter", lhsUsesParameter), LocatorUtils.property(rightLocator, "usesParameter", rhsUsesParameter), lhsUsesParameter, rhsUsesParameter)));
            }
        }
    }

    public void setMethodID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getMethodID();
        draftl.addAll(value);
    }

    public void setUsesParameter(List<AbstractGeneralOperationParameterRefType> value) {
        List<AbstractGeneralOperationParameterRefType> draftl = this.getUsesParameter();
        draftl.addAll(value);
    }

}
