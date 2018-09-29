package it.unibo.test.services.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2018-09-29T17:30:03.515+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://services.unibo.it/", name = "UniboServices")
@XmlSeeAlso({ObjectFactory.class})
public interface UniboServices {

    @WebMethod
    @RequestWrapper(localName = "getUser", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.GetUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public it.unibo.test.services.ws.UserBean getUser(
        @WebParam(name = "idUser", targetNamespace = "")
        java.lang.Integer idUser
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.AddUserResponse")
    public void addUser(
        @WebParam(name = "idUser", targetNamespace = "")
        it.unibo.test.services.ws.UserBean idUser
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "addCredentials", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.AddCredentials")
    @ResponseWrapper(localName = "addCredentialsResponse", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.AddCredentialsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public it.unibo.test.services.ws.UserBean addCredentials(
        @WebParam(name = "idUser", targetNamespace = "")
        java.lang.Integer idUser
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "getCredential", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.GetCredential")
    @ResponseWrapper(localName = "getCredentialResponse", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.GetCredentialResponse")
    @WebResult(name = "return", targetNamespace = "")
    public it.unibo.test.services.ws.UserBean getCredential(
        @WebParam(name = "idUser", targetNamespace = "")
        java.lang.Integer idUser
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.DeleteUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public it.unibo.test.services.ws.UserBean deleteUser(
        @WebParam(name = "idUser", targetNamespace = "")
        java.lang.Integer idUser
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "deletCredentials", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.DeletCredentials")
    @ResponseWrapper(localName = "deletCredentialsResponse", targetNamespace = "http://services.unibo.it/", className = "it.unibo.test.services.ws.DeletCredentialsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public it.unibo.test.services.ws.UserBean deletCredentials(
        @WebParam(name = "idUser", targetNamespace = "")
        java.lang.Integer idUser
    ) throws Exception_Exception;
}