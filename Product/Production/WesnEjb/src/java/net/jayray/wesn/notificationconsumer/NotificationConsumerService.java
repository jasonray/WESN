/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.jayray.wesn.notificationconsumer;

import javax.ejb.Stateless;
import javax.jws.WebService;
import org.oasis_open.docs.wsn.bw_2.NotificationConsumer;

/**
 *
 * @author rayj
 */
@WebService(serviceName = "NotificationConsumerService", portName = "NotificationConsumerPort", endpointInterface = "org.oasis_open.docs.wsn.bw_2.NotificationConsumer", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", wsdlLocation = "META-INF/wsdl/NotificationConsumerService/WSN.wsdl")
@Stateless
public class NotificationConsumerService implements NotificationConsumer {

    public void notify(org.oasis_open.docs.wsn.b_2.Notify notify) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
