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
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * 
 *             XML encoded WFS operation request base, for all operations
 *             except GetCapabilities.
 *          
 * 
 * <p>Java-Klasse für BaseRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="service" type="{http://www.opengis.net/ows}ServiceType" default="WFS" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.1.0" />
 *       &lt;attribute name="handle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType")
@XmlSeeAlso({
    TransactionType.class,
    LockFeatureType.class,
    GetFeatureType.class,
    GetFeatureWithLockType.class,
    GetGmlObjectType.class,
    DescribeFeatureTypeType.class
})
public abstract class BaseRequestType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAttribute(name = "service")
    protected String service;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "handle")
    protected String handle;

    /**
     * Ruft den Wert der service-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        if (service == null) {
            return "WFS";
        } else {
            return service;
        }
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.1.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
            String theService;
            theService = this.getService();
            strategy.appendField(locator, this, "service", buffer, theService);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            strategy.appendField(locator, this, "handle", buffer, theHandle);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BaseRequestType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BaseRequestType that = ((BaseRequestType) object);
        {
            String lhsService;
            lhsService = this.getService();
            String rhsService;
            rhsService = that.getService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "service", lhsService), LocatorUtils.property(thatLocator, "service", rhsService), lhsService, rhsService)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theService;
            theService = this.getService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "service", theService), currentHashCode, theService);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handle", theHandle), currentHashCode, theHandle);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof BaseRequestType) {
            final BaseRequestType copy = ((BaseRequestType) target);
            if (this.service!= null) {
                String sourceService;
                sourceService = this.getService();
                String copyService = ((String) strategy.copy(LocatorUtils.property(locator, "service", sourceService), sourceService));
                copy.setService(copyService);
            } else {
                copy.service = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.handle!= null) {
                String sourceHandle;
                sourceHandle = this.getHandle();
                String copyHandle = ((String) strategy.copy(LocatorUtils.property(locator, "handle", sourceHandle), sourceHandle));
                copy.setHandle(copyHandle);
            } else {
                copy.handle = null;
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof BaseRequestType) {
            final BaseRequestType target = this;
            final BaseRequestType leftObject = ((BaseRequestType) left);
            final BaseRequestType rightObject = ((BaseRequestType) right);
            {
                String lhsService;
                lhsService = leftObject.getService();
                String rhsService;
                rhsService = rightObject.getService();
                target.setService(((String) strategy.merge(LocatorUtils.property(leftLocator, "service", lhsService), LocatorUtils.property(rightLocator, "service", rhsService), lhsService, rhsService)));
            }
            {
                String lhsVersion;
                lhsVersion = leftObject.getVersion();
                String rhsVersion;
                rhsVersion = rightObject.getVersion();
                target.setVersion(((String) strategy.merge(LocatorUtils.property(leftLocator, "version", lhsVersion), LocatorUtils.property(rightLocator, "version", rhsVersion), lhsVersion, rhsVersion)));
            }
            {
                String lhsHandle;
                lhsHandle = leftObject.getHandle();
                String rhsHandle;
                rhsHandle = rightObject.getHandle();
                target.setHandle(((String) strategy.merge(LocatorUtils.property(leftLocator, "handle", lhsHandle), LocatorUtils.property(rightLocator, "handle", rhsHandle), lhsHandle, rhsHandle)));
            }
        }
    }

}
