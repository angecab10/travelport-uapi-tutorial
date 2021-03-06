package com.travelport.service.vehicle_v29_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:09:00.745-06:00
 * Generated source version: 2.7.12
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/vehicle_v29_0", name = "VehicleRetrieveServicePortType")
@XmlSeeAlso({com.travelport.schema.common_v29_0.ObjectFactory.class, com.travelport.schema.vehicle_v29_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VehicleRetrieveServicePortType {

    @WebResult(name = "VehicleRetrieveRsp", targetNamespace = "http://www.travelport.com/schema/vehicle_v29_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/VehicleService")
    public com.travelport.schema.vehicle_v29_0.VehicleRetrieveRsp service(
        @WebParam(partName = "parameters", name = "VehicleRetrieveReq", targetNamespace = "http://www.travelport.com/schema/vehicle_v29_0")
        com.travelport.schema.vehicle_v29_0.VehicleRetrieveReq parameters
    ) throws VehicleFaultMessage;
}
