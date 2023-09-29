package com.imss.sivimss.registroagf.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeneficiariosRequest {
	
	private String nombreBeneficiario;
	private String curp;
	
	public BeneficiariosRequest(String nombreBeneficiario, String curp) {
		super();
		this.nombreBeneficiario = nombreBeneficiario;
		this.curp = curp;
	}

}
