//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

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
 * 
 *             A list of feature types available from  this server.
 *          
 * 
 * <p>Java-Klasse für FeatureTypeListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureTypeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operations" type="{http://www.opengis.net/wfs}OperationsType" minOccurs="0"/>
 *         &lt;element name="FeatureType" type="{http://www.opengis.net/wfs}FeatureTypeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureTypeListType", propOrder = {
    "operations",
    "featureType"
})
public class FeatureTypeListType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Operations")
    protected OperationsType operations;
    @XmlElement(name = "FeatureType", required = true)
    protected List<FeatureTypeType> featureType;

    /**
     * Ruft den Wert der operations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationsType }
     *     
     */
    public OperationsType getOperations() {
        return operations;
    }

    /**
     * Legt den Wert der operations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsType }
     *     
     */
    public void setOperations(OperationsType value) {
        this.operations = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureTypeType }
     * 
     * 
     */
    public List<FeatureTypeType> getFeatureType() {
        if (featureType == null) {
            featureType = new ArrayList<FeatureTypeType>();
        }
        return this.featureType;
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
            OperationsType theOperations;
            theOperations = this.getOperations();
            strategy.appendField(locator, this, "operations", buffer, theOperations);
        }
        {
            List<FeatureTypeType> theFeatureType;
            theFeatureType = this.getFeatureType();
            strategy.appendField(locator, this, "featureType", buffer, theFeatureType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeatureTypeListType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeatureTypeListType that = ((FeatureTypeListType) object);
        {
            OperationsType lhsOperations;
            lhsOperations = this.getOperations();
            OperationsType rhsOperations;
            rhsOperations = that.getOperations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operations", lhsOperations), LocatorUtils.property(thatLocator, "operations", rhsOperations), lhsOperations, rhsOperations)) {
                return false;
            }
        }
        {
            List<FeatureTypeType> lhsFeatureType;
            lhsFeatureType = this.getFeatureType();
            List<FeatureTypeType> rhsFeatureType;
            rhsFeatureType = that.getFeatureType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureType", lhsFeatureType), LocatorUtils.property(thatLocator, "featureType", rhsFeatureType), lhsFeatureType, rhsFeatureType)) {
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
            OperationsType theOperations;
            theOperations = this.getOperations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operations", theOperations), currentHashCode, theOperations);
        }
        {
            List<FeatureTypeType> theFeatureType;
            theFeatureType = this.getFeatureType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureType", theFeatureType), currentHashCode, theFeatureType);
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
        if (draftCopy instanceof FeatureTypeListType) {
            final FeatureTypeListType copy = ((FeatureTypeListType) draftCopy);
            if (this.operations!= null) {
                OperationsType sourceOperations;
                sourceOperations = this.getOperations();
                OperationsType copyOperations = ((OperationsType) strategy.copy(LocatorUtils.property(locator, "operations", sourceOperations), sourceOperations));
                copy.setOperations(copyOperations);
            } else {
                copy.operations = null;
            }
            if ((this.featureType!= null)&&(!this.featureType.isEmpty())) {
                List<FeatureTypeType> sourceFeatureType;
                sourceFeatureType = this.getFeatureType();
                @SuppressWarnings("unchecked")
                List<FeatureTypeType> copyFeatureType = ((List<FeatureTypeType> ) strategy.copy(LocatorUtils.property(locator, "featureType", sourceFeatureType), sourceFeatureType));
                copy.featureType = null;
                List<FeatureTypeType> uniqueFeatureTypel = copy.getFeatureType();
                uniqueFeatureTypel.addAll(copyFeatureType);
            } else {
                copy.featureType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeatureTypeListType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof FeatureTypeListType) {
            final FeatureTypeListType target = this;
            final FeatureTypeListType leftObject = ((FeatureTypeListType) left);
            final FeatureTypeListType rightObject = ((FeatureTypeListType) right);
            {
                OperationsType lhsOperations;
                lhsOperations = leftObject.getOperations();
                OperationsType rhsOperations;
                rhsOperations = rightObject.getOperations();
                target.setOperations(((OperationsType) strategy.merge(LocatorUtils.property(leftLocator, "operations", lhsOperations), LocatorUtils.property(rightLocator, "operations", rhsOperations), lhsOperations, rhsOperations)));
            }
            {
                List<FeatureTypeType> lhsFeatureType;
                lhsFeatureType = leftObject.getFeatureType();
                List<FeatureTypeType> rhsFeatureType;
                rhsFeatureType = rightObject.getFeatureType();
                target.featureType = null;
                List<FeatureTypeType> uniqueFeatureTypel = target.getFeatureType();
                uniqueFeatureTypel.addAll(((List<FeatureTypeType> ) strategy.merge(LocatorUtils.property(leftLocator, "featureType", lhsFeatureType), LocatorUtils.property(rightLocator, "featureType", rhsFeatureType), lhsFeatureType, rhsFeatureType)));
            }
        }
    }

    public void setFeatureType(List<FeatureTypeType> value) {
        List<FeatureTypeType> draftl = this.getFeatureType();
        draftl.addAll(value);
    }

}
