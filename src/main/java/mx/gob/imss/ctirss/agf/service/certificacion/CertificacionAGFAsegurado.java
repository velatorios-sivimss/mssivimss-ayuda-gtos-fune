
package mx.gob.imss.ctirss.agf.service.certificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CertificacionAGF_Asegurado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificacionAGF_Asegurado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cadena" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transaccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaDefuncion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fechaTramite" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="velatorioOperador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usuarioOperador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delegacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nss" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datosFinado" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}AGF_Respuesta_Asegurado_Finado"/&gt;
 *         &lt;element name="datosVelatorio" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}AGF_Respuesta_Asegurado_Velatorio"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificacionAGF_Asegurado", propOrder = {
    "cadena",
    "transaccion",
    "tipoProceso",
    "codigoRetorno",
    "fechaDefuncion",
    "fechaSolicitud",
    "fechaTramite",
    "velatorioOperador",
    "usuarioOperador",
    "delegacion",
    "nss",
    "ramo",
    "datosFinado",
    "datosVelatorio"
})
public class CertificacionAGFAsegurado {

    @XmlElement(required = true)
    protected String cadena;
    @XmlElement(required = true)
    protected String transaccion;
    @XmlElement(required = true)
    protected String tipoProceso;
    @XmlElement(required = true)
    protected String codigoRetorno;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDefuncion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaSolicitud;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaTramite;
    @XmlElement(required = true)
    protected String velatorioOperador;
    @XmlElement(required = true)
    protected String usuarioOperador;
    @XmlElement(required = true)
    protected String delegacion;
    @XmlElement(required = true)
    protected String nss;
    @XmlElement(required = true)
    protected String ramo;
    @XmlElement(required = true)
    protected AGFRespuestaAseguradoFinado datosFinado;
    @XmlElement(required = true)
    protected AGFRespuestaAseguradoVelatorio datosVelatorio;

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
     * Obtiene el valor de la propiedad codigoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * Define el valor de la propiedad codigoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRetorno(String value) {
        this.codigoRetorno = value;
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
     * Obtiene el valor de la propiedad fechaTramite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTramite() {
        return fechaTramite;
    }

    /**
     * Define el valor de la propiedad fechaTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTramite(XMLGregorianCalendar value) {
        this.fechaTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad velatorioOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelatorioOperador() {
        return velatorioOperador;
    }

    /**
     * Define el valor de la propiedad velatorioOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelatorioOperador(String value) {
        this.velatorioOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioOperador() {
        return usuarioOperador;
    }

    /**
     * Define el valor de la propiedad usuarioOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioOperador(String value) {
        this.usuarioOperador = value;
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
     * Obtiene el valor de la propiedad datosFinado.
     * 
     * @return
     *     possible object is
     *     {@link AGFRespuestaAseguradoFinado }
     *     
     */
    public AGFRespuestaAseguradoFinado getDatosFinado() {
        return datosFinado;
    }

    /**
     * Define el valor de la propiedad datosFinado.
     * 
     * @param value
     *     allowed object is
     *     {@link AGFRespuestaAseguradoFinado }
     *     
     */
    public void setDatosFinado(AGFRespuestaAseguradoFinado value) {
        this.datosFinado = value;
    }

    /**
     * Obtiene el valor de la propiedad datosVelatorio.
     * 
     * @return
     *     possible object is
     *     {@link AGFRespuestaAseguradoVelatorio }
     *     
     */
    public AGFRespuestaAseguradoVelatorio getDatosVelatorio() {
        return datosVelatorio;
    }

    /**
     * Define el valor de la propiedad datosVelatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link AGFRespuestaAseguradoVelatorio }
     *     
     */
    public void setDatosVelatorio(AGFRespuestaAseguradoVelatorio value) {
        this.datosVelatorio = value;
    }

}
