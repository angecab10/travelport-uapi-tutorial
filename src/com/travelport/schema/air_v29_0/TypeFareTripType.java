
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareTripType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareTripType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="OneWayOnly"/>
 *     &lt;enumeration value="Return"/>
 *     &lt;enumeration value="ReturnOnly"/>
 *     &lt;enumeration value="HalfReturn"/>
 *     &lt;enumeration value="CircleTrip"/>
 *     &lt;enumeration value="RoundTheWorld"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareTripType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeFareTripType {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("ReturnOnly")
    RETURN_ONLY("ReturnOnly"),
    @XmlEnumValue("HalfReturn")
    HALF_RETURN("HalfReturn"),
    @XmlEnumValue("CircleTrip")
    CIRCLE_TRIP("CircleTrip"),
    @XmlEnumValue("RoundTheWorld")
    ROUND_THE_WORLD("RoundTheWorld");
    private final String value;

    TypeFareTripType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareTripType fromValue(String v) {
        for (TypeFareTripType c: TypeFareTripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
