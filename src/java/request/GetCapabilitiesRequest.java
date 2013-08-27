/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *La classe crea una GetCabilitiesRequest
 * @author Umberto
 */
public class GetCapabilitiesRequest {
    
    private String request,service,version;

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
    
    public void GetCapabilitiesRequest(){
    }
}
