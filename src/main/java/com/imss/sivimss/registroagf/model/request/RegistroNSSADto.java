package com.imss.sivimss.registroagf.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistroNSSADto {
	
	Integer idFinado;
	String selBeneficiario;

}
