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
 * <p>Java-Klasse für QueryGrammarEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryGrammarEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="xquery"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryGrammarEnumeration")
@XmlEnum
public enum QueryGrammarEnumeration {

    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("xquery")
    XQUERY("xquery"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    QueryGrammarEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryGrammarEnumeration fromValue(String v) {
        for (QueryGrammarEnumeration c: QueryGrammarEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
