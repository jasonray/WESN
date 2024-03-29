
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;
import org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6-hudson-317-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidProducerPropertiesExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidProducerPropertiesExpressionFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidProducerPropertiesExpressionFaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidProducerPropertiesExpressionFault(String message, InvalidProducerPropertiesExpressionFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidProducerPropertiesExpressionFault(String message, InvalidProducerPropertiesExpressionFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType
     */
    public InvalidProducerPropertiesExpressionFaultType getFaultInfo() {
        return faultInfo;
    }

}
