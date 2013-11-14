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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.w3c.dom.Element;


/**
 * [complexType of] The symbol property. Allows for remote referencing of symbols.
 * 
 * <p>Java-Klasse für SymbolType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SymbolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *       &lt;attribute name="symbolType" use="required" type="{http://www.opengis.net/gml}SymbolTypeEnumeration" />
 *       &lt;attribute ref="{http://www.opengis.net/gml}transform"/>
 *       &lt;attribute name="about" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolType", propOrder = {
    "any"
})
public class SymbolType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "symbolType", required = true)
    protected SymbolTypeEnumeration symbolType;
    @XmlAttribute(name = "transform", namespace = "http://www.opengis.net/gml")
    protected String transform;
    @XmlAttribute(name = "about")
    @XmlSchemaType(name = "anyURI")
    protected String about;
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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    public boolean isSetAny() {
        return ((this.any!= null)&&(!this.any.isEmpty()));
    }

    public void unsetAny() {
        this.any = null;
    }

    /**
     * Ruft den Wert der symbolType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SymbolTypeEnumeration }
     *     
     */
    public SymbolTypeEnumeration getSymbolType() {
        return symbolType;
    }

    /**
     * Legt den Wert der symbolType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolTypeEnumeration }
     *     
     */
    public void setSymbolType(SymbolTypeEnumeration value) {
        this.symbolType = value;
    }

    public boolean isSetSymbolType() {
        return (this.symbolType!= null);
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

    /**
     * Ruft den Wert der about-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Legt den Wert der about-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

    public boolean isSetAbout() {
        return (this.about!= null);
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
            List<Element> theAny;
            theAny = this.getAny();
            strategy.appendField(locator, this, "any", buffer, theAny);
        }
        {
            SymbolTypeEnumeration theSymbolType;
            theSymbolType = this.getSymbolType();
            strategy.appendField(locator, this, "symbolType", buffer, theSymbolType);
        }
        {
            String theTransform;
            theTransform = this.getTransform();
            strategy.appendField(locator, this, "transform", buffer, theTransform);
        }
        {
            String theAbout;
            theAbout = this.getAbout();
            strategy.appendField(locator, this, "about", buffer, theAbout);
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
        if (!(object instanceof SymbolType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SymbolType that = ((SymbolType) object);
        {
            List<Element> lhsAny;
            lhsAny = this.getAny();
            List<Element> rhsAny;
            rhsAny = that.getAny();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                return false;
            }
        }
        {
            SymbolTypeEnumeration lhsSymbolType;
            lhsSymbolType = this.getSymbolType();
            SymbolTypeEnumeration rhsSymbolType;
            rhsSymbolType = that.getSymbolType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "symbolType", lhsSymbolType), LocatorUtils.property(thatLocator, "symbolType", rhsSymbolType), lhsSymbolType, rhsSymbolType)) {
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
        {
            String lhsAbout;
            lhsAbout = this.getAbout();
            String rhsAbout;
            rhsAbout = that.getAbout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "about", lhsAbout), LocatorUtils.property(thatLocator, "about", rhsAbout), lhsAbout, rhsAbout)) {
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
            List<Element> theAny;
            theAny = this.getAny();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
        }
        {
            SymbolTypeEnumeration theSymbolType;
            theSymbolType = this.getSymbolType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "symbolType", theSymbolType), currentHashCode, theSymbolType);
        }
        {
            String theTransform;
            theTransform = this.getTransform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transform", theTransform), currentHashCode, theTransform);
        }
        {
            String theAbout;
            theAbout = this.getAbout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "about", theAbout), currentHashCode, theAbout);
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
        if (draftCopy instanceof SymbolType) {
            final SymbolType copy = ((SymbolType) draftCopy);
            if (this.isSetAny()) {
                List<Element> sourceAny;
                sourceAny = this.getAny();
                @SuppressWarnings("unchecked")
                List<Element> copyAny = ((List<Element> ) strategy.copy(LocatorUtils.property(locator, "any", sourceAny), sourceAny));
                copy.unsetAny();
                List<Element> uniqueAnyl = copy.getAny();
                uniqueAnyl.addAll(copyAny);
            } else {
                copy.unsetAny();
            }
            if (this.isSetSymbolType()) {
                SymbolTypeEnumeration sourceSymbolType;
                sourceSymbolType = this.getSymbolType();
                SymbolTypeEnumeration copySymbolType = ((SymbolTypeEnumeration) strategy.copy(LocatorUtils.property(locator, "symbolType", sourceSymbolType), sourceSymbolType));
                copy.setSymbolType(copySymbolType);
            } else {
                copy.symbolType = null;
            }
            if (this.isSetTransform()) {
                String sourceTransform;
                sourceTransform = this.getTransform();
                String copyTransform = ((String) strategy.copy(LocatorUtils.property(locator, "transform", sourceTransform), sourceTransform));
                copy.setTransform(copyTransform);
            } else {
                copy.transform = null;
            }
            if (this.isSetAbout()) {
                String sourceAbout;
                sourceAbout = this.getAbout();
                String copyAbout = ((String) strategy.copy(LocatorUtils.property(locator, "about", sourceAbout), sourceAbout));
                copy.setAbout(copyAbout);
            } else {
                copy.about = null;
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
        return new SymbolType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof SymbolType) {
            final SymbolType target = this;
            final SymbolType leftObject = ((SymbolType) left);
            final SymbolType rightObject = ((SymbolType) right);
            {
                List<Element> lhsAny;
                lhsAny = leftObject.getAny();
                List<Element> rhsAny;
                rhsAny = rightObject.getAny();
                target.unsetAny();
                List<Element> uniqueAnyl = target.getAny();
                uniqueAnyl.addAll(((List<Element> ) strategy.merge(LocatorUtils.property(leftLocator, "any", lhsAny), LocatorUtils.property(rightLocator, "any", rhsAny), lhsAny, rhsAny)));
            }
            {
                SymbolTypeEnumeration lhsSymbolType;
                lhsSymbolType = leftObject.getSymbolType();
                SymbolTypeEnumeration rhsSymbolType;
                rhsSymbolType = rightObject.getSymbolType();
                target.setSymbolType(((SymbolTypeEnumeration) strategy.merge(LocatorUtils.property(leftLocator, "symbolType", lhsSymbolType), LocatorUtils.property(rightLocator, "symbolType", rhsSymbolType), lhsSymbolType, rhsSymbolType)));
            }
            {
                String lhsTransform;
                lhsTransform = leftObject.getTransform();
                String rhsTransform;
                rhsTransform = rightObject.getTransform();
                target.setTransform(((String) strategy.merge(LocatorUtils.property(leftLocator, "transform", lhsTransform), LocatorUtils.property(rightLocator, "transform", rhsTransform), lhsTransform, rhsTransform)));
            }
            {
                String lhsAbout;
                lhsAbout = leftObject.getAbout();
                String rhsAbout;
                rhsAbout = rightObject.getAbout();
                target.setAbout(((String) strategy.merge(LocatorUtils.property(leftLocator, "about", lhsAbout), LocatorUtils.property(rightLocator, "about", rhsAbout), lhsAbout, rhsAbout)));
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

    public void setAny(List<Element> value) {
        List<Element> draftl = this.getAny();
        draftl.addAll(value);
    }

}
