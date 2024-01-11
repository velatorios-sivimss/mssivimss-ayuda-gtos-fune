package mx.gob.imss.ctirss.agf.service.certificacion.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class holaSoap {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.cdyne.ws.weatherws");
        return marshaller;
    }

    @Bean
    public SOAPConnectClient soapconnector(Jaxb2Marshaller marshaller) {
        SOAPConnectClient client = new SOAPConnectClient();
        client.setDefaultUri("url");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
