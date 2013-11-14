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
 * An ordered sequence of two or more single coordinate operations. The sequence of operations is constrained by the requirement that the source coordinate reference system of step (n+1) must be the same as the target coordinate reference system of step (n). The source coordinate reference system of the first step and the target coordinate reference system of the last step are the source and target coordinate reference system associated with the concatenated operation. Instead of a forward operation, an inverse operation may be used for one or more of the operation steps mentioned above, if the inverse operation is uniquely defined by the forward operation.
 * 
 * <p>Java-Klasse für ConcatenatedOperationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConcatenatedOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateOperationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesSingleOperation" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcatenatedOperationType", propOrder = {
    "usesSingleOperation"
})
public class ConcatenatedOperationType
    extends AbstractCoordinateOperationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<SingleOperationRefType> usesSingleOperation;

    /**
     * Ordered sequence of associations to the two or more single operations used by this concatenated operation. Gets the value of the usesSingleOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesSingleOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesSingleOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleOperationRefType }
     * 
     * 
     */
    public List<SingleOperationRefType> getUsesSingleOperation() {
        if (usesSingleOperation == null) {
            usesSingleOperation = new ArrayList<SingleOperationRefType>();
        }
        return this.usesSingleOperation;
    }

    public boolean isSetUsesSingleOperation() {
        return ((this.usesSingleOperation!= null)&&(!this.usesSingleOperation.isEmpty()));
    }

    public void unsetUsesSingleOperation() {
        this.usesSingleOperation = null;
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
            List<SingleOperationRefType> theUsesSingleOperation;
            theUsesSingleOperation = this.getUsesSingleOperation();
            strategy.appendField(locator, this, "usesSingleOperation", buffer, theUsesSingleOperation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConcatenatedOperationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConcatenatedOperationType that = ((ConcatenatedOperationType) object);
        {
            List<SingleOperationRefType> lhsUsesSingleOperation;
            lhsUsesSingleOperation = this.getUsesSingleOperation();
            List<SingleOperationRefType> rhsUsesSingleOperation;
            rhsUsesSingleOperation = that.getUsesSingleOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesSingleOperation", lhsUsesSingleOperation), LocatorUtils.property(thatLocator, "usesSingleOperation", rhsUsesSingleOperation), lhsUsesSingleOperation, rhsUsesSingleOperation)) {
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
            List<SingleOperationRefType> theUsesSingleOperation;
            theUsesSingleOperation = this.getUsesSingleOperation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesSingleOperation", theUsesSingleOperation), currentHashCode, theUsesSingleOperation);
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
        if (draftCopy instanceof ConcatenatedOperationType) {
            final ConcatenatedOperationType copy = ((ConcatenatedOperationType) draftCopy);
            if (this.isSetUsesSingleOperation()) {
                List<SingleOperationRefType> sourceUsesSingleOperation;
                sourceUsesSingleOperation = this.getUsesSingleOperation();
                @SuppressWarnings("unchecked")
                List<SingleOperationRefType> copyUsesSingleOperation = ((List<SingleOperationRefType> ) strategy.copy(LocatorUtils.property(locator, "usesSingleOperation", sourceUsesSingleOperation), sourceUsesSingleOperation));
                copy.unsetUsesSingleOperation();
                List<SingleOperationRefType> uniqueUsesSingleOperationl = copy.getUsesSingleOperation();
                uniqueUsesSingleOperationl.addAll(copyUsesSingleOperation);
            } else {
                copy.unsetUsesSingleOperation();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConcatenatedOperationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ConcatenatedOperationType) {
            final ConcatenatedOperationType target = this;
            final ConcatenatedOperationType leftObject = ((ConcatenatedOperationType) left);
            final ConcatenatedOperationType rightObject = ((ConcatenatedOperationType) right);
            {
                List<SingleOperationRefType> lhsUsesSingleOperation;
                lhsUsesSingleOperation = leftObject.getUsesSingleOperation();
                List<SingleOperationRefType> rhsUsesSingleOperation;
                rhsUsesSingleOperation = rightObject.getUsesSingleOperation();
                target.unsetUsesSingleOperation();
                List<SingleOperationRefType> uniqueUsesSingleOperationl = target.getUsesSingleOperation();
                uniqueUsesSingleOperationl.addAll(((List<SingleOperationRefType> ) strategy.merge(LocatorUtils.property(leftLocator, "usesSingleOperation", lhsUsesSingleOperation), LocatorUtils.property(rightLocator, "usesSingleOperation", rhsUsesSingleOperation), lhsUsesSingleOperation, rhsUsesSingleOperation)));
            }
        }
    }

    public void setUsesSingleOperation(List<SingleOperationRefType> value) {
        List<SingleOperationRefType> draftl = this.getUsesSingleOperation();
        draftl.addAll(value);
    }

}
