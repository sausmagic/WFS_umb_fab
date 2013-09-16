//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.v_3_1_1.AbstractFeatureCollectionType;
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
 *             This type defines a container for the response to a 
 *             GetFeature or GetFeatureWithLock request.  If the
 *             request is GetFeatureWithLock, the lockId attribute
 *             must be populated.  The lockId attribute can otherwise
 *             be safely ignored.
 *          
 * 
 * <p>Java-Klasse für FeatureCollectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureCollectionType">
 *       &lt;attribute name="lockId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="numberOfFeatures" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureCollectionType")
public class FeatureCollectionType
    extends AbstractFeatureCollectionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAttribute(name = "lockId")
    protected String lockId;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "numberOfFeatures")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfFeatures;

    /**
     * Ruft den Wert der lockId-Eigenschaft ab.
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
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Ruft den Wert der numberOfFeatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFeatures() {
        return numberOfFeatures;
    }

    /**
     * Legt den Wert der numberOfFeatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFeatures(BigInteger value) {
        this.numberOfFeatures = value;
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
            XMLGregorianCalendar theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            strategy.appendField(locator, this, "timeStamp", buffer, theTimeStamp);
        }
        {
            BigInteger theNumberOfFeatures;
            theNumberOfFeatures = this.getNumberOfFeatures();
            strategy.appendField(locator, this, "numberOfFeatures", buffer, theNumberOfFeatures);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeatureCollectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FeatureCollectionType that = ((FeatureCollectionType) object);
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
            XMLGregorianCalendar lhsTimeStamp;
            lhsTimeStamp = this.getTimeStamp();
            XMLGregorianCalendar rhsTimeStamp;
            rhsTimeStamp = that.getTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStamp", lhsTimeStamp), LocatorUtils.property(thatLocator, "timeStamp", rhsTimeStamp), lhsTimeStamp, rhsTimeStamp)) {
                return false;
            }
        }
        {
            BigInteger lhsNumberOfFeatures;
            lhsNumberOfFeatures = this.getNumberOfFeatures();
            BigInteger rhsNumberOfFeatures;
            rhsNumberOfFeatures = that.getNumberOfFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFeatures", lhsNumberOfFeatures), LocatorUtils.property(thatLocator, "numberOfFeatures", rhsNumberOfFeatures), lhsNumberOfFeatures, rhsNumberOfFeatures)) {
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
            XMLGregorianCalendar theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStamp", theTimeStamp), currentHashCode, theTimeStamp);
        }
        {
            BigInteger theNumberOfFeatures;
            theNumberOfFeatures = this.getNumberOfFeatures();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfFeatures", theNumberOfFeatures), currentHashCode, theNumberOfFeatures);
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
        if (draftCopy instanceof FeatureCollectionType) {
            final FeatureCollectionType copy = ((FeatureCollectionType) draftCopy);
            if (this.lockId!= null) {
                String sourceLockId;
                sourceLockId = this.getLockId();
                String copyLockId = ((String) strategy.copy(LocatorUtils.property(locator, "lockId", sourceLockId), sourceLockId));
                copy.setLockId(copyLockId);
            } else {
                copy.lockId = null;
            }
            if (this.timeStamp!= null) {
                XMLGregorianCalendar sourceTimeStamp;
                sourceTimeStamp = this.getTimeStamp();
                XMLGregorianCalendar copyTimeStamp = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "timeStamp", sourceTimeStamp), sourceTimeStamp));
                copy.setTimeStamp(copyTimeStamp);
            } else {
                copy.timeStamp = null;
            }
            if (this.numberOfFeatures!= null) {
                BigInteger sourceNumberOfFeatures;
                sourceNumberOfFeatures = this.getNumberOfFeatures();
                BigInteger copyNumberOfFeatures = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numberOfFeatures", sourceNumberOfFeatures), sourceNumberOfFeatures));
                copy.setNumberOfFeatures(copyNumberOfFeatures);
            } else {
                copy.numberOfFeatures = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeatureCollectionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof FeatureCollectionType) {
            final FeatureCollectionType target = this;
            final FeatureCollectionType leftObject = ((FeatureCollectionType) left);
            final FeatureCollectionType rightObject = ((FeatureCollectionType) right);
            {
                String lhsLockId;
                lhsLockId = leftObject.getLockId();
                String rhsLockId;
                rhsLockId = rightObject.getLockId();
                target.setLockId(((String) strategy.merge(LocatorUtils.property(leftLocator, "lockId", lhsLockId), LocatorUtils.property(rightLocator, "lockId", rhsLockId), lhsLockId, rhsLockId)));
            }
            {
                XMLGregorianCalendar lhsTimeStamp;
                lhsTimeStamp = leftObject.getTimeStamp();
                XMLGregorianCalendar rhsTimeStamp;
                rhsTimeStamp = rightObject.getTimeStamp();
                target.setTimeStamp(((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "timeStamp", lhsTimeStamp), LocatorUtils.property(rightLocator, "timeStamp", rhsTimeStamp), lhsTimeStamp, rhsTimeStamp)));
            }
            {
                BigInteger lhsNumberOfFeatures;
                lhsNumberOfFeatures = leftObject.getNumberOfFeatures();
                BigInteger rhsNumberOfFeatures;
                rhsNumberOfFeatures = rightObject.getNumberOfFeatures();
                target.setNumberOfFeatures(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "numberOfFeatures", lhsNumberOfFeatures), LocatorUtils.property(rightLocator, "numberOfFeatures", rhsNumberOfFeatures), lhsNumberOfFeatures, rhsNumberOfFeatures)));
            }
        }
    }

}
