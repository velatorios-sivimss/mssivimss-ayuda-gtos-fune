package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;

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
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.LogUtil;
import com.imss.sivimss.registroagf.util.ProviderServiceRestTemplate;
import com.imss.sivimss.registroagf.util.Response;
import com.imss.sivimss.registroagf.exception.BadRequestException;
import com.imss.sivimss.registroagf.model.request.UsuarioDto;
import com.imss.sivimss.registroagf.model.response.AGFAseguradoDto;
import com.imss.sivimss.registroagf.model.response.AGFFinadoDto;
import com.imss.sivimss.registroagf.model.response.AGFInteresadoDto;
import com.imss.sivimss.registroagf.model.response.DocumProbatoriaDto;
import com.imss.sivimss.registroagf.util.AppConstantes;
import com.imss.sivimss.registroagf.model.request.RegistroAGFDto;

@Service
public class RegistroAGFServiceImpl implements RegistroAGFService {
	
	@Value("${endpoints.mod-catalogos}")
	private String urlDominio;
	
	//@Value("${endpoints.url-nssa}")
	//private String urlNssa;
	
	private static final String CONSULTA = "/consulta";
	
	private static final String CREAR = "/crear";
	
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
			Response<?> response1 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.datosAsegurado(request, registroAGFDto.getIdFinado()).getDatos(), urlDominio + CONSULTA, authentication);
			ArrayList<LinkedHashMap> datos1 = (ArrayList) response1.getDatos();
			AGFAseguradoDto aseguradoDto = new AGFAseguradoDto();
			
			aseguradoDto.setNss((String)datos1.get(0).get("nss")==null?"":(String)datos1.get(0).get("nss"));
			aseguradoDto.setCurp((String)datos1.get(0).get("curp")==null?"":(String)datos1.get(0).get("curp"));
			aseguradoDto.setRamo((Integer)datos1.get(0).get("ramo")==null?5:(Integer)datos1.get(0).get("ramo"));
			aseguradoDto.setFechaDefuncion((String)datos1.get(0).get("fechaDefuncion")==null?"":(String)datos1.get(0).get("fechaDefuncion"));
			aseguradoDto.setDelegacion((String)datos1.get(0).get("delegacion")==null?"":(String)datos1.get(0).get("delegacion"));
			aseguradoDto.setVelatorioOperador((Integer)datos1.get(0).get("velatorioOperador")==null?0:(Integer)datos1.get(0).get("velatorioOperador"));
			aseguradoDto.setUsuarioOperador(usuarioDto.getIdUsuario());
			aseguradoDto.setFinadoDto(new AGFFinadoDto());
			aseguradoDto.getFinadoDto().setSexo((Integer)datos1.get(0).get("sexo")==null?0:(Integer)datos1.get(0).get("sexo"));
			aseguradoDto.getFinadoDto().setCalleNumero((String)datos1.get(0).get("calleNumero")==null?"":(String)datos1.get(0).get("calleNumero"));
			aseguradoDto.getFinadoDto().setColonia((String)datos1.get(0).get("colonia")==null?"":(String)datos1.get(0).get("colonia"));
			aseguradoDto.getFinadoDto().setCp((String)datos1.get(0).get("cp")==null?"":(String)datos1.get(0).get("cp"));
			aseguradoDto.getFinadoDto().setColonia((String)datos1.get(0).get("ciudad")==null?"":(String)datos1.get(0).get("ciudad"));
			aseguradoDto.getFinadoDto().setEntidad((String)datos1.get(0).get("entidad")==null?"":(String)datos1.get(0).get("entidad"));
			aseguradoDto.getFinadoDto().setDelegMunicipio((String)datos1.get(0).get("delegMunicipio")==null?"":(String)datos1.get(0).get("delegMunicipio"));
			aseguradoDto.getFinadoDto().setTelefono((String)datos1.get(0).get("telefono")==null?"":(String)datos1.get(0).get("telefono"));
			aseguradoDto.getFinadoDto().setNacionalidad(false);
			aseguradoDto.setDocumentacionDto(new DocumProbatoriaDto());
			aseguradoDto.getDocumentacionDto().setCurp((Boolean)datos1.get(0).get("chkCurp")==null?false:(Boolean)datos1.get(0).get("chkCurp"));
			aseguradoDto.getDocumentacionDto().setActaDefuncion((Boolean)datos1.get(0).get("chkActaDefuncion")==null?false:(Boolean)datos1.get(0).get("chkActaDefuncion"));
			aseguradoDto.getDocumentacionDto().setCuentaOriginalGF((Boolean)datos1.get(0).get("chkCuentaOriginalGF")==null?false:(Boolean)datos1.get(0).get("chkCuentaOriginalGF"));
			aseguradoDto.getDocumentacionDto().setDocumentoConNSS((Boolean)datos1.get(0).get("chkNSSI")==null?false:(Boolean)datos1.get(0).get("chkNSSI"));
			aseguradoDto.getDocumentacionDto().setIdOficial((Integer)datos1.get(0).get("idOficial")==null?0:(Integer)datos1.get(0).get("idOficial"));
			aseguradoDto.getDocumentacionDto().setNumIdOficial((String)datos1.get(0).get("numIdOficial")==null?"":(String)datos1.get(0).get("numIdOficial"));
			
			Response<?> response2 = (Response<Object>) providerRestTemplate.consumirServicio(ayudaGF.datosInteresado(request, registroAGFDto.getIdFinado()).getDatos(), urlDominio + CONSULTA, authentication);
			ArrayList<LinkedHashMap> datos2 = (ArrayList) response2.getDatos();
			AGFInteresadoDto interesadoDto = new AGFInteresadoDto();
			
			interesadoDto.setNombre((String)datos2.get(0).get("nombre")==null?"":(String)datos2.get(0).get("nombre"));
			interesadoDto.setApPaterno((String)datos2.get(0).get("apPaterno")==null?"":(String)datos2.get(0).get("apPaterno"));
			interesadoDto.setApMaterno((String)datos2.get(0).get("apMaterno")==null?"":(String)datos2.get(0).get("apMaterno"));
			interesadoDto.setCurp((String)datos2.get(0).get("curp")==null?"":(String)datos2.get(0).get("curp"));
			interesadoDto.setCalleNumero((String)datos2.get(0).get("calleNumero")==null?"":(String)datos2.get(0).get("calleNumero"));
			interesadoDto.setColonia((String)datos2.get(0).get("colonia")==null?"":(String)datos2.get(0).get("colonia"));
			interesadoDto.setCp((String)datos2.get(0).get("cp")==null?"":(String)datos2.get(0).get("cp"));
			interesadoDto.setCiudad((String)datos2.get(0).get("ciudad")==null?"":(String)datos2.get(0).get("ciudad"));
			interesadoDto.setEntidad((Integer)datos2.get(0).get("entidad")==null?0:(Integer)datos2.get(0).get("entidad"));
			interesadoDto.setDelegMunicipio((String)datos2.get(0).get("delegMunicipio")==null?"":(String)datos2.get(0).get("delegMunicipio"));
			interesadoDto.setTelefono((String)datos2.get(0).get("telefono")==null?"":(String)datos2.get(0).get("telefono"));
			interesadoDto.setParentesco((Integer)datos2.get(0).get("parentesco")==null?0:(Integer)datos2.get(0).get("parentesco"));
			interesadoDto.setFechaSolicitud((String)datos2.get(0).get("fechaSolicitud")==null?"":(String)datos2.get(0).get("fechaSolicitud"));

			Response respuesta = new Response();
			respuesta.setCodigo(200);
			respuesta.setDatos(aseguradoDto);
			respuesta.setError(false);
			
			return respuesta;
		    //return (Response<Object>) providerRestTemplate.consumirServicio(parametro, urlDominio + CONSULTA, authentication);
		} catch (Exception e) {
			log.error(e.getMessage());
       	    logUtil.crearArchivoLog(Level.SEVERE.toString(), this.getClass().getSimpleName(), this.getClass().getPackage().toString(), e.getMessage(), CREAR, authentication);
			return null;
       }
	
	}

	@Override
	public Response<Object> beneficiarios(DatosRequest request, Authentication authentication) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*private String consultaNssa(String servicio) throws IOException {
		String status;
		Map<String, Object> resp;
		String url = urlNssa + servicio;
		
    	//Hacemos el consumo para consultar el NSSA
		resp = providerRestTemplate.consumirServicioGet(url);
		status = (String) resp.get("status");
		
		return status;
	}*/
	
}
