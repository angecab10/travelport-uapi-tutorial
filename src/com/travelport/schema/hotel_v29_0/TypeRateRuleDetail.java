
package com.travelport.schema.hotel_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRateRuleDetail.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateRuleDetail">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="RatePlansOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRateRuleDetail")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
public enum TypeRateRuleDetail {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("RatePlansOnly")
    RATE_PLANS_ONLY("RatePlansOnly");
    private final String value;

    TypeRateRuleDetail(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateRuleDetail fromValue(String v) {
        for (TypeRateRuleDetail c: TypeRateRuleDetail.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
