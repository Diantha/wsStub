
package it.unibo.test.services.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.unibo.test.services.ws package. 
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

    private final static QName _DeleteUser_QNAME = new QName("http://services.unibo.it/", "deleteUser");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://services.unibo.it/", "deleteUserResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://services.unibo.it/", "addUserResponse");
    private final static QName _DeletCredentialsResponse_QNAME = new QName("http://services.unibo.it/", "deletCredentialsResponse");
    private final static QName _AddCredentialsResponse_QNAME = new QName("http://services.unibo.it/", "addCredentialsResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://services.unibo.it/", "getUserResponse");
    private final static QName _GetUser_QNAME = new QName("http://services.unibo.it/", "getUser");
    private final static QName _AddUser_QNAME = new QName("http://services.unibo.it/", "addUser");
    private final static QName _GetCredentialResponse_QNAME = new QName("http://services.unibo.it/", "getCredentialResponse");
    private final static QName _AddCredentials_QNAME = new QName("http://services.unibo.it/", "addCredentials");
    private final static QName _GetCredential_QNAME = new QName("http://services.unibo.it/", "getCredential");
    private final static QName _Exception_QNAME = new QName("http://services.unibo.it/", "Exception");
    private final static QName _DeletCredentials_QNAME = new QName("http://services.unibo.it/", "deletCredentials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unibo.test.services.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link DeletCredentialsResponse }
     * 
     */
    public DeletCredentialsResponse createDeletCredentialsResponse() {
        return new DeletCredentialsResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetCredential }
     * 
     */
    public GetCredential createGetCredential() {
        return new GetCredential();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UserBean }
     * 
     */
    public UserBean createUserBean() {
        return new UserBean();
    }

    /**
     * Create an instance of {@link DeletCredentials }
     * 
     */
    public DeletCredentials createDeletCredentials() {
        return new DeletCredentials();
    }

    /**
     * Create an instance of {@link AddCredentialsResponse }
     * 
     */
    public AddCredentialsResponse createAddCredentialsResponse() {
        return new AddCredentialsResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link AddCredentials }
     * 
     */
    public AddCredentials createAddCredentials() {
        return new AddCredentials();
    }

    /**
     * Create an instance of {@link GetCredentialResponse }
     * 
     */
    public GetCredentialResponse createGetCredentialResponse() {
        return new GetCredentialResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "deletCredentialsResponse")
    public JAXBElement<DeletCredentialsResponse> createDeletCredentialsResponse(DeletCredentialsResponse value) {
        return new JAXBElement<DeletCredentialsResponse>(_DeletCredentialsResponse_QNAME, DeletCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "addCredentialsResponse")
    public JAXBElement<AddCredentialsResponse> createAddCredentialsResponse(AddCredentialsResponse value) {
        return new JAXBElement<AddCredentialsResponse>(_AddCredentialsResponse_QNAME, AddCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCredentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "getCredentialResponse")
    public JAXBElement<GetCredentialResponse> createGetCredentialResponse(GetCredentialResponse value) {
        return new JAXBElement<GetCredentialResponse>(_GetCredentialResponse_QNAME, GetCredentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "addCredentials")
    public JAXBElement<AddCredentials> createAddCredentials(AddCredentials value) {
        return new JAXBElement<AddCredentials>(_AddCredentials_QNAME, AddCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "getCredential")
    public JAXBElement<GetCredential> createGetCredential(GetCredential value) {
        return new JAXBElement<GetCredential>(_GetCredential_QNAME, GetCredential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.unibo.it/", name = "deletCredentials")
    public JAXBElement<DeletCredentials> createDeletCredentials(DeletCredentials value) {
        return new JAXBElement<DeletCredentials>(_DeletCredentials_QNAME, DeletCredentials.class, null, value);
    }

}
