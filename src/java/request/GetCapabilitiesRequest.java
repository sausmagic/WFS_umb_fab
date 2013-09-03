/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import exception.WFSException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.opengis.wfs.v_1_1_0.*;
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
    
    
    /**
     * 
     * @param request permette di avere accesso ai dati della servlet
     * @throws WFSException eccezioe che viene lanciata in caso di parametri errati
     */
    public GetCapabilitiesRequest(RequestResponse request) throws WFSException{
        //inizializza i parametri della classe
        this.init();
        
        //estraggo i parametri della richiesta
        Map<String,String[]> parametriRichiesta = new HashMap<String, String[]>();
        parametriRichiesta = request.getRequest().getParameterMap();
        
        //analizzo i parametri
        if (parametriRichiesta.get("request")==null || parametriRichiesta.get("service")==null)
             throw new WFSException(request,"Errore non sono stati definiti uno o più dei parametri mandatory", null, "MissingParameterValue");
        
        this.setRequest(parametriRichiesta.get("request")[0]);
        this.setService(parametriRichiesta.get("service")[0]);
        
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
        
        /**
         * Controlliamo se è stato specificato il parametro Section e quali sezioni il client ha richiesto
         */
        if(parametriRichiesta.containsKey("section")){
            String[] sectionValue = parametriRichiesta.get("section");
            for (int i = 0; i < sectionValue.length; i++) {
                sections.add(sectionValue[i]);
            }      
        }else{
            ArrayList<String> sec = new ArrayList<String>();
            this.setSections(sec);
        }
        
        if(parametriRichiesta.containsKey("updateSequence")){
            this.setUpdateSequence(parametriRichiesta.get("updateSequence")[0]);
        }else{
            String us= new String();
            this.setUpdateSequence(us);
        }
        
        if(parametriRichiesta.containsKey("acceptFormats")){
            String[] acceptformat = parametriRichiesta.get("acceptFormats");
            for (int i = 0; i < acceptformat.length; i++) {
                acceptFormat.add(acceptformat[i]);          
            }
        }else{
            ArrayList<String> accFor = new ArrayList<String>();
            this.setAcceptFormat(accFor);
        }
        
        if(parametriRichiesta.containsKey("acceptLanguages")){
            String[] acceptleng = parametriRichiesta.get("acceptLanguages");
            for (int i = 0; i < acceptleng.length; i++) {
                acceptLenguage.add(acceptleng[i]);          
            }
        }else{
            ArrayList<String> acclang = new ArrayList<String>();
            this.setAcceptLenguage(acclang);
        }
        
       
        /**
         * una volta costruita la request il server analizza i dati e procederà a eseguire la response
         * al client
         */
        GetCapabilities getCapabilities = new GetCapabilities(this, request);
        
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

    private void init() {
        request = new String();
        service = new String();
        version = new String();
        updateSequence = new String();
        sections = new ArrayList<String>();
        acceptFormat = new ArrayList<String>();
        acceptLenguage = new ArrayList<String>();
                
    }
}
