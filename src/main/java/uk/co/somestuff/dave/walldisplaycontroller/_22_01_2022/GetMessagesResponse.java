
package uk.co.somestuff.dave.walldisplaycontroller._22_01_2022;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetMessagesResult" type="{http://dave.somestuff.co.uk/WallDisplayController/22-01-2022}ArrayOfMessage" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMessagesResult"
})
@XmlRootElement(name = "GetMessagesResponse")
public class GetMessagesResponse {

    @XmlElement(name = "GetMessagesResult")
    protected ArrayOfMessage getMessagesResult;

    /**
     * Gets the value of the getMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getGetMessagesResult() {
        return getMessagesResult;
    }

    /**
     * Sets the value of the getMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setGetMessagesResult(ArrayOfMessage value) {
        this.getMessagesResult = value;
    }

}
