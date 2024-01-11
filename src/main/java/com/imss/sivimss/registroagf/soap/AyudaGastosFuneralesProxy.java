package com.imss.sivimss.registroagf.soap;

public class AyudaGastosFuneralesProxy implements com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType {
  private String _endpoint = null;
  private com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType ayudaGastosFunerales_PortType = null;
  
  public AyudaGastosFuneralesProxy() {
    _initAyudaGastosFuneralesProxy();
  }
  
  public AyudaGastosFuneralesProxy(String endpoint) {
    _endpoint = endpoint;
    _initAyudaGastosFuneralesProxy();
  }
  
  private void _initAyudaGastosFuneralesProxy() {
    try {
      ayudaGastosFunerales_PortType = (new com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_ServiceLocator()).getAyudaGastosFuneralesSOAP();
      if (ayudaGastosFunerales_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ayudaGastosFunerales_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ayudaGastosFunerales_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ayudaGastosFunerales_PortType != null)
      ((javax.xml.rpc.Stub)ayudaGastosFunerales_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.imss.sivimss.registroagf.soap.AyudaGastosFunerales_PortType getAyudaGastosFunerales_PortType() {
    if (ayudaGastosFunerales_PortType == null)
      _initAyudaGastosFuneralesProxy();
    return ayudaGastosFunerales_PortType;
  }
  
  public com.imss.sivimss.registroagf.soap.RespuestaAsegurado obtenerAGFAsegurado(com.imss.sivimss.registroagf.soap.AGF_Asegurado obtenerAGFAseguradoRequest) throws java.rmi.RemoteException{
    if (ayudaGastosFunerales_PortType == null)
      _initAyudaGastosFuneralesProxy();
    return ayudaGastosFunerales_PortType.obtenerAGFAsegurado(obtenerAGFAseguradoRequest);
  }
  
  public com.imss.sivimss.registroagf.soap.RespuestaPensionado obtenerAGFPensionado(com.imss.sivimss.registroagf.soap.AGF_Pensionado obtenerAGFPensionadoRequest) throws java.rmi.RemoteException{
    if (ayudaGastosFunerales_PortType == null)
      _initAyudaGastosFuneralesProxy();
    return ayudaGastosFunerales_PortType.obtenerAGFPensionado(obtenerAGFPensionadoRequest);
  }
  
  
}