package com.imss.sivimss.registroagf.beans;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		StringBuilder query = new StringBuilder("SELECT per.CVE_NSS AS cveNss, \r\n"
				+ "per.CVE_CURP AS cveCurp,  \r\n"
				+ "DATE_FORMAT(fin.FEC_DECESO,'");
		query.append(formatoFecha);
		query.append("') AS fecDeceso, \r\n"
				+ "fin.ID_VELATORIO AS idVelatorio,\r\n"
				+ "CONCAT(per.NOM_PERSONA, ' ', per.NOM_PRIMER_APELLIDO, ' ', per.NOM_SEGUNDO_APELLIDO) AS nombre\r\n"
				+ "FROM SVC_FINADO fin \r\n"
				+ "JOIN SVC_PERSONA per ON per.ID_PERSONA = fin.ID_PERSONA \r\n"
				+ "WHERE ID_FINADO = ");
		query.append(idFinado);
	
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
    	StringBuilder query = new StringBuilder("SELECT ID_TIPO_IDENTIFICACION AS idTipoId, DES_TIPO_IDENTIFICACION AS desTipoId \n");
    	query.append("FROM SVC_TIPO_IDENTIFICACION ");
    	
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
		q.agregarParametroValues("ID_PAGO_DETALLE", registroAGFDto.getIdPagoDetalle() + "");
		q.agregarParametroValues("CVE_NSS", setValor(registroAGFDto.getCveNSS()));
		q.agregarParametroValues("CVE_CURP", setValor(registroAGFDto.getCveCURP()));
		q.agregarParametroValues("FEC_DEFUNCION", "STR_TO_DATE(" + setValor(registroAGFDto.getFecDefuncion()) + ",'" + formatoFecha + "')");
		if( registroAGFDto.getIdVelatorio() != null )
			q.agregarParametroValues("ID_VELATORIO", setValor(registroAGFDto.getIdVelatorio() + ""));
		q.agregarParametroValues("ID_RAMO", registroAGFDto.getIdRamo() + "");
		q.agregarParametroValues("ID_TIPO_IDENTIFICACION", registroAGFDto.getIdTipoId() + "");
		q.agregarParametroValues("NUM_IDENTIFICACION", setValor(registroAGFDto.getNumIdentificacion()));
		q.agregarParametroValues("IND_CASILLA_CURP", registroAGFDto.getCasillaCurp() + "");
		q.agregarParametroValues("IND_CASILLA_ACT_DEF", registroAGFDto.getCasillaActDef() + "");
		q.agregarParametroValues("IND_CASILLA_COGF", registroAGFDto.getCasillaCogf() + "");
		q.agregarParametroValues("IND_CASILLA_NSSI", registroAGFDto.getCasillaNssi() + "");
		q.agregarParametroValues("IND_CASILLA_NSSI", registroAGFDto.getCasillaNssi() + "");
		q.agregarParametroValues("CVE_CURP_BENEFICIARIO", "'" + registroAGFDto.getCveCURPBeneficiario() + "'");
		q.agregarParametroValues("NOM_BENEFICIARIO", "'" + registroAGFDto.getNombreBeneficiario() + "'");
		q.agregarParametroValues("ID_USUARIO_ALTA", registroAGFDto.getIdUsuarioAlta() + "");
		
		String query = q.obtenerQueryInsertar();
		String encoded = DatatypeConverter.printBase64Binary(query.getBytes("UTF-8"));
		parametro.put(AppConstantes.QUERY, encoded);
		request.setDatos(parametro);
		
		return request;
	}
	
	public DatosRequest datosAsegurado(DatosRequest request, Integer idFinado) throws UnsupportedEncodingException {
		
		Logger log = LoggerFactory.getLogger(AyudaGastosFunerarios.class);
		
		StringBuilder query = new StringBuilder("SELECT \r\n"
				+ "PER.CVE_NSS AS nss, \r\n"
				+ "PER.CVE_CURP AS curp, \r\n"
				+ "CONVERT(VEL.ID_DELEGACION,CHAR) AS delegacion, \r\n"
				+ "FIN.ID_VELATORIO AS velatorioOperador, \r\n"
				+ "PER.NUM_SEXO AS sexo, \r\n"
				+ "PER.CVE_CURP AS curpFinado, \r\n"
				+ "CONCAT(DOM.REF_CALLE,' ',DOM.NUM_EXTERIOR) AS calleNumero, \r\n"
				+ "DOM.REF_COLONIA AS colonia, \r\n"
				+ "CONVERT(DOM.REF_CP,CHAR) AS cp, \r\n"
				+ "DOM.REF_MUNICIPIO AS ciudad, \r\n"
				+ "DOM.REF_ESTADO AS entidad, \r\n"
				+ "DOM.REF_MUNICIPIO AS delegMunicipio, \r\n"
				+ "PER.REF_TELEFONO AS telefono\r\n"
				+ "FROM \r\n"
				+ "SVC_FINADO FIN\r\n"
				+ "INNER JOIN SVC_ORDEN_SERVICIO ODS ON ODS.ID_ORDEN_SERVICIO = FIN.ID_ORDEN_SERVICIO\r\n"
				+ "INNER JOIN SVC_VELATORIO VEL ON VEL.ID_VELATORIO = ODS.ID_VELATORIO \r\n"
				+ "INNER JOIN SVC_PERSONA PER ON PER.ID_PERSONA = FIN.ID_PERSONA \r\n"
				+ "LEFT JOIN SVT_DOMICILIO DOM ON DOM.ID_DOMICILIO = FIN.ID_DOMICILIO \r\n"
				+ "WHERE FIN.ID_FINADO = ");
		query.append(idFinado);
		query.append(" \r\n"
				+ "ORDER BY FIN.ID_FINADO DESC \r\n"
				+ "LIMIT 1");
		
		log.info("Datos Asegurado: " + query.toString());
		
		String encoded = DatatypeConverter.printBase64Binary(query.toString().getBytes("UTF-8"));
		request.getDatos().put(AppConstantes.QUERY, encoded);
		return request;
	}
	
	public DatosRequest datosInteresado(DatosRequest request, Integer idFinado) throws UnsupportedEncodingException {
		StringBuilder query = new StringBuilder("SELECT \r\n"
				+ "per.NOM_PERSONA AS nombre, \r\n"
				+ "per.NOM_PRIMER_APELLIDO AS apPaterno, \r\n"
				+ "per.NOM_SEGUNDO_APELLIDO AS apMaterno, \r\n"
				+ "per.CVE_CURP AS curp, \r\n"
				+ "CONCAT(dom.REF_CALLE,' ',dom.NUM_EXTERIOR) AS calleNumero, \r\n"
				+ "dom.REF_COLONIA AS colonia, \r\n"
				+ "CONVERT(dom.REF_CP,CHAR) AS cp, \r\n"
				+ "dom.REF_MUNICIPIO AS ciudad, \r\n"
				+ "per.ID_ESTADO AS entidad, \r\n"
				+ "dom.REF_MUNICIPIO AS delegMunicipio, \r\n"
				+ "per.REF_TELEFONO AS telefono, \r\n"
				+ "IFNULL(os.ID_PARENTESCO,11) AS parentesco, \r\n"
				+ "DATE_FORMAT(os.FEC_ALTA,'%d/%m/%Y') AS fechaSolicitud \r\n"
				+ "FROM SVC_FINADO fin \r\n"
				+ "JOIN SVC_ORDEN_SERVICIO os ON os.ID_ORDEN_SERVICIO = fin.ID_ORDEN_SERVICIO \r\n"
				+ "JOIN SVC_CONTRATANTE con ON con.ID_CONTRATANTE = os.ID_CONTRATANTE \r\n"
				+ "JOIN SVC_PERSONA per ON per.ID_PERSONA = con.ID_PERSONA  \r\n"
				+ "LEFT JOIN SVT_DOMICILIO dom ON dom.ID_DOMICILIO = con.ID_DOMICILIO \r\n"
				+ "WHERE \r\n"
				+ "fin.ID_FINADO = " + idFinado);
		query.append("\r\n"
				+ "ORDER BY fin.ID_FINADO \r\n"
				+ "DESC LIMIT 1");
		
		String encoded = DatatypeConverter.printBase64Binary(query.toString().getBytes("UTF-8"));
		request.getDatos().put(AppConstantes.QUERY, encoded);
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
