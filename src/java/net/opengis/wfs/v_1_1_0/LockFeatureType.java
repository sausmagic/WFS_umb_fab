//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * 
 *             This type defines the LockFeature operation.  The LockFeature
 *             element contains one or more Lock elements that define which
 *             features of a particular type should be locked.  A lock
 *             identifier (lockId) is returned to the client application which
 *             can be used by subsequent operations to reference the locked
 *             features.
 *          
 * 
 * <p>Java-Klasse für LockFeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LockFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Lock" type="{http://www.opengis.net/wfs}LockType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="expiry" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="5" />
 *       &lt;attribute name="lockAction" type="{http://www.opengis.net/wfs}AllSomeType" default="ALL" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockFeatureType", propOrder = {
    "lock"
})
public class LockFeatureType
    extends BaseRequestType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Lock", required = true)
    protected List<LockType> lock;
    @XmlAttribute(name = "expiry")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expiry;
    @XmlAttribute(name = "lockAction")
    protected AllSomeType lockAction;

    /**
     * Gets the value of the lock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LockType }
     * 
     * 
     */
    public List<LockType> getLock() {
        if (lock == null) {
            lock = new ArrayList<LockType>();
        }
        return this.lock;
    }

    /**
     * Ruft den Wert der expiry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpiry() {
        if (expiry == null) {
            return new BigInteger("5");
        } else {
            return expiry;
        }
    }

    /**
     * Legt den Wert der expiry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpiry(BigInteger value) {
        this.expiry = value;
    }

    /**
     * Ruft den Wert der lockAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllSomeType }
     *     
     */
    public AllSomeType getLockAction() {
        if (lockAction == null) {
            return AllSomeType.ALL;
        } else {
            return lockAction;
        }
    }

    /**
     * Legt den Wert der lockAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllSomeType }
     *     
     */
    public void setLockAction(AllSomeType value) {
        this.lockAction = value;
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
            List<LockType> theLock;
            theLock = this.getLock();
            strategy.appendField(locator, this, "lock", buffer, theLock);
        }
        {
            BigInteger theExpiry;
            theExpiry = this.getExpiry();
            strategy.appendField(locator, this, "expiry", buffer, theExpiry);
        }
        {
            AllSomeType theLockAction;
            theLockAction = this.getLockAction();
            strategy.appendField(locator, this, "lockAction", buffer, theLockAction);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LockFeatureType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final LockFeatureType that = ((LockFeatureType) object);
        {
            List<LockType> lhsLock;
            lhsLock = this.getLock();
            List<LockType> rhsLock;
            rhsLock = that.getLock();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lock", lhsLock), LocatorUtils.property(thatLocator, "lock", rhsLock), lhsLock, rhsLock)) {
                return false;
            }
        }
        {
            BigInteger lhsExpiry;
            lhsExpiry = this.getExpiry();
            BigInteger rhsExpiry;
            rhsExpiry = that.getExpiry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiry", lhsExpiry), LocatorUtils.property(thatLocator, "expiry", rhsExpiry), lhsExpiry, rhsExpiry)) {
                return false;
            }
        }
        {
            AllSomeType lhsLockAction;
            lhsLockAction = this.getLockAction();
            AllSomeType rhsLockAction;
            rhsLockAction = that.getLockAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockAction", lhsLockAction), LocatorUtils.property(thatLocator, "lockAction", rhsLockAction), lhsLockAction, rhsLockAction)) {
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
            List<LockType> theLock;
            theLock = this.getLock();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lock", theLock), currentHashCode, theLock);
        }
        {
            BigInteger theExpiry;
            theExpiry = this.getExpiry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiry", theExpiry), currentHashCode, theExpiry);
        }
        {
            AllSomeType theLockAction;
            theLockAction = this.getLockAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockAction", theLockAction), currentHashCode, theLockAction);
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
        if (draftCopy instanceof LockFeatureType) {
            final LockFeatureType copy = ((LockFeatureType) draftCopy);
            if ((this.lock!= null)&&(!this.lock.isEmpty())) {
                List<LockType> sourceLock;
                sourceLock = this.getLock();
                @SuppressWarnings("unchecked")
                List<LockType> copyLock = ((List<LockType> ) strategy.copy(LocatorUtils.property(locator, "lock", sourceLock), sourceLock));
                copy.lock = null;
                List<LockType> uniqueLockl = copy.getLock();
                uniqueLockl.addAll(copyLock);
            } else {
                copy.lock = null;
            }
            if (this.expiry!= null) {
                BigInteger sourceExpiry;
                sourceExpiry = this.getExpiry();
                BigInteger copyExpiry = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "expiry", sourceExpiry), sourceExpiry));
                copy.setExpiry(copyExpiry);
            } else {
                copy.expiry = null;
            }
            if (this.lockAction!= null) {
                AllSomeType sourceLockAction;
                sourceLockAction = this.getLockAction();
                AllSomeType copyLockAction = ((AllSomeType) strategy.copy(LocatorUtils.property(locator, "lockAction", sourceLockAction), sourceLockAction));
                copy.setLockAction(copyLockAction);
            } else {
                copy.lockAction = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LockFeatureType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof LockFeatureType) {
            final LockFeatureType target = this;
            final LockFeatureType leftObject = ((LockFeatureType) left);
            final LockFeatureType rightObject = ((LockFeatureType) right);
            {
                List<LockType> lhsLock;
                lhsLock = leftObject.getLock();
                List<LockType> rhsLock;
                rhsLock = rightObject.getLock();
                target.lock = null;
                List<LockType> uniqueLockl = target.getLock();
                uniqueLockl.addAll(((List<LockType> ) strategy.merge(LocatorUtils.property(leftLocator, "lock", lhsLock), LocatorUtils.property(rightLocator, "lock", rhsLock), lhsLock, rhsLock)));
            }
            {
                BigInteger lhsExpiry;
                lhsExpiry = leftObject.getExpiry();
                BigInteger rhsExpiry;
                rhsExpiry = rightObject.getExpiry();
                target.setExpiry(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "expiry", lhsExpiry), LocatorUtils.property(rightLocator, "expiry", rhsExpiry), lhsExpiry, rhsExpiry)));
            }
            {
                AllSomeType lhsLockAction;
                lhsLockAction = leftObject.getLockAction();
                AllSomeType rhsLockAction;
                rhsLockAction = rightObject.getLockAction();
                target.setLockAction(((AllSomeType) strategy.merge(LocatorUtils.property(leftLocator, "lockAction", lhsLockAction), LocatorUtils.property(rightLocator, "lockAction", rhsLockAction), lhsLockAction, rhsLockAction)));
            }
        }
    }

    public void setLock(List<LockType> value) {
        List<LockType> draftl = this.getLock();
        draftl.addAll(value);
    }

}
