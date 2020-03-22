package ru.amirov.serivcecall.application.service;

import ru.mtsbank.support.ContextData;

public interface NotificationService {

    String handleRequest(String xmlRequest, ContextData contextData) throws Exception;

}
