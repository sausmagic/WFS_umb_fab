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
 * A MultiLineString is defined by one or more LineStrings, referenced through lineStringMember elements. Deprecated with GML version 3.0. Use MultiCurveType instead.
 * 
 * <p>Java-Klasse für MultiLineStringType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiLineStringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}lineStringMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLineStringType", propOrder = {
    "lineStringMember"
})
public class MultiLineStringType
    extends AbstractGeometricAggregateType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected List<LineStringPropertyType> lineStringMember;

    /**
     * Gets the value of the lineStringMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineStringMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineStringMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineStringPropertyType }
     * 
     * 
     */
    public List<LineStringPropertyType> getLineStringMember() {
        if (lineStringMember == null) {
            lineStringMember = new ArrayList<LineStringPropertyType>();
        }
        return this.lineStringMember;
    }

    public boolean isSetLineStringMember() {
        return ((this.lineStringMember!= null)&&(!this.lineStringMember.isEmpty()));
    }

    public void unsetLineStringMember() {
        this.lineStringMember = null;
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
            List<LineStringPropertyType> theLineStringMember;
            theLineStringMember = this.getLineStringMember();
            strategy.appendField(locator, this, "lineStringMember", buffer, theLineStringMember);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MultiLineStringType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MultiLineStringType that = ((MultiLineStringType) object);
        {
            List<LineStringPropertyType> lhsLineStringMember;
            lhsLineStringMember = this.getLineStringMember();
            List<LineStringPropertyType> rhsLineStringMember;
            rhsLineStringMember = that.getLineStringMember();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineStringMember", lhsLineStringMember), LocatorUtils.property(thatLocator, "lineStringMember", rhsLineStringMember), lhsLineStringMember, rhsLineStringMember)) {
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
            List<LineStringPropertyType> theLineStringMember;
            theLineStringMember = this.getLineStringMember();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineStringMember", theLineStringMember), currentHashCode, theLineStringMember);
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
        if (draftCopy instanceof MultiLineStringType) {
            final MultiLineStringType copy = ((MultiLineStringType) draftCopy);
            if (this.isSetLineStringMember()) {
                List<LineStringPropertyType> sourceLineStringMember;
                sourceLineStringMember = this.getLineStringMember();
                @SuppressWarnings("unchecked")
                List<LineStringPropertyType> copyLineStringMember = ((List<LineStringPropertyType> ) strategy.copy(LocatorUtils.property(locator, "lineStringMember", sourceLineStringMember), sourceLineStringMember));
                copy.unsetLineStringMember();
                List<LineStringPropertyType> uniqueLineStringMemberl = copy.getLineStringMember();
                uniqueLineStringMemberl.addAll(copyLineStringMember);
            } else {
                copy.unsetLineStringMember();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultiLineStringType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MultiLineStringType) {
            final MultiLineStringType target = this;
            final MultiLineStringType leftObject = ((MultiLineStringType) left);
            final MultiLineStringType rightObject = ((MultiLineStringType) right);
            {
                List<LineStringPropertyType> lhsLineStringMember;
                lhsLineStringMember = leftObject.getLineStringMember();
                List<LineStringPropertyType> rhsLineStringMember;
                rhsLineStringMember = rightObject.getLineStringMember();
                target.unsetLineStringMember();
                List<LineStringPropertyType> uniqueLineStringMemberl = target.getLineStringMember();
                uniqueLineStringMemberl.addAll(((List<LineStringPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "lineStringMember", lhsLineStringMember), LocatorUtils.property(rightLocator, "lineStringMember", rhsLineStringMember), lhsLineStringMember, rhsLineStringMember)));
            }
        }
    }

    public void setLineStringMember(List<LineStringPropertyType> value) {
        List<LineStringPropertyType> draftl = this.getLineStringMember();
        draftl.addAll(value);
    }

}
