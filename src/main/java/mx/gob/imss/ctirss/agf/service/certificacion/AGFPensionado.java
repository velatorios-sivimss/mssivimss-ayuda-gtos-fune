
package mx.gob.imss.ctirss.agf.service.certificacion;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para AGF_Pensionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AGF_Pensionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cadena" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transaccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nss" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="fechaDefuncion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="delegacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="velatorioOperador" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="usuarioOperador" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="datosFinado" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}AGF_Pensionado_Finado"/&gt;
 *         &lt;element name="datosInteresado" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}AGF_Interesado"/&gt;
 *         &lt;element name="documentacionProbatoria" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}AGF_Documentacion_Probatoria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGF_Pensionado", propOrder = {
    "cadena",
    "transaccion",
    "tipoProceso",
    "nss",
    "curp",
    "ramo",
    "fechaDefuncion",
    "delegacion",
    "velatorioOperador",
    "usuarioOperador",
    "datosFinado",
    "datosInteresado",
    "documentacionProbatoria"
})
public class AGFPensionado {

    @XmlElement(required = true)
    protected String cadena;
    @XmlElement(required = true)
    protected String transaccion;
    @XmlElement(required = true)
    protected String tipoProceso;
    @XmlElement(required = true)
    protected String nss;
    @XmlElement(required = true)
    protected String curp;
    @XmlElement(required = true)
    protected BigInteger ramo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDefuncion;
    @XmlElement(required = true)
    protected String delegacion;
    @XmlElement(required = true)
    protected BigInteger velatorioOperador;
    @XmlElement(required = true)
    protected BigInteger usuarioOperador;
    @XmlElement(required = true)
    protected AGFPensionadoFinado datosFinado;
    @XmlElement(required = true)
    protected AGFInteresado datosInteresado;
    @XmlElement(required = true)
    protected AGFDocumentacionProbatoria documentacionProbatoria;

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
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRamo(BigInteger value) {
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
     * Obtiene el valor de la propiedad velatorioOperador.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVelatorioOperador() {
        return velatorioOperador;
    }

    /**
     * Define el valor de la propiedad velatorioOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVelatorioOperador(BigInteger value) {
        this.velatorioOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioOperador.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsuarioOperador() {
        return usuarioOperador;
    }

    /**
     * Define el valor de la propiedad usuarioOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsuarioOperador(BigInteger value) {
        this.usuarioOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFinado.
     * 
     * @return
     *     possible object is
     *     {@link AGFPensionadoFinado }
     *     
     */
    public AGFPensionadoFinado getDatosFinado() {
        return datosFinado;
    }

    /**
     * Define el valor de la propiedad datosFinado.
     * 
     * @param value
     *     allowed object is
     *     {@link AGFPensionadoFinado }
     *     
     */
    public void setDatosFinado(AGFPensionadoFinado value) {
        this.datosFinado = value;
    }

    /**
     * Obtiene el valor de la propiedad datosInteresado.
     * 
     * @return
     *     possible object is
     *     {@link AGFInteresado }
     *     
     */
    public AGFInteresado getDatosInteresado() {
        return datosInteresado;
    }

    /**
     * Define el valor de la propiedad datosInteresado.
     * 
     * @param value
     *     allowed object is
     *     {@link AGFInteresado }
     *     
     */
    public void setDatosInteresado(AGFInteresado value) {
        this.datosInteresado = value;
    }

    /**
     * Obtiene el valor de la propiedad documentacionProbatoria.
     * 
     * @return
     *     possible object is
     *     {@link AGFDocumentacionProbatoria }
     *     
     */
    public AGFDocumentacionProbatoria getDocumentacionProbatoria() {
        return documentacionProbatoria;
    }

    /**
     * Define el valor de la propiedad documentacionProbatoria.
     * 
     * @param value
     *     allowed object is
     *     {@link AGFDocumentacionProbatoria }
     *     
     */
    public void setDocumentacionProbatoria(AGFDocumentacionProbatoria value) {
        this.documentacionProbatoria = value;
    }

}
