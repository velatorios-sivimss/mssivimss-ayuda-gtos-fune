
package mx.gob.imss.ctirss.agf.service.certificacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AyudaGastosFunerales", targetNamespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AyudaGastosFunerales {


    /**
     * 
     * @param obtenerAGFAseguradoRequest
     * @return
     *     returns mx.gob.imss.ctirss.agf.service.certificacion.RespuestaAsegurado
     */
    @WebMethod(action = "http://certificacion.service.agf.ctirss.imss.gob.mx/AyudaGastosFunerales/obtenerAGFAsegurado")
    @WebResult(name = "obtenerAGFAseguradoResponse", targetNamespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", partName = "obtenerAGFAseguradoResponse")
    public RespuestaAsegurado obtenerAGFAsegurado(
        @WebParam(name = "obtenerAGFAseguradoRequest", targetNamespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", partName = "obtenerAGFAseguradoRequest")
        AGFAsegurado obtenerAGFAseguradoRequest);

    /**
     * 
     * @param obtenerAGFPensionadoRequest
     * @return
     *     returns mx.gob.imss.ctirss.agf.service.certificacion.RespuestaPensionado
     */
    @WebMethod(action = "http://certificacion.service.agf.ctirss.imss.gob.mx/AyudaGastosFunerales/obtenerAGFPensionado")
    @WebResult(name = "obtenerAGFPensionadoResponse", targetNamespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", partName = "obtenerAGFPensionadoResponse")
    public RespuestaPensionado obtenerAGFPensionado(
        @WebParam(name = "obtenerAGFPensionadoRequest", targetNamespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", partName = "obtenerAGFPensionadoRequest")
        AGFPensionado obtenerAGFPensionadoRequest);

}
