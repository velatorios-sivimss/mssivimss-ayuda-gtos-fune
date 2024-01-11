/**
 * AGF_Documentacion_Probatoria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class AGF_Documentacion_Probatoria  implements java.io.Serializable {
    private boolean curp;

    private boolean actaDefuncion;

    private boolean cuentaOriginalGF;

    private boolean documentoConNSS;

    private java.math.BigInteger idOficial;

    private java.lang.String numIdOficial;

    public AGF_Documentacion_Probatoria() {
    }

    public AGF_Documentacion_Probatoria(
           boolean curp,
           boolean actaDefuncion,
           boolean cuentaOriginalGF,
           boolean documentoConNSS,
           java.math.BigInteger idOficial,
           java.lang.String numIdOficial) {
           this.curp = curp;
           this.actaDefuncion = actaDefuncion;
           this.cuentaOriginalGF = cuentaOriginalGF;
           this.documentoConNSS = documentoConNSS;
           this.idOficial = idOficial;
           this.numIdOficial = numIdOficial;
    }


    /**
     * Gets the curp value for this AGF_Documentacion_Probatoria.
     * 
     * @return curp
     */
    public boolean isCurp() {
        return curp;
    }


    /**
     * Sets the curp value for this AGF_Documentacion_Probatoria.
     * 
     * @param curp
     */
    public void setCurp(boolean curp) {
        this.curp = curp;
    }


    /**
     * Gets the actaDefuncion value for this AGF_Documentacion_Probatoria.
     * 
     * @return actaDefuncion
     */
    public boolean isActaDefuncion() {
        return actaDefuncion;
    }


    /**
     * Sets the actaDefuncion value for this AGF_Documentacion_Probatoria.
     * 
     * @param actaDefuncion
     */
    public void setActaDefuncion(boolean actaDefuncion) {
        this.actaDefuncion = actaDefuncion;
    }


    /**
     * Gets the cuentaOriginalGF value for this AGF_Documentacion_Probatoria.
     * 
     * @return cuentaOriginalGF
     */
    public boolean isCuentaOriginalGF() {
        return cuentaOriginalGF;
    }


    /**
     * Sets the cuentaOriginalGF value for this AGF_Documentacion_Probatoria.
     * 
     * @param cuentaOriginalGF
     */
    public void setCuentaOriginalGF(boolean cuentaOriginalGF) {
        this.cuentaOriginalGF = cuentaOriginalGF;
    }


    /**
     * Gets the documentoConNSS value for this AGF_Documentacion_Probatoria.
     * 
     * @return documentoConNSS
     */
    public boolean isDocumentoConNSS() {
        return documentoConNSS;
    }


    /**
     * Sets the documentoConNSS value for this AGF_Documentacion_Probatoria.
     * 
     * @param documentoConNSS
     */
    public void setDocumentoConNSS(boolean documentoConNSS) {
        this.documentoConNSS = documentoConNSS;
    }


    /**
     * Gets the idOficial value for this AGF_Documentacion_Probatoria.
     * 
     * @return idOficial
     */
    public java.math.BigInteger getIdOficial() {
        return idOficial;
    }


    /**
     * Sets the idOficial value for this AGF_Documentacion_Probatoria.
     * 
     * @param idOficial
     */
    public void setIdOficial(java.math.BigInteger idOficial) {
        this.idOficial = idOficial;
    }


    /**
     * Gets the numIdOficial value for this AGF_Documentacion_Probatoria.
     * 
     * @return numIdOficial
     */
    public java.lang.String getNumIdOficial() {
        return numIdOficial;
    }


    /**
     * Sets the numIdOficial value for this AGF_Documentacion_Probatoria.
     * 
     * @param numIdOficial
     */
    public void setNumIdOficial(java.lang.String numIdOficial) {
        this.numIdOficial = numIdOficial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AGF_Documentacion_Probatoria)) return false;
        AGF_Documentacion_Probatoria other = (AGF_Documentacion_Probatoria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.curp == other.isCurp() &&
            this.actaDefuncion == other.isActaDefuncion() &&
            this.cuentaOriginalGF == other.isCuentaOriginalGF() &&
            this.documentoConNSS == other.isDocumentoConNSS() &&
            ((this.idOficial==null && other.getIdOficial()==null) || 
             (this.idOficial!=null &&
              this.idOficial.equals(other.getIdOficial()))) &&
            ((this.numIdOficial==null && other.getNumIdOficial()==null) || 
             (this.numIdOficial!=null &&
              this.numIdOficial.equals(other.getNumIdOficial())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isCurp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActaDefuncion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCuentaOriginalGF() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDocumentoConNSS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdOficial() != null) {
            _hashCode += getIdOficial().hashCode();
        }
        if (getNumIdOficial() != null) {
            _hashCode += getNumIdOficial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AGF_Documentacion_Probatoria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Documentacion_Probatoria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaOriginalGF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaOriginalGF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoConNSS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoConNSS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOficial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idOficial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numIdOficial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numIdOficial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
