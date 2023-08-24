package com.imss.sivimss.registroagf.service.impl;

import java.io.IOException;
import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;

import com.google.gson.Gson;
import com.imss.sivimss.registroagf.beans.AyudaGastosFunerarios;
import com.imss.sivimss.registroagf.service.RegistroAGFService;
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.LogUtil;
import com.imss.sivimss.registroagf.util.ProviderServiceRestTemplate;
import com.imss.sivimss.registroagf.util.Response;
import com.imss.sivimss.registroagf.exception.BadRequestException;
import com.imss.sivimss.registroagf.model.request.UsuarioDto;
import com.imss.sivimss.registroagf.util.AppConstantes;
import com.imss.sivimss.registroagf.model.request.RegistroAGFDto;

public class RegistroAGFServiceImpl implements RegistroAGFService {
	
	@Value("${endpoints.mod-catalogos}")
	private String urlDominio;
	
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
	public Response<Object> guardarASF(DatosRequest request, Authentication authentication) throws IOException {
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
	public Response<Object> beneficiarios(DatosRequest request, Authentication authentication) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<Object> registroNSSA(DatosRequest request, Authentication authentication) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
