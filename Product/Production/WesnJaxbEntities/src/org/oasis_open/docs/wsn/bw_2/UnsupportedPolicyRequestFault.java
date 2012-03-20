
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;
import org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6-hudson-317-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "UnsupportedPolicyRequestFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnsupportedPolicyRequestFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnsupportedPolicyRequestFaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnsupportedPolicyRequestFault(String message, UnsupportedPolicyRequestFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnsupportedPolicyRequestFault(String message, UnsupportedPolicyRequestFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType
     */
    public UnsupportedPolicyRequestFaultType getFaultInfo() {
        return faultInfo;
    }

}