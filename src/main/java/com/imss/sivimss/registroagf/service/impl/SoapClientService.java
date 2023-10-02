package com.imss.sivimss.registroagf.service.impl;

import javax.xml.bind.JAXBElement;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.imss.sivimss.registroagf.service.nssa.AGFAsegurado;
import com.imss.sivimss.registroagf.service.nssa.AGFPensionado;
import com.imss.sivimss.registroagf.service.nssa.ObjectFactory;
import com.imss.sivimss.registroagf.service.nssa.RespuestaAsegurado;
import com.imss.sivimss.registroagf.service.nssa.RespuestaPensionado;

@Service
public class SoapClientService  extends WebServiceGatewaySupport{
	
	 public RespuestaPensionado obtenerRespuestaPensionado(AGFPensionado request ) {
		 ObjectFactory of = new ObjectFactory();
		 JAXBElement<AGFPensionado> reqjaxb = of.createObtenerAGFPensionadoRequest(request);
		 @SuppressWarnings("unchecked")
		 JAXBElement<RespuestaPensionado> response = (JAXBElement<RespuestaPensionado>) getWebServiceTemplate().marshalSendAndReceive(reqjaxb);
		return response.getValue();
	 }
	 
	 public RespuestaAsegurado obtenerRespuestaAsegurado(AGFAsegurado request ) {
		 ObjectFactory of = new ObjectFactory();
		 JAXBElement<AGFAsegurado> reqjaxb = of.createObtenerAGFAseguradoRequest(request);
		 @SuppressWarnings("unchecked")
		 JAXBElement<RespuestaAsegurado> response =  (JAXBElement<RespuestaAsegurado>) getWebServiceTemplate().marshalSendAndReceive(reqjaxb);
		return response.getValue();
	 }

}
