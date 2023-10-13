package com.imss.sivimss.registroagf.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeneficiariosResponse {
	
	private String nombreBeneficiario;
	private String curp;
	
	public BeneficiariosResponse(String nombreBeneficiario, String curp) {
		super();
		this.nombreBeneficiario = nombreBeneficiario;
		this.curp = curp;
	}

}
