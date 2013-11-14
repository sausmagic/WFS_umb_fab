//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * A 2D coordinate reference system used to approximate the shape of the earth on a planar surface, but in such a way that the distortion that is inherent to the approximation is carefully controlled and known. Distortion correction is commonly applied to calculated bearings and distances to produce values that are a close match to actual field values. 
 * 
 * <p>Java-Klasse für ProjectedCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProjectedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedCRSType", propOrder = {
    "usesCartesianCS"
})
public class ProjectedCRSType
    extends AbstractGeneralDerivedCRSType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected CartesianCSRefType usesCartesianCS;

    /**
     * Ruft den Wert der usesCartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSRefType }
     *     
     */
    public CartesianCSRefType getUsesCartesianCS() {
        return usesCartesianCS;
    }

    /**
     * Legt den Wert der usesCartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSRefType }
     *     
     */
    public void setUsesCartesianCS(CartesianCSRefType value) {
        this.usesCartesianCS = value;
    }

    public boolean isSetUsesCartesianCS() {
        return (this.usesCartesianCS!= null);
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
            CartesianCSRefType theUsesCartesianCS;
            theUsesCartesianCS = this.getUsesCartesianCS();
            strategy.appendField(locator, this, "usesCartesianCS", buffer, theUsesCartesianCS);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProjectedCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProjectedCRSType that = ((ProjectedCRSType) object);
        {
            CartesianCSRefType lhsUsesCartesianCS;
            lhsUsesCartesianCS = this.getUsesCartesianCS();
            CartesianCSRefType rhsUsesCartesianCS;
            rhsUsesCartesianCS = that.getUsesCartesianCS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(thatLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)) {
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
            CartesianCSRefType theUsesCartesianCS;
            theUsesCartesianCS = this.getUsesCartesianCS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesCartesianCS", theUsesCartesianCS), currentHashCode, theUsesCartesianCS);
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
        if (draftCopy instanceof ProjectedCRSType) {
            final ProjectedCRSType copy = ((ProjectedCRSType) draftCopy);
            if (this.isSetUsesCartesianCS()) {
                CartesianCSRefType sourceUsesCartesianCS;
                sourceUsesCartesianCS = this.getUsesCartesianCS();
                CartesianCSRefType copyUsesCartesianCS = ((CartesianCSRefType) strategy.copy(LocatorUtils.property(locator, "usesCartesianCS", sourceUsesCartesianCS), sourceUsesCartesianCS));
                copy.setUsesCartesianCS(copyUsesCartesianCS);
            } else {
                copy.usesCartesianCS = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProjectedCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ProjectedCRSType) {
            final ProjectedCRSType target = this;
            final ProjectedCRSType leftObject = ((ProjectedCRSType) left);
            final ProjectedCRSType rightObject = ((ProjectedCRSType) right);
            {
                CartesianCSRefType lhsUsesCartesianCS;
                lhsUsesCartesianCS = leftObject.getUsesCartesianCS();
                CartesianCSRefType rhsUsesCartesianCS;
                rhsUsesCartesianCS = rightObject.getUsesCartesianCS();
                target.setUsesCartesianCS(((CartesianCSRefType) strategy.merge(LocatorUtils.property(leftLocator, "usesCartesianCS", lhsUsesCartesianCS), LocatorUtils.property(rightLocator, "usesCartesianCS", rhsUsesCartesianCS), lhsUsesCartesianCS, rhsUsesCartesianCS)));
            }
        }
    }

}
