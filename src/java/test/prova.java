/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import net.opengis.ows.getCapabilities.AcceptFormatsType;
import net.opengis.wfs.v_1_1_0.WFSCapabilitiesType;




/**
 *
 * @author Umberto
 */
public class prova {

    public prova() throws JAXBException {
        
        
        JAXBContext context = JAXBContext.newInstance("net.opengis.wfs.v_1_1_0");
        //Use the created JAXB context to construct an unmarshaller
            Unmarshaller unmarshaller = context.createUnmarshaller();
            // GetCapabilities URL of the Demis WorldMap WMS Server
        String url = "http://localhost:8080/WFS_umb_fab/Servlet_wfs?request=\"GetCapabilities\"&service=\"wfs\"&version=\"1.1.0\"";
        // Unmarshal the given URL, retrieve WMSCapabilities element
        JAXBElement<WFSCapabilitiesType> wfsCapabilitiesElement = unmarshaller
		.unmarshal(new StreamSource(url), WFSCapabilitiesType.class);
        WFSCapabilitiesType wfsCapabilities = wfsCapabilitiesElement.getValue();
          
        System.out.println("òòòòòòòòòòòòòòòòòòòòòòò"+wfsCapabilities.getVersion());
        
        JAXBElement<net.opengis.wfs.v_1_1_0.GetCapabilitiesType> wfsCapabilitiesElement2 = unmarshaller
		.unmarshal(new StreamSource(url), net.opengis.wfs.v_1_1_0.GetCapabilitiesType.class);
        
        net.opengis.wfs.v_1_1_0.GetCapabilitiesType wfsCapabilities2 = wfsCapabilitiesElement2.getValue();
        
        net.opengis.ows.v_1_0_0.AcceptFormatsType accFormat =  wfsCapabilities2.getAcceptFormats();
        
        String a = accFormat.getOutputFormat().toString();
        System.out.println("Formati accettati: "+a);
        
        String b = wfsCapabilities2.getAcceptVersions().toString();
        
        System.out.println("Versioni accettate: "+b);
        
    }


    
   
}
