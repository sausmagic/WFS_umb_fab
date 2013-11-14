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
import javax.xml.bind.annotation.XmlSeeAlso;
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
import org.w3.smil.v_2_0.language.AnimateColorType;
import org.w3.smil.v_2_0.language.AnimateMotionType;
import org.w3.smil.v_2_0.language.AnimateType;
import org.w3.smil.v_2_0.language.SetType;


/**
 * Base complex type for geometry, topology, label and graph styles.
 * 
 * <p>Java-Klasse für BaseStyleDescriptorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseStyleDescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="spatialResolution" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="styleVariation" type="{http://www.opengis.net/gml}StyleVariationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2001/SMIL20/}animate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2001/SMIL20/}animateMotion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2001/SMIL20/}animateColor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2001/SMIL20/}set" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseStyleDescriptorType", propOrder = {
    "spatialResolution",
    "styleVariation",
    "animate",
    "animateMotion",
    "animateColor",
    "set"
})
@XmlSeeAlso({
    GraphStyleType.class,
    LabelStyleType.class,
    TopologyStyleType.class,
    GeometryStyleType.class
})
public class BaseStyleDescriptorType
    extends AbstractGMLType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected ScaleType spatialResolution;
    protected List<StyleVariationType> styleVariation;
    @XmlElement(namespace = "http://www.w3.org/2001/SMIL20/")
    protected List<AnimateType> animate;
    @XmlElement(namespace = "http://www.w3.org/2001/SMIL20/")
    protected List<AnimateMotionType> animateMotion;
    @XmlElement(namespace = "http://www.w3.org/2001/SMIL20/")
    protected List<AnimateColorType> animateColor;
    @XmlElement(namespace = "http://www.w3.org/2001/SMIL20/")
    protected List<SetType> set;

    /**
     * Ruft den Wert der spatialResolution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getSpatialResolution() {
        return spatialResolution;
    }

    /**
     * Legt den Wert der spatialResolution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setSpatialResolution(ScaleType value) {
        this.spatialResolution = value;
    }

    public boolean isSetSpatialResolution() {
        return (this.spatialResolution!= null);
    }

    /**
     * Gets the value of the styleVariation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleVariation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StyleVariationType }
     * 
     * 
     */
    public List<StyleVariationType> getStyleVariation() {
        if (styleVariation == null) {
            styleVariation = new ArrayList<StyleVariationType>();
        }
        return this.styleVariation;
    }

    public boolean isSetStyleVariation() {
        return ((this.styleVariation!= null)&&(!this.styleVariation.isEmpty()));
    }

    public void unsetStyleVariation() {
        this.styleVariation = null;
    }

    /**
     * Gets the value of the animate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimateType }
     * 
     * 
     */
    public List<AnimateType> getAnimate() {
        if (animate == null) {
            animate = new ArrayList<AnimateType>();
        }
        return this.animate;
    }

    public boolean isSetAnimate() {
        return ((this.animate!= null)&&(!this.animate.isEmpty()));
    }

    public void unsetAnimate() {
        this.animate = null;
    }

    /**
     * Gets the value of the animateMotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animateMotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimateMotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimateMotionType }
     * 
     * 
     */
    public List<AnimateMotionType> getAnimateMotion() {
        if (animateMotion == null) {
            animateMotion = new ArrayList<AnimateMotionType>();
        }
        return this.animateMotion;
    }

    public boolean isSetAnimateMotion() {
        return ((this.animateMotion!= null)&&(!this.animateMotion.isEmpty()));
    }

    public void unsetAnimateMotion() {
        this.animateMotion = null;
    }

    /**
     * Gets the value of the animateColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animateColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimateColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimateColorType }
     * 
     * 
     */
    public List<AnimateColorType> getAnimateColor() {
        if (animateColor == null) {
            animateColor = new ArrayList<AnimateColorType>();
        }
        return this.animateColor;
    }

    public boolean isSetAnimateColor() {
        return ((this.animateColor!= null)&&(!this.animateColor.isEmpty()));
    }

    public void unsetAnimateColor() {
        this.animateColor = null;
    }

    /**
     * Gets the value of the set property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the set property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetType }
     * 
     * 
     */
    public List<SetType> getSet() {
        if (set == null) {
            set = new ArrayList<SetType>();
        }
        return this.set;
    }

    public boolean isSetSet() {
        return ((this.set!= null)&&(!this.set.isEmpty()));
    }

    public void unsetSet() {
        this.set = null;
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
            ScaleType theSpatialResolution;
            theSpatialResolution = this.getSpatialResolution();
            strategy.appendField(locator, this, "spatialResolution", buffer, theSpatialResolution);
        }
        {
            List<StyleVariationType> theStyleVariation;
            theStyleVariation = this.getStyleVariation();
            strategy.appendField(locator, this, "styleVariation", buffer, theStyleVariation);
        }
        {
            List<AnimateType> theAnimate;
            theAnimate = this.getAnimate();
            strategy.appendField(locator, this, "animate", buffer, theAnimate);
        }
        {
            List<AnimateMotionType> theAnimateMotion;
            theAnimateMotion = this.getAnimateMotion();
            strategy.appendField(locator, this, "animateMotion", buffer, theAnimateMotion);
        }
        {
            List<AnimateColorType> theAnimateColor;
            theAnimateColor = this.getAnimateColor();
            strategy.appendField(locator, this, "animateColor", buffer, theAnimateColor);
        }
        {
            List<SetType> theSet;
            theSet = this.getSet();
            strategy.appendField(locator, this, "set", buffer, theSet);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BaseStyleDescriptorType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BaseStyleDescriptorType that = ((BaseStyleDescriptorType) object);
        {
            ScaleType lhsSpatialResolution;
            lhsSpatialResolution = this.getSpatialResolution();
            ScaleType rhsSpatialResolution;
            rhsSpatialResolution = that.getSpatialResolution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spatialResolution", lhsSpatialResolution), LocatorUtils.property(thatLocator, "spatialResolution", rhsSpatialResolution), lhsSpatialResolution, rhsSpatialResolution)) {
                return false;
            }
        }
        {
            List<StyleVariationType> lhsStyleVariation;
            lhsStyleVariation = this.getStyleVariation();
            List<StyleVariationType> rhsStyleVariation;
            rhsStyleVariation = that.getStyleVariation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "styleVariation", lhsStyleVariation), LocatorUtils.property(thatLocator, "styleVariation", rhsStyleVariation), lhsStyleVariation, rhsStyleVariation)) {
                return false;
            }
        }
        {
            List<AnimateType> lhsAnimate;
            lhsAnimate = this.getAnimate();
            List<AnimateType> rhsAnimate;
            rhsAnimate = that.getAnimate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animate", lhsAnimate), LocatorUtils.property(thatLocator, "animate", rhsAnimate), lhsAnimate, rhsAnimate)) {
                return false;
            }
        }
        {
            List<AnimateMotionType> lhsAnimateMotion;
            lhsAnimateMotion = this.getAnimateMotion();
            List<AnimateMotionType> rhsAnimateMotion;
            rhsAnimateMotion = that.getAnimateMotion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animateMotion", lhsAnimateMotion), LocatorUtils.property(thatLocator, "animateMotion", rhsAnimateMotion), lhsAnimateMotion, rhsAnimateMotion)) {
                return false;
            }
        }
        {
            List<AnimateColorType> lhsAnimateColor;
            lhsAnimateColor = this.getAnimateColor();
            List<AnimateColorType> rhsAnimateColor;
            rhsAnimateColor = that.getAnimateColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animateColor", lhsAnimateColor), LocatorUtils.property(thatLocator, "animateColor", rhsAnimateColor), lhsAnimateColor, rhsAnimateColor)) {
                return false;
            }
        }
        {
            List<SetType> lhsSet;
            lhsSet = this.getSet();
            List<SetType> rhsSet;
            rhsSet = that.getSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "set", lhsSet), LocatorUtils.property(thatLocator, "set", rhsSet), lhsSet, rhsSet)) {
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
            ScaleType theSpatialResolution;
            theSpatialResolution = this.getSpatialResolution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spatialResolution", theSpatialResolution), currentHashCode, theSpatialResolution);
        }
        {
            List<StyleVariationType> theStyleVariation;
            theStyleVariation = this.getStyleVariation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "styleVariation", theStyleVariation), currentHashCode, theStyleVariation);
        }
        {
            List<AnimateType> theAnimate;
            theAnimate = this.getAnimate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animate", theAnimate), currentHashCode, theAnimate);
        }
        {
            List<AnimateMotionType> theAnimateMotion;
            theAnimateMotion = this.getAnimateMotion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animateMotion", theAnimateMotion), currentHashCode, theAnimateMotion);
        }
        {
            List<AnimateColorType> theAnimateColor;
            theAnimateColor = this.getAnimateColor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animateColor", theAnimateColor), currentHashCode, theAnimateColor);
        }
        {
            List<SetType> theSet;
            theSet = this.getSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "set", theSet), currentHashCode, theSet);
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
        if (draftCopy instanceof BaseStyleDescriptorType) {
            final BaseStyleDescriptorType copy = ((BaseStyleDescriptorType) draftCopy);
            if (this.isSetSpatialResolution()) {
                ScaleType sourceSpatialResolution;
                sourceSpatialResolution = this.getSpatialResolution();
                ScaleType copySpatialResolution = ((ScaleType) strategy.copy(LocatorUtils.property(locator, "spatialResolution", sourceSpatialResolution), sourceSpatialResolution));
                copy.setSpatialResolution(copySpatialResolution);
            } else {
                copy.spatialResolution = null;
            }
            if (this.isSetStyleVariation()) {
                List<StyleVariationType> sourceStyleVariation;
                sourceStyleVariation = this.getStyleVariation();
                @SuppressWarnings("unchecked")
                List<StyleVariationType> copyStyleVariation = ((List<StyleVariationType> ) strategy.copy(LocatorUtils.property(locator, "styleVariation", sourceStyleVariation), sourceStyleVariation));
                copy.unsetStyleVariation();
                List<StyleVariationType> uniqueStyleVariationl = copy.getStyleVariation();
                uniqueStyleVariationl.addAll(copyStyleVariation);
            } else {
                copy.unsetStyleVariation();
            }
            if (this.isSetAnimate()) {
                List<AnimateType> sourceAnimate;
                sourceAnimate = this.getAnimate();
                @SuppressWarnings("unchecked")
                List<AnimateType> copyAnimate = ((List<AnimateType> ) strategy.copy(LocatorUtils.property(locator, "animate", sourceAnimate), sourceAnimate));
                copy.unsetAnimate();
                List<AnimateType> uniqueAnimatel = copy.getAnimate();
                uniqueAnimatel.addAll(copyAnimate);
            } else {
                copy.unsetAnimate();
            }
            if (this.isSetAnimateMotion()) {
                List<AnimateMotionType> sourceAnimateMotion;
                sourceAnimateMotion = this.getAnimateMotion();
                @SuppressWarnings("unchecked")
                List<AnimateMotionType> copyAnimateMotion = ((List<AnimateMotionType> ) strategy.copy(LocatorUtils.property(locator, "animateMotion", sourceAnimateMotion), sourceAnimateMotion));
                copy.unsetAnimateMotion();
                List<AnimateMotionType> uniqueAnimateMotionl = copy.getAnimateMotion();
                uniqueAnimateMotionl.addAll(copyAnimateMotion);
            } else {
                copy.unsetAnimateMotion();
            }
            if (this.isSetAnimateColor()) {
                List<AnimateColorType> sourceAnimateColor;
                sourceAnimateColor = this.getAnimateColor();
                @SuppressWarnings("unchecked")
                List<AnimateColorType> copyAnimateColor = ((List<AnimateColorType> ) strategy.copy(LocatorUtils.property(locator, "animateColor", sourceAnimateColor), sourceAnimateColor));
                copy.unsetAnimateColor();
                List<AnimateColorType> uniqueAnimateColorl = copy.getAnimateColor();
                uniqueAnimateColorl.addAll(copyAnimateColor);
            } else {
                copy.unsetAnimateColor();
            }
            if (this.isSetSet()) {
                List<SetType> sourceSet;
                sourceSet = this.getSet();
                @SuppressWarnings("unchecked")
                List<SetType> copySet = ((List<SetType> ) strategy.copy(LocatorUtils.property(locator, "set", sourceSet), sourceSet));
                copy.unsetSet();
                List<SetType> uniqueSetl = copy.getSet();
                uniqueSetl.addAll(copySet);
            } else {
                copy.unsetSet();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BaseStyleDescriptorType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof BaseStyleDescriptorType) {
            final BaseStyleDescriptorType target = this;
            final BaseStyleDescriptorType leftObject = ((BaseStyleDescriptorType) left);
            final BaseStyleDescriptorType rightObject = ((BaseStyleDescriptorType) right);
            {
                ScaleType lhsSpatialResolution;
                lhsSpatialResolution = leftObject.getSpatialResolution();
                ScaleType rhsSpatialResolution;
                rhsSpatialResolution = rightObject.getSpatialResolution();
                target.setSpatialResolution(((ScaleType) strategy.merge(LocatorUtils.property(leftLocator, "spatialResolution", lhsSpatialResolution), LocatorUtils.property(rightLocator, "spatialResolution", rhsSpatialResolution), lhsSpatialResolution, rhsSpatialResolution)));
            }
            {
                List<StyleVariationType> lhsStyleVariation;
                lhsStyleVariation = leftObject.getStyleVariation();
                List<StyleVariationType> rhsStyleVariation;
                rhsStyleVariation = rightObject.getStyleVariation();
                target.unsetStyleVariation();
                List<StyleVariationType> uniqueStyleVariationl = target.getStyleVariation();
                uniqueStyleVariationl.addAll(((List<StyleVariationType> ) strategy.merge(LocatorUtils.property(leftLocator, "styleVariation", lhsStyleVariation), LocatorUtils.property(rightLocator, "styleVariation", rhsStyleVariation), lhsStyleVariation, rhsStyleVariation)));
            }
            {
                List<AnimateType> lhsAnimate;
                lhsAnimate = leftObject.getAnimate();
                List<AnimateType> rhsAnimate;
                rhsAnimate = rightObject.getAnimate();
                target.unsetAnimate();
                List<AnimateType> uniqueAnimatel = target.getAnimate();
                uniqueAnimatel.addAll(((List<AnimateType> ) strategy.merge(LocatorUtils.property(leftLocator, "animate", lhsAnimate), LocatorUtils.property(rightLocator, "animate", rhsAnimate), lhsAnimate, rhsAnimate)));
            }
            {
                List<AnimateMotionType> lhsAnimateMotion;
                lhsAnimateMotion = leftObject.getAnimateMotion();
                List<AnimateMotionType> rhsAnimateMotion;
                rhsAnimateMotion = rightObject.getAnimateMotion();
                target.unsetAnimateMotion();
                List<AnimateMotionType> uniqueAnimateMotionl = target.getAnimateMotion();
                uniqueAnimateMotionl.addAll(((List<AnimateMotionType> ) strategy.merge(LocatorUtils.property(leftLocator, "animateMotion", lhsAnimateMotion), LocatorUtils.property(rightLocator, "animateMotion", rhsAnimateMotion), lhsAnimateMotion, rhsAnimateMotion)));
            }
            {
                List<AnimateColorType> lhsAnimateColor;
                lhsAnimateColor = leftObject.getAnimateColor();
                List<AnimateColorType> rhsAnimateColor;
                rhsAnimateColor = rightObject.getAnimateColor();
                target.unsetAnimateColor();
                List<AnimateColorType> uniqueAnimateColorl = target.getAnimateColor();
                uniqueAnimateColorl.addAll(((List<AnimateColorType> ) strategy.merge(LocatorUtils.property(leftLocator, "animateColor", lhsAnimateColor), LocatorUtils.property(rightLocator, "animateColor", rhsAnimateColor), lhsAnimateColor, rhsAnimateColor)));
            }
            {
                List<SetType> lhsSet;
                lhsSet = leftObject.getSet();
                List<SetType> rhsSet;
                rhsSet = rightObject.getSet();
                target.unsetSet();
                List<SetType> uniqueSetl = target.getSet();
                uniqueSetl.addAll(((List<SetType> ) strategy.merge(LocatorUtils.property(leftLocator, "set", lhsSet), LocatorUtils.property(rightLocator, "set", rhsSet), lhsSet, rhsSet)));
            }
        }
    }

    public void setStyleVariation(List<StyleVariationType> value) {
        List<StyleVariationType> draftl = this.getStyleVariation();
        draftl.addAll(value);
    }

    public void setAnimate(List<AnimateType> value) {
        List<AnimateType> draftl = this.getAnimate();
        draftl.addAll(value);
    }

    public void setAnimateMotion(List<AnimateMotionType> value) {
        List<AnimateMotionType> draftl = this.getAnimateMotion();
        draftl.addAll(value);
    }

    public void setAnimateColor(List<AnimateColorType> value) {
        List<AnimateColorType> draftl = this.getAnimateColor();
        draftl.addAll(value);
    }

    public void setSet(List<SetType> value) {
        List<SetType> draftl = this.getSet();
        draftl.addAll(value);
    }

}
