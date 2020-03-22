package ru.amirov.soaptest.soaptestws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.amirov.soaptest.soaptestws.repository.CountryRepository;
import ru.amirov.soaptest.soaptestws.wsdl.GetCountryRequest;
import ru.amirov.soaptest.soaptestws.wsdl.GetCountryResponse;

@Endpoint
public class CountryEndpoint {

    private static final String TARGET_NAMESPACE = "http://www.wsdl.soaptestws.soaptest.amirov.ru/";

    @Autowired
    private CountryRepository countryRepository;

    @PayloadRoot(namespace = TARGET_NAMESPACE, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request){
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }

}
