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
 * A prime meridian defines the origin from which longitude values are determined.
 * 
 * <p>Java-Klasse für PrimeMeridianType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrimeMeridianType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}PrimeMeridianBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}meridianID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}greenwichLongitude"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimeMeridianType", propOrder = {
    "meridianID",
    "remarks",
    "greenwichLongitude"
})
public class PrimeMeridianType
    extends PrimeMeridianBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<IdentifierType> meridianID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected AngleChoiceType greenwichLongitude;

    /**
     * Set of alternative identifications of this prime meridian. The first meridianID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the meridianID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meridianID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeridianID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getMeridianID() {
        if (meridianID == null) {
            meridianID = new ArrayList<IdentifierType>();
        }
        return this.meridianID;
    }

    public boolean isSetMeridianID() {
        return ((this.meridianID!= null)&&(!this.meridianID.isEmpty()));
    }

    public void unsetMeridianID() {
        this.meridianID = null;
    }

    /**
     * Comments on or information about this prime meridian, including source information. 
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
     * Ruft den Wert der greenwichLongitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleChoiceType }
     *     
     */
    public AngleChoiceType getGreenwichLongitude() {
        return greenwichLongitude;
    }

    /**
     * Legt den Wert der greenwichLongitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleChoiceType }
     *     
     */
    public void setGreenwichLongitude(AngleChoiceType value) {
        this.greenwichLongitude = value;
    }

    public boolean isSetGreenwichLongitude() {
        return (this.greenwichLongitude!= null);
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
            List<IdentifierType> theMeridianID;
            theMeridianID = this.getMeridianID();
            strategy.appendField(locator, this, "meridianID", buffer, theMeridianID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            AngleChoiceType theGreenwichLongitude;
            theGreenwichLongitude = this.getGreenwichLongitude();
            strategy.appendField(locator, this, "greenwichLongitude", buffer, theGreenwichLongitude);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PrimeMeridianType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PrimeMeridianType that = ((PrimeMeridianType) object);
        {
            List<IdentifierType> lhsMeridianID;
            lhsMeridianID = this.getMeridianID();
            List<IdentifierType> rhsMeridianID;
            rhsMeridianID = that.getMeridianID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meridianID", lhsMeridianID), LocatorUtils.property(thatLocator, "meridianID", rhsMeridianID), lhsMeridianID, rhsMeridianID)) {
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
            AngleChoiceType lhsGreenwichLongitude;
            lhsGreenwichLongitude = this.getGreenwichLongitude();
            AngleChoiceType rhsGreenwichLongitude;
            rhsGreenwichLongitude = that.getGreenwichLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "greenwichLongitude", lhsGreenwichLongitude), LocatorUtils.property(thatLocator, "greenwichLongitude", rhsGreenwichLongitude), lhsGreenwichLongitude, rhsGreenwichLongitude)) {
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
            List<IdentifierType> theMeridianID;
            theMeridianID = this.getMeridianID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meridianID", theMeridianID), currentHashCode, theMeridianID);
        }
        {
            StringOrRefType theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks);
        }
        {
            AngleChoiceType theGreenwichLongitude;
            theGreenwichLongitude = this.getGreenwichLongitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "greenwichLongitude", theGreenwichLongitude), currentHashCode, theGreenwichLongitude);
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
        if (draftCopy instanceof PrimeMeridianType) {
            final PrimeMeridianType copy = ((PrimeMeridianType) draftCopy);
            if (this.isSetMeridianID()) {
                List<IdentifierType> sourceMeridianID;
                sourceMeridianID = this.getMeridianID();
                @SuppressWarnings("unchecked")
                List<IdentifierType> copyMeridianID = ((List<IdentifierType> ) strategy.copy(LocatorUtils.property(locator, "meridianID", sourceMeridianID), sourceMeridianID));
                copy.unsetMeridianID();
                List<IdentifierType> uniqueMeridianIDl = copy.getMeridianID();
                uniqueMeridianIDl.addAll(copyMeridianID);
            } else {
                copy.unsetMeridianID();
            }
            if (this.isSetRemarks()) {
                StringOrRefType sourceRemarks;
                sourceRemarks = this.getRemarks();
                StringOrRefType copyRemarks = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "remarks", sourceRemarks), sourceRemarks));
                copy.setRemarks(copyRemarks);
            } else {
                copy.remarks = null;
            }
            if (this.isSetGreenwichLongitude()) {
                AngleChoiceType sourceGreenwichLongitude;
                sourceGreenwichLongitude = this.getGreenwichLongitude();
                AngleChoiceType copyGreenwichLongitude = ((AngleChoiceType) strategy.copy(LocatorUtils.property(locator, "greenwichLongitude", sourceGreenwichLongitude), sourceGreenwichLongitude));
                copy.setGreenwichLongitude(copyGreenwichLongitude);
            } else {
                copy.greenwichLongitude = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PrimeMeridianType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof PrimeMeridianType) {
            final PrimeMeridianType target = this;
            final PrimeMeridianType leftObject = ((PrimeMeridianType) left);
            final PrimeMeridianType rightObject = ((PrimeMeridianType) right);
            {
                List<IdentifierType> lhsMeridianID;
                lhsMeridianID = leftObject.getMeridianID();
                List<IdentifierType> rhsMeridianID;
                rhsMeridianID = rightObject.getMeridianID();
                target.unsetMeridianID();
                List<IdentifierType> uniqueMeridianIDl = target.getMeridianID();
                uniqueMeridianIDl.addAll(((List<IdentifierType> ) strategy.merge(LocatorUtils.property(leftLocator, "meridianID", lhsMeridianID), LocatorUtils.property(rightLocator, "meridianID", rhsMeridianID), lhsMeridianID, rhsMeridianID)));
            }
            {
                StringOrRefType lhsRemarks;
                lhsRemarks = leftObject.getRemarks();
                StringOrRefType rhsRemarks;
                rhsRemarks = rightObject.getRemarks();
                target.setRemarks(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "remarks", lhsRemarks), LocatorUtils.property(rightLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks)));
            }
            {
                AngleChoiceType lhsGreenwichLongitude;
                lhsGreenwichLongitude = leftObject.getGreenwichLongitude();
                AngleChoiceType rhsGreenwichLongitude;
                rhsGreenwichLongitude = rightObject.getGreenwichLongitude();
                target.setGreenwichLongitude(((AngleChoiceType) strategy.merge(LocatorUtils.property(leftLocator, "greenwichLongitude", lhsGreenwichLongitude), LocatorUtils.property(rightLocator, "greenwichLongitude", rhsGreenwichLongitude), lhsGreenwichLongitude, rhsGreenwichLongitude)));
            }
        }
    }

    public void setMeridianID(List<IdentifierType> value) {
        List<IdentifierType> draftl = this.getMeridianID();
        draftl.addAll(value);
    }

}
