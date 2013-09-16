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
 * <p>Java-Klasse für IdentifierGenerationOptionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentifierGenerationOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UseExisting"/>
 *     &lt;enumeration value="ReplaceDuplicate"/>
 *     &lt;enumeration value="GenerateNew"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentifierGenerationOptionType")
@XmlEnum
public enum IdentifierGenerationOptionType {


    /**
     * 
     *                   The UseExsiting value indicates that WFS should not
     *                   generate a new feature identifier for the feature
     *                   being inserted into the repositry.  Instead, the WFS
     *                   should use the identifier encoded if the feature.  
     *                   If a duplicate exists then the WFS should raise an
     *                   exception.
     *                
     * 
     */
    @XmlEnumValue("UseExisting")
    USE_EXISTING("UseExisting"),

    /**
     * 
     *                   The ReplaceDuplicate value indicates that WFS should
     *                   not generate a new feature identifier for the feature
     *                   being inserted into the repositry.  Instead, the WFS
     *                   should use the identifier encoded if the feature.  
     *                   If a duplicate exists then the WFS should replace the
     *                   existing feature instance with the one encoded in the
     *                   Insert action.
     *                
     * 
     */
    @XmlEnumValue("ReplaceDuplicate")
    REPLACE_DUPLICATE("ReplaceDuplicate"),

    /**
     * 
     *                   The GenerateNew value indicates that WFS should
     *                   generate a new unique feature identifier for the
     *                   feature being inserted into the repositry.
     *                
     * 
     */
    @XmlEnumValue("GenerateNew")
    GENERATE_NEW("GenerateNew");
    private final String value;

    IdentifierGenerationOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentifierGenerationOptionType fromValue(String v) {
        for (IdentifierGenerationOptionType c: IdentifierGenerationOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
