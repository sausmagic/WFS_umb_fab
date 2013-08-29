/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import exception.WFSException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import servlet.RequestResponse;
import wfs.GetCapabilities;
import wfs.NegotiateVersion;

/**
 *La classe crea una GetCabilitiesRequest
 * Memorizza e analizza i dati ricevuti come richiesta dal client
 * @author Umberto
 */
public class GetCapabilitiesRequest {
    
    private String request,service,version, updateSequence;
    private List<String> sections, acceptFormat,acceptLenguage;
    
    
    public GetCapabilitiesRequest(RequestResponse request) throws WFSException{
        Map<String,String[]> parametriRichiesta = new HashMap<String, String[]>();
        parametriRichiesta = request.getRequest().getParameterMap();
         //if (parametriRichiesta.get("request")==null || parametriRichiesta.get("service")==null || parametriRichiesta.get("version")==null)
         if (parametriRichiesta.get("request")==null || parametriRichiesta.get("service")==null)
             throw new WFSException(request,"Errore non sono stati definiti uno o più dei parametri mandatory", null, "MissingParameterValue");
        this.setRequest(parametriRichiesta.get("request")[0]);
        this.setService(parametriRichiesta.get("service")[0]);
        
        //this.setUpdateSequence(parametriRichiesta.get("updateSequence")[0]);
        //sections = new ArrayList<String>();
        if(parametriRichiesta.containsKey("version")){
            this.setVersion(parametriRichiesta.get("version")[0]);
            boolean acceptedVer = NegotiateVersion.acceptedVersion(this.getVersion());
            System.out.println("La versione "+this.getVersion()+" è accettata dal server?: "+acceptedVer);
            if(!acceptedVer)
            throw new WFSException(request,"Errore versione non supportata dal server", null, "UnsupportedVersionFromServer");
        }else{
            this.setVersion(NegotiateVersion.getSupportedVersion());
            System.out.println("Ho settato la versione supportata dal server in quanto non specificata dal client. Versione supportata " + NegotiateVersion.getSupportedVersion());
        }
        
        if(parametriRichiesta.containsKey("section")){
            String[] sectionValue = parametriRichiesta.get("section");
            for (int i = 0; i < sectionValue.length; i++) {
                sections.add(sectionValue[i]);
      
            }      
        }else{
            this.setSections(new ArrayList<String>());
        }
       
        
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

    public String getUpdateSequence() {
        return updateSequence;
    }

    public void setUpdateSequence(String updateSequence) {
        this.updateSequence = updateSequence;
    }

    public List<String> getSections() {
        return sections;
    }

    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    public List<String> getAcceptFormat() {
        return acceptFormat;
    }

    public void setAcceptFormat(List<String> acceptFormat) {
        this.acceptFormat = acceptFormat;
    }

    public List<String> getAcceptLenguage() {
        return acceptLenguage;
    }

    public void setAcceptLenguage(List<String> acceptLenguage) {
        this.acceptLenguage = acceptLenguage;
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