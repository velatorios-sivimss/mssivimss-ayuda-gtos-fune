package com.imss.sivimss.registroagf.model.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="agfSalida")
public class AgfSalida {

	List<ComponenteType> componenteType;

	@XmlElement(name = "componenteType")
	public List<ComponenteType> getComponenteType() {
		return componenteType;
	}

	public void setComponenteType(List<ComponenteType> componenteType) {
		this.componenteType = componenteType;
	}
}
