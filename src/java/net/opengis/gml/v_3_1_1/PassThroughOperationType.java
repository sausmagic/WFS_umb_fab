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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * A pass-through operation specifies that a subset of a coordinate tuple is subject to a specific coordinate operation. 
 * 
 * <p>Java-Klasse für PassThroughOperationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassThroughOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateOperationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}modifiedCoordinate" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesOperation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassThroughOperationType", propOrder = {
    "modifiedCoordinate",
    "usesOperation"
})
public class PassThroughOperationType
    extends AbstractCoordinateOperationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> modifiedCoordinate;
    @XmlElement(required = true)
    protected OperationRefType usesOperation;

    /**
     * Ordered sequence of positive integers defining the positions in a coordinate tuple of the coordinates affected by this pass-through operation. Gets the value of the modifiedCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiedCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiedCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getModifiedCoordinate() {
        if (modifiedCoordinate == null) {
            modifiedCoordinate = new ArrayList<BigInteger>();
        }
        return this.modifiedCoordinate;
    }

    public boolean isSetModifiedCoordinate() {
        return ((this.modifiedCoordinate!= null)&&(!this.modifiedCoordinate.isEmpty()));
    }

    public void unsetModifiedCoordinate() {
        this.modifiedCoordinate = null;
    }

    /**
     * Ruft den Wert der usesOperation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationRefType }
     *     
     */
    public OperationRefType getUsesOperation() {
        return usesOperation;
    }

    /**
     * Legt den Wert der usesOperation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationRefType }
     *     
     */
    public void setUsesOperation(OperationRefType value) {
        this.usesOperation = value;
    }

    public boolean isSetUsesOperation() {
        return (this.usesOperation!= null);
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
            List<BigInteger> theModifiedCoordinate;
            theModifiedCoordinate = this.getModifiedCoordinate();
            strategy.appendField(locator, this, "modifiedCoordinate", buffer, theModifiedCoordinate);
        }
        {
            OperationRefType theUsesOperation;
            theUsesOperation = this.getUsesOperation();
            strategy.appendField(locator, this, "usesOperation", buffer, theUsesOperation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PassThroughOperationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PassThroughOperationType that = ((PassThroughOperationType) object);
        {
            List<BigInteger> lhsModifiedCoordinate;
            lhsModifiedCoordinate = this.getModifiedCoordinate();
            List<BigInteger> rhsModifiedCoordinate;
            rhsModifiedCoordinate = that.getModifiedCoordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modifiedCoordinate", lhsModifiedCoordinate), LocatorUtils.property(thatLocator, "modifiedCoordinate", rhsModifiedCoordinate), lhsModifiedCoordinate, rhsModifiedCoordinate)) {
                return false;
            }
        }
        {
            OperationRefType lhsUsesOperation;
            lhsUsesOperation = this.getUsesOperation();
            OperationRefType rhsUsesOperation;
            rhsUsesOperation = that.getUsesOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesOperation", lhsUsesOperation), LocatorUtils.property(thatLocator, "usesOperation", rhsUsesOperation), lhsUsesOperation, rhsUsesOperation)) {
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
            List<BigInteger> theModifiedCoordinate;
            theModifiedCoordinate = this.getModifiedCoordinate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modifiedCoordinate", theModifiedCoordinate), currentHashCode, theModifiedCoordinate);
        }
        {
            OperationRefType theUsesOperation;
            theUsesOperation = this.getUsesOperation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesOperation", theUsesOperation), currentHashCode, theUsesOperation);
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
        if (draftCopy instanceof PassThroughOperationType) {
            final PassThroughOperationType copy = ((PassThroughOperationType) draftCopy);
            if (this.isSetModifiedCoordinate()) {
                List<BigInteger> sourceModifiedCoordinate;
                sourceModifiedCoordinate = this.getModifiedCoordinate();
                @SuppressWarnings("unchecked")
                List<BigInteger> copyModifiedCoordinate = ((List<BigInteger> ) strategy.copy(LocatorUtils.property(locator, "modifiedCoordinate", sourceModifiedCoordinate), sourceModifiedCoordinate));
                copy.unsetModifiedCoordinate();
                List<BigInteger> uniqueModifiedCoordinatel = copy.getModifiedCoordinate();
                uniqueModifiedCoordinatel.addAll(copyModifiedCoordinate);
            } else {
                copy.unsetModifiedCoordinate();
            }
            if (this.isSetUsesOperation()) {
                OperationRefType sourceUsesOperation;
                sourceUsesOperation = this.getUsesOperation();
                OperationRefType copyUsesOperation = ((OperationRefType) strategy.copy(LocatorUtils.property(locator, "usesOperation", sourceUsesOperation), sourceUsesOperation));
                copy.setUsesOperation(copyUsesOperation);
            } else {
                copy.usesOperation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PassThroughOperationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof PassThroughOperationType) {
            final PassThroughOperationType target = this;
            final PassThroughOperationType leftObject = ((PassThroughOperationType) left);
            final PassThroughOperationType rightObject = ((PassThroughOperationType) right);
            {
                List<BigInteger> lhsModifiedCoordinate;
                lhsModifiedCoordinate = leftObject.getModifiedCoordinate();
                List<BigInteger> rhsModifiedCoordinate;
                rhsModifiedCoordinate = rightObject.getModifiedCoordinate();
                target.unsetModifiedCoordinate();
                List<BigInteger> uniqueModifiedCoordinatel = target.getModifiedCoordinate();
                uniqueModifiedCoordinatel.addAll(((List<BigInteger> ) strategy.merge(LocatorUtils.property(leftLocator, "modifiedCoordinate", lhsModifiedCoordinate), LocatorUtils.property(rightLocator, "modifiedCoordinate", rhsModifiedCoordinate), lhsModifiedCoordinate, rhsModifiedCoordinate)));
            }
            {
                OperationRefType lhsUsesOperation;
                lhsUsesOperation = leftObject.getUsesOperation();
                OperationRefType rhsUsesOperation;
                rhsUsesOperation = rightObject.getUsesOperation();
                target.setUsesOperation(((OperationRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesOperation", lhsUsesOperation), LocatorUtils.property(rightLocator, "usesOperation", rhsUsesOperation), lhsUsesOperation, rhsUsesOperation)));
            }
        }
    }

    public void setModifiedCoordinate(List<BigInteger> value) {
        List<BigInteger> draftl = this.getModifiedCoordinate();
        draftl.addAll(value);
    }

}
