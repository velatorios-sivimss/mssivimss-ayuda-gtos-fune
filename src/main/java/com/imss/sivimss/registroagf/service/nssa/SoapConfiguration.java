package com.imss.sivimss.registroagf.service.nssa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import com.imss.sivimss.registroagf.service.impl.SoapClientService;

@Configuration
public class SoapConfiguration {

    @Autowired
    private SoapClientService soapClient;
    
    @Value("${endpoints.url-nssa}")
	private String urlNssa;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.imss.sivimss.registroagf.service.nssa");
        return marshaller;
    }

    @Bean
    public SoapClientService soapClient(Jaxb2Marshaller marshaller) {
    	soapClient.setDefaultUri(urlNssa);
    	soapClient.setMarshaller(marshaller);
    	soapClient.setUnmarshaller(marshaller);
        return soapClient;
    }

}
