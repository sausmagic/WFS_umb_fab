//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java-Klasse für GMLObjectTypeListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GMLObjectTypeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GMLObjectType" type="{http://www.opengis.net/wfs}GMLObjectTypeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLObjectTypeListType", propOrder = {
    "gmlObjectType"
})
public class GMLObjectTypeListType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "GMLObjectType", required = true)
    protected List<GMLObjectTypeType> gmlObjectType;

    /**
     * Gets the value of the gmlObjectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gmlObjectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGMLObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMLObjectTypeType }
     * 
     * 
     */
    public List<GMLObjectTypeType> getGMLObjectType() {
        if (gmlObjectType == null) {
            gmlObjectType = new ArrayList<GMLObjectTypeType>();
        }
        return this.gmlObjectType;
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
            List<GMLObjectTypeType> theGMLObjectType;
            theGMLObjectType = this.getGMLObjectType();
            strategy.appendField(locator, this, "gmlObjectType", buffer, theGMLObjectType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GMLObjectTypeListType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GMLObjectTypeListType that = ((GMLObjectTypeListType) object);
        {
            List<GMLObjectTypeType> lhsGMLObjectType;
            lhsGMLObjectType = this.getGMLObjectType();
            List<GMLObjectTypeType> rhsGMLObjectType;
            rhsGMLObjectType = that.getGMLObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gmlObjectType", lhsGMLObjectType), LocatorUtils.property(thatLocator, "gmlObjectType", rhsGMLObjectType), lhsGMLObjectType, rhsGMLObjectType)) {
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
            List<GMLObjectTypeType> theGMLObjectType;
            theGMLObjectType = this.getGMLObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gmlObjectType", theGMLObjectType), currentHashCode, theGMLObjectType);
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
        if (draftCopy instanceof GMLObjectTypeListType) {
            final GMLObjectTypeListType copy = ((GMLObjectTypeListType) draftCopy);
            if ((this.gmlObjectType!= null)&&(!this.gmlObjectType.isEmpty())) {
                List<GMLObjectTypeType> sourceGMLObjectType;
                sourceGMLObjectType = this.getGMLObjectType();
                @SuppressWarnings("unchecked")
                List<GMLObjectTypeType> copyGMLObjectType = ((List<GMLObjectTypeType> ) strategy.copy(LocatorUtils.property(locator, "gmlObjectType", sourceGMLObjectType), sourceGMLObjectType));
                copy.gmlObjectType = null;
                List<GMLObjectTypeType> uniqueGMLObjectTypel = copy.getGMLObjectType();
                uniqueGMLObjectTypel.addAll(copyGMLObjectType);
            } else {
                copy.gmlObjectType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GMLObjectTypeListType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof GMLObjectTypeListType) {
            final GMLObjectTypeListType target = this;
            final GMLObjectTypeListType leftObject = ((GMLObjectTypeListType) left);
            final GMLObjectTypeListType rightObject = ((GMLObjectTypeListType) right);
            {
                List<GMLObjectTypeType> lhsGMLObjectType;
                lhsGMLObjectType = leftObject.getGMLObjectType();
                List<GMLObjectTypeType> rhsGMLObjectType;
                rhsGMLObjectType = rightObject.getGMLObjectType();
                target.gmlObjectType = null;
                List<GMLObjectTypeType> uniqueGMLObjectTypel = target.getGMLObjectType();
                uniqueGMLObjectTypel.addAll(((List<GMLObjectTypeType> ) strategy.merge(LocatorUtils.property(leftLocator, "gmlObjectType", lhsGMLObjectType), LocatorUtils.property(rightLocator, "gmlObjectType", rhsGMLObjectType), lhsGMLObjectType, rhsGMLObjectType)));
            }
        }
    }

    public void setGMLObjectType(List<GMLObjectTypeType> value) {
        List<GMLObjectTypeType> draftl = this.getGMLObjectType();
        draftl.addAll(value);
    }

}
