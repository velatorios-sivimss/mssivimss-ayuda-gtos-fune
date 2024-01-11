/**
 * RespuestaPensionado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class RespuestaPensionado  implements java.io.Serializable {
    private java.lang.String exito;

    private java.lang.String claveError;

    private java.lang.String descripcionError;

    private com.imss.sivimss.registroagf.soap.ResolucionAGF_Pensionado resolucion;

    public RespuestaPensionado() {
    }

    public RespuestaPensionado(
           java.lang.String exito,
           java.lang.String claveError,
           java.lang.String descripcionError,
           com.imss.sivimss.registroagf.soap.ResolucionAGF_Pensionado resolucion) {
           this.exito = exito;
           this.claveError = claveError;
           this.descripcionError = descripcionError;
           this.resolucion = resolucion;
    }


    /**
     * Gets the exito value for this RespuestaPensionado.
     * 
     * @return exito
     */
    public java.lang.String getExito() {
        return exito;
    }


    /**
     * Sets the exito value for this RespuestaPensionado.
     * 
     * @param exito
     */
    public void setExito(java.lang.String exito) {
        this.exito = exito;
    }


    /**
     * Gets the claveError value for this RespuestaPensionado.
     * 
     * @return claveError
     */
    public java.lang.String getClaveError() {
        return claveError;
    }


    /**
     * Sets the claveError value for this RespuestaPensionado.
     * 
     * @param claveError
     */
    public void setClaveError(java.lang.String claveError) {
        this.claveError = claveError;
    }


    /**
     * Gets the descripcionError value for this RespuestaPensionado.
     * 
     * @return descripcionError
     */
    public java.lang.String getDescripcionError() {
        return descripcionError;
    }


    /**
     * Sets the descripcionError value for this RespuestaPensionado.
     * 
     * @param descripcionError
     */
    public void setDescripcionError(java.lang.String descripcionError) {
        this.descripcionError = descripcionError;
    }


    /**
     * Gets the resolucion value for this RespuestaPensionado.
     * 
     * @return resolucion
     */
    public com.imss.sivimss.registroagf.soap.ResolucionAGF_Pensionado getResolucion() {
        return resolucion;
    }


    /**
     * Sets the resolucion value for this RespuestaPensionado.
     * 
     * @param resolucion
     */
    public void setResolucion(com.imss.sivimss.registroagf.soap.ResolucionAGF_Pensionado resolucion) {
        this.resolucion = resolucion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaPensionado)) return false;
        RespuestaPensionado other = (RespuestaPensionado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exito==null && other.getExito()==null) || 
             (this.exito!=null &&
              this.exito.equals(other.getExito()))) &&
            ((this.claveError==null && other.getClaveError()==null) || 
             (this.claveError!=null &&
              this.claveError.equals(other.getClaveError()))) &&
            ((this.descripcionError==null && other.getDescripcionError()==null) || 
             (this.descripcionError!=null &&
              this.descripcionError.equals(other.getDescripcionError()))) &&
            ((this.resolucion==null && other.getResolucion()==null) || 
             (this.resolucion!=null &&
              this.resolucion.equals(other.getResolucion())));
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
        if (getExito() != null) {
            _hashCode += getExito().hashCode();
        }
        if (getClaveError() != null) {
            _hashCode += getClaveError().hashCode();
        }
        if (getDescripcionError() != null) {
            _hashCode += getDescripcionError().hashCode();
        }
        if (getResolucion() != null) {
            _hashCode += getResolucion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaPensionado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "RespuestaPensionado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "ResolucionAGF_Pensionado"));
        elemField.setNillable(true);
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
