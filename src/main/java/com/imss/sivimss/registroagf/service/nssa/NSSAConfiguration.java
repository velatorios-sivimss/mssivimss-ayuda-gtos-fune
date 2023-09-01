package com.imss.sivimss.registroagf.service.nssa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class NSSAConfiguration {
	
	@Value("${endpoints.url-nssa}")
	private String urlNssa;
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.imss.sivimss.registroagf.service.nssa");
		return marshaller;
	}

	@Bean
	public SOAPConnectClient soapconnector(Jaxb2Marshaller marshaller) {
		SOAPConnectClient client = new SOAPConnectClient();
		client.setDefaultUri(urlNssa);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
