/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Iterator;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import net.opengis.ows.v_1_0_0.Operation;
import net.opengis.wfs.v_1_1_0.GetCapabilitiesType;
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
        //String url = "http://localhost:8081/WFS_umb_fab/Servlet_wfs?request=\"GetCapabilities\"&service=\"wfs\"&version=\"1.1.0\"";
        String url = "http://schemas.opengis.net/wfs/1.1.0/examples/WFS_Capabilities_Sample.xml";
        // Unmarshal the given URL, retrieve WMSCapabilities element
        JAXBElement<WFSCapabilitiesType> wfsCapabilitiesElement = unmarshaller
		.unmarshal(new StreamSource(url), WFSCapabilitiesType.class);
        WFSCapabilitiesType wfsCapabilities = wfsCapabilitiesElement.getValue();
        
          
        System.out.println("òòòòòòòòòòòòòòòòòòòòòòò"+wfsCapabilities.getVersion());
        
        //JAXBElement<net.opengis.wfs.v_1_1_0.GetCapabilitiesType> wfsCapabilitiesElement2 = unmarshaller
	//	.unmarshal(new StreamSource(url), net.opengis.wfs.v_1_1_0.GetCapabilitiesType.class);
        
        //net.opengis.wfs.v_1_1_0.GetCapabilitiesType wfsCapabilities2 = wfsCapabilitiesElement2.getValue();
        List a = wfsCapabilities.getOperationsMetadata().getOperation();
        Iterator b = a.iterator();
        while(b.hasNext()){
            Operation c = (Operation)b.next();
            System.out.println("------------------>>>>>"+c.getName());
        }
         
        
        
    }
    
    public void prova2() throws JAXBException{
        JAXBContext context2 = JAXBContext.newInstance("net.opengis.wfs.v_1_1_0");
        GetCapabilitiesType getCap = new GetCapabilitiesType();
        
        
    }


    
   
}
