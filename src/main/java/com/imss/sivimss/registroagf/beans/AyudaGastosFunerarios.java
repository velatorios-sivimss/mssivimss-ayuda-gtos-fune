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
		StringBuilder query = new StringBuilder("SELECT per.CVE_NSS AS cveNss, per.CVE_CURP AS cveCurp,  DATE_FORMAT(fin.FEC_DECESO,'%d/%m/%Y') AS fecDeceso, fin.ID_VELATORIO AS idVelatorio \n");
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
		StringBuilder query = new StringBuilder("SELECT agf.CVE_NSS AS nss, agf.CVE_CURP AS curp, ID_RAMO AS ramo, \n");
		query.append("DATE_FORMAT(agf.FEC_DEFUNCION,'%d/%m/%Y') AS fechaDefuncion, CONVERT(vel.ID_DELEGACION,CHAR) AS delegacion, \n");
		query.append("agf.ID_VELATORIO AS velatorioOperador, per.NUM_SEXO AS sexo, per.CVE_CURP AS curpFinado, \n");
		query.append("CONCAT(dom.DES_CALLE,' ',dom.NUM_EXTERIOR) AS calleNumero, \n");
		query.append("dom.DES_COLONIA AS colonia, CONVERT(dom.DES_CP,CHAR) AS cp, cp.DES_CIUDAD AS ciudad, \n");
		query.append("dom.DES_ESTADO AS entidad, dom.DES_MUNICIPIO AS delegMunicipio, per.REF_TELEFONO AS telefono, \n");
		query.append("agf.IND_CASILLA_CURP AS chkCurp, agf.IND_CASILLA_ACT_DEF AS chkActaDefuncion, \n");
		query.append("agf.IND_CASILLA_COGF AS chkCuentaOriginalGF, agf.IND_CASILLA_NSSI AS chkNSSI, \n");
		query.append("agf.ID_TIPO_IDENTIFICACION AS idOficial, agf.NUM_IDENTIFICACION AS numIdOficial, \n");
		query.append("agf.CVE_CURP_BENEFICIARIO AS curpBeneficiario, agf.NOM_BENEFICIARIO AS nomBeneficiario \n");
		query.append("FROM SVT_AYUDA_GASTOS_FUNERAL agf \n");
		query.append("JOIN SVC_VELATORIO vel ON vel.ID_VELATORIO = agf.ID_VELATORIO \n");
		query.append("JOIN SVC_FINADO fin ON fin.ID_FINADO = agf.ID_FINADO \n");
		query.append("JOIN SVC_PERSONA per ON per.ID_PERSONA = fin.ID_PERSONA \n");
		query.append("LEFT JOIN SVT_DOMICILIO dom ON dom.ID_DOMICILIO = fin.ID_DOMICILIO \n");
		query.append("LEFT JOIN SVC_CP cp ON (cp.CVE_CODIGO_POSTAL = dom.DES_CP AND UPPER(cp.DES_COLONIA) = UPPER(dom.DES_COLONIA)) \n");
		query.append("WHERE agf.ID_FINADO = " + idFinado);
		query.append(" GROUP BY fin.ID_FINADO");
		query.append(" ORDER BY fin.ID_FINADO DESC LIMIT 1");
		
		String encoded = DatatypeConverter.printBase64Binary(query.toString().getBytes("UTF-8"));
		request.getDatos().put(AppConstantes.QUERY, encoded);
		return request;
	}
	
	public DatosRequest datosInteresado(DatosRequest request, Integer idFinado) throws UnsupportedEncodingException {
		StringBuilder query = new StringBuilder("SELECT per.NOM_PERSONA AS nombre, per.NOM_PRIMER_APELLIDO AS apPaterno, \n");
		query.append("per.NOM_SEGUNDO_APELLIDO AS apMaterno, per.CVE_RFC AS curp, \n");
		query.append("CONCAT(dom.DES_CALLE,' ',dom.NUM_EXTERIOR) AS calleNumero, \n");
		query.append("dom.DES_COLONIA AS colonia, CONVERT(dom.DES_CP,CHAR) AS cp, cp.DES_CIUDAD AS ciudad, per.ID_ESTADO AS entidad, \n");
		query.append("dom.DES_MUNICIPIO AS delegMunicipio, per.REF_TELEFONO AS telefono, \n");
		query.append("cben.ID_PARENTESCO AS parentesco, DATE_FORMAT(os.FEC_ALTA,'%d/%m/%Y') AS fechaSolicitud \n");
		query.append("FROM SVC_FINADO fin \n");
		query.append("JOIN SVC_ORDEN_SERVICIO os ON os.ID_ORDEN_SERVICIO = fin.ID_ORDEN_SERVICIO \n");
		query.append("JOIN SVC_CONTRATANTE con ON con.ID_CONTRATANTE = os.ID_CONTRATANTE \n");
		query.append("JOIN SVC_PERSONA per ON per.ID_PERSONA = con.ID_PERSONA \n");
		query.append("JOIN SVT_CONTRATANTE_BENEFICIARIOS cben ON cben.ID_PERSONA = fin.ID_PERSONA \n");
		query.append("LEFT JOIN SVT_DOMICILIO dom ON dom.ID_DOMICILIO = con.ID_DOMICILIO \n");
		query.append("LEFT JOIN SVC_CP cp ON (cp.CVE_CODIGO_POSTAL = dom.DES_CP AND UPPER(cp.DES_COLONIA) = UPPER(dom.DES_COLONIA)) \n");
		query.append("WHERE fin.ID_FINADO = " + idFinado);
		query.append(" GROUP BY fin.ID_FINADO");
		query.append(" ORDER BY fin.ID_FINADO DESC LIMIT 1");
		
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
