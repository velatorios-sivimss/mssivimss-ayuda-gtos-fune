package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.imss.sivimss.registroagf.beans.AyudaGastosFunerarios;
import com.imss.sivimss.registroagf.service.RegistroAGFService;
import com.imss.sivimss.registroagf.service.nssa.NSSAConfiguration;
import com.imss.sivimss.registroagf.service.nssa.SOAPConnectClient;
import com.imss.sivimss.registroagf.service.nssa.AGFAsegurado;
import com.imss.sivimss.registroagf.service.nssa.AGFPensionado;
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.LogUtil;
import com.imss.sivimss.registroagf.util.ProviderServiceRestTemplate;
import com.imss.sivimss.registroagf.util.Response;

import _26._116._24._172.spes.services.AutorizaGF.AutorizaGastosFunerariosServiceLocator;
import _26._116._24._172.spes.services.AutorizaGF.AutorizaGastosFunerarios;
import _26._116._24._172.spes.services.AutorizaGF.AutorizaGastosFunerariosService;

import com.imss.sivimss.registroagf.exception.BadRequestException;
import com.imss.sivimss.registroagf.model.request.UsuarioDto;
import com.imss.sivimss.registroagf.model.response.AGFResponseDto;
import com.imss.sivimss.registroagf.service.nssa.*;
import com.imss.sivimss.registroagf.util.AppConstantes;
import com.imss.sivimss.registroagf.model.request.RegistroAGFDto;

@Service
public class RegistroAGFServiceImpl implements RegistroAGFService {
	
	@Value("${endpoints.mod-catalogos}")
	private String urlDominio;
	
	@Value("${endpoints.url-nssa}")
	private String urlNssa;
	
	private static final String CONSULTA = "/consulta";
	
	private static final String CREAR = "/crear";
	
	private static Integer PENSIONADO = 3;
	
	@Value("${formato_fecha}")
	private String formatoFecha;
	
	@Autowired
	private LogUtil logUtil;
	
	@Autowired
	private ProviderServiceRestTemplate providerRestTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(RegistroAGFServiceImpl.class);

	@Override
	public Response<Object> detalle(DatosRequest request, Authentication authentication) throws IOException {
         AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
		    return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.detalle(request, formatoFecha).getDatos(), urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CONSULTA, authentication);
			return null;
        }  
	}

	@Override
	public Response<Object> listaRamos(DatosRequest request, Authentication authentication) throws IOException {
		AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
		    return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.listaRamos().getDatos(), urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CONSULTA, authentication);
			return null;
        }
	}

	@Override
	public Response<Object> listaTipoId(DatosRequest request, Authentication authentication) throws IOException {
        AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
		    return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.listaTiposId().getDatos(), urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CONSULTA, authentication);
			return null;
        }
	}

	@Override
	public Response<Object> guardarAGF(DatosRequest request, Authentication authentication) throws IOException {
		Gson gson = new Gson();

		String datosJson = String.valueOf(request.getDatos().get(AppConstantes.DATOS));
		RegistroAGFDto registroAGFDto = gson.fromJson(datosJson, RegistroAGFDto.class);
		UsuarioDto usuarioDto = gson.fromJson((String) authentication.getPrincipal(), UsuarioDto.class);
		if (registroAGFDto.getIdFinado() == null || registroAGFDto.getIdPagoDetalle() == null) {
			throw new BadRequestException(HttpStatus.BAD_REQUEST, "Informacion incompleta");
		}
		AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		registroAGFDto.setIdUsuarioAlta(usuarioDto.getIdUsuario());
		
		try { 
			 return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.guardarASF(registroAGFDto, formatoFecha) .getDatos(), urlDominio + CREAR, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CREAR, authentication);
			return null;
        }
		
	}

	@Override
	public Response<Object> registroNSSA(DatosRequest request, Authentication authentication) throws IOException {
		Gson gson = new Gson();
		
		String datosJson = String.valueOf(request.getDatos().get(AppConstantes.DATOS));
		RegistroAGFDto registroAGFDto = gson.fromJson(datosJson, RegistroAGFDto.class);
		UsuarioDto usuarioDto = gson.fromJson((String) authentication.getPrincipal(), UsuarioDto.class);
		if (registroAGFDto.getIdFinado() == null) {
			throw new BadRequestException(HttpStatus.BAD_REQUEST, "Informacion incompleta");
		}
		AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
			// Obtener datos para registro
			Response<?> response1 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.datosAsegurado(request, registroAGFDto.getIdFinado()).getDatos(), urlDominio + CONSULTA, authentication);
			ArrayList<LinkedHashMap> datos1 = (ArrayList) response1.getDatos();
			AGFAsegurado asegurado = new AGFAsegurado();
			AGFPensionado pensionado = new AGFPensionado();
			
			Integer intRamo = (Integer)datos1.get(0).get("ramo")==null?5:(Integer)datos1.get(0).get("ramo");
			if (intRamo.equals(PENSIONADO)) {
				moverDatosPensionado(pensionado, datos1);
				pensionado.setUsuarioOperador(new BigInteger(usuarioDto.getIdUsuario().toString()));
			} else {
				moverDatosAsegurado(asegurado, datos1);
				asegurado.setUsuarioOperador(new BigInteger(usuarioDto.getIdUsuario().toString()));
			}
			
			// Datos del interesado
			Response<?> response2 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.datosInteresado(request, registroAGFDto.getIdFinado()).getDatos(), urlDominio + CONSULTA, authentication);
			ArrayList<LinkedHashMap> datos2 = (ArrayList) response2.getDatos();
			AGFInteresado interesado = new AGFInteresado();
			
			interesado.setNombre((String)datos2.get(0).get("nombre")==null?"":(String)datos2.get(0).get("nombre"));
			interesado.setApPaterno((String)datos2.get(0).get("apPaterno")==null?"":(String)datos2.get(0).get("apPaterno"));
			interesado.setApMaterno((String)datos2.get(0).get("apMaterno")==null?"":(String)datos2.get(0).get("apMaterno"));
			interesado.setCurp((String)datos2.get(0).get("curp")==null?"":(String)datos2.get(0).get("curp"));
			interesado.setCalleNumero((String)datos2.get(0).get("calleNumero")==null?"":(String)datos2.get(0).get("calleNumero"));
			interesado.setColonia((String)datos2.get(0).get("colonia")==null?"":(String)datos2.get(0).get("colonia"));
			interesado.setCp((String)datos2.get(0).get("cp")==null?"":(String)datos2.get(0).get("cp"));
			interesado.setCiudad((String)datos2.get(0).get("ciudad")==null?"":(String)datos2.get(0).get("ciudad"));
			interesado.setEntidad((Integer)datos2.get(0).get("entidad")==null?new BigInteger("0"):new BigInteger(datos2.get(0).get("entidad").toString()));
			interesado.setDelegMunicipio((String)datos2.get(0).get("delegMunicipio")==null?"":(String)datos2.get(0).get("delegMunicipio"));
			interesado.setTelefono((String)datos2.get(0).get("telefono")==null?"":(String)datos2.get(0).get("telefono"));
			interesado.setParentesco((Integer)datos2.get(0).get("parentesco")==null?new BigInteger("0"):new BigInteger(datos2.get(0).get("parentesco").toString()));
			interesado.setFechaSolicitud((String)datos2.get(0).get("fechaSolicitud")==null?null:getXMLGregorianCalendar((String)datos2.get(0).get("fechaSolicitud")));
			
			if (intRamo.equals(PENSIONADO)) {
				pensionado.setDatosInteresado(interesado);
			} else {
			    asegurado.setDatosInteresado(interesado);
			}
			
			// Armado de información para NSSA
			NSSAConfiguration configuration = new NSSAConfiguration();
			Jaxb2Marshaller marshaller = configuration.marshaller();
			SOAPConnectClient client = configuration.soapconnector(marshaller);
			
			if (intRamo.equals(PENSIONADO)) { 
				RespuestaPensionado salida = (RespuestaPensionado) client.callWebServices(urlNssa, pensionado);
				AGFResponseDto respuesta = new AGFResponseDto();
				respuesta.setNss(salida.getResolucion().getCertificacionPensionado().getNss());
				respuesta.setRamo(salida.getResolucion().getCertificacionPensionado().getRamo());
				respuesta.setDelegacion(salida.getResolucion().getCertificacionPensionado().getDelegacion());
				respuesta.setFechaDefuncion(salida.getResolucion().getCertificacionPensionado().getFechaDefuncion().toString());
				return new Response<Object>(false, HttpStatus.OK.value(), "Exito", respuesta);
			} else {
				RespuestaAsegurado salida =  (RespuestaAsegurado) client.callWebServices(urlNssa, asegurado);
				AGFResponseDto respuesta = new AGFResponseDto();
				respuesta.setNss(salida.getResolucion().getCertificacion().getNss());
				respuesta.setRamo(salida.getResolucion().getCertificacion().getRamo());
				respuesta.setDelegacion(salida.getResolucion().getCertificacion().getDelegacion());
				respuesta.setFechaDefuncion(salida.getResolucion().getCertificacion().getFechaDefuncion().toString());
				return new Response<Object>(false, HttpStatus.OK.value(), "Exito", respuesta);
			}
			
		} catch (Exception e) {
			log.error(e.getMessage());
       	    logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CREAR, authentication);
			return null;
       }
	
	}

	@Override
	public Response<Object> beneficiarios(DatosRequest request, Authentication authentication) throws IOException {
		// TODO Auto-generated method stub
		AutorizaGastosFunerariosService serviceLocatr = new AutorizaGastosFunerariosServiceLocator();
		String response;
		try {
			AutorizaGastosFunerarios serviceClient = serviceLocatr.getAutorizaGF();
			response = serviceClient.consultaGastosFunerarios("hola mundo");
			log.info(response);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	private void moverDatosAsegurado(AGFAsegurado asegurado, ArrayList<LinkedHashMap> datos1) throws DatatypeConfigurationException, ParseException {
		asegurado.setCadena("RS0");
		asegurado.setTransaccion("1");
		asegurado.setTipoProceso("01");
		asegurado.setNss((String)datos1.get(0).get("nss")==null?"":(String)datos1.get(0).get("nss"));
		asegurado.setCurp((String)datos1.get(0).get("curp")==null?"":(String)datos1.get(0).get("curp"));
		asegurado.setRamo((Integer)datos1.get(0).get("ramo")==null?new BigInteger("5"):new BigInteger(datos1.get(0).get("ramo").toString()));
		asegurado.setFechaDefuncion((String)datos1.get(0).get("fechaDefuncion")==null?null:getXMLGregorianCalendar((String)datos1.get(0).get("fechaDefuncion")));
		asegurado.setDelegacion((String)datos1.get(0).get("delegacion")==null?"":(String)datos1.get(0).get("delegacion"));
		asegurado.setVelatorioOperador((Integer)datos1.get(0).get("velatorioOperador")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("velatorioOperador").toString()));
		
		asegurado.setDatosFinado(new AGFAseguradoFinado());
		asegurado.getDatosFinado().setSexo((Integer)datos1.get(0).get("sexo")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("sexo").toString()));
		asegurado.getDatosFinado().setCalleNumero((String)datos1.get(0).get("calleNumero")==null?"":(String)datos1.get(0).get("calleNumero"));
		asegurado.getDatosFinado().setColonia((String)datos1.get(0).get("colonia")==null?"":(String)datos1.get(0).get("colonia"));
		asegurado.getDatosFinado().setCp((String)datos1.get(0).get("cp")==null?"":(String)datos1.get(0).get("cp"));
		asegurado.getDatosFinado().setCiudad((String)datos1.get(0).get("ciudad")==null?"":(String)datos1.get(0).get("ciudad"));
		asegurado.getDatosFinado().setEntidad((String)datos1.get(0).get("entidad")==null?"":(String)datos1.get(0).get("entidad"));
		asegurado.getDatosFinado().setDelegMunicipio((String)datos1.get(0).get("delegMunicipio")==null?"":(String)datos1.get(0).get("delegMunicipio"));
		asegurado.getDatosFinado().setTelefono((String)datos1.get(0).get("telefono")==null?"":(String)datos1.get(0).get("telefono"));
		asegurado.getDatosFinado().setNacionalidad(false);
		
		asegurado.setDocumentacionProbatoria(new AGFDocumentacionProbatoria());
		asegurado.getDocumentacionProbatoria().setCurp((Boolean)datos1.get(0).get("chkCurp")==null?false:(Boolean)datos1.get(0).get("chkCurp"));
		asegurado.getDocumentacionProbatoria().setActaDefuncion((Boolean)datos1.get(0).get("chkActaDefuncion")==null?false:(Boolean)datos1.get(0).get("chkActaDefuncion"));
		asegurado.getDocumentacionProbatoria().setCuentaOriginalGF((Boolean)datos1.get(0).get("chkCuentaOriginalGF")==null?false:(Boolean)datos1.get(0).get("chkCuentaOriginalGF"));
		asegurado.getDocumentacionProbatoria().setDocumentoConNSS((Boolean)datos1.get(0).get("chkNSSI")==null?false:(Boolean)datos1.get(0).get("chkNSSI"));
		asegurado.getDocumentacionProbatoria().setIdOficial((Integer)datos1.get(0).get("idOficial")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("idOficial").toString()));
		asegurado.getDocumentacionProbatoria().setNumIdOficial((String)datos1.get(0).get("numIdOficial")==null?"":(String)datos1.get(0).get("numIdOficial"));
	}
	
	private void moverDatosPensionado(AGFPensionado pensionado, ArrayList<LinkedHashMap> datos1) throws DatatypeConfigurationException, ParseException {
		pensionado.setCadena("RS0");
		pensionado.setTransaccion("1");
		pensionado.setTipoProceso("01");
		pensionado.setNss((String)datos1.get(0).get("nss")==null?"":(String)datos1.get(0).get("nss"));
		pensionado.setCurp((String)datos1.get(0).get("curp")==null?"":(String)datos1.get(0).get("curp"));
		pensionado.setRamo(new BigInteger(PENSIONADO.toString()));
		pensionado.setFechaDefuncion((String)datos1.get(0).get("fechaDefuncion")==null?null:getXMLGregorianCalendar((String)datos1.get(0).get("fechaDefuncion")));
		pensionado.setDelegacion((String)datos1.get(0).get("delegacion")==null?"":(String)datos1.get(0).get("delegacion"));
		pensionado.setVelatorioOperador((Integer)datos1.get(0).get("velatorioOperador")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("velatorioOperador").toString()));

		pensionado.setDatosFinado(new AGFPensionadoFinado());
		pensionado.getDatosFinado().setSelBeneficiario(""); // Falta el beneficiario
		pensionado.getDatosFinado().setCurp((String)datos1.get(0).get("curpFinado")==null?"":(String)datos1.get(0).get("curpFinado"));
		pensionado.getDatosFinado().setSexo((Integer)datos1.get(0).get("sexo")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("sexo").toString()));
		pensionado.getDatosFinado().setCalleNumero((String)datos1.get(0).get("calleNumero")==null?"":(String)datos1.get(0).get("calleNumero"));
		pensionado.getDatosFinado().setColonia((String)datos1.get(0).get("colonia")==null?"":(String)datos1.get(0).get("colonia"));
		pensionado.getDatosFinado().setCp((String)datos1.get(0).get("cp")==null?"":(String)datos1.get(0).get("cp"));
		pensionado.getDatosFinado().setCiudad((String)datos1.get(0).get("ciudad")==null?"":(String)datos1.get(0).get("ciudad"));
		pensionado.getDatosFinado().setEntidad((String)datos1.get(0).get("entidad")==null?"":(String)datos1.get(0).get("entidad"));
		pensionado.getDatosFinado().setDelegMunicipio((String)datos1.get(0).get("delegMunicipio")==null?"":(String)datos1.get(0).get("delegMunicipio"));
		pensionado.getDatosFinado().setTelefono((String)datos1.get(0).get("telefono")==null?"":(String)datos1.get(0).get("telefono"));
		pensionado.getDatosFinado().setNacionalidad(false);
		
		pensionado.setDocumentacionProbatoria(new AGFDocumentacionProbatoria());
		pensionado.getDocumentacionProbatoria().setCurp((Boolean)datos1.get(0).get("chkCurp")==null?false:(Boolean)datos1.get(0).get("chkCurp"));
		pensionado.getDocumentacionProbatoria().setActaDefuncion((Boolean)datos1.get(0).get("chkActaDefuncion")==null?false:(Boolean)datos1.get(0).get("chkActaDefuncion"));
		pensionado.getDocumentacionProbatoria().setCuentaOriginalGF((Boolean)datos1.get(0).get("chkCuentaOriginalGF")==null?false:(Boolean)datos1.get(0).get("chkCuentaOriginalGF"));
		pensionado.getDocumentacionProbatoria().setDocumentoConNSS((Boolean)datos1.get(0).get("chkNSSI")==null?false:(Boolean)datos1.get(0).get("chkNSSI"));
		pensionado.getDocumentacionProbatoria().setIdOficial((Integer)datos1.get(0).get("idOficial")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("idOficial").toString()));
		pensionado.getDocumentacionProbatoria().setNumIdOficial((String)datos1.get(0).get("numIdOficial")==null?"":(String)datos1.get(0).get("numIdOficial"));
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
