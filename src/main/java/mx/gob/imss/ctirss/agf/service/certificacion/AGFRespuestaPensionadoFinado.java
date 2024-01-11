
package mx.gob.imss.ctirss.agf.service.certificacion;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AGF_Respuesta_Pensionado_Finado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AGF_Respuesta_Pensionado_Finado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="valorReferencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="capitalConstitutivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoDerecho" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="montoAyuda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estatusPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="indResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="folioAGF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGF_Respuesta_Pensionado_Finado", propOrder = {
    "nombre",
    "apPaterno",
    "apMaterno",
    "curp",
    "sexo",
    "valorReferencia",
    "capitalConstitutivo",
    "tipoDerecho",
    "montoAyuda",
    "estatusPago",
    "indResolucion",
    "folioAGF"
})
public class AGFRespuestaPensionadoFinado {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apPaterno;
    @XmlElement(required = true)
    protected String apMaterno;
    @XmlElement(required = true)
    protected String curp;
    @XmlElement(required = true)
    protected BigInteger sexo;
    @XmlElement(required = true)
    protected String valorReferencia;
    @XmlElement(required = true)
    protected String capitalConstitutivo;
    @XmlElement(required = true)
    protected String tipoDerecho;
    @XmlElement(required = true)
    protected String montoAyuda;
    @XmlElement(required = true)
    protected String estatusPago;
    @XmlElement(required = true)
    protected String indResolucion;
    @XmlElement(required = true)
    protected String folioAGF;

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
     * Obtiene el valor de la propiedad valorReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorReferencia() {
        return valorReferencia;
    }

    /**
     * Define el valor de la propiedad valorReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorReferencia(String value) {
        this.valorReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalConstitutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalConstitutivo() {
        return capitalConstitutivo;
    }

    /**
     * Define el valor de la propiedad capitalConstitutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalConstitutivo(String value) {
        this.capitalConstitutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDerecho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDerecho() {
        return tipoDerecho;
    }

    /**
     * Define el valor de la propiedad tipoDerecho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDerecho(String value) {
        this.tipoDerecho = value;
    }

    /**
     * Obtiene el valor de la propiedad montoAyuda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoAyuda() {
        return montoAyuda;
    }

    /**
     * Define el valor de la propiedad montoAyuda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoAyuda(String value) {
        this.montoAyuda = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusPago() {
        return estatusPago;
    }

    /**
     * Define el valor de la propiedad estatusPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusPago(String value) {
        this.estatusPago = value;
    }

    /**
     * Obtiene el valor de la propiedad indResolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndResolucion() {
        return indResolucion;
    }

    /**
     * Define el valor de la propiedad indResolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndResolucion(String value) {
        this.indResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad folioAGF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioAGF() {
        return folioAGF;
    }

    /**
     * Define el valor de la propiedad folioAGF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioAGF(String value) {
        this.folioAGF = value;
    }

}
