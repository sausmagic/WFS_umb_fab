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
 *             Reports the total number of features affected by some kind 
 *             of write action (i.e, insert, update, delete).
 *          
 * 
 * <p>Java-Klasse für TransactionSummaryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransactionSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalInserted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="totalUpdated" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="totalDeleted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSummaryType", propOrder = {
    "totalInserted",
    "totalUpdated",
    "totalDeleted"
})
public class TransactionSummaryType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalInserted;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalUpdated;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalDeleted;

    /**
     * Ruft den Wert der totalInserted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalInserted() {
        return totalInserted;
    }

    /**
     * Legt den Wert der totalInserted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalInserted(BigInteger value) {
        this.totalInserted = value;
    }

    /**
     * Ruft den Wert der totalUpdated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUpdated() {
        return totalUpdated;
    }

    /**
     * Legt den Wert der totalUpdated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUpdated(BigInteger value) {
        this.totalUpdated = value;
    }

    /**
     * Ruft den Wert der totalDeleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDeleted() {
        return totalDeleted;
    }

    /**
     * Legt den Wert der totalDeleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDeleted(BigInteger value) {
        this.totalDeleted = value;
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
            BigInteger theTotalInserted;
            theTotalInserted = this.getTotalInserted();
            strategy.appendField(locator, this, "totalInserted", buffer, theTotalInserted);
        }
        {
            BigInteger theTotalUpdated;
            theTotalUpdated = this.getTotalUpdated();
            strategy.appendField(locator, this, "totalUpdated", buffer, theTotalUpdated);
        }
        {
            BigInteger theTotalDeleted;
            theTotalDeleted = this.getTotalDeleted();
            strategy.appendField(locator, this, "totalDeleted", buffer, theTotalDeleted);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransactionSummaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransactionSummaryType that = ((TransactionSummaryType) object);
        {
            BigInteger lhsTotalInserted;
            lhsTotalInserted = this.getTotalInserted();
            BigInteger rhsTotalInserted;
            rhsTotalInserted = that.getTotalInserted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalInserted", lhsTotalInserted), LocatorUtils.property(thatLocator, "totalInserted", rhsTotalInserted), lhsTotalInserted, rhsTotalInserted)) {
                return false;
            }
        }
        {
            BigInteger lhsTotalUpdated;
            lhsTotalUpdated = this.getTotalUpdated();
            BigInteger rhsTotalUpdated;
            rhsTotalUpdated = that.getTotalUpdated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalUpdated", lhsTotalUpdated), LocatorUtils.property(thatLocator, "totalUpdated", rhsTotalUpdated), lhsTotalUpdated, rhsTotalUpdated)) {
                return false;
            }
        }
        {
            BigInteger lhsTotalDeleted;
            lhsTotalDeleted = this.getTotalDeleted();
            BigInteger rhsTotalDeleted;
            rhsTotalDeleted = that.getTotalDeleted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalDeleted", lhsTotalDeleted), LocatorUtils.property(thatLocator, "totalDeleted", rhsTotalDeleted), lhsTotalDeleted, rhsTotalDeleted)) {
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
            BigInteger theTotalInserted;
            theTotalInserted = this.getTotalInserted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalInserted", theTotalInserted), currentHashCode, theTotalInserted);
        }
        {
            BigInteger theTotalUpdated;
            theTotalUpdated = this.getTotalUpdated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalUpdated", theTotalUpdated), currentHashCode, theTotalUpdated);
        }
        {
            BigInteger theTotalDeleted;
            theTotalDeleted = this.getTotalDeleted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalDeleted", theTotalDeleted), currentHashCode, theTotalDeleted);
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
        if (draftCopy instanceof TransactionSummaryType) {
            final TransactionSummaryType copy = ((TransactionSummaryType) draftCopy);
            if (this.totalInserted!= null) {
                BigInteger sourceTotalInserted;
                sourceTotalInserted = this.getTotalInserted();
                BigInteger copyTotalInserted = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "totalInserted", sourceTotalInserted), sourceTotalInserted));
                copy.setTotalInserted(copyTotalInserted);
            } else {
                copy.totalInserted = null;
            }
            if (this.totalUpdated!= null) {
                BigInteger sourceTotalUpdated;
                sourceTotalUpdated = this.getTotalUpdated();
                BigInteger copyTotalUpdated = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "totalUpdated", sourceTotalUpdated), sourceTotalUpdated));
                copy.setTotalUpdated(copyTotalUpdated);
            } else {
                copy.totalUpdated = null;
            }
            if (this.totalDeleted!= null) {
                BigInteger sourceTotalDeleted;
                sourceTotalDeleted = this.getTotalDeleted();
                BigInteger copyTotalDeleted = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "totalDeleted", sourceTotalDeleted), sourceTotalDeleted));
                copy.setTotalDeleted(copyTotalDeleted);
            } else {
                copy.totalDeleted = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransactionSummaryType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof TransactionSummaryType) {
            final TransactionSummaryType target = this;
            final TransactionSummaryType leftObject = ((TransactionSummaryType) left);
            final TransactionSummaryType rightObject = ((TransactionSummaryType) right);
            {
                BigInteger lhsTotalInserted;
                lhsTotalInserted = leftObject.getTotalInserted();
                BigInteger rhsTotalInserted;
                rhsTotalInserted = rightObject.getTotalInserted();
                target.setTotalInserted(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "totalInserted", lhsTotalInserted), LocatorUtils.property(rightLocator, "totalInserted", rhsTotalInserted), lhsTotalInserted, rhsTotalInserted)));
            }
            {
                BigInteger lhsTotalUpdated;
                lhsTotalUpdated = leftObject.getTotalUpdated();
                BigInteger rhsTotalUpdated;
                rhsTotalUpdated = rightObject.getTotalUpdated();
                target.setTotalUpdated(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "totalUpdated", lhsTotalUpdated), LocatorUtils.property(rightLocator, "totalUpdated", rhsTotalUpdated), lhsTotalUpdated, rhsTotalUpdated)));
            }
            {
                BigInteger lhsTotalDeleted;
                lhsTotalDeleted = leftObject.getTotalDeleted();
                BigInteger rhsTotalDeleted;
                rhsTotalDeleted = rightObject.getTotalDeleted();
                target.setTotalDeleted(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "totalDeleted", lhsTotalDeleted), LocatorUtils.property(rightLocator, "totalDeleted", rhsTotalDeleted), lhsTotalDeleted, rhsTotalDeleted)));
            }
        }
    }

}
