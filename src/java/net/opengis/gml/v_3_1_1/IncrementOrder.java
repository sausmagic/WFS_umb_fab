//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.30 um 11:49:39 PM CET 
//


package net.opengis.gml.v_3_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IncrementOrder.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IncrementOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="+x+y"/>
 *     &lt;enumeration value="+y+x"/>
 *     &lt;enumeration value="+x-y"/>
 *     &lt;enumeration value="-x-y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncrementOrder")
@XmlEnum
public enum IncrementOrder {

    @XmlEnumValue("+x+y")
    PLUS_X_PLUS_Y("+x+y"),
    @XmlEnumValue("+y+x")
    Y_X("+y+x"),
    @XmlEnumValue("+x-y")
    PLUS_X_MINUS_Y("+x-y"),
    @XmlEnumValue("-x-y")
    MINUS_X_MINUS_Y("-x-y");
    private final String value;

    IncrementOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncrementOrder fromValue(String v) {
        for (IncrementOrder c: IncrementOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
