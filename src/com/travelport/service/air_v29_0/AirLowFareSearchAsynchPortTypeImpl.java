
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v29_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:10:05.042-06:00
 * Generated source version: 2.7.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirLowFareSearchAsynchPort",
                      targetNamespace = "http://www.travelport.com/service/air_v29_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/air_v29_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v29_0.AirLowFareSearchAsynchPortType")
                      
public class AirLowFareSearchAsynchPortTypeImpl implements AirLowFareSearchAsynchPortType {

    private static final Logger LOG = Logger.getLogger(AirLowFareSearchAsynchPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v29_0.AirLowFareSearchAsynchPortType#service(com.travelport.schema.air_v29_0.LowFareSearchAsynchReq  parameters )*
     */
    public com.travelport.schema.air_v29_0.LowFareSearchAsynchRsp service(com.travelport.schema.air_v29_0.LowFareSearchAsynchReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v29_0.LowFareSearchAsynchRsp _return = new com.travelport.schema.air_v29_0.LowFareSearchAsynchRsp();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
