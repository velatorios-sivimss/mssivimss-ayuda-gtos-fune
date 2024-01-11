/**
 * AGF_Asegurado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class AGF_Asegurado  implements java.io.Serializable {
    private java.lang.String cadena;

    private java.lang.String transaccion;

    private java.lang.String tipoProceso;

    private java.lang.String nss;

    private java.lang.String curp;

    private java.math.BigInteger ramo;

    private java.util.Date fechaDefuncion;

    private java.lang.String delegacion;

    private java.math.BigInteger velatorioOperador;

    private java.math.BigInteger usuarioOperador;

    private com.imss.sivimss.registroagf.soap.AGF_Asegurado_Finado datosFinado;

    private com.imss.sivimss.registroagf.soap.AGF_Interesado datosInteresado;

    private com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria documentacionProbatoria;

    public AGF_Asegurado() {
    }

    public AGF_Asegurado(
           java.lang.String cadena,
           java.lang.String transaccion,
           java.lang.String tipoProceso,
           java.lang.String nss,
           java.lang.String curp,
           java.math.BigInteger ramo,
           java.util.Date fechaDefuncion,
           java.lang.String delegacion,
           java.math.BigInteger velatorioOperador,
           java.math.BigInteger usuarioOperador,
           com.imss.sivimss.registroagf.soap.AGF_Asegurado_Finado datosFinado,
           com.imss.sivimss.registroagf.soap.AGF_Interesado datosInteresado,
           com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria documentacionProbatoria) {
           this.cadena = cadena;
           this.transaccion = transaccion;
           this.tipoProceso = tipoProceso;
           this.nss = nss;
           this.curp = curp;
           this.ramo = ramo;
           this.fechaDefuncion = fechaDefuncion;
           this.delegacion = delegacion;
           this.velatorioOperador = velatorioOperador;
           this.usuarioOperador = usuarioOperador;
           this.datosFinado = datosFinado;
           this.datosInteresado = datosInteresado;
           this.documentacionProbatoria = documentacionProbatoria;
    }


    /**
     * Gets the cadena value for this AGF_Asegurado.
     * 
     * @return cadena
     */
    public java.lang.String getCadena() {
        return cadena;
    }


    /**
     * Sets the cadena value for this AGF_Asegurado.
     * 
     * @param cadena
     */
    public void setCadena(java.lang.String cadena) {
        this.cadena = cadena;
    }


    /**
     * Gets the transaccion value for this AGF_Asegurado.
     * 
     * @return transaccion
     */
    public java.lang.String getTransaccion() {
        return transaccion;
    }


    /**
     * Sets the transaccion value for this AGF_Asegurado.
     * 
     * @param transaccion
     */
    public void setTransaccion(java.lang.String transaccion) {
        this.transaccion = transaccion;
    }


    /**
     * Gets the tipoProceso value for this AGF_Asegurado.
     * 
     * @return tipoProceso
     */
    public java.lang.String getTipoProceso() {
        return tipoProceso;
    }


    /**
     * Sets the tipoProceso value for this AGF_Asegurado.
     * 
     * @param tipoProceso
     */
    public void setTipoProceso(java.lang.String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }


    /**
     * Gets the nss value for this AGF_Asegurado.
     * 
     * @return nss
     */
    public java.lang.String getNss() {
        return nss;
    }


    /**
     * Sets the nss value for this AGF_Asegurado.
     * 
     * @param nss
     */
    public void setNss(java.lang.String nss) {
        this.nss = nss;
    }


    /**
     * Gets the curp value for this AGF_Asegurado.
     * 
     * @return curp
     */
    public java.lang.String getCurp() {
        return curp;
    }


    /**
     * Sets the curp value for this AGF_Asegurado.
     * 
     * @param curp
     */
    public void setCurp(java.lang.String curp) {
        this.curp = curp;
    }


    /**
     * Gets the ramo value for this AGF_Asegurado.
     * 
     * @return ramo
     */
    public java.math.BigInteger getRamo() {
        return ramo;
    }


    /**
     * Sets the ramo value for this AGF_Asegurado.
     * 
     * @param ramo
     */
    public void setRamo(java.math.BigInteger ramo) {
        this.ramo = ramo;
    }


    /**
     * Gets the fechaDefuncion value for this AGF_Asegurado.
     * 
     * @return fechaDefuncion
     */
    public java.util.Date getFechaDefuncion() {
        return fechaDefuncion;
    }


    /**
     * Sets the fechaDefuncion value for this AGF_Asegurado.
     * 
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(java.util.Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    /**
     * Gets the delegacion value for this AGF_Asegurado.
     * 
     * @return delegacion
     */
    public java.lang.String getDelegacion() {
        return delegacion;
    }


    /**
     * Sets the delegacion value for this AGF_Asegurado.
     * 
     * @param delegacion
     */
    public void setDelegacion(java.lang.String delegacion) {
        this.delegacion = delegacion;
    }


    /**
     * Gets the velatorioOperador value for this AGF_Asegurado.
     * 
     * @return velatorioOperador
     */
    public java.math.BigInteger getVelatorioOperador() {
        return velatorioOperador;
    }


    /**
     * Sets the velatorioOperador value for this AGF_Asegurado.
     * 
     * @param velatorioOperador
     */
    public void setVelatorioOperador(java.math.BigInteger velatorioOperador) {
        this.velatorioOperador = velatorioOperador;
    }


    /**
     * Gets the usuarioOperador value for this AGF_Asegurado.
     * 
     * @return usuarioOperador
     */
    public java.math.BigInteger getUsuarioOperador() {
        return usuarioOperador;
    }


    /**
     * Sets the usuarioOperador value for this AGF_Asegurado.
     * 
     * @param usuarioOperador
     */
    public void setUsuarioOperador(java.math.BigInteger usuarioOperador) {
        this.usuarioOperador = usuarioOperador;
    }


    /**
     * Gets the datosFinado value for this AGF_Asegurado.
     * 
     * @return datosFinado
     */
    public com.imss.sivimss.registroagf.soap.AGF_Asegurado_Finado getDatosFinado() {
        return datosFinado;
    }


    /**
     * Sets the datosFinado value for this AGF_Asegurado.
     * 
     * @param datosFinado
     */
    public void setDatosFinado(com.imss.sivimss.registroagf.soap.AGF_Asegurado_Finado datosFinado) {
        this.datosFinado = datosFinado;
    }


    /**
     * Gets the datosInteresado value for this AGF_Asegurado.
     * 
     * @return datosInteresado
     */
    public com.imss.sivimss.registroagf.soap.AGF_Interesado getDatosInteresado() {
        return datosInteresado;
    }


    /**
     * Sets the datosInteresado value for this AGF_Asegurado.
     * 
     * @param datosInteresado
     */
    public void setDatosInteresado(com.imss.sivimss.registroagf.soap.AGF_Interesado datosInteresado) {
        this.datosInteresado = datosInteresado;
    }


    /**
     * Gets the documentacionProbatoria value for this AGF_Asegurado.
     * 
     * @return documentacionProbatoria
     */
    public com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria getDocumentacionProbatoria() {
        return documentacionProbatoria;
    }


    /**
     * Sets the documentacionProbatoria value for this AGF_Asegurado.
     * 
     * @param documentacionProbatoria
     */
    public void setDocumentacionProbatoria(com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria documentacionProbatoria) {
        this.documentacionProbatoria = documentacionProbatoria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AGF_Asegurado)) return false;
        AGF_Asegurado other = (AGF_Asegurado) obj;
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
            ((this.nss==null && other.getNss()==null) || 
             (this.nss!=null &&
              this.nss.equals(other.getNss()))) &&
            ((this.curp==null && other.getCurp()==null) || 
             (this.curp!=null &&
              this.curp.equals(other.getCurp()))) &&
            ((this.ramo==null && other.getRamo()==null) || 
             (this.ramo!=null &&
              this.ramo.equals(other.getRamo()))) &&
            ((this.fechaDefuncion==null && other.getFechaDefuncion()==null) || 
             (this.fechaDefuncion!=null &&
              this.fechaDefuncion.equals(other.getFechaDefuncion()))) &&
            ((this.delegacion==null && other.getDelegacion()==null) || 
             (this.delegacion!=null &&
              this.delegacion.equals(other.getDelegacion()))) &&
            ((this.velatorioOperador==null && other.getVelatorioOperador()==null) || 
             (this.velatorioOperador!=null &&
              this.velatorioOperador.equals(other.getVelatorioOperador()))) &&
            ((this.usuarioOperador==null && other.getUsuarioOperador()==null) || 
             (this.usuarioOperador!=null &&
              this.usuarioOperador.equals(other.getUsuarioOperador()))) &&
            ((this.datosFinado==null && other.getDatosFinado()==null) || 
             (this.datosFinado!=null &&
              this.datosFinado.equals(other.getDatosFinado()))) &&
            ((this.datosInteresado==null && other.getDatosInteresado()==null) || 
             (this.datosInteresado!=null &&
              this.datosInteresado.equals(other.getDatosInteresado()))) &&
            ((this.documentacionProbatoria==null && other.getDocumentacionProbatoria()==null) || 
             (this.documentacionProbatoria!=null &&
              this.documentacionProbatoria.equals(other.getDocumentacionProbatoria())));
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
        if (getNss() != null) {
            _hashCode += getNss().hashCode();
        }
        if (getCurp() != null) {
            _hashCode += getCurp().hashCode();
        }
        if (getRamo() != null) {
            _hashCode += getRamo().hashCode();
        }
        if (getFechaDefuncion() != null) {
            _hashCode += getFechaDefuncion().hashCode();
        }
        if (getDelegacion() != null) {
            _hashCode += getDelegacion().hashCode();
        }
        if (getVelatorioOperador() != null) {
            _hashCode += getVelatorioOperador().hashCode();
        }
        if (getUsuarioOperador() != null) {
            _hashCode += getUsuarioOperador().hashCode();
        }
        if (getDatosFinado() != null) {
            _hashCode += getDatosFinado().hashCode();
        }
        if (getDatosInteresado() != null) {
            _hashCode += getDatosInteresado().hashCode();
        }
        if (getDocumentacionProbatoria() != null) {
            _hashCode += getDocumentacionProbatoria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AGF_Asegurado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Asegurado"));
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
        elemField.setFieldName("nss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ramo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ramo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delegacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velatorioOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "velatorioOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosFinado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosFinado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Asegurado_Finado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosInteresado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosInteresado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Interesado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentacionProbatoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentacionProbatoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Documentacion_Probatoria"));
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
