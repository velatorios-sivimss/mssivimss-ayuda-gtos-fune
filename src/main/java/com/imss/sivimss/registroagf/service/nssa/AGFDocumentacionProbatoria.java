
package com.imss.sivimss.registroagf.service.nssa;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AGF_Documentacion_Probatoria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AGF_Documentacion_Probatoria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="actaDefuncion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cuentaOriginalGF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="documentoConNSS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idOficial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numIdOficial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGF_Documentacion_Probatoria", propOrder = {
    "curp",
    "actaDefuncion",
    "cuentaOriginalGF",
    "documentoConNSS",
    "idOficial",
    "numIdOficial"
})
public class AGFDocumentacionProbatoria {

    protected boolean curp;
    protected boolean actaDefuncion;
    protected boolean cuentaOriginalGF;
    protected boolean documentoConNSS;
    @XmlElement(required = true)
    protected BigInteger idOficial;
    @XmlElement(required = true)
    protected String numIdOficial;

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     */
    public boolean isCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     */
    public void setCurp(boolean value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad actaDefuncion.
     * 
     */
    public boolean isActaDefuncion() {
        return actaDefuncion;
    }

    /**
     * Define el valor de la propiedad actaDefuncion.
     * 
     */
    public void setActaDefuncion(boolean value) {
        this.actaDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaOriginalGF.
     * 
     */
    public boolean isCuentaOriginalGF() {
        return cuentaOriginalGF;
    }

    /**
     * Define el valor de la propiedad cuentaOriginalGF.
     * 
     */
    public void setCuentaOriginalGF(boolean value) {
        this.cuentaOriginalGF = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoConNSS.
     * 
     */
    public boolean isDocumentoConNSS() {
        return documentoConNSS;
    }

    /**
     * Define el valor de la propiedad documentoConNSS.
     * 
     */
    public void setDocumentoConNSS(boolean value) {
        this.documentoConNSS = value;
    }

    /**
     * Obtiene el valor de la propiedad idOficial.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdOficial() {
        return idOficial;
    }

    /**
     * Define el valor de la propiedad idOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdOficial(BigInteger value) {
        this.idOficial = value;
    }

    /**
     * Obtiene el valor de la propiedad numIdOficial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdOficial() {
        return numIdOficial;
    }

    /**
     * Define el valor de la propiedad numIdOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdOficial(String value) {
        this.numIdOficial = value;
    }

}
