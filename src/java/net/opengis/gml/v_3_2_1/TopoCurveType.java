//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java-Klasse für TopoCurveType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedEdge" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoCurveType", propOrder = {
    "directedEdge"
})
public class TopoCurveType
    extends AbstractTopologyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<DirectedEdgePropertyType> directedEdge;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

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
     * Ruft den Wert der aggregationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Legt den Wert der aggregationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
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
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TopoCurveType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TopoCurveType that = ((TopoCurveType) object);
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
            AggregationType lhsAggregationType;
            lhsAggregationType = this.getAggregationType();
            AggregationType rhsAggregationType;
            rhsAggregationType = that.getAggregationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(thatLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)) {
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
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationType", theAggregationType), currentHashCode, theAggregationType);
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
        if (draftCopy instanceof TopoCurveType) {
            final TopoCurveType copy = ((TopoCurveType) draftCopy);
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
            if (this.isSetAggregationType()) {
                AggregationType sourceAggregationType;
                sourceAggregationType = this.getAggregationType();
                AggregationType copyAggregationType = ((AggregationType) strategy.copy(LocatorUtils.property(locator, "aggregationType", sourceAggregationType), sourceAggregationType));
                copy.setAggregationType(copyAggregationType);
            } else {
                copy.aggregationType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TopoCurveType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TopoCurveType) {
            final TopoCurveType target = this;
            final TopoCurveType leftObject = ((TopoCurveType) left);
            final TopoCurveType rightObject = ((TopoCurveType) right);
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
                AggregationType lhsAggregationType;
                lhsAggregationType = leftObject.getAggregationType();
                AggregationType rhsAggregationType;
                rhsAggregationType = rightObject.getAggregationType();
                target.setAggregationType(((AggregationType) strategy.merge(LocatorUtils.property(leftLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(rightLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)));
            }
        }
    }

    public void setDirectedEdge(List<DirectedEdgePropertyType> value) {
        List<DirectedEdgePropertyType> draftl = this.getDirectedEdge();
        draftl.addAll(value);
    }

}