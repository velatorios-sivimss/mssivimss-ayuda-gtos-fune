
package mx.gob.imss.ctirss.agf.service.certificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AGF_Respuesta_Pensionado_Velatorio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AGF_Respuesta_Pensionado_Velatorio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreVelatorio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroVelatorio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responsableVelatorio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cuentaClabe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estatusClabe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGF_Respuesta_Pensionado_Velatorio", propOrder = {
    "nombreVelatorio",
    "numeroVelatorio",
    "responsableVelatorio",
    "banco",
    "cuentaClabe",
    "estatusClabe"
})
public class AGFRespuestaPensionadoVelatorio {

    @XmlElement(required = true)
    protected String nombreVelatorio;
    @XmlElement(required = true)
    protected String numeroVelatorio;
    @XmlElement(required = true)
    protected String responsableVelatorio;
    @XmlElement(required = true)
    protected String banco;
    @XmlElement(required = true)
    protected String cuentaClabe;
    @XmlElement(required = true)
    protected String estatusClabe;

    /**
     * Obtiene el valor de la propiedad nombreVelatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreVelatorio() {
        return nombreVelatorio;
    }

    /**
     * Define el valor de la propiedad nombreVelatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreVelatorio(String value) {
        this.nombreVelatorio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroVelatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVelatorio() {
        return numeroVelatorio;
    }

    /**
     * Define el valor de la propiedad numeroVelatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVelatorio(String value) {
        this.numeroVelatorio = value;
    }

    /**
     * Obtiene el valor de la propiedad responsableVelatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsableVelatorio() {
        return responsableVelatorio;
    }

    /**
     * Define el valor de la propiedad responsableVelatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsableVelatorio(String value) {
        this.responsableVelatorio = value;
    }

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaClabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaClabe() {
        return cuentaClabe;
    }

    /**
     * Define el valor de la propiedad cuentaClabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaClabe(String value) {
        this.cuentaClabe = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusClabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusClabe() {
        return estatusClabe;
    }

    /**
     * Define el valor de la propiedad estatusClabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusClabe(String value) {
        this.estatusClabe = value;
    }

}
