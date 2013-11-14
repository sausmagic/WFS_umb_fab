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
 * There is precisely one positively directed and one negatively directed node in the boundary of every edge. The negatively and positively directed nodes correspond to the start and end nodes respectively. The optional coboundary of an edge is a circular sequence of directed faces which are incident on this edge in document order. Faces which use a particular boundary edge in its positive orientation appear with positive orientation on the coboundary of the same edge. In the 2D case, the orientation of the face on the left of the edge is "+"; the orientation of the face on the right on its right is "-". An edge may optionally be realised by a 1-dimensional (curve) geometric primitive.
 * 
 * <p>Java-Klasse für EdgeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EdgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedNode" maxOccurs="2" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml}directedFace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}curveProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdgeType", propOrder = {
    "directedNode",
    "directedFace",
    "curveProperty"
})
public class EdgeType
    extends AbstractTopoPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<DirectedNodePropertyType> directedNode;
    protected List<DirectedFacePropertyType> directedFace;
    protected CurvePropertyType curveProperty;

    /**
     * Gets the value of the directedNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedNodePropertyType }
     * 
     * 
     */
    public List<DirectedNodePropertyType> getDirectedNode() {
        if (directedNode == null) {
            directedNode = new ArrayList<DirectedNodePropertyType>();
        }
        return this.directedNode;
    }

    public boolean isSetDirectedNode() {
        return ((this.directedNode!= null)&&(!this.directedNode.isEmpty()));
    }

    public void unsetDirectedNode() {
        this.directedNode = null;
    }

    /**
     * Gets the value of the directedFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedFacePropertyType }
     * 
     * 
     */
    public List<DirectedFacePropertyType> getDirectedFace() {
        if (directedFace == null) {
            directedFace = new ArrayList<DirectedFacePropertyType>();
        }
        return this.directedFace;
    }

    public boolean isSetDirectedFace() {
        return ((this.directedFace!= null)&&(!this.directedFace.isEmpty()));
    }

    public void unsetDirectedFace() {
        this.directedFace = null;
    }

    /**
     * Ruft den Wert der curveProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getCurveProperty() {
        return curveProperty;
    }

    /**
     * Legt den Wert der curveProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setCurveProperty(CurvePropertyType value) {
        this.curveProperty = value;
    }

    public boolean isSetCurveProperty() {
        return (this.curveProperty!= null);
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
            List<DirectedNodePropertyType> theDirectedNode;
            theDirectedNode = this.getDirectedNode();
            strategy.appendField(locator, this, "directedNode", buffer, theDirectedNode);
        }
        {
            List<DirectedFacePropertyType> theDirectedFace;
            theDirectedFace = this.getDirectedFace();
            strategy.appendField(locator, this, "directedFace", buffer, theDirectedFace);
        }
        {
            CurvePropertyType theCurveProperty;
            theCurveProperty = this.getCurveProperty();
            strategy.appendField(locator, this, "curveProperty", buffer, theCurveProperty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EdgeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EdgeType that = ((EdgeType) object);
        {
            List<DirectedNodePropertyType> lhsDirectedNode;
            lhsDirectedNode = this.getDirectedNode();
            List<DirectedNodePropertyType> rhsDirectedNode;
            rhsDirectedNode = that.getDirectedNode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directedNode", lhsDirectedNode), LocatorUtils.property(thatLocator, "directedNode", rhsDirectedNode), lhsDirectedNode, rhsDirectedNode)) {
                return false;
            }
        }
        {
            List<DirectedFacePropertyType> lhsDirectedFace;
            lhsDirectedFace = this.getDirectedFace();
            List<DirectedFacePropertyType> rhsDirectedFace;
            rhsDirectedFace = that.getDirectedFace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directedFace", lhsDirectedFace), LocatorUtils.property(thatLocator, "directedFace", rhsDirectedFace), lhsDirectedFace, rhsDirectedFace)) {
                return false;
            }
        }
        {
            CurvePropertyType lhsCurveProperty;
            lhsCurveProperty = this.getCurveProperty();
            CurvePropertyType rhsCurveProperty;
            rhsCurveProperty = that.getCurveProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curveProperty", lhsCurveProperty), LocatorUtils.property(thatLocator, "curveProperty", rhsCurveProperty), lhsCurveProperty, rhsCurveProperty)) {
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
            List<DirectedNodePropertyType> theDirectedNode;
            theDirectedNode = this.getDirectedNode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directedNode", theDirectedNode), currentHashCode, theDirectedNode);
        }
        {
            List<DirectedFacePropertyType> theDirectedFace;
            theDirectedFace = this.getDirectedFace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directedFace", theDirectedFace), currentHashCode, theDirectedFace);
        }
        {
            CurvePropertyType theCurveProperty;
            theCurveProperty = this.getCurveProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curveProperty", theCurveProperty), currentHashCode, theCurveProperty);
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
        if (draftCopy instanceof EdgeType) {
            final EdgeType copy = ((EdgeType) draftCopy);
            if (this.isSetDirectedNode()) {
                List<DirectedNodePropertyType> sourceDirectedNode;
                sourceDirectedNode = this.getDirectedNode();
                @SuppressWarnings("unchecked")
                List<DirectedNodePropertyType> copyDirectedNode = ((List<DirectedNodePropertyType> ) strategy.copy(LocatorUtils.property(locator, "directedNode", sourceDirectedNode), sourceDirectedNode));
                copy.unsetDirectedNode();
                List<DirectedNodePropertyType> uniqueDirectedNodel = copy.getDirectedNode();
                uniqueDirectedNodel.addAll(copyDirectedNode);
            } else {
                copy.unsetDirectedNode();
            }
            if (this.isSetDirectedFace()) {
                List<DirectedFacePropertyType> sourceDirectedFace;
                sourceDirectedFace = this.getDirectedFace();
                @SuppressWarnings("unchecked")
                List<DirectedFacePropertyType> copyDirectedFace = ((List<DirectedFacePropertyType> ) strategy.copy(LocatorUtils.property(locator, "directedFace", sourceDirectedFace), sourceDirectedFace));
                copy.unsetDirectedFace();
                List<DirectedFacePropertyType> uniqueDirectedFacel = copy.getDirectedFace();
                uniqueDirectedFacel.addAll(copyDirectedFace);
            } else {
                copy.unsetDirectedFace();
            }
            if (this.isSetCurveProperty()) {
                CurvePropertyType sourceCurveProperty;
                sourceCurveProperty = this.getCurveProperty();
                CurvePropertyType copyCurveProperty = ((CurvePropertyType) strategy.copy(LocatorUtils.property(locator, "curveProperty", sourceCurveProperty), sourceCurveProperty));
                copy.setCurveProperty(copyCurveProperty);
            } else {
                copy.curveProperty = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EdgeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EdgeType) {
            final EdgeType target = this;
            final EdgeType leftObject = ((EdgeType) left);
            final EdgeType rightObject = ((EdgeType) right);
            {
                List<DirectedNodePropertyType> lhsDirectedNode;
                lhsDirectedNode = leftObject.getDirectedNode();
                List<DirectedNodePropertyType> rhsDirectedNode;
                rhsDirectedNode = rightObject.getDirectedNode();
                target.unsetDirectedNode();
                List<DirectedNodePropertyType> uniqueDirectedNodel = target.getDirectedNode();
                uniqueDirectedNodel.addAll(((List<DirectedNodePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "directedNode", lhsDirectedNode), LocatorUtils.property(rightLocator, "directedNode", rhsDirectedNode), lhsDirectedNode, rhsDirectedNode)));
            }
            {
                List<DirectedFacePropertyType> lhsDirectedFace;
                lhsDirectedFace = leftObject.getDirectedFace();
                List<DirectedFacePropertyType> rhsDirectedFace;
                rhsDirectedFace = rightObject.getDirectedFace();
                target.unsetDirectedFace();
                List<DirectedFacePropertyType> uniqueDirectedFacel = target.getDirectedFace();
                uniqueDirectedFacel.addAll(((List<DirectedFacePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "directedFace", lhsDirectedFace), LocatorUtils.property(rightLocator, "directedFace", rhsDirectedFace), lhsDirectedFace, rhsDirectedFace)));
            }
            {
                CurvePropertyType lhsCurveProperty;
                lhsCurveProperty = leftObject.getCurveProperty();
                CurvePropertyType rhsCurveProperty;
                rhsCurveProperty = rightObject.getCurveProperty();
                target.setCurveProperty(((CurvePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "curveProperty", lhsCurveProperty), LocatorUtils.property(rightLocator, "curveProperty", rhsCurveProperty), lhsCurveProperty, rhsCurveProperty)));
            }
        }
    }

    public void setDirectedNode(List<DirectedNodePropertyType> value) {
        List<DirectedNodePropertyType> draftl = this.getDirectedNode();
        draftl.addAll(value);
    }

    public void setDirectedFace(List<DirectedFacePropertyType> value) {
        List<DirectedFacePropertyType> draftl = this.getDirectedFace();
        draftl.addAll(value);
    }

}
