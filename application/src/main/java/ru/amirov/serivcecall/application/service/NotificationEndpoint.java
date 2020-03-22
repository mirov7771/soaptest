package ru.amirov.serivcecall.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.mtsbank.support.ContextData;
import ru.mtsbank.support.ServiceCall;
import ru.mtsbank.support.ServiceCallResponse;

import java.util.Map;

@Endpoint
public class NotificationEndpoint {

    private static final String TARGET_NAMESPACE = "http://www.support.mtsbank.ru";

    @Autowired
    private Map<String, NotificationService> notificationServices;

    @PayloadRoot(namespace = TARGET_NAMESPACE, localPart = "serviceCall")
    @ResponsePayload
    public ServiceCallResponse serviceCall(@RequestPayload ServiceCall serviceCallReq){
        ServiceCallResponse response = new ServiceCallResponse();
        String serviceName = serviceCallReq.getCommandtext();
        String request = serviceCallReq.getCommanddata();
        ContextData contextData = serviceCallReq.getContextdata();
        System.out.println("Calling service ["+serviceName+"] with params ["+request+"]");
        NotificationService service = notificationServices.get(serviceName);
        try{
            String message = service.handleRequest(request, contextData);
            response.setCommandresult(message);
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        return response;
    }

}
