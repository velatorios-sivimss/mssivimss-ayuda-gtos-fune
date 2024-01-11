package com.imss.sivimss.registroagf.service;

import java.io.IOException;

import org.springframework.security.core.Authentication;

import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.Response;

public interface GastosAgfService {

	Response<Object> consultarGtoAsegurados(DatosRequest request, Authentication authentication) throws IOException;
	Response<Object> consultarGtoPensionados(DatosRequest request, Authentication authentication) throws IOException;
}
