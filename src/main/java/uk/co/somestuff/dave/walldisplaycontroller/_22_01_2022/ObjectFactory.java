
package uk.co.somestuff.dave.walldisplaycontroller._22_01_2022;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.somestuff.dave.walldisplaycontroller._22_01_2022 package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _TokenHeader_QNAME = new QName("http://dave.somestuff.co.uk/WallDisplayController/22-01-2022", "TokenHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.somestuff.dave.walldisplaycontroller._22_01_2022
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessages }
     * 
     */
    public GetMessages createGetMessages() {
        return new GetMessages();
    }

    /**
     * Create an instance of {@link GetMessagesResponse }
     * 
     */
    public GetMessagesResponse createGetMessagesResponse() {
        return new GetMessagesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMessage }
     * 
     */
    public ArrayOfMessage createArrayOfMessage() {
        return new ArrayOfMessage();
    }

    /**
     * Create an instance of {@link TokenHeader }
     * 
     */
    public TokenHeader createTokenHeader() {
        return new TokenHeader();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ObjectId }
     * 
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://dave.somestuff.co.uk/WallDisplayController/22-01-2022", name = "TokenHeader")
    public JAXBElement<TokenHeader> createTokenHeader(TokenHeader value) {
        return new JAXBElement<TokenHeader>(_TokenHeader_QNAME, TokenHeader.class, null, value);
    }

}
