package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.imss.sivimss.registroagf.model.request.GastosAgfAseguradoraDto;
import com.imss.sivimss.registroagf.service.GastosAgfService;
import com.imss.sivimss.registroagf.certificacion.AGFAseguradoFinado;
import com.imss.sivimss.registroagf.certificacion.AGFDocumentacionProbatoria;
import com.imss.sivimss.registroagf.certificacion.AGFInteresado;
import com.imss.sivimss.registroagf.certificacion.ResolucionAGFAsegurado;
import com.imss.sivimss.registroagf.certificacion.RespuestaAsegurado;
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.Response;
import com.imss.sivimss.registroagf.util.SOAPConnectClient;

@Service	
public class GastosAgfServiceImpl implements GastosAgfService {

	@Autowired
	private SOAPConnectClient soapConnectClient;
	
	
	@Override
	public Response<Object> consultarGtoAsegurados(DatosRequest request, Authentication authentication)
			throws IOException {
		Date fecha=null;
		ResolucionAGFAsegurado respuestaAsegurado= new ResolucionAGFAsegurado();
		try {
			fecha = new SimpleDateFormat("yyyy-MM-dd").parse("2023-11-09");
			
	
		GastosAgfAseguradoraDto agfAseguradoraDto=GastosAgfAseguradoraDto.builder()
				.cadena("RS0")
				.transaccion("1")
				.tipoProceso("01")
				.nss("24715415865")
				.curp("OISJ990810HCHRGS01")
				.ramo(5)
				.fechaDefuncion(fecha)
				.delegacion("08")
				.velatorioOperador(03)
				.usuarioOperador(22)
				.datosFinado(new AGFAseguradoFinado(new BigInteger("2"), "Calle Siempre Viva número 14", "San Francisco", "54440", "CHIHUAHUA", "CHIHUAHUA", "Cuautitlan", "5523539311", false))
			/*	.datosInteresado(new AGFInteresado("ALBERTO", "SALINAS", "PEDRAZA", "ROVJ690723HCLMNS04", "Coyuca 26", "Las Playas", "39390", "CHIHUAHUA",
						new BigInteger("08"), "CHIHUAHUA", new BigInteger("774"), "5589945214", new BigInteger("7"),fecha))*/
				
				.datosInteresado(new AGFInteresado("ALBERTO", "SALINAS", "PEDRAZA", "ROVJ690723HCLMNS04", "Coyuca 26", "Las Playas", "39390", "CHIHUAHUA",
						new BigInteger("08"), "CHIHUAHUA", new BigInteger("774"), "5589945214", new BigInteger("7"),getXMLGregorianCalendar("11/09/2023")))
				.documentacionProbatoria(new AGFDocumentacionProbatoria(true, true, true, true, new BigInteger("7"), "12345678901234567890"))
				.build();
		respuestaAsegurado= soapConnectClient.callWebServices(agfAseguradoraDto);
		return new Response<>(true,200,"",respuestaAsegurado);
		} catch (ParseException | DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RespuestaAsegurado asegurado= new RespuestaAsegurado();
			return new Response<>(true,200,e.getMessage(),asegurado);
		}
		
	}

	@Override
	public Response<Object> consultarGtoPensionados(DatosRequest request, Authentication authentication)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static XMLGregorianCalendar getXMLGregorianCalendar(String fecha) throws ParseException, DatatypeConfigurationException {
		 XMLGregorianCalendar xmlCalender=null;
		 GregorianCalendar calender = new GregorianCalendar();
		 calender.setTime(stringToJavaDate(fecha));
		 xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
		 
		 return xmlCalender;
	}
	
	private static Date  stringToJavaDate(String sDate) throws ParseException {
	    Date date=null;
	    date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);        
	    return date;  
	}

}
