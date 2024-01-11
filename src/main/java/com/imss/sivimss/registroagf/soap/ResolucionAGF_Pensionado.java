/**
 * ResolucionAGF_Pensionado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class ResolucionAGF_Pensionado  implements java.io.Serializable {
    private com.imss.sivimss.registroagf.soap.CertificacionAGF_Pensionado certificacionPensionado;

    public ResolucionAGF_Pensionado() {
    }

    public ResolucionAGF_Pensionado(
           com.imss.sivimss.registroagf.soap.CertificacionAGF_Pensionado certificacionPensionado) {
           this.certificacionPensionado = certificacionPensionado;
    }


    /**
     * Gets the certificacionPensionado value for this ResolucionAGF_Pensionado.
     * 
     * @return certificacionPensionado
     */
    public com.imss.sivimss.registroagf.soap.CertificacionAGF_Pensionado getCertificacionPensionado() {
        return certificacionPensionado;
    }


    /**
     * Sets the certificacionPensionado value for this ResolucionAGF_Pensionado.
     * 
     * @param certificacionPensionado
     */
    public void setCertificacionPensionado(com.imss.sivimss.registroagf.soap.CertificacionAGF_Pensionado certificacionPensionado) {
        this.certificacionPensionado = certificacionPensionado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResolucionAGF_Pensionado)) return false;
        ResolucionAGF_Pensionado other = (ResolucionAGF_Pensionado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificacionPensionado==null && other.getCertificacionPensionado()==null) || 
             (this.certificacionPensionado!=null &&
              this.certificacionPensionado.equals(other.getCertificacionPensionado())));
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
        if (getCertificacionPensionado() != null) {
            _hashCode += getCertificacionPensionado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResolucionAGF_Pensionado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "ResolucionAGF_Pensionado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacionPensionado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificacionPensionado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "CertificacionAGF_Pensionado"));
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
