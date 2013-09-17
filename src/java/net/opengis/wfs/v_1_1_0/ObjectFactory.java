//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.01.31 um 12:39:31 AM CET 
//


package net.opengis.wfs.v_1_1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.wfs.v_1_1_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DescribeFeatureType_QNAME = new QName("http://www.opengis.net/wfs", "DescribeFeatureType");
    private final static QName _Native_QNAME = new QName("http://www.opengis.net/wfs", "Native");
    private final static QName _GetGmlObject_QNAME = new QName("http://www.opengis.net/wfs", "GetGmlObject");
    private final static QName _WFSCapabilities_QNAME = new QName("http://www.opengis.net/wfs", "WFS_Capabilities");
    private final static QName _FeatureTypeList_QNAME = new QName("http://www.opengis.net/wfs", "FeatureTypeList");
    private final static QName _GetFeatureWithLock_QNAME = new QName("http://www.opengis.net/wfs", "GetFeatureWithLock");
    private final static QName _LockFeatureResponse_QNAME = new QName("http://www.opengis.net/wfs", "LockFeatureResponse");
    private final static QName _PropertyName_QNAME = new QName("http://www.opengis.net/wfs", "PropertyName");
    private final static QName _TransactionResponse_QNAME = new QName("http://www.opengis.net/wfs", "TransactionResponse");
    private final static QName _LockFeature_QNAME = new QName("http://www.opengis.net/wfs", "LockFeature");
    private final static QName _GetFeature_QNAME = new QName("http://www.opengis.net/wfs", "GetFeature");
    private final static QName _GetCapabilities_QNAME = new QName("http://www.opengis.net/wfs", "GetCapabilities");
    private final static QName _Transaction_QNAME = new QName("http://www.opengis.net/wfs", "Transaction");
    private final static QName _Delete_QNAME = new QName("http://www.opengis.net/wfs", "Delete");
    private final static QName _LockId_QNAME = new QName("http://www.opengis.net/wfs", "LockId");
    private final static QName _Property_QNAME = new QName("http://www.opengis.net/wfs", "Property");
    private final static QName _Query_QNAME = new QName("http://www.opengis.net/wfs", "Query");
    private final static QName _Update_QNAME = new QName("http://www.opengis.net/wfs", "Update");
    private final static QName _SupportsGMLObjectTypeList_QNAME = new QName("http://www.opengis.net/wfs", "SupportsGMLObjectTypeList");
    private final static QName _FeatureCollection_QNAME = new QName("http://www.opengis.net/wfs", "FeatureCollection");
    private final static QName _Insert_QNAME = new QName("http://www.opengis.net/wfs", "Insert");
    private final static QName _ServesGMLObjectTypeList_QNAME = new QName("http://www.opengis.net/wfs", "ServesGMLObjectTypeList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.wfs.v_1_1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeatureTypeType }
     * 
     */
    public FeatureTypeType createFeatureTypeType() {
        return new FeatureTypeType();
    }

    /**
     * Create an instance of {@link GMLObjectTypeListType }
     * 
     */
    public GMLObjectTypeListType createGMLObjectTypeListType() {
        return new GMLObjectTypeListType();
    }

    /**
     * Create an instance of {@link FeatureCollectionType }
     * 
     */
    public FeatureCollectionType createFeatureCollectionType() {
        return new FeatureCollectionType();
    }

    /**
     * Create an instance of {@link InsertElementType }
     * 
     */
    public InsertElementType createInsertElementType() {
        return new InsertElementType();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link GetCapabilitiesType }
     * 
     */
    public GetCapabilitiesType createGetCapabilitiesType() {
        return new GetCapabilitiesType();
    }

    /**
     * Create an instance of {@link UpdateElementType }
     * 
     */
    public UpdateElementType createUpdateElementType() {
        return new UpdateElementType();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link TransactionResponseType }
     * 
     */
    public TransactionResponseType createTransactionResponseType() {
        return new TransactionResponseType();
    }

    /**
     * Create an instance of {@link LockFeatureType }
     * 
     */
    public LockFeatureType createLockFeatureType() {
        return new LockFeatureType();
    }

    /**
     * Create an instance of {@link GetFeatureType }
     * 
     */
    public GetFeatureType createGetFeatureType() {
        return new GetFeatureType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link LockFeatureResponseType }
     * 
     */
    public LockFeatureResponseType createLockFeatureResponseType() {
        return new LockFeatureResponseType();
    }

    /**
     * Create an instance of {@link FeatureTypeListType }
     * 
     */
    public FeatureTypeListType createFeatureTypeListType() {
        return new FeatureTypeListType();
    }

    /**
     * Create an instance of {@link GetFeatureWithLockType }
     * 
     */
    public GetFeatureWithLockType createGetFeatureWithLockType() {
        return new GetFeatureWithLockType();
    }

    /**
     * Create an instance of {@link WFSCapabilitiesType }
     * 
     */
    public WFSCapabilitiesType createWFSCapabilitiesType() {
        return new WFSCapabilitiesType();
    }

    /**
     * Create an instance of {@link XlinkPropertyName }
     * 
     */
    public XlinkPropertyName createXlinkPropertyName() {
        return new XlinkPropertyName();
    }

    /**
     * Create an instance of {@link GetGmlObjectType }
     * 
     */
    public GetGmlObjectType createGetGmlObjectType() {
        return new GetGmlObjectType();
    }

    /**
     * Create an instance of {@link DeleteElementType }
     * 
     */
    public DeleteElementType createDeleteElementType() {
        return new DeleteElementType();
    }

    /**
     * Create an instance of {@link DescribeFeatureTypeType }
     * 
     */
    public DescribeFeatureTypeType createDescribeFeatureTypeType() {
        return new DescribeFeatureTypeType();
    }

    /**
     * Create an instance of {@link NativeType }
     * 
     */
    public NativeType createNativeType() {
        return new NativeType();
    }

    /**
     * Create an instance of {@link FeaturesLockedType }
     * 
     */
    public FeaturesLockedType createFeaturesLockedType() {
        return new FeaturesLockedType();
    }

    /**
     * Create an instance of {@link GMLObjectTypeType }
     * 
     */
    public GMLObjectTypeType createGMLObjectTypeType() {
        return new GMLObjectTypeType();
    }

    /**
     * Create an instance of {@link OutputFormatListType }
     * 
     */
    public OutputFormatListType createOutputFormatListType() {
        return new OutputFormatListType();
    }

    /**
     * Create an instance of {@link OperationsType }
     * 
     */
    public OperationsType createOperationsType() {
        return new OperationsType();
    }

    /**
     * Create an instance of {@link LockType }
     * 
     */
    public LockType createLockType() {
        return new LockType();
    }

    /**
     * Create an instance of {@link MetadataURLType }
     * 
     */
    public MetadataURLType createMetadataURLType() {
        return new MetadataURLType();
    }

    /**
     * Create an instance of {@link TransactionSummaryType }
     * 
     */
    public TransactionSummaryType createTransactionSummaryType() {
        return new TransactionSummaryType();
    }

    /**
     * Create an instance of {@link TransactionResultsType }
     * 
     */
    public TransactionResultsType createTransactionResultsType() {
        return new TransactionResultsType();
    }

    /**
     * Create an instance of {@link FeaturesNotLockedType }
     * 
     */
    public FeaturesNotLockedType createFeaturesNotLockedType() {
        return new FeaturesNotLockedType();
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link InsertResultsType }
     * 
     */
    public InsertResultsType createInsertResultsType() {
        return new InsertResultsType();
    }

    /**
     * Create an instance of {@link InsertedFeatureType }
     * 
     */
    public InsertedFeatureType createInsertedFeatureType() {
        return new InsertedFeatureType();
    }

    /**
     * Create an instance of {@link FeatureTypeType.NoSRS }
     * 
     */
    public FeatureTypeType.NoSRS createFeatureTypeTypeNoSRS() {
        return new FeatureTypeType.NoSRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeFeatureTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "DescribeFeatureType")
    public JAXBElement<DescribeFeatureTypeType> createDescribeFeatureType(DescribeFeatureTypeType value) {
        return new JAXBElement<DescribeFeatureTypeType>(_DescribeFeatureType_QNAME, DescribeFeatureTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NativeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Native")
    public JAXBElement<NativeType> createNative(NativeType value) {
        return new JAXBElement<NativeType>(_Native_QNAME, NativeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGmlObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "GetGmlObject")
    public JAXBElement<GetGmlObjectType> createGetGmlObject(GetGmlObjectType value) {
        return new JAXBElement<GetGmlObjectType>(_GetGmlObject_QNAME, GetGmlObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WFSCapabilitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "WFS_Capabilities")
    public JAXBElement<WFSCapabilitiesType> createWFSCapabilities(WFSCapabilitiesType value) {
        return new JAXBElement<WFSCapabilitiesType>(_WFSCapabilities_QNAME, WFSCapabilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureTypeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "FeatureTypeList")
    public JAXBElement<FeatureTypeListType> createFeatureTypeList(FeatureTypeListType value) {
        return new JAXBElement<FeatureTypeListType>(_FeatureTypeList_QNAME, FeatureTypeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeatureWithLockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "GetFeatureWithLock")
    public JAXBElement<GetFeatureWithLockType> createGetFeatureWithLock(GetFeatureWithLockType value) {
        return new JAXBElement<GetFeatureWithLockType>(_GetFeatureWithLock_QNAME, GetFeatureWithLockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockFeatureResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "LockFeatureResponse")
    public JAXBElement<LockFeatureResponseType> createLockFeatureResponse(LockFeatureResponseType value) {
        return new JAXBElement<LockFeatureResponseType>(_LockFeatureResponse_QNAME, LockFeatureResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "PropertyName")
    public JAXBElement<String> createPropertyName(String value) {
        return new JAXBElement<String>(_PropertyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "TransactionResponse")
    public JAXBElement<TransactionResponseType> createTransactionResponse(TransactionResponseType value) {
        return new JAXBElement<TransactionResponseType>(_TransactionResponse_QNAME, TransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "LockFeature")
    public JAXBElement<LockFeatureType> createLockFeature(LockFeatureType value) {
        return new JAXBElement<LockFeatureType>(_LockFeature_QNAME, LockFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "GetFeature")
    public JAXBElement<GetFeatureType> createGetFeature(GetFeatureType value) {
        return new JAXBElement<GetFeatureType>(_GetFeature_QNAME, GetFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "GetCapabilities")
    public JAXBElement<GetCapabilitiesType> createGetCapabilities(GetCapabilitiesType value) {
        return new JAXBElement<GetCapabilitiesType>(_GetCapabilities_QNAME, GetCapabilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Transaction")
    public JAXBElement<TransactionType> createTransaction(TransactionType value) {
        return new JAXBElement<TransactionType>(_Transaction_QNAME, TransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Delete")
    public JAXBElement<DeleteElementType> createDelete(DeleteElementType value) {
        return new JAXBElement<DeleteElementType>(_Delete_QNAME, DeleteElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "LockId")
    public JAXBElement<String> createLockId(String value) {
        return new JAXBElement<String>(_LockId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Query")
    public JAXBElement<QueryType> createQuery(QueryType value) {
        return new JAXBElement<QueryType>(_Query_QNAME, QueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Update")
    public JAXBElement<UpdateElementType> createUpdate(UpdateElementType value) {
        return new JAXBElement<UpdateElementType>(_Update_QNAME, UpdateElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMLObjectTypeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "SupportsGMLObjectTypeList")
    public JAXBElement<GMLObjectTypeListType> createSupportsGMLObjectTypeList(GMLObjectTypeListType value) {
        return new JAXBElement<GMLObjectTypeListType>(_SupportsGMLObjectTypeList_QNAME, GMLObjectTypeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "FeatureCollection", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_FeatureCollection")
    public JAXBElement<FeatureCollectionType> createFeatureCollection(FeatureCollectionType value) {
        return new JAXBElement<FeatureCollectionType>(_FeatureCollection_QNAME, FeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "Insert")
    public JAXBElement<InsertElementType> createInsert(InsertElementType value) {
        return new JAXBElement<InsertElementType>(_Insert_QNAME, InsertElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMLObjectTypeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs", name = "ServesGMLObjectTypeList")
    public JAXBElement<GMLObjectTypeListType> createServesGMLObjectTypeList(GMLObjectTypeListType value) {
        return new JAXBElement<GMLObjectTypeListType>(_ServesGMLObjectTypeList_QNAME, GMLObjectTypeListType.class, null, value);
    }

}