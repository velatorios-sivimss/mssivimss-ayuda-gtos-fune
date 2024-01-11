package com.imss.sivimss.registroagf.model.request;

import com.imss.sivimss.registroagf.certificacion.AGFAseguradoFinado;
import com.imss.sivimss.registroagf.certificacion.AGFDocumentacionProbatoria;
import com.imss.sivimss.registroagf.certificacion.AGFInteresado;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GastosAgfAseguradoraDto {
	   private String cadena;

	    private String transaccion;

	    private String tipoProceso;

	    private String nss;

	    private String curp;

	    private Integer ramo;

	    private java.util.Date fechaDefuncion;

	    private String delegacion;

	    private Integer velatorioOperador;

	    private Integer usuarioOperador;

	    private AGFAseguradoFinado datosFinado;

	    private AGFInteresado datosInteresado;

	    private AGFDocumentacionProbatoria documentacionProbatoria;
}
