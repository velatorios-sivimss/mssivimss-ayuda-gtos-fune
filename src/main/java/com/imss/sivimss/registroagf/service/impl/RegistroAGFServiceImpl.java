package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.imss.sivimss.registroagf.beans.AyudaGastosFunerarios;
import com.imss.sivimss.registroagf.service.RegistroAGFService;
import com.imss.sivimss.registroagf.service.nssa.AGFAsegurado;
import com.imss.sivimss.registroagf.service.nssa.AGFPensionado;
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.LogUtil;
import com.imss.sivimss.registroagf.util.MensajeResponseUtil;
import com.imss.sivimss.registroagf.util.ProviderServiceRestTemplate;
import com.imss.sivimss.registroagf.util.Response;

import _26._116._24._172.spes.services.AutorizaGF.AutorizaGastosFunerariosServiceLocator;
import _26._116._24._172.spes.services.AutorizaGF.AutorizaGastosFunerariosService;

import com.imss.sivimss.registroagf.exception.BadRequestException;
import com.imss.sivimss.registroagf.model.request.UsuarioDto;
import com.imss.sivimss.registroagf.model.response.AGFResponseDto;
import com.imss.sivimss.registroagf.service.nssa.*;
import com.imss.sivimss.registroagf.util.AppConstantes;
import com.imss.sivimss.registroagf.model.request.BeneficiariosRequest;
import com.imss.sivimss.registroagf.model.request.RegistroAGFDto;

@Service
public class RegistroAGFServiceImpl implements RegistroAGFService   {

	@Value("${endpoints.mod-catalogos}")
	private String urlDominio;
	
	private static final String ERROR_INFORMACION = "52"; // Error al consultar la información.
	private static final String AGREGADO_CORRECTAMENTE = "30"; // El ataúd ya fue registrado como donado exitosamente.
	
	private static final String CONSULTA = "/consulta";
	
	private static final String CREAR = "/crear";
	
	private static Integer PENSIONADO = 3;
	
	private static final String EXITO = "Exito";
	
	@Value("${formato_fecha}")
	private String formatoFecha;
	
	@Autowired
	private LogUtil logUtil;
	
	@Autowired
	private ProviderServiceRestTemplate providerRestTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(RegistroAGFServiceImpl.class);
	
	private Response<Object>response;
	
	@Autowired
	private SoapClientService soapClientService;

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
			 return   MensajeResponseUtil.mensajeResponseObjecto((Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.guardarASF(registroAGFDto, formatoFecha) .getDatos(), urlDominio + CREAR, authentication), AGREGADO_CORRECTAMENTE);
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
			if (intRamo == PENSIONADO) {
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
			
			if (intRamo == PENSIONADO) {
				pensionado.setDatosInteresado(interesado);
			} else {
			    asegurado.setDatosInteresado(interesado);
			}
			
			// Armado de información para NSSA

			
			if (intRamo == PENSIONADO) { 
				RespuestaPensionado salida = soapClientService.obtenerRespuestaPensionado(pensionado);
				AGFResponseDto respuesta = new AGFResponseDto();
				respuesta.setNss(salida.getResolucion().getCertificacionPensionado().getNss());
				respuesta.setRamo(salida.getResolucion().getCertificacionPensionado().getRamo());
				respuesta.setDelegacion(salida.getResolucion().getCertificacionPensionado().getDelegacion());
				respuesta.setFechaDefuncion(salida.getResolucion().getCertificacionPensionado().getFechaDefuncion().toString());
				return new Response<Object>(false, HttpStatus.OK.value(), EXITO, respuesta);
			} else {
				RespuestaAsegurado salida =  soapClientService.obtenerRespuestaAsegurado(asegurado);
				AGFResponseDto respuesta = new AGFResponseDto();
				respuesta.setNss(salida.getResolucion().getCertificacion().getNss());
				respuesta.setRamo(salida.getResolucion().getCertificacion().getRamo());
				respuesta.setDelegacion(salida.getResolucion().getCertificacion().getDelegacion());
				respuesta.setFechaDefuncion(salida.getResolucion().getCertificacion().getFechaDefuncion().toString());
				return new Response<Object>(false, HttpStatus.OK.value(), EXITO, respuesta);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
       	    logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CREAR, authentication);
			return null;
       }
	
	}

	@Override
	public Response<Object> beneficiarios(DatosRequest request, Authentication authentication) throws IOException {
		AutorizaGastosFunerariosService serviceLocatr = new AutorizaGastosFunerariosServiceLocator();
		String responseString = null;
		try {
			RegistroAGFDto registroAGFDto = new Gson().fromJson(String.valueOf(request.getDatos().get(AppConstantes.DATOS)), RegistroAGFDto.class);
//			AutorizaGastosFunerarios serviceClient = serviceLocatr.getAutorizaGF();
//			responseString = serviceClient.consultaGastosFunerarios("hola mundo");
			 return   MensajeResponseUtil.mensajeResponseObjecto(obtenerBeneficiarios(registroAGFDto), EXITO);
		} catch (Exception e) {
			e.printStackTrace();
			logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(),this.getClass().getPackage().toString(), "Fallo al ejecutar el reporte : "  + e.getMessage(), "consulta",authentication);
			throw new IOException(ERROR_INFORMACION, e.getCause());
		}
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
		pensionado.getDatosFinado().setSelBeneficiario((String)datos1.get(0).get("nomBeneficiario")==null?"":(String)datos1.get(0).get("nomBeneficiario")); // Falta el beneficiario
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
	
	private  Response<Object> obtenerBeneficiarios(RegistroAGFDto registroAGFDto ) {
		List<BeneficiariosRequest> beneficiariosRequest = new ArrayList<>();
		if ("46127209461".equals(registroAGFDto.getCveNSS())) {
			beneficiariosRequest.add(new BeneficiariosRequest("DANIEL TINAJERO TRISTAN","TITD600101HTSNRN09") );
			beneficiariosRequest.add(new BeneficiariosRequest("MA. GUADALUPE MORENO CASTILLO", "ROBG900321MTSDRD01") );
			beneficiariosRequest.add(new BeneficiariosRequest("SEBASTIAN GOMEZ RAMIREZ", "MOCG481211MTSRSD25") );
			
			response= new Response<>(false, 200, EXITO,beneficiariosRequest);
			
		} else if ("46127209464".equals(registroAGFDto.getCveNSS())) {
			beneficiariosRequest.add(new BeneficiariosRequest("LILIA ISABEL PEREZ RODRIGUEZ", "AACM651123MTSLLR06") );
			beneficiariosRequest.add(new BeneficiariosRequest("ZULEIMA GABRIELA ORDOÑEZ ALANIS", "PAVM910427HTLRZR04") );
			
			response= new Response<>(false, 200, EXITO, beneficiariosRequest);
			
		} else if ("64866806660".equals(registroAGFDto.getCveNSS())) {
			beneficiariosRequest.add(new BeneficiariosRequest("JIMENA VALENCIA ELIAS", "GORS990626HMCMMB09") );
			beneficiariosRequest.add(new BeneficiariosRequest("JUAN DIEGO VALENCIA GARCIA", "VAGJ110218HQTLRNA1") );
			
			response= new Response<>(false, 200, EXITO, beneficiariosRequest);
			
		}  else if ("24715415865".equals(registroAGFDto.getCveNSS())) {
			beneficiariosRequest.add(new BeneficiariosRequest("VIRGINIA NIEVES IBARRA", "NIIV940411MQTVBR08") );
			beneficiariosRequest.add(new BeneficiariosRequest("ADRIANA IBARRA MARTINEZ", "LOMA900209MQTPRD00"));
			beneficiariosRequest.add(new BeneficiariosRequest("JOSE IBARRA AGUILAR", "CLARK5HVZNYD06"));
			
			response= new Response<>(false, 200, EXITO, beneficiariosRequest);
			
		}  else {
			response= new Response<>(false, 200, EXITO,beneficiariosRequest);
		}
		
		return response;
	}
}
