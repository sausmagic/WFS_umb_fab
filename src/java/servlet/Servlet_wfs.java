/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Umberto
 */
public class Servlet_wfs extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

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
