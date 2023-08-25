package com.imss.sivimss.registroagf.beans;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import com.imss.sivimss.registroagf.model.request.RegistroAGFDto;
import com.imss.sivimss.registroagf.util.AppConstantes;
import com.imss.sivimss.registroagf.util.DatosRequest;
import com.imss.sivimss.registroagf.util.QueryHelper;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
public class AyudaGastosFunerarios {
	
	public DatosRequest detalle(DatosRequest request, String formatoFecha) throws UnsupportedEncodingException {
		String idFinado = request.getDatos().get("id").toString();
		StringBuilder query = new StringBuilder("SELECT per.CVE_NSS AS cveNss, per.CVE_CURP AS cveCurp,  DATE_FORMAT(fin.FEC_DECESO,'%d/%m/%Y') AS fecDeceso \n");
		query.append("FROM SVC_FINADO fin JOIN SVC_PERSONA per ON per.ID_PERSONA = fin.ID_PERSONA \n");
		query.append("WHERE ID_FINADO = " + idFinado);
	
		String encoded = DatatypeConverter.printBase64Binary(query.toString().getBytes("UTF-8"));
		request.getDatos().put(AppConstantes.QUERY, encoded);
		return request;
	}
	
	public DatosRequest listaRamos() throws UnsupportedEncodingException {
		DatosRequest request = new DatosRequest();
		Map<String, Object> parametro = new HashMap<>();
    	StringBuilder query = new StringBuilder("SELECT ID_RAMO AS idRamo, DES_RAMO AS desRamo \n");
    	query.append("FROM SVC_RAMO ");
    	
    	String encoded = DatatypeConverter.printBase64Binary(query.toString().getBytes("UTF-8"));
		parametro.put(AppConstantes.QUERY, encoded);
		request.setDatos(parametro);
		return request;
	}

	public DatosRequest listaTiposId() throws UnsupportedEncodingException {
		DatosRequest request = new DatosRequest();
		Map<String, Object> parametro = new HashMap<>();
    	StringBuilder query = new StringBuilder("SELECT ");
    	
    	String encoded = DatatypeConverter.printBase64Binary(query.toString().getBytes("UTF-8"));
		parametro.put(AppConstantes.QUERY, encoded);
		request.setDatos(parametro);
		return request;
	}
	
	public DatosRequest guardarASF(RegistroAGFDto registroAGFDto, String formatoFecha) throws UnsupportedEncodingException {
		DatosRequest request = new DatosRequest();
		Map<String, Object> parametro = new HashMap<>();
		final QueryHelper q = new QueryHelper("INSERT INTO SVT_AYUDA_GASTOS_FUNERAL ");
		q.agregarParametroValues("ID_FINADO", registroAGFDto.getIdFinado().toString());
		q.agregarParametroValues("ID_PAGO_DETALLE", registroAGFDto.getIdPagoDetalle().toString());
		q.agregarParametroValues("CVE_NSS", setValor(registroAGFDto.getCveNSS()));
		q.agregarParametroValues("CVE_CURP", setValor(registroAGFDto.getCveCURP()));
		q.agregarParametroValues("FEC_DEFUNCION", "STR_TO_DATE(" + setValor(registroAGFDto.getFecDefuncion()) + ",'" + formatoFecha + "')");
		q.agregarParametroValues("ID_RAMO", setValor(registroAGFDto.getIdRamo().toString()));
		q.agregarParametroValues("ID_IDENTIFICACION", setValor(registroAGFDto.getIdIdentificacion().toString()));
		q.agregarParametroValues("CASILLA_CURP", registroAGFDto.getCasillaCurp().toString());
		q.agregarParametroValues("CASILLA_ACT_DEF", registroAGFDto.getCasillaActDef().toString());
		q.agregarParametroValues("CASILLA_COGF", registroAGFDto.getCasillaCogf().toString());
		q.agregarParametroValues("CASILLA_NSSI", registroAGFDto.getCasillaNssi().toString());
		q.agregarParametroValues("ID_USUARIO_ALTA", registroAGFDto.getIdUsuarioAlta().toString());
		
		String query = q.obtenerQueryInsertar();
		String encoded = DatatypeConverter.printBase64Binary(query.getBytes("UTF-8"));
		parametro.put(AppConstantes.QUERY, encoded);
		request.setDatos(parametro);
		
		return request;
	}
	
	
	private String setValor(String valor) {
        if (valor == null || valor.equals("")) {
            return "NULL";
        } else {
            return "'" + valor + "'";
        }
    }
	
	
}
