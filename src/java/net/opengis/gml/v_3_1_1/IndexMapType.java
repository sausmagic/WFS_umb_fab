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
import javax.xml.bind.annotation.XmlList;
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
 * Exends GridFunctionType with a lookUpTable.  This contains a list of indexes of members within the rangeSet corresponding with the members of the domainSet.  The domainSet is traversed in list order if it is enumerated explicitly, or in the order specified by a SequenceRule if the domain is an implicit set.    The length of the lookUpTable corresponds with the length of the subset of the domainSet for which the coverage is defined.
 * 
 * <p>Java-Klasse für IndexMapType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndexMapType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}GridFunctionType">
 *       &lt;sequence>
 *         &lt;element name="lookUpTable" type="{http://www.opengis.net/gml}integerList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexMapType", propOrder = {
    "lookUpTable"
})
public class IndexMapType
    extends GridFunctionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> lookUpTable;

    /**
     * Gets the value of the lookUpTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookUpTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookUpTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLookUpTable() {
        if (lookUpTable == null) {
            lookUpTable = new ArrayList<BigInteger>();
        }
        return this.lookUpTable;
    }

    public boolean isSetLookUpTable() {
        return ((this.lookUpTable!= null)&&(!this.lookUpTable.isEmpty()));
    }

    public void unsetLookUpTable() {
        this.lookUpTable = null;
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
            List<BigInteger> theLookUpTable;
            theLookUpTable = this.getLookUpTable();
            strategy.appendField(locator, this, "lookUpTable", buffer, theLookUpTable);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IndexMapType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final IndexMapType that = ((IndexMapType) object);
        {
            List<BigInteger> lhsLookUpTable;
            lhsLookUpTable = this.getLookUpTable();
            List<BigInteger> rhsLookUpTable;
            rhsLookUpTable = that.getLookUpTable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lookUpTable", lhsLookUpTable), LocatorUtils.property(thatLocator, "lookUpTable", rhsLookUpTable), lhsLookUpTable, rhsLookUpTable)) {
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
            List<BigInteger> theLookUpTable;
            theLookUpTable = this.getLookUpTable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lookUpTable", theLookUpTable), currentHashCode, theLookUpTable);
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
        if (draftCopy instanceof IndexMapType) {
            final IndexMapType copy = ((IndexMapType) draftCopy);
            if (this.isSetLookUpTable()) {
                List<BigInteger> sourceLookUpTable;
                sourceLookUpTable = this.getLookUpTable();
                @SuppressWarnings("unchecked")
                List<BigInteger> copyLookUpTable = ((List<BigInteger> ) strategy.copy(LocatorUtils.property(locator, "lookUpTable", sourceLookUpTable), sourceLookUpTable));
                copy.unsetLookUpTable();
                List<BigInteger> uniqueLookUpTablel = copy.getLookUpTable();
                uniqueLookUpTablel.addAll(copyLookUpTable);
            } else {
                copy.unsetLookUpTable();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new IndexMapType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof IndexMapType) {
            final IndexMapType target = this;
            final IndexMapType leftObject = ((IndexMapType) left);
            final IndexMapType rightObject = ((IndexMapType) right);
            {
                List<BigInteger> lhsLookUpTable;
                lhsLookUpTable = leftObject.getLookUpTable();
                List<BigInteger> rhsLookUpTable;
                rhsLookUpTable = rightObject.getLookUpTable();
                target.unsetLookUpTable();
                List<BigInteger> uniqueLookUpTablel = target.getLookUpTable();
                uniqueLookUpTablel.addAll(((List<BigInteger> ) strategy.merge(LocatorUtils.property(leftLocator, "lookUpTable", lhsLookUpTable), LocatorUtils.property(rightLocator, "lookUpTable", rhsLookUpTable), lhsLookUpTable, rhsLookUpTable)));
            }
        }
    }

    public void setLookUpTable(List<BigInteger> value) {
        List<BigInteger> draftl = this.getLookUpTable();
        draftl.addAll(value);
    }

}
