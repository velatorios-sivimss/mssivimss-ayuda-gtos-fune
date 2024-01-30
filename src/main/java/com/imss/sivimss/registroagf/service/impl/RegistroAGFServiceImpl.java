package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.imss.sivimss.registroagf.util.PagosUtil;
import com.imss.sivimss.registroagf.model.request.ActualizarMultiRequest;
import com.imss.sivimss.registroagf.beans.AyudaGastosFunerarios;
import com.imss.sivimss.registroagf.service.RegistroAGFService;
import com.imss.sivimss.registroagf.service.nssa.AGFAsegurado;
import com.imss.sivimss.registroagf.service.nssa.AGFPensionado;
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.LogUtil;
import com.imss.sivimss.registroagf.util.ProviderServiceRestTemplate;
import com.imss.sivimss.registroagf.util.Response;

import mx.gob.imss.cit.clienteswebservices.sistrap.spes.services.autorizaGF.AutorizaGastosFunerariosServiceLocator;
import mx.gob.imss.cit.clienteswebservices.sistrap.spes.services.autorizaGF.AutorizaGastosFunerarios;
import mx.gob.imss.cit.clienteswebservices.sistrap.spes.services.autorizaGF.AutorizaGastosFunerariosService;

import com.imss.sivimss.registroagf.exception.BadRequestException;
import com.imss.sivimss.registroagf.model.request.UsuarioDto;
import com.imss.sivimss.registroagf.model.response.AGFResponseDto;
import com.imss.sivimss.registroagf.model.response.AgfSalida;
import com.imss.sivimss.registroagf.service.nssa.*;
import com.imss.sivimss.registroagf.util.AppConstantes;
import com.imss.sivimss.registroagf.model.request.BeneficiariosRequest;
import com.imss.sivimss.registroagf.model.request.CrearPagosRequest;
import com.imss.sivimss.registroagf.model.request.RegistroAGFDto;

@Service
public class RegistroAGFServiceImpl implements RegistroAGFService   {

	@Value("${endpoints.mod-catalogos}")
	private String urlDominio;
	
	private static final String ERROR_INFORMACION = "52"; // Error al consultar la información.
	
	private static final String CONSULTA = "/consulta";
	
	private static final String ACTUALIZAR_MULTIPLES = "/actualizar/multiples";
	
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

	@Autowired
	private ModelMapper modelMapper;
	
	@SuppressWarnings("unchecked")
	@Override
	public Response<Object> detalle(DatosRequest request, Authentication authentication) throws IOException {
         AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
		    return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.detalle(request, formatoFecha).getDatos(), urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CONSULTA, authentication);
        	throw new IOException(ERROR_INFORMACION, e.getCause());
        }  
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response<Object> listaRamos(DatosRequest request, Authentication authentication) throws IOException {
		AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
		    return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.listaRamos().getDatos(), urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CONSULTA, authentication);
        	throw new IOException(ERROR_INFORMACION, e.getCause());
        }
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response<Object> listaTipoId(DatosRequest request, Authentication authentication) throws IOException {
        AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		
		try {
		    return (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.listaTiposId().getDatos(), urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
        	logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CONSULTA, authentication);
        	throw new IOException(ERROR_INFORMACION, e.getCause());
        }
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response<Object> guardarAGF(DatosRequest request, Authentication authentication) throws IOException {
		
		Gson gson = new Gson();
		String impresion;
		
		logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
				this.getClass().getPackage().toString(), "","guardar AGF ", authentication);
		
		String datosJson = String.valueOf(request.getDatos().get(AppConstantes.DATOS));
		RegistroAGFDto registroAGFDto = gson.fromJson(datosJson, RegistroAGFDto.class);
		UsuarioDto usuarioDto = gson.fromJson((String) authentication.getPrincipal(), UsuarioDto.class);
		
		impresion = gson.toJson(registroAGFDto);
		
		logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
				this.getClass().getPackage().toString(), "","Datos Entrada " + impresion, authentication);
		
		if (registroAGFDto.getFecDefuncion() == null || registroAGFDto.getIdFinado() == null || registroAGFDto.getIdPagoBitacora() == null) {
			throw new BadRequestException(HttpStatus.BAD_REQUEST, "Informacion incompleta");
		}
		
		AyudaGastosFunerarios ayudaGF = new AyudaGastosFunerarios();
		registroAGFDto.setIdUsuarioAlta(usuarioDto.getIdUsuario());
		Integer intRamo = registroAGFDto.getIdRamo();
		AGFAsegurado asegurado = new AGFAsegurado();
		AGFPensionado pensionado = new AGFPensionado();
		String folioAgf = "";
		String fecAprobacion = null;
		Double importeAprobado = 0.0;
		String estatusPago = "0";
		Response<Object> response3;
		String salidaError = "";
		
		try {
			// Obtener datos para registro
			ArrayList<LinkedHashMap> datos1 = null;
			try {
				Response<?> response1 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.datosAsegurado(request, registroAGFDto.getIdFinado()).getDatos(), urlDominio + CONSULTA, authentication);
				datos1 = (ArrayList) response1.getDatos();
			} catch (Exception e) {
				log.error("datos1 es vacio");
				e.printStackTrace();
				throw new IOException(ERROR_INFORMACION, e.getCause());
			}
			
			if( 
				( datos1 == null ) 
				|| ( datos1.size() < 1 ) 
			) {
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos del Asegurado Vacios ", authentication);
				response3 = new Response<>();
				response3.setError(true);
				response3.setCodigo( HttpStatus.INTERNAL_SERVER_ERROR.value() );
				response3.setMensaje( "52" );
				return response3;
			}
			
			if (intRamo == PENSIONADO) {
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","moverDatosPensionado ", authentication);
				
				moverDatosPensionado(pensionado, datos1, registroAGFDto);
				pensionado.setUsuarioOperador(new BigInteger(usuarioDto.getIdUsuario().toString()));
				
				impresion = gson.toJson(pensionado);
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos Pensionado " + impresion, authentication);
				
			} else {
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","moverDatosAsegurado ", authentication);
				
				moverDatosAsegurado(asegurado, datos1, registroAGFDto);
				asegurado.setUsuarioOperador(new BigInteger(usuarioDto.getIdUsuario().toString()));
				
				impresion = gson.toJson(asegurado);
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos Asegurado " + impresion, authentication);

			}
			
			// Datos del interesado
			Response<?> response2 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.datosInteresado(request, registroAGFDto.getIdFinado()).getDatos(), urlDominio + CONSULTA, authentication);
			ArrayList<LinkedHashMap> datos2 = (ArrayList) response2.getDatos();
			AGFInteresado interesado = new AGFInteresado();
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Datos del interesado ", authentication);

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
			interesado.setLada(new BigInteger("111"));
			interesado.setTelefono(contienePalabraNull((String)datos2.get(0).get("telefono"))?"1111111111":(String)datos2.get(0).get("telefono"));
			interesado.setParentesco((Integer)datos2.get(0).get("parentesco")==null?new BigInteger("0"):new BigInteger(datos2.get(0).get("parentesco").toString()));
			interesado.setFechaSolicitud((String)datos2.get(0).get("fechaSolicitud")==null?null:getXMLGregorianCalendar((String)datos2.get(0).get("fechaSolicitud")));
			
			impresion = gson.toJson(interesado);
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Datos Interesado " + impresion, authentication);
			
			if (intRamo == PENSIONADO) {
				pensionado.setDatosInteresado(interesado);
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Se asigno el interesado a Pensionado ", authentication);
			} else {
			    asegurado.setDatosInteresado(interesado);
			    logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Se asigno el interesado a Asegurado ", authentication);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
       	    logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CREAR, authentication);
       	    throw new IOException(ERROR_INFORMACION, e.getCause());
       }
		
		// Armado de información para NSSA
		try { 

			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Armado de información para NSSA ", authentication);
			
			if (intRamo == PENSIONADO) {
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","intRamo PENSIONADO ", authentication);
				
				impresion = gson.toJson(pensionado);
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos Pensionado " + impresion, authentication);
				
				RespuestaPensionado salida = soapClientService.obtenerRespuestaPensionado(pensionado);
				
				impresion = gson.toJson(salida);
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos Salida " + impresion, authentication);
				
				if( salida!=null
					&& salida.getDescripcionError() != null) {
					salidaError = salida.getDescripcionError();
					
					logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
							this.getClass().getPackage().toString(), "","Error en el servicio: " + salidaError, authentication);
				}
				
				if( salida != null
					&& salida.getResolucion()!=null 
					&& salida.getResolucion().getCertificacionPensionado() != null 
					&& salida.getResolucion().getCertificacionPensionado().getDatosFinado()!= null
					&& salida.getResolucion().getCertificacionPensionado().getDatosFinado().getFolioAGF() != null
					&& salida.getResolucion().getCertificacionPensionado().getDatosFinado().getMontoAyuda() != null
					&& salida.getResolucion().getCertificacionPensionado().getFechaSolicitud() != null) {
				
						folioAgf = salida.getResolucion().getCertificacionPensionado().getDatosFinado().getFolioAGF();
						importeAprobado = Double.parseDouble( salida.getResolucion().getCertificacionPensionado().getDatosFinado().getMontoAyuda() );
						fecAprobacion = salida.getResolucion().getCertificacionPensionado().getFechaSolicitud().toString();
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Folio Agf: " + folioAgf, authentication);
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Importe Aprobado: " + importeAprobado, authentication);
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Fecha de Aprobacion: " + fecAprobacion, authentication);
				}
				
			} else {

				impresion = gson.toJson(asegurado);
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos Asegurado: " + impresion, authentication);
				
				RespuestaAsegurado salida =  soapClientService.obtenerRespuestaAsegurado(asegurado);
				
				impresion = gson.toJson(salida);
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Datos Salida " + impresion, authentication);
				
				if( salida!=null
						&& salida.getDescripcionError() != null) {
						salidaError = salida.getDescripcionError();
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Error en el servicio: " + salidaError, authentication);
					}
				
				if( salida != null
					&& salida.getResolucion()!=null 
					&& salida.getResolucion().getCertificacion() != null 
					&& salida.getResolucion().getCertificacion().getDatosFinado()!= null
					&& salida.getResolucion().getCertificacion().getDatosFinado().getFolioAGF() != null
					&& salida.getResolucion().getCertificacion().getDatosFinado().getMontoAyuda() != null
					&& salida.getResolucion().getCertificacion().getFechaSolicitud() != null ) {
				
						folioAgf = salida.getResolucion().getCertificacion().getDatosFinado().getFolioAGF();
						importeAprobado = Double.parseDouble( salida.getResolucion().getCertificacion().getDatosFinado().getMontoAyuda() );
						fecAprobacion = salida.getResolucion().getCertificacion().getFechaSolicitud().toString();
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Folio Agf: " + folioAgf, authentication);
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Importe Aprobado: " + importeAprobado, authentication);
						
						logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
								this.getClass().getPackage().toString(), "","Fecha de Aprobacion: " + fecAprobacion, authentication);

				}
				
			}
		} catch (Exception e) {
			
			log.error(e.getMessage());
			logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CREAR, authentication);

       }
		
		PagosUtil pagosUtil = new PagosUtil();
		List<Map<String, Object>> listadatos;
		ArrayList<String> querys = new ArrayList<>();
		String encoded;
		String query;
		ActualizarMultiRequest actualizarMultiRequest = new ActualizarMultiRequest();
		
		if( !folioAgf.isEmpty() && importeAprobado>0.0 ) {
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","!folioAgf.isEmpty() && importeAprobado>0.0 ", authentication);
			
			estatusPago = "4";
			query = pagosUtil.totalPagado( registroAGFDto.getIdPagoBitacora() );
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
			
			request.getDatos().put(AppConstantes.QUERY, DatatypeConverter.printBase64Binary(query.getBytes("UTF-8")));
			
			response3 = (Response<Object>) providerRestTemplate.consumirServicio(request.getDatos(), urlDominio + CONSULTA, 
					authentication);
			
			listadatos = Arrays.asList(modelMapper.map(response3.getDatos(), Map[].class));
			Double totalPagado = (Double) listadatos.get(0).get("totalPagado");
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Total Pago BD " + totalPagado, authentication);
		
			totalPagado += importeAprobado;
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Total Pago Actualizado " + totalPagado, authentication);
			
			query = pagosUtil.impOds( registroAGFDto.getIdPagoBitacora() );
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
			
			request.getDatos().put(AppConstantes.QUERY, DatatypeConverter.printBase64Binary(query.getBytes("UTF-8")));
			
			response3 = (Response<Object>) providerRestTemplate.consumirServicio(request.getDatos(), urlDominio + CONSULTA, 
					authentication);
			
			listadatos = Arrays.asList(modelMapper.map(response3.getDatos(), Map[].class));
			Double impOds = (Double) listadatos.get(0).get("impOds");
			Integer idOds = (Integer) listadatos.get(0).get("idOds");

			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Importe Ods: " + impOds, authentication);
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","id Ods: " + idOds, authentication);
			
			if( totalPagado >= impOds ) {
				
				//Actualizamos la OS y el Pago de la Bitacora a Pagado
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Actualizamos Pago de la Bitacora a Pagado", authentication);
				
				
				query = pagosUtil.actODs( idOds, usuarioDto.getIdUsuario() );
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
				
				encoded = DatatypeConverter.printBase64Binary(query.getBytes());
				querys.add( encoded );
					
				query = pagosUtil.actPB( registroAGFDto.getIdPagoBitacora(), usuarioDto.getIdUsuario(), "4", "0" );
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
				
				encoded = DatatypeConverter.printBase64Binary(query.getBytes());
				querys.add( encoded );
				
				
			}else {
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "","Actualizamos Pago de la Bitacora a Pendiente", authentication);
				
				query = pagosUtil.actPB( registroAGFDto.getIdPagoBitacora(), usuarioDto.getIdUsuario(), "8", "1" );
				
				logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
						this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
				
				encoded = DatatypeConverter.printBase64Binary(query.getBytes());
				querys.add( encoded );
				
			}
		}
			
			CrearPagosRequest datos = new CrearPagosRequest();
			datos.setIdPagoBitacora( registroAGFDto.getIdPagoBitacora() );
			datos.setIdMetodoPago("2");
			datos.setImportePago( importeAprobado );
			datos.setNumAutorizacion( folioAgf );
			datos.setFechaPago(fecAprobacion);
			datos.setFechaValeAGF(fecAprobacion);
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Se crea el detalle del Pago", authentication);
			
			query = pagosUtil.crearDetalle(datos, usuarioDto.getIdUsuario(), estatusPago);
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
			
			encoded = DatatypeConverter.printBase64Binary(query.getBytes());
			querys.add( encoded );
			
			actualizarMultiRequest.setUpdates(querys);
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "",CONSULTA +" " + actualizarMultiRequest, authentication);
			
			response = providerRestTemplate.consumirServicioActMult(actualizarMultiRequest, urlDominio + ACTUALIZAR_MULTIPLES, 
					authentication);
		
		query = pagosUtil.detalleAGF( registroAGFDto.getIdPagoBitacora() );
		
		logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
				this.getClass().getPackage().toString(), "","Se guarda el registro en la tabla de AGF", authentication);
		
		logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
				this.getClass().getPackage().toString(), "",CONSULTA +" " + query, authentication);
		
		request.getDatos().put(AppConstantes.QUERY, DatatypeConverter.printBase64Binary(query.getBytes("UTF-8")));
		
		response3 = (Response<Object>) providerRestTemplate.consumirServicio(request.getDatos(), urlDominio + CONSULTA, 
				authentication);
		
		listadatos = Arrays.asList(modelMapper.map(response3.getDatos(), Map[].class));
		Integer idPagoDetalle = (Integer) listadatos.get(0).get("idPagoDetalle");
		
		registroAGFDto.setIdPagoDetalle(idPagoDetalle);
		
		response3 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.guardarASF(registroAGFDto, formatoFecha) .getDatos(), urlDominio + CREAR, authentication);
		
		if( folioAgf.isEmpty() ) {
			
			logUtil.crearArchivoLog(Level.INFO.toString(), this.getClass().getSimpleName(), 
					this.getClass().getPackage().toString(), "","Folio AGF Vacio", authentication);
			
			response3.setError(true);
			response3.setCodigo( HttpStatus.INTERNAL_SERVER_ERROR.value() );
			response3.setMensaje( "52" );
			
			if(salidaError != null
				&& !salidaError.isEmpty() ) {
				response3.setDatos( salidaError );
			}
		}
		
		return response3;
		
	}

	public boolean contienePalabraNull(String texto) {
		boolean tieneNulo = (texto == null) || (texto != null && texto.toLowerCase().contains("null"));
        return tieneNulo;
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
			log.info("registroNSSA");
			Integer intRamo = (Integer)datos1.get(0).get("ramo")==null?5:(Integer)datos1.get(0).get("ramo");
			log.info("intRamo {}",intRamo);
			if (intRamo == PENSIONADO) {
				moverDatosPensionado(pensionado, datos1,registroAGFDto);
				pensionado.setUsuarioOperador(new BigInteger(usuarioDto.getIdUsuario().toString()));
				log.info("moverDatosPensionado {}",pensionado.getCurp());
			} else {
				moverDatosAsegurado(asegurado, datos1,registroAGFDto);
				asegurado.setUsuarioOperador(new BigInteger(usuarioDto.getIdUsuario().toString()));
				log.info("moverDatosAsegurado {}",asegurado.getCurp());
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
			
			log.info("Datos del interesado {}",interesado.getCurp());
			
			if (intRamo == PENSIONADO) {
				pensionado.setDatosInteresado(interesado);
				log.info("Datos del interesado pensionado {}",pensionado.getCurp());
			} else {
			    asegurado.setDatosInteresado(interesado);
			    log.info("Datos del interesado asegurado {}",asegurado.getCurp());
			}
			
			// Armado de información para NSSA

			  log.info("Armado de información para NSSA");
			if (intRamo == PENSIONADO) { 
				 log.info("soap pensionado");
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
       	    throw new IOException(ERROR_INFORMACION, e.getCause());
       }
	
	}

	@Override
	public Response<Object> beneficiarios(DatosRequest request, Authentication authentication) throws IOException {
		
		String responseString = null;
		Gson gson = new Gson();
		String datosJson = String.valueOf(request.getDatos().get(AppConstantes.DATOS));
		BeneficiariosRequest beneficiarios = gson.fromJson(datosJson, BeneficiariosRequest.class);
		StringBuilder xml = new StringBuilder("<agfConsulta xmlns=\"http://www.imss.gob.mx/gastosFunerarios/entidades\"> \r\n"
				+ "<id-nss>");
		xml.append( beneficiarios.getCveNSS() );
		xml.append( "</id-nss>\r\n"
				+ "<fecha-defuncion>" );
		xml.append( beneficiarios.getFechaDefuncion() );
		xml.append( "</fecha-defuncion></agfConsulta>" );
		
		try {
			
			AutorizaGastosFunerariosService serviceLocatr = new AutorizaGastosFunerariosServiceLocator();
			AutorizaGastosFunerarios serviceClient = serviceLocatr.getAutorizaGF();
			responseString = serviceClient.consultaGastosFunerarios(xml.toString());
			if(responseString.contains("<cve-error>")) {
				log.info(responseString);
				return new Response<>(false, 200, ERROR_INFORMACION, null);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(),this.getClass().getPackage().toString(), "Fallo al ejecutar el reporte : "  + e.getMessage(), "consulta",authentication);
			throw new IOException(ERROR_INFORMACION, e.getCause());
		}
		
		AgfSalida agfSalida = null;
		
		if( responseString != null && !responseString.isEmpty() ) {
		
			responseString = responseString.replace("xmlns=\"http://www.imss.gob.mx/gastosFunerarios/entidades\"", "");
			
			try {
				
				JAXBContext context = JAXBContext.newInstance( AgfSalida.class );
				Unmarshaller unmarshaller = context.createUnmarshaller();
				StringReader reader = new StringReader(responseString);
				agfSalida = (AgfSalida) unmarshaller.unmarshal( reader );
				response= new Response<>(false, 200, EXITO, agfSalida.getComponenteType());
				
			} catch (JAXBException e) {
				log.info(e.getMessage());
				throw new IOException("Error al generar la factura");
			}
		}else {
			response= new Response<>(false, 500, ERROR_INFORMACION, null);
			
		}
		
		return response;
		
	}
	
	private void moverDatosAsegurado(AGFAsegurado asegurado, ArrayList<LinkedHashMap> datos1, RegistroAGFDto registroAGFDto) throws DatatypeConfigurationException, ParseException {
		asegurado.setCadena("RS0");
		asegurado.setTransaccion("1");
		asegurado.setTipoProceso("01");
		asegurado.setNss( registroAGFDto.getCveNSS() );
		asegurado.setCurp( registroAGFDto.getCveCURP());
		asegurado.setRamo( new BigInteger(registroAGFDto.getIdRamo().toString()) );
		asegurado.setFechaDefuncion( getXMLGregorianCalendar(registroAGFDto.getFecDefuncion()) );
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
		asegurado.getDatosFinado().setTelefono(contienePalabraNull((String)datos1.get(0).get("telefono"))?"1111111111":(String)datos1.get(0).get("telefono"));
		asegurado.getDatosFinado().setNacionalidad(false);
		
		asegurado.setDocumentacionProbatoria(new AGFDocumentacionProbatoria());
		asegurado.getDocumentacionProbatoria().setCurp( registroAGFDto.getCasillaCurp() );
		asegurado.getDocumentacionProbatoria().setActaDefuncion( registroAGFDto.getCasillaActDef() );
		asegurado.getDocumentacionProbatoria().setCuentaOriginalGF( registroAGFDto.getCasillaCogf() );
		asegurado.getDocumentacionProbatoria().setDocumentoConNSS( registroAGFDto.getCasillaNssi() );
		asegurado.getDocumentacionProbatoria().setIdOficial( new BigInteger(registroAGFDto.getIdTipoId().toString()) );
		
		String formatted = StringUtils.leftPad(registroAGFDto.getNumIdentificacion(), 20, '0');
		asegurado.getDocumentacionProbatoria().setNumIdOficial( formatted );
	}
	
	private void moverDatosPensionado(AGFPensionado pensionado, ArrayList<LinkedHashMap> datos1, RegistroAGFDto registroAGFDto) throws DatatypeConfigurationException, ParseException {
		pensionado.setCadena("RS0");
		pensionado.setTransaccion("1");
		pensionado.setTipoProceso("01");
		pensionado.setNss( registroAGFDto.getCveNSS() );
		pensionado.setCurp( registroAGFDto.getCveCURP());
		pensionado.setRamo( new BigInteger(registroAGFDto.getIdRamo().toString()) );
		pensionado.setFechaDefuncion( getXMLGregorianCalendar(registroAGFDto.getFecDefuncion()) );
		pensionado.setDelegacion((String)datos1.get(0).get("delegacion")==null?"":(String)datos1.get(0).get("delegacion"));
		pensionado.setVelatorioOperador((Integer)datos1.get(0).get("velatorioOperador")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("velatorioOperador").toString()));

		pensionado.setDatosFinado(new AGFPensionadoFinado());
		pensionado.getDatosFinado().setSelBeneficiario( registroAGFDto.getNombreBeneficiario() ); 
		pensionado.getDatosFinado().setCurp(registroAGFDto.getCveCURPBeneficiario());
		pensionado.getDatosFinado().setSexo((Integer)datos1.get(0).get("sexo")==null?new BigInteger("0"):new BigInteger(datos1.get(0).get("sexo").toString()));
		pensionado.getDatosFinado().setCalleNumero((String)datos1.get(0).get("calleNumero")==null?"":(String)datos1.get(0).get("calleNumero"));
		pensionado.getDatosFinado().setColonia((String)datos1.get(0).get("colonia")==null?"":(String)datos1.get(0).get("colonia"));
		pensionado.getDatosFinado().setCp((String)datos1.get(0).get("cp")==null?"":(String)datos1.get(0).get("cp"));
		pensionado.getDatosFinado().setCiudad((String)datos1.get(0).get("ciudad")==null?"":(String)datos1.get(0).get("ciudad"));
		pensionado.getDatosFinado().setEntidad((String)datos1.get(0).get("entidad")==null?"":(String)datos1.get(0).get("entidad"));
		pensionado.getDatosFinado().setDelegMunicipio((String)datos1.get(0).get("delegMunicipio")==null?"":(String)datos1.get(0).get("delegMunicipio"));
		pensionado.getDatosFinado().setTelefono(contienePalabraNull((String)datos1.get(0).get("telefono"))?"1111111111":(String)datos1.get(0).get("telefono"));
		pensionado.getDatosFinado().setNacionalidad(false);
		
		pensionado.setDocumentacionProbatoria(new AGFDocumentacionProbatoria());
		pensionado.getDocumentacionProbatoria().setCurp( registroAGFDto.getCasillaCurp() );
		pensionado.getDocumentacionProbatoria().setActaDefuncion( registroAGFDto.getCasillaActDef() );
		pensionado.getDocumentacionProbatoria().setCuentaOriginalGF( registroAGFDto.getCasillaCogf() );
		pensionado.getDocumentacionProbatoria().setDocumentoConNSS( registroAGFDto.getCasillaNssi() );
		pensionado.getDocumentacionProbatoria().setIdOficial( new BigInteger(registroAGFDto.getIdTipoId().toString()) );
		
		String formatted = StringUtils.leftPad(registroAGFDto.getNumIdentificacion(), 20, '0');
		pensionado.getDocumentacionProbatoria().setNumIdOficial( formatted );
		
	}
	
	private static XMLGregorianCalendar getXMLGregorianCalendar(String fecha) throws ParseException, DatatypeConfigurationException {
		 XMLGregorianCalendar xmlCalender=null;
		 GregorianCalendar calender = new GregorianCalendar();
		 calender.setTime(stringToJavaDate(fecha));
		 xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
		 xmlCalender.setTimezone( DatatypeConstants.FIELD_UNDEFINED );
		
		 log.info("XMLGregorianCalendar {}",xmlCalender);
		 return xmlCalender;
	}
	
	private static Date  stringToJavaDate(String sDate) throws ParseException {
	    Date date=null;
	    date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);        
	    return date;  
	}
	
}
