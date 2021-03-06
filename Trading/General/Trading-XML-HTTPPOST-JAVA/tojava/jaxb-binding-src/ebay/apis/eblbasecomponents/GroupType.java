//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Allows you to group Best Match search results by category.
 * 			
 * 
 * <p>Java class for GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxGroups" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxEntriesPerGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupType", propOrder = {
    "maxGroups",
    "maxEntriesPerGroup"
})
public class GroupType {

    @XmlElement(name = "MaxGroups")
    protected Integer maxGroups;
    @XmlElement(name = "MaxEntriesPerGroup")
    protected Integer maxEntriesPerGroup;

    /**
     * Gets the value of the maxGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGroups() {
        return maxGroups;
    }

    /**
     * Sets the value of the maxGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGroups(Integer value) {
        this.maxGroups = value;
    }

    /**
     * Gets the value of the maxEntriesPerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntriesPerGroup() {
        return maxEntriesPerGroup;
    }

    /**
     * Sets the value of the maxEntriesPerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntriesPerGroup(Integer value) {
        this.maxEntriesPerGroup = value;
    }

}
