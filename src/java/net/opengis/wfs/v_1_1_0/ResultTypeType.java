//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResultTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="results"/>
 *     &lt;enumeration value="hits"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultTypeType")
@XmlEnum
public enum ResultTypeType {


    /**
     * 
     *                   Indicates that a complete response should be generated
     *                   by the WFS.  That is, all response feature instances
     *                   should be returned to the client.
     *                
     * 
     */
    @XmlEnumValue("results")
    RESULTS("results"),

    /**
     * 
     *                   Indicates that an empty response should be generated with
     *                   the "numberOfFeatures" attribute set (i.e. no feature
     *                   instances should be returned).  In this manner a client may
     *                   determine the number of feature instances that a GetFeature
     *                   request will return without having to actually get the 
     *                   entire result set back.
     *                
     * 
     */
    @XmlEnumValue("hits")
    HITS("hits");
    private final String value;

    ResultTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultTypeType fromValue(String v) {
        for (ResultTypeType c: ResultTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
