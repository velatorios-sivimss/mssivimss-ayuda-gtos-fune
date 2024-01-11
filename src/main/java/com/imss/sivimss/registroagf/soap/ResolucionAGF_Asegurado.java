/**
 * ResolucionAGF_Asegurado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class ResolucionAGF_Asegurado  implements java.io.Serializable {
    private com.imss.sivimss.registroagf.soap.CertificacionAGF_Asegurado certificacion;

    public ResolucionAGF_Asegurado() {
    }

    public ResolucionAGF_Asegurado(
           com.imss.sivimss.registroagf.soap.CertificacionAGF_Asegurado certificacion) {
           this.certificacion = certificacion;
    }


    /**
     * Gets the certificacion value for this ResolucionAGF_Asegurado.
     * 
     * @return certificacion
     */
    public com.imss.sivimss.registroagf.soap.CertificacionAGF_Asegurado getCertificacion() {
        return certificacion;
    }


    /**
     * Sets the certificacion value for this ResolucionAGF_Asegurado.
     * 
     * @param certificacion
     */
    public void setCertificacion(com.imss.sivimss.registroagf.soap.CertificacionAGF_Asegurado certificacion) {
        this.certificacion = certificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResolucionAGF_Asegurado)) return false;
        ResolucionAGF_Asegurado other = (ResolucionAGF_Asegurado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificacion==null && other.getCertificacion()==null) || 
             (this.certificacion!=null &&
              this.certificacion.equals(other.getCertificacion())));
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
        if (getCertificacion() != null) {
            _hashCode += getCertificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResolucionAGF_Asegurado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "ResolucionAGF_Asegurado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "CertificacionAGF_Asegurado"));
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
