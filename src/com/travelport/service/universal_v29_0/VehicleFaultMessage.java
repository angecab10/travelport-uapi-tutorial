
package com.travelport.service.universal_v29_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:08:09.752-06:00
 * Generated source version: 2.7.12
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v29_0")
public class VehicleFaultMessage extends Exception {
    
    private com.travelport.schema.common_v29_0.ErrorInfo errorInfo;

    public VehicleFaultMessage() {
        super();
    }
    
    public VehicleFaultMessage(String message) {
        super(message);
    }
    
    public VehicleFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleFaultMessage(String message, com.travelport.schema.common_v29_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public VehicleFaultMessage(String message, com.travelport.schema.common_v29_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v29_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}
