
package com.imss.sivimss.registroagf.certificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para ResolucionAGF_Pensionado complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResolucionAGF_Pensionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificacionPensionado" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}CertificacionAGF_Pensionado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolucionAGF_Pensionado", propOrder = {
        "certificacionPensionado"
})
public class ResolucionAGFPensionado {

    @XmlElement(required = true)
    protected CertificacionAGFPensionado certificacionPensionado;

    /**
     * Obtiene el valor de la propiedad certificacionPensionado.
     * 
     * @return
     *         possible object is
     *         {@link CertificacionAGFPensionado }
     * 
     */
    public CertificacionAGFPensionado getCertificacionPensionado() {
        return certificacionPensionado;
    }

    /**
     * Define el valor de la propiedad certificacionPensionado.
     * 
     * @param value
     *              allowed object is
     *              {@link CertificacionAGFPensionado }
     * 
     */
    public void setCertificacionPensionado(CertificacionAGFPensionado value) {
        this.certificacionPensionado = value;
    }

}
