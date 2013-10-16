/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import exception.WFSException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.opengis.ows.v_1_0_0.ExceptionReport;
import net.opengis.ows.v_1_0_0.ExceptionType;
import net.opengis.ows.v_1_0_0.ObjectFactory;
import response.DescribeFeatureTypeResponse;
import response.GetCapabilitiesResponse;

import servlet.RequestResponse;
import wfs.GetCapabilities;
import wfs.NegotiateVersion;

/**
 * La classe crea una GetCabilitiesRequest
 * Memorizza e analizza i dati ricevuti come richiesta dal client
 * @author Umberto
 */
public class DescribeFeatureTypeRequest {
    
    private String request,service,version, typeName, exceptions, outputFormat;
    
    FileOutputStream xmlResponseDescribeFeatureTypeRequest;
    
    /**
     * 
     * @param request permette di avere accesso ai dati della servlet
     * @throws WFSException eccezioe che viene lanciata in caso di parametri errati
     */
    public DescribeFeatureTypeRequest(RequestResponse request) throws WFSException{
        //inizializza i parametri della classe
        this.init();
        
        //estraggo i parametri della richiesta
        Map<String,String[]> parametriRichiesta;
        parametriRichiesta = request.getRequest().getParameterMap();
        
        //analizzo i parametri
        Iterator<String> j = parametriRichiesta.keySet().iterator();
        while (j.hasNext()) {
            String key = j.next();
            
            String value = parametriRichiesta.get(key)[0];
            if (key.equalsIgnoreCase("request")) {
                this.request = value;
            }
            
            if (key.equalsIgnoreCase("service")) {
                service = value;
            }
            if (key.equalsIgnoreCase("version")) {
                version = value;
            }
            if (key.equalsIgnoreCase("typename")) {
                typeName = value;
            }
            if (key.equalsIgnoreCase("exceptions")) {
                continue;
            }
            if (key.equalsIgnoreCase("outputformat")) {
                continue;
            }
            
        }
        System.out.println("I parametri di richiesta contiene qualcosa: "+parametriRichiesta.isEmpty());
        
        if(this.request.isEmpty() || service.isEmpty())
            throw new WFSException(request,"Errore non sono stati definiti uno o più dei parametri mandatory", null, "MissingParameterValue");
        //if (parametriRichiesta.get("REQUEST")== null || parametriRichiesta.get("SERVICE")== null)
          //   throw new WFSException(request,"Errore non sono stati definiti uno o più dei parametri mandatory", null, "MissingParameterValue");
        //ObjectFactory exception = new ObjectFactory();
        //ExceptionReport exRep = exception.createExceptionReport();
        //ExceptionType exType = exception.createExceptionType();
        this.setRequest(this.request);
        this.setService(service);
        System.out.println("il parametro request è: "+this.getRequest());
        System.out.println("il parametro service è: "+this.getService());
        //this.setRequest(parametriRichiesta.get("REQUEST")[0]);
        //this.setService(parametriRichiesta.get("SERVICE")[0]);
        
        version = version.trim();
        System.out.println("La lunghezza di version è: "+version.length());
        if(!version.isEmpty()){
            this.setVersion(version);
            boolean acceptedVer = NegotiateVersion.acceptedVersion(this.getVersion());
            System.out.println("La versione "+this.getVersion()+" è accettata dal server?: "+acceptedVer);
            if(!acceptedVer)
                throw new WFSException(request,"Errore versione non supportata dal server", null, "UnsupportedVersionFromServer");
        }else{
            this.setVersion(NegotiateVersion.getVersion11());
            System.out.println("Ho settato la versione (più alta) supportata dal server in quanto non specificata dal client. Versione supportata più alta " + NegotiateVersion.getVersion11());
        }
        
       /** if(parametriRichiesta.containsKey("VERSION")){
            this.setVersion(parametriRichiesta.get("VERSION")[0]);
            boolean acceptedVer = NegotiateVersion.acceptedVersion(this.getVersion());
            System.out.println("La versione "+this.getVersion()+" è accettata dal server?: "+acceptedVer);
            if(!acceptedVer)
                throw new WFSException(request,"Errore versione non supportata dal server", null, "UnsupportedVersionFromServer");
        }else{
            this.setVersion(NegotiateVersion.getVersion11());
            System.out.println("Ho settato la versione (più alta) supportata dal server in quanto non specificata dal client. Versione supportata più alta " + NegotiateVersion.getVersion20());
        }
        **/
        
        
        
        
        
        
       
        /**
         * una volta costruita la request il server analizza i dati della richiesta, procederà a eseguire la response
         * al client richiamando la classe GetCapabilitiesrResponse che procederà a creare i dati per la risposta.
         */
        DescribeFeatureTypeResponse describe = new DescribeFeatureTypeResponse(this, request);
        xmlResponseDescribeFeatureTypeRequest = describe.DescribeFeatureTypeResponseXML();
        
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
    public DescribeFeatureTypeRequest(String request, String service, String version) {
        this.request = request;
        this.service = service;
        this.version = version;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String tn) {
        this.typeName = tn;
    }
    public String getExceptions(){
        return exceptions;
    }
    
     public String getOutputFormat(){
        return outputFormat;
    }
    
    public String setExceptions(String ex){
        return this.exceptions=ex;
    }
    
     public String setOutputFormat(String of){
        return this.outputFormat=of;
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
        typeName = new String();
        exceptions = new String();
        outputFormat = new String();
        
                
    }
    
    /**
     * Questo metodo viene richiamato una volta che la richiesta del client è stata analizzata.
     * Una volta analizzata la request, verrà richiamata la classe che procederà a creare la risposta in formato xml
     * @return xmlResponseGetCapabilitiesRequest stream di dati in formato xml salvato in un file locale.
     */
    public FileOutputStream getResponseGetCapabilitiesRequest(){
        return xmlResponseDescribeFeatureTypeRequest;
    }
}
