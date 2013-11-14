//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * Cubic splines are similar to line strings in that they are a sequence of segments each with its own defining function. A cubic spline uses the control points and a set of derivative parameters to define a piecewise 3rd degree polynomial interpolation. Unlike line-strings, the parameterization by arc length is not necessarily still a polynomial. 
 * 				The function describing the curve must be C2, that is, have a continuous 1st and 2nd derivative at all points, and pass through the controlPoints in the order given. Between the control points, the curve segment is defined by a cubic polynomial. At each control point, the polynomial changes in such a manner that the 1st and 2nd derivative vectors are the same from either side. The control parameters record must contain vectorAtStart, and vectorAtEnd which are the unit tangent vectors at controlPoint[1] and controlPoint[n] where n = controlPoint.count. 
 * 				Note: only the direction of the vectors is relevant, not their length.
 * 
 * <p>Java-Klasse für CubicSplineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CubicSplineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="2">
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="vectorAtStart" type="{http://www.opengis.net/gml}VectorType"/>
 *         &lt;element name="vectorAtEnd" type="{http://www.opengis.net/gml}VectorType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="cubicSpline" />
 *       &lt;attribute name="degree" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubicSplineType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "vectorAtStart",
    "vectorAtEnd"
})
public class CubicSplineType
    extends AbstractCurveSegmentType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml", type = JAXBElement.class),
        @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected VectorType vectorAtStart;
    @XmlElement(required = true)
    protected VectorType vectorAtEnd;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;
    @XmlAttribute(name = "degree")
    protected BigInteger degree;

    /**
     * Gets the value of the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointPropertyOrPointRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPosOrPointPropertyOrPointRep() {
        if (posOrPointPropertyOrPointRep == null) {
            posOrPointPropertyOrPointRep = new ArrayList<JAXBElement<?>>();
        }
        return this.posOrPointPropertyOrPointRep;
    }

    public boolean isSetPosOrPointPropertyOrPointRep() {
        return ((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()));
    }

    public void unsetPosOrPointPropertyOrPointRep() {
        this.posOrPointPropertyOrPointRep = null;
    }

    /**
     * Ruft den Wert der posList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Legt den Wert der posList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    public boolean isSetPosList() {
        return (this.posList!= null);
    }

    /**
     * Deprecated with GML version 3.1.0. Use "posList" instead.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Legt den Wert der coordinates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    public boolean isSetCoordinates() {
        return (this.coordinates!= null);
    }

    /**
     * Ruft den Wert der vectorAtStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVectorAtStart() {
        return vectorAtStart;
    }

    /**
     * Legt den Wert der vectorAtStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVectorAtStart(VectorType value) {
        this.vectorAtStart = value;
    }

    public boolean isSetVectorAtStart() {
        return (this.vectorAtStart!= null);
    }

    /**
     * Ruft den Wert der vectorAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVectorAtEnd() {
        return vectorAtEnd;
    }

    /**
     * Legt den Wert der vectorAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVectorAtEnd(VectorType value) {
        this.vectorAtEnd = value;
    }

    public boolean isSetVectorAtEnd() {
        return (this.vectorAtEnd!= null);
    }

    /**
     * Ruft den Wert der interpolation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.CUBIC_SPLINE;
        } else {
            return interpolation;
        }
    }

    /**
     * Legt den Wert der interpolation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
    }

    public boolean isSetInterpolation() {
        return (this.interpolation!= null);
    }

    /**
     * Ruft den Wert der degree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegree() {
        if (degree == null) {
            return new BigInteger("3");
        } else {
            return degree;
        }
    }

    /**
     * Legt den Wert der degree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegree(BigInteger value) {
        this.degree = value;
    }

    public boolean isSetDegree() {
        return (this.degree!= null);
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
            List<JAXBElement<?>> thePosOrPointPropertyOrPointRep;
            thePosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
            strategy.appendField(locator, this, "posOrPointPropertyOrPointRep", buffer, thePosOrPointPropertyOrPointRep);
        }
        {
            DirectPositionListType thePosList;
            thePosList = this.getPosList();
            strategy.appendField(locator, this, "posList", buffer, thePosList);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theCoordinates);
        }
        {
            VectorType theVectorAtStart;
            theVectorAtStart = this.getVectorAtStart();
            strategy.appendField(locator, this, "vectorAtStart", buffer, theVectorAtStart);
        }
        {
            VectorType theVectorAtEnd;
            theVectorAtEnd = this.getVectorAtEnd();
            strategy.appendField(locator, this, "vectorAtEnd", buffer, theVectorAtEnd);
        }
        {
            CurveInterpolationType theInterpolation;
            theInterpolation = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theInterpolation);
        }
        {
            BigInteger theDegree;
            theDegree = this.getDegree();
            strategy.appendField(locator, this, "degree", buffer, theDegree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CubicSplineType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CubicSplineType that = ((CubicSplineType) object);
        {
            List<JAXBElement<?>> lhsPosOrPointPropertyOrPointRep;
            lhsPosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
            List<JAXBElement<?>> rhsPosOrPointPropertyOrPointRep;
            rhsPosOrPointPropertyOrPointRep = that.getPosOrPointPropertyOrPointRep();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posOrPointPropertyOrPointRep", lhsPosOrPointPropertyOrPointRep), LocatorUtils.property(thatLocator, "posOrPointPropertyOrPointRep", rhsPosOrPointPropertyOrPointRep), lhsPosOrPointPropertyOrPointRep, rhsPosOrPointPropertyOrPointRep)) {
                return false;
            }
        }
        {
            DirectPositionListType lhsPosList;
            lhsPosList = this.getPosList();
            DirectPositionListType rhsPosList;
            rhsPosList = that.getPosList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posList", lhsPosList), LocatorUtils.property(thatLocator, "posList", rhsPosList), lhsPosList, rhsPosList)) {
                return false;
            }
        }
        {
            CoordinatesType lhsCoordinates;
            lhsCoordinates = this.getCoordinates();
            CoordinatesType rhsCoordinates;
            rhsCoordinates = that.getCoordinates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinates", lhsCoordinates), LocatorUtils.property(thatLocator, "coordinates", rhsCoordinates), lhsCoordinates, rhsCoordinates)) {
                return false;
            }
        }
        {
            VectorType lhsVectorAtStart;
            lhsVectorAtStart = this.getVectorAtStart();
            VectorType rhsVectorAtStart;
            rhsVectorAtStart = that.getVectorAtStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vectorAtStart", lhsVectorAtStart), LocatorUtils.property(thatLocator, "vectorAtStart", rhsVectorAtStart), lhsVectorAtStart, rhsVectorAtStart)) {
                return false;
            }
        }
        {
            VectorType lhsVectorAtEnd;
            lhsVectorAtEnd = this.getVectorAtEnd();
            VectorType rhsVectorAtEnd;
            rhsVectorAtEnd = that.getVectorAtEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vectorAtEnd", lhsVectorAtEnd), LocatorUtils.property(thatLocator, "vectorAtEnd", rhsVectorAtEnd), lhsVectorAtEnd, rhsVectorAtEnd)) {
                return false;
            }
        }
        {
            CurveInterpolationType lhsInterpolation;
            lhsInterpolation = this.getInterpolation();
            CurveInterpolationType rhsInterpolation;
            rhsInterpolation = that.getInterpolation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interpolation", lhsInterpolation), LocatorUtils.property(thatLocator, "interpolation", rhsInterpolation), lhsInterpolation, rhsInterpolation)) {
                return false;
            }
        }
        {
            BigInteger lhsDegree;
            lhsDegree = this.getDegree();
            BigInteger rhsDegree;
            rhsDegree = that.getDegree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "degree", lhsDegree), LocatorUtils.property(thatLocator, "degree", rhsDegree), lhsDegree, rhsDegree)) {
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
            List<JAXBElement<?>> thePosOrPointPropertyOrPointRep;
            thePosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posOrPointPropertyOrPointRep", thePosOrPointPropertyOrPointRep), currentHashCode, thePosOrPointPropertyOrPointRep);
        }
        {
            DirectPositionListType thePosList;
            thePosList = this.getPosList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posList", thePosList), currentHashCode, thePosList);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinates", theCoordinates), currentHashCode, theCoordinates);
        }
        {
            VectorType theVectorAtStart;
            theVectorAtStart = this.getVectorAtStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vectorAtStart", theVectorAtStart), currentHashCode, theVectorAtStart);
        }
        {
            VectorType theVectorAtEnd;
            theVectorAtEnd = this.getVectorAtEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vectorAtEnd", theVectorAtEnd), currentHashCode, theVectorAtEnd);
        }
        {
            CurveInterpolationType theInterpolation;
            theInterpolation = this.getInterpolation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interpolation", theInterpolation), currentHashCode, theInterpolation);
        }
        {
            BigInteger theDegree;
            theDegree = this.getDegree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "degree", theDegree), currentHashCode, theDegree);
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
        if (draftCopy instanceof CubicSplineType) {
            final CubicSplineType copy = ((CubicSplineType) draftCopy);
            if (this.isSetPosOrPointPropertyOrPointRep()) {
                List<JAXBElement<?>> sourcePosOrPointPropertyOrPointRep;
                sourcePosOrPointPropertyOrPointRep = this.getPosOrPointPropertyOrPointRep();
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyPosOrPointPropertyOrPointRep = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "posOrPointPropertyOrPointRep", sourcePosOrPointPropertyOrPointRep), sourcePosOrPointPropertyOrPointRep));
                copy.unsetPosOrPointPropertyOrPointRep();
                List<JAXBElement<?>> uniquePosOrPointPropertyOrPointRepl = copy.getPosOrPointPropertyOrPointRep();
                uniquePosOrPointPropertyOrPointRepl.addAll(copyPosOrPointPropertyOrPointRep);
            } else {
                copy.unsetPosOrPointPropertyOrPointRep();
            }
            if (this.isSetPosList()) {
                DirectPositionListType sourcePosList;
                sourcePosList = this.getPosList();
                DirectPositionListType copyPosList = ((DirectPositionListType) strategy.copy(LocatorUtils.property(locator, "posList", sourcePosList), sourcePosList));
                copy.setPosList(copyPosList);
            } else {
                copy.posList = null;
            }
            if (this.isSetCoordinates()) {
                CoordinatesType sourceCoordinates;
                sourceCoordinates = this.getCoordinates();
                CoordinatesType copyCoordinates = ((CoordinatesType) strategy.copy(LocatorUtils.property(locator, "coordinates", sourceCoordinates), sourceCoordinates));
                copy.setCoordinates(copyCoordinates);
            } else {
                copy.coordinates = null;
            }
            if (this.isSetVectorAtStart()) {
                VectorType sourceVectorAtStart;
                sourceVectorAtStart = this.getVectorAtStart();
                VectorType copyVectorAtStart = ((VectorType) strategy.copy(LocatorUtils.property(locator, "vectorAtStart", sourceVectorAtStart), sourceVectorAtStart));
                copy.setVectorAtStart(copyVectorAtStart);
            } else {
                copy.vectorAtStart = null;
            }
            if (this.isSetVectorAtEnd()) {
                VectorType sourceVectorAtEnd;
                sourceVectorAtEnd = this.getVectorAtEnd();
                VectorType copyVectorAtEnd = ((VectorType) strategy.copy(LocatorUtils.property(locator, "vectorAtEnd", sourceVectorAtEnd), sourceVectorAtEnd));
                copy.setVectorAtEnd(copyVectorAtEnd);
            } else {
                copy.vectorAtEnd = null;
            }
            if (this.isSetInterpolation()) {
                CurveInterpolationType sourceInterpolation;
                sourceInterpolation = this.getInterpolation();
                CurveInterpolationType copyInterpolation = ((CurveInterpolationType) strategy.copy(LocatorUtils.property(locator, "interpolation", sourceInterpolation), sourceInterpolation));
                copy.setInterpolation(copyInterpolation);
            } else {
                copy.interpolation = null;
            }
            if (this.isSetDegree()) {
                BigInteger sourceDegree;
                sourceDegree = this.getDegree();
                BigInteger copyDegree = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "degree", sourceDegree), sourceDegree));
                copy.setDegree(copyDegree);
            } else {
                copy.degree = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CubicSplineType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CubicSplineType) {
            final CubicSplineType target = this;
            final CubicSplineType leftObject = ((CubicSplineType) left);
            final CubicSplineType rightObject = ((CubicSplineType) right);
            {
                List<JAXBElement<?>> lhsPosOrPointPropertyOrPointRep;
                lhsPosOrPointPropertyOrPointRep = leftObject.getPosOrPointPropertyOrPointRep();
                List<JAXBElement<?>> rhsPosOrPointPropertyOrPointRep;
                rhsPosOrPointPropertyOrPointRep = rightObject.getPosOrPointPropertyOrPointRep();
                target.unsetPosOrPointPropertyOrPointRep();
                List<JAXBElement<?>> uniquePosOrPointPropertyOrPointRepl = target.getPosOrPointPropertyOrPointRep();
                uniquePosOrPointPropertyOrPointRepl.addAll(((List<JAXBElement<?>> ) strategy.merge(LocatorUtils.property(leftLocator, "posOrPointPropertyOrPointRep", lhsPosOrPointPropertyOrPointRep), LocatorUtils.property(rightLocator, "posOrPointPropertyOrPointRep", rhsPosOrPointPropertyOrPointRep), lhsPosOrPointPropertyOrPointRep, rhsPosOrPointPropertyOrPointRep)));
            }
            {
                DirectPositionListType lhsPosList;
                lhsPosList = leftObject.getPosList();
                DirectPositionListType rhsPosList;
                rhsPosList = rightObject.getPosList();
                target.setPosList(((DirectPositionListType) strategy.merge(LocatorUtils.property(leftLocator, "posList", lhsPosList), LocatorUtils.property(rightLocator, "posList", rhsPosList), lhsPosList, rhsPosList)));
            }
            {
                CoordinatesType lhsCoordinates;
                lhsCoordinates = leftObject.getCoordinates();
                CoordinatesType rhsCoordinates;
                rhsCoordinates = rightObject.getCoordinates();
                target.setCoordinates(((CoordinatesType) strategy.merge(LocatorUtils.property(leftLocator, "coordinates", lhsCoordinates), LocatorUtils.property(rightLocator, "coordinates", rhsCoordinates), lhsCoordinates, rhsCoordinates)));
            }
            {
                VectorType lhsVectorAtStart;
                lhsVectorAtStart = leftObject.getVectorAtStart();
                VectorType rhsVectorAtStart;
                rhsVectorAtStart = rightObject.getVectorAtStart();
                target.setVectorAtStart(((VectorType) strategy.merge(LocatorUtils.property(leftLocator, "vectorAtStart", lhsVectorAtStart), LocatorUtils.property(rightLocator, "vectorAtStart", rhsVectorAtStart), lhsVectorAtStart, rhsVectorAtStart)));
            }
            {
                VectorType lhsVectorAtEnd;
                lhsVectorAtEnd = leftObject.getVectorAtEnd();
                VectorType rhsVectorAtEnd;
                rhsVectorAtEnd = rightObject.getVectorAtEnd();
                target.setVectorAtEnd(((VectorType) strategy.merge(LocatorUtils.property(leftLocator, "vectorAtEnd", lhsVectorAtEnd), LocatorUtils.property(rightLocator, "vectorAtEnd", rhsVectorAtEnd), lhsVectorAtEnd, rhsVectorAtEnd)));
            }
            {
                CurveInterpolationType lhsInterpolation;
                lhsInterpolation = leftObject.getInterpolation();
                CurveInterpolationType rhsInterpolation;
                rhsInterpolation = rightObject.getInterpolation();
                target.setInterpolation(((CurveInterpolationType) strategy.merge(LocatorUtils.property(leftLocator, "interpolation", lhsInterpolation), LocatorUtils.property(rightLocator, "interpolation", rhsInterpolation), lhsInterpolation, rhsInterpolation)));
            }
            {
                BigInteger lhsDegree;
                lhsDegree = leftObject.getDegree();
                BigInteger rhsDegree;
                rhsDegree = rightObject.getDegree();
                target.setDegree(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "degree", lhsDegree), LocatorUtils.property(rightLocator, "degree", rhsDegree), lhsDegree, rhsDegree)));
            }
        }
    }

    public void setPosOrPointPropertyOrPointRep(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getPosOrPointPropertyOrPointRep();
        draftl.addAll(value);
    }

}
