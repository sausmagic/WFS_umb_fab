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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Direct representation of a temporal position. 
 *       Indeterminate time values are also allowed, as described in ISO 19108. The indeterminatePosition 
 *       attribute can be used alone or it can qualify a specific value for temporal position (e.g. before 
 *       2002-12, after 1019624400). 
 *       For time values that identify position within a calendar, the calendarEraName attribute provides 
 *       the name of the calendar era to which the date is referenced (e.g. the Meiji era of the Japanese calendar).
 * 
 * <p>Java-Klasse für TimePositionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimePositionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>TimePositionUnion">
 *       &lt;attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="#ISO-8601" />
 *       &lt;attribute name="calendarEraName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indeterminatePosition" type="{http://www.opengis.net/gml}TimeIndeterminateValueType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePositionType", propOrder = {
    "value"
})
public class TimePositionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlValue
    protected List<String> value;
    @XmlAttribute(name = "frame")
    @XmlSchemaType(name = "anyURI")
    protected String frame;
    @XmlAttribute(name = "calendarEraName")
    protected String calendarEraName;
    @XmlAttribute(name = "indeterminatePosition")
    protected TimeIndeterminateValueType indeterminatePosition;

    /**
     * The ISO 19108:2002 hierarchy of subtypes for temporal position are collapsed 
     *       by defining a union of XML Schema simple types for indicating temporal position relative 
     *       to a specific reference system. 
     *       
     *       Dates and dateTime may be indicated with varying degrees of precision.  
     *       dateTime by itself does not allow right-truncation, except for fractions of seconds. 
     *       When used with non-Gregorian calendars based on years, months, days, 
     *       the same lexical representation should still be used, with leading zeros added if the 
     *       year value would otherwise have fewer than four digits.  
     *       
     *       An ordinal position may be referenced via URI identifying the definition of an ordinal era.  
     *       
     *       A time coordinate value is indicated as a decimal (e.g. UNIX time, GPS calendar).Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
    }

    /**
     * Ruft den Wert der frame-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        if (frame == null) {
            return "#ISO-8601";
        } else {
            return frame;
        }
    }

    /**
     * Legt den Wert der frame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    public boolean isSetFrame() {
        return (this.frame!= null);
    }

    /**
     * Ruft den Wert der calendarEraName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarEraName() {
        return calendarEraName;
    }

    /**
     * Legt den Wert der calendarEraName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarEraName(String value) {
        this.calendarEraName = value;
    }

    public boolean isSetCalendarEraName() {
        return (this.calendarEraName!= null);
    }

    /**
     * Ruft den Wert der indeterminatePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIndeterminateValueType }
     *     
     */
    public TimeIndeterminateValueType getIndeterminatePosition() {
        return indeterminatePosition;
    }

    /**
     * Legt den Wert der indeterminatePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIndeterminateValueType }
     *     
     */
    public void setIndeterminatePosition(TimeIndeterminateValueType value) {
        this.indeterminatePosition = value;
    }

    public boolean isSetIndeterminatePosition() {
        return (this.indeterminatePosition!= null);
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
            List<String> theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theFrame;
            theFrame = this.getFrame();
            strategy.appendField(locator, this, "frame", buffer, theFrame);
        }
        {
            String theCalendarEraName;
            theCalendarEraName = this.getCalendarEraName();
            strategy.appendField(locator, this, "calendarEraName", buffer, theCalendarEraName);
        }
        {
            TimeIndeterminateValueType theIndeterminatePosition;
            theIndeterminatePosition = this.getIndeterminatePosition();
            strategy.appendField(locator, this, "indeterminatePosition", buffer, theIndeterminatePosition);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimePositionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimePositionType that = ((TimePositionType) object);
        {
            List<String> lhsValue;
            lhsValue = this.getValue();
            List<String> rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsFrame;
            lhsFrame = this.getFrame();
            String rhsFrame;
            rhsFrame = that.getFrame();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frame", lhsFrame), LocatorUtils.property(thatLocator, "frame", rhsFrame), lhsFrame, rhsFrame)) {
                return false;
            }
        }
        {
            String lhsCalendarEraName;
            lhsCalendarEraName = this.getCalendarEraName();
            String rhsCalendarEraName;
            rhsCalendarEraName = that.getCalendarEraName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calendarEraName", lhsCalendarEraName), LocatorUtils.property(thatLocator, "calendarEraName", rhsCalendarEraName), lhsCalendarEraName, rhsCalendarEraName)) {
                return false;
            }
        }
        {
            TimeIndeterminateValueType lhsIndeterminatePosition;
            lhsIndeterminatePosition = this.getIndeterminatePosition();
            TimeIndeterminateValueType rhsIndeterminatePosition;
            rhsIndeterminatePosition = that.getIndeterminatePosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indeterminatePosition", lhsIndeterminatePosition), LocatorUtils.property(thatLocator, "indeterminatePosition", rhsIndeterminatePosition), lhsIndeterminatePosition, rhsIndeterminatePosition)) {
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
            List<String> theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theFrame;
            theFrame = this.getFrame();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frame", theFrame), currentHashCode, theFrame);
        }
        {
            String theCalendarEraName;
            theCalendarEraName = this.getCalendarEraName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calendarEraName", theCalendarEraName), currentHashCode, theCalendarEraName);
        }
        {
            TimeIndeterminateValueType theIndeterminatePosition;
            theIndeterminatePosition = this.getIndeterminatePosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indeterminatePosition", theIndeterminatePosition), currentHashCode, theIndeterminatePosition);
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
        if (draftCopy instanceof TimePositionType) {
            final TimePositionType copy = ((TimePositionType) draftCopy);
            if (this.isSetValue()) {
                List<String> sourceValue;
                sourceValue = this.getValue();
                @SuppressWarnings("unchecked")
                List<String> copyValue = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.unsetValue();
                List<String> uniqueValuel = copy.getValue();
                uniqueValuel.addAll(copyValue);
            } else {
                copy.unsetValue();
            }
            if (this.isSetFrame()) {
                String sourceFrame;
                sourceFrame = this.getFrame();
                String copyFrame = ((String) strategy.copy(LocatorUtils.property(locator, "frame", sourceFrame), sourceFrame));
                copy.setFrame(copyFrame);
            } else {
                copy.frame = null;
            }
            if (this.isSetCalendarEraName()) {
                String sourceCalendarEraName;
                sourceCalendarEraName = this.getCalendarEraName();
                String copyCalendarEraName = ((String) strategy.copy(LocatorUtils.property(locator, "calendarEraName", sourceCalendarEraName), sourceCalendarEraName));
                copy.setCalendarEraName(copyCalendarEraName);
            } else {
                copy.calendarEraName = null;
            }
            if (this.isSetIndeterminatePosition()) {
                TimeIndeterminateValueType sourceIndeterminatePosition;
                sourceIndeterminatePosition = this.getIndeterminatePosition();
                TimeIndeterminateValueType copyIndeterminatePosition = ((TimeIndeterminateValueType) strategy.copy(LocatorUtils.property(locator, "indeterminatePosition", sourceIndeterminatePosition), sourceIndeterminatePosition));
                copy.setIndeterminatePosition(copyIndeterminatePosition);
            } else {
                copy.indeterminatePosition = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimePositionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof TimePositionType) {
            final TimePositionType target = this;
            final TimePositionType leftObject = ((TimePositionType) left);
            final TimePositionType rightObject = ((TimePositionType) right);
            {
                List<String> lhsValue;
                lhsValue = leftObject.getValue();
                List<String> rhsValue;
                rhsValue = rightObject.getValue();
                target.unsetValue();
                List<String> uniqueValuel = target.getValue();
                uniqueValuel.addAll(((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue)));
            }
            {
                String lhsFrame;
                lhsFrame = leftObject.getFrame();
                String rhsFrame;
                rhsFrame = rightObject.getFrame();
                target.setFrame(((String) strategy.merge(LocatorUtils.property(leftLocator, "frame", lhsFrame), LocatorUtils.property(rightLocator, "frame", rhsFrame), lhsFrame, rhsFrame)));
            }
            {
                String lhsCalendarEraName;
                lhsCalendarEraName = leftObject.getCalendarEraName();
                String rhsCalendarEraName;
                rhsCalendarEraName = rightObject.getCalendarEraName();
                target.setCalendarEraName(((String) strategy.merge(LocatorUtils.property(leftLocator, "calendarEraName", lhsCalendarEraName), LocatorUtils.property(rightLocator, "calendarEraName", rhsCalendarEraName), lhsCalendarEraName, rhsCalendarEraName)));
            }
            {
                TimeIndeterminateValueType lhsIndeterminatePosition;
                lhsIndeterminatePosition = leftObject.getIndeterminatePosition();
                TimeIndeterminateValueType rhsIndeterminatePosition;
                rhsIndeterminatePosition = rightObject.getIndeterminatePosition();
                target.setIndeterminatePosition(((TimeIndeterminateValueType) strategy.merge(LocatorUtils.property(leftLocator, "indeterminatePosition", lhsIndeterminatePosition), LocatorUtils.property(rightLocator, "indeterminatePosition", rhsIndeterminatePosition), lhsIndeterminatePosition, rhsIndeterminatePosition)));
            }
        }
    }

    public void setValue(List<String> value) {
        List<String> draftl = this.getValue();
        draftl.addAll(value);
    }

}
