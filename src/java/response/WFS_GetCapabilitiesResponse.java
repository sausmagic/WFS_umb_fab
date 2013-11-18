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
import net.opengis.wfs.v_1_1_0.ObjectFactory;
import net.opengis.wfs.v_1_1_0.OutputFormatListType;
import net.opengis.wfs.v_1_1_0.WFSCapabilitiesType;
import request.GetCapabilitiesRequest;
import servlet.RequestResponse;
import util.Utility;

/**
 * Questa classe è quella ufficiale e richiamata dalla request
 * Il codice potrebbe essere ottimizzato fornendo una classe di supporto
 * per una automazione nella creazione dei diversi oggetti che sono ripetitivi.
 * Non è stata fattà perchè purtroppo sono da solo e ho dovuto vedere anche altre
 * cose.
 * @author Umberto
 */
public class WFS_GetCapabilitiesResponse {
    
    ObjectFactory factoryWFS;
    WFSCapabilitiesType getCapabilitieResp;
    GetCapabilitiesRequest request;
    RequestResponse servlet;
    Utility util;
    FileOutputStream a;

    public WFS_GetCapabilitiesResponse(GetCapabilitiesRequest request, RequestResponse servlet) {
        //inizializziamo gli oggetti della classe
        init(request, servlet);

    }

    /**
     * Metodo che restituisce ul file xml contenente la risposta ad una getCapabilities
     * @return il file xml 
     */
    public FileOutputStream getCapabilitiesResponseXML() {
        getCapabilitieResp.setVersion(request.getVersion());
        
        //Definiamo qui il ServiceIdentification
        createServiceIdentification();
        //fine definizione campi ServiceIdentification

        //INIZIO definizione campi SERVICE PROVIDER SECTION
        createServiceProvider();
        //FINE - SERVICE PROVIDER SECTION

        //INIZIO - OPERATION METADATA SECTION
        createOperationMetadata();
        //FINE - OPERATION METADATA SECTION

        //INIZIO -  FEATURE TYPE LIST SECTION
        createFeatureTypeList();
        //FINE -  FEATURE TYPE LIST SECTION
        
        //createServesGMLObjectTypeList();


        //Facciamo una prova
        try {
            a = util.createXML2(getCapabilitieResp);
            File file = new File("GetCapabilitiesResponseConFactory.xml");
            System.out.println("IL FILE SI TROVA QUI: "+file.getAbsolutePath());
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
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GetCapabilitiesResponse.class.getName()).log(Level.SEVERE, null, ex);
        }

        return a;
    }

    private void init(GetCapabilitiesRequest request, RequestResponse servlet) {
        factoryWFS = new ObjectFactory();
        this.request = request;
        this.servlet = servlet;
        getCapabilitieResp = factoryWFS.createWFSCapabilitiesType();
        util = new Utility();

    }

    /**
     * Questo metodo crea il campo Service Identification Fornisce informazioni
     * sul server.
     */
    private void createServiceIdentification() {
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
    }

    /**
     * Crea la sezione Service Provider del file xml di risposta alla
     * GetCapabilitiesRequest
     */
    private void createServiceProvider() {
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
    }

    /**
     * Crea la sezione Operation Metadata del file xml di risposta alla
     * GetCapabilitiesRequest
     */
    private void createOperationMetadata() {
        OperationsMetadata OM = new OperationsMetadata();
        List<Operation> operationList = new ArrayList<Operation>();
        Operation operation1 = new Operation();
        operation1.setName("GetCapabilities");
        operationList.add(operation1);
        List<DCP> dcpList = new ArrayList<DCP>();
        DCP dcp1 = new DCP();
        HTTP http1 = new HTTP();
        //QName namespaceget1 = new QName("http://www.w3.org/1999/xlink", "GET");
        QName namespaceget1 = new QName("http://www.opengis.net/ows", "Get");
        //QName namespacepost1 = new QName("http://www.w3.org/1999/xlink", "POST");
        QName namespacepost1 = new QName("http://www.opengis.net/ows","Post");
        RequestMethodType get1 = new RequestMethodType();
        get1.setTitle("Get");
        get1.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs?");
        JAXBElement<RequestMethodType> getOrPostget1 = new JAXBElement<RequestMethodType>(namespaceget1, RequestMethodType.class, get1);
        RequestMethodType post1 = new RequestMethodType();
        post1.setTitle("Post");
        post1.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs");
        JAXBElement<RequestMethodType> getOrPostpost1 = new JAXBElement<RequestMethodType>(namespacepost1, RequestMethodType.class, post1);
        List<JAXBElement<RequestMethodType>> listGetOrSet = new ArrayList<JAXBElement<RequestMethodType>>();
        listGetOrSet.add(getOrPostget1);
        listGetOrSet.add(getOrPostpost1);
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
        //QName namespaceget2 = new QName("http://www.w3.org/1999/xlink", "GET");
        QName namespaceget2 = new QName("http://www.opengis.net/ows", "Get");
        RequestMethodType get2 = new RequestMethodType();
        get2.setTitle("Get");
        get2.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs?");
        JAXBElement<RequestMethodType> getOrPostget2 = new JAXBElement<RequestMethodType>(namespaceget2, RequestMethodType.class, get2);       
        //QName namespacepost2 = new QName("http://www.w3.org/1999/xlink", "POST");
        QName namespacepost2 = new QName("http://www.opengis.net/ows", "Post");
        RequestMethodType post2 = new RequestMethodType();
        post2.setTitle("Post");
        post2.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs");
        JAXBElement<RequestMethodType> getOrPostpost2 = new JAXBElement<RequestMethodType>(namespacepost2, RequestMethodType.class, post2);
        List<JAXBElement<RequestMethodType>> listGetOrSet2 = new ArrayList<JAXBElement<RequestMethodType>>();
        listGetOrSet2.add(getOrPostget2);
        listGetOrSet2.add(getOrPostpost2);
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
        //QName namespaceget3 = new QName("http://www.w3.org/1999/xlink", "GET");
        QName namespaceget3 = new QName("http://www.opengis.net/ows","Get");
        RequestMethodType get3 = new RequestMethodType();
        //get3.setType("Get");
        get3.setTitle("Get");
        get3.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs?");
        JAXBElement<RequestMethodType> getOrPostget3 = new JAXBElement<RequestMethodType>(namespaceget3, RequestMethodType.class, get3);
        //QName namespacepost3 = new QName("http://www.w3.org/1999/xlink", "GET");
        QName namespacepost3 = new QName("http://www.opengis.net/ows","Post");
        RequestMethodType post3 = new RequestMethodType();
        post3.setTitle("Post");
        post3.setHref("http://localhost:8080/WFS_umb_fab/Servlet_wfs");
        JAXBElement<RequestMethodType> getOrPostpost3 = new JAXBElement<RequestMethodType>(namespacepost3, RequestMethodType.class, post3);
        List<JAXBElement<RequestMethodType>> listGetOrSet3 = new ArrayList<JAXBElement<RequestMethodType>>();
        listGetOrSet3.add(getOrPostget3);
        listGetOrSet3.add(getOrPostpost3);
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
        domainType6.setValue(outputList3);
        domainType5.setValue(outputList4);
        parameterList3.add(domainType5);
        parameterList3.add(domainType6);
        operation3.setParameter(parameterList3);
//setto le Operation
        OM.setOperation(operationList);
        getCapabilitieResp.setOperationsMetadata(OM);
    }

    /**
     * Specifichiamo quali sono le feature che il server offre.
     * 
     */
    private void createFeatureTypeList() {
        FeatureTypeListType featureTypeList = new FeatureTypeListType();
        List<FeatureTypeType> listFeatureType = new ArrayList<FeatureTypeType>();
        //--------------Feature Mercato--------------------------------------//
        FeatureTypeType featureTypeMercato =new FeatureTypeType();
        featureTypeMercato.setAbstract("Questa feature descrive un Mercato");
        featureTypeMercato.setDefaultSRS("EPSG:4269");
        List<KeywordsType> keywords = new ArrayList<KeywordsType>();
        KeywordsType keywordMercato = new KeywordsType();
        List<String> keywordList = new ArrayList<String>();
        keywordList.add("mercato");
        keywordMercato.setKeyword(keywordList);
        featureTypeMercato.setKeywords(keywords);
        QName nameMercato = new QName("http://localhost:8080/WFS_umb_fab/Servlet_wfs","Marketplace");
        featureTypeMercato.setName(nameMercato);
        OutputFormatListType listFormatOut = new OutputFormatListType();
        List<String> outputFormat = new ArrayList<String>();
        outputFormat.add("text/xml");
        outputFormat.add("subtype=gml/3.1.1");
        listFormatOut.setFormat(outputFormat);
        featureTypeMercato.setOutputFormats(listFormatOut);
        featureTypeMercato.setTitle("Mercato");
        List<WGS84BoundingBoxType> listBbox = new ArrayList<WGS84BoundingBoxType>();
        WGS84BoundingBoxType Bbox = new WGS84BoundingBoxType();
        List<Double> lowerCorner = new ArrayList<Double>();
        lowerCorner.add(new Double("-180"));
        lowerCorner.add(new Double("90"));
        Bbox.setLowerCorner(lowerCorner);
        List<Double> UpperCorner = new ArrayList<Double>();
        UpperCorner.add(new Double("180"));
        UpperCorner.add(new Double("-90"));
        Bbox.setUpperCorner(UpperCorner);
        listBbox.add(Bbox);
        featureTypeMercato.setWGS84BoundingBox(listBbox);
        listFeatureType.add(featureTypeMercato);
        //-------------------------fine mercato----------------------------//
        //--------------------feature FARM--------------------------------//
        FeatureTypeType featureFarm = factoryWFS.createFeatureTypeType();
        featureFarm.setAbstract("Questa Feature descrive una FARM");
        featureFarm.setTitle("Farm");
        featureFarm.setDefaultSRS("EPSG:4269");
        List<KeywordsType> keywordsFarm = new ArrayList<KeywordsType>();
        KeywordsType keywordFarm = new KeywordsType();
        List<String> keywordListFarm = new ArrayList<String>();
        keywordListFarm.add("mercato");
        keywordFarm.setKeyword(keywordListFarm);
        featureFarm.setKeywords(keywordsFarm);
        QName nameFarm = new QName("http://localhost:8080/WFS_umb_fab/Servlet_wfs","Farm");
        featureFarm.setName(nameFarm);
        OutputFormatListType listFormatOutFarm = new OutputFormatListType();
        List<String> outputFormatFarm = new ArrayList<String>();
        outputFormatFarm.add("text/xml");
        outputFormatFarm.add("subtype=gml/3.1.1");
        listFormatOutFarm.setFormat(outputFormatFarm);
        featureFarm.setOutputFormats(listFormatOutFarm);
        List<WGS84BoundingBoxType> listBboxFarm = new ArrayList<WGS84BoundingBoxType>();
        WGS84BoundingBoxType BboxFarm = new WGS84BoundingBoxType();
        List<Double> lowerCornerFarm = new ArrayList<Double>();
        lowerCornerFarm.add(new Double("-180"));
        lowerCornerFarm.add(new Double("90"));
        BboxFarm.setLowerCorner(lowerCornerFarm);
        List<Double> UpperCornerFarm = new ArrayList<Double>();
        UpperCornerFarm.add(new Double("180"));
        UpperCornerFarm.add(new Double("-90"));
        BboxFarm.setUpperCorner(UpperCornerFarm);
        listBboxFarm.add(BboxFarm);
        featureFarm.setWGS84BoundingBox(listBboxFarm);
        listFeatureType.add(featureFarm);
        //----------------------fine Farm--------------------------------//
        //----------------------feature CITTA'--------------------//
        FeatureTypeType featureCity = factoryWFS.createFeatureTypeType();
        featureCity.setAbstract("Questa Feature descrive una Città");
        featureCity.setTitle("City");
        featureCity.setDefaultSRS("EPSG:4269");
        List<KeywordsType> keywordsCity = new ArrayList<KeywordsType>();
        KeywordsType keywordCity = new KeywordsType();
        List<String> keywordListCity = new ArrayList<String>();
        keywordListCity.add("City");
        keywordCity.setKeyword(keywordListCity);
        featureCity.setKeywords(keywordsCity);
        QName nameCity = new QName("http://localhost:8080/WFS_umb_fab/Servlet_wfs","City");
        featureCity.setName(nameCity);
        OutputFormatListType listFormatOutCity = new OutputFormatListType();
        List<String> outputFormatCity = new ArrayList<String>();
        outputFormatCity.add("text/xml");
        outputFormatCity.add("subtype=gml/3.1.1");
        listFormatOutCity.setFormat(outputFormatCity);
        featureCity.setOutputFormats(listFormatOutCity);
        List<WGS84BoundingBoxType> listBboxCity = new ArrayList<WGS84BoundingBoxType>();
        WGS84BoundingBoxType BboxCity = new WGS84BoundingBoxType();
        List<Double> lowerCornerCity = new ArrayList<Double>();
        lowerCornerCity.add(new Double("-180"));
        lowerCornerCity.add(new Double("90"));
        BboxCity.setLowerCorner(lowerCornerCity);
        List<Double> UpperCornerCity = new ArrayList<Double>();
        UpperCornerCity.add(new Double("180"));
        UpperCornerCity.add(new Double("-90"));
        BboxCity.setUpperCorner(UpperCornerCity);
        listBboxCity.add(BboxCity);
        featureCity.setWGS84BoundingBox(listBboxCity);
        listFeatureType.add(featureCity);
        //------------------------fine feature Città------------------------//
        //----------------------feature distretto--------------------//
        FeatureTypeType featureDistrict = factoryWFS.createFeatureTypeType();
        featureDistrict.setAbstract("Questa Feature descrive un District");
        featureDistrict.setTitle("District");
        featureDistrict.setDefaultSRS("EPSG:4269");
        List<KeywordsType> keywordsDistrict = new ArrayList<KeywordsType>();
        KeywordsType keywordDistrict = new KeywordsType();
        List<String> keywordListDistrict = new ArrayList<String>();
        keywordListDistrict.add("District");
        keywordDistrict.setKeyword(keywordListDistrict);
        featureDistrict.setKeywords(keywordsDistrict);
        QName nameDistrict = new QName("http://localhost:8080/WFS_umb_fab/Servlet_wfs","District");
        featureDistrict.setName(nameDistrict);
        OutputFormatListType listFormatOutDistrict = new OutputFormatListType();
        List<String> outputFormatDistrict = new ArrayList<String>();
        outputFormatDistrict.add("text/xml");
        outputFormatDistrict.add("subtype=gml/3.1.1");
        listFormatOutDistrict.setFormat(outputFormatDistrict);
        featureDistrict.setOutputFormats(listFormatOutDistrict);
        List<WGS84BoundingBoxType> listBboxDistrict = new ArrayList<WGS84BoundingBoxType>();
        WGS84BoundingBoxType BboxDistrict = new WGS84BoundingBoxType();
        List<Double> lowerCornerDistrict = new ArrayList<Double>();
        lowerCornerDistrict.add(new Double("-180"));
        lowerCornerDistrict.add(new Double("90"));
        BboxDistrict.setLowerCorner(lowerCornerCity);
        List<Double> UpperCornerDistrict = new ArrayList<Double>();
        UpperCornerDistrict.add(new Double("180"));
        UpperCornerDistrict.add(new Double("-90"));
        BboxDistrict.setUpperCorner(UpperCornerDistrict);
        listBboxDistrict.add(BboxDistrict);
        featureDistrict.setWGS84BoundingBox(listBboxDistrict);
        listFeatureType.add(featureDistrict);
        //------------------------fine feature distretto------------------------//
        //----------------------feature Provincia--------------------//
        FeatureTypeType featureProvince = factoryWFS.createFeatureTypeType();
        featureProvince.setAbstract("Questa Feature descrive una Province");
        featureProvince.setTitle("Province");
        featureProvince.setDefaultSRS("EPSG:4269");
        List<KeywordsType> keywordsProvince = new ArrayList<KeywordsType>();
        KeywordsType keywordProvince = new KeywordsType();
        List<String> keywordListProvince = new ArrayList<String>();
        keywordListProvince.add("Province");
        keywordProvince.setKeyword(keywordListProvince);
        featureProvince.setKeywords(keywordsProvince);
        QName nameProvince = new QName("http://localhost:8080/WFS_umb_fab/Servlet_wfs","Province");
        featureProvince.setName(nameProvince);
        OutputFormatListType listFormatOutProvince = new OutputFormatListType();
        List<String> outputFormatProvince = new ArrayList<String>();
        outputFormatProvince.add("text/xml");
        outputFormatProvince.add("subtype=gml/3.1.1");
        listFormatOutProvince.setFormat(outputFormatProvince);
        featureProvince.setOutputFormats(listFormatOutProvince);
        List<WGS84BoundingBoxType> listBboxProvince = new ArrayList<WGS84BoundingBoxType>();
        WGS84BoundingBoxType BboxProvince = new WGS84BoundingBoxType();
        List<Double> lowerCornerProvince = new ArrayList<Double>();
        lowerCornerProvince.add(new Double("-180"));
        lowerCornerProvince.add(new Double("90"));
        BboxProvince.setLowerCorner(lowerCornerProvince);
        List<Double> UpperCornerProvince = new ArrayList<Double>();
        UpperCornerProvince.add(new Double("180"));
        UpperCornerProvince.add(new Double("-90"));
        BboxProvince.setUpperCorner(UpperCornerProvince);
        listBboxProvince.add(BboxProvince);
        featureProvince.setWGS84BoundingBox(listBboxProvince);
        listFeatureType.add(featureProvince);
        //------------------------fine feature Provincia------------------------//
        //----------------------feature CITTA'--------------------//
        FeatureTypeType featureNation = factoryWFS.createFeatureTypeType();
        featureNation.setAbstract("Questa Feature descrive una Nazione");
        featureNation.setTitle("Nation");
        featureNation.setDefaultSRS("EPSG:4269");
        List<KeywordsType> keywordsNation = new ArrayList<KeywordsType>();
        KeywordsType keywordNation = new KeywordsType();
        List<String> keywordListNation = new ArrayList<String>();
        keywordListNation.add("Nazione");
        keywordNation.setKeyword(keywordListNation);
        featureNation.setKeywords(keywordsNation);
        QName nameNation = new QName("http://localhost:8080/WFS_umb_fab/Servlet_wfs","Nation");
        featureNation.setName(nameNation);
        OutputFormatListType listFormatOutNation = new OutputFormatListType();
        List<String> outputFormatNation = new ArrayList<String>();
        outputFormatNation.add("text/xml");
        outputFormatNation.add("subtype=gml/3.1.1");
        listFormatOutNation.setFormat(outputFormatNation);
        featureNation.setOutputFormats(listFormatOutNation);
        List<WGS84BoundingBoxType> listBboxNation = new ArrayList<WGS84BoundingBoxType>();
        WGS84BoundingBoxType BboxNation = new WGS84BoundingBoxType();
        List<Double> lowerCornerNation = new ArrayList<Double>();
        lowerCornerNation.add(new Double("-180"));
        lowerCornerNation.add(new Double("90"));
        BboxNation.setLowerCorner(lowerCornerNation);
        List<Double> UpperCornerNation = new ArrayList<Double>();
        UpperCornerNation.add(new Double("180"));
        UpperCornerNation.add(new Double("-90"));
        BboxNation.setUpperCorner(UpperCornerNation);
        listBboxNation.add(BboxNation);
        featureNation.setWGS84BoundingBox(listBboxNation);
        listFeatureType.add(featureNation);
        //------------------------fine feature Città------------------------//
        
        featureTypeList.setFeatureType(listFeatureType);
        getCapabilitieResp.setFeatureTypeList(featureTypeList);
        
    }

    /**
     * nel pacchetto WFS 1.1.0 manca la classe ServesGMLObjectTypeList
     * vedi nota nel metodo createXML nella classe utility.java grazie 
     
    private void createServesGMLObjectTypeList() {
        GMLObjectTypeListType SGOTL = new GMLObjectTypeListType();
       List<GMLObjectTypeType> typelist = new ArrayList<GMLObjectTypeType>();
       GMLObjectTypeType type1 = new GMLObjectTypeType();
       typelist.add(type1);
        SGOTL.setGMLObjectType(typelist);
        getCapabilitieResp.setServesGMLObjectTypeList(SGOTL);
    }*/
}
