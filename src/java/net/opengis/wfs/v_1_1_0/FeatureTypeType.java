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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import net.opengis.ows.v_1_0_0.KeywordsType;
import net.opengis.ows.v_1_0_0.WGS84BoundingBoxType;
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
 *             An element of this type that describes a feature in an application
 *             namespace shall have an xml xmlns specifier, e.g.
 *             xmlns:bo="http://www.BlueOx.org/BlueOx"
 *          
 * 
 * <p>Java-Klasse für FeatureTypeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows}Keywords" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="DefaultSRS" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *             &lt;element name="OtherSRS" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="NoSRS">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Operations" type="{http://www.opengis.net/wfs}OperationsType" minOccurs="0"/>
 *         &lt;element name="OutputFormats" type="{http://www.opengis.net/wfs}OutputFormatListType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows}WGS84BoundingBox" maxOccurs="unbounded"/>
 *         &lt;element name="MetadataURL" type="{http://www.opengis.net/wfs}MetadataURLType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureTypeType", propOrder = {
    "name",
    "title",
    "_abstract",
    "keywords",
    "defaultSRS",
    "otherSRS",
    "noSRS",
    "operations",
    "outputFormats",
    "wgs84BoundingBox",
    "metadataURL"
})
public class FeatureTypeType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Name", required = true)
    protected QName name;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "Keywords", namespace = "http://www.opengis.net/ows")
    protected List<KeywordsType> keywords;
    @XmlElement(name = "DefaultSRS")
    @XmlSchemaType(name = "anyURI")
    protected String defaultSRS;
    @XmlElement(name = "OtherSRS")
    @XmlSchemaType(name = "anyURI")
    protected List<String> otherSRS;
    @XmlElement(name = "NoSRS")
    protected FeatureTypeType.NoSRS noSRS;
    @XmlElement(name = "Operations")
    protected OperationsType operations;
    @XmlElement(name = "OutputFormats")
    protected OutputFormatListType outputFormats;
    @XmlElement(name = "WGS84BoundingBox", namespace = "http://www.opengis.net/ows", required = true)
    protected List<WGS84BoundingBoxType> wgs84BoundingBox;
    @XmlElement(name = "MetadataURL")
    protected List<MetadataURLType> metadataURL;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setName(QName value) {
        this.name = value;
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

    /**
     * Ruft den Wert der abstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Legt den Wert der abstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordsType }
     * 
     * 
     */
    public List<KeywordsType> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<KeywordsType>();
        }
        return this.keywords;
    }

    /**
     * Ruft den Wert der defaultSRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSRS() {
        return defaultSRS;
    }

    /**
     * Legt den Wert der defaultSRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSRS(String value) {
        this.defaultSRS = value;
    }

    /**
     * Gets the value of the otherSRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherSRS() {
        if (otherSRS == null) {
            otherSRS = new ArrayList<String>();
        }
        return this.otherSRS;
    }

    /**
     * Ruft den Wert der noSRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTypeType.NoSRS }
     *     
     */
    public FeatureTypeType.NoSRS getNoSRS() {
        return noSRS;
    }

    /**
     * Legt den Wert der noSRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTypeType.NoSRS }
     *     
     */
    public void setNoSRS(FeatureTypeType.NoSRS value) {
        this.noSRS = value;
    }

    /**
     * Ruft den Wert der operations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationsType }
     *     
     */
    public OperationsType getOperations() {
        return operations;
    }

    /**
     * Legt den Wert der operations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsType }
     *     
     */
    public void setOperations(OperationsType value) {
        this.operations = value;
    }

    /**
     * Ruft den Wert der outputFormats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormatListType }
     *     
     */
    public OutputFormatListType getOutputFormats() {
        return outputFormats;
    }

    /**
     * Legt den Wert der outputFormats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormatListType }
     *     
     */
    public void setOutputFormats(OutputFormatListType value) {
        this.outputFormats = value;
    }

    /**
     * Gets the value of the wgs84BoundingBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wgs84BoundingBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWGS84BoundingBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WGS84BoundingBoxType }
     * 
     * 
     */
    public List<WGS84BoundingBoxType> getWGS84BoundingBox() {
        if (wgs84BoundingBox == null) {
            wgs84BoundingBox = new ArrayList<WGS84BoundingBoxType>();
        }
        return this.wgs84BoundingBox;
    }

    /**
     * Gets the value of the metadataURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataURLType }
     * 
     * 
     */
    public List<MetadataURLType> getMetadataURL() {
        if (metadataURL == null) {
            metadataURL = new ArrayList<MetadataURLType>();
        }
        return this.metadataURL;
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
            QName theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theAbstract;
            theAbstract = this.getAbstract();
            strategy.appendField(locator, this, "_abstract", buffer, theAbstract);
        }
        {
            List<KeywordsType> theKeywords;
            theKeywords = this.getKeywords();
            strategy.appendField(locator, this, "keywords", buffer, theKeywords);
        }
        {
            String theDefaultSRS;
            theDefaultSRS = this.getDefaultSRS();
            strategy.appendField(locator, this, "defaultSRS", buffer, theDefaultSRS);
        }
        {
            List<String> theOtherSRS;
            theOtherSRS = this.getOtherSRS();
            strategy.appendField(locator, this, "otherSRS", buffer, theOtherSRS);
        }
        {
            FeatureTypeType.NoSRS theNoSRS;
            theNoSRS = this.getNoSRS();
            strategy.appendField(locator, this, "noSRS", buffer, theNoSRS);
        }
        {
            OperationsType theOperations;
            theOperations = this.getOperations();
            strategy.appendField(locator, this, "operations", buffer, theOperations);
        }
        {
            OutputFormatListType theOutputFormats;
            theOutputFormats = this.getOutputFormats();
            strategy.appendField(locator, this, "outputFormats", buffer, theOutputFormats);
        }
        {
            List<WGS84BoundingBoxType> theWGS84BoundingBox;
            theWGS84BoundingBox = this.getWGS84BoundingBox();
            strategy.appendField(locator, this, "wgs84BoundingBox", buffer, theWGS84BoundingBox);
        }
        {
            List<MetadataURLType> theMetadataURL;
            theMetadataURL = this.getMetadataURL();
            strategy.appendField(locator, this, "metadataURL", buffer, theMetadataURL);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeatureTypeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeatureTypeType that = ((FeatureTypeType) object);
        {
            QName lhsName;
            lhsName = this.getName();
            QName rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            String lhsAbstract;
            lhsAbstract = this.getAbstract();
            String rhsAbstract;
            rhsAbstract = that.getAbstract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_abstract", lhsAbstract), LocatorUtils.property(thatLocator, "_abstract", rhsAbstract), lhsAbstract, rhsAbstract)) {
                return false;
            }
        }
        {
            List<KeywordsType> lhsKeywords;
            lhsKeywords = this.getKeywords();
            List<KeywordsType> rhsKeywords;
            rhsKeywords = that.getKeywords();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keywords", lhsKeywords), LocatorUtils.property(thatLocator, "keywords", rhsKeywords), lhsKeywords, rhsKeywords)) {
                return false;
            }
        }
        {
            String lhsDefaultSRS;
            lhsDefaultSRS = this.getDefaultSRS();
            String rhsDefaultSRS;
            rhsDefaultSRS = that.getDefaultSRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultSRS", lhsDefaultSRS), LocatorUtils.property(thatLocator, "defaultSRS", rhsDefaultSRS), lhsDefaultSRS, rhsDefaultSRS)) {
                return false;
            }
        }
        {
            List<String> lhsOtherSRS;
            lhsOtherSRS = this.getOtherSRS();
            List<String> rhsOtherSRS;
            rhsOtherSRS = that.getOtherSRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherSRS", lhsOtherSRS), LocatorUtils.property(thatLocator, "otherSRS", rhsOtherSRS), lhsOtherSRS, rhsOtherSRS)) {
                return false;
            }
        }
        {
            FeatureTypeType.NoSRS lhsNoSRS;
            lhsNoSRS = this.getNoSRS();
            FeatureTypeType.NoSRS rhsNoSRS;
            rhsNoSRS = that.getNoSRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noSRS", lhsNoSRS), LocatorUtils.property(thatLocator, "noSRS", rhsNoSRS), lhsNoSRS, rhsNoSRS)) {
                return false;
            }
        }
        {
            OperationsType lhsOperations;
            lhsOperations = this.getOperations();
            OperationsType rhsOperations;
            rhsOperations = that.getOperations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operations", lhsOperations), LocatorUtils.property(thatLocator, "operations", rhsOperations), lhsOperations, rhsOperations)) {
                return false;
            }
        }
        {
            OutputFormatListType lhsOutputFormats;
            lhsOutputFormats = this.getOutputFormats();
            OutputFormatListType rhsOutputFormats;
            rhsOutputFormats = that.getOutputFormats();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputFormats", lhsOutputFormats), LocatorUtils.property(thatLocator, "outputFormats", rhsOutputFormats), lhsOutputFormats, rhsOutputFormats)) {
                return false;
            }
        }
        {
            List<WGS84BoundingBoxType> lhsWGS84BoundingBox;
            lhsWGS84BoundingBox = this.getWGS84BoundingBox();
            List<WGS84BoundingBoxType> rhsWGS84BoundingBox;
            rhsWGS84BoundingBox = that.getWGS84BoundingBox();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84BoundingBox", lhsWGS84BoundingBox), LocatorUtils.property(thatLocator, "wgs84BoundingBox", rhsWGS84BoundingBox), lhsWGS84BoundingBox, rhsWGS84BoundingBox)) {
                return false;
            }
        }
        {
            List<MetadataURLType> lhsMetadataURL;
            lhsMetadataURL = this.getMetadataURL();
            List<MetadataURLType> rhsMetadataURL;
            rhsMetadataURL = that.getMetadataURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadataURL", lhsMetadataURL), LocatorUtils.property(thatLocator, "metadataURL", rhsMetadataURL), lhsMetadataURL, rhsMetadataURL)) {
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
            QName theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theAbstract;
            theAbstract = this.getAbstract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_abstract", theAbstract), currentHashCode, theAbstract);
        }
        {
            List<KeywordsType> theKeywords;
            theKeywords = this.getKeywords();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keywords", theKeywords), currentHashCode, theKeywords);
        }
        {
            String theDefaultSRS;
            theDefaultSRS = this.getDefaultSRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultSRS", theDefaultSRS), currentHashCode, theDefaultSRS);
        }
        {
            List<String> theOtherSRS;
            theOtherSRS = this.getOtherSRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherSRS", theOtherSRS), currentHashCode, theOtherSRS);
        }
        {
            FeatureTypeType.NoSRS theNoSRS;
            theNoSRS = this.getNoSRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noSRS", theNoSRS), currentHashCode, theNoSRS);
        }
        {
            OperationsType theOperations;
            theOperations = this.getOperations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operations", theOperations), currentHashCode, theOperations);
        }
        {
            OutputFormatListType theOutputFormats;
            theOutputFormats = this.getOutputFormats();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputFormats", theOutputFormats), currentHashCode, theOutputFormats);
        }
        {
            List<WGS84BoundingBoxType> theWGS84BoundingBox;
            theWGS84BoundingBox = this.getWGS84BoundingBox();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wgs84BoundingBox", theWGS84BoundingBox), currentHashCode, theWGS84BoundingBox);
        }
        {
            List<MetadataURLType> theMetadataURL;
            theMetadataURL = this.getMetadataURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metadataURL", theMetadataURL), currentHashCode, theMetadataURL);
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
        if (draftCopy instanceof FeatureTypeType) {
            final FeatureTypeType copy = ((FeatureTypeType) draftCopy);
            if (this.name!= null) {
                QName sourceName;
                sourceName = this.getName();
                QName copyName = ((QName) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this._abstract!= null) {
                String sourceAbstract;
                sourceAbstract = this.getAbstract();
                String copyAbstract = ((String) strategy.copy(LocatorUtils.property(locator, "_abstract", sourceAbstract), sourceAbstract));
                copy.setAbstract(copyAbstract);
            } else {
                copy._abstract = null;
            }
            if ((this.keywords!= null)&&(!this.keywords.isEmpty())) {
                List<KeywordsType> sourceKeywords;
                sourceKeywords = this.getKeywords();
                @SuppressWarnings("unchecked")
                List<KeywordsType> copyKeywords = ((List<KeywordsType> ) strategy.copy(LocatorUtils.property(locator, "keywords", sourceKeywords), sourceKeywords));
                copy.keywords = null;
                List<KeywordsType> uniqueKeywordsl = copy.getKeywords();
                uniqueKeywordsl.addAll(copyKeywords);
            } else {
                copy.keywords = null;
            }
            if (this.defaultSRS!= null) {
                String sourceDefaultSRS;
                sourceDefaultSRS = this.getDefaultSRS();
                String copyDefaultSRS = ((String) strategy.copy(LocatorUtils.property(locator, "defaultSRS", sourceDefaultSRS), sourceDefaultSRS));
                copy.setDefaultSRS(copyDefaultSRS);
            } else {
                copy.defaultSRS = null;
            }
            if ((this.otherSRS!= null)&&(!this.otherSRS.isEmpty())) {
                List<String> sourceOtherSRS;
                sourceOtherSRS = this.getOtherSRS();
                @SuppressWarnings("unchecked")
                List<String> copyOtherSRS = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "otherSRS", sourceOtherSRS), sourceOtherSRS));
                copy.otherSRS = null;
                List<String> uniqueOtherSRSl = copy.getOtherSRS();
                uniqueOtherSRSl.addAll(copyOtherSRS);
            } else {
                copy.otherSRS = null;
            }
            if (this.noSRS!= null) {
                FeatureTypeType.NoSRS sourceNoSRS;
                sourceNoSRS = this.getNoSRS();
                FeatureTypeType.NoSRS copyNoSRS = ((FeatureTypeType.NoSRS) strategy.copy(LocatorUtils.property(locator, "noSRS", sourceNoSRS), sourceNoSRS));
                copy.setNoSRS(copyNoSRS);
            } else {
                copy.noSRS = null;
            }
            if (this.operations!= null) {
                OperationsType sourceOperations;
                sourceOperations = this.getOperations();
                OperationsType copyOperations = ((OperationsType) strategy.copy(LocatorUtils.property(locator, "operations", sourceOperations), sourceOperations));
                copy.setOperations(copyOperations);
            } else {
                copy.operations = null;
            }
            if (this.outputFormats!= null) {
                OutputFormatListType sourceOutputFormats;
                sourceOutputFormats = this.getOutputFormats();
                OutputFormatListType copyOutputFormats = ((OutputFormatListType) strategy.copy(LocatorUtils.property(locator, "outputFormats", sourceOutputFormats), sourceOutputFormats));
                copy.setOutputFormats(copyOutputFormats);
            } else {
                copy.outputFormats = null;
            }
            if ((this.wgs84BoundingBox!= null)&&(!this.wgs84BoundingBox.isEmpty())) {
                List<WGS84BoundingBoxType> sourceWGS84BoundingBox;
                sourceWGS84BoundingBox = this.getWGS84BoundingBox();
                @SuppressWarnings("unchecked")
                List<WGS84BoundingBoxType> copyWGS84BoundingBox = ((List<WGS84BoundingBoxType> ) strategy.copy(LocatorUtils.property(locator, "wgs84BoundingBox", sourceWGS84BoundingBox), sourceWGS84BoundingBox));
                copy.wgs84BoundingBox = null;
                List<WGS84BoundingBoxType> uniqueWGS84BoundingBoxl = copy.getWGS84BoundingBox();
                uniqueWGS84BoundingBoxl.addAll(copyWGS84BoundingBox);
            } else {
                copy.wgs84BoundingBox = null;
            }
            if ((this.metadataURL!= null)&&(!this.metadataURL.isEmpty())) {
                List<MetadataURLType> sourceMetadataURL;
                sourceMetadataURL = this.getMetadataURL();
                @SuppressWarnings("unchecked")
                List<MetadataURLType> copyMetadataURL = ((List<MetadataURLType> ) strategy.copy(LocatorUtils.property(locator, "metadataURL", sourceMetadataURL), sourceMetadataURL));
                copy.metadataURL = null;
                List<MetadataURLType> uniqueMetadataURLl = copy.getMetadataURL();
                uniqueMetadataURLl.addAll(copyMetadataURL);
            } else {
                copy.metadataURL = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeatureTypeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof FeatureTypeType) {
            final FeatureTypeType target = this;
            final FeatureTypeType leftObject = ((FeatureTypeType) left);
            final FeatureTypeType rightObject = ((FeatureTypeType) right);
            {
                QName lhsName;
                lhsName = leftObject.getName();
                QName rhsName;
                rhsName = rightObject.getName();
                target.setName(((QName) strategy.merge(LocatorUtils.property(leftLocator, "name", lhsName), LocatorUtils.property(rightLocator, "name", rhsName), lhsName, rhsName)));
            }
            {
                String lhsTitle;
                lhsTitle = leftObject.getTitle();
                String rhsTitle;
                rhsTitle = rightObject.getTitle();
                target.setTitle(((String) strategy.merge(LocatorUtils.property(leftLocator, "title", lhsTitle), LocatorUtils.property(rightLocator, "title", rhsTitle), lhsTitle, rhsTitle)));
            }
            {
                String lhsAbstract;
                lhsAbstract = leftObject.getAbstract();
                String rhsAbstract;
                rhsAbstract = rightObject.getAbstract();
                target.setAbstract(((String) strategy.merge(LocatorUtils.property(leftLocator, "_abstract", lhsAbstract), LocatorUtils.property(rightLocator, "_abstract", rhsAbstract), lhsAbstract, rhsAbstract)));
            }
            {
                List<KeywordsType> lhsKeywords;
                lhsKeywords = leftObject.getKeywords();
                List<KeywordsType> rhsKeywords;
                rhsKeywords = rightObject.getKeywords();
                target.keywords = null;
                List<KeywordsType> uniqueKeywordsl = target.getKeywords();
                uniqueKeywordsl.addAll(((List<KeywordsType> ) strategy.merge(LocatorUtils.property(leftLocator, "keywords", lhsKeywords), LocatorUtils.property(rightLocator, "keywords", rhsKeywords), lhsKeywords, rhsKeywords)));
            }
            {
                String lhsDefaultSRS;
                lhsDefaultSRS = leftObject.getDefaultSRS();
                String rhsDefaultSRS;
                rhsDefaultSRS = rightObject.getDefaultSRS();
                target.setDefaultSRS(((String) strategy.merge(LocatorUtils.property(leftLocator, "defaultSRS", lhsDefaultSRS), LocatorUtils.property(rightLocator, "defaultSRS", rhsDefaultSRS), lhsDefaultSRS, rhsDefaultSRS)));
            }
            {
                List<String> lhsOtherSRS;
                lhsOtherSRS = leftObject.getOtherSRS();
                List<String> rhsOtherSRS;
                rhsOtherSRS = rightObject.getOtherSRS();
                target.otherSRS = null;
                List<String> uniqueOtherSRSl = target.getOtherSRS();
                uniqueOtherSRSl.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "otherSRS", lhsOtherSRS), LocatorUtils.property(rightLocator, "otherSRS", rhsOtherSRS), lhsOtherSRS, rhsOtherSRS)));
            }
            {
                FeatureTypeType.NoSRS lhsNoSRS;
                lhsNoSRS = leftObject.getNoSRS();
                FeatureTypeType.NoSRS rhsNoSRS;
                rhsNoSRS = rightObject.getNoSRS();
                target.setNoSRS(((FeatureTypeType.NoSRS) strategy.merge(LocatorUtils.property(leftLocator, "noSRS", lhsNoSRS), LocatorUtils.property(rightLocator, "noSRS", rhsNoSRS), lhsNoSRS, rhsNoSRS)));
            }
            {
                OperationsType lhsOperations;
                lhsOperations = leftObject.getOperations();
                OperationsType rhsOperations;
                rhsOperations = rightObject.getOperations();
                target.setOperations(((OperationsType) strategy.merge(LocatorUtils.property(leftLocator, "operations", lhsOperations), LocatorUtils.property(rightLocator, "operations", rhsOperations), lhsOperations, rhsOperations)));
            }
            {
                OutputFormatListType lhsOutputFormats;
                lhsOutputFormats = leftObject.getOutputFormats();
                OutputFormatListType rhsOutputFormats;
                rhsOutputFormats = rightObject.getOutputFormats();
                target.setOutputFormats(((OutputFormatListType) strategy.merge(LocatorUtils.property(leftLocator, "outputFormats", lhsOutputFormats), LocatorUtils.property(rightLocator, "outputFormats", rhsOutputFormats), lhsOutputFormats, rhsOutputFormats)));
            }
            {
                List<WGS84BoundingBoxType> lhsWGS84BoundingBox;
                lhsWGS84BoundingBox = leftObject.getWGS84BoundingBox();
                List<WGS84BoundingBoxType> rhsWGS84BoundingBox;
                rhsWGS84BoundingBox = rightObject.getWGS84BoundingBox();
                target.wgs84BoundingBox = null;
                List<WGS84BoundingBoxType> uniqueWGS84BoundingBoxl = target.getWGS84BoundingBox();
                uniqueWGS84BoundingBoxl.addAll(((List<WGS84BoundingBoxType> ) strategy.merge(LocatorUtils.property(leftLocator, "wgs84BoundingBox", lhsWGS84BoundingBox), LocatorUtils.property(rightLocator, "wgs84BoundingBox", rhsWGS84BoundingBox), lhsWGS84BoundingBox, rhsWGS84BoundingBox)));
            }
            {
                List<MetadataURLType> lhsMetadataURL;
                lhsMetadataURL = leftObject.getMetadataURL();
                List<MetadataURLType> rhsMetadataURL;
                rhsMetadataURL = rightObject.getMetadataURL();
                target.metadataURL = null;
                List<MetadataURLType> uniqueMetadataURLl = target.getMetadataURL();
                uniqueMetadataURLl.addAll(((List<MetadataURLType> ) strategy.merge(LocatorUtils.property(leftLocator, "metadataURL", lhsMetadataURL), LocatorUtils.property(rightLocator, "metadataURL", rhsMetadataURL), lhsMetadataURL, rhsMetadataURL)));
            }
        }
    }

    public void setKeywords(List<KeywordsType> value) {
        List<KeywordsType> draftl = this.getKeywords();
        draftl.addAll(value);
    }

    public void setOtherSRS(List<String> value) {
        List<String> draftl = this.getOtherSRS();
        draftl.addAll(value);
    }

    public void setWGS84BoundingBox(List<WGS84BoundingBoxType> value) {
        List<WGS84BoundingBoxType> draftl = this.getWGS84BoundingBox();
        draftl.addAll(value);
    }

    public void setMetadataURL(List<MetadataURLType> value) {
        List<MetadataURLType> draftl = this.getMetadataURL();
        draftl.addAll(value);
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NoSRS
        implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
    {


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
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof FeatureTypeType.NoSRS)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new FeatureTypeType.NoSRS();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        }

    }

}
