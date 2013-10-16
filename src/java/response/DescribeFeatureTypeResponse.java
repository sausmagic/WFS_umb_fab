/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package response;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletOutputStream;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import net.opengis.ows.v_1_0_0.AddressType;
import net.opengis.ows.v_1_0_0.CodeType;
import net.opengis.ows.v_1_0_0.ContactType;
import net.opengis.ows.v_1_0_0.DCP;
import net.opengis.ows.v_1_0_0.DomainType;
import net.opengis.ows.v_1_0_0.HTTP;
import net.opengis.ows.v_1_0_0.KeywordsType;
import net.opengis.ows.v_1_0_0.OnlineResourceType;
import net.opengis.ows.v_1_0_0.Operation;
import net.opengis.ows.v_1_0_0.OperationsMetadata;
import net.opengis.ows.v_1_0_0.RequestMethodType;
import net.opengis.ows.v_1_0_0.ResponsiblePartySubsetType;
import net.opengis.ows.v_1_0_0.ServiceIdentification;
import net.opengis.ows.v_1_0_0.ServiceProvider;
import net.opengis.ows.v_1_0_0.TelephoneType;
import net.opengis.ows.v_1_0_0.WGS84BoundingBoxType;
import net.opengis.wfs.v_1_1_0.FeatureTypeListType;
import net.opengis.wfs.v_1_1_0.FeatureTypeType;
import net.opengis.wfs.v_1_1_0.GMLObjectTypeListType;
import net.opengis.wfs.v_1_1_0.GMLObjectTypeType;
import net.opengis.wfs.v_1_1_0.OutputFormatListType;
import net.opengis.wfs.v_1_1_0.DescribeFeatureTypeType;
import request.DescribeFeatureTypeRequest;
import servlet.RequestResponse;
import util.Utility;

/**
 *
 * @author Umberto
 */
public class DescribeFeatureTypeResponse {

    DescribeFeatureTypeType describeResp;
    DescribeFeatureTypeRequest request;
    RequestResponse servlet;
    Utility util;
    FileOutputStream a;

    public DescribeFeatureTypeResponse(DescribeFeatureTypeRequest request, RequestResponse servlet) {
        //inizializziamo gli oggetti della classe
        init(request, servlet);

    }

    /**
     * Metodo che restituisce ul file xml contenente la risposta ad una DescribeFeatureType
     * @return il file xml 
     */
    public FileOutputStream DescribeFeatureTypeResponseXML() {
        describeResp.setVersion(request.getVersion());
        
        
        //createServesGMLObjectTypeList();


        //Facciamo una prova
        try {
            a = util.createXML(describeResp);
            File file = new File("DescribeFeatureTypeResponse.xml");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            // BufferedReader reader2 = new BufferedReader(new FileReader(a.getFD()));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);

                //servlet.getResponse().setContentType("text/html;charset=UTF-8");
                servlet.getResponse().setContentType("text/xml;charset=UTF-8");
                //PrintWriter out = servlet.getResponse().getWriter();
                ServletOutputStream out = servlet.getResponse().getOutputStream();
                // servlet.getResponse().sendRedirect(file.getAbsolutePath());
                out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DescribeFeatureTypeResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(DescribeFeatureTypeResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DescribeFeatureTypeResponse.class.getName()).log(Level.SEVERE, null, ex);
        }

        return a;
    }

    private void init(DescribeFeatureTypeRequest request, RequestResponse servlet) {
        this.request = request;
        this.servlet = servlet;
        describeResp = new DescribeFeatureTypeType();
        util = new Utility();

    }

    /**
     * Crea la sezione Operation Metadata del file xml di risposta alla
     * DescribeFeatureTypeRequest
     */




    /**
     * nel pacchetto WFS 1.1.0 manca la classe ServesGMLObjectTypeList
     * vedi nota nel metodo createXML nella classe utility.java grazie 
     
    private void createServesGMLObjectTypeList() {
        GMLObjectTypeListType SGOTL = new GMLObjectTypeListType();
       List<GMLObjectTypeType> typelist = new ArrayList<GMLObjectTypeType>();
       GMLObjectTypeType type1 = new GMLObjectTypeType();
       typelist.add(type1);
        SGOTL.setGMLObjectType(typelist);
        describeResp.setServesGMLObjectTypeList(SGOTL);
    }*/
}
