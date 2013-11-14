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
 * A Ring is used to represent a single connected component of a surface boundary. It consists of a sequence of curves connected in a cycle (an object whose boundary is empty).
 * A Ring is structurally similar to a composite curve in that the endPoint of each curve in the sequence is the startPoint of the next curve in the Sequence. Since the sequence is circular, there is no exception to this rule. Each ring, like all boundaries, is a cycle and each ring is simple.
 * NOTE: Even though each Ring is simple, the boundary need not be simple. The easiest case of this is where one of the interior rings of a surface is tangent to its exterior ring.
 * 
 * <p>Java-Klasse für RingType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractRingType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}curveMember" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RingType", propOrder = {
    "curveMember"
})
public class RingType
    extends AbstractRingType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<CurvePropertyType> curveMember;

    /**
     * This element references or contains one curve in the composite curve. The curves are contiguous, the collection of curves is ordered.
     * NOTE: This definition allows for a nested structure, i.e. a CompositeCurve may use, for example, another CompositeCurve as a curve member.Gets the value of the curveMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curveMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurveMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurvePropertyType }
     * 
     * 
     */
    public List<CurvePropertyType> getCurveMember() {
        if (curveMember == null) {
            curveMember = new ArrayList<CurvePropertyType>();
        }
        return this.curveMember;
    }

    public boolean isSetCurveMember() {
        return ((this.curveMember!= null)&&(!this.curveMember.isEmpty()));
    }

    public void unsetCurveMember() {
        this.curveMember = null;
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
            List<CurvePropertyType> theCurveMember;
            theCurveMember = this.getCurveMember();
            strategy.appendField(locator, this, "curveMember", buffer, theCurveMember);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RingType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RingType that = ((RingType) object);
        {
            List<CurvePropertyType> lhsCurveMember;
            lhsCurveMember = this.getCurveMember();
            List<CurvePropertyType> rhsCurveMember;
            rhsCurveMember = that.getCurveMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curveMember", lhsCurveMember), LocatorUtils.property(thatLocator, "curveMember", rhsCurveMember), lhsCurveMember, rhsCurveMember)) {
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
            List<CurvePropertyType> theCurveMember;
            theCurveMember = this.getCurveMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curveMember", theCurveMember), currentHashCode, theCurveMember);
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
        if (draftCopy instanceof RingType) {
            final RingType copy = ((RingType) draftCopy);
            if (this.isSetCurveMember()) {
                List<CurvePropertyType> sourceCurveMember;
                sourceCurveMember = this.getCurveMember();
                @SuppressWarnings("unchecked")
                List<CurvePropertyType> copyCurveMember = ((List<CurvePropertyType> ) strategy.copy(LocatorUtils.property(locator, "curveMember", sourceCurveMember), sourceCurveMember));
                copy.unsetCurveMember();
                List<CurvePropertyType> uniqueCurveMemberl = copy.getCurveMember();
                uniqueCurveMemberl.addAll(copyCurveMember);
            } else {
                copy.unsetCurveMember();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RingType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof RingType) {
            final RingType target = this;
            final RingType leftObject = ((RingType) left);
            final RingType rightObject = ((RingType) right);
            {
                List<CurvePropertyType> lhsCurveMember;
                lhsCurveMember = leftObject.getCurveMember();
                List<CurvePropertyType> rhsCurveMember;
                rhsCurveMember = rightObject.getCurveMember();
                target.unsetCurveMember();
                List<CurvePropertyType> uniqueCurveMemberl = target.getCurveMember();
                uniqueCurveMemberl.addAll(((List<CurvePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "curveMember", lhsCurveMember), LocatorUtils.property(rightLocator, "curveMember", rhsCurveMember), lhsCurveMember, rhsCurveMember)));
            }
        }
    }

    public void setCurveMember(List<CurvePropertyType> value) {
        List<CurvePropertyType> draftl = this.getCurveMember();
        draftl.addAll(value);
    }

}
