/**
 * AyudaGastosFunerales_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public class AyudaGastosFunerales_ServiceLocator extends org.apache.axis.client.Service implements com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_Service {

    public AyudaGastosFunerales_ServiceLocator() {
    }


    public AyudaGastosFunerales_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AyudaGastosFunerales_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AyudaGastosFuneralesSOAP
    private java.lang.String AyudaGastosFuneralesSOAP_address = "http://tspi-stage.imss.gob.mx:80/agf-web-service/AyudaGastosFunerales";

    public java.lang.String getAyudaGastosFuneralesSOAPAddress() {
        return AyudaGastosFuneralesSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AyudaGastosFuneralesSOAPWSDDServiceName = "AyudaGastosFuneralesSOAP";

    public java.lang.String getAyudaGastosFuneralesSOAPWSDDServiceName() {
        return AyudaGastosFuneralesSOAPWSDDServiceName;
    }

    public void setAyudaGastosFuneralesSOAPWSDDServiceName(java.lang.String name) {
        AyudaGastosFuneralesSOAPWSDDServiceName = name;
    }

    public com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType getAyudaGastosFuneralesSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AyudaGastosFuneralesSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAyudaGastosFuneralesSOAP(endpoint);
    }

    public com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType getAyudaGastosFuneralesSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.imss.sivimss.registroagf.soap.AyudaGastosFuneralesSOAPStub _stub = new com.imss.sivimss.registroagf.soap.AyudaGastosFuneralesSOAPStub(portAddress, this);
            _stub.setPortName(getAyudaGastosFuneralesSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAyudaGastosFuneralesSOAPEndpointAddress(java.lang.String address) {
        AyudaGastosFuneralesSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.imss.sivimss.registroagf.soap.AyudaGastosFuneralesSOAPStub _stub = new com.imss.sivimss.registroagf.soap.AyudaGastosFuneralesSOAPStub(new java.net.URL(AyudaGastosFuneralesSOAP_address), this);
                _stub.setPortName(getAyudaGastosFuneralesSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AyudaGastosFuneralesSOAP".equals(inputPortName)) {
            return getAyudaGastosFuneralesSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AyudaGastosFunerales");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "AyudaGastosFuneralesSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AyudaGastosFuneralesSOAP".equals(portName)) {
            setAyudaGastosFuneralesSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
