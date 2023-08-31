package com.imss.sivimss.registroagf.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AGFFinadoDto {
	
	private Integer sexo;
	private String calleNumero;
	private String colonia;
	private String cp;
	private String ciudad;
	private String entidad;
	private String delegMunicipio;
	private String telefono;
	private Boolean nacionalidad;

}
