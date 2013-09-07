/**
 * Creted by Umberto Palo
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import exception.WFSException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import request.GetCapabilitiesRequest;
import servlet.RequestResponse;

/**
 * In questa classe sono presenti tutti i metodi di supporto ed utilità
 *
 * @author Umberto
 */
public class Utility {

    /**
     * Questo metodo identifica il tipo di richiesta effettuata dal client in
     * base alla richiesta ricevuta in input il server provvederà a richiamare
     * la classe che soddisfi tale richiesta
     *
     * @param richiesta
     * @return
     */
    public void requestOperation(String richiesta, RequestResponse request) throws WFSException {

        String richiest;

       /* if (richiesta.startsWith("\"")) {
            richiest = richiesta.substring(1, richiesta.length() - 1);
            System.out.println("mi trovo nel metodoche richiama la classe GetCapabilitiesRequest il parametro richiesta è: " + richiest);
        } else {*/
            richiest = richiesta;
        //}
        System.out.println("la richiesta è: " + richiest);
        if (richiest.equalsIgnoreCase("GetCapabilities")) {
            GetCapabilitiesRequest capabilitiesRequest = new GetCapabilitiesRequest(request);
            System.out.println("Versione accettata= " + capabilitiesRequest.getVersion());
        }
        if(richiest.isEmpty()){
            System.out.println("La request è vuota");
            throw new WFSException(request, "Errore non sono stati definiti i parametri obbligatori", null, "MissingParameterValue");
        }

    }

    /**
     * Metodo che prende in input i parametri di una servlet Analizza la
     * richiesta ti tipo GET ricevuta nell URL ed effettua un controllo sul nome
     * dei paramtri di input in modo che siano case insensitive
     *
     * ES. il parametro "request" può essere scritto Request/ReQuEsT/ ecc....
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    public void parsingGetParam(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String richiesta = new String();
        String service = new String();
        String version = new String();

        /**
         * Prendiamo il nome dei parametri in modo che possano essere richiamati
         * in qualsiasi forma
         */
        Map params = request.getParameterMap();

        Iterator i = params.keySet().iterator();
        while (i.hasNext()) {
            String key = (String) i.next();
            String value = ((String[]) params.get(key))[0];
            if (key.equalsIgnoreCase("request")) {
                richiesta = value;
            }
            if (key.equalsIgnoreCase("service")) {
                service = value;
            }
            if (key.equalsIgnoreCase("version")) {
                version = value;
            }
            if (key.equalsIgnoreCase("section")) {
                continue;
            }
            if (key.equalsIgnoreCase("updatesequence")) {
                continue;
            }
            if (key.equalsIgnoreCase("acceptfotmats")) {
                continue;
            }
            if (key.equalsIgnoreCase("acceptlanguages")) {
                continue;
            }
        }

        /**
         * identifico la richiesta del client specificato nel parametro
         * "request"
         */
        RequestResponse reqResp = new RequestResponse(request, response);
        try {
            requestOperation(richiesta, reqResp);

            String risposta = cosavuole(richiesta +"&"+ service + "&" + version);
            //String risposta = cosavuole(params);
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
        } catch (WFSException e) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter wr = response.getWriter();
            wr.println("<!DOCTYPE html>");
            wr.println("<html>");
            wr.println("<head>");
            wr.println("<title>Servlet Servlet_wfs exception</title>");
            wr.println("</head>");
            wr.println("<body>");
            wr.println("<h1>Servlet Servlet_wfs at " + request.getContextPath() + "</h1>");
            wr.println("<h2>" + e.getMessage() + "</h2>");
            wr.println("</body>");
            wr.println("</html>");
        }



    }

    /**
     *
     * @param request
     * @param response
     */
    public void parsingPostParam(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String richiesta = new String();
        String service = new String();
        String version = new String();

        /**
         * Prendiamo il nome dei parametri in modo che possano essere richiamati
         * in qualsiasi forma
         */
        Map params = request.getParameterMap();

        Iterator i = params.keySet().iterator();
        while (i.hasNext()) {
            String key = (String) i.next();
            String value = ((String[]) params.get(key))[0];
            if (key.equalsIgnoreCase("request")) {
                richiesta = value;
                System.out.println("IL VALORE DELLA REQUEST è:"+richiesta);
            }
            if (key.equalsIgnoreCase("service")) {
                service = value;
            }
            if (key.equalsIgnoreCase("version")) {
                version = value;
            }
            if (key.equalsIgnoreCase("section")) {
                continue;
            }
            if (key.equalsIgnoreCase("updatesequence")) {
                continue;
            }
            if (key.equalsIgnoreCase("acceptfotmats")) {
                continue;
            }
            if (key.equalsIgnoreCase("acceptlanguages")) {
                continue;
            }
        }

        /**
         * identifico la richiesta del client specificato nel parametro
         * "request"
         * inizializzo la RequestResponse che mi permette di mantenere una connessione attiva
         */
        RequestResponse reqResp = new RequestResponse(request, response);

        try {
            System.out.println("entro nel metodo requestOperation per vedere di che operazione il client ha fatto richiesta");
            requestOperation(richiesta, reqResp);

           // String risposta = cosavuole(richiesta + service + version);
            String risposta = cosavuole(params);
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
        } catch (WFSException e) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter wr = response.getWriter();
            wr.println("<!DOCTYPE html>");
            wr.println("<html>");
            wr.println("<head>");
            wr.println("<title>Servlet Servlet_wfs exception</title>");
            wr.println("</head>");
            wr.println("<body>");
            wr.println("<h1>Servlet Servlet_wfs at " + request.getContextPath() + "</h1>");
            wr.println("<h2>" + e.getMessage() + "</h2>");
            wr.println("</body>");
            wr.println("</html>");
        }
    }

    /**
     * Metodo che prende in input i parametri di una servlet Analizza la
     * richiesta ti tipo GET ricevuta nell URL ed effettua un controllo sul nome
     * dei paramtri di input in modo che siano case insensitive
     *
     * ES. il parametro "request" può essere scritto Request/ReQuEsT/ ecc....
     *
     * @param request
     * @param response
     * @return
     *
     */
    private String cosavuole(String richiesta) throws IndexOutOfBoundsException {
        String risposta =null;
        System.out.println("La richiesta è: "+richiesta);
       //if(richiesta.startsWith("\"")){
        String[] valoriParametri = richiesta.split("&");
        for (String string : valoriParametri) {
            System.out.println("#################### " + string);
        }
        List<String> appoggio = new ArrayList<String>();
        for (int i = 0; i < valoriParametri.length; i++) {
            //if (i % 2 != 0) {
            
            if(valoriParametri[i].startsWith("\"") && valoriParametri[i].endsWith("\"")){
                valoriParametri[i]=valoriParametri[i].substring(1, valoriParametri[i].length()-1);
                appoggio.add(valoriParametri[i]);
            }else{
                appoggio.add(valoriParametri[i]);
            }
            //}
        }
        
        Iterator<String> it = appoggio.iterator();
        while (it.hasNext()) {
            String object = it.next();
            System.out.println("dsbsdfhehehsdfhf " + object);
        }
        

        boolean v;
        System.out.println("------------------------ " + richiesta);
        richiesta = appoggio.get(0);
        //richiesta = richiesta.substring(1, richiesta.length()-1);
        System.out.println("------------------------ " + richiesta);

        v = richiesta.trim().equalsIgnoreCase("GetCapabilities");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°° " + v);
        if (v) {
            risposta = "Vuole sapere il GetCapabilities";
            System.out.println("********************* " + richiesta);
        } else {
            risposta = "non so che vuole";
            System.out.println("********************* " + richiesta);
        }//}
       
        return risposta;
    }

    /**
     * Richiamato quando viene utilizzato il metodo POST della servlet
     * Questo metodo serve solo come prova di utilizzo
     * @param params include i paramatri specificati dal client
     * @return una stringa contenente il nome del service specificato
     */
    private String cosavuole(Map params) throws IndexOutOfBoundsException {
        String risposta;
        if(((String[])(params.get("request")))[0].equalsIgnoreCase("GetCapabilities")){
            risposta = "Vuole sapere il GetCapabilities";
            System.out.println("********************* " + ((String[])(params.get("request")))[0]);
        }else{
            risposta = "non so che vuole";
            System.out.println("********************* non so cosa vuole " + ((String[])(params.get("request")))[0]);
        }
        return risposta;
            }
}
