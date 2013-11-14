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
 * A rectified grid has an origin and vectors that define its post locations.
 * 
 * <p>Java-Klasse für RectifiedGridType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RectifiedGridType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}GridType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.opengis.net/gml}PointPropertyType"/>
 *         &lt;element name="offsetVector" type="{http://www.opengis.net/gml}VectorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectifiedGridType", propOrder = {
    "origin",
    "offsetVector"
})
public class RectifiedGridType
    extends GridType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected PointPropertyType origin;
    @XmlElement(required = true)
    protected List<VectorType> offsetVector;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setOrigin(PointPropertyType value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Gets the value of the offsetVector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetVector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getOffsetVector() {
        if (offsetVector == null) {
            offsetVector = new ArrayList<VectorType>();
        }
        return this.offsetVector;
    }

    public boolean isSetOffsetVector() {
        return ((this.offsetVector!= null)&&(!this.offsetVector.isEmpty()));
    }

    public void unsetOffsetVector() {
        this.offsetVector = null;
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
            PointPropertyType theOrigin;
            theOrigin = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theOrigin);
        }
        {
            List<VectorType> theOffsetVector;
            theOffsetVector = this.getOffsetVector();
            strategy.appendField(locator, this, "offsetVector", buffer, theOffsetVector);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RectifiedGridType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RectifiedGridType that = ((RectifiedGridType) object);
        {
            PointPropertyType lhsOrigin;
            lhsOrigin = this.getOrigin();
            PointPropertyType rhsOrigin;
            rhsOrigin = that.getOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origin", lhsOrigin), LocatorUtils.property(thatLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)) {
                return false;
            }
        }
        {
            List<VectorType> lhsOffsetVector;
            lhsOffsetVector = this.getOffsetVector();
            List<VectorType> rhsOffsetVector;
            rhsOffsetVector = that.getOffsetVector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offsetVector", lhsOffsetVector), LocatorUtils.property(thatLocator, "offsetVector", rhsOffsetVector), lhsOffsetVector, rhsOffsetVector)) {
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
            PointPropertyType theOrigin;
            theOrigin = this.getOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origin", theOrigin), currentHashCode, theOrigin);
        }
        {
            List<VectorType> theOffsetVector;
            theOffsetVector = this.getOffsetVector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offsetVector", theOffsetVector), currentHashCode, theOffsetVector);
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
        if (draftCopy instanceof RectifiedGridType) {
            final RectifiedGridType copy = ((RectifiedGridType) draftCopy);
            if (this.isSetOrigin()) {
                PointPropertyType sourceOrigin;
                sourceOrigin = this.getOrigin();
                PointPropertyType copyOrigin = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "origin", sourceOrigin), sourceOrigin));
                copy.setOrigin(copyOrigin);
            } else {
                copy.origin = null;
            }
            if (this.isSetOffsetVector()) {
                List<VectorType> sourceOffsetVector;
                sourceOffsetVector = this.getOffsetVector();
                @SuppressWarnings("unchecked")
                List<VectorType> copyOffsetVector = ((List<VectorType> ) strategy.copy(LocatorUtils.property(locator, "offsetVector", sourceOffsetVector), sourceOffsetVector));
                copy.unsetOffsetVector();
                List<VectorType> uniqueOffsetVectorl = copy.getOffsetVector();
                uniqueOffsetVectorl.addAll(copyOffsetVector);
            } else {
                copy.unsetOffsetVector();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RectifiedGridType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof RectifiedGridType) {
            final RectifiedGridType target = this;
            final RectifiedGridType leftObject = ((RectifiedGridType) left);
            final RectifiedGridType rightObject = ((RectifiedGridType) right);
            {
                PointPropertyType lhsOrigin;
                lhsOrigin = leftObject.getOrigin();
                PointPropertyType rhsOrigin;
                rhsOrigin = rightObject.getOrigin();
                target.setOrigin(((PointPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "origin", lhsOrigin), LocatorUtils.property(rightLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)));
            }
            {
                List<VectorType> lhsOffsetVector;
                lhsOffsetVector = leftObject.getOffsetVector();
                List<VectorType> rhsOffsetVector;
                rhsOffsetVector = rightObject.getOffsetVector();
                target.unsetOffsetVector();
                List<VectorType> uniqueOffsetVectorl = target.getOffsetVector();
                uniqueOffsetVectorl.addAll(((List<VectorType> ) strategy.merge(LocatorUtils.property(leftLocator, "offsetVector", lhsOffsetVector), LocatorUtils.property(rightLocator, "offsetVector", rhsOffsetVector), lhsOffsetVector, rhsOffsetVector)));
            }
        }
    }

    public void setOffsetVector(List<VectorType> value) {
        List<VectorType> draftl = this.getOffsetVector();
        draftl.addAll(value);
    }

}
