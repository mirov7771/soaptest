package ru.amirov.soaptest.soaptestws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
public class SoapTestWsApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(SoapTestWsApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SoapTestWsApplication.class);
    }
}

@RestController
class Test{

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String check(){
        return "App is running";
    }

}
