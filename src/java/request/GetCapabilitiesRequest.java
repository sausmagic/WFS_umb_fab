/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import exception.WFSException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import wfs.GetCapabilities;
import wfs.NegotiateVersion;

/**
 *La classe crea una GetCabilitiesRequest
 * @author Umberto
 */
public class GetCapabilitiesRequest {
    
    private String request,service,version;

    
    public GetCapabilitiesRequest(HttpServletRequest request) throws WFSException{
        Map<String,String[]> parametriRichiesta = new HashMap<String, String[]>();
        parametriRichiesta = request.getParameterMap();
         if (parametriRichiesta.get("request")==null || parametriRichiesta.get("service")==null || parametriRichiesta.get("version")==null)
            throw new WFSException(request,"Errore non sono stati definiti uno o più dei parametri mandatory", null, "MissingParameterValue");
        this.setRequest(parametriRichiesta.get("request")[0]);
        this.setService(parametriRichiesta.get("service")[0]);
        this.setVersion(parametriRichiesta.get("version")[0]);
        boolean acceptedVer = NegotiateVersion.acceptedVersion(this.getVersion());
        System.out.println("La versione+ "+this.getVersion()+" è accettata dal server?: "+acceptedVer);
        if(!acceptedVer)
            throw new WFSException(request,"Errore versione non supportata dal server", null, "UnsupportedVersionFromServer");
        GetCapabilities getCapabilities = new GetCapabilities(this);
        
    }
    /**
     * Creiamo un bean della richiesta che riceviamo 
     * Nel costruttore abbiamo solo i parametri identificati dalla specifica OGC come "mandatory"
     * @param request
     * es. request=GetCapabilities
     * @param service
     * es. service= wsf
     * @param version 
     * es. versione=1.1.0
     */
    public GetCapabilitiesRequest(String request, String service, String version) {
        this.request = request;
        this.service = service;
        this.version = version;
    }
    
    

    public void setRequest(String request) {
        this.request = request;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequest() {
        return request;
    }

    public String getService() {
        return service;
    }

    public String getVersion() {
        return version;
    }
}
