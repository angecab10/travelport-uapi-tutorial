
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.hotel_v29_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:09:40.970-06:00
 * Generated source version: 2.7.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelService",
                      portName = "HotelDetailsServicePort",
                      targetNamespace = "http://www.travelport.com/service/hotel_v29_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/hotel_v29_0/Hotel.wsdl",
                      endpointInterface = "com.travelport.service.hotel_v29_0.HotelDetailsServicePortType")
                      
public class HotelDetailsServicePortTypeImpl implements HotelDetailsServicePortType {

    private static final Logger LOG = Logger.getLogger(HotelDetailsServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.hotel_v29_0.HotelDetailsServicePortType#service(com.travelport.schema.hotel_v29_0.HotelDetailsReq  parameters )*
     */
    public com.travelport.schema.hotel_v29_0.HotelDetailsRsp service(com.travelport.schema.hotel_v29_0.HotelDetailsReq parameters) throws HotelFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.hotel_v29_0.HotelDetailsRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new HotelFaultMessage("HotelFaultMessage...");
    }

}
