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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import net.opengis.ows.v_1_0_0.KeywordsType;
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
 *             An element of this type that describes a GML object in an
 *             application namespace shall have an xml xmlns specifier,
 *             e.g. xmlns:bo="http://www.BlueOx.org/BlueOx"
 *          
 * 
 * <p>Java-Klasse für GMLObjectTypeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GMLObjectTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows}Keywords" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OutputFormats" type="{http://www.opengis.net/wfs}OutputFormatListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLObjectTypeType", propOrder = {
    "name",
    "title",
    "_abstract",
    "keywords",
    "outputFormats"
})
public class GMLObjectTypeType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Name", required = true)
    protected QName name;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "Keywords", namespace = "http://www.opengis.net/ows")
    protected List<KeywordsType> keywords;
    @XmlElement(name = "OutputFormats")
    protected OutputFormatListType outputFormats;

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
            OutputFormatListType theOutputFormats;
            theOutputFormats = this.getOutputFormats();
            strategy.appendField(locator, this, "outputFormats", buffer, theOutputFormats);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GMLObjectTypeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GMLObjectTypeType that = ((GMLObjectTypeType) object);
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
            OutputFormatListType lhsOutputFormats;
            lhsOutputFormats = this.getOutputFormats();
            OutputFormatListType rhsOutputFormats;
            rhsOutputFormats = that.getOutputFormats();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputFormats", lhsOutputFormats), LocatorUtils.property(thatLocator, "outputFormats", rhsOutputFormats), lhsOutputFormats, rhsOutputFormats)) {
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
            OutputFormatListType theOutputFormats;
            theOutputFormats = this.getOutputFormats();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputFormats", theOutputFormats), currentHashCode, theOutputFormats);
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
        if (draftCopy instanceof GMLObjectTypeType) {
            final GMLObjectTypeType copy = ((GMLObjectTypeType) draftCopy);
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
            if (this.outputFormats!= null) {
                OutputFormatListType sourceOutputFormats;
                sourceOutputFormats = this.getOutputFormats();
                OutputFormatListType copyOutputFormats = ((OutputFormatListType) strategy.copy(LocatorUtils.property(locator, "outputFormats", sourceOutputFormats), sourceOutputFormats));
                copy.setOutputFormats(copyOutputFormats);
            } else {
                copy.outputFormats = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GMLObjectTypeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof GMLObjectTypeType) {
            final GMLObjectTypeType target = this;
            final GMLObjectTypeType leftObject = ((GMLObjectTypeType) left);
            final GMLObjectTypeType rightObject = ((GMLObjectTypeType) right);
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
                OutputFormatListType lhsOutputFormats;
                lhsOutputFormats = leftObject.getOutputFormats();
                OutputFormatListType rhsOutputFormats;
                rhsOutputFormats = rightObject.getOutputFormats();
                target.setOutputFormats(((OutputFormatListType) strategy.merge(LocatorUtils.property(leftLocator, "outputFormats", lhsOutputFormats), LocatorUtils.property(rightLocator, "outputFormats", rhsOutputFormats), lhsOutputFormats, rhsOutputFormats)));
            }
        }
    }

    public void setKeywords(List<KeywordsType> value) {
        List<KeywordsType> draftl = this.getKeywords();
        draftl.addAll(value);
    }

}
