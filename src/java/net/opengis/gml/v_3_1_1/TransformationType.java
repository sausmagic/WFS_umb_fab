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
 * A concrete operation on coordinates that usually includes a change of datum. The parameters of a coordinate transformation are empirically derived from data containing the coordinates of a series of points in both coordinate reference systems. This computational process is usually "over-determined", allowing derivation of error (or accuracy) estimates for the transformation. Also, the stochastic nature of the parameters may result in multiple (different) versions of the same coordinate transformation.
 * 
 * This concrete complexType can be used for all operation methods, without using an Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one Transformation instance. 
 * 
 * <p>Java-Klasse für TransformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralTransformationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesMethod"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformationType", propOrder = {
    "usesMethod",
    "usesValue"
})
public class TransformationType
    extends AbstractGeneralTransformationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected OperationMethodRefType usesMethod;
    protected List<ParameterValueType> usesValue;

    /**
     * Ruft den Wert der usesMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationMethodRefType }
     *     
     */
    public OperationMethodRefType getUsesMethod() {
        return usesMethod;
    }

    /**
     * Legt den Wert der usesMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationMethodRefType }
     *     
     */
    public void setUsesMethod(OperationMethodRefType value) {
        this.usesMethod = value;
    }

    public boolean isSetUsesMethod() {
        return (this.usesMethod!= null);
    }

    /**
     * Unordered set of composition associations to the set of parameter values used by this transformation operation. Gets the value of the usesValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterValueType }
     * 
     * 
     */
    public List<ParameterValueType> getUsesValue() {
        if (usesValue == null) {
            usesValue = new ArrayList<ParameterValueType>();
        }
        return this.usesValue;
    }

    public boolean isSetUsesValue() {
        return ((this.usesValue!= null)&&(!this.usesValue.isEmpty()));
    }

    public void unsetUsesValue() {
        this.usesValue = null;
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
            OperationMethodRefType theUsesMethod;
            theUsesMethod = this.getUsesMethod();
            strategy.appendField(locator, this, "usesMethod", buffer, theUsesMethod);
        }
        {
            List<ParameterValueType> theUsesValue;
            theUsesValue = this.getUsesValue();
            strategy.appendField(locator, this, "usesValue", buffer, theUsesValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransformationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TransformationType that = ((TransformationType) object);
        {
            OperationMethodRefType lhsUsesMethod;
            lhsUsesMethod = this.getUsesMethod();
            OperationMethodRefType rhsUsesMethod;
            rhsUsesMethod = that.getUsesMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesMethod", lhsUsesMethod), LocatorUtils.property(thatLocator, "usesMethod", rhsUsesMethod), lhsUsesMethod, rhsUsesMethod)) {
                return false;
            }
        }
        {
            List<ParameterValueType> lhsUsesValue;
            lhsUsesValue = this.getUsesValue();
            List<ParameterValueType> rhsUsesValue;
            rhsUsesValue = that.getUsesValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesValue", lhsUsesValue), LocatorUtils.property(thatLocator, "usesValue", rhsUsesValue), lhsUsesValue, rhsUsesValue)) {
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
            OperationMethodRefType theUsesMethod;
            theUsesMethod = this.getUsesMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesMethod", theUsesMethod), currentHashCode, theUsesMethod);
        }
        {
            List<ParameterValueType> theUsesValue;
            theUsesValue = this.getUsesValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesValue", theUsesValue), currentHashCode, theUsesValue);
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
        if (draftCopy instanceof TransformationType) {
            final TransformationType copy = ((TransformationType) draftCopy);
            if (this.isSetUsesMethod()) {
                OperationMethodRefType sourceUsesMethod;
                sourceUsesMethod = this.getUsesMethod();
                OperationMethodRefType copyUsesMethod = ((OperationMethodRefType) strategy.copy(LocatorUtils.property(locator, "usesMethod", sourceUsesMethod), sourceUsesMethod));
                copy.setUsesMethod(copyUsesMethod);
            } else {
                copy.usesMethod = null;
            }
            if (this.isSetUsesValue()) {
                List<ParameterValueType> sourceUsesValue;
                sourceUsesValue = this.getUsesValue();
                @SuppressWarnings("unchecked")
                List<ParameterValueType> copyUsesValue = ((List<ParameterValueType> ) strategy.copy(LocatorUtils.property(locator, "usesValue", sourceUsesValue), sourceUsesValue));
                copy.unsetUsesValue();
                List<ParameterValueType> uniqueUsesValuel = copy.getUsesValue();
                uniqueUsesValuel.addAll(copyUsesValue);
            } else {
                copy.unsetUsesValue();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransformationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TransformationType) {
            final TransformationType target = this;
            final TransformationType leftObject = ((TransformationType) left);
            final TransformationType rightObject = ((TransformationType) right);
            {
                OperationMethodRefType lhsUsesMethod;
                lhsUsesMethod = leftObject.getUsesMethod();
                OperationMethodRefType rhsUsesMethod;
                rhsUsesMethod = rightObject.getUsesMethod();
                target.setUsesMethod(((OperationMethodRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesMethod", lhsUsesMethod), LocatorUtils.property(rightLocator, "usesMethod", rhsUsesMethod), lhsUsesMethod, rhsUsesMethod)));
            }
            {
                List<ParameterValueType> lhsUsesValue;
                lhsUsesValue = leftObject.getUsesValue();
                List<ParameterValueType> rhsUsesValue;
                rhsUsesValue = rightObject.getUsesValue();
                target.unsetUsesValue();
                List<ParameterValueType> uniqueUsesValuel = target.getUsesValue();
                uniqueUsesValuel.addAll(((List<ParameterValueType> ) strategy.merge(LocatorUtils.property(leftLocator, "usesValue", lhsUsesValue), LocatorUtils.property(rightLocator, "usesValue", rhsUsesValue), lhsUsesValue, rhsUsesValue)));
            }
        }
    }

    public void setUsesValue(List<ParameterValueType> value) {
        List<ParameterValueType> draftl = this.getUsesValue();
        draftl.addAll(value);
    }

}
