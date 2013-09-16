//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *             The response for a transaction request that was successfully
 *             completed. If the transaction failed for any reason, an
 *             exception report is returned instead.
 *          
 * 
 * <p>Java-Klasse für TransactionResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransactionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionSummary" type="{http://www.opengis.net/wfs}TransactionSummaryType"/>
 *         &lt;element name="TransactionResults" type="{http://www.opengis.net/wfs}TransactionResultsType" minOccurs="0"/>
 *         &lt;element name="InsertResults" type="{http://www.opengis.net/wfs}InsertResultsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResponseType", propOrder = {
    "transactionSummary",
    "transactionResults",
    "insertResults"
})
public class TransactionResponseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "TransactionSummary", required = true)
    protected TransactionSummaryType transactionSummary;
    @XmlElement(name = "TransactionResults")
    protected TransactionResultsType transactionResults;
    @XmlElement(name = "InsertResults", required = true)
    protected InsertResultsType insertResults;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der transactionSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSummaryType }
     *     
     */
    public TransactionSummaryType getTransactionSummary() {
        return transactionSummary;
    }

    /**
     * Legt den Wert der transactionSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSummaryType }
     *     
     */
    public void setTransactionSummary(TransactionSummaryType value) {
        this.transactionSummary = value;
    }

    /**
     * Ruft den Wert der transactionResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransactionResultsType }
     *     
     */
    public TransactionResultsType getTransactionResults() {
        return transactionResults;
    }

    /**
     * Legt den Wert der transactionResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionResultsType }
     *     
     */
    public void setTransactionResults(TransactionResultsType value) {
        this.transactionResults = value;
    }

    /**
     * Ruft den Wert der insertResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InsertResultsType }
     *     
     */
    public InsertResultsType getInsertResults() {
        return insertResults;
    }

    /**
     * Legt den Wert der insertResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertResultsType }
     *     
     */
    public void setInsertResults(InsertResultsType value) {
        this.insertResults = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.1.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
            TransactionSummaryType theTransactionSummary;
            theTransactionSummary = this.getTransactionSummary();
            strategy.appendField(locator, this, "transactionSummary", buffer, theTransactionSummary);
        }
        {
            TransactionResultsType theTransactionResults;
            theTransactionResults = this.getTransactionResults();
            strategy.appendField(locator, this, "transactionResults", buffer, theTransactionResults);
        }
        {
            InsertResultsType theInsertResults;
            theInsertResults = this.getInsertResults();
            strategy.appendField(locator, this, "insertResults", buffer, theInsertResults);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransactionResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransactionResponseType that = ((TransactionResponseType) object);
        {
            TransactionSummaryType lhsTransactionSummary;
            lhsTransactionSummary = this.getTransactionSummary();
            TransactionSummaryType rhsTransactionSummary;
            rhsTransactionSummary = that.getTransactionSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionSummary", lhsTransactionSummary), LocatorUtils.property(thatLocator, "transactionSummary", rhsTransactionSummary), lhsTransactionSummary, rhsTransactionSummary)) {
                return false;
            }
        }
        {
            TransactionResultsType lhsTransactionResults;
            lhsTransactionResults = this.getTransactionResults();
            TransactionResultsType rhsTransactionResults;
            rhsTransactionResults = that.getTransactionResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionResults", lhsTransactionResults), LocatorUtils.property(thatLocator, "transactionResults", rhsTransactionResults), lhsTransactionResults, rhsTransactionResults)) {
                return false;
            }
        }
        {
            InsertResultsType lhsInsertResults;
            lhsInsertResults = this.getInsertResults();
            InsertResultsType rhsInsertResults;
            rhsInsertResults = that.getInsertResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insertResults", lhsInsertResults), LocatorUtils.property(thatLocator, "insertResults", rhsInsertResults), lhsInsertResults, rhsInsertResults)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
            TransactionSummaryType theTransactionSummary;
            theTransactionSummary = this.getTransactionSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionSummary", theTransactionSummary), currentHashCode, theTransactionSummary);
        }
        {
            TransactionResultsType theTransactionResults;
            theTransactionResults = this.getTransactionResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionResults", theTransactionResults), currentHashCode, theTransactionResults);
        }
        {
            InsertResultsType theInsertResults;
            theInsertResults = this.getInsertResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insertResults", theInsertResults), currentHashCode, theInsertResults);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
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
        if (draftCopy instanceof TransactionResponseType) {
            final TransactionResponseType copy = ((TransactionResponseType) draftCopy);
            if (this.transactionSummary!= null) {
                TransactionSummaryType sourceTransactionSummary;
                sourceTransactionSummary = this.getTransactionSummary();
                TransactionSummaryType copyTransactionSummary = ((TransactionSummaryType) strategy.copy(LocatorUtils.property(locator, "transactionSummary", sourceTransactionSummary), sourceTransactionSummary));
                copy.setTransactionSummary(copyTransactionSummary);
            } else {
                copy.transactionSummary = null;
            }
            if (this.transactionResults!= null) {
                TransactionResultsType sourceTransactionResults;
                sourceTransactionResults = this.getTransactionResults();
                TransactionResultsType copyTransactionResults = ((TransactionResultsType) strategy.copy(LocatorUtils.property(locator, "transactionResults", sourceTransactionResults), sourceTransactionResults));
                copy.setTransactionResults(copyTransactionResults);
            } else {
                copy.transactionResults = null;
            }
            if (this.insertResults!= null) {
                InsertResultsType sourceInsertResults;
                sourceInsertResults = this.getInsertResults();
                InsertResultsType copyInsertResults = ((InsertResultsType) strategy.copy(LocatorUtils.property(locator, "insertResults", sourceInsertResults), sourceInsertResults));
                copy.setInsertResults(copyInsertResults);
            } else {
                copy.insertResults = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransactionResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof TransactionResponseType) {
            final TransactionResponseType target = this;
            final TransactionResponseType leftObject = ((TransactionResponseType) left);
            final TransactionResponseType rightObject = ((TransactionResponseType) right);
            {
                TransactionSummaryType lhsTransactionSummary;
                lhsTransactionSummary = leftObject.getTransactionSummary();
                TransactionSummaryType rhsTransactionSummary;
                rhsTransactionSummary = rightObject.getTransactionSummary();
                target.setTransactionSummary(((TransactionSummaryType) strategy.merge(LocatorUtils.property(leftLocator, "transactionSummary", lhsTransactionSummary), LocatorUtils.property(rightLocator, "transactionSummary", rhsTransactionSummary), lhsTransactionSummary, rhsTransactionSummary)));
            }
            {
                TransactionResultsType lhsTransactionResults;
                lhsTransactionResults = leftObject.getTransactionResults();
                TransactionResultsType rhsTransactionResults;
                rhsTransactionResults = rightObject.getTransactionResults();
                target.setTransactionResults(((TransactionResultsType) strategy.merge(LocatorUtils.property(leftLocator, "transactionResults", lhsTransactionResults), LocatorUtils.property(rightLocator, "transactionResults", rhsTransactionResults), lhsTransactionResults, rhsTransactionResults)));
            }
            {
                InsertResultsType lhsInsertResults;
                lhsInsertResults = leftObject.getInsertResults();
                InsertResultsType rhsInsertResults;
                rhsInsertResults = rightObject.getInsertResults();
                target.setInsertResults(((InsertResultsType) strategy.merge(LocatorUtils.property(leftLocator, "insertResults", lhsInsertResults), LocatorUtils.property(rightLocator, "insertResults", rhsInsertResults), lhsInsertResults, rhsInsertResults)));
            }
            {
                String lhsVersion;
                lhsVersion = leftObject.getVersion();
                String rhsVersion;
                rhsVersion = rightObject.getVersion();
                target.setVersion(((String) strategy.merge(LocatorUtils.property(leftLocator, "version", lhsVersion), LocatorUtils.property(rightLocator, "version", rhsVersion), lhsVersion, rhsVersion)));
            }
        }
    }

}
