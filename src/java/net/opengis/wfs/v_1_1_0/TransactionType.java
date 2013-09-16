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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *             The TransactionType defines the Transaction operation.  A
 *             Transaction element contains one or more Insert, Update
 *             Delete and Native elements that allow a client application
 *             to create, modify or remove feature instances from the 
 *             feature repository that a Web Feature Service controls.
 *          
 * 
 * <p>Java-Klasse für TransactionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wfs}LockId" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/wfs}Insert"/>
 *           &lt;element ref="{http://www.opengis.net/wfs}Update"/>
 *           &lt;element ref="{http://www.opengis.net/wfs}Delete"/>
 *           &lt;element ref="{http://www.opengis.net/wfs}Native"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseAction" type="{http://www.opengis.net/wfs}AllSomeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "lockId",
    "insertOrUpdateOrDelete"
})
public class TransactionType
    extends BaseRequestType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "LockId")
    protected String lockId;
    @XmlElements({
        @XmlElement(name = "Insert", type = InsertElementType.class),
        @XmlElement(name = "Update", type = UpdateElementType.class),
        @XmlElement(name = "Delete", type = DeleteElementType.class),
        @XmlElement(name = "Native", type = NativeType.class)
    })
    protected List<Object> insertOrUpdateOrDelete;
    @XmlAttribute(name = "releaseAction")
    protected AllSomeType releaseAction;

    /**
     * 
     *                         In order for a client application to operate upon
     *                         locked feature instances, the Transaction request
     *                         must include the LockId element.  The content of
     *                         this element must be the lock identifier the client
     *                         application obtained from a previous
     *                         GetFeatureWithLock or LockFeature operation.
     * 
     *                         If the correct lock identifier is specified the Web
     *                         Feature Service knows that the client application may
     *                         operate upon the locked feature instances.
     * 
     *                         No LockId element needs to be specified to operate upon
     *                         unlocked features.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * Legt den Wert der lockId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockId(String value) {
        this.lockId = value;
    }

    /**
     * Gets the value of the insertOrUpdateOrDelete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertOrUpdateOrDelete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertOrUpdateOrDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertElementType }
     * {@link UpdateElementType }
     * {@link DeleteElementType }
     * {@link NativeType }
     * 
     * 
     */
    public List<Object> getInsertOrUpdateOrDelete() {
        if (insertOrUpdateOrDelete == null) {
            insertOrUpdateOrDelete = new ArrayList<Object>();
        }
        return this.insertOrUpdateOrDelete;
    }

    /**
     * Ruft den Wert der releaseAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllSomeType }
     *     
     */
    public AllSomeType getReleaseAction() {
        return releaseAction;
    }

    /**
     * Legt den Wert der releaseAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllSomeType }
     *     
     */
    public void setReleaseAction(AllSomeType value) {
        this.releaseAction = value;
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
            String theLockId;
            theLockId = this.getLockId();
            strategy.appendField(locator, this, "lockId", buffer, theLockId);
        }
        {
            List<Object> theInsertOrUpdateOrDelete;
            theInsertOrUpdateOrDelete = this.getInsertOrUpdateOrDelete();
            strategy.appendField(locator, this, "insertOrUpdateOrDelete", buffer, theInsertOrUpdateOrDelete);
        }
        {
            AllSomeType theReleaseAction;
            theReleaseAction = this.getReleaseAction();
            strategy.appendField(locator, this, "releaseAction", buffer, theReleaseAction);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransactionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TransactionType that = ((TransactionType) object);
        {
            String lhsLockId;
            lhsLockId = this.getLockId();
            String rhsLockId;
            rhsLockId = that.getLockId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockId", lhsLockId), LocatorUtils.property(thatLocator, "lockId", rhsLockId), lhsLockId, rhsLockId)) {
                return false;
            }
        }
        {
            List<Object> lhsInsertOrUpdateOrDelete;
            lhsInsertOrUpdateOrDelete = this.getInsertOrUpdateOrDelete();
            List<Object> rhsInsertOrUpdateOrDelete;
            rhsInsertOrUpdateOrDelete = that.getInsertOrUpdateOrDelete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insertOrUpdateOrDelete", lhsInsertOrUpdateOrDelete), LocatorUtils.property(thatLocator, "insertOrUpdateOrDelete", rhsInsertOrUpdateOrDelete), lhsInsertOrUpdateOrDelete, rhsInsertOrUpdateOrDelete)) {
                return false;
            }
        }
        {
            AllSomeType lhsReleaseAction;
            lhsReleaseAction = this.getReleaseAction();
            AllSomeType rhsReleaseAction;
            rhsReleaseAction = that.getReleaseAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseAction", lhsReleaseAction), LocatorUtils.property(thatLocator, "releaseAction", rhsReleaseAction), lhsReleaseAction, rhsReleaseAction)) {
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
            String theLockId;
            theLockId = this.getLockId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockId", theLockId), currentHashCode, theLockId);
        }
        {
            List<Object> theInsertOrUpdateOrDelete;
            theInsertOrUpdateOrDelete = this.getInsertOrUpdateOrDelete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insertOrUpdateOrDelete", theInsertOrUpdateOrDelete), currentHashCode, theInsertOrUpdateOrDelete);
        }
        {
            AllSomeType theReleaseAction;
            theReleaseAction = this.getReleaseAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseAction", theReleaseAction), currentHashCode, theReleaseAction);
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
        if (draftCopy instanceof TransactionType) {
            final TransactionType copy = ((TransactionType) draftCopy);
            if (this.lockId!= null) {
                String sourceLockId;
                sourceLockId = this.getLockId();
                String copyLockId = ((String) strategy.copy(LocatorUtils.property(locator, "lockId", sourceLockId), sourceLockId));
                copy.setLockId(copyLockId);
            } else {
                copy.lockId = null;
            }
            if ((this.insertOrUpdateOrDelete!= null)&&(!this.insertOrUpdateOrDelete.isEmpty())) {
                List<Object> sourceInsertOrUpdateOrDelete;
                sourceInsertOrUpdateOrDelete = this.getInsertOrUpdateOrDelete();
                @SuppressWarnings("unchecked")
                List<Object> copyInsertOrUpdateOrDelete = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "insertOrUpdateOrDelete", sourceInsertOrUpdateOrDelete), sourceInsertOrUpdateOrDelete));
                copy.insertOrUpdateOrDelete = null;
                List<Object> uniqueInsertOrUpdateOrDeletel = copy.getInsertOrUpdateOrDelete();
                uniqueInsertOrUpdateOrDeletel.addAll(copyInsertOrUpdateOrDelete);
            } else {
                copy.insertOrUpdateOrDelete = null;
            }
            if (this.releaseAction!= null) {
                AllSomeType sourceReleaseAction;
                sourceReleaseAction = this.getReleaseAction();
                AllSomeType copyReleaseAction = ((AllSomeType) strategy.copy(LocatorUtils.property(locator, "releaseAction", sourceReleaseAction), sourceReleaseAction));
                copy.setReleaseAction(copyReleaseAction);
            } else {
                copy.releaseAction = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransactionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TransactionType) {
            final TransactionType target = this;
            final TransactionType leftObject = ((TransactionType) left);
            final TransactionType rightObject = ((TransactionType) right);
            {
                String lhsLockId;
                lhsLockId = leftObject.getLockId();
                String rhsLockId;
                rhsLockId = rightObject.getLockId();
                target.setLockId(((String) strategy.merge(LocatorUtils.property(leftLocator, "lockId", lhsLockId), LocatorUtils.property(rightLocator, "lockId", rhsLockId), lhsLockId, rhsLockId)));
            }
            {
                List<Object> lhsInsertOrUpdateOrDelete;
                lhsInsertOrUpdateOrDelete = leftObject.getInsertOrUpdateOrDelete();
                List<Object> rhsInsertOrUpdateOrDelete;
                rhsInsertOrUpdateOrDelete = rightObject.getInsertOrUpdateOrDelete();
                target.insertOrUpdateOrDelete = null;
                List<Object> uniqueInsertOrUpdateOrDeletel = target.getInsertOrUpdateOrDelete();
                uniqueInsertOrUpdateOrDeletel.addAll(((List<Object> ) strategy.merge(LocatorUtils.property(leftLocator, "insertOrUpdateOrDelete", lhsInsertOrUpdateOrDelete), LocatorUtils.property(rightLocator, "insertOrUpdateOrDelete", rhsInsertOrUpdateOrDelete), lhsInsertOrUpdateOrDelete, rhsInsertOrUpdateOrDelete)));
            }
            {
                AllSomeType lhsReleaseAction;
                lhsReleaseAction = leftObject.getReleaseAction();
                AllSomeType rhsReleaseAction;
                rhsReleaseAction = rightObject.getReleaseAction();
                target.setReleaseAction(((AllSomeType) strategy.merge(LocatorUtils.property(leftLocator, "releaseAction", lhsReleaseAction), LocatorUtils.property(rightLocator, "releaseAction", rhsReleaseAction), lhsReleaseAction, rhsReleaseAction)));
            }
        }
    }

    public void setInsertOrUpdateOrDelete(List<Object> value) {
        List<Object> draftl = this.getInsertOrUpdateOrDelete();
        draftl.addAll(value);
    }

}
