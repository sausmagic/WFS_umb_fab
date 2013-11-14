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
 * A non-abstract generic collection type that can be used as a document element for a collection of any GML types - Geometries, Topologies, Features ...
 * 
 * FeatureCollections may only contain Features.  GeometryCollections may only contain Geometrys.  Bags are less constrained  they must contain objects that are substitutable for gml:_Object.  This may mix several levels, including Features, Definitions, Dictionaries, Geometries etc.  
 * 
 * The content model would ideally be 
 *    member 0..*
 *    members 0..1
 *    member 0..*
 * for maximum flexibility in building a collection from both homogeneous and distinct components: 
 * included "member" elements each contain a single Object
 * an included "members" element contains a set of Objects 
 * 
 * However, this is non-deterministic, thus prohibited by XSD.
 * 
 * <p>Java-Klasse für BagType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BagType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}member" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}members" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagType", propOrder = {
    "member",
    "members"
})
public class BagType
    extends AbstractGMLType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<AssociationType> member;
    protected ArrayAssociationType members;

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationType }
     * 
     * 
     */
    public List<AssociationType> getMember() {
        if (member == null) {
            member = new ArrayList<AssociationType>();
        }
        return this.member;
    }

    public boolean isSetMember() {
        return ((this.member!= null)&&(!this.member.isEmpty()));
    }

    public void unsetMember() {
        this.member = null;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayAssociationType }
     *     
     */
    public ArrayAssociationType getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayAssociationType }
     *     
     */
    public void setMembers(ArrayAssociationType value) {
        this.members = value;
    }

    public boolean isSetMembers() {
        return (this.members!= null);
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
            List<AssociationType> theMember;
            theMember = this.getMember();
            strategy.appendField(locator, this, "member", buffer, theMember);
        }
        {
            ArrayAssociationType theMembers;
            theMembers = this.getMembers();
            strategy.appendField(locator, this, "members", buffer, theMembers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BagType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BagType that = ((BagType) object);
        {
            List<AssociationType> lhsMember;
            lhsMember = this.getMember();
            List<AssociationType> rhsMember;
            rhsMember = that.getMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "member", lhsMember), LocatorUtils.property(thatLocator, "member", rhsMember), lhsMember, rhsMember)) {
                return false;
            }
        }
        {
            ArrayAssociationType lhsMembers;
            lhsMembers = this.getMembers();
            ArrayAssociationType rhsMembers;
            rhsMembers = that.getMembers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "members", lhsMembers), LocatorUtils.property(thatLocator, "members", rhsMembers), lhsMembers, rhsMembers)) {
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
            List<AssociationType> theMember;
            theMember = this.getMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "member", theMember), currentHashCode, theMember);
        }
        {
            ArrayAssociationType theMembers;
            theMembers = this.getMembers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "members", theMembers), currentHashCode, theMembers);
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
        if (draftCopy instanceof BagType) {
            final BagType copy = ((BagType) draftCopy);
            if (this.isSetMember()) {
                List<AssociationType> sourceMember;
                sourceMember = this.getMember();
                @SuppressWarnings("unchecked")
                List<AssociationType> copyMember = ((List<AssociationType> ) strategy.copy(LocatorUtils.property(locator, "member", sourceMember), sourceMember));
                copy.unsetMember();
                List<AssociationType> uniqueMemberl = copy.getMember();
                uniqueMemberl.addAll(copyMember);
            } else {
                copy.unsetMember();
            }
            if (this.isSetMembers()) {
                ArrayAssociationType sourceMembers;
                sourceMembers = this.getMembers();
                ArrayAssociationType copyMembers = ((ArrayAssociationType) strategy.copy(LocatorUtils.property(locator, "members", sourceMembers), sourceMembers));
                copy.setMembers(copyMembers);
            } else {
                copy.members = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BagType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof BagType) {
            final BagType target = this;
            final BagType leftObject = ((BagType) left);
            final BagType rightObject = ((BagType) right);
            {
                List<AssociationType> lhsMember;
                lhsMember = leftObject.getMember();
                List<AssociationType> rhsMember;
                rhsMember = rightObject.getMember();
                target.unsetMember();
                List<AssociationType> uniqueMemberl = target.getMember();
                uniqueMemberl.addAll(((List<AssociationType> ) strategy.merge(LocatorUtils.property(leftLocator, "member", lhsMember), LocatorUtils.property(rightLocator, "member", rhsMember), lhsMember, rhsMember)));
            }
            {
                ArrayAssociationType lhsMembers;
                lhsMembers = leftObject.getMembers();
                ArrayAssociationType rhsMembers;
                rhsMembers = rightObject.getMembers();
                target.setMembers(((ArrayAssociationType) strategy.merge(LocatorUtils.property(leftLocator, "members", lhsMembers), LocatorUtils.property(rightLocator, "members", rhsMembers), lhsMembers, rhsMembers)));
            }
        }
    }

    public void setMember(List<AssociationType> value) {
        List<AssociationType> draftl = this.getMember();
        draftl.addAll(value);
    }

}
