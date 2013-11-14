//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
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
 * Label is mixed -- composed of text and XPath expressions used to extract the useful information from the feature.
 * 
 * <p>Java-Klasse für LabelType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelExpression" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml}transform"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelType", propOrder = {
    "content"
})
public class LabelType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "LabelExpression", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "transform", namespace = "http://www.opengis.net/gml")
    protected String transform;

    /**
     * Label is mixed -- composed of text and XPath expressions used to extract the useful information from the feature.Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    public boolean isSetContent() {
        return ((this.content!= null)&&(!this.content.isEmpty()));
    }

    public void unsetContent() {
        this.content = null;
    }

    /**
     * Ruft den Wert der transform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransform() {
        return transform;
    }

    /**
     * Legt den Wert der transform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransform(String value) {
        this.transform = value;
    }

    public boolean isSetTransform() {
        return (this.transform!= null);
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
            List<Serializable> theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            String theTransform;
            theTransform = this.getTransform();
            strategy.appendField(locator, this, "transform", buffer, theTransform);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LabelType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LabelType that = ((LabelType) object);
        {
            List<Serializable> lhsContent;
            lhsContent = this.getContent();
            List<Serializable> rhsContent;
            rhsContent = that.getContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        {
            String lhsTransform;
            lhsTransform = this.getTransform();
            String rhsTransform;
            rhsTransform = that.getTransform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transform", lhsTransform), LocatorUtils.property(thatLocator, "transform", rhsTransform), lhsTransform, rhsTransform)) {
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
            List<Serializable> theContent;
            theContent = this.getContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        {
            String theTransform;
            theTransform = this.getTransform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transform", theTransform), currentHashCode, theTransform);
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
        if (draftCopy instanceof LabelType) {
            final LabelType copy = ((LabelType) draftCopy);
            if (this.isSetContent()) {
                List<Serializable> sourceContent;
                sourceContent = this.getContent();
                @SuppressWarnings("unchecked")
                List<Serializable> copyContent = ((List<Serializable> ) strategy.copy(LocatorUtils.property(locator, "content", sourceContent), sourceContent));
                copy.unsetContent();
                List<Serializable> uniqueContentl = copy.getContent();
                uniqueContentl.addAll(copyContent);
            } else {
                copy.unsetContent();
            }
            if (this.isSetTransform()) {
                String sourceTransform;
                sourceTransform = this.getTransform();
                String copyTransform = ((String) strategy.copy(LocatorUtils.property(locator, "transform", sourceTransform), sourceTransform));
                copy.setTransform(copyTransform);
            } else {
                copy.transform = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LabelType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof LabelType) {
            final LabelType target = this;
            final LabelType leftObject = ((LabelType) left);
            final LabelType rightObject = ((LabelType) right);
            {
                List<Serializable> lhsContent;
                lhsContent = leftObject.getContent();
                List<Serializable> rhsContent;
                rhsContent = rightObject.getContent();
                target.unsetContent();
                List<Serializable> uniqueContentl = target.getContent();
                uniqueContentl.addAll(((List<Serializable> ) strategy.merge(LocatorUtils.property(leftLocator, "content", lhsContent), LocatorUtils.property(rightLocator, "content", rhsContent), lhsContent, rhsContent)));
            }
            {
                String lhsTransform;
                lhsTransform = leftObject.getTransform();
                String rhsTransform;
                rhsTransform = rightObject.getTransform();
                target.setTransform(((String) strategy.merge(LocatorUtils.property(leftLocator, "transform", lhsTransform), LocatorUtils.property(rightLocator, "transform", rhsTransform), lhsTransform, rhsTransform)));
            }
        }
    }

    public void setContent(List<Serializable> value) {
        List<Serializable> draftl = this.getContent();
        draftl.addAll(value);
    }

}
