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
import javax.xml.bind.annotation.XmlAnyElement;
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
import org.w3c.dom.Element;


/**
 * A base for derived types used to specify complex types containing an array of objects, by unspecified UML association - either composition or aggregation.  An instance of this type contains elements representing Objects.
 * 
 * Ideally this type would be derived by extension of AssociationType.  
 * However, this leads to a non-deterministic content model, since both the base and the extension have minOccurs="0", and is thus prohibited in XML Schema.
 * 
 * <p>Java-Klasse für ArrayAssociationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayAssociationType", propOrder = {
    "object"
})
public class ArrayAssociationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAnyElement
    protected List<Element> object;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getObject() {
        if (object == null) {
            object = new ArrayList<Element>();
        }
        return this.object;
    }

    public boolean isSetObject() {
        return ((this.object!= null)&&(!this.object.isEmpty()));
    }

    public void unsetObject() {
        this.object = null;
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
            List<Element> theObject;
            theObject = this.getObject();
            strategy.appendField(locator, this, "object", buffer, theObject);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayAssociationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayAssociationType that = ((ArrayAssociationType) object);
        {
            List<Element> lhsObject;
            lhsObject = this.getObject();
            List<Element> rhsObject;
            rhsObject = that.getObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "object", lhsObject), LocatorUtils.property(thatLocator, "object", rhsObject), lhsObject, rhsObject)) {
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
            List<Element> theObject;
            theObject = this.getObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "object", theObject), currentHashCode, theObject);
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
        if (draftCopy instanceof ArrayAssociationType) {
            final ArrayAssociationType copy = ((ArrayAssociationType) draftCopy);
            if (this.isSetObject()) {
                List<Element> sourceObject;
                sourceObject = this.getObject();
                @SuppressWarnings("unchecked")
                List<Element> copyObject = ((List<Element> ) strategy.copy(LocatorUtils.property(locator, "object", sourceObject), sourceObject));
                copy.unsetObject();
                List<Element> uniqueObjectl = copy.getObject();
                uniqueObjectl.addAll(copyObject);
            } else {
                copy.unsetObject();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ArrayAssociationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof ArrayAssociationType) {
            final ArrayAssociationType target = this;
            final ArrayAssociationType leftObject = ((ArrayAssociationType) left);
            final ArrayAssociationType rightObject = ((ArrayAssociationType) right);
            {
                List<Element> lhsObject;
                lhsObject = leftObject.getObject();
                List<Element> rhsObject;
                rhsObject = rightObject.getObject();
                target.unsetObject();
                List<Element> uniqueObjectl = target.getObject();
                uniqueObjectl.addAll(((List<Element> ) strategy.merge(LocatorUtils.property(leftLocator, "object", lhsObject), LocatorUtils.property(rightLocator, "object", rhsObject), lhsObject, rhsObject)));
            }
        }
    }

    public void setObject(List<Element> value) {
        List<Element> draftl = this.getObject();
        draftl.addAll(value);
    }

}
