/**
 * AGF_Respuesta_Pensionado_Velatorio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class AGF_Respuesta_Pensionado_Velatorio  implements java.io.Serializable {
    private java.lang.String nombreVelatorio;

    private java.lang.String numeroVelatorio;

    private java.lang.String responsableVelatorio;

    private java.lang.String banco;

    private java.lang.String cuentaClabe;

    private java.lang.String estatusClabe;

    public AGF_Respuesta_Pensionado_Velatorio() {
    }

    public AGF_Respuesta_Pensionado_Velatorio(
           java.lang.String nombreVelatorio,
           java.lang.String numeroVelatorio,
           java.lang.String responsableVelatorio,
           java.lang.String banco,
           java.lang.String cuentaClabe,
           java.lang.String estatusClabe) {
           this.nombreVelatorio = nombreVelatorio;
           this.numeroVelatorio = numeroVelatorio;
           this.responsableVelatorio = responsableVelatorio;
           this.banco = banco;
           this.cuentaClabe = cuentaClabe;
           this.estatusClabe = estatusClabe;
    }


    /**
     * Gets the nombreVelatorio value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @return nombreVelatorio
     */
    public java.lang.String getNombreVelatorio() {
        return nombreVelatorio;
    }


    /**
     * Sets the nombreVelatorio value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @param nombreVelatorio
     */
    public void setNombreVelatorio(java.lang.String nombreVelatorio) {
        this.nombreVelatorio = nombreVelatorio;
    }


    /**
     * Gets the numeroVelatorio value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @return numeroVelatorio
     */
    public java.lang.String getNumeroVelatorio() {
        return numeroVelatorio;
    }


    /**
     * Sets the numeroVelatorio value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @param numeroVelatorio
     */
    public void setNumeroVelatorio(java.lang.String numeroVelatorio) {
        this.numeroVelatorio = numeroVelatorio;
    }


    /**
     * Gets the responsableVelatorio value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @return responsableVelatorio
     */
    public java.lang.String getResponsableVelatorio() {
        return responsableVelatorio;
    }


    /**
     * Sets the responsableVelatorio value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @param responsableVelatorio
     */
    public void setResponsableVelatorio(java.lang.String responsableVelatorio) {
        this.responsableVelatorio = responsableVelatorio;
    }


    /**
     * Gets the banco value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @return banco
     */
    public java.lang.String getBanco() {
        return banco;
    }


    /**
     * Sets the banco value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @param banco
     */
    public void setBanco(java.lang.String banco) {
        this.banco = banco;
    }


    /**
     * Gets the cuentaClabe value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @return cuentaClabe
     */
    public java.lang.String getCuentaClabe() {
        return cuentaClabe;
    }


    /**
     * Sets the cuentaClabe value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @param cuentaClabe
     */
    public void setCuentaClabe(java.lang.String cuentaClabe) {
        this.cuentaClabe = cuentaClabe;
    }


    /**
     * Gets the estatusClabe value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @return estatusClabe
     */
    public java.lang.String getEstatusClabe() {
        return estatusClabe;
    }


    /**
     * Sets the estatusClabe value for this AGF_Respuesta_Pensionado_Velatorio.
     * 
     * @param estatusClabe
     */
    public void setEstatusClabe(java.lang.String estatusClabe) {
        this.estatusClabe = estatusClabe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AGF_Respuesta_Pensionado_Velatorio)) return false;
        AGF_Respuesta_Pensionado_Velatorio other = (AGF_Respuesta_Pensionado_Velatorio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreVelatorio==null && other.getNombreVelatorio()==null) || 
             (this.nombreVelatorio!=null &&
              this.nombreVelatorio.equals(other.getNombreVelatorio()))) &&
            ((this.numeroVelatorio==null && other.getNumeroVelatorio()==null) || 
             (this.numeroVelatorio!=null &&
              this.numeroVelatorio.equals(other.getNumeroVelatorio()))) &&
            ((this.responsableVelatorio==null && other.getResponsableVelatorio()==null) || 
             (this.responsableVelatorio!=null &&
              this.responsableVelatorio.equals(other.getResponsableVelatorio()))) &&
            ((this.banco==null && other.getBanco()==null) || 
             (this.banco!=null &&
              this.banco.equals(other.getBanco()))) &&
            ((this.cuentaClabe==null && other.getCuentaClabe()==null) || 
             (this.cuentaClabe!=null &&
              this.cuentaClabe.equals(other.getCuentaClabe()))) &&
            ((this.estatusClabe==null && other.getEstatusClabe()==null) || 
             (this.estatusClabe!=null &&
              this.estatusClabe.equals(other.getEstatusClabe())));
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
        if (getNombreVelatorio() != null) {
            _hashCode += getNombreVelatorio().hashCode();
        }
        if (getNumeroVelatorio() != null) {
            _hashCode += getNumeroVelatorio().hashCode();
        }
        if (getResponsableVelatorio() != null) {
            _hashCode += getResponsableVelatorio().hashCode();
        }
        if (getBanco() != null) {
            _hashCode += getBanco().hashCode();
        }
        if (getCuentaClabe() != null) {
            _hashCode += getCuentaClabe().hashCode();
        }
        if (getEstatusClabe() != null) {
            _hashCode += getEstatusClabe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AGF_Respuesta_Pensionado_Velatorio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Velatorio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreVelatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreVelatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroVelatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroVelatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsableVelatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsableVelatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "banco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaClabe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaClabe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatusClabe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estatusClabe"));
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
