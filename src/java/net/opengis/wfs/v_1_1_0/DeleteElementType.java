//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import net.opengis.filter.v_1_1_0.FilterType;
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
 * <p>Java-Klasse für DeleteElementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ogc}Filter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="handle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeName" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteElementType", propOrder = {
    "filter"
})
public class DeleteElementType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "Filter", namespace = "http://www.opengis.net/ogc", required = true)
    protected FilterType filter;
    @XmlAttribute(name = "handle")
    protected String handle;
    @XmlAttribute(name = "typeName", required = true)
    protected QName typeName;

    /**
     * 
     *                   The Filter element is used to constrain the scope
     *                   of the delete operation to those features identified
     *                   by the filter.  Feature instances can be specified
     *                   explicitly and individually using the identifier of
     *                   each feature instance OR a set of features to be
     *                   operated on can be identified by specifying spatial
     *                   and non-spatial constraints in the filter.
     *                   If no filter is specified then an exception should
     *                   be raised since it is unlikely that a client application
     *                   intends to delete all feature instances.
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
     * Ruft den Wert der typeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getTypeName() {
        return typeName;
    }

    /**
     * Legt den Wert der typeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setTypeName(QName value) {
        this.typeName = value;
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
            FilterType theFilter;
            theFilter = this.getFilter();
            strategy.appendField(locator, this, "filter", buffer, theFilter);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            strategy.appendField(locator, this, "handle", buffer, theHandle);
        }
        {
            QName theTypeName;
            theTypeName = this.getTypeName();
            strategy.appendField(locator, this, "typeName", buffer, theTypeName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeleteElementType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeleteElementType that = ((DeleteElementType) object);
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
            String lhsHandle;
            lhsHandle = this.getHandle();
            String rhsHandle;
            rhsHandle = that.getHandle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handle", lhsHandle), LocatorUtils.property(thatLocator, "handle", rhsHandle), lhsHandle, rhsHandle)) {
                return false;
            }
        }
        {
            QName lhsTypeName;
            lhsTypeName = this.getTypeName();
            QName rhsTypeName;
            rhsTypeName = that.getTypeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeName", lhsTypeName), LocatorUtils.property(thatLocator, "typeName", rhsTypeName), lhsTypeName, rhsTypeName)) {
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
            FilterType theFilter;
            theFilter = this.getFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filter", theFilter), currentHashCode, theFilter);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handle", theHandle), currentHashCode, theHandle);
        }
        {
            QName theTypeName;
            theTypeName = this.getTypeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeName", theTypeName), currentHashCode, theTypeName);
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
        if (draftCopy instanceof DeleteElementType) {
            final DeleteElementType copy = ((DeleteElementType) draftCopy);
            if (this.filter!= null) {
                FilterType sourceFilter;
                sourceFilter = this.getFilter();
                FilterType copyFilter = ((FilterType) strategy.copy(LocatorUtils.property(locator, "filter", sourceFilter), sourceFilter));
                copy.setFilter(copyFilter);
            } else {
                copy.filter = null;
            }
            if (this.handle!= null) {
                String sourceHandle;
                sourceHandle = this.getHandle();
                String copyHandle = ((String) strategy.copy(LocatorUtils.property(locator, "handle", sourceHandle), sourceHandle));
                copy.setHandle(copyHandle);
            } else {
                copy.handle = null;
            }
            if (this.typeName!= null) {
                QName sourceTypeName;
                sourceTypeName = this.getTypeName();
                QName copyTypeName = ((QName) strategy.copy(LocatorUtils.property(locator, "typeName", sourceTypeName), sourceTypeName));
                copy.setTypeName(copyTypeName);
            } else {
                copy.typeName = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DeleteElementType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof DeleteElementType) {
            final DeleteElementType target = this;
            final DeleteElementType leftObject = ((DeleteElementType) left);
            final DeleteElementType rightObject = ((DeleteElementType) right);
            {
                FilterType lhsFilter;
                lhsFilter = leftObject.getFilter();
                FilterType rhsFilter;
                rhsFilter = rightObject.getFilter();
                target.setFilter(((FilterType) strategy.merge(LocatorUtils.property(leftLocator, "filter", lhsFilter), LocatorUtils.property(rightLocator, "filter", rhsFilter), lhsFilter, rhsFilter)));
            }
            {
                String lhsHandle;
                lhsHandle = leftObject.getHandle();
                String rhsHandle;
                rhsHandle = rightObject.getHandle();
                target.setHandle(((String) strategy.merge(LocatorUtils.property(leftLocator, "handle", lhsHandle), LocatorUtils.property(rightLocator, "handle", rhsHandle), lhsHandle, rhsHandle)));
            }
            {
                QName lhsTypeName;
                lhsTypeName = leftObject.getTypeName();
                QName rhsTypeName;
                rhsTypeName = rightObject.getTypeName();
                target.setTypeName(((QName) strategy.merge(LocatorUtils.property(leftLocator, "typeName", lhsTypeName), LocatorUtils.property(rightLocator, "typeName", rhsTypeName), lhsTypeName, rhsTypeName)));
            }
        }
    }

}
