//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * An unrectified grid, which is a network composed of two or more sets of equally spaced parallel lines in which the members of each set intersect the members of the other sets at right angles.
 * 
 * <p>Java-Klasse für GridType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GridType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element name="limits" type="{http://www.opengis.net/gml}GridLimitsType"/>
 *         &lt;element name="axisName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dimension" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridType", propOrder = {
    "limits",
    "axisName"
})
@XmlSeeAlso({
    RectifiedGridType.class
})
public class GridType
    extends AbstractGeometryType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected GridLimitsType limits;
    @XmlElement(required = true)
    protected List<String> axisName;
    @XmlAttribute(name = "dimension", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dimension;

    /**
     * Ruft den Wert der limits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GridLimitsType }
     *     
     */
    public GridLimitsType getLimits() {
        return limits;
    }

    /**
     * Legt den Wert der limits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GridLimitsType }
     *     
     */
    public void setLimits(GridLimitsType value) {
        this.limits = value;
    }

    public boolean isSetLimits() {
        return (this.limits!= null);
    }

    /**
     * Gets the value of the axisName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisName() {
        if (axisName == null) {
            axisName = new ArrayList<String>();
        }
        return this.axisName;
    }

    public boolean isSetAxisName() {
        return ((this.axisName!= null)&&(!this.axisName.isEmpty()));
    }

    public void unsetAxisName() {
        this.axisName = null;
    }

    /**
     * Ruft den Wert der dimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimension() {
        return dimension;
    }

    /**
     * Legt den Wert der dimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimension(BigInteger value) {
        this.dimension = value;
    }

    public boolean isSetDimension() {
        return (this.dimension!= null);
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
            GridLimitsType theLimits;
            theLimits = this.getLimits();
            strategy.appendField(locator, this, "limits", buffer, theLimits);
        }
        {
            List<String> theAxisName;
            theAxisName = this.getAxisName();
            strategy.appendField(locator, this, "axisName", buffer, theAxisName);
        }
        {
            BigInteger theDimension;
            theDimension = this.getDimension();
            strategy.appendField(locator, this, "dimension", buffer, theDimension);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GridType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GridType that = ((GridType) object);
        {
            GridLimitsType lhsLimits;
            lhsLimits = this.getLimits();
            GridLimitsType rhsLimits;
            rhsLimits = that.getLimits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limits", lhsLimits), LocatorUtils.property(thatLocator, "limits", rhsLimits), lhsLimits, rhsLimits)) {
                return false;
            }
        }
        {
            List<String> lhsAxisName;
            lhsAxisName = this.getAxisName();
            List<String> rhsAxisName;
            rhsAxisName = that.getAxisName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisName", lhsAxisName), LocatorUtils.property(thatLocator, "axisName", rhsAxisName), lhsAxisName, rhsAxisName)) {
                return false;
            }
        }
        {
            BigInteger lhsDimension;
            lhsDimension = this.getDimension();
            BigInteger rhsDimension;
            rhsDimension = that.getDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimension", lhsDimension), LocatorUtils.property(thatLocator, "dimension", rhsDimension), lhsDimension, rhsDimension)) {
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
            GridLimitsType theLimits;
            theLimits = this.getLimits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limits", theLimits), currentHashCode, theLimits);
        }
        {
            List<String> theAxisName;
            theAxisName = this.getAxisName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisName", theAxisName), currentHashCode, theAxisName);
        }
        {
            BigInteger theDimension;
            theDimension = this.getDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimension", theDimension), currentHashCode, theDimension);
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
        if (draftCopy instanceof GridType) {
            final GridType copy = ((GridType) draftCopy);
            if (this.isSetLimits()) {
                GridLimitsType sourceLimits;
                sourceLimits = this.getLimits();
                GridLimitsType copyLimits = ((GridLimitsType) strategy.copy(LocatorUtils.property(locator, "limits", sourceLimits), sourceLimits));
                copy.setLimits(copyLimits);
            } else {
                copy.limits = null;
            }
            if (this.isSetAxisName()) {
                List<String> sourceAxisName;
                sourceAxisName = this.getAxisName();
                @SuppressWarnings("unchecked")
                List<String> copyAxisName = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "axisName", sourceAxisName), sourceAxisName));
                copy.unsetAxisName();
                List<String> uniqueAxisNamel = copy.getAxisName();
                uniqueAxisNamel.addAll(copyAxisName);
            } else {
                copy.unsetAxisName();
            }
            if (this.isSetDimension()) {
                BigInteger sourceDimension;
                sourceDimension = this.getDimension();
                BigInteger copyDimension = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "dimension", sourceDimension), sourceDimension));
                copy.setDimension(copyDimension);
            } else {
                copy.dimension = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GridType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GridType) {
            final GridType target = this;
            final GridType leftObject = ((GridType) left);
            final GridType rightObject = ((GridType) right);
            {
                GridLimitsType lhsLimits;
                lhsLimits = leftObject.getLimits();
                GridLimitsType rhsLimits;
                rhsLimits = rightObject.getLimits();
                target.setLimits(((GridLimitsType) strategy.merge(LocatorUtils.property(leftLocator, "limits", lhsLimits), LocatorUtils.property(rightLocator, "limits", rhsLimits), lhsLimits, rhsLimits)));
            }
            {
                List<String> lhsAxisName;
                lhsAxisName = leftObject.getAxisName();
                List<String> rhsAxisName;
                rhsAxisName = rightObject.getAxisName();
                target.unsetAxisName();
                List<String> uniqueAxisNamel = target.getAxisName();
                uniqueAxisNamel.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "axisName", lhsAxisName), LocatorUtils.property(rightLocator, "axisName", rhsAxisName), lhsAxisName, rhsAxisName)));
            }
            {
                BigInteger lhsDimension;
                lhsDimension = leftObject.getDimension();
                BigInteger rhsDimension;
                rhsDimension = rightObject.getDimension();
                target.setDimension(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "dimension", lhsDimension), LocatorUtils.property(rightLocator, "dimension", rhsDimension), lhsDimension, rhsDimension)));
            }
        }
    }

    public void setAxisName(List<String> value) {
        List<String> draftl = this.getAxisName();
        draftl.addAll(value);
    }

}
