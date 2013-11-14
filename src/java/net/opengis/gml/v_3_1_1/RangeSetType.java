//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * <p>Java-Klasse für RangeSetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RangeSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}ValueArray" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.opengis.net/gml}ScalarValueList" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}DataBlock"/>
 *         &lt;element ref="{http://www.opengis.net/gml}File"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeSetType", propOrder = {
    "valueArray",
    "scalarValueList",
    "dataBlock",
    "file"
})
public class RangeSetType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "ValueArray")
    protected List<ValueArrayType> valueArray;
    @XmlElementRefs({
        @XmlElementRef(name = "BooleanList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CategoryList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "QuantityList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "CountList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> scalarValueList;
    @XmlElement(name = "DataBlock")
    protected DataBlockType dataBlock;
    @XmlElement(name = "File")
    protected FileType file;

    /**
     * each member _Value holds a tuple or "row" from the equivalent table Gets the value of the valueArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueArrayType }
     * 
     * 
     */
    public List<ValueArrayType> getValueArray() {
        if (valueArray == null) {
            valueArray = new ArrayList<ValueArrayType>();
        }
        return this.valueArray;
    }

    public boolean isSetValueArray() {
        return ((this.valueArray!= null)&&(!this.valueArray.isEmpty()));
    }

    public void unsetValueArray() {
        this.valueArray = null;
    }

    /**
     * each list holds the complete set of one scalar component from the values - i.e. a "column" from the equivalent table Gets the value of the scalarValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scalarValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScalarValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CodeOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getScalarValueList() {
        if (scalarValueList == null) {
            scalarValueList = new ArrayList<JAXBElement<?>>();
        }
        return this.scalarValueList;
    }

    public boolean isSetScalarValueList() {
        return ((this.scalarValueList!= null)&&(!this.scalarValueList.isEmpty()));
    }

    public void unsetScalarValueList() {
        this.scalarValueList = null;
    }

    /**
     * Its tuple list holds the values as space-separated tuples each of which contains comma-separated components, and the tuple structure is specified using the rangeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DataBlockType }
     *     
     */
    public DataBlockType getDataBlock() {
        return dataBlock;
    }

    /**
     * Legt den Wert der dataBlock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBlockType }
     *     
     */
    public void setDataBlock(DataBlockType value) {
        this.dataBlock = value;
    }

    public boolean isSetDataBlock() {
        return (this.dataBlock!= null);
    }

    /**
     * a reference to an external source for the data, together with a description of how that external source is structured
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFile() {
        return file;
    }

    /**
     * Legt den Wert der file-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setFile(FileType value) {
        this.file = value;
    }

    public boolean isSetFile() {
        return (this.file!= null);
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
            List<ValueArrayType> theValueArray;
            theValueArray = this.getValueArray();
            strategy.appendField(locator, this, "valueArray", buffer, theValueArray);
        }
        {
            List<JAXBElement<?>> theScalarValueList;
            theScalarValueList = this.getScalarValueList();
            strategy.appendField(locator, this, "scalarValueList", buffer, theScalarValueList);
        }
        {
            DataBlockType theDataBlock;
            theDataBlock = this.getDataBlock();
            strategy.appendField(locator, this, "dataBlock", buffer, theDataBlock);
        }
        {
            FileType theFile;
            theFile = this.getFile();
            strategy.appendField(locator, this, "file", buffer, theFile);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RangeSetType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RangeSetType that = ((RangeSetType) object);
        {
            List<ValueArrayType> lhsValueArray;
            lhsValueArray = this.getValueArray();
            List<ValueArrayType> rhsValueArray;
            rhsValueArray = that.getValueArray();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueArray", lhsValueArray), LocatorUtils.property(thatLocator, "valueArray", rhsValueArray), lhsValueArray, rhsValueArray)) {
                return false;
            }
        }
        {
            List<JAXBElement<?>> lhsScalarValueList;
            lhsScalarValueList = this.getScalarValueList();
            List<JAXBElement<?>> rhsScalarValueList;
            rhsScalarValueList = that.getScalarValueList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scalarValueList", lhsScalarValueList), LocatorUtils.property(thatLocator, "scalarValueList", rhsScalarValueList), lhsScalarValueList, rhsScalarValueList)) {
                return false;
            }
        }
        {
            DataBlockType lhsDataBlock;
            lhsDataBlock = this.getDataBlock();
            DataBlockType rhsDataBlock;
            rhsDataBlock = that.getDataBlock();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataBlock", lhsDataBlock), LocatorUtils.property(thatLocator, "dataBlock", rhsDataBlock), lhsDataBlock, rhsDataBlock)) {
                return false;
            }
        }
        {
            FileType lhsFile;
            lhsFile = this.getFile();
            FileType rhsFile;
            rhsFile = that.getFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "file", lhsFile), LocatorUtils.property(thatLocator, "file", rhsFile), lhsFile, rhsFile)) {
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
            List<ValueArrayType> theValueArray;
            theValueArray = this.getValueArray();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueArray", theValueArray), currentHashCode, theValueArray);
        }
        {
            List<JAXBElement<?>> theScalarValueList;
            theScalarValueList = this.getScalarValueList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scalarValueList", theScalarValueList), currentHashCode, theScalarValueList);
        }
        {
            DataBlockType theDataBlock;
            theDataBlock = this.getDataBlock();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataBlock", theDataBlock), currentHashCode, theDataBlock);
        }
        {
            FileType theFile;
            theFile = this.getFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "file", theFile), currentHashCode, theFile);
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
        if (draftCopy instanceof RangeSetType) {
            final RangeSetType copy = ((RangeSetType) draftCopy);
            if (this.isSetValueArray()) {
                List<ValueArrayType> sourceValueArray;
                sourceValueArray = this.getValueArray();
                @SuppressWarnings("unchecked")
                List<ValueArrayType> copyValueArray = ((List<ValueArrayType> ) strategy.copy(LocatorUtils.property(locator, "valueArray", sourceValueArray), sourceValueArray));
                copy.unsetValueArray();
                List<ValueArrayType> uniqueValueArrayl = copy.getValueArray();
                uniqueValueArrayl.addAll(copyValueArray);
            } else {
                copy.unsetValueArray();
            }
            if (this.isSetScalarValueList()) {
                List<JAXBElement<?>> sourceScalarValueList;
                sourceScalarValueList = this.getScalarValueList();
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyScalarValueList = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "scalarValueList", sourceScalarValueList), sourceScalarValueList));
                copy.unsetScalarValueList();
                List<JAXBElement<?>> uniqueScalarValueListl = copy.getScalarValueList();
                uniqueScalarValueListl.addAll(copyScalarValueList);
            } else {
                copy.unsetScalarValueList();
            }
            if (this.isSetDataBlock()) {
                DataBlockType sourceDataBlock;
                sourceDataBlock = this.getDataBlock();
                DataBlockType copyDataBlock = ((DataBlockType) strategy.copy(LocatorUtils.property(locator, "dataBlock", sourceDataBlock), sourceDataBlock));
                copy.setDataBlock(copyDataBlock);
            } else {
                copy.dataBlock = null;
            }
            if (this.isSetFile()) {
                FileType sourceFile;
                sourceFile = this.getFile();
                FileType copyFile = ((FileType) strategy.copy(LocatorUtils.property(locator, "file", sourceFile), sourceFile));
                copy.setFile(copyFile);
            } else {
                copy.file = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RangeSetType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof RangeSetType) {
            final RangeSetType target = this;
            final RangeSetType leftObject = ((RangeSetType) left);
            final RangeSetType rightObject = ((RangeSetType) right);
            {
                List<ValueArrayType> lhsValueArray;
                lhsValueArray = leftObject.getValueArray();
                List<ValueArrayType> rhsValueArray;
                rhsValueArray = rightObject.getValueArray();
                target.unsetValueArray();
                List<ValueArrayType> uniqueValueArrayl = target.getValueArray();
                uniqueValueArrayl.addAll(((List<ValueArrayType> ) strategy.merge(LocatorUtils.property(leftLocator, "valueArray", lhsValueArray), LocatorUtils.property(rightLocator, "valueArray", rhsValueArray), lhsValueArray, rhsValueArray)));
            }
            {
                List<JAXBElement<?>> lhsScalarValueList;
                lhsScalarValueList = leftObject.getScalarValueList();
                List<JAXBElement<?>> rhsScalarValueList;
                rhsScalarValueList = rightObject.getScalarValueList();
                target.unsetScalarValueList();
                List<JAXBElement<?>> uniqueScalarValueListl = target.getScalarValueList();
                uniqueScalarValueListl.addAll(((List<JAXBElement<?>> ) strategy.merge(LocatorUtils.property(leftLocator, "scalarValueList", lhsScalarValueList), LocatorUtils.property(rightLocator, "scalarValueList", rhsScalarValueList), lhsScalarValueList, rhsScalarValueList)));
            }
            {
                DataBlockType lhsDataBlock;
                lhsDataBlock = leftObject.getDataBlock();
                DataBlockType rhsDataBlock;
                rhsDataBlock = rightObject.getDataBlock();
                target.setDataBlock(((DataBlockType) strategy.merge(LocatorUtils.property(leftLocator, "dataBlock", lhsDataBlock), LocatorUtils.property(rightLocator, "dataBlock", rhsDataBlock), lhsDataBlock, rhsDataBlock)));
            }
            {
                FileType lhsFile;
                lhsFile = leftObject.getFile();
                FileType rhsFile;
                rhsFile = rightObject.getFile();
                target.setFile(((FileType) strategy.merge(LocatorUtils.property(leftLocator, "file", lhsFile), LocatorUtils.property(rightLocator, "file", rhsFile), lhsFile, rhsFile)));
            }
        }
    }

    public void setValueArray(List<ValueArrayType> value) {
        List<ValueArrayType> draftl = this.getValueArray();
        draftl.addAll(value);
    }

    public void setScalarValueList(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getScalarValueList();
        draftl.addAll(value);
    }

}
