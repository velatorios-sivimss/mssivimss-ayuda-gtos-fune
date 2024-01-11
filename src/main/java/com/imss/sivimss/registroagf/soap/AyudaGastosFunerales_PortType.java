/**
 * AyudaGastosFunerales_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.imss.sivimss.registroagf.soap;

public interface AyudaGastosFunerales_PortType extends java.rmi.Remote {
    public com.imss.sivimss.registroagf.soap.RespuestaAsegurado obtenerAGFAsegurado(com.imss.sivimss.registroagf.soap.AGF_Asegurado obtenerAGFAseguradoRequest) throws java.rmi.RemoteException;
    public com.imss.sivimss.registroagf.soap.RespuestaPensionado obtenerAGFPensionado(com.imss.sivimss.registroagf.soap.AGF_Pensionado obtenerAGFPensionadoRequest) throws java.rmi.RemoteException;
}
