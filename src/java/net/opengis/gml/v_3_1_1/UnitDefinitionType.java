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
 * Definition of a unit of measure (or uom). The definition includes a quantityType property, which indicates the phenomenon to which the units apply, and a catalogSymbol, which gives the short symbol used for this unit. This element is used when the relationship of this unit to other units or units systems is unknown.
 * 
 * <p>Java-Klasse für UnitDefinitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnitDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}quantityType"/>
 *         &lt;element ref="{http://www.opengis.net/gml}catalogSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDefinitionType", propOrder = {
    "quantityType",
    "catalogSymbol"
})
@XmlSeeAlso({
    DerivedUnitType.class,
    ConventionalUnitType.class,
    BaseUnitType.class
})
public class UnitDefinitionType
    extends DefinitionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected StringOrRefType quantityType;
    protected CodeType catalogSymbol;

    /**
     * Ruft den Wert der quantityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getQuantityType() {
        return quantityType;
    }

    /**
     * Legt den Wert der quantityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setQuantityType(StringOrRefType value) {
        this.quantityType = value;
    }

    public boolean isSetQuantityType() {
        return (this.quantityType!= null);
    }

    /**
     * Ruft den Wert der catalogSymbol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCatalogSymbol() {
        return catalogSymbol;
    }

    /**
     * Legt den Wert der catalogSymbol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCatalogSymbol(CodeType value) {
        this.catalogSymbol = value;
    }

    public boolean isSetCatalogSymbol() {
        return (this.catalogSymbol!= null);
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
            StringOrRefType theQuantityType;
            theQuantityType = this.getQuantityType();
            strategy.appendField(locator, this, "quantityType", buffer, theQuantityType);
        }
        {
            CodeType theCatalogSymbol;
            theCatalogSymbol = this.getCatalogSymbol();
            strategy.appendField(locator, this, "catalogSymbol", buffer, theCatalogSymbol);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UnitDefinitionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UnitDefinitionType that = ((UnitDefinitionType) object);
        {
            StringOrRefType lhsQuantityType;
            lhsQuantityType = this.getQuantityType();
            StringOrRefType rhsQuantityType;
            rhsQuantityType = that.getQuantityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityType", lhsQuantityType), LocatorUtils.property(thatLocator, "quantityType", rhsQuantityType), lhsQuantityType, rhsQuantityType)) {
                return false;
            }
        }
        {
            CodeType lhsCatalogSymbol;
            lhsCatalogSymbol = this.getCatalogSymbol();
            CodeType rhsCatalogSymbol;
            rhsCatalogSymbol = that.getCatalogSymbol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogSymbol", lhsCatalogSymbol), LocatorUtils.property(thatLocator, "catalogSymbol", rhsCatalogSymbol), lhsCatalogSymbol, rhsCatalogSymbol)) {
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
            StringOrRefType theQuantityType;
            theQuantityType = this.getQuantityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityType", theQuantityType), currentHashCode, theQuantityType);
        }
        {
            CodeType theCatalogSymbol;
            theCatalogSymbol = this.getCatalogSymbol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogSymbol", theCatalogSymbol), currentHashCode, theCatalogSymbol);
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
        if (draftCopy instanceof UnitDefinitionType) {
            final UnitDefinitionType copy = ((UnitDefinitionType) draftCopy);
            if (this.isSetQuantityType()) {
                StringOrRefType sourceQuantityType;
                sourceQuantityType = this.getQuantityType();
                StringOrRefType copyQuantityType = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "quantityType", sourceQuantityType), sourceQuantityType));
                copy.setQuantityType(copyQuantityType);
            } else {
                copy.quantityType = null;
            }
            if (this.isSetCatalogSymbol()) {
                CodeType sourceCatalogSymbol;
                sourceCatalogSymbol = this.getCatalogSymbol();
                CodeType copyCatalogSymbol = ((CodeType) strategy.copy(LocatorUtils.property(locator, "catalogSymbol", sourceCatalogSymbol), sourceCatalogSymbol));
                copy.setCatalogSymbol(copyCatalogSymbol);
            } else {
                copy.catalogSymbol = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new UnitDefinitionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof UnitDefinitionType) {
            final UnitDefinitionType target = this;
            final UnitDefinitionType leftObject = ((UnitDefinitionType) left);
            final UnitDefinitionType rightObject = ((UnitDefinitionType) right);
            {
                StringOrRefType lhsQuantityType;
                lhsQuantityType = leftObject.getQuantityType();
                StringOrRefType rhsQuantityType;
                rhsQuantityType = rightObject.getQuantityType();
                target.setQuantityType(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "quantityType", lhsQuantityType), LocatorUtils.property(rightLocator, "quantityType", rhsQuantityType), lhsQuantityType, rhsQuantityType)));
            }
            {
                CodeType lhsCatalogSymbol;
                lhsCatalogSymbol = leftObject.getCatalogSymbol();
                CodeType rhsCatalogSymbol;
                rhsCatalogSymbol = rightObject.getCatalogSymbol();
                target.setCatalogSymbol(((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "catalogSymbol", lhsCatalogSymbol), LocatorUtils.property(rightLocator, "catalogSymbol", rhsCatalogSymbol), lhsCatalogSymbol, rhsCatalogSymbol)));
            }
        }
    }

}
