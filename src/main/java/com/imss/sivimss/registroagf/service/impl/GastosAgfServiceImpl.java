package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.imss.sivimss.registroagf.model.request.GastosAgfAseguradoraDto;
import com.imss.sivimss.registroagf.service.GastosAgfService;
import com.imss.sivimss.registroagf.soap.AGF_Asegurado_Finado;
import com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria;
import com.imss.sivimss.registroagf.soap.AGF_Interesado;
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
				.datosFinado(new AGF_Asegurado_Finado(new BigInteger("2"), "Calle Siempre Viva número 14", "San Francisco", "54440", "CHIHUAHUA", "CHIHUAHUA", "Cuautitlan", "5523539311", false))
				.datosInteresado(new AGF_Interesado
						("ALBERTO", "SALINAS", "PEDRAZA", "ROVJ690723HCLMNS04", "Coyuca 26", "Las Playas", "39390", "CHIHUAHUA", new BigInteger("08"), "CHIHUAHUA", new BigInteger("774"), "5589945214", new BigInteger("7"),fecha))
				.documentacionProbatoria(new AGF_Documentacion_Probatoria(true, true, true, true, new BigInteger("7"), "12345678901234567890"))
				.build();
		return (Response<Object>) soapConnectClient.callWebServices(agfAseguradoraDto);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Response<>(true,500,e.getMessage());
		}
		
	}

	@Override
	public Response<Object> consultarGtoPensionados(DatosRequest request, Authentication authentication)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
