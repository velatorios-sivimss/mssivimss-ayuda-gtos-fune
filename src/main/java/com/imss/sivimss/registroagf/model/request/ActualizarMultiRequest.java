package com.imss.sivimss.registroagf.model.request;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ActualizarMultiRequest {

	 @JsonProperty
	 private ArrayList<String> updates;
	
}
