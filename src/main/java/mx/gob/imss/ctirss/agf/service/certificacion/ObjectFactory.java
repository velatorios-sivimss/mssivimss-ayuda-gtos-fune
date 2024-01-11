
package mx.gob.imss.ctirss.agf.service.certificacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.imss.ctirss.agf.service.certificacion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerAGFAseguradoRequest_QNAME = new QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFAseguradoRequest");
    private final static QName _ObtenerAGFAseguradoResponse_QNAME = new QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFAseguradoResponse");
    private final static QName _ObtenerAGFPensionadoRequest_QNAME = new QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFPensionadoRequest");
    private final static QName _ObtenerAGFPensionadoResponse_QNAME = new QName("http://certificacion.service.agf.ctirss.imss.gob.mx/", "obtenerAGFPensionadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.imss.ctirss.agf.service.certificacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AGFAsegurado }
     * 
     */
    public AGFAsegurado createAGFAsegurado() {
        return new AGFAsegurado();
    }

    /**
     * Create an instance of {@link RespuestaAsegurado }
     * 
     */
    public RespuestaAsegurado createRespuestaAsegurado() {
        return new RespuestaAsegurado();
    }

    /**
     * Create an instance of {@link AGFPensionado }
     * 
     */
    public AGFPensionado createAGFPensionado() {
        return new AGFPensionado();
    }

    /**
     * Create an instance of {@link RespuestaPensionado }
     * 
     */
    public RespuestaPensionado createRespuestaPensionado() {
        return new RespuestaPensionado();
    }

    /**
     * Create an instance of {@link AGFAseguradoFinado }
     * 
     */
    public AGFAseguradoFinado createAGFAseguradoFinado() {
        return new AGFAseguradoFinado();
    }

    /**
     * Create an instance of {@link AGFInteresado }
     * 
     */
    public AGFInteresado createAGFInteresado() {
        return new AGFInteresado();
    }

    /**
     * Create an instance of {@link AGFDocumentacionProbatoria }
     * 
     */
    public AGFDocumentacionProbatoria createAGFDocumentacionProbatoria() {
        return new AGFDocumentacionProbatoria();
    }

    /**
     * Create an instance of {@link ResolucionAGFAsegurado }
     * 
     */
    public ResolucionAGFAsegurado createResolucionAGFAsegurado() {
        return new ResolucionAGFAsegurado();
    }

    /**
     * Create an instance of {@link CertificacionAGFAsegurado }
     * 
     */
    public CertificacionAGFAsegurado createCertificacionAGFAsegurado() {
        return new CertificacionAGFAsegurado();
    }

    /**
     * Create an instance of {@link AGFRespuestaAseguradoFinado }
     * 
     */
    public AGFRespuestaAseguradoFinado createAGFRespuestaAseguradoFinado() {
        return new AGFRespuestaAseguradoFinado();
    }

    /**
     * Create an instance of {@link AGFRespuestaAseguradoVelatorio }
     * 
     */
    public AGFRespuestaAseguradoVelatorio createAGFRespuestaAseguradoVelatorio() {
        return new AGFRespuestaAseguradoVelatorio();
    }

    /**
     * Create an instance of {@link AGFPensionadoFinado }
     * 
     */
    public AGFPensionadoFinado createAGFPensionadoFinado() {
        return new AGFPensionadoFinado();
    }

    /**
     * Create an instance of {@link ResolucionAGFPensionado }
     * 
     */
    public ResolucionAGFPensionado createResolucionAGFPensionado() {
        return new ResolucionAGFPensionado();
    }

    /**
     * Create an instance of {@link CertificacionAGFPensionado }
     * 
     */
    public CertificacionAGFPensionado createCertificacionAGFPensionado() {
        return new CertificacionAGFPensionado();
    }

    /**
     * Create an instance of {@link AGFRespuestaPensionadoVelatorio }
     * 
     */
    public AGFRespuestaPensionadoVelatorio createAGFRespuestaPensionadoVelatorio() {
        return new AGFRespuestaPensionadoVelatorio();
    }

    /**
     * Create an instance of {@link AGFRespuestaPensionadoFinado }
     * 
     */
    public AGFRespuestaPensionadoFinado createAGFRespuestaPensionadoFinado() {
        return new AGFRespuestaPensionadoFinado();
    }

    /**
     * Create an instance of {@link AGFRespuestaPensionadoBeneficiarios }
     * 
     */
    public AGFRespuestaPensionadoBeneficiarios createAGFRespuestaPensionadoBeneficiarios() {
        return new AGFRespuestaPensionadoBeneficiarios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGFAsegurado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AGFAsegurado }{@code >}
     */
    @XmlElementDecl(namespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", name = "obtenerAGFAseguradoRequest")
    public JAXBElement<AGFAsegurado> createObtenerAGFAseguradoRequest(AGFAsegurado value) {
        return new JAXBElement<AGFAsegurado>(_ObtenerAGFAseguradoRequest_QNAME, AGFAsegurado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaAsegurado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaAsegurado }{@code >}
     */
    @XmlElementDecl(namespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", name = "obtenerAGFAseguradoResponse")
    public JAXBElement<RespuestaAsegurado> createObtenerAGFAseguradoResponse(RespuestaAsegurado value) {
        return new JAXBElement<RespuestaAsegurado>(_ObtenerAGFAseguradoResponse_QNAME, RespuestaAsegurado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AGFPensionado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AGFPensionado }{@code >}
     */
    @XmlElementDecl(namespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", name = "obtenerAGFPensionadoRequest")
    public JAXBElement<AGFPensionado> createObtenerAGFPensionadoRequest(AGFPensionado value) {
        return new JAXBElement<AGFPensionado>(_ObtenerAGFPensionadoRequest_QNAME, AGFPensionado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaPensionado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaPensionado }{@code >}
     */
    @XmlElementDecl(namespace = "http://certificacion.service.agf.ctirss.imss.gob.mx/", name = "obtenerAGFPensionadoResponse")
    public JAXBElement<RespuestaPensionado> createObtenerAGFPensionadoResponse(RespuestaPensionado value) {
        return new JAXBElement<RespuestaPensionado>(_ObtenerAGFPensionadoResponse_QNAME, RespuestaPensionado.class, null, value);
    }

}
