//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * A mathematical operation on coordinates that transforms or converts coordinates to another coordinate reference system. Many but not all coordinate operations (from CRS A to CRS B) also uniquely define the inverse operation (from CRS B to CRS A). In some cases, the operation method algorithm for the inverse operation is the same as for the forward algorithm, but the signs of some operation parameter values must be reversed. In other cases, different algorithms are required for the forward and inverse operations, but the same operation parameter values are used. If (some) entirely different parameter values are needed, a different coordinate operation shall be defined.
 * 
 * <p>Java-Klasse für AbstractCoordinateOperationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoordinateOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateOperationBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}coordinateOperationID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}operationVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}scope" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}_positionalAccuracy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}sourceCRS" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}targetCRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateOperationType", propOrder = {
    "coordinateOperationID",
    "remarks",
    "operationVersion",
    "validArea",
    "scope",
    "positionalAccuracy",
    "sourceCRS",
    "targetCRS"
})
@XmlSeeAlso({
    PassThroughOperationType.class,
    AbstractGeneralTransformationType.class,
    AbstractGeneralConversionType.class,
    ConcatenatedOperationType.class
})
public abstract class AbstractCoordinateOperationType
    extends AbstractCoordinateOperationBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> coordinateOperationID;
    protected StringOrRefType remarks;
    protected String operationVersion;
    protected ExtentType validArea;
    protected String scope;
    @XmlElementRef(name = "_positionalAccuracy", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractPositionalAccuracyType>> positionalAccuracy;
    protected CRSRefType sourceCRS;
    protected CRSRefType targetCRS;

    /**
     * Set of alternative identifications of this coordinate operation. The first coordinateOperationID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the coordinateOperationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateOperationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateOperationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCoordinateOperationID() {
        if (coordinateOperationID == null) {
            coordinateOperationID = new ArrayList<IdentifierType>();
        }
        return this.coordinateOperationID;
    }

    public boolean isSetCoordinateOperationID() {
        return ((this.coordinateOperationID!= null)&&(!this.coordinateOperationID.isEmpty()));
    }

    public void unsetCoordinateOperationID() {
        this.coordinateOperationID = null;
    }

    /**
     * Comments on or information about this coordinate operation, including source information. 
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
     * Ruft den Wert der operationVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationVersion() {
        return operationVersion;
    }

    /**
     * Legt den Wert der operationVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationVersion(String value) {
        this.operationVersion = value;
    }

    public boolean isSetOperationVersion() {
        return (this.operationVersion!= null);
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

    /**
     * Unordered set of estimates of the impact of this coordinate operation on point position accuracy. Gives position error estimates for target coordinates of this coordinate operation, assuming no errors in source coordinates. Gets the value of the positionalAccuracy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionalAccuracy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionalAccuracy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CovarianceMatrixType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsoluteExternalPositionalAccuracyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractPositionalAccuracyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelativeInternalPositionalAccuracyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractPositionalAccuracyType>> getPositionalAccuracy() {
        if (positionalAccuracy == null) {
            positionalAccuracy = new ArrayList<JAXBElement<? extends AbstractPositionalAccuracyType>>();
        }
        return this.positionalAccuracy;
    }

    public boolean isSetPositionalAccuracy() {
        return ((this.positionalAccuracy!= null)&&(!this.positionalAccuracy.isEmpty()));
    }

    public void unsetPositionalAccuracy() {
        this.positionalAccuracy = null;
    }

    /**
     * Ruft den Wert der sourceCRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CRSRefType }
     *     
     */
    public CRSRefType getSourceCRS() {
        return sourceCRS;
    }

    /**
     * Legt den Wert der sourceCRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSRefType }
     *     
     */
    public void setSourceCRS(CRSRefType value) {
        this.sourceCRS = value;
    }

    public boolean isSetSourceCRS() {
        return (this.sourceCRS!= null);
    }

    /**
     * Ruft den Wert der targetCRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CRSRefType }
     *     
     */
    public CRSRefType getTargetCRS() {
        return targetCRS;
    }

    /**
     * Legt den Wert der targetCRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSRefType }
     *     
     */
    public void setTargetCRS(CRSRefType value) {
        this.targetCRS = value;
    }

    public boolean isSetTargetCRS() {
        return (this.targetCRS!= null);
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
            List<IdentifierType> theCoordinateOperationID;
            theCoordinateOperationID = this.getCoordinateOperationID();
            strategy.appendField(locator, this, "coordinateOperationID", buffer, theCoordinateOperationID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            String theOperationVersion;
            theOperationVersion = this.getOperationVersion();
            strategy.appendField(locator, this, "operationVersion", buffer, theOperationVersion);
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
        {
            List<JAXBElement<? extends AbstractPositionalAccuracyType>> thePositionalAccuracy;
            thePositionalAccuracy = this.getPositionalAccuracy();
            strategy.appendField(locator, this, "positionalAccuracy", buffer, thePositionalAccuracy);
        }
        {
            CRSRefType theSourceCRS;
            theSourceCRS = this.getSourceCRS();
            strategy.appendField(locator, this, "sourceCRS", buffer, theSourceCRS);
        }
        {
            CRSRefType theTargetCRS;
            theTargetCRS = this.getTargetCRS();
            strategy.appendField(locator, this, "targetCRS", buffer, theTargetCRS);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AbstractCoordinateOperationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractCoordinateOperationType that = ((AbstractCoordinateOperationType) object);
        {
            List<IdentifierType> lhsCoordinateOperationID;
            lhsCoordinateOperationID = this.getCoordinateOperationID();
            List<IdentifierType> rhsCoordinateOperationID;
            rhsCoordinateOperationID = that.getCoordinateOperationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateOperationID", lhsCoordinateOperationID), LocatorUtils.property(thatLocator, "coordinateOperationID", rhsCoordinateOperationID), lhsCoordinateOperationID, rhsCoordinateOperationID)) {
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
            String lhsOperationVersion;
            lhsOperationVersion = this.getOperationVersion();
            String rhsOperationVersion;
            rhsOperationVersion = that.getOperationVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationVersion", lhsOperationVersion), LocatorUtils.property(thatLocator, "operationVersion", rhsOperationVersion), lhsOperationVersion, rhsOperationVersion)) {
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
        {
            List<JAXBElement<? extends AbstractPositionalAccuracyType>> lhsPositionalAccuracy;
            lhsPositionalAccuracy = this.getPositionalAccuracy();
            List<JAXBElement<? extends AbstractPositionalAccuracyType>> rhsPositionalAccuracy;
            rhsPositionalAccuracy = that.getPositionalAccuracy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "positionalAccuracy", lhsPositionalAccuracy), LocatorUtils.property(thatLocator, "positionalAccuracy", rhsPositionalAccuracy), lhsPositionalAccuracy, rhsPositionalAccuracy)) {
                return false;
            }
        }
        {
            CRSRefType lhsSourceCRS;
            lhsSourceCRS = this.getSourceCRS();
            CRSRefType rhsSourceCRS;
            rhsSourceCRS = that.getSourceCRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCRS", lhsSourceCRS), LocatorUtils.property(thatLocator, "sourceCRS", rhsSourceCRS), lhsSourceCRS, rhsSourceCRS)) {
                return false;
            }
        }
        {
            CRSRefType lhsTargetCRS;
            lhsTargetCRS = this.getTargetCRS();
            CRSRefType rhsTargetCRS;
            rhsTargetCRS = that.getTargetCRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetCRS", lhsTargetCRS), LocatorUtils.property(thatLocator, "targetCRS", rhsTargetCRS), lhsTargetCRS, rhsTargetCRS)) {
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
            List<IdentifierType> theCoordinateOperationID;
            theCoordinateOperationID = this.getCoordinateOperationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateOperationID", theCoordinateOperationID), currentHashCode, theCoordinateOperationID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            String theOperationVersion;
            theOperationVersion = this.getOperationVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationVersion", theOperationVersion), currentHashCode, theOperationVersion);
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
        {
            List<JAXBElement<? extends AbstractPositionalAccuracyType>> thePositionalAccuracy;
            thePositionalAccuracy = this.getPositionalAccuracy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "positionalAccuracy", thePositionalAccuracy), currentHashCode, thePositionalAccuracy);
        }
        {
            CRSRefType theSourceCRS;
            theSourceCRS = this.getSourceCRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCRS", theSourceCRS), currentHashCode, theSourceCRS);
        }
        {
            CRSRefType theTargetCRS;
            theTargetCRS = this.getTargetCRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetCRS", theTargetCRS), currentHashCode, theTargetCRS);
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
        if (target instanceof AbstractCoordinateOperationType) {
            final AbstractCoordinateOperationType copy = ((AbstractCoordinateOperationType) target);
            if (this.isSetCoordinateOperationID()) {
                List<IdentifierType> sourceCoordinateOperationID;
                sourceCoordinateOperationID = this.getCoordinateOperationID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyCoordinateOperationID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "coordinateOperationID", sourceCoordinateOperationID), sourceCoordinateOperationID));
                copy.unsetCoordinateOperationID();
                List<IdentifierType> uniqueCoordinateOperationIDl = copy.getCoordinateOperationID();
                uniqueCoordinateOperationIDl.addAll(copyCoordinateOperationID);
            } else {
                copy.unsetCoordinateOperationID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetOperationVersion()) {
                String sourceOperationVersion;
                sourceOperationVersion = this.getOperationVersion();
                String copyOperationVersion = ((String) strategy.copy(LocatorUtils.property(locator, "operationVersion", sourceOperationVersion), sourceOperationVersion));
                copy.setOperationVersion(copyOperationVersion);
            } else {
                copy.operationVersion = null;
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
            if (this.isSetPositionalAccuracy()) {
                List<JAXBElement<? extends AbstractPositionalAccuracyType>> sourcePositionalAccuracy;
                sourcePositionalAccuracy = this.getPositionalAccuracy();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractPositionalAccuracyType>> copyPositionalAccuracy = ((List<JAXBElement<? extends AbstractPositionalAccuracyType>> ) strategy.copy(LocatorUtils.property(locator, "positionalAccuracy", sourcePositionalAccuracy), sourcePositionalAccuracy));
                copy.unsetPositionalAccuracy();
                List<JAXBElement<? extends AbstractPositionalAccuracyType>> uniquePositionalAccuracyl = copy.getPositionalAccuracy();
                uniquePositionalAccuracyl.addAll(copyPositionalAccuracy);
            } else {
                copy.unsetPositionalAccuracy();
            }
            if (this.isSetSourceCRS()) {
                CRSRefType sourceSourceCRS;
                sourceSourceCRS = this.getSourceCRS();
                CRSRefType copySourceCRS = ((CRSRefType) strategy.copy(LocatorUtils.property(locator, "sourceCRS", sourceSourceCRS), sourceSourceCRS));
                copy.setSourceCRS(copySourceCRS);
            } else {
                copy.sourceCRS = null;
            }
            if (this.isSetTargetCRS()) {
                CRSRefType sourceTargetCRS;
                sourceTargetCRS = this.getTargetCRS();
                CRSRefType copyTargetCRS = ((CRSRefType) strategy.copy(LocatorUtils.property(locator, "targetCRS", sourceTargetCRS), sourceTargetCRS));
                copy.setTargetCRS(copyTargetCRS);
            } else {
                copy.targetCRS = null;
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
        if (right instanceof AbstractCoordinateOperationType) {
            final AbstractCoordinateOperationType target = this;
            final AbstractCoordinateOperationType leftObject = ((AbstractCoordinateOperationType) left);
            final AbstractCoordinateOperationType rightObject = ((AbstractCoordinateOperationType) right);
            {
                List<IdentifierType> lhsCoordinateOperationID;
                lhsCoordinateOperationID = leftObject.getCoordinateOperationID();
                List<IdentifierType> rhsCoordinateOperationID;
                rhsCoordinateOperationID = rightObject.getCoordinateOperationID();
                target.unsetCoordinateOperationID();
                List<IdentifierType> uniqueCoordinateOperationIDl = target.getCoordinateOperationID();
                uniqueCoordinateOperationIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "coordinateOperationID", lhsCoordinateOperationID), LocatorUtils.property(rightLocator, "coordinateOperationID", rhsCoordinateOperationID), lhsCoordinateOperationID, rhsCoordinateOperationID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                String lhsOperationVersion;
                lhsOperationVersion = leftObject.getOperationVersion();
                String rhsOperationVersion;
                rhsOperationVersion = rightObject.getOperationVersion();
                target.setOperationVersion(((String) strategy.merge(LocatorUtils.property(leftLocator, "operationVersion", lhsOperationVersion), LocatorUtils.property(rightLocator, "operationVersion", rhsOperationVersion), lhsOperationVersion, rhsOperationVersion)));
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
            {
                List<JAXBElement<? extends AbstractPositionalAccuracyType>> lhsPositionalAccuracy;
                lhsPositionalAccuracy = leftObject.getPositionalAccuracy();
                List<JAXBElement<? extends AbstractPositionalAccuracyType>> rhsPositionalAccuracy;
                rhsPositionalAccuracy = rightObject.getPositionalAccuracy();
                target.unsetPositionalAccuracy();
                List<JAXBElement<? extends AbstractPositionalAccuracyType>> uniquePositionalAccuracyl = target.getPositionalAccuracy();
                uniquePositionalAccuracyl.addAll(((List<JAXBElement<? extends AbstractPositionalAccuracyType>> ) strategy.merge(LocatorUtils.property(leftLocator, "positionalAccuracy", lhsPositionalAccuracy), LocatorUtils.property(rightLocator, "positionalAccuracy", rhsPositionalAccuracy), lhsPositionalAccuracy, rhsPositionalAccuracy)));
            }
            {
                CRSRefType lhsSourceCRS;
                lhsSourceCRS = leftObject.getSourceCRS();
                CRSRefType rhsSourceCRS;
                rhsSourceCRS = rightObject.getSourceCRS();
                target.setSourceCRS(((CRSRefType) strategy.merge(LocatorUtils.property(leftLocator, "sourceCRS", lhsSourceCRS), LocatorUtils.property(rightLocator, "sourceCRS", rhsSourceCRS), lhsSourceCRS, rhsSourceCRS)));
            }
            {
                CRSRefType lhsTargetCRS;
                lhsTargetCRS = leftObject.getTargetCRS();
                CRSRefType rhsTargetCRS;
                rhsTargetCRS = rightObject.getTargetCRS();
                target.setTargetCRS(((CRSRefType) strategy.merge(LocatorUtils.property(leftLocator, "targetCRS", lhsTargetCRS), LocatorUtils.property(rightLocator, "targetCRS", rhsTargetCRS), lhsTargetCRS, rhsTargetCRS)));
            }
        }
    }

    public void setCoordinateOperationID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getCoordinateOperationID();
        draftl.addAll(value);
    }

    public void setPositionalAccuracy(List<JAXBElement<? extends AbstractPositionalAccuracyType>> value) {
        List<JAXBElement<? extends AbstractPositionalAccuracyType>> draftl = this.getPositionalAccuracy();
        draftl.addAll(value);
    }

}
