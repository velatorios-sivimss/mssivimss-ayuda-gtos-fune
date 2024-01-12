package com.imss.sivimss.registroagf.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@JsonIgnoreType(value = true)
public class CrearPagosRequest {

	private Integer idPagoBitacora;
	private String idMetodoPago;
	private Integer idFlujoPago;
	private String idRegistro;
	private String idPagoDetalle;
	private Double importePago;
	private String numAutorizacion;
	private String descBanco;
	private String fechaPago;
	private String fechaValeAGF;
	private Double importeRegistro;
	private Boolean cambioMetPago;
	private Integer idVelatorio;
	
}
