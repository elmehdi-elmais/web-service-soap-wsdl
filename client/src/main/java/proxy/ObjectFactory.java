
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionEuroToDh_QNAME = new QName("http://ws.com/", "conversionEuroToDh");
    private static final QName _ConversionEuroToDhResponse_QNAME = new QName("http://ws.com/", "conversionEuroToDhResponse");
    private static final QName _GetAccount_QNAME = new QName("http://ws.com/", "getAccount");
    private static final QName _GetAccountResponse_QNAME = new QName("http://ws.com/", "getAccountResponse");
    private static final QName _GetAccounts_QNAME = new QName("http://ws.com/", "getAccounts");
    private static final QName _GetAccountsResponse_QNAME = new QName("http://ws.com/", "getAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDh }
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDhResponse }
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     * @return
     *     the new instance of {@link GetAccounts }
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsResponse }
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "conversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "conversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

}
