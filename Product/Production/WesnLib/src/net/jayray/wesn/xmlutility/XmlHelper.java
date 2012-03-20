package net.jayray.wesn.xmlutility;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.*;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSParser;


/**
 *
 * @author rayj
 */
public class XmlHelper {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(XmlHelper.class);

    public static String serializeNode(Node node) throws LSException, IllegalAccessException, DOMException, InstantiationException, ClassNotFoundException, ClassCastException {
        System.setProperty(DOMImplementationRegistry.PROPERTY, "org.apache.xerces.dom.DOMImplementationSourceImpl");
        DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
        DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
        LSSerializer writer = impl.createLSSerializer();
        String serializedElement = writer.writeToString(node);
        return serializedElement;
    }

    public static String serializeNodeIgnoreFaults(Node node) {
        String serializedNode = null;
        try {
            serializedNode = serializeNode(node);
        } catch (Exception ex) {
            log.error("Failed to serialize node." , ex);
            serializedNode = "???";
        }
        return serializedNode;

    }

}
