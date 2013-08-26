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
import java.util.Enumeration;
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
    public List<String> parsingGetParam(HttpServletRequest request, HttpServletResponse response) throws IOException{
       List<String> returnParametri = new ArrayList<String>();
       
        String richiesta = new String(); //= request.getParameter("request");
        String service = new String();; // = request.getParameter("service");
        
        Map params = request.getParameterMap();
        
        Iterator i = params.keySet().iterator();
        while (i.hasNext()) {
            String key = (String)i.next();
            String value = ((String[])params.get(key))[0];
            if(key.equalsIgnoreCase("request"))
                richiesta = value;
            if (key.equalsIgnoreCase("service"))
                service = value;
        }
               
        String URI = request.getPathInfo();
        String uri2 = request.getRequestURI();
        String uri3= new String();
        StringBuffer URL = request.getRequestURL();
         Enumeration<String> parametri = request.getParameterNames();
         while (parametri.hasMoreElements()) {
          uri3 = uri3 + parametri.nextElement();
        }
        String risposta = cosavuole(richiesta);
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
        returnParametri.add(richiesta);
        returnParametri.add(risposta);
        return returnParametri;
        
        
    }
    
    private String cosavuole(String richiesta) {
        String risposta;
        boolean v;
        System.out.println("------------------------ "+ richiesta);
        richiesta = richiesta.substring(1, richiesta.length()-1);
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
