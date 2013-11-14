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
 * <p>Java-Klasse für DataBlockType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}rangeParameters"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}tupleList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}doubleOrNullTupleList"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataBlockType", propOrder = {
    "rangeParameters",
    "tupleList",
    "doubleOrNullTupleList"
})
public class DataBlockType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected RangeParametersType rangeParameters;
    protected CoordinatesType tupleList;
    @XmlList
    protected List<String> doubleOrNullTupleList;

    /**
     * Ruft den Wert der rangeParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RangeParametersType }
     *     
     */
    public RangeParametersType getRangeParameters() {
        return rangeParameters;
    }

    /**
     * Legt den Wert der rangeParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeParametersType }
     *     
     */
    public void setRangeParameters(RangeParametersType value) {
        this.rangeParameters = value;
    }

    public boolean isSetRangeParameters() {
        return (this.rangeParameters!= null);
    }

    /**
     * Ruft den Wert der tupleList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getTupleList() {
        return tupleList;
    }

    /**
     * Legt den Wert der tupleList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setTupleList(CoordinatesType value) {
        this.tupleList = value;
    }

    public boolean isSetTupleList() {
        return (this.tupleList!= null);
    }

    /**
     * Gets the value of the doubleOrNullTupleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doubleOrNullTupleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoubleOrNullTupleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDoubleOrNullTupleList() {
        if (doubleOrNullTupleList == null) {
            doubleOrNullTupleList = new ArrayList<String>();
        }
        return this.doubleOrNullTupleList;
    }

    public boolean isSetDoubleOrNullTupleList() {
        return ((this.doubleOrNullTupleList!= null)&&(!this.doubleOrNullTupleList.isEmpty()));
    }

    public void unsetDoubleOrNullTupleList() {
        this.doubleOrNullTupleList = null;
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
            RangeParametersType theRangeParameters;
            theRangeParameters = this.getRangeParameters();
            strategy.appendField(locator, this, "rangeParameters", buffer, theRangeParameters);
        }
        {
            CoordinatesType theTupleList;
            theTupleList = this.getTupleList();
            strategy.appendField(locator, this, "tupleList", buffer, theTupleList);
        }
        {
            List<String> theDoubleOrNullTupleList;
            theDoubleOrNullTupleList = this.getDoubleOrNullTupleList();
            strategy.appendField(locator, this, "doubleOrNullTupleList", buffer, theDoubleOrNullTupleList);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DataBlockType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataBlockType that = ((DataBlockType) object);
        {
            RangeParametersType lhsRangeParameters;
            lhsRangeParameters = this.getRangeParameters();
            RangeParametersType rhsRangeParameters;
            rhsRangeParameters = that.getRangeParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeParameters", lhsRangeParameters), LocatorUtils.property(thatLocator, "rangeParameters", rhsRangeParameters), lhsRangeParameters, rhsRangeParameters)) {
                return false;
            }
        }
        {
            CoordinatesType lhsTupleList;
            lhsTupleList = this.getTupleList();
            CoordinatesType rhsTupleList;
            rhsTupleList = that.getTupleList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tupleList", lhsTupleList), LocatorUtils.property(thatLocator, "tupleList", rhsTupleList), lhsTupleList, rhsTupleList)) {
                return false;
            }
        }
        {
            List<String> lhsDoubleOrNullTupleList;
            lhsDoubleOrNullTupleList = this.getDoubleOrNullTupleList();
            List<String> rhsDoubleOrNullTupleList;
            rhsDoubleOrNullTupleList = that.getDoubleOrNullTupleList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doubleOrNullTupleList", lhsDoubleOrNullTupleList), LocatorUtils.property(thatLocator, "doubleOrNullTupleList", rhsDoubleOrNullTupleList), lhsDoubleOrNullTupleList, rhsDoubleOrNullTupleList)) {
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
            RangeParametersType theRangeParameters;
            theRangeParameters = this.getRangeParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeParameters", theRangeParameters), currentHashCode, theRangeParameters);
        }
        {
            CoordinatesType theTupleList;
            theTupleList = this.getTupleList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tupleList", theTupleList), currentHashCode, theTupleList);
        }
        {
            List<String> theDoubleOrNullTupleList;
            theDoubleOrNullTupleList = this.getDoubleOrNullTupleList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doubleOrNullTupleList", theDoubleOrNullTupleList), currentHashCode, theDoubleOrNullTupleList);
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
        if (draftCopy instanceof DataBlockType) {
            final DataBlockType copy = ((DataBlockType) draftCopy);
            if (this.isSetRangeParameters()) {
                RangeParametersType sourceRangeParameters;
                sourceRangeParameters = this.getRangeParameters();
                RangeParametersType copyRangeParameters = ((RangeParametersType) strategy.copy(LocatorUtils.property(locator, "rangeParameters", sourceRangeParameters), sourceRangeParameters));
                copy.setRangeParameters(copyRangeParameters);
            } else {
                copy.rangeParameters = null;
            }
            if (this.isSetTupleList()) {
                CoordinatesType sourceTupleList;
                sourceTupleList = this.getTupleList();
                CoordinatesType copyTupleList = ((CoordinatesType) strategy.copy(LocatorUtils.property(locator, "tupleList", sourceTupleList), sourceTupleList));
                copy.setTupleList(copyTupleList);
            } else {
                copy.tupleList = null;
            }
            if (this.isSetDoubleOrNullTupleList()) {
                List<String> sourceDoubleOrNullTupleList;
                sourceDoubleOrNullTupleList = this.getDoubleOrNullTupleList();
                @SuppressWarnings("unchecked")
                List<String> copyDoubleOrNullTupleList = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "doubleOrNullTupleList", sourceDoubleOrNullTupleList), sourceDoubleOrNullTupleList));
                copy.unsetDoubleOrNullTupleList();
                List<String> uniqueDoubleOrNullTupleListl = copy.getDoubleOrNullTupleList();
                uniqueDoubleOrNullTupleListl.addAll(copyDoubleOrNullTupleList);
            } else {
                copy.unsetDoubleOrNullTupleList();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DataBlockType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof DataBlockType) {
            final DataBlockType target = this;
            final DataBlockType leftObject = ((DataBlockType) left);
            final DataBlockType rightObject = ((DataBlockType) right);
            {
                RangeParametersType lhsRangeParameters;
                lhsRangeParameters = leftObject.getRangeParameters();
                RangeParametersType rhsRangeParameters;
                rhsRangeParameters = rightObject.getRangeParameters();
                target.setRangeParameters(((RangeParametersType) strategy.merge(LocatorUtils.property(leftLocator, "rangeParameters", lhsRangeParameters), LocatorUtils.property(rightLocator, "rangeParameters", rhsRangeParameters), lhsRangeParameters, rhsRangeParameters)));
            }
            {
                CoordinatesType lhsTupleList;
                lhsTupleList = leftObject.getTupleList();
                CoordinatesType rhsTupleList;
                rhsTupleList = rightObject.getTupleList();
                target.setTupleList(((CoordinatesType) strategy.merge(LocatorUtils.property(leftLocator, "tupleList", lhsTupleList), LocatorUtils.property(rightLocator, "tupleList", rhsTupleList), lhsTupleList, rhsTupleList)));
            }
            {
                List<String> lhsDoubleOrNullTupleList;
                lhsDoubleOrNullTupleList = leftObject.getDoubleOrNullTupleList();
                List<String> rhsDoubleOrNullTupleList;
                rhsDoubleOrNullTupleList = rightObject.getDoubleOrNullTupleList();
                target.unsetDoubleOrNullTupleList();
                List<String> uniqueDoubleOrNullTupleListl = target.getDoubleOrNullTupleList();
                uniqueDoubleOrNullTupleListl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "doubleOrNullTupleList", lhsDoubleOrNullTupleList), LocatorUtils.property(rightLocator, "doubleOrNullTupleList", rhsDoubleOrNullTupleList), lhsDoubleOrNullTupleList, rhsDoubleOrNullTupleList)));
            }
        }
    }

    public void setDoubleOrNullTupleList(List<String> value) {
        List<String> draftl = this.getDoubleOrNullTupleList();
        draftl.addAll(value);
    }

}
