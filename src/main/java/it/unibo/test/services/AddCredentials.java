
package it.unibo.test.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cred" type="{http://services.unibo.it/}credentialBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCredentials", propOrder = {
    "idUser",
    "cred"
})
public class AddCredentials {

    protected Integer idUser;
    protected CredentialBean cred;

    /**
     * Gets the value of the idUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUser(Integer value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the cred property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialBean }
     *     
     */
    public CredentialBean getCred() {
        return cred;
    }

    /**
     * Sets the value of the cred property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialBean }
     *     
     */
    public void setCred(CredentialBean value) {
        this.cred = value;
    }

}
