/**
 * Creted by Umberto Palo
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import request.GetCapabilitiesRequest;
import servlet.RequestResponse;

/**
 *In questa classe sono presenti tutti i metodi di supporto ed utilità
 * @author Umberto
 */
public class Utility {
    
    
    /**
     * Metodo che prende in input i parametri di una servlet 
     * Analizza la richiesta ti tipo GET ricevuta nell URL ed effettua un controllo sul nome dei paramtri 
     * di input in modo che siano case insensitive
     * 
     * ES. il parametro "request" può essere scritto Request/ReQuEsT/ ecc....
     * @param request
     * @param response
     * @return
     * @throws IOException 
     */
    public void parsingGetParam(HttpServletRequest request, HttpServletResponse response) throws IOException{
      
        String richiesta = new String(); //= request.getParameter("request");
        String service = new String(); // = request.getParameter("service");
        String version = new String();
        
        /**
         * Prendiamo il nome dei parametri in modo che possano essere richiamati in qualsiasi forma
         */
        Map params = request.getParameterMap();
        
        Iterator i = params.keySet().iterator();
        while (i.hasNext()) {
            String key = (String)i.next();
            String value = ((String[])params.get(key))[0];
            if(key.equalsIgnoreCase("request"))
                richiesta = value;
            if (key.equalsIgnoreCase("service"))
                service = value;
            if(key.equalsIgnoreCase("version"))
                version = value;
            if(key.equalsIgnoreCase("section"))
                continue;
            if(key.equalsIgnoreCase("updatesequence"))
                continue;
            if(key.equalsIgnoreCase("acceptfotmats"))
                continue;
            if(key.equalsIgnoreCase("acceptlanguages"))
                continue;
        }
        
        /**
         * identifico la richiesta del client specificato nel parametro "request"
         */
        RequestResponse reqResp = new RequestResponse(request, response);
        requestOperation(richiesta, reqResp);
        
        String risposta = cosavuole(richiesta+service+version);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_wfs</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_wfs at " + request.getContextPath() + "</h1>");
            out.println("<h2>" + risposta + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
       
        
        
    }
    
    private String cosavuole(String richiesta) {
       String risposta;
       String[] valoriParametri = richiesta.split("\"");
        for (String string : valoriParametri) {
            System.out.println("#################### "+ string);
        }
        List<String> appoggio = new ArrayList<String>();
        for (int i = 0; i < valoriParametri.length; i++) {
            if(i%2 != 0)
                appoggio.add(valoriParametri[i]);         
        }
        Iterator<String> it = appoggio.iterator();
        while (it.hasNext()) {
            String object = it.next();
            System.out.println("dsbsdfhehehsdfhf "+ object);
        }
                
        boolean v;
        System.out.println("------------------------ "+ richiesta);
        richiesta = appoggio.get(0);
        //richiesta = richiesta.substring(1, richiesta.length()-1);
        System.out.println("------------------------ "+ richiesta);

        v = richiesta.trim().equalsIgnoreCase("GetCapabilities");
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°° "+ v);
        if(v){
            risposta = "Vuole sapere il GetCapabilities";
            System.out.println("********************* "+ richiesta);
        }
        else{
            risposta = "non so che vuole";
            System.out.println("********************* "+ richiesta);
        }
        return risposta;
    }
    
    /**
     * Questo metodo identifica il tipo di richiesta effettuata dal client 
     * in base alla richiesta ricevuta in input il server provvederà a richiamare
     * la classe che soddisfi tale richiesta
     * @param richiesta
     * @return 
     */
    public void requestOperation (String richiesta, RequestResponse request){
        
        String richiest = richiesta.substring(1, richiesta.length()-1);
        System.out.println("mi trovo nel metodoche richiama la classe GetCapabilitiesRequest il parametro richiesta è: "+richiest);
        if(richiest.equalsIgnoreCase("GetCapabilities"))
            new GetCapabilitiesRequest(request);
        
    }

    public void parsingPostParam(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Metodo che prende in input i parametri di una servlet 
     * Analizza la richiesta ti tipo GET ricevuta nell URL ed effettua un controllo sul nome dei paramtri 
     * di input in modo che siano case insensitive
     * 
     * ES. il parametro "request" può essere scritto Request/ReQuEsT/ ecc....
     * @param request
     * @param response
     * @return
     * @throws IOException 
     
    public Map<String, String[]> parsingGetParam(HttpServletRequest request, HttpServletResponse response) throws IOException{
      
        Map<String, String[]> parametriRichiesta = new HashMap<String, String[]>();
        String richiesta = new String(); //= request.getParameter("request");
        String service = new String(); // = request.getParameter("service");
        String version = new String();
        
        Map params = request.getParameterMap();
        
        Iterator i = params.keySet().iterator();
        while (i.hasNext()) {
            String key = (String)i.next();
            String value = ((String[])params.get(key))[0];
            if(key.equalsIgnoreCase("request"))
                richiesta = value;
            if (key.equalsIgnoreCase("service"))
                service = value;
            if(key.equalsIgnoreCase("version"))
                version = value;      
        }
        
        /**
         * identifico la richiesta del client specificato nel parametro "request"
         
        requestOperation(richiesta, request);
        
        String risposta = cosavuole(richiesta+service+version);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_wfs</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_wfs at " + request.getContextPath() + "</h1>");
            out.println("<h2>" + risposta + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
       
        
        return parametriRichiesta;
    }
    
    **/
    
}
