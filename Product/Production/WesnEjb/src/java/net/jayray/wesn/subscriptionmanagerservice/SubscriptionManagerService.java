/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.jayray.wesn.subscriptionmanagerservice;

import javax.ejb.Stateless;
import javax.jws.WebService;
import org.oasis_open.docs.wsn.bw_2.ResourceUnknownFault;
import org.oasis_open.docs.wsn.bw_2.SubscriptionManager;
import org.oasis_open.docs.wsn.bw_2.UnableToDestroySubscriptionFault;

/**
 *
 * @author rayj
 */
@WebService(serviceName = "SubscriptionManagerService", portName = "SubscriptionManagerPort", endpointInterface = "org.oasis_open.docs.wsn.bw_2.SubscriptionManager", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", wsdlLocation = "META-INF/wsdl/SubscriptionManagerService/WSN.wsdl")
@Stateless
public class SubscriptionManagerService implements SubscriptionManager {

    public org.oasis_open.docs.wsn.b_2.UnsubscribeResponse unsubscribe(org.oasis_open.docs.wsn.b_2.Unsubscribe unsubscribeRequest) throws ResourceUnknownFault, UnableToDestroySubscriptionFault {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
