//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:28:37 AM CET 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java-Klasse für ConventionalUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConventionalUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}UnitDefinitionType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}conversionToPreferredUnit"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}roughConversionToPreferredUnit"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}derivationUnitTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConventionalUnitType", propOrder = {
    "conversionToPreferredUnit",
    "roughConversionToPreferredUnit",
    "derivationUnitTerm"
})
public class ConventionalUnitType
    extends UnitDefinitionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected ConversionToPreferredUnitType conversionToPreferredUnit;
    protected ConversionToPreferredUnitType roughConversionToPreferredUnit;
    protected List<DerivationUnitTermType> derivationUnitTerm;

    /**
     * Ruft den Wert der conversionToPreferredUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public ConversionToPreferredUnitType getConversionToPreferredUnit() {
        return conversionToPreferredUnit;
    }

    /**
     * Legt den Wert der conversionToPreferredUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public void setConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        this.conversionToPreferredUnit = value;
    }

    public boolean isSetConversionToPreferredUnit() {
        return (this.conversionToPreferredUnit!= null);
    }

    /**
     * Ruft den Wert der roughConversionToPreferredUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public ConversionToPreferredUnitType getRoughConversionToPreferredUnit() {
        return roughConversionToPreferredUnit;
    }

    /**
     * Legt den Wert der roughConversionToPreferredUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        this.roughConversionToPreferredUnit = value;
    }

    public boolean isSetRoughConversionToPreferredUnit() {
        return (this.roughConversionToPreferredUnit!= null);
    }

    /**
     * Gets the value of the derivationUnitTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivationUnitTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivationUnitTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivationUnitTermType }
     * 
     * 
     */
    public List<DerivationUnitTermType> getDerivationUnitTerm() {
        if (derivationUnitTerm == null) {
            derivationUnitTerm = new ArrayList<DerivationUnitTermType>();
        }
        return this.derivationUnitTerm;
    }

    public boolean isSetDerivationUnitTerm() {
        return ((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()));
    }

    public void unsetDerivationUnitTerm() {
        this.derivationUnitTerm = null;
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
            ConversionToPreferredUnitType theConversionToPreferredUnit;
            theConversionToPreferredUnit = this.getConversionToPreferredUnit();
            strategy.appendField(locator, this, "conversionToPreferredUnit", buffer, theConversionToPreferredUnit);
        }
        {
            ConversionToPreferredUnitType theRoughConversionToPreferredUnit;
            theRoughConversionToPreferredUnit = this.getRoughConversionToPreferredUnit();
            strategy.appendField(locator, this, "roughConversionToPreferredUnit", buffer, theRoughConversionToPreferredUnit);
        }
        {
            List<DerivationUnitTermType> theDerivationUnitTerm;
            theDerivationUnitTerm = this.getDerivationUnitTerm();
            strategy.appendField(locator, this, "derivationUnitTerm", buffer, theDerivationUnitTerm);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConventionalUnitType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConventionalUnitType that = ((ConventionalUnitType) object);
        {
            ConversionToPreferredUnitType lhsConversionToPreferredUnit;
            lhsConversionToPreferredUnit = this.getConversionToPreferredUnit();
            ConversionToPreferredUnitType rhsConversionToPreferredUnit;
            rhsConversionToPreferredUnit = that.getConversionToPreferredUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conversionToPreferredUnit", lhsConversionToPreferredUnit), LocatorUtils.property(thatLocator, "conversionToPreferredUnit", rhsConversionToPreferredUnit), lhsConversionToPreferredUnit, rhsConversionToPreferredUnit)) {
                return false;
            }
        }
        {
            ConversionToPreferredUnitType lhsRoughConversionToPreferredUnit;
            lhsRoughConversionToPreferredUnit = this.getRoughConversionToPreferredUnit();
            ConversionToPreferredUnitType rhsRoughConversionToPreferredUnit;
            rhsRoughConversionToPreferredUnit = that.getRoughConversionToPreferredUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roughConversionToPreferredUnit", lhsRoughConversionToPreferredUnit), LocatorUtils.property(thatLocator, "roughConversionToPreferredUnit", rhsRoughConversionToPreferredUnit), lhsRoughConversionToPreferredUnit, rhsRoughConversionToPreferredUnit)) {
                return false;
            }
        }
        {
            List<DerivationUnitTermType> lhsDerivationUnitTerm;
            lhsDerivationUnitTerm = this.getDerivationUnitTerm();
            List<DerivationUnitTermType> rhsDerivationUnitTerm;
            rhsDerivationUnitTerm = that.getDerivationUnitTerm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "derivationUnitTerm", lhsDerivationUnitTerm), LocatorUtils.property(thatLocator, "derivationUnitTerm", rhsDerivationUnitTerm), lhsDerivationUnitTerm, rhsDerivationUnitTerm)) {
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
            ConversionToPreferredUnitType theConversionToPreferredUnit;
            theConversionToPreferredUnit = this.getConversionToPreferredUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conversionToPreferredUnit", theConversionToPreferredUnit), currentHashCode, theConversionToPreferredUnit);
        }
        {
            ConversionToPreferredUnitType theRoughConversionToPreferredUnit;
            theRoughConversionToPreferredUnit = this.getRoughConversionToPreferredUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roughConversionToPreferredUnit", theRoughConversionToPreferredUnit), currentHashCode, theRoughConversionToPreferredUnit);
        }
        {
            List<DerivationUnitTermType> theDerivationUnitTerm;
            theDerivationUnitTerm = this.getDerivationUnitTerm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "derivationUnitTerm", theDerivationUnitTerm), currentHashCode, theDerivationUnitTerm);
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
        if (draftCopy instanceof ConventionalUnitType) {
            final ConventionalUnitType copy = ((ConventionalUnitType) draftCopy);
            if (this.isSetConversionToPreferredUnit()) {
                ConversionToPreferredUnitType sourceConversionToPreferredUnit;
                sourceConversionToPreferredUnit = this.getConversionToPreferredUnit();
                ConversionToPreferredUnitType copyConversionToPreferredUnit = ((ConversionToPreferredUnitType) strategy.copy(LocatorUtils.property(locator, "conversionToPreferredUnit", sourceConversionToPreferredUnit), sourceConversionToPreferredUnit));
                copy.setConversionToPreferredUnit(copyConversionToPreferredUnit);
            } else {
                copy.conversionToPreferredUnit = null;
            }
            if (this.isSetRoughConversionToPreferredUnit()) {
                ConversionToPreferredUnitType sourceRoughConversionToPreferredUnit;
                sourceRoughConversionToPreferredUnit = this.getRoughConversionToPreferredUnit();
                ConversionToPreferredUnitType copyRoughConversionToPreferredUnit = ((ConversionToPreferredUnitType) strategy.copy(LocatorUtils.property(locator, "roughConversionToPreferredUnit", sourceRoughConversionToPreferredUnit), sourceRoughConversionToPreferredUnit));
                copy.setRoughConversionToPreferredUnit(copyRoughConversionToPreferredUnit);
            } else {
                copy.roughConversionToPreferredUnit = null;
            }
            if (this.isSetDerivationUnitTerm()) {
                List<DerivationUnitTermType> sourceDerivationUnitTerm;
                sourceDerivationUnitTerm = this.getDerivationUnitTerm();
                @SuppressWarnings("unchecked")
                List<DerivationUnitTermType> copyDerivationUnitTerm = ((List<DerivationUnitTermType> ) strategy.copy(LocatorUtils.property(locator, "derivationUnitTerm", sourceDerivationUnitTerm), sourceDerivationUnitTerm));
                copy.unsetDerivationUnitTerm();
                List<DerivationUnitTermType> uniqueDerivationUnitTerml = copy.getDerivationUnitTerm();
                uniqueDerivationUnitTerml.addAll(copyDerivationUnitTerm);
            } else {
                copy.unsetDerivationUnitTerm();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConventionalUnitType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ConventionalUnitType) {
            final ConventionalUnitType target = this;
            final ConventionalUnitType leftObject = ((ConventionalUnitType) left);
            final ConventionalUnitType rightObject = ((ConventionalUnitType) right);
            {
                ConversionToPreferredUnitType lhsConversionToPreferredUnit;
                lhsConversionToPreferredUnit = leftObject.getConversionToPreferredUnit();
                ConversionToPreferredUnitType rhsConversionToPreferredUnit;
                rhsConversionToPreferredUnit = rightObject.getConversionToPreferredUnit();
                target.setConversionToPreferredUnit(((ConversionToPreferredUnitType) strategy.merge(LocatorUtils.property(leftLocator, "conversionToPreferredUnit", lhsConversionToPreferredUnit), LocatorUtils.property(rightLocator, "conversionToPreferredUnit", rhsConversionToPreferredUnit), lhsConversionToPreferredUnit, rhsConversionToPreferredUnit)));
            }
            {
                ConversionToPreferredUnitType lhsRoughConversionToPreferredUnit;
                lhsRoughConversionToPreferredUnit = leftObject.getRoughConversionToPreferredUnit();
                ConversionToPreferredUnitType rhsRoughConversionToPreferredUnit;
                rhsRoughConversionToPreferredUnit = rightObject.getRoughConversionToPreferredUnit();
                target.setRoughConversionToPreferredUnit(((ConversionToPreferredUnitType) strategy.merge(LocatorUtils.property(leftLocator, "roughConversionToPreferredUnit", lhsRoughConversionToPreferredUnit), LocatorUtils.property(rightLocator, "roughConversionToPreferredUnit", rhsRoughConversionToPreferredUnit), lhsRoughConversionToPreferredUnit, rhsRoughConversionToPreferredUnit)));
            }
            {
                List<DerivationUnitTermType> lhsDerivationUnitTerm;
                lhsDerivationUnitTerm = leftObject.getDerivationUnitTerm();
                List<DerivationUnitTermType> rhsDerivationUnitTerm;
                rhsDerivationUnitTerm = rightObject.getDerivationUnitTerm();
                target.unsetDerivationUnitTerm();
                List<DerivationUnitTermType> uniqueDerivationUnitTerml = target.getDerivationUnitTerm();
                uniqueDerivationUnitTerml.addAll(((List<DerivationUnitTermType> ) strategy.merge(LocatorUtils.property(leftLocator, "derivationUnitTerm", lhsDerivationUnitTerm), LocatorUtils.property(rightLocator, "derivationUnitTerm", rhsDerivationUnitTerm), lhsDerivationUnitTerm, rhsDerivationUnitTerm)));
            }
        }
    }

    public void setDerivationUnitTerm(List<DerivationUnitTermType> value) {
        List<DerivationUnitTermType> draftl = this.getDerivationUnitTerm();
        draftl.addAll(value);
    }

}