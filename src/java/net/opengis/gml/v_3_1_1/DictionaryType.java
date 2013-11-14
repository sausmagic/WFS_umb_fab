//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * A non-abstract bag that is specialized for use as a dictionary which contains a set of definitions. These definitions are referenced from other places, in the same and different XML documents. In this restricted type, the inherited optional "description" element can be used for a description of this dictionary. The inherited optional "name" element can be used for the name(s) of this dictionary. The inherited "metaDataProperty" elements can be used to reference or contain more information about this dictionary. The inherited required gml:id attribute allows the dictionary to be referenced using this handle. 
 * 
 * <p>Java-Klasse für DictionaryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DictionaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}dictionaryEntry"/>
 *           &lt;element ref="{http://www.opengis.net/gml}indirectEntry"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DictionaryType", propOrder = {
    "dictionaryEntryOrIndirectEntry"
})
public class DictionaryType
    extends DefinitionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "dictionaryEntry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "indirectEntry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> dictionaryEntryOrIndirectEntry;

    /**
     * Gets the value of the dictionaryEntryOrIndirectEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictionaryEntryOrIndirectEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionaryEntryOrIndirectEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DictionaryEntryType }{@code >}
     * {@link JAXBElement }{@code <}{@link IndirectEntryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryEntryType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDictionaryEntryOrIndirectEntry() {
        if (dictionaryEntryOrIndirectEntry == null) {
            dictionaryEntryOrIndirectEntry = new ArrayList<JAXBElement<?>>();
        }
        return this.dictionaryEntryOrIndirectEntry;
    }

    public boolean isSetDictionaryEntryOrIndirectEntry() {
        return ((this.dictionaryEntryOrIndirectEntry!= null)&&(!this.dictionaryEntryOrIndirectEntry.isEmpty()));
    }

    public void unsetDictionaryEntryOrIndirectEntry() {
        this.dictionaryEntryOrIndirectEntry = null;
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
            List<JAXBElement<?>> theDictionaryEntryOrIndirectEntry;
            theDictionaryEntryOrIndirectEntry = this.getDictionaryEntryOrIndirectEntry();
            strategy.appendField(locator, this, "dictionaryEntryOrIndirectEntry", buffer, theDictionaryEntryOrIndirectEntry);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DictionaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DictionaryType that = ((DictionaryType) object);
        {
            List<JAXBElement<?>> lhsDictionaryEntryOrIndirectEntry;
            lhsDictionaryEntryOrIndirectEntry = this.getDictionaryEntryOrIndirectEntry();
            List<JAXBElement<?>> rhsDictionaryEntryOrIndirectEntry;
            rhsDictionaryEntryOrIndirectEntry = that.getDictionaryEntryOrIndirectEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dictionaryEntryOrIndirectEntry", lhsDictionaryEntryOrIndirectEntry), LocatorUtils.property(thatLocator, "dictionaryEntryOrIndirectEntry", rhsDictionaryEntryOrIndirectEntry), lhsDictionaryEntryOrIndirectEntry, rhsDictionaryEntryOrIndirectEntry)) {
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
            List<JAXBElement<?>> theDictionaryEntryOrIndirectEntry;
            theDictionaryEntryOrIndirectEntry = this.getDictionaryEntryOrIndirectEntry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dictionaryEntryOrIndirectEntry", theDictionaryEntryOrIndirectEntry), currentHashCode, theDictionaryEntryOrIndirectEntry);
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
        if (draftCopy instanceof DictionaryType) {
            final DictionaryType copy = ((DictionaryType) draftCopy);
            if (this.isSetDictionaryEntryOrIndirectEntry()) {
                List<JAXBElement<?>> sourceDictionaryEntryOrIndirectEntry;
                sourceDictionaryEntryOrIndirectEntry = this.getDictionaryEntryOrIndirectEntry();
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyDictionaryEntryOrIndirectEntry = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "dictionaryEntryOrIndirectEntry", sourceDictionaryEntryOrIndirectEntry), sourceDictionaryEntryOrIndirectEntry));
                copy.unsetDictionaryEntryOrIndirectEntry();
                List<JAXBElement<?>> uniqueDictionaryEntryOrIndirectEntryl = copy.getDictionaryEntryOrIndirectEntry();
                uniqueDictionaryEntryOrIndirectEntryl.addAll(copyDictionaryEntryOrIndirectEntry);
            } else {
                copy.unsetDictionaryEntryOrIndirectEntry();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DictionaryType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DictionaryType) {
            final DictionaryType target = this;
            final DictionaryType leftObject = ((DictionaryType) left);
            final DictionaryType rightObject = ((DictionaryType) right);
            {
                List<JAXBElement<?>> lhsDictionaryEntryOrIndirectEntry;
                lhsDictionaryEntryOrIndirectEntry = leftObject.getDictionaryEntryOrIndirectEntry();
                List<JAXBElement<?>> rhsDictionaryEntryOrIndirectEntry;
                rhsDictionaryEntryOrIndirectEntry = rightObject.getDictionaryEntryOrIndirectEntry();
                target.unsetDictionaryEntryOrIndirectEntry();
                List<JAXBElement<?>> uniqueDictionaryEntryOrIndirectEntryl = target.getDictionaryEntryOrIndirectEntry();
                uniqueDictionaryEntryOrIndirectEntryl.addAll(((List<JAXBElement<?>> ) strategy.merge(LocatorUtils.property(leftLocator, "dictionaryEntryOrIndirectEntry", lhsDictionaryEntryOrIndirectEntry), LocatorUtils.property(rightLocator, "dictionaryEntryOrIndirectEntry", rhsDictionaryEntryOrIndirectEntry), lhsDictionaryEntryOrIndirectEntry, rhsDictionaryEntryOrIndirectEntry)));
            }
        }
    }

    public void setDictionaryEntryOrIndirectEntry(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getDictionaryEntryOrIndirectEntry();
        draftl.addAll(value);
    }

}
