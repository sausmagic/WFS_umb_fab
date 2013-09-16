//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

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
 *             The LockFeatureResponseType is used to define an
 *             element to contains the response to a LockFeature
 *             operation.
 *          
 * 
 * <p>Java-Klasse für LockFeatureResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LockFeatureResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wfs}LockId"/>
 *         &lt;element name="FeaturesLocked" type="{http://www.opengis.net/wfs}FeaturesLockedType" minOccurs="0"/>
 *         &lt;element name="FeaturesNotLocked" type="{http://www.opengis.net/wfs}FeaturesNotLockedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockFeatureResponseType", propOrder = {
    "lockId",
    "featuresLocked",
    "featuresNotLocked"
})
public class LockFeatureResponseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "LockId", required = true)
    protected String lockId;
    @XmlElement(name = "FeaturesLocked")
    protected FeaturesLockedType featuresLocked;
    @XmlElement(name = "FeaturesNotLocked")
    protected FeaturesNotLockedType featuresNotLocked;

    /**
     * 
     *                   The LockFeatureResponse includes a LockId element
     *                   that contains a lock identifier.  The lock identifier
     *                   can be used by a client, in subsequent operations, to
     *                   operate upon the locked feature instances.
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
     * Ruft den Wert der featuresLocked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesLockedType }
     *     
     */
    public FeaturesLockedType getFeaturesLocked() {
        return featuresLocked;
    }

    /**
     * Legt den Wert der featuresLocked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesLockedType }
     *     
     */
    public void setFeaturesLocked(FeaturesLockedType value) {
        this.featuresLocked = value;
    }

    /**
     * Ruft den Wert der featuresNotLocked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesNotLockedType }
     *     
     */
    public FeaturesNotLockedType getFeaturesNotLocked() {
        return featuresNotLocked;
    }

    /**
     * Legt den Wert der featuresNotLocked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesNotLockedType }
     *     
     */
    public void setFeaturesNotLocked(FeaturesNotLockedType value) {
        this.featuresNotLocked = value;
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
            String theLockId;
            theLockId = this.getLockId();
            strategy.appendField(locator, this, "lockId", buffer, theLockId);
        }
        {
            FeaturesLockedType theFeaturesLocked;
            theFeaturesLocked = this.getFeaturesLocked();
            strategy.appendField(locator, this, "featuresLocked", buffer, theFeaturesLocked);
        }
        {
            FeaturesNotLockedType theFeaturesNotLocked;
            theFeaturesNotLocked = this.getFeaturesNotLocked();
            strategy.appendField(locator, this, "featuresNotLocked", buffer, theFeaturesNotLocked);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LockFeatureResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LockFeatureResponseType that = ((LockFeatureResponseType) object);
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
            FeaturesLockedType lhsFeaturesLocked;
            lhsFeaturesLocked = this.getFeaturesLocked();
            FeaturesLockedType rhsFeaturesLocked;
            rhsFeaturesLocked = that.getFeaturesLocked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featuresLocked", lhsFeaturesLocked), LocatorUtils.property(thatLocator, "featuresLocked", rhsFeaturesLocked), lhsFeaturesLocked, rhsFeaturesLocked)) {
                return false;
            }
        }
        {
            FeaturesNotLockedType lhsFeaturesNotLocked;
            lhsFeaturesNotLocked = this.getFeaturesNotLocked();
            FeaturesNotLockedType rhsFeaturesNotLocked;
            rhsFeaturesNotLocked = that.getFeaturesNotLocked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featuresNotLocked", lhsFeaturesNotLocked), LocatorUtils.property(thatLocator, "featuresNotLocked", rhsFeaturesNotLocked), lhsFeaturesNotLocked, rhsFeaturesNotLocked)) {
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
            String theLockId;
            theLockId = this.getLockId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockId", theLockId), currentHashCode, theLockId);
        }
        {
            FeaturesLockedType theFeaturesLocked;
            theFeaturesLocked = this.getFeaturesLocked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featuresLocked", theFeaturesLocked), currentHashCode, theFeaturesLocked);
        }
        {
            FeaturesNotLockedType theFeaturesNotLocked;
            theFeaturesNotLocked = this.getFeaturesNotLocked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featuresNotLocked", theFeaturesNotLocked), currentHashCode, theFeaturesNotLocked);
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
        if (draftCopy instanceof LockFeatureResponseType) {
            final LockFeatureResponseType copy = ((LockFeatureResponseType) draftCopy);
            if (this.lockId!= null) {
                String sourceLockId;
                sourceLockId = this.getLockId();
                String copyLockId = ((String) strategy.copy(LocatorUtils.property(locator, "lockId", sourceLockId), sourceLockId));
                copy.setLockId(copyLockId);
            } else {
                copy.lockId = null;
            }
            if (this.featuresLocked!= null) {
                FeaturesLockedType sourceFeaturesLocked;
                sourceFeaturesLocked = this.getFeaturesLocked();
                FeaturesLockedType copyFeaturesLocked = ((FeaturesLockedType) strategy.copy(LocatorUtils.property(locator, "featuresLocked", sourceFeaturesLocked), sourceFeaturesLocked));
                copy.setFeaturesLocked(copyFeaturesLocked);
            } else {
                copy.featuresLocked = null;
            }
            if (this.featuresNotLocked!= null) {
                FeaturesNotLockedType sourceFeaturesNotLocked;
                sourceFeaturesNotLocked = this.getFeaturesNotLocked();
                FeaturesNotLockedType copyFeaturesNotLocked = ((FeaturesNotLockedType) strategy.copy(LocatorUtils.property(locator, "featuresNotLocked", sourceFeaturesNotLocked), sourceFeaturesNotLocked));
                copy.setFeaturesNotLocked(copyFeaturesNotLocked);
            } else {
                copy.featuresNotLocked = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LockFeatureResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof LockFeatureResponseType) {
            final LockFeatureResponseType target = this;
            final LockFeatureResponseType leftObject = ((LockFeatureResponseType) left);
            final LockFeatureResponseType rightObject = ((LockFeatureResponseType) right);
            {
                String lhsLockId;
                lhsLockId = leftObject.getLockId();
                String rhsLockId;
                rhsLockId = rightObject.getLockId();
                target.setLockId(((String) strategy.merge(LocatorUtils.property(leftLocator, "lockId", lhsLockId), LocatorUtils.property(rightLocator, "lockId", rhsLockId), lhsLockId, rhsLockId)));
            }
            {
                FeaturesLockedType lhsFeaturesLocked;
                lhsFeaturesLocked = leftObject.getFeaturesLocked();
                FeaturesLockedType rhsFeaturesLocked;
                rhsFeaturesLocked = rightObject.getFeaturesLocked();
                target.setFeaturesLocked(((FeaturesLockedType) strategy.merge(LocatorUtils.property(leftLocator, "featuresLocked", lhsFeaturesLocked), LocatorUtils.property(rightLocator, "featuresLocked", rhsFeaturesLocked), lhsFeaturesLocked, rhsFeaturesLocked)));
            }
            {
                FeaturesNotLockedType lhsFeaturesNotLocked;
                lhsFeaturesNotLocked = leftObject.getFeaturesNotLocked();
                FeaturesNotLockedType rhsFeaturesNotLocked;
                rhsFeaturesNotLocked = rightObject.getFeaturesNotLocked();
                target.setFeaturesNotLocked(((FeaturesNotLockedType) strategy.merge(LocatorUtils.property(leftLocator, "featuresNotLocked", lhsFeaturesNotLocked), LocatorUtils.property(rightLocator, "featuresNotLocked", rhsFeaturesNotLocked), lhsFeaturesNotLocked, rhsFeaturesNotLocked)));
            }
        }
    }

}
