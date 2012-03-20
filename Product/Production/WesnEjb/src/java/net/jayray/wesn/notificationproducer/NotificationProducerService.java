/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.jayray.wesn.notificationproducer;

import javax.ejb.Stateless;
import javax.jws.WebService;
import org.oasis_open.docs.wsn.bw_2.InvalidFilterFault;
import org.oasis_open.docs.wsn.bw_2.InvalidMessageContentExpressionFault;
import org.oasis_open.docs.wsn.bw_2.InvalidProducerPropertiesExpressionFault;
import org.oasis_open.docs.wsn.bw_2.InvalidTopicExpressionFault;
import org.oasis_open.docs.wsn.bw_2.NotificationProducer;
import org.oasis_open.docs.wsn.bw_2.NotifyMessageNotSupportedFault;
import org.oasis_open.docs.wsn.bw_2.ResourceUnknownFault;
import org.oasis_open.docs.wsn.bw_2.SubscribeCreationFailedFault;
import org.oasis_open.docs.wsn.bw_2.TopicExpressionDialectUnknownFault;
import org.oasis_open.docs.wsn.bw_2.TopicNotSupportedFault;
import org.oasis_open.docs.wsn.bw_2.UnacceptableInitialTerminationTimeFault;
import org.oasis_open.docs.wsn.bw_2.UnrecognizedPolicyRequestFault;
import org.oasis_open.docs.wsn.bw_2.UnsupportedPolicyRequestFault;

/**
 *
 * @author rayj
 */
@WebService(serviceName = "NotificationProducerService", portName = "NotificationProducerPort", endpointInterface = "org.oasis_open.docs.wsn.bw_2.NotificationProducer", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", wsdlLocation = "META-INF/wsdl/NotificationProducerService/WSN.wsdl")
@Stateless
public class NotificationProducerService implements NotificationProducer {

    public org.oasis_open.docs.wsn.b_2.SubscribeResponse subscribe(org.oasis_open.docs.wsn.b_2.Subscribe subscribeRequest) throws InvalidMessageContentExpressionFault, TopicNotSupportedFault, NotifyMessageNotSupportedFault, ResourceUnknownFault, UnrecognizedPolicyRequestFault, TopicExpressionDialectUnknownFault, UnacceptableInitialTerminationTimeFault, InvalidProducerPropertiesExpressionFault, SubscribeCreationFailedFault, UnsupportedPolicyRequestFault, InvalidFilterFault, InvalidTopicExpressionFault {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
