
package org.oasis_open.docs.wsn.bw_2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.oasis_open.docs.wsn.b_2.Unsubscribe;
import org.oasis_open.docs.wsn.b_2.UnsubscribeResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6-hudson-317-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SubscriptionManager", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.oasis_open.docs.wsrf.r_2.ObjectFactory.class,
    org.oasis_open.docs.wsn.b_2.ObjectFactory.class,
    org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class,
    org.oasis_open.docs.wsn.t_1.ObjectFactory.class
})
public interface SubscriptionManager {


    /**
     * 
     * @param unsubscribeRequest
     * @return
     *     returns org.oasis_open.docs.wsn.b_2.UnsubscribeResponse
     * @throws UnableToDestroySubscriptionFault
     * @throws ResourceUnknownFault
     */
    @WebMethod(operationName = "Unsubscribe", action = "http://docs.oasis-open.org/wsn/bw-2/SubscriptionManager/UnsubscribeRequest")
    @WebResult(name = "UnsubscribeResponse", targetNamespace = "http://docs.oasis-open.org/wsn/b-2", partName = "UnsubscribeResponse")
    public UnsubscribeResponse unsubscribe(
        @WebParam(name = "Unsubscribe", targetNamespace = "http://docs.oasis-open.org/wsn/b-2", partName = "UnsubscribeRequest")
        Unsubscribe unsubscribeRequest)
        throws ResourceUnknownFault, UnableToDestroySubscriptionFault
    ;

}
