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
 * An ellipsoid is a geometric figure that can be used to describe the approximate shape of the earth. In mathematical terms, it is a surface formed by the rotation of an ellipse about its minor axis.
 * 
 * <p>Java-Klasse für EllipsoidType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EllipsoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}EllipsoidBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}ellipsoidID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}semiMajorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml}secondDefiningParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EllipsoidType", propOrder = {
    "ellipsoidID",
    "remarks",
    "semiMajorAxis",
    "secondDefiningParameter"
})
public class EllipsoidType
    extends EllipsoidBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> ellipsoidID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected MeasureType semiMajorAxis;
    @XmlElement(required = true)
    protected SecondDefiningParameterType secondDefiningParameter;

    /**
     * Set of alternative identifications of this ellipsoid. The first ellipsoidID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the ellipsoidID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ellipsoidID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEllipsoidID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getEllipsoidID() {
        if (ellipsoidID == null) {
            ellipsoidID = new ArrayList<IdentifierType>();
        }
        return this.ellipsoidID;
    }

    public boolean isSetEllipsoidID() {
        return ((this.ellipsoidID!= null)&&(!this.ellipsoidID.isEmpty()));
    }

    public void unsetEllipsoidID() {
        this.ellipsoidID = null;
    }

    /**
     * Comments on or information about this ellipsoid, including source information. 
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
     * Ruft den Wert der semiMajorAxis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * Legt den Wert der semiMajorAxis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSemiMajorAxis(MeasureType value) {
        this.semiMajorAxis = value;
    }

    public boolean isSetSemiMajorAxis() {
        return (this.semiMajorAxis!= null);
    }

    /**
     * Ruft den Wert der secondDefiningParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameterType }
     *     
     */
    public SecondDefiningParameterType getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * Legt den Wert der secondDefiningParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameterType }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameterType value) {
        this.secondDefiningParameter = value;
    }

    public boolean isSetSecondDefiningParameter() {
        return (this.secondDefiningParameter!= null);
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
            List<IdentifierType> theEllipsoidID;
            theEllipsoidID = this.getEllipsoidID();
            strategy.appendField(locator, this, "ellipsoidID", buffer, theEllipsoidID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            MeasureType theSemiMajorAxis;
            theSemiMajorAxis = this.getSemiMajorAxis();
            strategy.appendField(locator, this, "semiMajorAxis", buffer, theSemiMajorAxis);
        }
        {
            SecondDefiningParameterType theSecondDefiningParameter;
            theSecondDefiningParameter = this.getSecondDefiningParameter();
            strategy.appendField(locator, this, "secondDefiningParameter", buffer, theSecondDefiningParameter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EllipsoidType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EllipsoidType that = ((EllipsoidType) object);
        {
            List<IdentifierType> lhsEllipsoidID;
            lhsEllipsoidID = this.getEllipsoidID();
            List<IdentifierType> rhsEllipsoidID;
            rhsEllipsoidID = that.getEllipsoidID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ellipsoidID", lhsEllipsoidID), LocatorUtils.property(thatLocator, "ellipsoidID", rhsEllipsoidID), lhsEllipsoidID, rhsEllipsoidID)) {
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
            MeasureType lhsSemiMajorAxis;
            lhsSemiMajorAxis = this.getSemiMajorAxis();
            MeasureType rhsSemiMajorAxis;
            rhsSemiMajorAxis = that.getSemiMajorAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "semiMajorAxis", lhsSemiMajorAxis), LocatorUtils.property(thatLocator, "semiMajorAxis", rhsSemiMajorAxis), lhsSemiMajorAxis, rhsSemiMajorAxis)) {
                return false;
            }
        }
        {
            SecondDefiningParameterType lhsSecondDefiningParameter;
            lhsSecondDefiningParameter = this.getSecondDefiningParameter();
            SecondDefiningParameterType rhsSecondDefiningParameter;
            rhsSecondDefiningParameter = that.getSecondDefiningParameter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondDefiningParameter", lhsSecondDefiningParameter), LocatorUtils.property(thatLocator, "secondDefiningParameter", rhsSecondDefiningParameter), lhsSecondDefiningParameter, rhsSecondDefiningParameter)) {
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
            List<IdentifierType> theEllipsoidID;
            theEllipsoidID = this.getEllipsoidID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ellipsoidID", theEllipsoidID), currentHashCode, theEllipsoidID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            MeasureType theSemiMajorAxis;
            theSemiMajorAxis = this.getSemiMajorAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semiMajorAxis", theSemiMajorAxis), currentHashCode, theSemiMajorAxis);
        }
        {
            SecondDefiningParameterType theSecondDefiningParameter;
            theSecondDefiningParameter = this.getSecondDefiningParameter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondDefiningParameter", theSecondDefiningParameter), currentHashCode, theSecondDefiningParameter);
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
        if (draftCopy instanceof EllipsoidType) {
            final EllipsoidType copy = ((EllipsoidType) draftCopy);
            if (this.isSetEllipsoidID()) {
                List<IdentifierType> sourceEllipsoidID;
                sourceEllipsoidID = this.getEllipsoidID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyEllipsoidID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "ellipsoidID", sourceEllipsoidID), sourceEllipsoidID));
                copy.unsetEllipsoidID();
                List<IdentifierType> uniqueEllipsoidIDl = copy.getEllipsoidID();
                uniqueEllipsoidIDl.addAll(copyEllipsoidID);
            } else {
                copy.unsetEllipsoidID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetSemiMajorAxis()) {
                MeasureType sourceSemiMajorAxis;
                sourceSemiMajorAxis = this.getSemiMajorAxis();
                MeasureType copySemiMajorAxis = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "semiMajorAxis", sourceSemiMajorAxis), sourceSemiMajorAxis));
                copy.setSemiMajorAxis(copySemiMajorAxis);
            } else {
                copy.semiMajorAxis = null;
            }
            if (this.isSetSecondDefiningParameter()) {
                SecondDefiningParameterType sourceSecondDefiningParameter;
                sourceSecondDefiningParameter = this.getSecondDefiningParameter();
                SecondDefiningParameterType copySecondDefiningParameter = ((SecondDefiningParameterType) strategy.copy(LocatorUtils.property(locator, "secondDefiningParameter", sourceSecondDefiningParameter), sourceSecondDefiningParameter));
                copy.setSecondDefiningParameter(copySecondDefiningParameter);
            } else {
                copy.secondDefiningParameter = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EllipsoidType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EllipsoidType) {
            final EllipsoidType target = this;
            final EllipsoidType leftObject = ((EllipsoidType) left);
            final EllipsoidType rightObject = ((EllipsoidType) right);
            {
                List<IdentifierType> lhsEllipsoidID;
                lhsEllipsoidID = leftObject.getEllipsoidID();
                List<IdentifierType> rhsEllipsoidID;
                rhsEllipsoidID = rightObject.getEllipsoidID();
                target.unsetEllipsoidID();
                List<IdentifierType> uniqueEllipsoidIDl = target.getEllipsoidID();
                uniqueEllipsoidIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "ellipsoidID", lhsEllipsoidID), LocatorUtils.property(rightLocator, "ellipsoidID", rhsEllipsoidID), lhsEllipsoidID, rhsEllipsoidID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                MeasureType lhsSemiMajorAxis;
                lhsSemiMajorAxis = leftObject.getSemiMajorAxis();
                MeasureType rhsSemiMajorAxis;
                rhsSemiMajorAxis = rightObject.getSemiMajorAxis();
                target.setSemiMajorAxis(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "semiMajorAxis", lhsSemiMajorAxis), LocatorUtils.property(rightLocator, "semiMajorAxis", rhsSemiMajorAxis), lhsSemiMajorAxis, rhsSemiMajorAxis)));
            }
            {
                SecondDefiningParameterType lhsSecondDefiningParameter;
                lhsSecondDefiningParameter = leftObject.getSecondDefiningParameter();
                SecondDefiningParameterType rhsSecondDefiningParameter;
                rhsSecondDefiningParameter = rightObject.getSecondDefiningParameter();
                target.setSecondDefiningParameter(((SecondDefiningParameterType) strategy.merge(LocatorUtils.property(leftLocator, "secondDefiningParameter", lhsSecondDefiningParameter), LocatorUtils.property(rightLocator, "secondDefiningParameter", rhsSecondDefiningParameter), lhsSecondDefiningParameter, rhsSecondDefiningParameter)));
            }
        }
    }

    public void setEllipsoidID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getEllipsoidID();
        draftl.addAll(value);
    }

}
