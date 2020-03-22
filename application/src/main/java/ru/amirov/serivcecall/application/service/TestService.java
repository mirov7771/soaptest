package ru.amirov.serivcecall.application.service;

import org.springframework.stereotype.Component;
import ru.mtsbank.support.ContextData;

import java.util.Date;

@Component("testService")
public class TestService implements NotificationService {

    @Override
    public String handleRequest(String xmlRequest, ContextData contextData) throws Exception {
        System.out.println("Start call testService at: "+new Date());
        System.out.println("get params: "+xmlRequest);
        System.out.println("Context: "+contextData.getSessionId());
        String response = "Finish method  with params "+xmlRequest;
        System.out.println(response);
        return response;
    }
}
