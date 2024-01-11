/**
 * AGF_Respuesta_Pensionado_Beneficiarios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class AGF_Respuesta_Pensionado_Beneficiarios  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String apPaterno;

    private java.lang.String apMaterno;

    private java.lang.String curp;

    public AGF_Respuesta_Pensionado_Beneficiarios() {
    }

    public AGF_Respuesta_Pensionado_Beneficiarios(
           java.lang.String nombre,
           java.lang.String apPaterno,
           java.lang.String apMaterno,
           java.lang.String curp) {
           this.nombre = nombre;
           this.apPaterno = apPaterno;
           this.apMaterno = apMaterno;
           this.curp = curp;
    }


    /**
     * Gets the nombre value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the apPaterno value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @return apPaterno
     */
    public java.lang.String getApPaterno() {
        return apPaterno;
    }


    /**
     * Sets the apPaterno value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @param apPaterno
     */
    public void setApPaterno(java.lang.String apPaterno) {
        this.apPaterno = apPaterno;
    }


    /**
     * Gets the apMaterno value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @return apMaterno
     */
    public java.lang.String getApMaterno() {
        return apMaterno;
    }


    /**
     * Sets the apMaterno value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @param apMaterno
     */
    public void setApMaterno(java.lang.String apMaterno) {
        this.apMaterno = apMaterno;
    }


    /**
     * Gets the curp value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @return curp
     */
    public java.lang.String getCurp() {
        return curp;
    }


    /**
     * Sets the curp value for this AGF_Respuesta_Pensionado_Beneficiarios.
     * 
     * @param curp
     */
    public void setCurp(java.lang.String curp) {
        this.curp = curp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AGF_Respuesta_Pensionado_Beneficiarios)) return false;
        AGF_Respuesta_Pensionado_Beneficiarios other = (AGF_Respuesta_Pensionado_Beneficiarios) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.apPaterno==null && other.getApPaterno()==null) || 
             (this.apPaterno!=null &&
              this.apPaterno.equals(other.getApPaterno()))) &&
            ((this.apMaterno==null && other.getApMaterno()==null) || 
             (this.apMaterno!=null &&
              this.apMaterno.equals(other.getApMaterno()))) &&
            ((this.curp==null && other.getCurp()==null) || 
             (this.curp!=null &&
              this.curp.equals(other.getCurp())));
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getApPaterno() != null) {
            _hashCode += getApPaterno().hashCode();
        }
        if (getApMaterno() != null) {
            _hashCode += getApMaterno().hashCode();
        }
        if (getCurp() != null) {
            _hashCode += getCurp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AGF_Respuesta_Pensionado_Beneficiarios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Beneficiarios"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curp"));
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
