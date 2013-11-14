//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * A cone is a gridded surface given as a
 *    family of conic sections whose control points vary linearly.
 *    NOTE! A 5-point ellipse with all defining positions identical
 *    is a point. Thus, a truncated elliptical cone can be given as a
 *    2x5 set of control points
 *    ((P1, P1, P1, P1, P1), (P2, P3, P4, P5, P6)). P1 is the apex 
 *    of the cone. P2, P3,P4, P5 and P6 are any five distinct points
 *    around the base ellipse of the cone. If the horizontal curves
 *    are circles as opposed to ellipses, the a circular cone can
 *    be constructed using ((P1, P1, P1),(P2, P3, P4)). The apex most     
 *    not coinside with the other plane.
 * 
 * <p>Java-Klasse für ConeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGriddedSurfaceType">
 *       &lt;attribute name="horizontalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc3Points" />
 *       &lt;attribute name="verticalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="linear" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConeType")
public class ConeType
    extends AbstractGriddedSurfaceType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAttribute(name = "horizontalCurveType")
    protected CurveInterpolationType horizontalCurveType;
    @XmlAttribute(name = "verticalCurveType")
    protected CurveInterpolationType verticalCurveType;

    /**
     * Ruft den Wert der horizontalCurveType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getHorizontalCurveType() {
        if (horizontalCurveType == null) {
            return CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
        } else {
            return horizontalCurveType;
        }
    }

    /**
     * Legt den Wert der horizontalCurveType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setHorizontalCurveType(CurveInterpolationType value) {
        this.horizontalCurveType = value;
    }

    public boolean isSetHorizontalCurveType() {
        return (this.horizontalCurveType!= null);
    }

    /**
     * Ruft den Wert der verticalCurveType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getVerticalCurveType() {
        if (verticalCurveType == null) {
            return CurveInterpolationType.LINEAR;
        } else {
            return verticalCurveType;
        }
    }

    /**
     * Legt den Wert der verticalCurveType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setVerticalCurveType(CurveInterpolationType value) {
        this.verticalCurveType = value;
    }

    public boolean isSetVerticalCurveType() {
        return (this.verticalCurveType!= null);
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
            CurveInterpolationType theHorizontalCurveType;
            theHorizontalCurveType = this.getHorizontalCurveType();
            strategy.appendField(locator, this, "horizontalCurveType", buffer, theHorizontalCurveType);
        }
        {
            CurveInterpolationType theVerticalCurveType;
            theVerticalCurveType = this.getVerticalCurveType();
            strategy.appendField(locator, this, "verticalCurveType", buffer, theVerticalCurveType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConeType that = ((ConeType) object);
        {
            CurveInterpolationType lhsHorizontalCurveType;
            lhsHorizontalCurveType = this.getHorizontalCurveType();
            CurveInterpolationType rhsHorizontalCurveType;
            rhsHorizontalCurveType = that.getHorizontalCurveType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "horizontalCurveType", lhsHorizontalCurveType), LocatorUtils.property(thatLocator, "horizontalCurveType", rhsHorizontalCurveType), lhsHorizontalCurveType, rhsHorizontalCurveType)) {
                return false;
            }
        }
        {
            CurveInterpolationType lhsVerticalCurveType;
            lhsVerticalCurveType = this.getVerticalCurveType();
            CurveInterpolationType rhsVerticalCurveType;
            rhsVerticalCurveType = that.getVerticalCurveType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalCurveType", lhsVerticalCurveType), LocatorUtils.property(thatLocator, "verticalCurveType", rhsVerticalCurveType), lhsVerticalCurveType, rhsVerticalCurveType)) {
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
            CurveInterpolationType theHorizontalCurveType;
            theHorizontalCurveType = this.getHorizontalCurveType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "horizontalCurveType", theHorizontalCurveType), currentHashCode, theHorizontalCurveType);
        }
        {
            CurveInterpolationType theVerticalCurveType;
            theVerticalCurveType = this.getVerticalCurveType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalCurveType", theVerticalCurveType), currentHashCode, theVerticalCurveType);
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
        if (draftCopy instanceof ConeType) {
            final ConeType copy = ((ConeType) draftCopy);
            if (this.isSetHorizontalCurveType()) {
                CurveInterpolationType sourceHorizontalCurveType;
                sourceHorizontalCurveType = this.getHorizontalCurveType();
                CurveInterpolationType copyHorizontalCurveType = ((CurveInterpolationType) strategy.copy(LocatorUtils.property(locator, "horizontalCurveType", sourceHorizontalCurveType), sourceHorizontalCurveType));
                copy.setHorizontalCurveType(copyHorizontalCurveType);
            } else {
                copy.horizontalCurveType = null;
            }
            if (this.isSetVerticalCurveType()) {
                CurveInterpolationType sourceVerticalCurveType;
                sourceVerticalCurveType = this.getVerticalCurveType();
                CurveInterpolationType copyVerticalCurveType = ((CurveInterpolationType) strategy.copy(LocatorUtils.property(locator, "verticalCurveType", sourceVerticalCurveType), sourceVerticalCurveType));
                copy.setVerticalCurveType(copyVerticalCurveType);
            } else {
                copy.verticalCurveType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConeType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ConeType) {
            final ConeType target = this;
            final ConeType leftObject = ((ConeType) left);
            final ConeType rightObject = ((ConeType) right);
            {
                CurveInterpolationType lhsHorizontalCurveType;
                lhsHorizontalCurveType = leftObject.getHorizontalCurveType();
                CurveInterpolationType rhsHorizontalCurveType;
                rhsHorizontalCurveType = rightObject.getHorizontalCurveType();
                target.setHorizontalCurveType(((CurveInterpolationType) strategy.merge(LocatorUtils.property(leftLocator, "horizontalCurveType", lhsHorizontalCurveType), LocatorUtils.property(rightLocator, "horizontalCurveType", rhsHorizontalCurveType), lhsHorizontalCurveType, rhsHorizontalCurveType)));
            }
            {
                CurveInterpolationType lhsVerticalCurveType;
                lhsVerticalCurveType = leftObject.getVerticalCurveType();
                CurveInterpolationType rhsVerticalCurveType;
                rhsVerticalCurveType = rightObject.getVerticalCurveType();
                target.setVerticalCurveType(((CurveInterpolationType) strategy.merge(LocatorUtils.property(leftLocator, "verticalCurveType", lhsVerticalCurveType), LocatorUtils.property(rightLocator, "verticalCurveType", rhsVerticalCurveType), lhsVerticalCurveType, rhsVerticalCurveType)));
            }
        }
    }

}
