/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import util.Utility;

/**
 *
 * @author Umberto
 */
public class Servlet_wfs extends HttpServlet {

    private Utility utility;
    private List<String> parametri;
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
            throws ServletException, IOException, JAXBException {
        
        /**
         * nell'eventualità volessimo controllare che siamo nel metodo GET o POST
         */
        String requestMethod = request.getMethod();
        System.out.println("METODO: "+requestMethod);
        boolean doGet = (requestMethod.equalsIgnoreCase("post"));
        
        /**
        try {
            prova c = new prova();
        } catch (JAXBException ex) {
            Logger.getLogger(Servlet_wfs.class.getName()).log(Level.SEVERE, null, ex);
        }
        **/
       
        System.out.println("DOGET: "+doGet);
        
        utility = new Utility();
               
        if(!doGet){
            utility.parsingGetParam(request, response);     
        }
        else{
            utility.parsingPostParam(request, response);
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
        try {
            processRequest(request, response);
        } catch (JAXBException ex) {
            Logger.getLogger(Servlet_wfs.class.getName()).log(Level.SEVERE, null, ex);
        }
                
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
        try {
            processRequest(request, response);
        } catch (JAXBException ex) {
            Logger.getLogger(Servlet_wfs.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    
}
