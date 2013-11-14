//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java-Klasse für ObservationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObservationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}validTime"/>
 *         &lt;element ref="{http://www.opengis.net/gml}using" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}target" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}resultOf"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationType", propOrder = {
    "validTime",
    "using",
    "target",
    "resultOf"
})
@XmlSeeAlso({
    DirectedObservationType.class
})
public class ObservationType
    extends AbstractFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected TimePrimitivePropertyType validTime;
    protected FeaturePropertyType using;
    @XmlElementRef(name = "target", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<TargetPropertyType> target;
    @XmlElement(required = true)
    protected AssociationType resultOf;

    /**
     * Ruft den Wert der validTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * Legt den Wert der validTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    public boolean isSetValidTime() {
        return (this.validTime!= null);
    }

    /**
     * Ruft den Wert der using-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePropertyType }
     *     
     */
    public FeaturePropertyType getUsing() {
        return using;
    }

    /**
     * Legt den Wert der using-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePropertyType }
     *     
     */
    public void setUsing(FeaturePropertyType value) {
        this.using = value;
    }

    public boolean isSetUsing() {
        return (this.using!= null);
    }

    /**
     * Ruft den Wert der target-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public JAXBElement<TargetPropertyType> getTarget() {
        return target;
    }

    /**
     * Legt den Wert der target-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public void setTarget(JAXBElement<TargetPropertyType> value) {
        this.target = value;
    }

    public boolean isSetTarget() {
        return (this.target!= null);
    }

    /**
     * Ruft den Wert der resultOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssociationType }
     *     
     */
    public AssociationType getResultOf() {
        return resultOf;
    }

    /**
     * Legt den Wert der resultOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationType }
     *     
     */
    public void setResultOf(AssociationType value) {
        this.resultOf = value;
    }

    public boolean isSetResultOf() {
        return (this.resultOf!= null);
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
            TimePrimitivePropertyType theValidTime;
            theValidTime = this.getValidTime();
            strategy.appendField(locator, this, "validTime", buffer, theValidTime);
        }
        {
            FeaturePropertyType theUsing;
            theUsing = this.getUsing();
            strategy.appendField(locator, this, "using", buffer, theUsing);
        }
        {
            JAXBElement<TargetPropertyType> theTarget;
            theTarget = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theTarget);
        }
        {
            AssociationType theResultOf;
            theResultOf = this.getResultOf();
            strategy.appendField(locator, this, "resultOf", buffer, theResultOf);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ObservationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ObservationType that = ((ObservationType) object);
        {
            TimePrimitivePropertyType lhsValidTime;
            lhsValidTime = this.getValidTime();
            TimePrimitivePropertyType rhsValidTime;
            rhsValidTime = that.getValidTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validTime", lhsValidTime), LocatorUtils.property(thatLocator, "validTime", rhsValidTime), lhsValidTime, rhsValidTime)) {
                return false;
            }
        }
        {
            FeaturePropertyType lhsUsing;
            lhsUsing = this.getUsing();
            FeaturePropertyType rhsUsing;
            rhsUsing = that.getUsing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "using", lhsUsing), LocatorUtils.property(thatLocator, "using", rhsUsing), lhsUsing, rhsUsing)) {
                return false;
            }
        }
        {
            JAXBElement<TargetPropertyType> lhsTarget;
            lhsTarget = this.getTarget();
            JAXBElement<TargetPropertyType> rhsTarget;
            rhsTarget = that.getTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "target", lhsTarget), LocatorUtils.property(thatLocator, "target", rhsTarget), lhsTarget, rhsTarget)) {
                return false;
            }
        }
        {
            AssociationType lhsResultOf;
            lhsResultOf = this.getResultOf();
            AssociationType rhsResultOf;
            rhsResultOf = that.getResultOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultOf", lhsResultOf), LocatorUtils.property(thatLocator, "resultOf", rhsResultOf), lhsResultOf, rhsResultOf)) {
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
            TimePrimitivePropertyType theValidTime;
            theValidTime = this.getValidTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validTime", theValidTime), currentHashCode, theValidTime);
        }
        {
            FeaturePropertyType theUsing;
            theUsing = this.getUsing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "using", theUsing), currentHashCode, theUsing);
        }
        {
            JAXBElement<TargetPropertyType> theTarget;
            theTarget = this.getTarget();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "target", theTarget), currentHashCode, theTarget);
        }
        {
            AssociationType theResultOf;
            theResultOf = this.getResultOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultOf", theResultOf), currentHashCode, theResultOf);
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
        if (draftCopy instanceof ObservationType) {
            final ObservationType copy = ((ObservationType) draftCopy);
            if (this.isSetValidTime()) {
                TimePrimitivePropertyType sourceValidTime;
                sourceValidTime = this.getValidTime();
                TimePrimitivePropertyType copyValidTime = ((TimePrimitivePropertyType) strategy.copy(LocatorUtils.property(locator, "validTime", sourceValidTime), sourceValidTime));
                copy.setValidTime(copyValidTime);
            } else {
                copy.validTime = null;
            }
            if (this.isSetUsing()) {
                FeaturePropertyType sourceUsing;
                sourceUsing = this.getUsing();
                FeaturePropertyType copyUsing = ((FeaturePropertyType) strategy.copy(LocatorUtils.property(locator, "using", sourceUsing), sourceUsing));
                copy.setUsing(copyUsing);
            } else {
                copy.using = null;
            }
            if (this.isSetTarget()) {
                JAXBElement<TargetPropertyType> sourceTarget;
                sourceTarget = this.getTarget();
                @SuppressWarnings("unchecked")
                JAXBElement<TargetPropertyType> copyTarget = ((JAXBElement<TargetPropertyType> ) strategy.copy(LocatorUtils.property(locator, "target", sourceTarget), sourceTarget));
                copy.setTarget(copyTarget);
            } else {
                copy.target = null;
            }
            if (this.isSetResultOf()) {
                AssociationType sourceResultOf;
                sourceResultOf = this.getResultOf();
                AssociationType copyResultOf = ((AssociationType) strategy.copy(LocatorUtils.property(locator, "resultOf", sourceResultOf), sourceResultOf));
                copy.setResultOf(copyResultOf);
            } else {
                copy.resultOf = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ObservationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ObservationType) {
            final ObservationType target = this;
            final ObservationType leftObject = ((ObservationType) left);
            final ObservationType rightObject = ((ObservationType) right);
            {
                TimePrimitivePropertyType lhsValidTime;
                lhsValidTime = leftObject.getValidTime();
                TimePrimitivePropertyType rhsValidTime;
                rhsValidTime = rightObject.getValidTime();
                target.setValidTime(((TimePrimitivePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "validTime", lhsValidTime), LocatorUtils.property(rightLocator, "validTime", rhsValidTime), lhsValidTime, rhsValidTime)));
            }
            {
                FeaturePropertyType lhsUsing;
                lhsUsing = leftObject.getUsing();
                FeaturePropertyType rhsUsing;
                rhsUsing = rightObject.getUsing();
                target.setUsing(((FeaturePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "using", lhsUsing), LocatorUtils.property(rightLocator, "using", rhsUsing), lhsUsing, rhsUsing)));
            }
            {
                JAXBElement<TargetPropertyType> lhsTarget;
                lhsTarget = leftObject.getTarget();
                JAXBElement<TargetPropertyType> rhsTarget;
                rhsTarget = rightObject.getTarget();
                target.setTarget(((JAXBElement<TargetPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "target", lhsTarget), LocatorUtils.property(rightLocator, "target", rhsTarget), lhsTarget, rhsTarget)));
            }
            {
                AssociationType lhsResultOf;
                lhsResultOf = leftObject.getResultOf();
                AssociationType rhsResultOf;
                rhsResultOf = rightObject.getResultOf();
                target.setResultOf(((AssociationType) strategy.merge(LocatorUtils.property(leftLocator, "resultOf", lhsResultOf), LocatorUtils.property(rightLocator, "resultOf", rhsResultOf), lhsResultOf, rhsResultOf)));
            }
        }
    }

}
