//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:37 PM EDT 
//


package org.sierraecg.schema.jaxb._1_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TYPEacquisitiontype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TYPEacquisitiontype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIDA"/>
 *     &lt;enumeration value="EASI"/>
 *     &lt;enumeration value="STD-12"/>
 *     &lt;enumeration value="STD-15"/>
 *     &lt;enumeration value="STD-16"/>
 *     &lt;enumeration value="STD-18"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TYPEacquisitiontype")
@XmlEnum
public enum TYPEacquisitiontype {

    MIDA("MIDA"),
    EASI("EASI"),
    @XmlEnumValue("STD-12")
    STD_12("STD-12"),
    @XmlEnumValue("STD-15")
    STD_15("STD-15"),
    @XmlEnumValue("STD-16")
    STD_16("STD-16"),
    @XmlEnumValue("STD-18")
    STD_18("STD-18");
    private final String value;

    TYPEacquisitiontype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TYPEacquisitiontype fromValue(String v) {
        for (TYPEacquisitiontype c: TYPEacquisitiontype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
