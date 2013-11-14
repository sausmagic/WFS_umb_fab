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
 * A LinearRing is defined by four or more coordinate tuples, with linear interpolation between them; the first and last coordinates must be coincident.
 * 
 * <p>Java-Klasse für LinearRingType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinearRingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractRingType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="4">
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coord" maxOccurs="unbounded" minOccurs="4"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearRingType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "coord"
})
public class LinearRingType
    extends AbstractRingType
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
    protected List<CoordType> coord;

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
     * Deprecated with GML version 3.0 and included for backwards compatibility with GML 2. Use "pos" elements instead.Gets the value of the coord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordType }
     * 
     * 
     */
    public List<CoordType> getCoord() {
        if (coord == null) {
            coord = new ArrayList<CoordType>();
        }
        return this.coord;
    }

    public boolean isSetCoord() {
        return ((this.coord!= null)&&(!this.coord.isEmpty()));
    }

    public void unsetCoord() {
        this.coord = null;
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
            List<CoordType> theCoord;
            theCoord = this.getCoord();
            strategy.appendField(locator, this, "coord", buffer, theCoord);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LinearRingType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final LinearRingType that = ((LinearRingType) object);
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
            List<CoordType> lhsCoord;
            lhsCoord = this.getCoord();
            List<CoordType> rhsCoord;
            rhsCoord = that.getCoord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coord", lhsCoord), LocatorUtils.property(thatLocator, "coord", rhsCoord), lhsCoord, rhsCoord)) {
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
            List<CoordType> theCoord;
            theCoord = this.getCoord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coord", theCoord), currentHashCode, theCoord);
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
        if (draftCopy instanceof LinearRingType) {
            final LinearRingType copy = ((LinearRingType) draftCopy);
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
            if (this.isSetCoord()) {
                List<CoordType> sourceCoord;
                sourceCoord = this.getCoord();
                @SuppressWarnings("unchecked")
                List<CoordType> copyCoord = ((List<CoordType> ) strategy.copy(LocatorUtils.property(locator, "coord", sourceCoord), sourceCoord));
                copy.unsetCoord();
                List<CoordType> uniqueCoordl = copy.getCoord();
                uniqueCoordl.addAll(copyCoord);
            } else {
                copy.unsetCoord();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LinearRingType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof LinearRingType) {
            final LinearRingType target = this;
            final LinearRingType leftObject = ((LinearRingType) left);
            final LinearRingType rightObject = ((LinearRingType) right);
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
                List<CoordType> lhsCoord;
                lhsCoord = leftObject.getCoord();
                List<CoordType> rhsCoord;
                rhsCoord = rightObject.getCoord();
                target.unsetCoord();
                List<CoordType> uniqueCoordl = target.getCoord();
                uniqueCoordl.addAll(((List<CoordType> ) strategy.merge(LocatorUtils.property(leftLocator, "coord", lhsCoord), LocatorUtils.property(rightLocator, "coord", rhsCoord), lhsCoord, rhsCoord)));
            }
        }
    }

    public void setPosOrPointPropertyOrPointRep(List<JAXBElement<?>> value) {
        List<JAXBElement<?>> draftl = this.getPosOrPointPropertyOrPointRep();
        draftl.addAll(value);
    }

    public void setCoord(List<CoordType> value) {
        List<CoordType> draftl = this.getCoord();
        draftl.addAll(value);
    }

}
