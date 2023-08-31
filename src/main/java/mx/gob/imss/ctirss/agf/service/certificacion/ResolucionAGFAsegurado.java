
package mx.gob.imss.ctirss.agf.service.certificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResolucionAGF_Asegurado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResolucionAGF_Asegurado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificacion" type="{http://certificacion.service.agf.ctirss.imss.gob.mx/}CertificacionAGF_Asegurado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolucionAGF_Asegurado", propOrder = {
    "certificacion"
})
public class ResolucionAGFAsegurado {

    @XmlElement(required = true)
    protected CertificacionAGFAsegurado certificacion;

    /**
     * Obtiene el valor de la propiedad certificacion.
     * 
     * @return
     *     possible object is
     *     {@link CertificacionAGFAsegurado }
     *     
     */
    public CertificacionAGFAsegurado getCertificacion() {
        return certificacion;
    }

    /**
     * Define el valor de la propiedad certificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificacionAGFAsegurado }
     *     
     */
    public void setCertificacion(CertificacionAGFAsegurado value) {
        this.certificacion = value;
    }

}
