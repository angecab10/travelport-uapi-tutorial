
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v29_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:09:00.685-06:00
 * Generated source version: 2.7.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleKeywordsServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v29_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/vehicle_v29_0/Vehicle.wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v29_0.VehicleKeywordsServicePortType")
                      
public class VehicleKeywordsServicePortTypeImpl implements VehicleKeywordsServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleKeywordsServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v29_0.VehicleKeywordsServicePortType#service(com.travelport.schema.vehicle_v29_0.VehicleKeywordReq  parameters )*
     */
    public com.travelport.schema.vehicle_v29_0.VehicleKeywordRsp service(com.travelport.schema.vehicle_v29_0.VehicleKeywordReq parameters) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.vehicle_v29_0.VehicleKeywordRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}