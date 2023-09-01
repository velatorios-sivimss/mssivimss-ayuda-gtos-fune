
package com.imss.sivimss.registroagf.service.nssa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CertificacionAGF_Pensionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificacionAGF_Pensionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cadena" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transaccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delegacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nss" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaDefuncion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="datosBeneficiarios" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}AGF_Respuesta_Pensionado_Beneficiarios"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificacionAGF_Pensionado", propOrder = {
    "cadena",
    "transaccion",
    "tipoProceso",
    "delegacion",
    "nss",
    "ramo",
    "fechaDefuncion",
    "fechaSolicitud",
    "datosBeneficiarios"
})
public class CertificacionAGFPensionado {

    @XmlElement(required = true)
    protected String cadena;
    @XmlElement(required = true)
    protected String transaccion;
    @XmlElement(required = true)
    protected String tipoProceso;
    @XmlElement(required = true)
    protected String delegacion;
    @XmlElement(required = true)
    protected String nss;
    @XmlElement(required = true)
    protected String ramo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDefuncion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaSolicitud;
    @XmlElement(required = true)
    protected AGFRespuestaPensionadoBeneficiarios datosBeneficiarios;

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaccion(String value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad delegacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegacion() {
        return delegacion;
    }

    /**
     * Define el valor de la propiedad delegacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegacion(String value) {
        this.delegacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNss() {
        return nss;
    }

    /**
     * Define el valor de la propiedad nss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNss(String value) {
        this.nss = value;
    }

    /**
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamo(String value) {
        this.ramo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDefuncion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * Define el valor de la propiedad fechaDefuncion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDefuncion(XMLGregorianCalendar value) {
        this.fechaDefuncion = value;
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

    /**
     * Obtiene el valor de la propiedad datosBeneficiarios.
     * 
     * @return
     *     possible object is
     *     {@link AGFRespuestaPensionadoBeneficiarios }
     *     
     */
    public AGFRespuestaPensionadoBeneficiarios getDatosBeneficiarios() {
        return datosBeneficiarios;
    }

    /**
     * Define el valor de la propiedad datosBeneficiarios.
     * 
     * @param value
     *     allowed object is
     *     {@link AGFRespuestaPensionadoBeneficiarios }
     *     
     */
    public void setDatosBeneficiarios(AGFRespuestaPensionadoBeneficiarios value) {
        this.datosBeneficiarios = value;
    }

}
