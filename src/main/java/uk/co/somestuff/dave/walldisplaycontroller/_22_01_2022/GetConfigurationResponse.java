
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
 *         &amp;lt;element name="GetConfigurationResult" type="{http://dave.somestuff.co.uk/WallDisplayController/22-01-2022}Configuration" minOccurs="0"/&amp;gt;
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
    "getConfigurationResult"
})
@XmlRootElement(name = "GetConfigurationResponse")
public class GetConfigurationResponse {

    @XmlElement(name = "GetConfigurationResult")
    protected Configuration getConfigurationResult;

    /**
     * Gets the value of the getConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration }
     *     
     */
    public Configuration getGetConfigurationResult() {
        return getConfigurationResult;
    }

    /**
     * Sets the value of the getConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration }
     *     
     */
    public void setGetConfigurationResult(Configuration value) {
        this.getConfigurationResult = value;
    }

}
