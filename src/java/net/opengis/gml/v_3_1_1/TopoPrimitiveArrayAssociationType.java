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
 * This type supports embedding an array of topological primitives in a TopoComplex
 * 
 * <p>Java-Klasse für TopoPrimitiveArrayAssociationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoPrimitiveArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/gml}_TopoPrimitive"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPrimitiveArrayAssociationType", propOrder = {
    "topoPrimitive"
})
public class TopoPrimitiveArrayAssociationType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_TopoPrimitive", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractTopoPrimitiveType>> topoPrimitive;

    /**
     * Gets the value of the topoPrimitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topoPrimitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoPrimitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractTopoPrimitiveType>> getTopoPrimitive() {
        if (topoPrimitive == null) {
            topoPrimitive = new ArrayList<JAXBElement<? extends AbstractTopoPrimitiveType>>();
        }
        return this.topoPrimitive;
    }

    public boolean isSetTopoPrimitive() {
        return ((this.topoPrimitive!= null)&&(!this.topoPrimitive.isEmpty()));
    }

    public void unsetTopoPrimitive() {
        this.topoPrimitive = null;
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
            List<JAXBElement<? extends AbstractTopoPrimitiveType>> theTopoPrimitive;
            theTopoPrimitive = this.getTopoPrimitive();
            strategy.appendField(locator, this, "topoPrimitive", buffer, theTopoPrimitive);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TopoPrimitiveArrayAssociationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TopoPrimitiveArrayAssociationType that = ((TopoPrimitiveArrayAssociationType) object);
        {
            List<JAXBElement<? extends AbstractTopoPrimitiveType>> lhsTopoPrimitive;
            lhsTopoPrimitive = this.getTopoPrimitive();
            List<JAXBElement<? extends AbstractTopoPrimitiveType>> rhsTopoPrimitive;
            rhsTopoPrimitive = that.getTopoPrimitive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topoPrimitive", lhsTopoPrimitive), LocatorUtils.property(thatLocator, "topoPrimitive", rhsTopoPrimitive), lhsTopoPrimitive, rhsTopoPrimitive)) {
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
            List<JAXBElement<? extends AbstractTopoPrimitiveType>> theTopoPrimitive;
            theTopoPrimitive = this.getTopoPrimitive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topoPrimitive", theTopoPrimitive), currentHashCode, theTopoPrimitive);
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
        if (draftCopy instanceof TopoPrimitiveArrayAssociationType) {
            final TopoPrimitiveArrayAssociationType copy = ((TopoPrimitiveArrayAssociationType) draftCopy);
            if (this.isSetTopoPrimitive()) {
                List<JAXBElement<? extends AbstractTopoPrimitiveType>> sourceTopoPrimitive;
                sourceTopoPrimitive = this.getTopoPrimitive();
                @SuppressWarnings("unchecked")
                List<JAXBElement<? extends AbstractTopoPrimitiveType>> copyTopoPrimitive = ((List<JAXBElement<? extends AbstractTopoPrimitiveType>> ) strategy.copy(LocatorUtils.property(locator, "topoPrimitive", sourceTopoPrimitive), sourceTopoPrimitive));
                copy.unsetTopoPrimitive();
                List<JAXBElement<? extends AbstractTopoPrimitiveType>> uniqueTopoPrimitivel = copy.getTopoPrimitive();
                uniqueTopoPrimitivel.addAll(copyTopoPrimitive);
            } else {
                copy.unsetTopoPrimitive();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TopoPrimitiveArrayAssociationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof TopoPrimitiveArrayAssociationType) {
            final TopoPrimitiveArrayAssociationType target = this;
            final TopoPrimitiveArrayAssociationType leftObject = ((TopoPrimitiveArrayAssociationType) left);
            final TopoPrimitiveArrayAssociationType rightObject = ((TopoPrimitiveArrayAssociationType) right);
            {
                List<JAXBElement<? extends AbstractTopoPrimitiveType>> lhsTopoPrimitive;
                lhsTopoPrimitive = leftObject.getTopoPrimitive();
                List<JAXBElement<? extends AbstractTopoPrimitiveType>> rhsTopoPrimitive;
                rhsTopoPrimitive = rightObject.getTopoPrimitive();
                target.unsetTopoPrimitive();
                List<JAXBElement<? extends AbstractTopoPrimitiveType>> uniqueTopoPrimitivel = target.getTopoPrimitive();
                uniqueTopoPrimitivel.addAll(((List<JAXBElement<? extends AbstractTopoPrimitiveType>> ) strategy.merge(LocatorUtils.property(leftLocator, "topoPrimitive", lhsTopoPrimitive), LocatorUtils.property(rightLocator, "topoPrimitive", rhsTopoPrimitive), lhsTopoPrimitive, rhsTopoPrimitive)));
            }
        }
    }

    public void setTopoPrimitive(List<JAXBElement<? extends AbstractTopoPrimitiveType>> value) {
        List<JAXBElement<? extends AbstractTopoPrimitiveType>> draftl = this.getTopoPrimitive();
        draftl.addAll(value);
    }

}
