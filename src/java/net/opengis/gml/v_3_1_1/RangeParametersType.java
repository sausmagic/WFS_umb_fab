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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
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
 * Metadata about the rangeSet.  Definition of record structure.   
 *       This is required if the rangeSet is encoded in a DataBlock.  
 *       We use a gml:_Value with empty values as a map of the composite value structure.
 * 
 * <p>Java-Klasse für RangeParametersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RangeParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{http://www.opengis.net/gml}ValueObject"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeParametersType", propOrder = {
    "_boolean",
    "category",
    "quantity",
    "count",
    "booleanList",
    "categoryList",
    "quantityList",
    "countList",
    "categoryExtent",
    "quantityExtent",
    "countExtent",
    "compositeValue"
})
public class RangeParametersType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Boolean")
    protected Boolean _boolean;
    @XmlElement(name = "Category")
    protected CodeType category;
    @XmlElement(name = "Quantity")
    protected MeasureType quantity;
    @XmlElement(name = "Count")
    protected BigInteger count;
    @XmlList
    @XmlElement(name = "BooleanList")
    protected List<String> booleanList;
    @XmlElement(name = "CategoryList")
    protected CodeOrNullListType categoryList;
    @XmlElement(name = "QuantityList")
    protected MeasureOrNullListType quantityList;
    @XmlList
    @XmlElement(name = "CountList")
    protected List<String> countList;
    @XmlElement(name = "CategoryExtent")
    protected CategoryExtentType categoryExtent;
    @XmlElement(name = "QuantityExtent")
    protected QuantityExtentType quantityExtent;
    @XmlList
    @XmlElement(name = "CountExtent")
    protected List<String> countExtent;
    @XmlElementRef(name = "CompositeValue", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends CompositeValueType> compositeValue;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Ruft den Wert der boolean-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoolean() {
        return _boolean;
    }

    /**
     * Legt den Wert der boolean-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }

    public boolean isSetBoolean() {
        return (this._boolean!= null);
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCategory(CodeType value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setQuantity(MeasureType value) {
        this.quantity = value;
    }

    public boolean isSetQuantity() {
        return (this.quantity!= null);
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    public boolean isSetCount() {
        return (this.count!= null);
    }

    /**
     * Gets the value of the booleanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBooleanList() {
        if (booleanList == null) {
            booleanList = new ArrayList<String>();
        }
        return this.booleanList;
    }

    public boolean isSetBooleanList() {
        return ((this.booleanList!= null)&&(!this.booleanList.isEmpty()));
    }

    public void unsetBooleanList() {
        this.booleanList = null;
    }

    /**
     * Ruft den Wert der categoryList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeOrNullListType }
     *     
     */
    public CodeOrNullListType getCategoryList() {
        return categoryList;
    }

    /**
     * Legt den Wert der categoryList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeOrNullListType }
     *     
     */
    public void setCategoryList(CodeOrNullListType value) {
        this.categoryList = value;
    }

    public boolean isSetCategoryList() {
        return (this.categoryList!= null);
    }

    /**
     * Ruft den Wert der quantityList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureOrNullListType }
     *     
     */
    public MeasureOrNullListType getQuantityList() {
        return quantityList;
    }

    /**
     * Legt den Wert der quantityList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureOrNullListType }
     *     
     */
    public void setQuantityList(MeasureOrNullListType value) {
        this.quantityList = value;
    }

    public boolean isSetQuantityList() {
        return (this.quantityList!= null);
    }

    /**
     * Gets the value of the countList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountList() {
        if (countList == null) {
            countList = new ArrayList<String>();
        }
        return this.countList;
    }

    public boolean isSetCountList() {
        return ((this.countList!= null)&&(!this.countList.isEmpty()));
    }

    public void unsetCountList() {
        this.countList = null;
    }

    /**
     * Ruft den Wert der categoryExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CategoryExtentType }
     *     
     */
    public CategoryExtentType getCategoryExtent() {
        return categoryExtent;
    }

    /**
     * Legt den Wert der categoryExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryExtentType }
     *     
     */
    public void setCategoryExtent(CategoryExtentType value) {
        this.categoryExtent = value;
    }

    public boolean isSetCategoryExtent() {
        return (this.categoryExtent!= null);
    }

    /**
     * Ruft den Wert der quantityExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuantityExtentType }
     *     
     */
    public QuantityExtentType getQuantityExtent() {
        return quantityExtent;
    }

    /**
     * Legt den Wert der quantityExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityExtentType }
     *     
     */
    public void setQuantityExtent(QuantityExtentType value) {
        this.quantityExtent = value;
    }

    public boolean isSetQuantityExtent() {
        return (this.quantityExtent!= null);
    }

    /**
     * Gets the value of the countExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountExtent() {
        if (countExtent == null) {
            countExtent = new ArrayList<String>();
        }
        return this.countExtent;
    }

    public boolean isSetCountExtent() {
        return ((this.countExtent!= null)&&(!this.countExtent.isEmpty()));
    }

    public void unsetCountExtent() {
        this.countExtent = null;
    }

    /**
     * Ruft den Wert der compositeValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     *     
     */
    public JAXBElement<? extends CompositeValueType> getCompositeValue() {
        return compositeValue;
    }

    /**
     * Legt den Wert der compositeValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     *     
     */
    public void setCompositeValue(JAXBElement<? extends CompositeValueType> value) {
        this.compositeValue = value;
    }

    public boolean isSetCompositeValue() {
        return (this.compositeValue!= null);
    }

    /**
     * Ruft den Wert der remoteSchema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Legt den Wert der remoteSchema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
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
            Boolean theBoolean;
            theBoolean = this.isBoolean();
            strategy.appendField(locator, this, "_boolean", buffer, theBoolean);
        }
        {
            CodeType theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            MeasureType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            BigInteger theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount);
        }
        {
            List<String> theBooleanList;
            theBooleanList = this.getBooleanList();
            strategy.appendField(locator, this, "booleanList", buffer, theBooleanList);
        }
        {
            CodeOrNullListType theCategoryList;
            theCategoryList = this.getCategoryList();
            strategy.appendField(locator, this, "categoryList", buffer, theCategoryList);
        }
        {
            MeasureOrNullListType theQuantityList;
            theQuantityList = this.getQuantityList();
            strategy.appendField(locator, this, "quantityList", buffer, theQuantityList);
        }
        {
            List<String> theCountList;
            theCountList = this.getCountList();
            strategy.appendField(locator, this, "countList", buffer, theCountList);
        }
        {
            CategoryExtentType theCategoryExtent;
            theCategoryExtent = this.getCategoryExtent();
            strategy.appendField(locator, this, "categoryExtent", buffer, theCategoryExtent);
        }
        {
            QuantityExtentType theQuantityExtent;
            theQuantityExtent = this.getQuantityExtent();
            strategy.appendField(locator, this, "quantityExtent", buffer, theQuantityExtent);
        }
        {
            List<String> theCountExtent;
            theCountExtent = this.getCountExtent();
            strategy.appendField(locator, this, "countExtent", buffer, theCountExtent);
        }
        {
            JAXBElement<? extends CompositeValueType> theCompositeValue;
            theCompositeValue = this.getCompositeValue();
            strategy.appendField(locator, this, "compositeValue", buffer, theCompositeValue);
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theRemoteSchema);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theShow;
            theShow = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theShow);
        }
        {
            String theActuate;
            theActuate = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theActuate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RangeParametersType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RangeParametersType that = ((RangeParametersType) object);
        {
            Boolean lhsBoolean;
            lhsBoolean = this.isBoolean();
            Boolean rhsBoolean;
            rhsBoolean = that.isBoolean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_boolean", lhsBoolean), LocatorUtils.property(thatLocator, "_boolean", rhsBoolean), lhsBoolean, rhsBoolean)) {
                return false;
            }
        }
        {
            CodeType lhsCategory;
            lhsCategory = this.getCategory();
            CodeType rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        {
            MeasureType lhsQuantity;
            lhsQuantity = this.getQuantity();
            MeasureType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            BigInteger lhsCount;
            lhsCount = this.getCount();
            BigInteger rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount)) {
                return false;
            }
        }
        {
            List<String> lhsBooleanList;
            lhsBooleanList = this.getBooleanList();
            List<String> rhsBooleanList;
            rhsBooleanList = that.getBooleanList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "booleanList", lhsBooleanList), LocatorUtils.property(thatLocator, "booleanList", rhsBooleanList), lhsBooleanList, rhsBooleanList)) {
                return false;
            }
        }
        {
            CodeOrNullListType lhsCategoryList;
            lhsCategoryList = this.getCategoryList();
            CodeOrNullListType rhsCategoryList;
            rhsCategoryList = that.getCategoryList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryList", lhsCategoryList), LocatorUtils.property(thatLocator, "categoryList", rhsCategoryList), lhsCategoryList, rhsCategoryList)) {
                return false;
            }
        }
        {
            MeasureOrNullListType lhsQuantityList;
            lhsQuantityList = this.getQuantityList();
            MeasureOrNullListType rhsQuantityList;
            rhsQuantityList = that.getQuantityList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityList", lhsQuantityList), LocatorUtils.property(thatLocator, "quantityList", rhsQuantityList), lhsQuantityList, rhsQuantityList)) {
                return false;
            }
        }
        {
            List<String> lhsCountList;
            lhsCountList = this.getCountList();
            List<String> rhsCountList;
            rhsCountList = that.getCountList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countList", lhsCountList), LocatorUtils.property(thatLocator, "countList", rhsCountList), lhsCountList, rhsCountList)) {
                return false;
            }
        }
        {
            CategoryExtentType lhsCategoryExtent;
            lhsCategoryExtent = this.getCategoryExtent();
            CategoryExtentType rhsCategoryExtent;
            rhsCategoryExtent = that.getCategoryExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryExtent", lhsCategoryExtent), LocatorUtils.property(thatLocator, "categoryExtent", rhsCategoryExtent), lhsCategoryExtent, rhsCategoryExtent)) {
                return false;
            }
        }
        {
            QuantityExtentType lhsQuantityExtent;
            lhsQuantityExtent = this.getQuantityExtent();
            QuantityExtentType rhsQuantityExtent;
            rhsQuantityExtent = that.getQuantityExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityExtent", lhsQuantityExtent), LocatorUtils.property(thatLocator, "quantityExtent", rhsQuantityExtent), lhsQuantityExtent, rhsQuantityExtent)) {
                return false;
            }
        }
        {
            List<String> lhsCountExtent;
            lhsCountExtent = this.getCountExtent();
            List<String> rhsCountExtent;
            rhsCountExtent = that.getCountExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countExtent", lhsCountExtent), LocatorUtils.property(thatLocator, "countExtent", rhsCountExtent), lhsCountExtent, rhsCountExtent)) {
                return false;
            }
        }
        {
            JAXBElement<? extends CompositeValueType> lhsCompositeValue;
            lhsCompositeValue = this.getCompositeValue();
            JAXBElement<? extends CompositeValueType> rhsCompositeValue;
            rhsCompositeValue = that.getCompositeValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeValue", lhsCompositeValue), LocatorUtils.property(thatLocator, "compositeValue", rhsCompositeValue), lhsCompositeValue, rhsCompositeValue)) {
                return false;
            }
        }
        {
            String lhsRemoteSchema;
            lhsRemoteSchema = this.getRemoteSchema();
            String rhsRemoteSchema;
            rhsRemoteSchema = that.getRemoteSchema();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(thatLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            String lhsRole;
            lhsRole = this.getRole();
            String rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            String lhsArcrole;
            lhsArcrole = this.getArcrole();
            String rhsArcrole;
            rhsArcrole = that.getArcrole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arcrole", lhsArcrole), LocatorUtils.property(thatLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsShow;
            lhsShow = this.getShow();
            String rhsShow;
            rhsShow = that.getShow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "show", lhsShow), LocatorUtils.property(thatLocator, "show", rhsShow), lhsShow, rhsShow)) {
                return false;
            }
        }
        {
            String lhsActuate;
            lhsActuate = this.getActuate();
            String rhsActuate;
            rhsActuate = that.getActuate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actuate", lhsActuate), LocatorUtils.property(thatLocator, "actuate", rhsActuate), lhsActuate, rhsActuate)) {
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
            Boolean theBoolean;
            theBoolean = this.isBoolean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_boolean", theBoolean), currentHashCode, theBoolean);
        }
        {
            CodeType theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory);
        }
        {
            MeasureType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            BigInteger theCount;
            theCount = this.getCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "count", theCount), currentHashCode, theCount);
        }
        {
            List<String> theBooleanList;
            theBooleanList = this.getBooleanList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "booleanList", theBooleanList), currentHashCode, theBooleanList);
        }
        {
            CodeOrNullListType theCategoryList;
            theCategoryList = this.getCategoryList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryList", theCategoryList), currentHashCode, theCategoryList);
        }
        {
            MeasureOrNullListType theQuantityList;
            theQuantityList = this.getQuantityList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityList", theQuantityList), currentHashCode, theQuantityList);
        }
        {
            List<String> theCountList;
            theCountList = this.getCountList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countList", theCountList), currentHashCode, theCountList);
        }
        {
            CategoryExtentType theCategoryExtent;
            theCategoryExtent = this.getCategoryExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryExtent", theCategoryExtent), currentHashCode, theCategoryExtent);
        }
        {
            QuantityExtentType theQuantityExtent;
            theQuantityExtent = this.getQuantityExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityExtent", theQuantityExtent), currentHashCode, theQuantityExtent);
        }
        {
            List<String> theCountExtent;
            theCountExtent = this.getCountExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countExtent", theCountExtent), currentHashCode, theCountExtent);
        }
        {
            JAXBElement<? extends CompositeValueType> theCompositeValue;
            theCompositeValue = this.getCompositeValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeValue", theCompositeValue), currentHashCode, theCompositeValue);
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteSchema", theRemoteSchema), currentHashCode, theRemoteSchema);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arcrole", theArcrole), currentHashCode, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theShow;
            theShow = this.getShow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "show", theShow), currentHashCode, theShow);
        }
        {
            String theActuate;
            theActuate = this.getActuate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actuate", theActuate), currentHashCode, theActuate);
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
        if (draftCopy instanceof RangeParametersType) {
            final RangeParametersType copy = ((RangeParametersType) draftCopy);
            if (this.isSetBoolean()) {
                Boolean sourceBoolean;
                sourceBoolean = this.isBoolean();
                Boolean copyBoolean = ((Boolean) strategy.copy(LocatorUtils.property(locator, "_boolean", sourceBoolean), sourceBoolean));
                copy.setBoolean(copyBoolean);
            } else {
                copy._boolean = null;
            }
            if (this.isSetCategory()) {
                CodeType sourceCategory;
                sourceCategory = this.getCategory();
                CodeType copyCategory = ((CodeType) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory));
                copy.setCategory(copyCategory);
            } else {
                copy.category = null;
            }
            if (this.isSetQuantity()) {
                MeasureType sourceQuantity;
                sourceQuantity = this.getQuantity();
                MeasureType copyQuantity = ((MeasureType) strategy.copy(LocatorUtils.property(locator, "quantity", sourceQuantity), sourceQuantity));
                copy.setQuantity(copyQuantity);
            } else {
                copy.quantity = null;
            }
            if (this.isSetCount()) {
                BigInteger sourceCount;
                sourceCount = this.getCount();
                BigInteger copyCount = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "count", sourceCount), sourceCount));
                copy.setCount(copyCount);
            } else {
                copy.count = null;
            }
            if (this.isSetBooleanList()) {
                List<String> sourceBooleanList;
                sourceBooleanList = this.getBooleanList();
                @SuppressWarnings("unchecked")
                List<String> copyBooleanList = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "booleanList", sourceBooleanList), sourceBooleanList));
                copy.unsetBooleanList();
                List<String> uniqueBooleanListl = copy.getBooleanList();
                uniqueBooleanListl.addAll(copyBooleanList);
            } else {
                copy.unsetBooleanList();
            }
            if (this.isSetCategoryList()) {
                CodeOrNullListType sourceCategoryList;
                sourceCategoryList = this.getCategoryList();
                CodeOrNullListType copyCategoryList = ((CodeOrNullListType) strategy.copy(LocatorUtils.property(locator, "categoryList", sourceCategoryList), sourceCategoryList));
                copy.setCategoryList(copyCategoryList);
            } else {
                copy.categoryList = null;
            }
            if (this.isSetQuantityList()) {
                MeasureOrNullListType sourceQuantityList;
                sourceQuantityList = this.getQuantityList();
                MeasureOrNullListType copyQuantityList = ((MeasureOrNullListType) strategy.copy(LocatorUtils.property(locator, "quantityList", sourceQuantityList), sourceQuantityList));
                copy.setQuantityList(copyQuantityList);
            } else {
                copy.quantityList = null;
            }
            if (this.isSetCountList()) {
                List<String> sourceCountList;
                sourceCountList = this.getCountList();
                @SuppressWarnings("unchecked")
                List<String> copyCountList = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "countList", sourceCountList), sourceCountList));
                copy.unsetCountList();
                List<String> uniqueCountListl = copy.getCountList();
                uniqueCountListl.addAll(copyCountList);
            } else {
                copy.unsetCountList();
            }
            if (this.isSetCategoryExtent()) {
                CategoryExtentType sourceCategoryExtent;
                sourceCategoryExtent = this.getCategoryExtent();
                CategoryExtentType copyCategoryExtent = ((CategoryExtentType) strategy.copy(LocatorUtils.property(locator, "categoryExtent", sourceCategoryExtent), sourceCategoryExtent));
                copy.setCategoryExtent(copyCategoryExtent);
            } else {
                copy.categoryExtent = null;
            }
            if (this.isSetQuantityExtent()) {
                QuantityExtentType sourceQuantityExtent;
                sourceQuantityExtent = this.getQuantityExtent();
                QuantityExtentType copyQuantityExtent = ((QuantityExtentType) strategy.copy(LocatorUtils.property(locator, "quantityExtent", sourceQuantityExtent), sourceQuantityExtent));
                copy.setQuantityExtent(copyQuantityExtent);
            } else {
                copy.quantityExtent = null;
            }
            if (this.isSetCountExtent()) {
                List<String> sourceCountExtent;
                sourceCountExtent = this.getCountExtent();
                @SuppressWarnings("unchecked")
                List<String> copyCountExtent = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "countExtent", sourceCountExtent), sourceCountExtent));
                copy.unsetCountExtent();
                List<String> uniqueCountExtentl = copy.getCountExtent();
                uniqueCountExtentl.addAll(copyCountExtent);
            } else {
                copy.unsetCountExtent();
            }
            if (this.isSetCompositeValue()) {
                JAXBElement<? extends CompositeValueType> sourceCompositeValue;
                sourceCompositeValue = this.getCompositeValue();
                @SuppressWarnings("unchecked")
                JAXBElement<? extends CompositeValueType> copyCompositeValue = ((JAXBElement<? extends CompositeValueType> ) strategy.copy(LocatorUtils.property(locator, "compositeValue", sourceCompositeValue), sourceCompositeValue));
                copy.setCompositeValue(copyCompositeValue);
            } else {
                copy.compositeValue = null;
            }
            if (this.isSetRemoteSchema()) {
                String sourceRemoteSchema;
                sourceRemoteSchema = this.getRemoteSchema();
                String copyRemoteSchema = ((String) strategy.copy(LocatorUtils.property(locator, "remoteSchema", sourceRemoteSchema), sourceRemoteSchema));
                copy.setRemoteSchema(copyRemoteSchema);
            } else {
                copy.remoteSchema = null;
            }
            if (this.isSetType()) {
                String sourceType;
                sourceType = this.getType();
                String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.isSetHref()) {
                String sourceHref;
                sourceHref = this.getHref();
                String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
            if (this.isSetRole()) {
                String sourceRole;
                sourceRole = this.getRole();
                String copyRole = ((String) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole));
                copy.setRole(copyRole);
            } else {
                copy.role = null;
            }
            if (this.isSetArcrole()) {
                String sourceArcrole;
                sourceArcrole = this.getArcrole();
                String copyArcrole = ((String) strategy.copy(LocatorUtils.property(locator, "arcrole", sourceArcrole), sourceArcrole));
                copy.setArcrole(copyArcrole);
            } else {
                copy.arcrole = null;
            }
            if (this.isSetTitle()) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.isSetShow()) {
                String sourceShow;
                sourceShow = this.getShow();
                String copyShow = ((String) strategy.copy(LocatorUtils.property(locator, "show", sourceShow), sourceShow));
                copy.setShow(copyShow);
            } else {
                copy.show = null;
            }
            if (this.isSetActuate()) {
                String sourceActuate;
                sourceActuate = this.getActuate();
                String copyActuate = ((String) strategy.copy(LocatorUtils.property(locator, "actuate", sourceActuate), sourceActuate));
                copy.setActuate(copyActuate);
            } else {
                copy.actuate = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RangeParametersType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof RangeParametersType) {
            final RangeParametersType target = this;
            final RangeParametersType leftObject = ((RangeParametersType) left);
            final RangeParametersType rightObject = ((RangeParametersType) right);
            {
                Boolean lhsBoolean;
                lhsBoolean = leftObject.isBoolean();
                Boolean rhsBoolean;
                rhsBoolean = rightObject.isBoolean();
                target.setBoolean(((Boolean) strategy.merge(LocatorUtils.property(leftLocator, "_boolean", lhsBoolean), LocatorUtils.property(rightLocator, "_boolean", rhsBoolean), lhsBoolean, rhsBoolean)));
            }
            {
                CodeType lhsCategory;
                lhsCategory = leftObject.getCategory();
                CodeType rhsCategory;
                rhsCategory = rightObject.getCategory();
                target.setCategory(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "category", lhsCategory), LocatorUtils.property(rightLocator, "category", rhsCategory), lhsCategory, rhsCategory)));
            }
            {
                MeasureType lhsQuantity;
                lhsQuantity = leftObject.getQuantity();
                MeasureType rhsQuantity;
                rhsQuantity = rightObject.getQuantity();
                target.setQuantity(((MeasureType) strategy.merge(LocatorUtils.property(leftLocator, "quantity", lhsQuantity), LocatorUtils.property(rightLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)));
            }
            {
                BigInteger lhsCount;
                lhsCount = leftObject.getCount();
                BigInteger rhsCount;
                rhsCount = rightObject.getCount();
                target.setCount(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "count", lhsCount), LocatorUtils.property(rightLocator, "count", rhsCount), lhsCount, rhsCount)));
            }
            {
                List<String> lhsBooleanList;
                lhsBooleanList = leftObject.getBooleanList();
                List<String> rhsBooleanList;
                rhsBooleanList = rightObject.getBooleanList();
                target.unsetBooleanList();
                List<String> uniqueBooleanListl = target.getBooleanList();
                uniqueBooleanListl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "booleanList", lhsBooleanList), LocatorUtils.property(rightLocator, "booleanList", rhsBooleanList), lhsBooleanList, rhsBooleanList)));
            }
            {
                CodeOrNullListType lhsCategoryList;
                lhsCategoryList = leftObject.getCategoryList();
                CodeOrNullListType rhsCategoryList;
                rhsCategoryList = rightObject.getCategoryList();
                target.setCategoryList(((CodeOrNullListType) strategy.merge(LocatorUtils.property(leftLocator, "categoryList", lhsCategoryList), LocatorUtils.property(rightLocator, "categoryList", rhsCategoryList), lhsCategoryList, rhsCategoryList)));
            }
            {
                MeasureOrNullListType lhsQuantityList;
                lhsQuantityList = leftObject.getQuantityList();
                MeasureOrNullListType rhsQuantityList;
                rhsQuantityList = rightObject.getQuantityList();
                target.setQuantityList(((MeasureOrNullListType) strategy.merge(LocatorUtils.property(leftLocator, "quantityList", lhsQuantityList), LocatorUtils.property(rightLocator, "quantityList", rhsQuantityList), lhsQuantityList, rhsQuantityList)));
            }
            {
                List<String> lhsCountList;
                lhsCountList = leftObject.getCountList();
                List<String> rhsCountList;
                rhsCountList = rightObject.getCountList();
                target.unsetCountList();
                List<String> uniqueCountListl = target.getCountList();
                uniqueCountListl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "countList", lhsCountList), LocatorUtils.property(rightLocator, "countList", rhsCountList), lhsCountList, rhsCountList)));
            }
            {
                CategoryExtentType lhsCategoryExtent;
                lhsCategoryExtent = leftObject.getCategoryExtent();
                CategoryExtentType rhsCategoryExtent;
                rhsCategoryExtent = rightObject.getCategoryExtent();
                target.setCategoryExtent(((CategoryExtentType) strategy.merge(LocatorUtils.property(leftLocator, "categoryExtent", lhsCategoryExtent), LocatorUtils.property(rightLocator, "categoryExtent", rhsCategoryExtent), lhsCategoryExtent, rhsCategoryExtent)));
            }
            {
                QuantityExtentType lhsQuantityExtent;
                lhsQuantityExtent = leftObject.getQuantityExtent();
                QuantityExtentType rhsQuantityExtent;
                rhsQuantityExtent = rightObject.getQuantityExtent();
                target.setQuantityExtent(((QuantityExtentType) strategy.merge(LocatorUtils.property(leftLocator, "quantityExtent", lhsQuantityExtent), LocatorUtils.property(rightLocator, "quantityExtent", rhsQuantityExtent), lhsQuantityExtent, rhsQuantityExtent)));
            }
            {
                List<String> lhsCountExtent;
                lhsCountExtent = leftObject.getCountExtent();
                List<String> rhsCountExtent;
                rhsCountExtent = rightObject.getCountExtent();
                target.unsetCountExtent();
                List<String> uniqueCountExtentl = target.getCountExtent();
                uniqueCountExtentl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "countExtent", lhsCountExtent), LocatorUtils.property(rightLocator, "countExtent", rhsCountExtent), lhsCountExtent, rhsCountExtent)));
            }
            {
                JAXBElement<? extends CompositeValueType> lhsCompositeValue;
                lhsCompositeValue = leftObject.getCompositeValue();
                JAXBElement<? extends CompositeValueType> rhsCompositeValue;
                rhsCompositeValue = rightObject.getCompositeValue();
                target.setCompositeValue(((JAXBElement<? extends CompositeValueType> ) strategy.merge(LocatorUtils.property(leftLocator, "compositeValue", lhsCompositeValue), LocatorUtils.property(rightLocator, "compositeValue", rhsCompositeValue), lhsCompositeValue, rhsCompositeValue)));
            }
            {
                String lhsRemoteSchema;
                lhsRemoteSchema = leftObject.getRemoteSchema();
                String rhsRemoteSchema;
                rhsRemoteSchema = rightObject.getRemoteSchema();
                target.setRemoteSchema(((String) strategy.merge(LocatorUtils.property(leftLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(rightLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema)));
            }
            {
                String lhsType;
                lhsType = leftObject.getType();
                String rhsType;
                rhsType = rightObject.getType();
                target.setType(((String) strategy.merge(LocatorUtils.property(leftLocator, "type", lhsType), LocatorUtils.property(rightLocator, "type", rhsType), lhsType, rhsType)));
            }
            {
                String lhsHref;
                lhsHref = leftObject.getHref();
                String rhsHref;
                rhsHref = rightObject.getHref();
                target.setHref(((String) strategy.merge(LocatorUtils.property(leftLocator, "href", lhsHref), LocatorUtils.property(rightLocator, "href", rhsHref), lhsHref, rhsHref)));
            }
            {
                String lhsRole;
                lhsRole = leftObject.getRole();
                String rhsRole;
                rhsRole = rightObject.getRole();
                target.setRole(((String) strategy.merge(LocatorUtils.property(leftLocator, "role", lhsRole), LocatorUtils.property(rightLocator, "role", rhsRole), lhsRole, rhsRole)));
            }
            {
                String lhsArcrole;
                lhsArcrole = leftObject.getArcrole();
                String rhsArcrole;
                rhsArcrole = rightObject.getArcrole();
                target.setArcrole(((String) strategy.merge(LocatorUtils.property(leftLocator, "arcrole", lhsArcrole), LocatorUtils.property(rightLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole)));
            }
            {
                String lhsTitle;
                lhsTitle = leftObject.getTitle();
                String rhsTitle;
                rhsTitle = rightObject.getTitle();
                target.setTitle(((String) strategy.merge(LocatorUtils.property(leftLocator, "title", lhsTitle), LocatorUtils.property(rightLocator, "title", rhsTitle), lhsTitle, rhsTitle)));
            }
            {
                String lhsShow;
                lhsShow = leftObject.getShow();
                String rhsShow;
                rhsShow = rightObject.getShow();
                target.setShow(((String) strategy.merge(LocatorUtils.property(leftLocator, "show", lhsShow), LocatorUtils.property(rightLocator, "show", rhsShow), lhsShow, rhsShow)));
            }
            {
                String lhsActuate;
                lhsActuate = leftObject.getActuate();
                String rhsActuate;
                rhsActuate = rightObject.getActuate();
                target.setActuate(((String) strategy.merge(LocatorUtils.property(leftLocator, "actuate", lhsActuate), LocatorUtils.property(rightLocator, "actuate", rhsActuate), lhsActuate, rhsActuate)));
            }
        }
    }

    public void setBooleanList(List<String> value) {
        List<String> draftl = this.getBooleanList();
        draftl.addAll(value);
    }

    public void setCountList(List<String> value) {
        List<String> draftl = this.getCountList();
        draftl.addAll(value);
    }

    public void setCountExtent(List<String> value) {
        List<String> draftl = this.getCountExtent();
        draftl.addAll(value);
    }

}
