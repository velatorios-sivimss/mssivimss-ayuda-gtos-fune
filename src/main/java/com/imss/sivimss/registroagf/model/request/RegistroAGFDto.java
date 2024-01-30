package com.imss.sivimss.registroagf.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistroAGFDto {
	
	Integer idFinado;
	Integer idPagoBitacora;
	Integer idPagoDetalle;
	String cveNSS;
	String cveCURP;
	String fecDefuncion;
	Integer idVelatorio;
	Integer idRamo;
	Integer idTipoId;
	String numIdentificacion;
	Boolean casillaCurp;
	Boolean casillaActDef;
	Boolean casillaCogf;
	Boolean casillaNssi;
	String cveCURPBeneficiario;
	String nombreBeneficiario;
	Integer idUsuarioAlta;
	String idBeneficiario;

}
