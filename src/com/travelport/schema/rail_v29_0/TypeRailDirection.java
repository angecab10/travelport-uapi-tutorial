
package com.travelport.schema.rail_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRailDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRailDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inbound"/>
 *     &lt;enumeration value="Outbound"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRailDirection")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeRailDirection {

    @XmlEnumValue("Inbound")
    INBOUND("Inbound"),
    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeRailDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRailDirection fromValue(String v) {
        for (TypeRailDirection c: TypeRailDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
