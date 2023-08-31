package com.imss.sivimss.registroagf.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AGFAseguradoDto {

	private String nss;
	private String curp;
	private Integer ramo;
	private String fechaDefuncion;
	private String delegacion;
	private Integer velatorioOperador;
	private Integer usuarioOperador;
	private AGFFinadoDto finadoDto;
    private AGFInteresadoDto interesadoDto;
    private DocumProbatoriaDto documentacionDto;
	
}
