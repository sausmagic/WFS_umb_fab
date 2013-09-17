//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.filter.v_1_1_0.FilterCapabilities;
import net.opengis.ows.v_1_0_0.CapabilitiesBaseType;
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
 *             XML encoded WFS GetCapabilities operation response. This
 *             document provides clients with service metadata about a
 *             specific service instance, including metadata about the
 *             tightly-coupled data served. If the server does not implement
 *             the updateSequence parameter, the server shall always return
 *             the complete Capabilities document, without the updateSequence
 *             parameter. When the server implements the updateSequence
 *             parameter and the GetCapabilities operation request included
 *             the updateSequence parameter with the current value, the server
 *             shall return this element with only the "version" and
 *             "updateSequence" attributes. Otherwise, all optional elements
 *             shall be included or not depending on the actual value of the
 *             Contents parameter in the GetCapabilities operation request.
 *          
 * 
 * <p>Java-Klasse für WFS_CapabilitiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WFS_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows}CapabilitiesBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/wfs}FeatureTypeList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wfs}ServesGMLObjectTypeList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wfs}SupportsGMLObjectTypeList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ogc}Filter_Capabilities"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFS_CapabilitiesType", propOrder = {
    "featureTypeList",
    "servesGMLObjectTypeList",
    "supportsGMLObjectTypeList",
    "filterCapabilities"
})
@XmlRootElement(name = "WFS_Capabilities")
public class WFSCapabilitiesType
    extends CapabilitiesBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "FeatureTypeList")
    protected FeatureTypeListType featureTypeList;
    @XmlElement(name = "ServesGMLObjectTypeList")
    protected GMLObjectTypeListType servesGMLObjectTypeList;
    @XmlElement(name = "SupportsGMLObjectTypeList")
    protected GMLObjectTypeListType supportsGMLObjectTypeList;
    @XmlElement(name = "Filter_Capabilities", namespace = "http://www.opengis.net/ogc", required = true )
    protected FilterCapabilities filterCapabilities;

    /**
     * Ruft den Wert der featureTypeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTypeListType }
     *     
     */
    public FeatureTypeListType getFeatureTypeList() {
        return featureTypeList;
    }

    /**
     * Legt den Wert der featureTypeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTypeListType }
     *     
     */
    public void setFeatureTypeList(FeatureTypeListType value) {
        this.featureTypeList = value;
    }

    /**
     * Ruft den Wert der servesGMLObjectTypeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GMLObjectTypeListType }
     *     
     */
    public GMLObjectTypeListType getServesGMLObjectTypeList() {
        return servesGMLObjectTypeList;
    }

    /**
     * Legt den Wert der servesGMLObjectTypeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLObjectTypeListType }
     *     
     */
    public void setServesGMLObjectTypeList(GMLObjectTypeListType value) {
        this.servesGMLObjectTypeList = value;
    }

    /**
     * Ruft den Wert der supportsGMLObjectTypeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GMLObjectTypeListType }
     *     
     */
    public GMLObjectTypeListType getSupportsGMLObjectTypeList() {
        return supportsGMLObjectTypeList;
    }

    /**
     * Legt den Wert der supportsGMLObjectTypeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLObjectTypeListType }
     *     
     */
    public void setSupportsGMLObjectTypeList(GMLObjectTypeListType value) {
        this.supportsGMLObjectTypeList = value;
    }

    /**
     * Ruft den Wert der filterCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterCapabilities }
     *     
     */
    public FilterCapabilities getFilterCapabilities() {
        return filterCapabilities;
    }

    /**
     * Legt den Wert der filterCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCapabilities }
     *     
     */
    public void setFilterCapabilities(FilterCapabilities value) {
        this.filterCapabilities = value;
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
            FeatureTypeListType theFeatureTypeList;
            theFeatureTypeList = this.getFeatureTypeList();
            strategy.appendField(locator, this, "featureTypeList", buffer, theFeatureTypeList);
        }
        {
            GMLObjectTypeListType theServesGMLObjectTypeList;
            theServesGMLObjectTypeList = this.getServesGMLObjectTypeList();
            strategy.appendField(locator, this, "servesGMLObjectTypeList", buffer, theServesGMLObjectTypeList);
        }
        {
            GMLObjectTypeListType theSupportsGMLObjectTypeList;
            theSupportsGMLObjectTypeList = this.getSupportsGMLObjectTypeList();
            strategy.appendField(locator, this, "supportsGMLObjectTypeList", buffer, theSupportsGMLObjectTypeList);
        }
        {
            FilterCapabilities theFilterCapabilities;
            theFilterCapabilities = this.getFilterCapabilities();
            strategy.appendField(locator, this, "filterCapabilities", buffer, theFilterCapabilities);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WFSCapabilitiesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final WFSCapabilitiesType that = ((WFSCapabilitiesType) object);
        {
            FeatureTypeListType lhsFeatureTypeList;
            lhsFeatureTypeList = this.getFeatureTypeList();
            FeatureTypeListType rhsFeatureTypeList;
            rhsFeatureTypeList = that.getFeatureTypeList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureTypeList", lhsFeatureTypeList), LocatorUtils.property(thatLocator, "featureTypeList", rhsFeatureTypeList), lhsFeatureTypeList, rhsFeatureTypeList)) {
                return false;
            }
        }
        {
            GMLObjectTypeListType lhsServesGMLObjectTypeList;
            lhsServesGMLObjectTypeList = this.getServesGMLObjectTypeList();
            GMLObjectTypeListType rhsServesGMLObjectTypeList;
            rhsServesGMLObjectTypeList = that.getServesGMLObjectTypeList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servesGMLObjectTypeList", lhsServesGMLObjectTypeList), LocatorUtils.property(thatLocator, "servesGMLObjectTypeList", rhsServesGMLObjectTypeList), lhsServesGMLObjectTypeList, rhsServesGMLObjectTypeList)) {
                return false;
            }
        }
        {
            GMLObjectTypeListType lhsSupportsGMLObjectTypeList;
            lhsSupportsGMLObjectTypeList = this.getSupportsGMLObjectTypeList();
            GMLObjectTypeListType rhsSupportsGMLObjectTypeList;
            rhsSupportsGMLObjectTypeList = that.getSupportsGMLObjectTypeList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportsGMLObjectTypeList", lhsSupportsGMLObjectTypeList), LocatorUtils.property(thatLocator, "supportsGMLObjectTypeList", rhsSupportsGMLObjectTypeList), lhsSupportsGMLObjectTypeList, rhsSupportsGMLObjectTypeList)) {
                return false;
            }
        }
        {
            FilterCapabilities lhsFilterCapabilities;
            lhsFilterCapabilities = this.getFilterCapabilities();
            FilterCapabilities rhsFilterCapabilities;
            rhsFilterCapabilities = that.getFilterCapabilities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filterCapabilities", lhsFilterCapabilities), LocatorUtils.property(thatLocator, "filterCapabilities", rhsFilterCapabilities), lhsFilterCapabilities, rhsFilterCapabilities)) {
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
            FeatureTypeListType theFeatureTypeList;
            theFeatureTypeList = this.getFeatureTypeList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureTypeList", theFeatureTypeList), currentHashCode, theFeatureTypeList);
        }
        {
            GMLObjectTypeListType theServesGMLObjectTypeList;
            theServesGMLObjectTypeList = this.getServesGMLObjectTypeList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servesGMLObjectTypeList", theServesGMLObjectTypeList), currentHashCode, theServesGMLObjectTypeList);
        }
        {
            GMLObjectTypeListType theSupportsGMLObjectTypeList;
            theSupportsGMLObjectTypeList = this.getSupportsGMLObjectTypeList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportsGMLObjectTypeList", theSupportsGMLObjectTypeList), currentHashCode, theSupportsGMLObjectTypeList);
        }
        {
            FilterCapabilities theFilterCapabilities;
            theFilterCapabilities = this.getFilterCapabilities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filterCapabilities", theFilterCapabilities), currentHashCode, theFilterCapabilities);
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
        if (draftCopy instanceof WFSCapabilitiesType) {
            final WFSCapabilitiesType copy = ((WFSCapabilitiesType) draftCopy);
            if (this.featureTypeList!= null) {
                FeatureTypeListType sourceFeatureTypeList;
                sourceFeatureTypeList = this.getFeatureTypeList();
                FeatureTypeListType copyFeatureTypeList = ((FeatureTypeListType) strategy.copy(LocatorUtils.property(locator, "featureTypeList", sourceFeatureTypeList), sourceFeatureTypeList));
                copy.setFeatureTypeList(copyFeatureTypeList);
            } else {
                copy.featureTypeList = null;
            }
            if (this.servesGMLObjectTypeList!= null) {
                GMLObjectTypeListType sourceServesGMLObjectTypeList;
                sourceServesGMLObjectTypeList = this.getServesGMLObjectTypeList();
                GMLObjectTypeListType copyServesGMLObjectTypeList = ((GMLObjectTypeListType) strategy.copy(LocatorUtils.property(locator, "servesGMLObjectTypeList", sourceServesGMLObjectTypeList), sourceServesGMLObjectTypeList));
                copy.setServesGMLObjectTypeList(copyServesGMLObjectTypeList);
            } else {
                copy.servesGMLObjectTypeList = null;
            }
            if (this.supportsGMLObjectTypeList!= null) {
                GMLObjectTypeListType sourceSupportsGMLObjectTypeList;
                sourceSupportsGMLObjectTypeList = this.getSupportsGMLObjectTypeList();
                GMLObjectTypeListType copySupportsGMLObjectTypeList = ((GMLObjectTypeListType) strategy.copy(LocatorUtils.property(locator, "supportsGMLObjectTypeList", sourceSupportsGMLObjectTypeList), sourceSupportsGMLObjectTypeList));
                copy.setSupportsGMLObjectTypeList(copySupportsGMLObjectTypeList);
            } else {
                copy.supportsGMLObjectTypeList = null;
            }
            if (this.filterCapabilities!= null) {
                FilterCapabilities sourceFilterCapabilities;
                sourceFilterCapabilities = this.getFilterCapabilities();
                FilterCapabilities copyFilterCapabilities = ((FilterCapabilities) strategy.copy(LocatorUtils.property(locator, "filterCapabilities", sourceFilterCapabilities), sourceFilterCapabilities));
                copy.setFilterCapabilities(copyFilterCapabilities);
            } else {
                copy.filterCapabilities = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WFSCapabilitiesType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof WFSCapabilitiesType) {
            final WFSCapabilitiesType target = this;
            final WFSCapabilitiesType leftObject = ((WFSCapabilitiesType) left);
            final WFSCapabilitiesType rightObject = ((WFSCapabilitiesType) right);
            {
                FeatureTypeListType lhsFeatureTypeList;
                lhsFeatureTypeList = leftObject.getFeatureTypeList();
                FeatureTypeListType rhsFeatureTypeList;
                rhsFeatureTypeList = rightObject.getFeatureTypeList();
                target.setFeatureTypeList(((FeatureTypeListType) strategy.merge(LocatorUtils.property(leftLocator, "featureTypeList", lhsFeatureTypeList), LocatorUtils.property(rightLocator, "featureTypeList", rhsFeatureTypeList), lhsFeatureTypeList, rhsFeatureTypeList)));
            }
            {
                GMLObjectTypeListType lhsServesGMLObjectTypeList;
                lhsServesGMLObjectTypeList = leftObject.getServesGMLObjectTypeList();
                GMLObjectTypeListType rhsServesGMLObjectTypeList;
                rhsServesGMLObjectTypeList = rightObject.getServesGMLObjectTypeList();
                target.setServesGMLObjectTypeList(((GMLObjectTypeListType) strategy.merge(LocatorUtils.property(leftLocator, "servesGMLObjectTypeList", lhsServesGMLObjectTypeList), LocatorUtils.property(rightLocator, "servesGMLObjectTypeList", rhsServesGMLObjectTypeList), lhsServesGMLObjectTypeList, rhsServesGMLObjectTypeList)));
            }
            {
                GMLObjectTypeListType lhsSupportsGMLObjectTypeList;
                lhsSupportsGMLObjectTypeList = leftObject.getSupportsGMLObjectTypeList();
                GMLObjectTypeListType rhsSupportsGMLObjectTypeList;
                rhsSupportsGMLObjectTypeList = rightObject.getSupportsGMLObjectTypeList();
                target.setSupportsGMLObjectTypeList(((GMLObjectTypeListType) strategy.merge(LocatorUtils.property(leftLocator, "supportsGMLObjectTypeList", lhsSupportsGMLObjectTypeList), LocatorUtils.property(rightLocator, "supportsGMLObjectTypeList", rhsSupportsGMLObjectTypeList), lhsSupportsGMLObjectTypeList, rhsSupportsGMLObjectTypeList)));
            }
            {
                FilterCapabilities lhsFilterCapabilities;
                lhsFilterCapabilities = leftObject.getFilterCapabilities();
                FilterCapabilities rhsFilterCapabilities;
                rhsFilterCapabilities = rightObject.getFilterCapabilities();
                target.setFilterCapabilities(((FilterCapabilities) strategy.merge(LocatorUtils.property(leftLocator, "filterCapabilities", lhsFilterCapabilities), LocatorUtils.property(rightLocator, "filterCapabilities", rhsFilterCapabilities), lhsFilterCapabilities, rhsFilterCapabilities)));
            }
        }
    }

}
