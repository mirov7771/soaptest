package ru.amirov.soaptest.soaptestws.repository;

import org.springframework.stereotype.Component;
import ru.amirov.soaptest.soaptestws.wsdl.Country;
import ru.amirov.soaptest.soaptestws.wsdl.Currency;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData(){
        Country russia = new Country();
        russia.setName("Russia");
        russia.setCapital("Moscow");
        russia.setPopulation(1000000);
        russia.setCurrency(Currency.PLN);

        Country usa = new Country();
        usa.setName("USA");
        usa.setCapital("Washington");
        usa.setPopulation(10000);
        usa.setCurrency(Currency.EUR);

        countries.put("USA",usa);
        countries.put("Russia",russia);
    }

    public Country findCountry(String name){
        return countries.get(name);
    }

}
