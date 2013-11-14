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
 * The function or rule which defines the map from members of the domainSet to the range.  
 *       More functions will be added to this list
 * 
 * <p>Java-Klasse für CoverageFunctionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoverageFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}MappingRule"/>
 *         &lt;element ref="{http://www.opengis.net/gml}GridFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageFunctionType", propOrder = {
    "mappingRule",
    "gridFunction"
})
public class CoverageFunctionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "MappingRule")
    protected StringOrRefType mappingRule;
    @XmlElementRef(name = "GridFunction", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends GridFunctionType> gridFunction;

    /**
     * Ruft den Wert der mappingRule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getMappingRule() {
        return mappingRule;
    }

    /**
     * Legt den Wert der mappingRule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setMappingRule(StringOrRefType value) {
        this.mappingRule = value;
    }

    public boolean isSetMappingRule() {
        return (this.mappingRule!= null);
    }

    /**
     * Ruft den Wert der gridFunction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexMapType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     *     
     */
    public JAXBElement<? extends GridFunctionType> getGridFunction() {
        return gridFunction;
    }

    /**
     * Legt den Wert der gridFunction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexMapType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     *     
     */
    public void setGridFunction(JAXBElement<? extends GridFunctionType> value) {
        this.gridFunction = value;
    }

    public boolean isSetGridFunction() {
        return (this.gridFunction!= null);
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
            StringOrRefType theMappingRule;
            theMappingRule = this.getMappingRule();
            strategy.appendField(locator, this, "mappingRule", buffer, theMappingRule);
        }
        {
            JAXBElement<? extends GridFunctionType> theGridFunction;
            theGridFunction = this.getGridFunction();
            strategy.appendField(locator, this, "gridFunction", buffer, theGridFunction);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CoverageFunctionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CoverageFunctionType that = ((CoverageFunctionType) object);
        {
            StringOrRefType lhsMappingRule;
            lhsMappingRule = this.getMappingRule();
            StringOrRefType rhsMappingRule;
            rhsMappingRule = that.getMappingRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappingRule", lhsMappingRule), LocatorUtils.property(thatLocator, "mappingRule", rhsMappingRule), lhsMappingRule, rhsMappingRule)) {
                return false;
            }
        }
        {
            JAXBElement<? extends GridFunctionType> lhsGridFunction;
            lhsGridFunction = this.getGridFunction();
            JAXBElement<? extends GridFunctionType> rhsGridFunction;
            rhsGridFunction = that.getGridFunction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gridFunction", lhsGridFunction), LocatorUtils.property(thatLocator, "gridFunction", rhsGridFunction), lhsGridFunction, rhsGridFunction)) {
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
            StringOrRefType theMappingRule;
            theMappingRule = this.getMappingRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappingRule", theMappingRule), currentHashCode, theMappingRule);
        }
        {
            JAXBElement<? extends GridFunctionType> theGridFunction;
            theGridFunction = this.getGridFunction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gridFunction", theGridFunction), currentHashCode, theGridFunction);
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
        if (draftCopy instanceof CoverageFunctionType) {
            final CoverageFunctionType copy = ((CoverageFunctionType) draftCopy);
            if (this.isSetMappingRule()) {
                StringOrRefType sourceMappingRule;
                sourceMappingRule = this.getMappingRule();
                StringOrRefType copyMappingRule = ((StringOrRefType) strategy.copy(LocatorUtils.property(locator, "mappingRule", sourceMappingRule), sourceMappingRule));
                copy.setMappingRule(copyMappingRule);
            } else {
                copy.mappingRule = null;
            }
            if (this.isSetGridFunction()) {
                JAXBElement<? extends GridFunctionType> sourceGridFunction;
                sourceGridFunction = this.getGridFunction();
                @SuppressWarnings("unchecked")
                JAXBElement<? extends GridFunctionType> copyGridFunction = ((JAXBElement<? extends GridFunctionType> ) strategy.copy(LocatorUtils.property(locator, "gridFunction", sourceGridFunction), sourceGridFunction));
                copy.setGridFunction(copyGridFunction);
            } else {
                copy.gridFunction = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CoverageFunctionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof CoverageFunctionType) {
            final CoverageFunctionType target = this;
            final CoverageFunctionType leftObject = ((CoverageFunctionType) left);
            final CoverageFunctionType rightObject = ((CoverageFunctionType) right);
            {
                StringOrRefType lhsMappingRule;
                lhsMappingRule = leftObject.getMappingRule();
                StringOrRefType rhsMappingRule;
                rhsMappingRule = rightObject.getMappingRule();
                target.setMappingRule(((StringOrRefType) strategy.merge(LocatorUtils.property(leftLocator, "mappingRule", lhsMappingRule), LocatorUtils.property(rightLocator, "mappingRule", rhsMappingRule), lhsMappingRule, rhsMappingRule)));
            }
            {
                JAXBElement<? extends GridFunctionType> lhsGridFunction;
                lhsGridFunction = leftObject.getGridFunction();
                JAXBElement<? extends GridFunctionType> rhsGridFunction;
                rhsGridFunction = rightObject.getGridFunction();
                target.setGridFunction(((JAXBElement<? extends GridFunctionType> ) strategy.merge(LocatorUtils.property(leftLocator, "gridFunction", lhsGridFunction), LocatorUtils.property(rightLocator, "gridFunction", rhsGridFunction), lhsGridFunction, rhsGridFunction)));
            }
        }
    }

}
