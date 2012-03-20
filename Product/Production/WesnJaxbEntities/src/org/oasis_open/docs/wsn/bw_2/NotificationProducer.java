
package org.oasis_open.docs.wsn.bw_2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.oasis_open.docs.wsn.b_2.Subscribe;
import org.oasis_open.docs.wsn.b_2.SubscribeResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6-hudson-317-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NotificationProducer", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.oasis_open.docs.wsrf.r_2.ObjectFactory.class,
    org.oasis_open.docs.wsn.b_2.ObjectFactory.class,
    org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class,
    org.oasis_open.docs.wsn.t_1.ObjectFactory.class
})
public interface NotificationProducer {


    /**
     * 
     * @param subscribeRequest
     * @return
     *     returns org.oasis_open.docs.wsn.b_2.SubscribeResponse
     * @throws UnrecognizedPolicyRequestFault
     * @throws SubscribeCreationFailedFault
     * @throws InvalidMessageContentExpressionFault
     * @throws InvalidFilterFault
     * @throws UnsupportedPolicyRequestFault
     * @throws NotifyMessageNotSupportedFault
     * @throws ResourceUnknownFault
     * @throws UnacceptableInitialTerminationTimeFault
     * @throws InvalidProducerPropertiesExpressionFault
     * @throws TopicNotSupportedFault
     * @throws InvalidTopicExpressionFault
     * @throws TopicExpressionDialectUnknownFault
     */
    @WebMethod(operationName = "Subscribe", action = "http://docs.oasis-open.org/wsn/bw-2/NotificationProducer/SubscribeRequest")
    @WebResult(name = "SubscribeResponse", targetNamespace = "http://docs.oasis-open.org/wsn/b-2", partName = "SubscribeResponse")
    public SubscribeResponse subscribe(
        @WebParam(name = "Subscribe", targetNamespace = "http://docs.oasis-open.org/wsn/b-2", partName = "SubscribeRequest")
        Subscribe subscribeRequest)
        throws InvalidFilterFault, InvalidMessageContentExpressionFault, InvalidProducerPropertiesExpressionFault, InvalidTopicExpressionFault, NotifyMessageNotSupportedFault, ResourceUnknownFault, SubscribeCreationFailedFault, TopicExpressionDialectUnknownFault, TopicNotSupportedFault, UnacceptableInitialTerminationTimeFault, UnrecognizedPolicyRequestFault, UnsupportedPolicyRequestFault
    ;

}
