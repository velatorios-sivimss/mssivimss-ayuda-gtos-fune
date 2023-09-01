
package com.imss.sivimss.registroagf.service.nssa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaAsegurado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaAsegurado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claveError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resolucion" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}ResolucionAGF_Asegurado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaAsegurado", propOrder = {
    "exito",
    "claveError",
    "descripcionError",
    "resolucion"
})
public class RespuestaAsegurado {

    @XmlElement(required = true)
    protected String exito;
    @XmlElement(required = true, nillable = true)
    protected String claveError;
    @XmlElement(required = true, nillable = true)
    protected String descripcionError;
    @XmlElement(required = true, nillable = true)
    protected ResolucionAGFAsegurado resolucion;

    /**
     * Obtiene el valor de la propiedad exito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExito() {
        return exito;
    }

    /**
     * Define el valor de la propiedad exito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExito(String value) {
        this.exito = value;
    }

    /**
     * Obtiene el valor de la propiedad claveError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveError() {
        return claveError;
    }

    /**
     * Define el valor de la propiedad claveError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveError(String value) {
        this.claveError = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Obtiene el valor de la propiedad resolucion.
     * 
     * @return
     *     possible object is
     *     {@link ResolucionAGFAsegurado }
     *     
     */
    public ResolucionAGFAsegurado getResolucion() {
        return resolucion;
    }

    /**
     * Define el valor de la propiedad resolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolucionAGFAsegurado }
     *     
     */
    public void setResolucion(ResolucionAGFAsegurado value) {
        this.resolucion = value;
    }

}
