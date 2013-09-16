//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.AbstractFeatureCollectionType;
import net.opengis.gml.v_3_1_1.AbstractFeatureType;
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
 * 
 *             An Insert element may contain a feature collection or one 
 *             or more feature instances to be inserted into the 
 *             repository.
 *          
 * 
 * <p>Java-Klasse für InsertElementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InsertElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Feature" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idgen" type="{http://www.opengis.net/wfs}IdentifierGenerationOptionType" default="GenerateNew" />
 *       &lt;attribute name="handle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputFormat" type="{http://www.w3.org/2001/XMLSchema}string" default="text/xml; subtype=gml/3.1.1" />
 *       &lt;attribute name="srsName" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertElementType", propOrder = {
    "feature"
})
public class InsertElementType implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "_Feature", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected List<JAXBElement<?>> feature;
    @XmlAttribute(name = "idgen")
    protected IdentifierGenerationOptionType idgen;
    @XmlAttribute(name = "handle")
    protected String handle;
    @XmlAttribute(name = "inputFormat")
    protected String inputFormat;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFeature() {
        if (feature == null) {
            feature = new ArrayList<JAXBElement<?>>();
        }
        return this.feature;
    }

    /**
     * Ruft den Wert der idgen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierGenerationOptionType }
     *     
     */
    public IdentifierGenerationOptionType getIdgen() {
        if (idgen == null) {
            return IdentifierGenerationOptionType.GENERATE_NEW;
        } else {
            return idgen;
        }
    }

    /**
     * Legt den Wert der idgen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierGenerationOptionType }
     *     
     */
    public void setIdgen(IdentifierGenerationOptionType value) {
        this.idgen = value;
    }

    /**
     * Ruft den Wert der handle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandle() {
        return handle;
    }

    /**
     * Legt den Wert der handle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandle(String value) {
        this.handle = value;
    }

    /**
     * Ruft den Wert der inputFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFormat() {
        if (inputFormat == null) {
            return "text/xml; subtype=gml/3.1.1";
        } else {
            return inputFormat;
        }
    }

    /**
     * Legt den Wert der inputFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFormat(String value) {
        this.inputFormat = value;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
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
            List<JAXBElement<?>> theFeature;
            theFeature = this.getFeature();
            strategy.appendField(locator, this, "feature", buffer, theFeature);
        }
        {
            IdentifierGenerationOptionType theIdgen;
            theIdgen = this.getIdgen();
            strategy.appendField(locator, this, "idgen", buffer, theIdgen);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            strategy.appendField(locator, this, "handle", buffer, theHandle);
        }
        {
            String theInputFormat;
            theInputFormat = this.getInputFormat();
            strategy.appendField(locator, this, "inputFormat", buffer, theInputFormat);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theSrsName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InsertElementType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InsertElementType that = ((InsertElementType) object);
        {
            List<JAXBElement<?>> lhsFeature;
            lhsFeature = this.getFeature();
            List<JAXBElement<?>> rhsFeature;
            rhsFeature = that.getFeature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feature", lhsFeature), LocatorUtils.property(thatLocator, "feature", rhsFeature), lhsFeature, rhsFeature)) {
                return false;
            }
        }
        {
            IdentifierGenerationOptionType lhsIdgen;
            lhsIdgen = this.getIdgen();
            IdentifierGenerationOptionType rhsIdgen;
            rhsIdgen = that.getIdgen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idgen", lhsIdgen), LocatorUtils.property(thatLocator, "idgen", rhsIdgen), lhsIdgen, rhsIdgen)) {
                return false;
            }
        }
        {
            String lhsHandle;
            lhsHandle = this.getHandle();
            String rhsHandle;
            rhsHandle = that.getHandle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handle", lhsHandle), LocatorUtils.property(thatLocator, "handle", rhsHandle), lhsHandle, rhsHandle)) {
                return false;
            }
        }
        {
            String lhsInputFormat;
            lhsInputFormat = this.getInputFormat();
            String rhsInputFormat;
            rhsInputFormat = that.getInputFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputFormat", lhsInputFormat), LocatorUtils.property(thatLocator, "inputFormat", rhsInputFormat), lhsInputFormat, rhsInputFormat)) {
                return false;
            }
        }
        {
            String lhsSrsName;
            lhsSrsName = this.getSrsName();
            String rhsSrsName;
            rhsSrsName = that.getSrsName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srsName", lhsSrsName), LocatorUtils.property(thatLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)) {
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
            List<JAXBElement<?>> theFeature;
            theFeature = this.getFeature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feature", theFeature), currentHashCode, theFeature);
        }
        {
            IdentifierGenerationOptionType theIdgen;
            theIdgen = this.getIdgen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idgen", theIdgen), currentHashCode, theIdgen);
        }
        {
            String theHandle;
            theHandle = this.getHandle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handle", theHandle), currentHashCode, theHandle);
        }
        {
            String theInputFormat;
            theInputFormat = this.getInputFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputFormat", theInputFormat), currentHashCode, theInputFormat);
        }
        {
            String theSrsName;
            theSrsName = this.getSrsName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srsName", theSrsName), currentHashCode, theSrsName);
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
        if (draftCopy instanceof InsertElementType) {
            final InsertElementType copy = ((InsertElementType) draftCopy);
            if ((this.feature!= null)&&(!this.feature.isEmpty())) {
                List<JAXBElement<?>> sourceFeature;
                sourceFeature = this.getFeature();
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyFeature = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "feature", sourceFeature), sourceFeature));
                copy.feature = null;
                List<JAXBElement<?>> uniqueFeaturel = copy.getFeature();
                uniqueFeaturel.addAll(copyFeature);
            } else {
                copy.feature = null;
            }
            if (this.idgen!= null) {
                IdentifierGenerationOptionType sourceIdgen;
                sourceIdgen = this.getIdgen();
                IdentifierGenerationOptionType copyIdgen = ((IdentifierGenerationOptionType) strategy.copy(LocatorUtils.property(locator, "idgen", sourceIdgen), sourceIdgen));
                copy.setIdgen(copyIdgen);
            } else {
                copy.idgen = null;
            }
            if (this.handle!= null) {
                String sourceHandle;
                sourceHandle = this.getHandle();
                String copyHandle = ((String) strategy.copy(LocatorUtils.property(locator, "handle", sourceHandle), sourceHandle));
                copy.setHandle(copyHandle);
            } else {
                copy.handle = null;
            }
            if (this.inputFormat!= null) {
                String sourceInputFormat;
                sourceInputFormat = this.getInputFormat();
                String copyInputFormat = ((String) strategy.copy(LocatorUtils.property(locator, "inputFormat", sourceInputFormat), sourceInputFormat));
                copy.setInputFormat(copyInputFormat);
            } else {
                copy.inputFormat = null;
            }
            if (this.srsName!= null) {
                String sourceSrsName;
                sourceSrsName = this.getSrsName();
                String copySrsName = ((String) strategy.copy(LocatorUtils.property(locator, "srsName", sourceSrsName), sourceSrsName));
                copy.setSrsName(copySrsName);
            } else {
                copy.srsName = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InsertElementType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        if (right instanceof InsertElementType) {
            final InsertElementType target = this;
            final InsertElementType leftObject = ((InsertElementType) left);
            final InsertElementType rightObject = ((InsertElementType) right);
            {
                List<JAXBElement<?>> lhsFeature;
                lhsFeature = leftObject.getFeature();
                List<JAXBElement<?>> rhsFeature;
                rhsFeature = rightObject.getFeature();
                target.feature = null;
                List<JAXBElement<?>> uniqueFeaturel = target.getFeature();
                uniqueFeaturel.addAll(((List<JAXBElement<?>> ) strategy.merge(LocatorUtils.property(leftLocator, "feature", lhsFeature), LocatorUtils.property(rightLocator, "feature", rhsFeature), lhsFeature, rhsFeature)));
            }
            {
                IdentifierGenerationOptionType lhsIdgen;
                lhsIdgen = leftObject.getIdgen();
                IdentifierGenerationOptionType rhsIdgen;
                rhsIdgen = rightObject.getIdgen();
                target.setIdgen(((IdentifierGenerationOptionType) strategy.merge(LocatorUtils.property(leftLocator, "idgen", lhsIdgen), LocatorUtils.property(rightLocator, "idgen", rhsIdgen), lhsIdgen, rhsIdgen)));
            }
            {
                String lhsHandle;
                lhsHandle = leftObject.getHandle();
                String rhsHandle;
                rhsHandle = rightObject.getHandle();
                target.setHandle(((String) strategy.merge(LocatorUtils.property(leftLocator, "handle", lhsHandle), LocatorUtils.property(rightLocator, "handle", rhsHandle), lhsHandle, rhsHandle)));
            }
            {
                String lhsInputFormat;
                lhsInputFormat = leftObject.getInputFormat();
                String rhsInputFormat;
                rhsInputFormat = rightObject.getInputFormat();
                target.setInputFormat(((String) strategy.merge(LocatorUtils.property(leftLocator, "inputFormat", lhsInputFormat), LocatorUtils.property(rightLocator, "inputFormat", rhsInputFormat), lhsInputFormat, rhsInputFormat)));
            }
            {
                String lhsSrsName;
                lhsSrsName = leftObject.getSrsName();
                String rhsSrsName;
                rhsSrsName = rightObject.getSrsName();
                target.setSrsName(((String) strategy.merge(LocatorUtils.property(leftLocator, "srsName", lhsSrsName), LocatorUtils.property(rightLocator, "srsName", rhsSrsName), lhsSrsName, rhsSrsName)));
            }
        }
    }

    public void setFeature(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getFeature();
        draftl.addAll(value);
    }

}
