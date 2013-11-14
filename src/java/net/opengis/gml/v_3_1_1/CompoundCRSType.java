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
 * A coordinate reference system describing the position of points through two or more independent coordinate reference systems. 
 * 
 * <p>Java-Klasse für CompoundCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompoundCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}includesCRS" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundCRSType", propOrder = {
    "includesCRS"
})
public class CompoundCRSType
    extends AbstractReferenceSystemType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<CoordinateReferenceSystemRefType> includesCRS;

    /**
     * Ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. Gets the value of the includesCRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesCRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesCRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateReferenceSystemRefType }
     * 
     * 
     */
    public List<CoordinateReferenceSystemRefType> getIncludesCRS() {
        if (includesCRS == null) {
            includesCRS = new ArrayList<CoordinateReferenceSystemRefType>();
        }
        return this.includesCRS;
    }

    public boolean isSetIncludesCRS() {
        return ((this.includesCRS!= null)&&(!this.includesCRS.isEmpty()));
    }

    public void unsetIncludesCRS() {
        this.includesCRS = null;
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
            List<CoordinateReferenceSystemRefType> theIncludesCRS;
            theIncludesCRS = this.getIncludesCRS();
            strategy.appendField(locator, this, "includesCRS", buffer, theIncludesCRS);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompoundCRSType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompoundCRSType that = ((CompoundCRSType) object);
        {
            List<CoordinateReferenceSystemRefType> lhsIncludesCRS;
            lhsIncludesCRS = this.getIncludesCRS();
            List<CoordinateReferenceSystemRefType> rhsIncludesCRS;
            rhsIncludesCRS = that.getIncludesCRS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includesCRS", lhsIncludesCRS), LocatorUtils.property(thatLocator, "includesCRS", rhsIncludesCRS), lhsIncludesCRS, rhsIncludesCRS)) {
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
            List<CoordinateReferenceSystemRefType> theIncludesCRS;
            theIncludesCRS = this.getIncludesCRS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includesCRS", theIncludesCRS), currentHashCode, theIncludesCRS);
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
        if (draftCopy instanceof CompoundCRSType) {
            final CompoundCRSType copy = ((CompoundCRSType) draftCopy);
            if (this.isSetIncludesCRS()) {
                List<CoordinateReferenceSystemRefType> sourceIncludesCRS;
                sourceIncludesCRS = this.getIncludesCRS();
                @SuppressWarnings("unchecked")
                List<CoordinateReferenceSystemRefType> copyIncludesCRS = ((List<CoordinateReferenceSystemRefType> ) strategy.copy(LocatorUtils.property(locator, "includesCRS", sourceIncludesCRS), sourceIncludesCRS));
                copy.unsetIncludesCRS();
                List<CoordinateReferenceSystemRefType> uniqueIncludesCRSl = copy.getIncludesCRS();
                uniqueIncludesCRSl.addAll(copyIncludesCRS);
            } else {
                copy.unsetIncludesCRS();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CompoundCRSType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CompoundCRSType) {
            final CompoundCRSType target = this;
            final CompoundCRSType leftObject = ((CompoundCRSType) left);
            final CompoundCRSType rightObject = ((CompoundCRSType) right);
            {
                List<CoordinateReferenceSystemRefType> lhsIncludesCRS;
                lhsIncludesCRS = leftObject.getIncludesCRS();
                List<CoordinateReferenceSystemRefType> rhsIncludesCRS;
                rhsIncludesCRS = rightObject.getIncludesCRS();
                target.unsetIncludesCRS();
                List<CoordinateReferenceSystemRefType> uniqueIncludesCRSl = target.getIncludesCRS();
                uniqueIncludesCRSl.addAll(((List<CoordinateReferenceSystemRefType> ) strategy.merge(LocatorUtils.property(leftLocator, "includesCRS", lhsIncludesCRS), LocatorUtils.property(rightLocator, "includesCRS", rhsIncludesCRS), lhsIncludesCRS, rhsIncludesCRS)));
            }
        }
    }

    public void setIncludesCRS(List<CoordinateReferenceSystemRefType> value) {
        List<CoordinateReferenceSystemRefType> draftl = this.getIncludesCRS();
        draftl.addAll(value);
    }

}
