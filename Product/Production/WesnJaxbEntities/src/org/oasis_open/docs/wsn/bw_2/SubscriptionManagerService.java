
package org.oasis_open.docs.wsn.bw_2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6-hudson-317-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SubscriptionManagerService", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", wsdlLocation = "file:/C:/Projects/WeSN/trunk/Product/Production/WesnEjb/src/conf/xml-resources/web-services/NotificationProducerService/wsdl/WSN.wsdl")
public class SubscriptionManagerService
    extends Service
{

    private final static URL SUBSCRIPTIONMANAGERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.oasis_open.docs.wsn.bw_2.SubscriptionManagerService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.oasis_open.docs.wsn.bw_2.SubscriptionManagerService.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Projects/WeSN/trunk/Product/Production/WesnEjb/src/conf/xml-resources/web-services/NotificationProducerService/wsdl/WSN.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Projects/WeSN/trunk/Product/Production/WesnEjb/src/conf/xml-resources/web-services/NotificationProducerService/wsdl/WSN.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SUBSCRIPTIONMANAGERSERVICE_WSDL_LOCATION = url;
    }

    public SubscriptionManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SubscriptionManagerService() {
        super(SUBSCRIPTIONMANAGERSERVICE_WSDL_LOCATION, new QName("http://docs.oasis-open.org/wsn/bw-2", "SubscriptionManagerService"));
    }

    /**
     * 
     * @return
     *     returns SubscriptionManager
     */
    @WebEndpoint(name = "SubscriptionManagerPort")
    public SubscriptionManager getSubscriptionManagerPort() {
        return super.getPort(new QName("http://docs.oasis-open.org/wsn/bw-2", "SubscriptionManagerPort"), SubscriptionManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SubscriptionManager
     */
    @WebEndpoint(name = "SubscriptionManagerPort")
    public SubscriptionManager getSubscriptionManagerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://docs.oasis-open.org/wsn/bw-2", "SubscriptionManagerPort"), SubscriptionManager.class, features);
    }

}