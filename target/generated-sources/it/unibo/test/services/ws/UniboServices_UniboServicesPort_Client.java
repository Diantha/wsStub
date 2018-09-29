
package it.unibo.test.services.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2018-09-29T17:30:03.402+02:00
 * Generated source version: 2.5.2
 * 
 */
public final class UniboServices_UniboServicesPort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.unibo.it/", "UniboServicesService");

    private UniboServices_UniboServicesPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UniboServicesService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UniboServicesService ss = new UniboServicesService(wsdlURL, SERVICE_NAME);
        UniboServices port = ss.getUniboServicesPort();  
        
        {
        System.out.println("Invoking getUser...");
        java.lang.Integer _getUser_idUser = null;
        try {
            it.unibo.test.services.ws.UserBean _getUser__return = port.getUser(_getUser_idUser);
            System.out.println("getUser.result=" + _getUser__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking addUser...");
        it.unibo.test.services.ws.UserBean _addUser_idUser = null;
        try {
            port.addUser(_addUser_idUser);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking addCredentials...");
        java.lang.Integer _addCredentials_idUser = null;
        try {
            it.unibo.test.services.ws.UserBean _addCredentials__return = port.addCredentials(_addCredentials_idUser);
            System.out.println("addCredentials.result=" + _addCredentials__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCredential...");
        java.lang.Integer _getCredential_idUser = null;
        try {
            it.unibo.test.services.ws.UserBean _getCredential__return = port.getCredential(_getCredential_idUser);
            System.out.println("getCredential.result=" + _getCredential__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteUser...");
        java.lang.Integer _deleteUser_idUser = null;
        try {
            it.unibo.test.services.ws.UserBean _deleteUser__return = port.deleteUser(_deleteUser_idUser);
            System.out.println("deleteUser.result=" + _deleteUser__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deletCredentials...");
        java.lang.Integer _deletCredentials_idUser = null;
        try {
            it.unibo.test.services.ws.UserBean _deletCredentials__return = port.deletCredentials(_deletCredentials_idUser);
            System.out.println("deletCredentials.result=" + _deletCredentials__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
