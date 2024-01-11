/**
 * CertificacionAGF_Pensionado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class CertificacionAGF_Pensionado  implements java.io.Serializable {
    private java.lang.String cadena;

    private java.lang.String transaccion;

    private java.lang.String tipoProceso;

    private java.lang.String delegacion;

    private java.lang.String nss;

    private java.lang.String ramo;

    private java.util.Date fechaDefuncion;

    private java.util.Date fechaSolicitud;

    private com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Beneficiarios datosBeneficiarios;

    private java.lang.String codigoRetorno;

    private com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Finado datosFinado;

    private com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Velatorio datosVelatorio;

    public CertificacionAGF_Pensionado() {
    }

    public CertificacionAGF_Pensionado(
           java.lang.String cadena,
           java.lang.String transaccion,
           java.lang.String tipoProceso,
           java.lang.String delegacion,
           java.lang.String nss,
           java.lang.String ramo,
           java.util.Date fechaDefuncion,
           java.util.Date fechaSolicitud,
           com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Beneficiarios datosBeneficiarios,
           java.lang.String codigoRetorno,
           com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Finado datosFinado,
           com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Velatorio datosVelatorio) {
           this.cadena = cadena;
           this.transaccion = transaccion;
           this.tipoProceso = tipoProceso;
           this.delegacion = delegacion;
           this.nss = nss;
           this.ramo = ramo;
           this.fechaDefuncion = fechaDefuncion;
           this.fechaSolicitud = fechaSolicitud;
           this.datosBeneficiarios = datosBeneficiarios;
           this.codigoRetorno = codigoRetorno;
           this.datosFinado = datosFinado;
           this.datosVelatorio = datosVelatorio;
    }


    /**
     * Gets the cadena value for this CertificacionAGF_Pensionado.
     * 
     * @return cadena
     */
    public java.lang.String getCadena() {
        return cadena;
    }


    /**
     * Sets the cadena value for this CertificacionAGF_Pensionado.
     * 
     * @param cadena
     */
    public void setCadena(java.lang.String cadena) {
        this.cadena = cadena;
    }


    /**
     * Gets the transaccion value for this CertificacionAGF_Pensionado.
     * 
     * @return transaccion
     */
    public java.lang.String getTransaccion() {
        return transaccion;
    }


    /**
     * Sets the transaccion value for this CertificacionAGF_Pensionado.
     * 
     * @param transaccion
     */
    public void setTransaccion(java.lang.String transaccion) {
        this.transaccion = transaccion;
    }


    /**
     * Gets the tipoProceso value for this CertificacionAGF_Pensionado.
     * 
     * @return tipoProceso
     */
    public java.lang.String getTipoProceso() {
        return tipoProceso;
    }


    /**
     * Sets the tipoProceso value for this CertificacionAGF_Pensionado.
     * 
     * @param tipoProceso
     */
    public void setTipoProceso(java.lang.String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }


    /**
     * Gets the delegacion value for this CertificacionAGF_Pensionado.
     * 
     * @return delegacion
     */
    public java.lang.String getDelegacion() {
        return delegacion;
    }


    /**
     * Sets the delegacion value for this CertificacionAGF_Pensionado.
     * 
     * @param delegacion
     */
    public void setDelegacion(java.lang.String delegacion) {
        this.delegacion = delegacion;
    }


    /**
     * Gets the nss value for this CertificacionAGF_Pensionado.
     * 
     * @return nss
     */
    public java.lang.String getNss() {
        return nss;
    }


    /**
     * Sets the nss value for this CertificacionAGF_Pensionado.
     * 
     * @param nss
     */
    public void setNss(java.lang.String nss) {
        this.nss = nss;
    }


    /**
     * Gets the ramo value for this CertificacionAGF_Pensionado.
     * 
     * @return ramo
     */
    public java.lang.String getRamo() {
        return ramo;
    }


    /**
     * Sets the ramo value for this CertificacionAGF_Pensionado.
     * 
     * @param ramo
     */
    public void setRamo(java.lang.String ramo) {
        this.ramo = ramo;
    }


    /**
     * Gets the fechaDefuncion value for this CertificacionAGF_Pensionado.
     * 
     * @return fechaDefuncion
     */
    public java.util.Date getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this CertificacionAGF_Pensionado.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(java.util.Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the fechaSolicitud value for this CertificacionAGF_Pensionado.
     * 
     * @return fechaSolicitud
     */
    public java.util.Date getFechaSolicitud() {
        return fechaSolicitud;
    }


    /**
     * Sets the fechaSolicitud value for this CertificacionAGF_Pensionado.
     * 
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(java.util.Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }


    /**
     * Gets the datosBeneficiarios value for this CertificacionAGF_Pensionado.
     * 
     * @return datosBeneficiarios
     */
    public com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Beneficiarios getDatosBeneficiarios() {
        return datosBeneficiarios;
    }


    /**
     * Sets the datosBeneficiarios value for this CertificacionAGF_Pensionado.
     * 
     * @param datosBeneficiarios
     */
    public void setDatosBeneficiarios(com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Beneficiarios datosBeneficiarios) {
        this.datosBeneficiarios = datosBeneficiarios;
    }


    /**
     * Gets the codigoRetorno value for this CertificacionAGF_Pensionado.
     * 
     * @return codigoRetorno
     */
    public java.lang.String getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this CertificacionAGF_Pensionado.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(java.lang.String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the datosFinado value for this CertificacionAGF_Pensionado.
     * 
     * @return datosFinado
     */
    public com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Finado getDatosFinado() {
        return datosFinado;
    }


    /**
     * Sets the datosFinado value for this CertificacionAGF_Pensionado.
     * 
     * @param datosFinado
     */
    public void setDatosFinado(com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Finado datosFinado) {
        this.datosFinado = datosFinado;
    }


    /**
     * Gets the datosVelatorio value for this CertificacionAGF_Pensionado.
     * 
     * @return datosVelatorio
     */
    public com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Velatorio getDatosVelatorio() {
        return datosVelatorio;
    }


    /**
     * Sets the datosVelatorio value for this CertificacionAGF_Pensionado.
     * 
     * @param datosVelatorio
     */
    public void setDatosVelatorio(com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Velatorio datosVelatorio) {
        this.datosVelatorio = datosVelatorio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificacionAGF_Pensionado)) return false;
        CertificacionAGF_Pensionado other = (CertificacionAGF_Pensionado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cadena==null && other.getCadena()==null) || 
             (this.cadena!=null &&
              this.cadena.equals(other.getCadena()))) &&
            ((this.transaccion==null && other.getTransaccion()==null) || 
             (this.transaccion!=null &&
              this.transaccion.equals(other.getTransaccion()))) &&
            ((this.tipoProceso==null && other.getTipoProceso()==null) || 
             (this.tipoProceso!=null &&
              this.tipoProceso.equals(other.getTipoProceso()))) &&
            ((this.delegacion==null && other.getDelegacion()==null) || 
             (this.delegacion!=null &&
              this.delegacion.equals(other.getDelegacion()))) &&
            ((this.nss==null && other.getNss()==null) || 
             (this.nss!=null &&
              this.nss.equals(other.getNss()))) &&
            ((this.ramo==null && other.getRamo()==null) || 
             (this.ramo!=null &&
              this.ramo.equals(other.getRamo()))) &&
            ((this.fechaDefuncion==null && other.getFechaDefuncion()==null) || 
             (this.fechaDefuncion!=null &&
              this.fechaDefuncion.equals(other.getFechaDefuncion()))) &&
            ((this.fechaSolicitud==null && other.getFechaSolicitud()==null) || 
             (this.fechaSolicitud!=null &&
              this.fechaSolicitud.equals(other.getFechaSolicitud()))) &&
            ((this.datosBeneficiarios==null && other.getDatosBeneficiarios()==null) || 
             (this.datosBeneficiarios!=null &&
              this.datosBeneficiarios.equals(other.getDatosBeneficiarios()))) &&
            ((this.codigoRetorno==null && other.getCodigoRetorno()==null) || 
             (this.codigoRetorno!=null &&
              this.codigoRetorno.equals(other.getCodigoRetorno()))) &&
            ((this.datosFinado==null && other.getDatosFinado()==null) || 
             (this.datosFinado!=null &&
              this.datosFinado.equals(other.getDatosFinado()))) &&
            ((this.datosVelatorio==null && other.getDatosVelatorio()==null) || 
             (this.datosVelatorio!=null &&
              this.datosVelatorio.equals(other.getDatosVelatorio())));
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
        if (getCadena() != null) {
            _hashCode += getCadena().hashCode();
        }
        if (getTransaccion() != null) {
            _hashCode += getTransaccion().hashCode();
        }
        if (getTipoProceso() != null) {
            _hashCode += getTipoProceso().hashCode();
        }
        if (getDelegacion() != null) {
            _hashCode += getDelegacion().hashCode();
        }
        if (getNss() != null) {
            _hashCode += getNss().hashCode();
        }
        if (getRamo() != null) {
            _hashCode += getRamo().hashCode();
        }
        if (getFechaDefuncion() != null) {
            _hashCode += getFechaDefuncion().hashCode();
        }
        if (getFechaSolicitud() != null) {
            _hashCode += getFechaSolicitud().hashCode();
        }
        if (getDatosBeneficiarios() != null) {
            _hashCode += getDatosBeneficiarios().hashCode();
        }
        if (getCodigoRetorno() != null) {
            _hashCode += getCodigoRetorno().hashCode();
        }
        if (getDatosFinado() != null) {
            _hashCode += getDatosFinado().hashCode();
        }
        if (getDatosVelatorio() != null) {
            _hashCode += getDatosVelatorio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificacionAGF_Pensionado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "CertificacionAGF_Pensionado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cadena");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cadena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProceso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delegacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ramo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ramo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosBeneficiarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosBeneficiarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Beneficiarios"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosFinado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosFinado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Finado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosVelatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosVelatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Velatorio"));
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
