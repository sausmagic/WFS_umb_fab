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
 * A container for an array of curve segments.
 * 
 * <p>Java-Klasse für CurveSegmentArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurveSegmentArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_CurveSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveSegmentArrayPropertyType", propOrder = {
    "curveSegment"
})
public class CurveSegmentArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_CurveSegment", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractCurveSegmentType>> curveSegment;

    /**
     * Gets the value of the curveSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curveSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurveSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractCurveSegmentType>> getCurveSegment() {
        if (curveSegment == null) {
            curveSegment = new ArrayList<JAXBElement<? extends AbstractCurveSegmentType>>();
        }
        return this.curveSegment;
    }

    public boolean isSetCurveSegment() {
        return ((this.curveSegment!= null)&&(!this.curveSegment.isEmpty()));
    }

    public void unsetCurveSegment() {
        this.curveSegment = null;
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
        {
            List<JAXBElement<? extends AbstractCurveSegmentType>> theCurveSegment;
            theCurveSegment = this.getCurveSegment();
            strategy.appendField(locator, this, "curveSegment", buffer, theCurveSegment);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CurveSegmentArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CurveSegmentArrayPropertyType that = ((CurveSegmentArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractCurveSegmentType>> lhsCurveSegment;
            lhsCurveSegment = this.getCurveSegment();
            List<JAXBElement<? extends AbstractCurveSegmentType>> rhsCurveSegment;
            rhsCurveSegment = that.getCurveSegment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curveSegment", lhsCurveSegment), LocatorUtils.property(thatLocator, "curveSegment", rhsCurveSegment), lhsCurveSegment, rhsCurveSegment)) {
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
        int currentHashCode = 1;
        {
            List<JAXBElement<? extends AbstractCurveSegmentType>> theCurveSegment;
            theCurveSegment = this.getCurveSegment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curveSegment", theCurveSegment), currentHashCode, theCurveSegment);
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
        if (draftCopy instanceof CurveSegmentArrayPropertyType) {
            final CurveSegmentArrayPropertyType copy = ((CurveSegmentArrayPropertyType) draftCopy);
            if (this.isSetCurveSegment()) {
                List<JAXBElement<? extends AbstractCurveSegmentType>> sourceCurveSegment;
                sourceCurveSegment = this.getCurveSegment();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractCurveSegmentType>> copyCurveSegment = ((List<JAXBElement<? extends AbstractCurveSegmentType>> ) strategy.copy(LocatorUtils.property(locator, "curveSegment", sourceCurveSegment), sourceCurveSegment));
                copy.unsetCurveSegment();
                List<JAXBElement<? extends AbstractCurveSegmentType>> uniqueCurveSegmentl = copy.getCurveSegment();
                uniqueCurveSegmentl.addAll(copyCurveSegment);
            } else {
                copy.unsetCurveSegment();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CurveSegmentArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CurveSegmentArrayPropertyType) {
            final CurveSegmentArrayPropertyType target = this;
            final CurveSegmentArrayPropertyType leftObject = ((CurveSegmentArrayPropertyType) left);
            final CurveSegmentArrayPropertyType rightObject = ((CurveSegmentArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractCurveSegmentType>> lhsCurveSegment;
                lhsCurveSegment = leftObject.getCurveSegment();
                List<JAXBElement<? extends AbstractCurveSegmentType>> rhsCurveSegment;
                rhsCurveSegment = rightObject.getCurveSegment();
                target.unsetCurveSegment();
                List<JAXBElement<? extends AbstractCurveSegmentType>> uniqueCurveSegmentl = target.getCurveSegment();
                uniqueCurveSegmentl.addAll(((List<JAXBElement<? extends AbstractCurveSegmentType>> ) strategy.merge(LocatorUtils.property(leftLocator, "curveSegment", lhsCurveSegment), LocatorUtils.property(rightLocator, "curveSegment", rhsCurveSegment), lhsCurveSegment, rhsCurveSegment)));
            }
        }
    }

    public void setCurveSegment(List<JAXBElement<? extends AbstractCurveSegmentType>> value) {
        List<JAXBElement<? extends AbstractCurveSegmentType>> draftl = this.getCurveSegment();
        draftl.addAll(value);
    }

}
