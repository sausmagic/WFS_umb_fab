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
 * A group of related parameter values. The same group can be repeated more than once in a Conversion, Transformation, or higher level parameterValueGroup, if those instances contain different values of one or more parameterValues which suitably distinquish among those groups. This concrete complexType can be used for operation methods without using an Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one instance. This complexType can be used, extended, or restricted for well-known operation methods, especially for methods with many instances. 
 * 
 * <p>Java-Klasse für ParameterValueGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParameterValueGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralParameterValueType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}includesValue" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml}valuesOfGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueGroupType", propOrder = {
    "includesValue",
    "valuesOfGroup"
})
public class ParameterValueGroupType
    extends AbstractGeneralParameterValueType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<AbstractGeneralParameterValueType> includesValue;
    @XmlElement(required = true)
    protected OperationParameterGroupRefType valuesOfGroup;

    /**
     * Unordered set of composition associations to the parameter values and groups of values included in this group. Gets the value of the includesValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGeneralParameterValueType }
     * 
     * 
     */
    public List<AbstractGeneralParameterValueType> getIncludesValue() {
        if (includesValue == null) {
            includesValue = new ArrayList<AbstractGeneralParameterValueType>();
        }
        return this.includesValue;
    }

    public boolean isSetIncludesValue() {
        return ((this.includesValue!= null)&&(!this.includesValue.isEmpty()));
    }

    public void unsetIncludesValue() {
        this.includesValue = null;
    }

    /**
     * Ruft den Wert der valuesOfGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationParameterGroupRefType }
     *     
     */
    public OperationParameterGroupRefType getValuesOfGroup() {
        return valuesOfGroup;
    }

    /**
     * Legt den Wert der valuesOfGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationParameterGroupRefType }
     *     
     */
    public void setValuesOfGroup(OperationParameterGroupRefType value) {
        this.valuesOfGroup = value;
    }

    public boolean isSetValuesOfGroup() {
        return (this.valuesOfGroup!= null);
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
            List<AbstractGeneralParameterValueType> theIncludesValue;
            theIncludesValue = this.getIncludesValue();
            strategy.appendField(locator, this, "includesValue", buffer, theIncludesValue);
        }
        {
            OperationParameterGroupRefType theValuesOfGroup;
            theValuesOfGroup = this.getValuesOfGroup();
            strategy.appendField(locator, this, "valuesOfGroup", buffer, theValuesOfGroup);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ParameterValueGroupType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ParameterValueGroupType that = ((ParameterValueGroupType) object);
        {
            List<AbstractGeneralParameterValueType> lhsIncludesValue;
            lhsIncludesValue = this.getIncludesValue();
            List<AbstractGeneralParameterValueType> rhsIncludesValue;
            rhsIncludesValue = that.getIncludesValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includesValue", lhsIncludesValue), LocatorUtils.property(thatLocator, "includesValue", rhsIncludesValue), lhsIncludesValue, rhsIncludesValue)) {
                return false;
            }
        }
        {
            OperationParameterGroupRefType lhsValuesOfGroup;
            lhsValuesOfGroup = this.getValuesOfGroup();
            OperationParameterGroupRefType rhsValuesOfGroup;
            rhsValuesOfGroup = that.getValuesOfGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuesOfGroup", lhsValuesOfGroup), LocatorUtils.property(thatLocator, "valuesOfGroup", rhsValuesOfGroup), lhsValuesOfGroup, rhsValuesOfGroup)) {
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
            List<AbstractGeneralParameterValueType> theIncludesValue;
            theIncludesValue = this.getIncludesValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includesValue", theIncludesValue), currentHashCode, theIncludesValue);
        }
        {
            OperationParameterGroupRefType theValuesOfGroup;
            theValuesOfGroup = this.getValuesOfGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuesOfGroup", theValuesOfGroup), currentHashCode, theValuesOfGroup);
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
        if (draftCopy instanceof ParameterValueGroupType) {
            final ParameterValueGroupType copy = ((ParameterValueGroupType) draftCopy);
            if (this.isSetIncludesValue()) {
                List<AbstractGeneralParameterValueType> sourceIncludesValue;
                sourceIncludesValue = this.getIncludesValue();
                @SuppressWarnings("unchecked")
                List<AbstractGeneralParameterValueType> copyIncludesValue = ((List<AbstractGeneralParameterValueType> ) strategy.copy(LocatorUtils.property(locator, "includesValue", sourceIncludesValue), sourceIncludesValue));
                copy.unsetIncludesValue();
                List<AbstractGeneralParameterValueType> uniqueIncludesValuel = copy.getIncludesValue();
                uniqueIncludesValuel.addAll(copyIncludesValue);
            } else {
                copy.unsetIncludesValue();
            }
            if (this.isSetValuesOfGroup()) {
                OperationParameterGroupRefType sourceValuesOfGroup;
                sourceValuesOfGroup = this.getValuesOfGroup();
                OperationParameterGroupRefType copyValuesOfGroup = ((OperationParameterGroupRefType) strategy.copy(LocatorUtils.property(locator, "valuesOfGroup", sourceValuesOfGroup), sourceValuesOfGroup));
                copy.setValuesOfGroup(copyValuesOfGroup);
            } else {
                copy.valuesOfGroup = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ParameterValueGroupType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ParameterValueGroupType) {
            final ParameterValueGroupType target = this;
            final ParameterValueGroupType leftObject = ((ParameterValueGroupType) left);
            final ParameterValueGroupType rightObject = ((ParameterValueGroupType) right);
            {
                List<AbstractGeneralParameterValueType> lhsIncludesValue;
                lhsIncludesValue = leftObject.getIncludesValue();
                List<AbstractGeneralParameterValueType> rhsIncludesValue;
                rhsIncludesValue = rightObject.getIncludesValue();
                target.unsetIncludesValue();
                List<AbstractGeneralParameterValueType> uniqueIncludesValuel = target.getIncludesValue();
                uniqueIncludesValuel.addAll(((List<AbstractGeneralParameterValueType> ) strategy.merge(LocatorUtils.property(leftLocator, "includesValue", lhsIncludesValue), LocatorUtils.property(rightLocator, "includesValue", rhsIncludesValue), lhsIncludesValue, rhsIncludesValue)));
            }
            {
                OperationParameterGroupRefType lhsValuesOfGroup;
                lhsValuesOfGroup = leftObject.getValuesOfGroup();
                OperationParameterGroupRefType rhsValuesOfGroup;
                rhsValuesOfGroup = rightObject.getValuesOfGroup();
                target.setValuesOfGroup(((OperationParameterGroupRefType) strategy.merge(LocatorUtils.property(leftLocator, "valuesOfGroup", lhsValuesOfGroup), LocatorUtils.property(rightLocator, "valuesOfGroup", rhsValuesOfGroup), lhsValuesOfGroup, rhsValuesOfGroup)));
            }
        }
    }

    public void setIncludesValue(List<AbstractGeneralParameterValueType> value) {
        List<AbstractGeneralParameterValueType> draftl = this.getIncludesValue();
        draftl.addAll(value);
    }

}
