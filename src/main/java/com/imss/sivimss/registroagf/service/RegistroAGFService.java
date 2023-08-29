package com.imss.sivimss.registroagf.service;

import java.io.IOException;

import org.springframework.security.core.Authentication;

import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.Response;

public interface RegistroAGFService {
	
	Response<Object> detalle(DatosRequest request, Authentication authentication) throws IOException;
	
	Response<Object> listaRamos(DatosRequest request, Authentication authentication) throws IOException;

	Response<Object> listaTipoId(DatosRequest request, Authentication authentication) throws IOException;
	
	Response<Object> guardarAGF(DatosRequest request, Authentication authentication) throws IOException;
	
	Response<Object> beneficiarios(DatosRequest request, Authentication authentication) throws IOException;
	
	Response<Object> registroNSSA(DatosRequest request, Authentication authentication) throws IOException;
	
}
