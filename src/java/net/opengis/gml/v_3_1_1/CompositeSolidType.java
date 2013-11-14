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
 * A composite solid is a geometry type with all the geometric properties of a (primitive) solid. 
 * 				Essentially, a composite solid is a collection of solids that join in pairs on common boundary surfaces and which, when considered as a whole, form a single solid.
 * 
 * <p>Java-Klasse für CompositeSolidType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompositeSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSolidType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}solidMember" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeSolidType", propOrder = {
    "solidMember"
})
public class CompositeSolidType
    extends AbstractSolidType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<SolidPropertyType> solidMember;

    /**
     * This element references or contains one solid in the composite solid. The solids are contiguous.
     * NOTE: This definition allows for a nested structure, i.e. a CompositeSolid may use, for example, another CompositeSolid as a member.Gets the value of the solidMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solidMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolidMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolidPropertyType }
     * 
     * 
     */
    public List<SolidPropertyType> getSolidMember() {
        if (solidMember == null) {
            solidMember = new ArrayList<SolidPropertyType>();
        }
        return this.solidMember;
    }

    public boolean isSetSolidMember() {
        return ((this.solidMember!= null)&&(!this.solidMember.isEmpty()));
    }

    public void unsetSolidMember() {
        this.solidMember = null;
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
            List<SolidPropertyType> theSolidMember;
            theSolidMember = this.getSolidMember();
            strategy.appendField(locator, this, "solidMember", buffer, theSolidMember);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompositeSolidType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompositeSolidType that = ((CompositeSolidType) object);
        {
            List<SolidPropertyType> lhsSolidMember;
            lhsSolidMember = this.getSolidMember();
            List<SolidPropertyType> rhsSolidMember;
            rhsSolidMember = that.getSolidMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solidMember", lhsSolidMember), LocatorUtils.property(thatLocator, "solidMember", rhsSolidMember), lhsSolidMember, rhsSolidMember)) {
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
            List<SolidPropertyType> theSolidMember;
            theSolidMember = this.getSolidMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "solidMember", theSolidMember), currentHashCode, theSolidMember);
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
        if (draftCopy instanceof CompositeSolidType) {
            final CompositeSolidType copy = ((CompositeSolidType) draftCopy);
            if (this.isSetSolidMember()) {
                List<SolidPropertyType> sourceSolidMember;
                sourceSolidMember = this.getSolidMember();
                @SuppressWarnings("unchecked")
                List<SolidPropertyType> copySolidMember = ((List<SolidPropertyType> ) strategy.copy(LocatorUtils.property(locator, "solidMember", sourceSolidMember), sourceSolidMember));
                copy.unsetSolidMember();
                List<SolidPropertyType> uniqueSolidMemberl = copy.getSolidMember();
                uniqueSolidMemberl.addAll(copySolidMember);
            } else {
                copy.unsetSolidMember();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CompositeSolidType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CompositeSolidType) {
            final CompositeSolidType target = this;
            final CompositeSolidType leftObject = ((CompositeSolidType) left);
            final CompositeSolidType rightObject = ((CompositeSolidType) right);
            {
                List<SolidPropertyType> lhsSolidMember;
                lhsSolidMember = leftObject.getSolidMember();
                List<SolidPropertyType> rhsSolidMember;
                rhsSolidMember = rightObject.getSolidMember();
                target.unsetSolidMember();
                List<SolidPropertyType> uniqueSolidMemberl = target.getSolidMember();
                uniqueSolidMemberl.addAll(((List<SolidPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "solidMember", lhsSolidMember), LocatorUtils.property(rightLocator, "solidMember", rhsSolidMember), lhsSolidMember, rhsSolidMember)));
            }
        }
    }

    public void setSolidMember(List<SolidPropertyType> value) {
        List<SolidPropertyType> draftl = this.getSolidMember();
        draftl.addAll(value);
    }

}
