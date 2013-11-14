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
 * A container for an array of curves. The elements are always contained in the array property, referencing geometry elements 
 * 			or arrays of geometry elements is not supported.
 * 
 * <p>Java-Klasse für CurveArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurveArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Curve" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveArrayPropertyType", propOrder = {
    "curve"
})
public class CurveArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_Curve", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractCurveType>> curve;

    /**
     * Gets the value of the curve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractCurveType>> getCurve() {
        if (curve == null) {
            curve = new ArrayList<JAXBElement<? extends AbstractCurveType>>();
        }
        return this.curve;
    }

    public boolean isSetCurve() {
        return ((this.curve!= null)&&(!this.curve.isEmpty()));
    }

    public void unsetCurve() {
        this.curve = null;
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
            List<JAXBElement<? extends AbstractCurveType>> theCurve;
            theCurve = this.getCurve();
            strategy.appendField(locator, this, "curve", buffer, theCurve);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CurveArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CurveArrayPropertyType that = ((CurveArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractCurveType>> lhsCurve;
            lhsCurve = this.getCurve();
            List<JAXBElement<? extends AbstractCurveType>> rhsCurve;
            rhsCurve = that.getCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curve", lhsCurve), LocatorUtils.property(thatLocator, "curve", rhsCurve), lhsCurve, rhsCurve)) {
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
            List<JAXBElement<? extends AbstractCurveType>> theCurve;
            theCurve = this.getCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curve", theCurve), currentHashCode, theCurve);
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
        if (draftCopy instanceof CurveArrayPropertyType) {
            final CurveArrayPropertyType copy = ((CurveArrayPropertyType) draftCopy);
            if (this.isSetCurve()) {
                List<JAXBElement<? extends AbstractCurveType>> sourceCurve;
                sourceCurve = this.getCurve();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractCurveType>> copyCurve = ((List<JAXBElement<? extends AbstractCurveType>> ) strategy.copy(LocatorUtils.property(locator, "curve", sourceCurve), sourceCurve));
                copy.unsetCurve();
                List<JAXBElement<? extends AbstractCurveType>> uniqueCurvel = copy.getCurve();
                uniqueCurvel.addAll(copyCurve);
            } else {
                copy.unsetCurve();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CurveArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CurveArrayPropertyType) {
            final CurveArrayPropertyType target = this;
            final CurveArrayPropertyType leftObject = ((CurveArrayPropertyType) left);
            final CurveArrayPropertyType rightObject = ((CurveArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractCurveType>> lhsCurve;
                lhsCurve = leftObject.getCurve();
                List<JAXBElement<? extends AbstractCurveType>> rhsCurve;
                rhsCurve = rightObject.getCurve();
                target.unsetCurve();
                List<JAXBElement<? extends AbstractCurveType>> uniqueCurvel = target.getCurve();
                uniqueCurvel.addAll(((List<JAXBElement<? extends AbstractCurveType>> ) strategy.merge(LocatorUtils.property(leftLocator, "curve", lhsCurve), LocatorUtils.property(rightLocator, "curve", rhsCurve), lhsCurve, rhsCurve)));
            }
        }
    }

    public void setCurve(List<JAXBElement<? extends AbstractCurveType>> value) {
        List<JAXBElement<? extends AbstractCurveType>> draftl = this.getCurve();
        draftl.addAll(value);
    }

}
