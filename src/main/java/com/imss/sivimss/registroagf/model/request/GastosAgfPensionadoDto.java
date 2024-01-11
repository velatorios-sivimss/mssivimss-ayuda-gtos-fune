package com.imss.sivimss.registroagf.model.request;

import java.util.Date;

import com.imss.sivimss.registroagf.certificacion.AGFDocumentacionProbatoria;
import com.imss.sivimss.registroagf.certificacion.AGFInteresado;
import com.imss.sivimss.registroagf.certificacion.AGFPensionadoFinado;

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
public class GastosAgfPensionadoDto {
	   private String cadena;

	    private String transaccion;

	    private String tipoProceso;

	    private String nss;

	    private String curp;

	    private Integer ramo;

	    private Date fechaDefuncion;

	    private String delegacion;

	    private Integer velatorioOperador;

	    private Integer usuarioOperador;

	    private AGFPensionadoFinado datosFinado;

	    private AGFInteresado datosInteresado;

	    private AGFDocumentacionProbatoria documentacionProbatoria;

}
