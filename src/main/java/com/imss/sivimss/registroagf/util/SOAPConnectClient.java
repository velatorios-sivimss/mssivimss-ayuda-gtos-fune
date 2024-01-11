package com.imss.sivimss.registroagf.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
@Primary
public class SOAPConnectClient extends WebServiceGatewaySupport{

	private String endpoint="http://tspi-stage.imss.gob.mx/agf-web-service/AyudaGastosFunerales?WSDL";
	
	public Object callWebServices( Object request) {
		return getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
	}
	
	
}
