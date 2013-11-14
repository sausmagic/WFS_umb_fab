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
 * Definition of a coordinate system axis. 
 * 
 * <p>Java-Klasse für CoordinateSystemAxisType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemAxisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}CoordinateSystemAxisBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}axisID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}axisAbbrev"/>
 *         &lt;element ref="{http://www.opengis.net/gml}axisDirection"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml}uom use="required""/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
    "axisID",
    "remarks",
    "axisAbbrev",
    "axisDirection"
})
public class CoordinateSystemAxisType
    extends CoordinateSystemAxisBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> axisID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected CodeType axisAbbrev;
    @XmlElement(required = true)
    protected CodeType axisDirection;
    @XmlAttribute(name = "uom", namespace = "http://www.opengis.net/gml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uom;

    /**
     * Set of alternative identifications of this coordinate system axis. The first axisID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the axisID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getAxisID() {
        if (axisID == null) {
            axisID = new ArrayList<IdentifierType>();
        }
        return this.axisID;
    }

    public boolean isSetAxisID() {
        return ((this.axisID!= null)&&(!this.axisID.isEmpty()));
    }

    public void unsetAxisID() {
        this.axisID = null;
    }

    /**
     * Comments on or information about this coordinate system axis, including data source information. 
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
     * Ruft den Wert der axisAbbrev-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAxisAbbrev() {
        return axisAbbrev;
    }

    /**
     * Legt den Wert der axisAbbrev-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAxisAbbrev(CodeType value) {
        this.axisAbbrev = value;
    }

    public boolean isSetAxisAbbrev() {
        return (this.axisAbbrev!= null);
    }

    /**
     * Ruft den Wert der axisDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAxisDirection() {
        return axisDirection;
    }

    /**
     * Legt den Wert der axisDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAxisDirection(CodeType value) {
        this.axisDirection = value;
    }

    public boolean isSetAxisDirection() {
        return (this.axisDirection!= null);
    }

    /**
     * Ruft den Wert der uom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Legt den Wert der uom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
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
            List<IdentifierType> theAxisID;
            theAxisID = this.getAxisID();
            strategy.appendField(locator, this, "axisID", buffer, theAxisID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            CodeType theAxisAbbrev;
            theAxisAbbrev = this.getAxisAbbrev();
            strategy.appendField(locator, this, "axisAbbrev", buffer, theAxisAbbrev);
        }
        {
            CodeType theAxisDirection;
            theAxisDirection = this.getAxisDirection();
            strategy.appendField(locator, this, "axisDirection", buffer, theAxisDirection);
        }
        {
            String theUom;
            theUom = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theUom);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CoordinateSystemAxisType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CoordinateSystemAxisType that = ((CoordinateSystemAxisType) object);
        {
            List<IdentifierType> lhsAxisID;
            lhsAxisID = this.getAxisID();
            List<IdentifierType> rhsAxisID;
            rhsAxisID = that.getAxisID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisID", lhsAxisID), LocatorUtils.property(thatLocator, "axisID", rhsAxisID), lhsAxisID, rhsAxisID)) {
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
            CodeType lhsAxisAbbrev;
            lhsAxisAbbrev = this.getAxisAbbrev();
            CodeType rhsAxisAbbrev;
            rhsAxisAbbrev = that.getAxisAbbrev();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisAbbrev", lhsAxisAbbrev), LocatorUtils.property(thatLocator, "axisAbbrev", rhsAxisAbbrev), lhsAxisAbbrev, rhsAxisAbbrev)) {
                return false;
            }
        }
        {
            CodeType lhsAxisDirection;
            lhsAxisDirection = this.getAxisDirection();
            CodeType rhsAxisDirection;
            rhsAxisDirection = that.getAxisDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisDirection", lhsAxisDirection), LocatorUtils.property(thatLocator, "axisDirection", rhsAxisDirection), lhsAxisDirection, rhsAxisDirection)) {
                return false;
            }
        }
        {
            String lhsUom;
            lhsUom = this.getUom();
            String rhsUom;
            rhsUom = that.getUom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uom", lhsUom), LocatorUtils.property(thatLocator, "uom", rhsUom), lhsUom, rhsUom)) {
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
            List<IdentifierType> theAxisID;
            theAxisID = this.getAxisID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisID", theAxisID), currentHashCode, theAxisID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            CodeType theAxisAbbrev;
            theAxisAbbrev = this.getAxisAbbrev();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisAbbrev", theAxisAbbrev), currentHashCode, theAxisAbbrev);
        }
        {
            CodeType theAxisDirection;
            theAxisDirection = this.getAxisDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisDirection", theAxisDirection), currentHashCode, theAxisDirection);
        }
        {
            String theUom;
            theUom = this.getUom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uom", theUom), currentHashCode, theUom);
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
        if (draftCopy instanceof CoordinateSystemAxisType) {
            final CoordinateSystemAxisType copy = ((CoordinateSystemAxisType) draftCopy);
            if (this.isSetAxisID()) {
                List<IdentifierType> sourceAxisID;
                sourceAxisID = this.getAxisID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyAxisID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "axisID", sourceAxisID), sourceAxisID));
                copy.unsetAxisID();
                List<IdentifierType> uniqueAxisIDl = copy.getAxisID();
                uniqueAxisIDl.addAll(copyAxisID);
            } else {
                copy.unsetAxisID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetAxisAbbrev()) {
                CodeType sourceAxisAbbrev;
                sourceAxisAbbrev = this.getAxisAbbrev();
                CodeType copyAxisAbbrev = ((CodeType) strategy.copy(LocatorUtils.property(locator, "axisAbbrev", sourceAxisAbbrev), sourceAxisAbbrev));
                copy.setAxisAbbrev(copyAxisAbbrev);
            } else {
                copy.axisAbbrev = null;
            }
            if (this.isSetAxisDirection()) {
                CodeType sourceAxisDirection;
                sourceAxisDirection = this.getAxisDirection();
                CodeType copyAxisDirection = ((CodeType) strategy.copy(LocatorUtils.property(locator, "axisDirection", sourceAxisDirection), sourceAxisDirection));
                copy.setAxisDirection(copyAxisDirection);
            } else {
                copy.axisDirection = null;
            }
            if (this.isSetUom()) {
                String sourceUom;
                sourceUom = this.getUom();
                String copyUom = ((String) strategy.copy(LocatorUtils.property(locator, "uom", sourceUom), sourceUom));
                copy.setUom(copyUom);
            } else {
                copy.uom = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CoordinateSystemAxisType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CoordinateSystemAxisType) {
            final CoordinateSystemAxisType target = this;
            final CoordinateSystemAxisType leftObject = ((CoordinateSystemAxisType) left);
            final CoordinateSystemAxisType rightObject = ((CoordinateSystemAxisType) right);
            {
                List<IdentifierType> lhsAxisID;
                lhsAxisID = leftObject.getAxisID();
                List<IdentifierType> rhsAxisID;
                rhsAxisID = rightObject.getAxisID();
                target.unsetAxisID();
                List<IdentifierType> uniqueAxisIDl = target.getAxisID();
                uniqueAxisIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "axisID", lhsAxisID), LocatorUtils.property(rightLocator, "axisID", rhsAxisID), lhsAxisID, rhsAxisID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                CodeType lhsAxisAbbrev;
                lhsAxisAbbrev = leftObject.getAxisAbbrev();
                CodeType rhsAxisAbbrev;
                rhsAxisAbbrev = rightObject.getAxisAbbrev();
                target.setAxisAbbrev(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "axisAbbrev", lhsAxisAbbrev), LocatorUtils.property(rightLocator, "axisAbbrev", rhsAxisAbbrev), lhsAxisAbbrev, rhsAxisAbbrev)));
            }
            {
                CodeType lhsAxisDirection;
                lhsAxisDirection = leftObject.getAxisDirection();
                CodeType rhsAxisDirection;
                rhsAxisDirection = rightObject.getAxisDirection();
                target.setAxisDirection(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "axisDirection", lhsAxisDirection), LocatorUtils.property(rightLocator, "axisDirection", rhsAxisDirection), lhsAxisDirection, rhsAxisDirection)));
            }
            {
                String lhsUom;
                lhsUom = leftObject.getUom();
                String rhsUom;
                rhsUom = rightObject.getUom();
                target.setUom(((String) strategy.merge(LocatorUtils.property(leftLocator, "uom", lhsUom), LocatorUtils.property(rightLocator, "uom", rhsUom), lhsUom, rhsUom)));
            }
        }
    }

    public void setAxisID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getAxisID();
        draftl.addAll(value);
    }

}
