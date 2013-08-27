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
               
         
        //sostituire il tutto com MAP<K,V> 
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
    
    
    
}
