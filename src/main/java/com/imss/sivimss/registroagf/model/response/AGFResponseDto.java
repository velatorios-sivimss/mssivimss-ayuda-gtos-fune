package com.imss.sivimss.registroagf.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AGFResponseDto {

	private String nss;
	private String ramo;
	private String delegacion;
    private String fechaDefuncion;
	
}
