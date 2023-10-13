package com.imss.sivimss.registroagf.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="componenteType")
public class ComponenteType {

	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private String sexo;
	private String curp;
	private String numComponente;
	private String tipoPension;
	private String edoDerecho;
	private String motivoRechazo;
	private String idTransaccion;
	
	@XmlElement(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlElement(name = "apellido-paterno")
	public String getaPaterno() {
		return aPaterno;
	}
	
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	
	@XmlElement(name = "apellido-materno")
	public String getaMaterno() {
		return aMaterno;
	}
	
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	
	@XmlElement(name = "sexo")
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@XmlElement(name = "curp")
	public String getCurp() {
		return curp;
	}
	
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	@XmlElement(name = "num-componente")
	public String getNumComponente() {
		return numComponente;
	}
	
	public void setNumComponente(String numComponente) {
		this.numComponente = numComponente;
	}
	
	@XmlElement(name = "tipo-pension")
	public String getTipoPension() {
		return tipoPension;
	}
	
	public void setTipoPension(String tipoPension) {
		this.tipoPension = tipoPension;
	}
	
	@XmlElement(name = "edo-derecho")
	public String getEdoDerecho() {
		return edoDerecho;
	}
	
	public void setEdoDerecho(String edoDerecho) {
		this.edoDerecho = edoDerecho;
	}
	
	@XmlElement(name = "motivo-rechazo")
	public String getMotivoRechazo() {
		return motivoRechazo;
	}
	
	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
	}
	
	@XmlElement(name = "id-transaccion")
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	
}
