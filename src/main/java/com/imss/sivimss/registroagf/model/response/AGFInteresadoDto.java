package com.imss.sivimss.registroagf.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AGFInteresadoDto {

	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String curp;
	private String calleNumero;
	private String colonia;
	private String cp;
	private String ciudad;
	private Integer entidad;
	private String delegMunicipio;
	private Integer lada;
	private String telefono;
	private Integer parentesco;
	private String fechaSolicitud;
	
}
