package ru.amirov.serivcecall.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import ru.mtsbank.support.ContextData;
import ru.mtsbank.support.ServiceCallAsync;

import java.util.Map;

@Endpoint
public class NotificationAsyncEndpoint {

    private static final String TARGET_NAMESPACE = "http://www.support.mtsbank.ru";

    @Autowired
    private Map<String, NotificationService> notificationServices;

    @PayloadRoot(namespace = TARGET_NAMESPACE, localPart = "serviceCallAsync")
    public void serviceCallAsync(@RequestPayload ServiceCallAsync serviceCallAsyncReq){
        String serviceName = serviceCallAsyncReq.getCommandtext();
        String request = serviceCallAsyncReq.getCommanddata();
        ContextData contextData = serviceCallAsyncReq.getContextdata();
        System.out.println("Start async ["+serviceName+"] with params ["+request+"]");
        NotificationService service = notificationServices.get(serviceName);
        try{
            System.out.println("Calling "+service.getClass());
            service.handleRequest(request, contextData);
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
    }

}
