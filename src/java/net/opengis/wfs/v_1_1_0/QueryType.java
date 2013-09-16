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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import net.opengis.filter.v_1_1_0.FilterType;
import net.opengis.filter.v_1_1_0.FunctionType;
import net.opengis.filter.v_1_1_0.SortByType;
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
 *             The Query element is of type QueryType.
 *          
 * 
 * <p>Java-Klasse für QueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/wfs}PropertyName"/>
 *           &lt;element ref="{http://www.opengis.net/wfs}XlinkPropertyName"/>
 *           &lt;element ref="{http://www.opengis.net/ogc}Function"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/ogc}Filter" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ogc}SortBy" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="handle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeName" use="required" type="{http://www.opengis.net/wfs}TypeNameListType" />
 *       &lt;attribute name="featureVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="srsName" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryType", propOrder = {
    "propertyNameOrXlinkPropertyNameOrFunction",
    "filter",
    "sortBy"
})
public class QueryType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElements({
        @XmlElement(name = "PropertyName", type = String.class),
        @XmlElement(name = "XlinkPropertyName", type = XlinkPropertyName.class),
        @XmlElement(name = "Function", namespace = "http://www.opengis.net/ogc", type = FunctionType.class)
    })
    protected List<Object> propertyNameOrXlinkPropertyNameOrFunction;
    @XmlElement(name = "Filter", namespace = "http://www.opengis.net/ogc")
    protected FilterType filter;
    @XmlElement(name = "SortBy", namespace = "http://www.opengis.net/ogc")
    protected SortByType sortBy;
    @XmlAttribute(name = "handle")
    protected String handle;
    @XmlAttribute(name = "typeName", required = true)
    protected List<QName> typeName;
    @XmlAttribute(name = "featureVersion")
    protected String featureVersion;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;

    /**
     * Gets the value of the propertyNameOrXlinkPropertyNameOrFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyNameOrXlinkPropertyNameOrFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyNameOrXlinkPropertyNameOrFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link XlinkPropertyName }
     * {@link FunctionType }
     * 
     * 
     */
    public List<Object> getPropertyNameOrXlinkPropertyNameOrFunction() {
        if (propertyNameOrXlinkPropertyNameOrFunction == null) {
            propertyNameOrXlinkPropertyNameOrFunction = new ArrayList<Object>();
        }
        return this.propertyNameOrXlinkPropertyNameOrFunction;
    }

    /**
     * 
     *                 The Filter element is used to define spatial and/or non-spatial
     *                 constraints on query.  Spatial constrains use GML3 to specify
     *                 the constraining geometry.  A full description of the Filter
     *                 element can be found in the Filter Encoding Implementation
     *                 Specification.
     *              
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilter(FilterType value) {
        this.filter = value;
    }

    /**
     * 
     *                 The SortBy element is used specify property names whose
     *                 values should be used to order (upon presentation) the
     *                 set of feature instances that satisfy the query.
     *              
     * 
     * @return
     *     possible object is
     *     {@link SortByType }
     *     
     */
    public SortByType getSortBy() {
        return sortBy;
    }

    /**
     * Legt den Wert der sortBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SortByType }
     *     
     */
    public void setSortBy(SortByType value) {
        this.sortBy = value;
    }

    /**
     * Ruft den Wert der handle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandle() {
        return handle;
    }

    /**
     * Legt den Wert der handle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandle(String value) {
        this.handle = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getTypeName() {
        if (typeName == null) {
            typeName = new ArrayList<QName>();
        }
        return this.typeName;
    }

    /**
     * Ruft den Wert der featureVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureVersion() {
        return featureVersion;
    }

    /**
     * Legt den Wert der featureVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureVersion(String value) {
        this.featureVersion = value;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
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
            List<Object> thePropertyNameOrXlinkPropertyNameOrFunction;
            thePropertyNameOrXlinkPropertyNameOrFunction = this.getPropertyNameOrXlinkPropertyNameOrFunction();
            strategy.appendField(locator, this, "propertyNameOrXlinkPropertyNameOrFunction", buffer, thePropertyNameOrXlinkPropertyNameOrFunction);
        }
        {
            FilterType theFilter;
            theFilter = this.getFilter();
            strategy.appendField(locator, this, "filter", buffer, theFilter);
        }
        {
            SortByType theSortBy;
            theSortBy = this.getSortBy();
            strategy.appendField(locator, this, "sortBy", buffer, theSortBy);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            strategy.appendField(locator, this, "handle", buffer, theHandle);
        }
        {
            List<QName> theTypeName;
            theTypeName = this.getTypeName();
            strategy.appendField(locator, this, "typeName", buffer, theTypeName);
        }
        {
            String theFeatureVersion;
            theFeatureVersion = this.getFeatureVersion();
            strategy.appendField(locator, this, "featureVersion", buffer, theFeatureVersion);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theSrsName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QueryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QueryType that = ((QueryType) object);
        {
            List<Object> lhsPropertyNameOrXlinkPropertyNameOrFunction;
            lhsPropertyNameOrXlinkPropertyNameOrFunction = this.getPropertyNameOrXlinkPropertyNameOrFunction();
            List<Object> rhsPropertyNameOrXlinkPropertyNameOrFunction;
            rhsPropertyNameOrXlinkPropertyNameOrFunction = that.getPropertyNameOrXlinkPropertyNameOrFunction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyNameOrXlinkPropertyNameOrFunction", lhsPropertyNameOrXlinkPropertyNameOrFunction), LocatorUtils.property(thatLocator, "propertyNameOrXlinkPropertyNameOrFunction", rhsPropertyNameOrXlinkPropertyNameOrFunction), lhsPropertyNameOrXlinkPropertyNameOrFunction, rhsPropertyNameOrXlinkPropertyNameOrFunction)) {
                return false;
            }
        }
        {
            FilterType lhsFilter;
            lhsFilter = this.getFilter();
            FilterType rhsFilter;
            rhsFilter = that.getFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filter", lhsFilter), LocatorUtils.property(thatLocator, "filter", rhsFilter), lhsFilter, rhsFilter)) {
                return false;
            }
        }
        {
            SortByType lhsSortBy;
            lhsSortBy = this.getSortBy();
            SortByType rhsSortBy;
            rhsSortBy = that.getSortBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortBy", lhsSortBy), LocatorUtils.property(thatLocator, "sortBy", rhsSortBy), lhsSortBy, rhsSortBy)) {
                return false;
            }
        }
        {
            String lhsHandle;
            lhsHandle = this.getHandle();
            String rhsHandle;
            rhsHandle = that.getHandle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handle", lhsHandle), LocatorUtils.property(thatLocator, "handle", rhsHandle), lhsHandle, rhsHandle)) {
                return false;
            }
        }
        {
            List<QName> lhsTypeName;
            lhsTypeName = this.getTypeName();
            List<QName> rhsTypeName;
            rhsTypeName = that.getTypeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeName", lhsTypeName), LocatorUtils.property(thatLocator, "typeName", rhsTypeName), lhsTypeName, rhsTypeName)) {
                return false;
            }
        }
        {
            String lhsFeatureVersion;
            lhsFeatureVersion = this.getFeatureVersion();
            String rhsFeatureVersion;
            rhsFeatureVersion = that.getFeatureVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureVersion", lhsFeatureVersion), LocatorUtils.property(thatLocator, "featureVersion", rhsFeatureVersion), lhsFeatureVersion, rhsFeatureVersion)) {
                return false;
            }
        }
        {
            String lhsSrsName;
            lhsSrsName = this.getSrsName();
            String rhsSrsName;
            rhsSrsName = that.getSrsName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsName", lhsSrsName), LocatorUtils.property(thatLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)) {
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
            List<Object> thePropertyNameOrXlinkPropertyNameOrFunction;
            thePropertyNameOrXlinkPropertyNameOrFunction = this.getPropertyNameOrXlinkPropertyNameOrFunction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyNameOrXlinkPropertyNameOrFunction", thePropertyNameOrXlinkPropertyNameOrFunction), currentHashCode, thePropertyNameOrXlinkPropertyNameOrFunction);
        }
        {
            FilterType theFilter;
            theFilter = this.getFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filter", theFilter), currentHashCode, theFilter);
        }
        {
            SortByType theSortBy;
            theSortBy = this.getSortBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortBy", theSortBy), currentHashCode, theSortBy);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handle", theHandle), currentHashCode, theHandle);
        }
        {
            List<QName> theTypeName;
            theTypeName = this.getTypeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeName", theTypeName), currentHashCode, theTypeName);
        }
        {
            String theFeatureVersion;
            theFeatureVersion = this.getFeatureVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureVersion", theFeatureVersion), currentHashCode, theFeatureVersion);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsName", theSrsName), currentHashCode, theSrsName);
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
        if (draftCopy instanceof QueryType) {
            final QueryType copy = ((QueryType) draftCopy);
            if ((this.propertyNameOrXlinkPropertyNameOrFunction!= null)&&(!this.propertyNameOrXlinkPropertyNameOrFunction.isEmpty())) {
                List<Object> sourcePropertyNameOrXlinkPropertyNameOrFunction;
                sourcePropertyNameOrXlinkPropertyNameOrFunction = this.getPropertyNameOrXlinkPropertyNameOrFunction();
                @SuppressWarnings("unchecked")
                List<Object> copyPropertyNameOrXlinkPropertyNameOrFunction = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "propertyNameOrXlinkPropertyNameOrFunction", sourcePropertyNameOrXlinkPropertyNameOrFunction), sourcePropertyNameOrXlinkPropertyNameOrFunction));
                copy.propertyNameOrXlinkPropertyNameOrFunction = null;
                List<Object> uniquePropertyNameOrXlinkPropertyNameOrFunctionl = copy.getPropertyNameOrXlinkPropertyNameOrFunction();
                uniquePropertyNameOrXlinkPropertyNameOrFunctionl.addAll(copyPropertyNameOrXlinkPropertyNameOrFunction);
            } else {
                copy.propertyNameOrXlinkPropertyNameOrFunction = null;
            }
            if (this.filter!= null) {
                FilterType sourceFilter;
                sourceFilter = this.getFilter();
                FilterType copyFilter = ((FilterType) strategy.copy(LocatorUtils.property(locator, "filter", sourceFilter), sourceFilter));
                copy.setFilter(copyFilter);
            } else {
                copy.filter = null;
            }
            if (this.sortBy!= null) {
                SortByType sourceSortBy;
                sourceSortBy = this.getSortBy();
                SortByType copySortBy = ((SortByType) strategy.copy(LocatorUtils.property(locator, "sortBy", sourceSortBy), sourceSortBy));
                copy.setSortBy(copySortBy);
            } else {
                copy.sortBy = null;
            }
            if (this.handle!= null) {
                String sourceHandle;
                sourceHandle = this.getHandle();
                String copyHandle = ((String) strategy.copy(LocatorUtils.property(locator, "handle", sourceHandle), sourceHandle));
                copy.setHandle(copyHandle);
            } else {
                copy.handle = null;
            }
            if ((this.typeName!= null)&&(!this.typeName.isEmpty())) {
                List<QName> sourceTypeName;
                sourceTypeName = this.getTypeName();
                @SuppressWarnings("unchecked")
                List<QName> copyTypeName = ((List<QName> ) strategy.copy(LocatorUtils.property(locator, "typeName", sourceTypeName), sourceTypeName));
                copy.typeName = null;
                List<QName> uniqueTypeNamel = copy.getTypeName();
                uniqueTypeNamel.addAll(copyTypeName);
            } else {
                copy.typeName = null;
            }
            if (this.featureVersion!= null) {
                String sourceFeatureVersion;
                sourceFeatureVersion = this.getFeatureVersion();
                String copyFeatureVersion = ((String) strategy.copy(LocatorUtils.property(locator, "featureVersion", sourceFeatureVersion), sourceFeatureVersion));
                copy.setFeatureVersion(copyFeatureVersion);
            } else {
                copy.featureVersion = null;
            }
            if (this.srsName!= null) {
                String sourceSrsName;
                sourceSrsName = this.getSrsName();
                String copySrsName = ((String) strategy.copy(LocatorUtils.property(locator, "srsName", sourceSrsName), sourceSrsName));
                copy.setSrsName(copySrsName);
            } else {
                copy.srsName = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new QueryType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof QueryType) {
            final QueryType target = this;
            final QueryType leftObject = ((QueryType) left);
            final QueryType rightObject = ((QueryType) right);
            {
                List<Object> lhsPropertyNameOrXlinkPropertyNameOrFunction;
                lhsPropertyNameOrXlinkPropertyNameOrFunction = leftObject.getPropertyNameOrXlinkPropertyNameOrFunction();
                List<Object> rhsPropertyNameOrXlinkPropertyNameOrFunction;
                rhsPropertyNameOrXlinkPropertyNameOrFunction = rightObject.getPropertyNameOrXlinkPropertyNameOrFunction();
                target.propertyNameOrXlinkPropertyNameOrFunction = null;
                List<Object> uniquePropertyNameOrXlinkPropertyNameOrFunctionl = target.getPropertyNameOrXlinkPropertyNameOrFunction();
                uniquePropertyNameOrXlinkPropertyNameOrFunctionl.addAll(((List<Object> ) strategy.merge(LocatorUtils.property(leftLocator, "propertyNameOrXlinkPropertyNameOrFunction", lhsPropertyNameOrXlinkPropertyNameOrFunction), LocatorUtils.property(rightLocator, "propertyNameOrXlinkPropertyNameOrFunction", rhsPropertyNameOrXlinkPropertyNameOrFunction), lhsPropertyNameOrXlinkPropertyNameOrFunction, rhsPropertyNameOrXlinkPropertyNameOrFunction)));
            }
            {
                FilterType lhsFilter;
                lhsFilter = leftObject.getFilter();
                FilterType rhsFilter;
                rhsFilter = rightObject.getFilter();
                target.setFilter(((FilterType) strategy.merge(LocatorUtils.property(leftLocator, "filter", lhsFilter), LocatorUtils.property(rightLocator, "filter", rhsFilter), lhsFilter, rhsFilter)));
            }
            {
                SortByType lhsSortBy;
                lhsSortBy = leftObject.getSortBy();
                SortByType rhsSortBy;
                rhsSortBy = rightObject.getSortBy();
                target.setSortBy(((SortByType) strategy.merge(LocatorUtils.property(leftLocator, "sortBy", lhsSortBy), LocatorUtils.property(rightLocator, "sortBy", rhsSortBy), lhsSortBy, rhsSortBy)));
            }
            {
                String lhsHandle;
                lhsHandle = leftObject.getHandle();
                String rhsHandle;
                rhsHandle = rightObject.getHandle();
                target.setHandle(((String) strategy.merge(LocatorUtils.property(leftLocator, "handle", lhsHandle), LocatorUtils.property(rightLocator, "handle", rhsHandle), lhsHandle, rhsHandle)));
            }
            {
                List<QName> lhsTypeName;
                lhsTypeName = leftObject.getTypeName();
                List<QName> rhsTypeName;
                rhsTypeName = rightObject.getTypeName();
                target.typeName = null;
                List<QName> uniqueTypeNamel = target.getTypeName();
                uniqueTypeNamel.addAll(((List<QName> ) strategy.merge(LocatorUtils.property(leftLocator, "typeName", lhsTypeName), LocatorUtils.property(rightLocator, "typeName", rhsTypeName), lhsTypeName, rhsTypeName)));
            }
            {
                String lhsFeatureVersion;
                lhsFeatureVersion = leftObject.getFeatureVersion();
                String rhsFeatureVersion;
                rhsFeatureVersion = rightObject.getFeatureVersion();
                target.setFeatureVersion(((String) strategy.merge(LocatorUtils.property(leftLocator, "featureVersion", lhsFeatureVersion), LocatorUtils.property(rightLocator, "featureVersion", rhsFeatureVersion), lhsFeatureVersion, rhsFeatureVersion)));
            }
            {
                String lhsSrsName;
                lhsSrsName = leftObject.getSrsName();
                String rhsSrsName;
                rhsSrsName = rightObject.getSrsName();
                target.setSrsName(((String) strategy.merge(LocatorUtils.property(leftLocator, "srsName", lhsSrsName), LocatorUtils.property(rightLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)));
            }
        }
    }

    public void setPropertyNameOrXlinkPropertyNameOrFunction(List<Object> value) {
        List<Object> draftl = this.getPropertyNameOrXlinkPropertyNameOrFunction();
        draftl.addAll(value);
    }

    public void setTypeName(List<QName> value) {
        List<QName> draftl = this.getTypeName();
        draftl.addAll(value);
    }

}
