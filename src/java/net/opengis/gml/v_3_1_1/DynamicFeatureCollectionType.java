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
import javax.xml.bind.annotation.XmlElementRef;
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
 * A dynamic feature collection may possess a history and/or a timestamp.
 * 
 * <p>Java-Klasse für DynamicFeatureCollectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DynamicFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}FeatureCollectionType">
 *       &lt;group ref="{http://www.opengis.net/gml}dynamicProperties"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
    "validTime",
    "history",
    "dataSource"
})
public class DynamicFeatureCollectionType
    extends FeatureCollectionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected TimePrimitivePropertyType validTime;
    @XmlElementRef(name = "history", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends HistoryPropertyType> history;
    protected StringOrRefType dataSource;

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
     * Ruft den Wert der history-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends HistoryPropertyType> getHistory() {
        return history;
    }

    /**
     * Legt den Wert der history-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
     *     
     */
    public void setHistory(JAXBElement<? extends HistoryPropertyType> value) {
        this.history = value;
    }

    public boolean isSetHistory() {
        return (this.history!= null);
    }

    /**
     * Ruft den Wert der dataSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDataSource() {
        return dataSource;
    }

    /**
     * Legt den Wert der dataSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDataSource(StringOrRefType value) {
        this.dataSource = value;
    }

    public boolean isSetDataSource() {
        return (this.dataSource!= null);
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
            JAXBElement<? extends HistoryPropertyType> theHistory;
            theHistory = this.getHistory();
            strategy.appendField(locator, this, "history", buffer, theHistory);
        }
        {
            StringOrRefType theDataSource;
            theDataSource = this.getDataSource();
            strategy.appendField(locator, this, "dataSource", buffer, theDataSource);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DynamicFeatureCollectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DynamicFeatureCollectionType that = ((DynamicFeatureCollectionType) object);
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
            JAXBElement<? extends HistoryPropertyType> lhsHistory;
            lhsHistory = this.getHistory();
            JAXBElement<? extends HistoryPropertyType> rhsHistory;
            rhsHistory = that.getHistory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "history", lhsHistory), LocatorUtils.property(thatLocator, "history", rhsHistory), lhsHistory, rhsHistory)) {
                return false;
            }
        }
        {
            StringOrRefType lhsDataSource;
            lhsDataSource = this.getDataSource();
            StringOrRefType rhsDataSource;
            rhsDataSource = that.getDataSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSource", lhsDataSource), LocatorUtils.property(thatLocator, "dataSource", rhsDataSource), lhsDataSource, rhsDataSource)) {
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
            JAXBElement<? extends HistoryPropertyType> theHistory;
            theHistory = this.getHistory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "history", theHistory), currentHashCode, theHistory);
        }
        {
            StringOrRefType theDataSource;
            theDataSource = this.getDataSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSource", theDataSource), currentHashCode, theDataSource);
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
        if (draftCopy instanceof DynamicFeatureCollectionType) {
            final DynamicFeatureCollectionType copy = ((DynamicFeatureCollectionType) draftCopy);
            if (this.isSetValidTime()) {
                TimePrimitivePropertyType sourceValidTime;
                sourceValidTime = this.getValidTime();
                TimePrimitivePropertyType copyValidTime = ((TimePrimitivePropertyType) strategy.copy(LocatorUtils.property(locator, "validTime", sourceValidTime), sourceValidTime));
                copy.setValidTime(copyValidTime);
            } else {
                copy.validTime = null;
            }
            if (this.isSetHistory()) {
                JAXBElement<? extends HistoryPropertyType> sourceHistory;
                sourceHistory = this.getHistory();
                @SuppressWarnings("unchecked")
                JAXBElement<? extends HistoryPropertyType> copyHistory = ((JAXBElement<? extends HistoryPropertyType> ) strategy.copy(LocatorUtils.property(locator, "history", sourceHistory), sourceHistory));
                copy.setHistory(copyHistory);
            } else {
                copy.history = null;
            }
            if (this.isSetDataSource()) {
                StringOrRefType sourceDataSource;
                sourceDataSource = this.getDataSource();
                StringOrRefType copyDataSource = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "dataSource", sourceDataSource), sourceDataSource));
                copy.setDataSource(copyDataSource);
            } else {
                copy.dataSource = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DynamicFeatureCollectionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DynamicFeatureCollectionType) {
            final DynamicFeatureCollectionType target = this;
            final DynamicFeatureCollectionType leftObject = ((DynamicFeatureCollectionType) left);
            final DynamicFeatureCollectionType rightObject = ((DynamicFeatureCollectionType) right);
            {
                TimePrimitivePropertyType lhsValidTime;
                lhsValidTime = leftObject.getValidTime();
                TimePrimitivePropertyType rhsValidTime;
                rhsValidTime = rightObject.getValidTime();
                target.setValidTime(((TimePrimitivePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "validTime", lhsValidTime), LocatorUtils.property(rightLocator, "validTime", rhsValidTime), lhsValidTime, rhsValidTime)));
            }
            {
                JAXBElement<? extends HistoryPropertyType> lhsHistory;
                lhsHistory = leftObject.getHistory();
                JAXBElement<? extends HistoryPropertyType> rhsHistory;
                rhsHistory = rightObject.getHistory();
                target.setHistory(((JAXBElement<? extends HistoryPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "history", lhsHistory), LocatorUtils.property(rightLocator, "history", rhsHistory), lhsHistory, rhsHistory)));
            }
            {
                StringOrRefType lhsDataSource;
                lhsDataSource = leftObject.getDataSource();
                StringOrRefType rhsDataSource;
                rhsDataSource = rightObject.getDataSource();
                target.setDataSource(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "dataSource", lhsDataSource), LocatorUtils.property(rightLocator, "dataSource", rhsDataSource), lhsDataSource, rhsDataSource)));
            }
        }
    }

}
