package ru.amirov.serivcecall.application.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean dspServlet(ApplicationContext context){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/dbo-early-repayment/ws/*");
    }

    @Bean(name = "service")
    public Wsdl11Definition defaultWsdl11Definition(){
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/service.wsdl"));
        return wsdl11Definition;
    }

//    @Bean(name = "service")
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema serviceSchema){
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("ServiceCallPort");
//        wsdl11Definition.setLocationUri("/dbo-early-repayment/ws");
//        wsdl11Definition.setTargetNamespace("http://www.support.mtsbank.ru");
//        wsdl11Definition.setSchema(serviceSchema);
//        return wsdl11Definition;
//    }
//
//    @Bean
//    public XsdSchema serviceSchema(){
//        return new SimpleXsdSchema(new ClassPathResource("wsdl/service.wsdl"));
//    }
}
