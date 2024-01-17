
package com.imss.sivimss.registroagf.service.nssa;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.ToString;


/**
 * <p>Clase Java para AGF_Interesado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AGF_Interesado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calleNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="delegMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lada" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentesco" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGF_Interesado", propOrder = {
    "nombre",
    "apPaterno",
    "apMaterno",
    "curp",
    "calleNumero",
    "colonia",
    "cp",
    "ciudad",
    "entidad",
    "delegMunicipio",
    "lada",
    "telefono",
    "parentesco",
    "fechaSolicitud"
})
@ToString
public class AGFInteresado {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apPaterno;
    @XmlElement(required = true)
    protected String apMaterno;
    @XmlElement(required = true)
    protected String curp;
    @XmlElement(required = true)
    protected String calleNumero;
    @XmlElement(required = true)
    protected String colonia;
    @XmlElement(required = true)
    protected String cp;
    @XmlElement(required = true)
    protected String ciudad;
    @XmlElement(required = true)
    protected BigInteger entidad;
    @XmlElement(required = true)
    protected String delegMunicipio;
    @XmlElement(required = true)
    protected BigInteger lada;
    @XmlElement(required = true)
    protected String telefono;
    @XmlElement(required = true)
    protected BigInteger parentesco;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected XMLGregorianCalendar fechaSolicitud;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * Define el valor de la propiedad apPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaterno(String value) {
        this.apPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * Define el valor de la propiedad apMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApMaterno(String value) {
        this.apMaterno = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntidad(BigInteger value) {
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
     * Obtiene el valor de la propiedad lada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLada() {
        return lada;
    }

    /**
     * Define el valor de la propiedad lada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLada(BigInteger value) {
        this.lada = value;
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
     * Obtiene el valor de la propiedad parentesco.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentesco() {
        return parentesco;
    }

    /**
     * Define el valor de la propiedad parentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentesco(BigInteger value) {
        this.parentesco = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Define el valor de la propiedad fechaSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSolicitud(XMLGregorianCalendar value) {
        this.fechaSolicitud = value;
    }

}
