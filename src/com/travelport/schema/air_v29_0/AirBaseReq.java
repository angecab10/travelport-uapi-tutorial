
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Context for Requests and Responses
 * 
 * <p>Java class for AirBaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirBaseReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseReq">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirBaseReq")
@XmlSeeAlso({
    AirRepriceReq.class,
    AirTicketingReq.class,
    AirUpsellSearchReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public class AirBaseReq
    extends BaseReq
{


    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
