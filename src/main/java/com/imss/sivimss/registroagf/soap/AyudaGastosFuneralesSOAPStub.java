/**
 * AyudaGastosFuneralesSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class AyudaGastosFuneralesSOAPStub extends org.apache.axis.client.Stub implements com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerAGFAsegurado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFAseguradoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Asegurado"), com.imss.sivimss.registroagf.soap.AGF_Asegurado.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "RespuestaAsegurado"));
        oper.setReturnClass(com.imss.sivimss.registroagf.soap.RespuestaAsegurado.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFAseguradoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerAGFPensionado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFPensionadoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Pensionado"), com.imss.sivimss.registroagf.soap.AGF_Pensionado.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "RespuestaPensionado"));
        oper.setReturnClass(com.imss.sivimss.registroagf.soap.RespuestaPensionado.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFPensionadoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public AyudaGastosFuneralesSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AyudaGastosFuneralesSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AyudaGastosFuneralesSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Asegurado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Asegurado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Asegurado_Finado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Asegurado_Finado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Documentacion_Probatoria");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Documentacion_Probatoria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Interesado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Interesado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Pensionado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Pensionado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Pensionado_Finado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Pensionado_Finado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Asegurado_Finado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Finado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Asegurado_Velatorio");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Respuesta_Asegurado_Velatorio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Beneficiarios");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Beneficiarios.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Finado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Finado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AGF_Respuesta_Pensionado_Velatorio");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.AGF_Respuesta_Pensionado_Velatorio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "CertificacionAGF_Asegurado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.CertificacionAGF_Asegurado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "CertificacionAGF_Pensionado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.CertificacionAGF_Pensionado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "ResolucionAGF_Asegurado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.ResolucionAGF_Asegurado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "ResolucionAGF_Pensionado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.ResolucionAGF_Pensionado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "RespuestaAsegurado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.RespuestaAsegurado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "RespuestaPensionado");
            cachedSerQNames.add(qName);
            cls = com.imss.sivimss.registroagf.soap.RespuestaPensionado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.imss.sivimss.registroagf.soap.RespuestaAsegurado obtenerAGFAsegurado(com.imss.sivimss.registroagf.soap.AGF_Asegurado obtenerAGFAseguradoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://certificacion.service.agf.ctirss.imss.gob.mx/AyudaGastosFunerales/obtenerAGFAsegurado");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "obtenerAGFAsegurado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obtenerAGFAseguradoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.imss.sivimss.registroagf.soap.RespuestaAsegurado) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.imss.sivimss.registroagf.soap.RespuestaAsegurado) org.apache.axis.utils.JavaUtils.convert(_resp, com.imss.sivimss.registroagf.soap.RespuestaAsegurado.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.imss.sivimss.registroagf.soap.RespuestaPensionado obtenerAGFPensionado(com.imss.sivimss.registroagf.soap.AGF_Pensionado obtenerAGFPensionadoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://certificacion.service.agf.ctirss.imss.gob.mx/AyudaGastosFunerales/obtenerAGFPensionado");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "obtenerAGFPensionado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obtenerAGFPensionadoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.imss.sivimss.registroagf.soap.RespuestaPensionado) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.imss.sivimss.registroagf.soap.RespuestaPensionado) org.apache.axis.utils.JavaUtils.convert(_resp, com.imss.sivimss.registroagf.soap.RespuestaPensionado.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
