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
 * . The topological boundary of a face consists of a set of directed edges. Note that all edges associated with a Face, including dangling and interior edges, appear in the boundary.  Dangling and interior edges are each referenced by pairs of directedEdges with opposing orientations.  The optional coboundary of a face is a pair of directed solids which are bounded by this face. If present, there is precisely one positively directed and one negatively directed solid in the coboundary of every face. The positively directed solid corresponds to the solid which lies in the direction of the positively directed normal to the face in any geometric realisation.  A face may optionally be realised by a 2-dimensional (surface) geometric primitive.
 * 
 * <p>Java-Klasse für FaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedEdge" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}directedTopoSolid" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}surfaceProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceType", propOrder = {
    "directedEdge",
    "directedTopoSolid",
    "surfaceProperty"
})
public class FaceType
    extends AbstractTopoPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<DirectedEdgePropertyType> directedEdge;
    protected List<DirectedTopoSolidPropertyType> directedTopoSolid;
    protected SurfacePropertyType surfaceProperty;

    /**
     * Gets the value of the directedEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedEdgePropertyType }
     * 
     * 
     */
    public List<DirectedEdgePropertyType> getDirectedEdge() {
        if (directedEdge == null) {
            directedEdge = new ArrayList<DirectedEdgePropertyType>();
        }
        return this.directedEdge;
    }

    public boolean isSetDirectedEdge() {
        return ((this.directedEdge!= null)&&(!this.directedEdge.isEmpty()));
    }

    public void unsetDirectedEdge() {
        this.directedEdge = null;
    }

    /**
     * Gets the value of the directedTopoSolid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedTopoSolid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedTopoSolid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedTopoSolidPropertyType }
     * 
     * 
     */
    public List<DirectedTopoSolidPropertyType> getDirectedTopoSolid() {
        if (directedTopoSolid == null) {
            directedTopoSolid = new ArrayList<DirectedTopoSolidPropertyType>();
        }
        return this.directedTopoSolid;
    }

    public boolean isSetDirectedTopoSolid() {
        return ((this.directedTopoSolid!= null)&&(!this.directedTopoSolid.isEmpty()));
    }

    public void unsetDirectedTopoSolid() {
        this.directedTopoSolid = null;
    }

    /**
     * Ruft den Wert der surfaceProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getSurfaceProperty() {
        return surfaceProperty;
    }

    /**
     * Legt den Wert der surfaceProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setSurfaceProperty(SurfacePropertyType value) {
        this.surfaceProperty = value;
    }

    public boolean isSetSurfaceProperty() {
        return (this.surfaceProperty!= null);
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
            List<DirectedEdgePropertyType> theDirectedEdge;
            theDirectedEdge = this.getDirectedEdge();
            strategy.appendField(locator, this, "directedEdge", buffer, theDirectedEdge);
        }
        {
            List<DirectedTopoSolidPropertyType> theDirectedTopoSolid;
            theDirectedTopoSolid = this.getDirectedTopoSolid();
            strategy.appendField(locator, this, "directedTopoSolid", buffer, theDirectedTopoSolid);
        }
        {
            SurfacePropertyType theSurfaceProperty;
            theSurfaceProperty = this.getSurfaceProperty();
            strategy.appendField(locator, this, "surfaceProperty", buffer, theSurfaceProperty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FaceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FaceType that = ((FaceType) object);
        {
            List<DirectedEdgePropertyType> lhsDirectedEdge;
            lhsDirectedEdge = this.getDirectedEdge();
            List<DirectedEdgePropertyType> rhsDirectedEdge;
            rhsDirectedEdge = that.getDirectedEdge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directedEdge", lhsDirectedEdge), LocatorUtils.property(thatLocator, "directedEdge", rhsDirectedEdge), lhsDirectedEdge, rhsDirectedEdge)) {
                return false;
            }
        }
        {
            List<DirectedTopoSolidPropertyType> lhsDirectedTopoSolid;
            lhsDirectedTopoSolid = this.getDirectedTopoSolid();
            List<DirectedTopoSolidPropertyType> rhsDirectedTopoSolid;
            rhsDirectedTopoSolid = that.getDirectedTopoSolid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directedTopoSolid", lhsDirectedTopoSolid), LocatorUtils.property(thatLocator, "directedTopoSolid", rhsDirectedTopoSolid), lhsDirectedTopoSolid, rhsDirectedTopoSolid)) {
                return false;
            }
        }
        {
            SurfacePropertyType lhsSurfaceProperty;
            lhsSurfaceProperty = this.getSurfaceProperty();
            SurfacePropertyType rhsSurfaceProperty;
            rhsSurfaceProperty = that.getSurfaceProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceProperty", lhsSurfaceProperty), LocatorUtils.property(thatLocator, "surfaceProperty", rhsSurfaceProperty), lhsSurfaceProperty, rhsSurfaceProperty)) {
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
            List<DirectedEdgePropertyType> theDirectedEdge;
            theDirectedEdge = this.getDirectedEdge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directedEdge", theDirectedEdge), currentHashCode, theDirectedEdge);
        }
        {
            List<DirectedTopoSolidPropertyType> theDirectedTopoSolid;
            theDirectedTopoSolid = this.getDirectedTopoSolid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directedTopoSolid", theDirectedTopoSolid), currentHashCode, theDirectedTopoSolid);
        }
        {
            SurfacePropertyType theSurfaceProperty;
            theSurfaceProperty = this.getSurfaceProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceProperty", theSurfaceProperty), currentHashCode, theSurfaceProperty);
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
        if (draftCopy instanceof FaceType) {
            final FaceType copy = ((FaceType) draftCopy);
            if (this.isSetDirectedEdge()) {
                List<DirectedEdgePropertyType> sourceDirectedEdge;
                sourceDirectedEdge = this.getDirectedEdge();
                @SuppressWarnings("unchecked")
                List<DirectedEdgePropertyType> copyDirectedEdge = ((List<DirectedEdgePropertyType> ) strategy.copy(LocatorUtils.property(locator, "directedEdge", sourceDirectedEdge), sourceDirectedEdge));
                copy.unsetDirectedEdge();
                List<DirectedEdgePropertyType> uniqueDirectedEdgel = copy.getDirectedEdge();
                uniqueDirectedEdgel.addAll(copyDirectedEdge);
            } else {
                copy.unsetDirectedEdge();
            }
            if (this.isSetDirectedTopoSolid()) {
                List<DirectedTopoSolidPropertyType> sourceDirectedTopoSolid;
                sourceDirectedTopoSolid = this.getDirectedTopoSolid();
                @SuppressWarnings("unchecked")
                List<DirectedTopoSolidPropertyType> copyDirectedTopoSolid = ((List<DirectedTopoSolidPropertyType> ) strategy.copy(LocatorUtils.property(locator, "directedTopoSolid", sourceDirectedTopoSolid), sourceDirectedTopoSolid));
                copy.unsetDirectedTopoSolid();
                List<DirectedTopoSolidPropertyType> uniqueDirectedTopoSolidl = copy.getDirectedTopoSolid();
                uniqueDirectedTopoSolidl.addAll(copyDirectedTopoSolid);
            } else {
                copy.unsetDirectedTopoSolid();
            }
            if (this.isSetSurfaceProperty()) {
                SurfacePropertyType sourceSurfaceProperty;
                sourceSurfaceProperty = this.getSurfaceProperty();
                SurfacePropertyType copySurfaceProperty = ((SurfacePropertyType) strategy.copy(LocatorUtils.property(locator, "surfaceProperty", sourceSurfaceProperty), sourceSurfaceProperty));
                copy.setSurfaceProperty(copySurfaceProperty);
            } else {
                copy.surfaceProperty = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FaceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof FaceType) {
            final FaceType target = this;
            final FaceType leftObject = ((FaceType) left);
            final FaceType rightObject = ((FaceType) right);
            {
                List<DirectedEdgePropertyType> lhsDirectedEdge;
                lhsDirectedEdge = leftObject.getDirectedEdge();
                List<DirectedEdgePropertyType> rhsDirectedEdge;
                rhsDirectedEdge = rightObject.getDirectedEdge();
                target.unsetDirectedEdge();
                List<DirectedEdgePropertyType> uniqueDirectedEdgel = target.getDirectedEdge();
                uniqueDirectedEdgel.addAll(((List<DirectedEdgePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "directedEdge", lhsDirectedEdge), LocatorUtils.property(rightLocator, "directedEdge", rhsDirectedEdge), lhsDirectedEdge, rhsDirectedEdge)));
            }
            {
                List<DirectedTopoSolidPropertyType> lhsDirectedTopoSolid;
                lhsDirectedTopoSolid = leftObject.getDirectedTopoSolid();
                List<DirectedTopoSolidPropertyType> rhsDirectedTopoSolid;
                rhsDirectedTopoSolid = rightObject.getDirectedTopoSolid();
                target.unsetDirectedTopoSolid();
                List<DirectedTopoSolidPropertyType> uniqueDirectedTopoSolidl = target.getDirectedTopoSolid();
                uniqueDirectedTopoSolidl.addAll(((List<DirectedTopoSolidPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "directedTopoSolid", lhsDirectedTopoSolid), LocatorUtils.property(rightLocator, "directedTopoSolid", rhsDirectedTopoSolid), lhsDirectedTopoSolid, rhsDirectedTopoSolid)));
            }
            {
                SurfacePropertyType lhsSurfaceProperty;
                lhsSurfaceProperty = leftObject.getSurfaceProperty();
                SurfacePropertyType rhsSurfaceProperty;
                rhsSurfaceProperty = rightObject.getSurfaceProperty();
                target.setSurfaceProperty(((SurfacePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "surfaceProperty", lhsSurfaceProperty), LocatorUtils.property(rightLocator, "surfaceProperty", rhsSurfaceProperty), lhsSurfaceProperty, rhsSurfaceProperty)));
            }
        }
    }

    public void setDirectedEdge(List<DirectedEdgePropertyType> value) {
        List<DirectedEdgePropertyType> draftl = this.getDirectedEdge();
        draftl.addAll(value);
    }

    public void setDirectedTopoSolid(List<DirectedTopoSolidPropertyType> value) {
        List<DirectedTopoSolidPropertyType> draftl = this.getDirectedTopoSolid();
        draftl.addAll(value);
    }

}
