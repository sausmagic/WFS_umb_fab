/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wfs;

import exception.ExceptionClass;
import exception.WFSException;
import net.opengis.ows.v_1_0_0.ServiceIdentification;
import net.opengis.wfs.v_1_1_0.WFSCapabilitiesType;
import request.GetCapabilitiesRequest;
import servlet.RequestResponse;

/**
 *Questa classe procede a processare la richiesta ricevuta (da parte del client).
 * Recuperate tutte le informazioni si procede a creare la risposta in formato XML/GML da inviare al client
 * 
 * @author Umberto
 */
public class GetCapabilities {

  /**
   * Nel costruttore andremo a creare l'oggetto di risposta alla richiesta
   * 
   * @param request istanza dell'oggetto GetCapabilitiesRequest che mantiene i dati delle informazioni richieste dal cleint
   * @param reqRes mantiene l'istanza di request/response della servlet
   */
    public GetCapabilities(GetCapabilitiesRequest request, RequestResponse reqRes) {
      
        WFSCapabilitiesType wfscapabilities = new WFSCapabilitiesType();
        wfscapabilities.setVersion(request.getVersion());
        
        //Definiamo qui il ServiceIdentification
        ServiceIdentification serviceIdent = new ServiceIdentification();
        serviceIdent.setTitle("WFS SriLanka");
        
    }
    
    
    
}
