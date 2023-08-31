package com.imss.sivimss.registroagf.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumProbatoriaDto {

	private Boolean curp;
	private Boolean actaDefuncion;
	private Boolean cuentaOriginalGF;
	private Boolean documentoConNSS;
	private Integer idOficial;
	private String numIdOficial;
	
}
