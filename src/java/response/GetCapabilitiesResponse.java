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
import java.io.PrintWriter;
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
import net.opengis.wfs.v_1_1_0.WFSCapabilitiesType;
import request.GetCapabilitiesRequest;
import servlet.RequestResponse;
import util.Utility;

/**
 *
 * @author Umberto
 */
public class GetCapabilitiesResponse {

    WFSCapabilitiesType getCapabilitieResp;
    GetCapabilitiesRequest request;
    RequestResponse servlet;
    Utility util;
    FileOutputStream a;
    
    public GetCapabilitiesResponse(GetCapabilitiesRequest request, RequestResponse servlet) {
        //inizializziamo gli oggetti della classe
        init(request,servlet);
        
        }
    
    public FileOutputStream getCapabilitiesResponseXML(){
        getCapabilitieResp.setVersion(request.getVersion());
        
        //Definiamo qui il ServiceIdentification
        ServiceIdentification serviceIdent = new ServiceIdentification();
        serviceIdent.setTitle("WFS SriLanka");
        serviceIdent.setAbstract("Questo Server WFS fornisce funzionalità sulle feature per il progetto Sri Lanka."
                + "Le feature afferte riguardano le fattorie, i mercati, le città ed altro. Contact Umberto");
        CodeType codetype1 = new CodeType();
        codetype1.setValue("WFS");
        serviceIdent.setServiceType(codetype1);
        List<String> typeListVers = new ArrayList<String>();
        typeListVers.add(request.getVersion());
        serviceIdent.setServiceTypeVersion(typeListVers);
        
        //creaimo il tag Keywords con i relativi figli
        List<KeywordsType> keyList = new ArrayList<KeywordsType>();
        KeywordsType k1 = new KeywordsType();
        List<String> keyvalue = new ArrayList<String>();
        keyvalue.add("Sri Lanka");
        keyvalue.add("Umberto");
        keyvalue.add("Fabio");
        CodeType codeType2 = new CodeType();
        codeType2.setValue("String");
        k1.setType(codeType2);
        k1.setKeyword(keyvalue);
        serviceIdent.setKeywords(keyList);
        
        serviceIdent.setFees("none");
        List<String> accessConstList = new ArrayList<String>();
        accessConstList.add("none");
        serviceIdent.setAccessConstraints(accessConstList);
        getCapabilitieResp.setServiceIdentification(serviceIdent);
        
        //fine definizione campi ServiceIdentification
        
        //INIZIO definizione campi SERVICE PROVIDER SECTION
        ServiceProvider ServiceProvider = new ServiceProvider();
        ServiceProvider.setProviderName("Umberto");
        OnlineResourceType onlineResurce = new OnlineResourceType();
        
        //nota il campo href è provvisorio andrà modificato
        onlineResurce.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs");
        
        ServiceProvider.setProviderSite(onlineResurce);
        ResponsiblePartySubsetType serviceContact = new ResponsiblePartySubsetType();
        serviceContact.setIndividualName("Umberto Palo");
        serviceContact.setPositionName("Student - Unisa university");
       
        
        
        //inizio - Settiamo info sul contatto
        ContactType contactType = new ContactType();
        
        TelephoneType phone = new TelephoneType();
        List<String> voices = new ArrayList<String>();
        voices.add("33895467709 - cellular Umberto ");
        phone.setVoice(voices);
        List<String> facSimile = new ArrayList<String>();
        facSimile.add("33895467709 - cellular Umberto");
        phone.setFacsimile(facSimile);
        contactType.setPhone(phone);
        
        //Settiamo l'indirizzo
        AddressType address = new AddressType();
        address.setAdministrativeArea("zona rurale");
        address.setCity("Salerno");
        address.setCountry("Italia");
        List<String> emails = new ArrayList<String>();
        emails.add("umbertopalo@hotmail.it");
        address.setElectronicMailAddress(emails);
        address.setPostalCode("84045");
        contactType.setAddress(address);
        OnlineResourceType onlineResourceType2 = new OnlineResourceType();
        //questo cMPO HREF è PROVVISORIO
        onlineResourceType2.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs");
        contactType.setOnlineResource(onlineResourceType2);
        contactType.setHoursOfService("24x7");
        contactType.setContactInstructions("contattare in caso di emergenza");
        serviceContact.setContactInfo(contactType);
        //fine info su contatto
        
        //settimo il Role
        CodeType codeType3 = new CodeType();
        codeType3.setValue("none");
        serviceContact.setRole(codeType3);
        ServiceProvider.setServiceContact(serviceContact);
        
        getCapabilitieResp.setServiceProvider(ServiceProvider);
        //FINE - SERVICE PROVIDER SECTION
        
        //INIZIO - OPERATION METADATA SECTION
        
        OperationsMetadata OM = new OperationsMetadata();
        List<Operation> operationList = new ArrayList<Operation>();
        Operation operation1 = new Operation();
        operation1.setName("GetCapabilities");
        operationList.add(operation1);
        List<DCP> dcpList = new ArrayList<DCP>();
        DCP dcp1 = new DCP();
        HTTP http1 = new HTTP();
        
        QName namespace1 = new QName("http://www.w3.org/1999/xlink","GET");
        
        RequestMethodType b = new RequestMethodType();
        b.setTitle("GET");
        b.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs?");
        JAXBElement<RequestMethodType> getOrPost = new JAXBElement<RequestMethodType>(namespace1,RequestMethodType.class,null,b);
        List<JAXBElement<RequestMethodType>> listGetOrSet = new ArrayList<JAXBElement<RequestMethodType>>();
        listGetOrSet.add(getOrPost);
        http1.setGetOrPost(listGetOrSet);
        dcp1.setHTTP(http1);
        //aggiungo i campi dcp alla listDCP
        dcpList.add(dcp1);
        operation1.setDCP(dcpList);
        List<DomainType> parameterList = new ArrayList<DomainType>();
        DomainType domainType1 = new DomainType();
        domainType1.setName("AcceptVersions");
        List<String> versionList = new ArrayList<String>();
        versionList.add("1.1.0");
        domainType1.setValue(versionList);
        DomainType domainType2 = new DomainType();
        domainType2.setName("AcceptFormats");
        List<String> acceptFormatList = new ArrayList<String>();
        acceptFormatList.add("text/xml");
        domainType2.setValue(acceptFormatList);
        parameterList.add(domainType1);
        parameterList.add(domainType2);
        DomainType domainType3 = new DomainType();
        domainType3.setName("Sections");
        List<String> sectionList = new ArrayList<String>();
        //per ora le mettiamo tutte poi vediamo quale fare oltre a quelle per un WFS BASIC
        sectionList.add("ServiceIdentification");
        sectionList.add("ServiceProvider");
        sectionList.add("OperationsMetadata");
        sectionList.add("FeatureTypeList");
        sectionList.add("ServesGMLObjectTypeList");
        sectionList.add("SupportsGMLObjectTypeList");
        sectionList.add("Filter_Capabilities");
        domainType3.setValue(sectionList);
        parameterList.add(domainType3);
        operation1.setParameter(parameterList);
        
        //operazione describe feature type
        Operation operation2 = new Operation();
        operation2.setName("DescribeFeatureType");
        operationList.add(operation2);
        List<DCP> dcpList2 = new ArrayList<DCP>();
        DCP dcp2 = new DCP();
        HTTP http2 = new HTTP();
        
        QName namespace2 = new QName("http://www.w3.org/1999/xlink","GET");
        
        RequestMethodType c = new RequestMethodType();
        c.setTitle("GET");
        c.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs?");
        JAXBElement<RequestMethodType> getOrPost2 = new JAXBElement<RequestMethodType>(namespace2,RequestMethodType.class,null,c);
        List<JAXBElement<RequestMethodType>> listGetOrSet2 = new ArrayList<JAXBElement<RequestMethodType>>();
        listGetOrSet2.add(getOrPost2);
        http2.setGetOrPost(listGetOrSet2);
        dcp2.setHTTP(http2);
        //aggiungo i campi dcp alla listDCP
        dcpList2.add(dcp2);
        operation2.setDCP(dcpList2);
        List<DomainType> parameterList2 = new ArrayList<DomainType>();
        DomainType domainType4 = new DomainType();
        domainType4.setName("outputFormat");
        List<String> outputList2 = new ArrayList<String>();
        outputList2.add("text/xml; subtype=gml/3.1.1");
        domainType4.setValue(outputList2);
        parameterList2.add(domainType4);
        operation2.setParameter(parameterList2);
        
        
        //operazione Get Feature
        Operation operation3 = new Operation();
        operation3.setName("GetFeature");
        operationList.add(operation3);
        List<DCP> dcpList3 = new ArrayList<DCP>();
        DCP dcp3 = new DCP();
        HTTP http3 = new HTTP();
        
        QName namespace3 = new QName("http://www.w3.org/1999/xlink","GET");
        
        RequestMethodType d = new RequestMethodType();
        d.setTitle("GET");
        d.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs?");
        JAXBElement<RequestMethodType> getOrPost3 = new JAXBElement<RequestMethodType>(namespace3,RequestMethodType.class,null,d);
        List<JAXBElement<RequestMethodType>> listGetOrSet3 = new ArrayList<JAXBElement<RequestMethodType>>();
        listGetOrSet3.add(getOrPost3);
        http3.setGetOrPost(listGetOrSet3);
        dcp3.setHTTP(http3);
        //aggiungo i campi dcp alla listDCP
        dcpList3.add(dcp3);
        operation3.setDCP(dcpList3);
        List<DomainType> parameterList3 = new ArrayList<DomainType>();
        DomainType domainType5 = new DomainType();
        domainType5.setName("resultType");
        DomainType domainType6 = new DomainType();
        domainType6.setName("outputFormat");
        List<String> outputList3 = new ArrayList<String>();
        outputList3.add("text/xml; subtype=gml/3.1.1");
        List<String> outputList4 = new ArrayList<String>();
        outputList4.add("results");
        outputList4.add("hits");
        domainType5.setValue(outputList3);
        domainType6.setValue(outputList4);
        parameterList2.add(domainType5);
        parameterList2.add(domainType6);
        operation3.setParameter(parameterList3);
        
        
        //setto le Operation
        OM.setOperation(operationList);
        
        
        getCapabilitieResp.setOperationsMetadata(OM);
        //FINE - OPERATION METADATA SECTION
        
        
        
        
          //Facciamo una prova
        try {
            a = util.createXML(getCapabilitieResp);
            File file = new File("GetCapabilitiesResponse.xml");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
                while(line!=null) {
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
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }

    private void init(GetCapabilitiesRequest request, RequestResponse servlet) {
        this.request = request;
        this.servlet = servlet;
        getCapabilitieResp = new WFSCapabilitiesType();
        util = new Utility();
        
    }
    
}
