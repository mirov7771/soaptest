package ru.armirov.springcourse.gates;

import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.soap.*;

@Component
public class SoapTest {

    private static final String namespaceURI = "http://www.support.mtsbank.ru";
    private static final String soapUrl = "http://localhost:8080/dbo-early-repayment/ws/";
    private static final String serviceName = "serviceCallAsync";

    public void test(String destination,String soapAction) throws SOAPException {

        SOAPConnectionFactory soapFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapFactory.createConnection();
        SOAPMessage request = createSOAPRequest(soapAction);
        SOAPMessage response = soapConnection.call(request, destination);
        soapConnection.close();
    }

    private SOAPMessage createSOAPRequest(String soapAction) throws SOAPException {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        return soapMessage;
    }

    private void createSoapEnvelope(SOAPMessage soapMessage)
            throws SOAPException
    {
        String namespace = "ns";
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(namespace, namespaceURI);

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement element = soapBody.addChildElement(serviceName, namespace);

        SOAPElement commandtext = element.addChildElement("commandtext", namespace);
        commandtext.addTextNode("testService");

        SOAPElement commanddata = element.addChildElement("commanddata", namespace);
        commanddata.addTextNode("11111111");

        SOAPElement contextdata = element.addChildElement("contextdata", namespace);
        SOAPElement sessionId = contextdata.addChildElement("sessionId", namespace);
        sessionId.addTextNode("12121323");
    }

}
