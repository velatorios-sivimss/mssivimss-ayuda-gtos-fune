package com.imss.sivimss.registroagf.service.nssa;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SOAPConnectClient extends WebServiceGatewaySupport {
	
	public Object callWebServices(String url, Object request) {
		return getWebServiceTemplate().marshalSendAndReceive(url, request);
	}

}
