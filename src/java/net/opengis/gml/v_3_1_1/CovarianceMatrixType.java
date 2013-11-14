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
 * Error estimate covariance matrix. 
 * 
 * <p>Java-Klasse für CovarianceMatrixType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CovarianceMatrixType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractPositionalAccuracyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}unitOfMeasure" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}includesElement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CovarianceMatrixType", propOrder = {
    "unitOfMeasure",
    "includesElement"
})
public class CovarianceMatrixType
    extends AbstractPositionalAccuracyType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<UnitOfMeasureType> unitOfMeasure;
    @XmlElement(required = true)
    protected List<CovarianceElementType> includesElement;

    /**
     * Ordered sequence of units of measure, corresponding to the row and column index numbers of the covariance matrix, starting with row and column 1 and ending with row/column N. Each unit of measure is for the ordinate reflected in the relevant row and column of the covariance matrix. Gets the value of the unitOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitOfMeasureType }
     * 
     * 
     */
    public List<UnitOfMeasureType> getUnitOfMeasure() {
        if (unitOfMeasure == null) {
            unitOfMeasure = new ArrayList<UnitOfMeasureType>();
        }
        return this.unitOfMeasure;
    }

    public boolean isSetUnitOfMeasure() {
        return ((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty()));
    }

    public void unsetUnitOfMeasure() {
        this.unitOfMeasure = null;
    }

    /**
     * Unordered set of elements in this covariance matrix. Because the covariance matrix is symmetrical, only the elements in the upper or lower diagonal part (including the main diagonal) of the matrix need to be specified. Any zero valued covariance elements can be omitted. Gets the value of the includesElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CovarianceElementType }
     * 
     * 
     */
    public List<CovarianceElementType> getIncludesElement() {
        if (includesElement == null) {
            includesElement = new ArrayList<CovarianceElementType>();
        }
        return this.includesElement;
    }

    public boolean isSetIncludesElement() {
        return ((this.includesElement!= null)&&(!this.includesElement.isEmpty()));
    }

    public void unsetIncludesElement() {
        this.includesElement = null;
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
            List<UnitOfMeasureType> theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure);
        }
        {
            List<CovarianceElementType> theIncludesElement;
            theIncludesElement = this.getIncludesElement();
            strategy.appendField(locator, this, "includesElement", buffer, theIncludesElement);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CovarianceMatrixType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CovarianceMatrixType that = ((CovarianceMatrixType) object);
        {
            List<UnitOfMeasureType> lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            List<UnitOfMeasureType> rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure)) {
                return false;
            }
        }
        {
            List<CovarianceElementType> lhsIncludesElement;
            lhsIncludesElement = this.getIncludesElement();
            List<CovarianceElementType> rhsIncludesElement;
            rhsIncludesElement = that.getIncludesElement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includesElement", lhsIncludesElement), LocatorUtils.property(thatLocator, "includesElement", rhsIncludesElement), lhsIncludesElement, rhsIncludesElement)) {
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
            List<UnitOfMeasureType> theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure);
        }
        {
            List<CovarianceElementType> theIncludesElement;
            theIncludesElement = this.getIncludesElement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includesElement", theIncludesElement), currentHashCode, theIncludesElement);
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
        if (draftCopy instanceof CovarianceMatrixType) {
            final CovarianceMatrixType copy = ((CovarianceMatrixType) draftCopy);
            if (this.isSetUnitOfMeasure()) {
                List<UnitOfMeasureType> sourceUnitOfMeasure;
                sourceUnitOfMeasure = this.getUnitOfMeasure();
                @SuppressWarnings("unchecked")
                List<UnitOfMeasureType> copyUnitOfMeasure = ((List<UnitOfMeasureType> ) strategy.copy(LocatorUtils.property(locator, "unitOfMeasure", sourceUnitOfMeasure), sourceUnitOfMeasure));
                copy.unsetUnitOfMeasure();
                List<UnitOfMeasureType> uniqueUnitOfMeasurel = copy.getUnitOfMeasure();
                uniqueUnitOfMeasurel.addAll(copyUnitOfMeasure);
            } else {
                copy.unsetUnitOfMeasure();
            }
            if (this.isSetIncludesElement()) {
                List<CovarianceElementType> sourceIncludesElement;
                sourceIncludesElement = this.getIncludesElement();
                @SuppressWarnings("unchecked")
                List<CovarianceElementType> copyIncludesElement = ((List<CovarianceElementType> ) strategy.copy(LocatorUtils.property(locator, "includesElement", sourceIncludesElement), sourceIncludesElement));
                copy.unsetIncludesElement();
                List<CovarianceElementType> uniqueIncludesElementl = copy.getIncludesElement();
                uniqueIncludesElementl.addAll(copyIncludesElement);
            } else {
                copy.unsetIncludesElement();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CovarianceMatrixType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CovarianceMatrixType) {
            final CovarianceMatrixType target = this;
            final CovarianceMatrixType leftObject = ((CovarianceMatrixType) left);
            final CovarianceMatrixType rightObject = ((CovarianceMatrixType) right);
            {
                List<UnitOfMeasureType> lhsUnitOfMeasure;
                lhsUnitOfMeasure = leftObject.getUnitOfMeasure();
                List<UnitOfMeasureType> rhsUnitOfMeasure;
                rhsUnitOfMeasure = rightObject.getUnitOfMeasure();
                target.unsetUnitOfMeasure();
                List<UnitOfMeasureType> uniqueUnitOfMeasurel = target.getUnitOfMeasure();
                uniqueUnitOfMeasurel.addAll(((List<UnitOfMeasureType> ) strategy.merge(LocatorUtils.property(leftLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(rightLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure)));
            }
            {
                List<CovarianceElementType> lhsIncludesElement;
                lhsIncludesElement = leftObject.getIncludesElement();
                List<CovarianceElementType> rhsIncludesElement;
                rhsIncludesElement = rightObject.getIncludesElement();
                target.unsetIncludesElement();
                List<CovarianceElementType> uniqueIncludesElementl = target.getIncludesElement();
                uniqueIncludesElementl.addAll(((List<CovarianceElementType> ) strategy.merge(LocatorUtils.property(leftLocator, "includesElement", lhsIncludesElement), LocatorUtils.property(rightLocator, "includesElement", rhsIncludesElement), lhsIncludesElement, rhsIncludesElement)));
            }
        }
    }

    public void setUnitOfMeasure(List<UnitOfMeasureType> value) {
        List<UnitOfMeasureType> draftl = this.getUnitOfMeasure();
        draftl.addAll(value);
    }

    public void setIncludesElement(List<CovarianceElementType> value) {
        List<CovarianceElementType> draftl = this.getIncludesElement();
        draftl.addAll(value);
    }

}
