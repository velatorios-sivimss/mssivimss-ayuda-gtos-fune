
package com.imss.sivimss.registroagf.service.nssa;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AGF_Pensionado_Finado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AGF_Pensionado_Finado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="calleNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delegMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGF_Pensionado_Finado", propOrder = {
    "selBeneficiario",
    "curp",
    "sexo",
    "calleNumero",
    "colonia",
    "cp",
    "ciudad",
    "entidad",
    "delegMunicipio",
    "telefono",
    "nacionalidad"
})
public class AGFPensionadoFinado {

    @XmlElement(required = true)
    protected String selBeneficiario;
    @XmlElement(required = true)
    protected String curp;
    @XmlElement(required = true)
    protected BigInteger sexo;
    @XmlElement(required = true)
    protected String calleNumero;
    @XmlElement(required = true)
    protected String colonia;
    @XmlElement(required = true)
    protected String cp;
    @XmlElement(required = true)
    protected String ciudad;
    @XmlElement(required = true)
    protected String entidad;
    @XmlElement(required = true)
    protected String delegMunicipio;
    @XmlElement(required = true)
    protected String telefono;
    protected boolean nacionalidad;

    /**
     * Obtiene el valor de la propiedad selBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelBeneficiario() {
        return selBeneficiario;
    }

    /**
     * Define el valor de la propiedad selBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelBeneficiario(String value) {
        this.selBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSexo(BigInteger value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad calleNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleNumero() {
        return calleNumero;
    }

    /**
     * Define el valor de la propiedad calleNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleNumero(String value) {
        this.calleNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCp() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCp(String value) {
        this.cp = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidad(String value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad delegMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegMunicipio() {
        return delegMunicipio;
    }

    /**
     * Define el valor de la propiedad delegMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegMunicipio(String value) {
        this.delegMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     */
    public boolean isNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     */
    public void setNacionalidad(boolean value) {
        this.nacionalidad = value;
    }

}
