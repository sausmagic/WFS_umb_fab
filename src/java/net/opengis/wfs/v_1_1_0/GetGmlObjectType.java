//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.filter.v_1_1_0.GmlObjectIdType;
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
 *             A GetGmlObjectType element contains exactly one GmlObjectId.  
 *             The value of the gml:id attribute on that GmlObjectId is used 
 *             as a unique key to retrieve the complex element with a 
 *             gml:id attribute with the same value.  
 *          
 * 
 * <p>Java-Klasse für GetGmlObjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetGmlObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ogc}GmlObjectId"/>
 *       &lt;/sequence>
 *       &lt;attribute name="outputFormat" type="{http://www.w3.org/2001/XMLSchema}string" default="GML3" />
 *       &lt;attribute name="traverseXlinkDepth" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="traverseXlinkExpiry" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGmlObjectType", propOrder = {
    "gmlObjectId"
})
public class GetGmlObjectType
    extends BaseRequestType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(name = "GmlObjectId", namespace = "http://www.opengis.net/ogc", required = true)
    protected GmlObjectIdType gmlObjectId;
    @XmlAttribute(name = "outputFormat")
    protected String outputFormat;
    @XmlAttribute(name = "traverseXlinkDepth", required = true)
    protected String traverseXlinkDepth;
    @XmlAttribute(name = "traverseXlinkExpiry")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger traverseXlinkExpiry;

    /**
     * Ruft den Wert der gmlObjectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GmlObjectIdType }
     *     
     */
    public GmlObjectIdType getGmlObjectId() {
        return gmlObjectId;
    }

    /**
     * Legt den Wert der gmlObjectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GmlObjectIdType }
     *     
     */
    public void setGmlObjectId(GmlObjectIdType value) {
        this.gmlObjectId = value;
    }

    /**
     * Ruft den Wert der outputFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFormat() {
        if (outputFormat == null) {
            return "GML3";
        } else {
            return outputFormat;
        }
    }

    /**
     * Legt den Wert der outputFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }

    /**
     * Ruft den Wert der traverseXlinkDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraverseXlinkDepth() {
        return traverseXlinkDepth;
    }

    /**
     * Legt den Wert der traverseXlinkDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraverseXlinkDepth(String value) {
        this.traverseXlinkDepth = value;
    }

    /**
     * Ruft den Wert der traverseXlinkExpiry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTraverseXlinkExpiry() {
        return traverseXlinkExpiry;
    }

    /**
     * Legt den Wert der traverseXlinkExpiry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTraverseXlinkExpiry(BigInteger value) {
        this.traverseXlinkExpiry = value;
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
            GmlObjectIdType theGmlObjectId;
            theGmlObjectId = this.getGmlObjectId();
            strategy.appendField(locator, this, "gmlObjectId", buffer, theGmlObjectId);
        }
        {
            String theOutputFormat;
            theOutputFormat = this.getOutputFormat();
            strategy.appendField(locator, this, "outputFormat", buffer, theOutputFormat);
        }
        {
            String theTraverseXlinkDepth;
            theTraverseXlinkDepth = this.getTraverseXlinkDepth();
            strategy.appendField(locator, this, "traverseXlinkDepth", buffer, theTraverseXlinkDepth);
        }
        {
            BigInteger theTraverseXlinkExpiry;
            theTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
            strategy.appendField(locator, this, "traverseXlinkExpiry", buffer, theTraverseXlinkExpiry);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetGmlObjectType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetGmlObjectType that = ((GetGmlObjectType) object);
        {
            GmlObjectIdType lhsGmlObjectId;
            lhsGmlObjectId = this.getGmlObjectId();
            GmlObjectIdType rhsGmlObjectId;
            rhsGmlObjectId = that.getGmlObjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gmlObjectId", lhsGmlObjectId), LocatorUtils.property(thatLocator, "gmlObjectId", rhsGmlObjectId), lhsGmlObjectId, rhsGmlObjectId)) {
                return false;
            }
        }
        {
            String lhsOutputFormat;
            lhsOutputFormat = this.getOutputFormat();
            String rhsOutputFormat;
            rhsOutputFormat = that.getOutputFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputFormat", lhsOutputFormat), LocatorUtils.property(thatLocator, "outputFormat", rhsOutputFormat), lhsOutputFormat, rhsOutputFormat)) {
                return false;
            }
        }
        {
            String lhsTraverseXlinkDepth;
            lhsTraverseXlinkDepth = this.getTraverseXlinkDepth();
            String rhsTraverseXlinkDepth;
            rhsTraverseXlinkDepth = that.getTraverseXlinkDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traverseXlinkDepth", lhsTraverseXlinkDepth), LocatorUtils.property(thatLocator, "traverseXlinkDepth", rhsTraverseXlinkDepth), lhsTraverseXlinkDepth, rhsTraverseXlinkDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsTraverseXlinkExpiry;
            lhsTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
            BigInteger rhsTraverseXlinkExpiry;
            rhsTraverseXlinkExpiry = that.getTraverseXlinkExpiry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traverseXlinkExpiry", lhsTraverseXlinkExpiry), LocatorUtils.property(thatLocator, "traverseXlinkExpiry", rhsTraverseXlinkExpiry), lhsTraverseXlinkExpiry, rhsTraverseXlinkExpiry)) {
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
            GmlObjectIdType theGmlObjectId;
            theGmlObjectId = this.getGmlObjectId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gmlObjectId", theGmlObjectId), currentHashCode, theGmlObjectId);
        }
        {
            String theOutputFormat;
            theOutputFormat = this.getOutputFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputFormat", theOutputFormat), currentHashCode, theOutputFormat);
        }
        {
            String theTraverseXlinkDepth;
            theTraverseXlinkDepth = this.getTraverseXlinkDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traverseXlinkDepth", theTraverseXlinkDepth), currentHashCode, theTraverseXlinkDepth);
        }
        {
            BigInteger theTraverseXlinkExpiry;
            theTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traverseXlinkExpiry", theTraverseXlinkExpiry), currentHashCode, theTraverseXlinkExpiry);
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
        if (draftCopy instanceof GetGmlObjectType) {
            final GetGmlObjectType copy = ((GetGmlObjectType) draftCopy);
            if (this.gmlObjectId!= null) {
                GmlObjectIdType sourceGmlObjectId;
                sourceGmlObjectId = this.getGmlObjectId();
                GmlObjectIdType copyGmlObjectId = ((GmlObjectIdType) strategy.copy(LocatorUtils.property(locator, "gmlObjectId", sourceGmlObjectId), sourceGmlObjectId));
                copy.setGmlObjectId(copyGmlObjectId);
            } else {
                copy.gmlObjectId = null;
            }
            if (this.outputFormat!= null) {
                String sourceOutputFormat;
                sourceOutputFormat = this.getOutputFormat();
                String copyOutputFormat = ((String) strategy.copy(LocatorUtils.property(locator, "outputFormat", sourceOutputFormat), sourceOutputFormat));
                copy.setOutputFormat(copyOutputFormat);
            } else {
                copy.outputFormat = null;
            }
            if (this.traverseXlinkDepth!= null) {
                String sourceTraverseXlinkDepth;
                sourceTraverseXlinkDepth = this.getTraverseXlinkDepth();
                String copyTraverseXlinkDepth = ((String) strategy.copy(LocatorUtils.property(locator, "traverseXlinkDepth", sourceTraverseXlinkDepth), sourceTraverseXlinkDepth));
                copy.setTraverseXlinkDepth(copyTraverseXlinkDepth);
            } else {
                copy.traverseXlinkDepth = null;
            }
            if (this.traverseXlinkExpiry!= null) {
                BigInteger sourceTraverseXlinkExpiry;
                sourceTraverseXlinkExpiry = this.getTraverseXlinkExpiry();
                BigInteger copyTraverseXlinkExpiry = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "traverseXlinkExpiry", sourceTraverseXlinkExpiry), sourceTraverseXlinkExpiry));
                copy.setTraverseXlinkExpiry(copyTraverseXlinkExpiry);
            } else {
                copy.traverseXlinkExpiry = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GetGmlObjectType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof GetGmlObjectType) {
            final GetGmlObjectType target = this;
            final GetGmlObjectType leftObject = ((GetGmlObjectType) left);
            final GetGmlObjectType rightObject = ((GetGmlObjectType) right);
            {
                GmlObjectIdType lhsGmlObjectId;
                lhsGmlObjectId = leftObject.getGmlObjectId();
                GmlObjectIdType rhsGmlObjectId;
                rhsGmlObjectId = rightObject.getGmlObjectId();
                target.setGmlObjectId(((GmlObjectIdType) strategy.merge(LocatorUtils.property(leftLocator, "gmlObjectId", lhsGmlObjectId), LocatorUtils.property(rightLocator, "gmlObjectId", rhsGmlObjectId), lhsGmlObjectId, rhsGmlObjectId)));
            }
            {
                String lhsOutputFormat;
                lhsOutputFormat = leftObject.getOutputFormat();
                String rhsOutputFormat;
                rhsOutputFormat = rightObject.getOutputFormat();
                target.setOutputFormat(((String) strategy.merge(LocatorUtils.property(leftLocator, "outputFormat", lhsOutputFormat), LocatorUtils.property(rightLocator, "outputFormat", rhsOutputFormat), lhsOutputFormat, rhsOutputFormat)));
            }
            {
                String lhsTraverseXlinkDepth;
                lhsTraverseXlinkDepth = leftObject.getTraverseXlinkDepth();
                String rhsTraverseXlinkDepth;
                rhsTraverseXlinkDepth = rightObject.getTraverseXlinkDepth();
                target.setTraverseXlinkDepth(((String) strategy.merge(LocatorUtils.property(leftLocator, "traverseXlinkDepth", lhsTraverseXlinkDepth), LocatorUtils.property(rightLocator, "traverseXlinkDepth", rhsTraverseXlinkDepth), lhsTraverseXlinkDepth, rhsTraverseXlinkDepth)));
            }
            {
                BigInteger lhsTraverseXlinkExpiry;
                lhsTraverseXlinkExpiry = leftObject.getTraverseXlinkExpiry();
                BigInteger rhsTraverseXlinkExpiry;
                rhsTraverseXlinkExpiry = rightObject.getTraverseXlinkExpiry();
                target.setTraverseXlinkExpiry(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "traverseXlinkExpiry", lhsTraverseXlinkExpiry), LocatorUtils.property(rightLocator, "traverseXlinkExpiry", rhsTraverseXlinkExpiry), lhsTraverseXlinkExpiry, rhsTraverseXlinkExpiry)));
            }
        }
    }

}
