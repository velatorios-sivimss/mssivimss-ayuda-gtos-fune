package com.imss.sivimss.registroagf.model.request;

import java.util.Date;

import com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria;
import com.imss.sivimss.registroagf.soap.AGF_Interesado;
import com.imss.sivimss.registroagf.soap.AGF_Pensionado_Finado;

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

	    private AGF_Pensionado_Finado datosFinado;

	    private AGF_Interesado datosInteresado;

	    private AGF_Documentacion_Probatoria documentacionProbatoria;

}
