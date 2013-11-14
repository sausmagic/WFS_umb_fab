//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AesheticCriteriaType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AesheticCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIN_CROSSINGS"/>
 *     &lt;enumeration value="MIN_AREA"/>
 *     &lt;enumeration value="MIN_BENDS"/>
 *     &lt;enumeration value="MAX_BENDS"/>
 *     &lt;enumeration value="UNIFORM_BENDS"/>
 *     &lt;enumeration value="MIN_SLOPES"/>
 *     &lt;enumeration value="MIN_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_EDGE_LENGTH"/>
 *     &lt;enumeration value="UNIFORM_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_ANGULAR_RESOLUTION"/>
 *     &lt;enumeration value="MIN_ASPECT_RATIO"/>
 *     &lt;enumeration value="MAX_SYMMETRIES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AesheticCriteriaType")
@XmlEnum
public enum AesheticCriteriaType {

    MIN_CROSSINGS,
    MIN_AREA,
    MIN_BENDS,
    MAX_BENDS,
    UNIFORM_BENDS,
    MIN_SLOPES,
    MIN_EDGE_LENGTH,
    MAX_EDGE_LENGTH,
    UNIFORM_EDGE_LENGTH,
    MAX_ANGULAR_RESOLUTION,
    MIN_ASPECT_RATIO,
    MAX_SYMMETRIES;

    public String value() {
        return name();
    }

    public static AesheticCriteriaType fromValue(String v) {
        return valueOf(v);
    }

}
