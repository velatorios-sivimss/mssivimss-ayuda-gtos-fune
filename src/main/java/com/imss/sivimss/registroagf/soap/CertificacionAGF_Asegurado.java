/**
 * CertificacionAGF_Asegurado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class CertificacionAGF_Asegurado  implements java.io.Serializable {
    private java.lang.String cadena;

    private java.lang.String transaccion;

    private java.lang.String tipoProceso;

    private java.lang.String codigoRetorno;

    private java.util.Date fechaDefuncion;

    private java.util.Date fechaSolicitud;

    private java.util.Date fechaTramite;

    private java.lang.String velatorioOperador;

    private java.lang.String usuarioOperador;

    private java.lang.String delegacion;

    private java.lang.String nss;

    private java.lang.String ramo;

    private com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Finado datosFinado;

    private com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Velatorio datosVelatorio;

    public CertificacionAGF_Asegurado() {
    }

    public CertificacionAGF_Asegurado(
           java.lang.String cadena,
           java.lang.String transaccion,
           java.lang.String tipoProceso,
           java.lang.String codigoRetorno,
           java.util.Date fechaDefuncion,
           java.util.Date fechaSolicitud,
           java.util.Date fechaTramite,
           java.lang.String velatorioOperador,
           java.lang.String usuarioOperador,
           java.lang.String delegacion,
           java.lang.String nss,
           java.lang.String ramo,
           com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Finado datosFinado,
           com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Velatorio datosVelatorio) {
           this.cadena = cadena;
           this.transaccion = transaccion;
           this.tipoProceso = tipoProceso;
           this.codigoRetorno = codigoRetorno;
           this.fechaDefuncion = fechaDefuncion;
           this.fechaSolicitud = fechaSolicitud;
           this.fechaTramite = fechaTramite;
           this.velatorioOperador = velatorioOperador;
           this.usuarioOperador = usuarioOperador;
           this.delegacion = delegacion;
           this.nss = nss;
           this.ramo = ramo;
           this.datosFinado = datosFinado;
           this.datosVelatorio = datosVelatorio;
    }


    /**
     * Gets the cadena value for this CertificacionAGF_Asegurado.
     * 
     * @return cadena
     */
    public java.lang.String getCadena() {
        return cadena;
    }


    /**
     * Sets the cadena value for this CertificacionAGF_Asegurado.
     * 
     * @param cadena
     */
    public void setCadena(java.lang.String cadena) {
        this.cadena = cadena;
    }


    /**
     * Gets the transaccion value for this CertificacionAGF_Asegurado.
     * 
     * @return transaccion
     */
    public java.lang.String getTransaccion() {
        return transaccion;
    }


    /**
     * Sets the transaccion value for this CertificacionAGF_Asegurado.
     * 
     * @param transaccion
     */
    public void setTransaccion(java.lang.String transaccion) {
        this.transaccion = transaccion;
    }


    /**
     * Gets the tipoProceso value for this CertificacionAGF_Asegurado.
     * 
     * @return tipoProceso
     */
    public java.lang.String getTipoProceso() {
        return tipoProceso;
    }


    /**
     * Sets the tipoProceso value for this CertificacionAGF_Asegurado.
     * 
     * @param tipoProceso
     */
    public void setTipoProceso(java.lang.String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }


    /**
     * Gets the codigoRetorno value for this CertificacionAGF_Asegurado.
     * 
     * @return codigoRetorno
     */
    public java.lang.String getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this CertificacionAGF_Asegurado.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(java.lang.String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the fechaDefuncion value for this CertificacionAGF_Asegurado.
     * 
     * @return fechaDefuncion
     */
    public java.util.Date getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this CertificacionAGF_Asegurado.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(java.util.Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the fechaSolicitud value for this CertificacionAGF_Asegurado.
     * 
     * @return fechaSolicitud
     */
    public java.util.Date getFechaSolicitud() {
        return fechaSolicitud;
    }


    /**
     * Sets the fechaSolicitud value for this CertificacionAGF_Asegurado.
     * 
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(java.util.Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }


    /**
     * Gets the fechaTramite value for this CertificacionAGF_Asegurado.
     * 
     * @return fechaTramite
     */
    public java.util.Date getFechaTramite() {
        return fechaTramite;
    }


    /**
     * Sets the fechaTramite value for this CertificacionAGF_Asegurado.
     * 
     * @param fechaTramite
     */
    public void setFechaTramite(java.util.Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }


    /**
     * Gets the velatorioOperador value for this CertificacionAGF_Asegurado.
     * 
     * @return velatorioOperador
     */
    public java.lang.String getVelatorioOperador() {
        return velatorioOperador;
    }


    /**
     * Sets the velatorioOperador value for this CertificacionAGF_Asegurado.
     * 
     * @param velatorioOperador
     */
    public void setVelatorioOperador(java.lang.String velatorioOperador) {
        this.velatorioOperador = velatorioOperador;
    }


    /**
     * Gets the usuarioOperador value for this CertificacionAGF_Asegurado.
     * 
     * @return usuarioOperador
     */
    public java.lang.String getUsuarioOperador() {
        return usuarioOperador;
    }


    /**
     * Sets the usuarioOperador value for this CertificacionAGF_Asegurado.
     * 
     * @param usuarioOperador
     */
    public void setUsuarioOperador(java.lang.String usuarioOperador) {
        this.usuarioOperador = usuarioOperador;
    }


    /**
     * Gets the delegacion value for this CertificacionAGF_Asegurado.
     * 
     * @return delegacion
     */
    public java.lang.String getDelegacion() {
        return delegacion;
    }


    /**
     * Sets the delegacion value for this CertificacionAGF_Asegurado.
     * 
     * @param delegacion
     */
    public void setDelegacion(java.lang.String delegacion) {
        this.delegacion = delegacion;
    }


    /**
     * Gets the nss value for this CertificacionAGF_Asegurado.
     * 
     * @return nss
     */
    public java.lang.String getNss() {
        return nss;
    }


    /**
     * Sets the nss value for this CertificacionAGF_Asegurado.
     * 
     * @param nss
     */
    public void setNss(java.lang.String nss) {
        this.nss = nss;
    }


    /**
     * Gets the ramo value for this CertificacionAGF_Asegurado.
     * 
     * @return ramo
     */
    public java.lang.String getRamo() {
        return ramo;
    }


    /**
     * Sets the ramo value for this CertificacionAGF_Asegurado.
     * 
     * @param ramo
     */
    public void setRamo(java.lang.String ramo) {
        this.ramo = ramo;
    }


    /**
     * Gets the datosFinado value for this CertificacionAGF_Asegurado.
     * 
     * @return datosFinado
     */
    public com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Finado getDatosFinado() {
        return datosFinado;
    }


    /**
     * Sets the datosFinado value for this CertificacionAGF_Asegurado.
     * 
     * @param datosFinado
     */
    public void setDatosFinado(com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Finado datosFinado) {
        this.datosFinado = datosFinado;
    }


    /**
     * Gets the datosVelatorio value for this CertificacionAGF_Asegurado.
     * 
     * @return datosVelatorio
     */
    public com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Velatorio getDatosVelatorio() {
        return datosVelatorio;
    }


    /**
     * Sets the datosVelatorio value for this CertificacionAGF_Asegurado.
     * 
     * @param datosVelatorio
     */
    public void setDatosVelatorio(com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Velatorio datosVelatorio) {
        this.datosVelatorio = datosVelatorio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificacionAGF_Asegurado)) return false;
        CertificacionAGF_Asegurado other = (CertificacionAGF_Asegurado) obj;
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
            ((this.codigoRetorno==null && other.getCodigoRetorno()==null) || 
             (this.codigoRetorno!=null &&
              this.codigoRetorno.equals(other.getCodigoRetorno()))) &&
            ((this.fechaDefuncion==null && other.getFechaDefuncion()==null) || 
             (this.fechaDefuncion!=null &&
              this.fechaDefuncion.equals(other.getFechaDefuncion()))) &&
            ((this.fechaSolicitud==null && other.getFechaSolicitud()==null) || 
             (this.fechaSolicitud!=null &&
              this.fechaSolicitud.equals(other.getFechaSolicitud()))) &&
            ((this.fechaTramite==null && other.getFechaTramite()==null) || 
             (this.fechaTramite!=null &&
              this.fechaTramite.equals(other.getFechaTramite()))) &&
            ((this.velatorioOperador==null && other.getVelatorioOperador()==null) || 
             (this.velatorioOperador!=null &&
              this.velatorioOperador.equals(other.getVelatorioOperador()))) &&
            ((this.usuarioOperador==null && other.getUsuarioOperador()==null) || 
             (this.usuarioOperador!=null &&
              this.usuarioOperador.equals(other.getUsuarioOperador()))) &&
            ((this.delegacion==null && other.getDelegacion()==null) || 
             (this.delegacion!=null &&
              this.delegacion.equals(other.getDelegacion()))) &&
            ((this.nss==null && other.getNss()==null) || 
             (this.nss!=null &&
              this.nss.equals(other.getNss()))) &&
            ((this.ramo==null && other.getRamo()==null) || 
             (this.ramo!=null &&
              this.ramo.equals(other.getRamo()))) &&
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
        if (getCodigoRetorno() != null) {
            _hashCode += getCodigoRetorno().hashCode();
        }
        if (getFechaDefuncion() != null) {
            _hashCode += getFechaDefuncion().hashCode();
        }
        if (getFechaSolicitud() != null) {
            _hashCode += getFechaSolicitud().hashCode();
        }
        if (getFechaTramite() != null) {
            _hashCode += getFechaTramite().hashCode();
        }
        if (getVelatorioOperador() != null) {
            _hashCode += getVelatorioOperador().hashCode();
        }
        if (getUsuarioOperador() != null) {
            _hashCode += getUsuarioOperador().hashCode();
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
        new org.apache.axis.description.TypeDesc(CertificacionAGF_Asegurado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "CertificacionAGF_Asegurado"));
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
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
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
        elemField.setFieldName("fechaTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velatorioOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "velatorioOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioOperador"));
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
        elemField.setFieldName("datosFinado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosFinado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Asegurado_Finado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosVelatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosVelatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Asegurado_Velatorio"));
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
