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
 * <p>Java-Klasse für NativeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NativeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="vendorId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="safeToIgnore" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeType")
public class NativeType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAttribute(name = "vendorId", required = true)
    protected String vendorId;
    @XmlAttribute(name = "safeToIgnore", required = true)
    protected boolean safeToIgnore;

    /**
     * Ruft den Wert der vendorId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Legt den Wert der vendorId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Ruft den Wert der safeToIgnore-Eigenschaft ab.
     * 
     */
    public boolean isSafeToIgnore() {
        return safeToIgnore;
    }

    /**
     * Legt den Wert der safeToIgnore-Eigenschaft fest.
     * 
     */
    public void setSafeToIgnore(boolean value) {
        this.safeToIgnore = value;
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
            String theVendorId;
            theVendorId = this.getVendorId();
            strategy.appendField(locator, this, "vendorId", buffer, theVendorId);
        }
        {
            boolean theSafeToIgnore;
            theSafeToIgnore = this.isSafeToIgnore();
            strategy.appendField(locator, this, "safeToIgnore", buffer, theSafeToIgnore);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NativeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NativeType that = ((NativeType) object);
        {
            String lhsVendorId;
            lhsVendorId = this.getVendorId();
            String rhsVendorId;
            rhsVendorId = that.getVendorId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorId", lhsVendorId), LocatorUtils.property(thatLocator, "vendorId", rhsVendorId), lhsVendorId, rhsVendorId)) {
                return false;
            }
        }
        {
            boolean lhsSafeToIgnore;
            lhsSafeToIgnore = this.isSafeToIgnore();
            boolean rhsSafeToIgnore;
            rhsSafeToIgnore = that.isSafeToIgnore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "safeToIgnore", lhsSafeToIgnore), LocatorUtils.property(thatLocator, "safeToIgnore", rhsSafeToIgnore), lhsSafeToIgnore, rhsSafeToIgnore)) {
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
            String theVendorId;
            theVendorId = this.getVendorId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorId", theVendorId), currentHashCode, theVendorId);
        }
        {
            boolean theSafeToIgnore;
            theSafeToIgnore = this.isSafeToIgnore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "safeToIgnore", theSafeToIgnore), currentHashCode, theSafeToIgnore);
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
        if (draftCopy instanceof NativeType) {
            final NativeType copy = ((NativeType) draftCopy);
            if (this.vendorId!= null) {
                String sourceVendorId;
                sourceVendorId = this.getVendorId();
                String copyVendorId = ((String) strategy.copy(LocatorUtils.property(locator, "vendorId", sourceVendorId), sourceVendorId));
                copy.setVendorId(copyVendorId);
            } else {
                copy.vendorId = null;
            }
            boolean sourceSafeToIgnore;
            sourceSafeToIgnore = this.isSafeToIgnore();
            boolean copySafeToIgnore = strategy.copy(LocatorUtils.property(locator, "safeToIgnore", sourceSafeToIgnore), sourceSafeToIgnore);
            copy.setSafeToIgnore(copySafeToIgnore);
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new NativeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof NativeType) {
            final NativeType target = this;
            final NativeType leftObject = ((NativeType) left);
            final NativeType rightObject = ((NativeType) right);
            {
                String lhsVendorId;
                lhsVendorId = leftObject.getVendorId();
                String rhsVendorId;
                rhsVendorId = rightObject.getVendorId();
                target.setVendorId(((String) strategy.merge(LocatorUtils.property(leftLocator, "vendorId", lhsVendorId), LocatorUtils.property(rightLocator, "vendorId", rhsVendorId), lhsVendorId, rhsVendorId)));
            }
            {
                boolean lhsSafeToIgnore;
                lhsSafeToIgnore = leftObject.isSafeToIgnore();
                boolean rhsSafeToIgnore;
                rhsSafeToIgnore = rightObject.isSafeToIgnore();
                target.setSafeToIgnore(((boolean) strategy.merge(LocatorUtils.property(leftLocator, "safeToIgnore", lhsSafeToIgnore), LocatorUtils.property(rightLocator, "safeToIgnore", rhsSafeToIgnore), lhsSafeToIgnore, rhsSafeToIgnore)));
            }
        }
    }

}
