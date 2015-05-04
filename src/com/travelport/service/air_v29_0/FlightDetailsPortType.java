package com.travelport.service.air_v29_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:10:05.282-06:00
 * Generated source version: 2.7.12
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v29_0", name = "FlightDetailsPortType")
@XmlSeeAlso({com.travelport.schema.rail_v29_0.ObjectFactory.class, com.travelport.schema.common_v29_0.ObjectFactory.class, com.travelport.schema.air_v29_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface FlightDetailsPortType {

    @WebResult(name = "FlightDetailsRsp", targetNamespace = "http://www.travelport.com/schema/air_v29_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/FlightService")
    public com.travelport.schema.air_v29_0.FlightDetailsRsp service(
        @WebParam(partName = "parameters", name = "FlightDetailsReq", targetNamespace = "http://www.travelport.com/schema/air_v29_0")
        com.travelport.schema.air_v29_0.FlightDetailsReq parameters
    ) throws AirFaultMessage;
}