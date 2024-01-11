package com.imss.sivimss.registroagf.util;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.imss.sivimss.registroagf.certificacion.ResolucionAGFAsegurado;
import com.imss.sivimss.registroagf.model.request.GastosAgfAseguradoraDto;


public class SOAPConnectClient extends WebServiceGatewaySupport{

	private String endpoint="http://tspi-stage.imss.gob.mx/agf-web-service/AyudaGastosFunerales?WSDL";
	
	public ResolucionAGFAsegurado callWebServices( GastosAgfAseguradoraDto request) {
		return (ResolucionAGFAsegurado) getWebServiceTemplate().marshalSendAndReceive(endpoint, request,new SoapActionCallback(
                "http://certificacion.service.agf.ctirss.imss.gob.mx/AyudaGastosFunerales/obtenerAGFAsegurado"));
	}
	
	
}
