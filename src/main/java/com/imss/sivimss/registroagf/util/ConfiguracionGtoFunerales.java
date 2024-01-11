package com.imss.sivimss.registroagf.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfiguracionGtoFunerales {

	
	private String endpoint="http://tspi-stage.imss.gob.mx/agf-web-service/AyudaGastosFunerales?WSDL";
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.imss.sivimss.registroagf.certificacion");
		return marshaller;
	}
	
	@Bean
	public SOAPConnectClient soapConnectClient(Jaxb2Marshaller marshaller) {
		SOAPConnectClient client = new SOAPConnectClient();
		client.setDefaultUri(endpoint);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	
}
