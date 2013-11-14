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
 * Its optional co-boundary is a set of connected directedEdges.  The orientation of one of these dirEdges is "+" if the Node is the "to" node of the Edge, and "-" if it is the "from" node.
 * 
 * <p>Java-Klasse für NodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedEdge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}pointProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
    "directedEdge",
    "pointProperty"
})
public class NodeType
    extends AbstractTopoPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<DirectedEdgePropertyType> directedEdge;
    protected PointPropertyType pointProperty;

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
     * Ruft den Wert der pointProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * Legt den Wert der pointProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
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
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, thePointProperty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NodeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NodeType that = ((NodeType) object);
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
            PointPropertyType lhsPointProperty;
            lhsPointProperty = this.getPointProperty();
            PointPropertyType rhsPointProperty;
            rhsPointProperty = that.getPointProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(thatLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty)) {
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
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointProperty", thePointProperty), currentHashCode, thePointProperty);
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
        if (draftCopy instanceof NodeType) {
            final NodeType copy = ((NodeType) draftCopy);
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
            if (this.isSetPointProperty()) {
                PointPropertyType sourcePointProperty;
                sourcePointProperty = this.getPointProperty();
                PointPropertyType copyPointProperty = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "pointProperty", sourcePointProperty), sourcePointProperty));
                copy.setPointProperty(copyPointProperty);
            } else {
                copy.pointProperty = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new NodeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof NodeType) {
            final NodeType target = this;
            final NodeType leftObject = ((NodeType) left);
            final NodeType rightObject = ((NodeType) right);
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
                PointPropertyType lhsPointProperty;
                lhsPointProperty = leftObject.getPointProperty();
                PointPropertyType rhsPointProperty;
                rhsPointProperty = rightObject.getPointProperty();
                target.setPointProperty(((PointPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(rightLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty)));
            }
        }
    }

    public void setDirectedEdge(List<DirectedEdgePropertyType> value) {
        List<DirectedEdgePropertyType> draftl = this.getDirectedEdge();
        draftl.addAll(value);
    }

}
