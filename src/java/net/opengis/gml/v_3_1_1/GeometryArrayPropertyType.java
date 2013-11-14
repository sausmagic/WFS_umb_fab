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
 * A container for an array of geometry elements. The elements are always contained in the array property, 
 * 			referencing geometry elements or arrays of geometry elements is not supported.
 * 
 * <p>Java-Klasse für GeometryArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeometryArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Geometry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryArrayPropertyType", propOrder = {
    "geometry"
})
public class GeometryArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_Geometry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractGeometryType>> geometry;

    /**
     * Gets the value of the geometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PolyhedralSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiLineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link RingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TriangulatedSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractGeometryType>> getGeometry() {
        if (geometry == null) {
            geometry = new ArrayList<JAXBElement<? extends AbstractGeometryType>>();
        }
        return this.geometry;
    }

    public boolean isSetGeometry() {
        return ((this.geometry!= null)&&(!this.geometry.isEmpty()));
    }

    public void unsetGeometry() {
        this.geometry = null;
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
            List<JAXBElement<? extends AbstractGeometryType>> theGeometry;
            theGeometry = this.getGeometry();
            strategy.appendField(locator, this, "geometry", buffer, theGeometry);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeometryArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeometryArrayPropertyType that = ((GeometryArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractGeometryType>> lhsGeometry;
            lhsGeometry = this.getGeometry();
            List<JAXBElement<? extends AbstractGeometryType>> rhsGeometry;
            rhsGeometry = that.getGeometry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometry", lhsGeometry), LocatorUtils.property(thatLocator, "geometry", rhsGeometry), lhsGeometry, rhsGeometry)) {
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
            List<JAXBElement<? extends AbstractGeometryType>> theGeometry;
            theGeometry = this.getGeometry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometry", theGeometry), currentHashCode, theGeometry);
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
        if (draftCopy instanceof GeometryArrayPropertyType) {
            final GeometryArrayPropertyType copy = ((GeometryArrayPropertyType) draftCopy);
            if (this.isSetGeometry()) {
                List<JAXBElement<? extends AbstractGeometryType>> sourceGeometry;
                sourceGeometry = this.getGeometry();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractGeometryType>> copyGeometry = ((List<JAXBElement<? extends AbstractGeometryType>> ) strategy.copy(LocatorUtils.property(locator, "geometry", sourceGeometry), sourceGeometry));
                copy.unsetGeometry();
                List<JAXBElement<? extends AbstractGeometryType>> uniqueGeometryl = copy.getGeometry();
                uniqueGeometryl.addAll(copyGeometry);
            } else {
                copy.unsetGeometry();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GeometryArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof GeometryArrayPropertyType) {
            final GeometryArrayPropertyType target = this;
            final GeometryArrayPropertyType leftObject = ((GeometryArrayPropertyType) left);
            final GeometryArrayPropertyType rightObject = ((GeometryArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractGeometryType>> lhsGeometry;
                lhsGeometry = leftObject.getGeometry();
                List<JAXBElement<? extends AbstractGeometryType>> rhsGeometry;
                rhsGeometry = rightObject.getGeometry();
                target.unsetGeometry();
                List<JAXBElement<? extends AbstractGeometryType>> uniqueGeometryl = target.getGeometry();
                uniqueGeometryl.addAll(((List<JAXBElement<? extends AbstractGeometryType>> ) strategy.merge(LocatorUtils.property(leftLocator, "geometry", lhsGeometry), LocatorUtils.property(rightLocator, "geometry", rhsGeometry), lhsGeometry, rhsGeometry)));
            }
        }
    }

    public void setGeometry(List<JAXBElement<? extends AbstractGeometryType>> value) {
        List<JAXBElement<? extends AbstractGeometryType>> draftl = this.getGeometry();
        draftl.addAll(value);
    }

}
