/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package response;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import net.opengis.ows.v_1_0_0.AddressType;
import net.opengis.ows.v_1_0_0.CodeType;
import net.opengis.ows.v_1_0_0.ContactType;
import net.opengis.ows.v_1_0_0.KeywordsType;
import net.opengis.ows.v_1_0_0.OnlineResourceType;
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
    
    public GetCapabilitiesResponse(GetCapabilitiesRequest request, RequestResponse servlet) {
        //inizializziamo gli oggetti della classe
        init(request,servlet);
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
        
        
        
        
          //Facciamo una prova
        try {
          FileOutputStream a;
            a = util.createXML(getCapabilitieResp);
            System.out.println(a.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        }

    private void init(GetCapabilitiesRequest request, RequestResponse servlet) {
        this.request = request;
        this.servlet = servlet;
        getCapabilitieResp = new WFSCapabilitiesType();
        util = new Utility();
    }
    
}
