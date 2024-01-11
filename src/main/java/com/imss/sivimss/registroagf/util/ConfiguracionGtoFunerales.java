package com.imss.sivimss.registroagf.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfiguracionGtoFunerales {

	@Value("${endpoints.agf-asegurados}")
	private String agfAsegurados;
	
	@Value("${endpoints.agf-pensionado}")
	private String agfPensionados;
	
	@Autowired
	private SOAPConnectClient soapConnectClient;
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.imss.sivimss.registroagf.certificacion");
		return marshaller;
	}
	
	@Bean
	public SOAPConnectClient obtenerGtoAsegurados(Jaxb2Marshaller marshaller) {
		SOAPConnectClient client = new SOAPConnectClient();
		client.setDefaultUri(agfAsegurados);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public SOAPConnectClient obtenerGtoPensionados(Jaxb2Marshaller marshaller) {
		SOAPConnectClient client = new SOAPConnectClient();
		client.setDefaultUri(agfPensionados);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
