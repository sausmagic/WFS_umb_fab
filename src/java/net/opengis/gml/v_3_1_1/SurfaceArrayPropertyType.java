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
 * A container for an array of surfaces. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements is not supported.
 * 
 * <p>Java-Klasse für SurfaceArrayPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfaceArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Surface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceArrayPropertyType", propOrder = {
    "surface"
})
public class SurfaceArrayPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_Surface", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractSurfaceType>> surface;

    /**
     * Gets the value of the surface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link TriangulatedSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolyhedralSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractSurfaceType>> getSurface() {
        if (surface == null) {
            surface = new ArrayList<JAXBElement<? extends AbstractSurfaceType>>();
        }
        return this.surface;
    }

    public boolean isSetSurface() {
        return ((this.surface!= null)&&(!this.surface.isEmpty()));
    }

    public void unsetSurface() {
        this.surface = null;
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
            List<JAXBElement<? extends AbstractSurfaceType>> theSurface;
            theSurface = this.getSurface();
            strategy.appendField(locator, this, "surface", buffer, theSurface);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SurfaceArrayPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SurfaceArrayPropertyType that = ((SurfaceArrayPropertyType) object);
        {
            List<JAXBElement<? extends AbstractSurfaceType>> lhsSurface;
            lhsSurface = this.getSurface();
            List<JAXBElement<? extends AbstractSurfaceType>> rhsSurface;
            rhsSurface = that.getSurface();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surface", lhsSurface), LocatorUtils.property(thatLocator, "surface", rhsSurface), lhsSurface, rhsSurface)) {
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
            List<JAXBElement<? extends AbstractSurfaceType>> theSurface;
            theSurface = this.getSurface();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surface", theSurface), currentHashCode, theSurface);
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
        if (draftCopy instanceof SurfaceArrayPropertyType) {
            final SurfaceArrayPropertyType copy = ((SurfaceArrayPropertyType) draftCopy);
            if (this.isSetSurface()) {
                List<JAXBElement<? extends AbstractSurfaceType>> sourceSurface;
                sourceSurface = this.getSurface();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractSurfaceType>> copySurface = ((List<JAXBElement<? extends AbstractSurfaceType>> ) strategy.copy(LocatorUtils.property(locator, "surface", sourceSurface), sourceSurface));
                copy.unsetSurface();
                List<JAXBElement<? extends AbstractSurfaceType>> uniqueSurfacel = copy.getSurface();
                uniqueSurfacel.addAll(copySurface);
            } else {
                copy.unsetSurface();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SurfaceArrayPropertyType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SurfaceArrayPropertyType) {
            final SurfaceArrayPropertyType target = this;
            final SurfaceArrayPropertyType leftObject = ((SurfaceArrayPropertyType) left);
            final SurfaceArrayPropertyType rightObject = ((SurfaceArrayPropertyType) right);
            {
                List<JAXBElement<? extends AbstractSurfaceType>> lhsSurface;
                lhsSurface = leftObject.getSurface();
                List<JAXBElement<? extends AbstractSurfaceType>> rhsSurface;
                rhsSurface = rightObject.getSurface();
                target.unsetSurface();
                List<JAXBElement<? extends AbstractSurfaceType>> uniqueSurfacel = target.getSurface();
                uniqueSurfacel.addAll(((List<JAXBElement<? extends AbstractSurfaceType>> ) strategy.merge(LocatorUtils.property(leftLocator, "surface", lhsSurface), LocatorUtils.property(rightLocator, "surface", rhsSurface), lhsSurface, rhsSurface)));
            }
        }
    }

    public void setSurface(List<JAXBElement<? extends AbstractSurfaceType>> value) {
        List<JAXBElement<? extends AbstractSurfaceType>> draftl = this.getSurface();
        draftl.addAll(value);
    }

}
