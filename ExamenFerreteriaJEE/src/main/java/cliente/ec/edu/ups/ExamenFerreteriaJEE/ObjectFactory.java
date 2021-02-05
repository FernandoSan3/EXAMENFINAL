
package cliente.ec.edu.ups.ExamenFerreteriaJEE;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente.ec.edu.ups.ExamenFerreteriaJEE package. 
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

    private final static QName _CrearProveedorResponse_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "crearProveedorResponse");
    private final static QName _CrearPtoductoResponse_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "crearPtoductoResponse");
    private final static QName _CrearProveedor_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "crearProveedor");
    private final static QName _BuscarProductoResponse_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "buscarProductoResponse");
    private final static QName _BuscaProducto_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "buscaProducto");
    private final static QName _Exception_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "Exception");
    private final static QName _BuscaProductoResponse_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "buscaProductoResponse");
    private final static QName _BuscarProducto_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "buscarProducto");
    private final static QName _CrearPtoducto_QNAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "crearPtoducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente.ec.edu.ups.ExamenFerreteriaJEE
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearProveedor }
     * 
     */
    public CrearProveedor createCrearProveedor() {
        return new CrearProveedor();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link CrearProveedorResponse }
     * 
     */
    public CrearProveedorResponse createCrearProveedorResponse() {
        return new CrearProveedorResponse();
    }

    /**
     * Create an instance of {@link CrearPtoductoResponse }
     * 
     */
    public CrearPtoductoResponse createCrearPtoductoResponse() {
        return new CrearPtoductoResponse();
    }

    /**
     * Create an instance of {@link CrearPtoducto }
     * 
     */
    public CrearPtoducto createCrearPtoducto() {
        return new CrearPtoducto();
    }

    /**
     * Create an instance of {@link BuscaProducto }
     * 
     */
    public BuscaProducto createBuscaProducto() {
        return new BuscaProducto();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link BuscaProductoResponse }
     * 
     */
    public BuscaProductoResponse createBuscaProductoResponse() {
        return new BuscaProductoResponse();
    }

    /**
     * Create an instance of {@link BuscarProducto }
     * 
     */
    public BuscarProducto createBuscarProducto() {
        return new BuscarProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "crearProveedorResponse")
    public JAXBElement<CrearProveedorResponse> createCrearProveedorResponse(CrearProveedorResponse value) {
        return new JAXBElement<CrearProveedorResponse>(_CrearProveedorResponse_QNAME, CrearProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPtoductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "crearPtoductoResponse")
    public JAXBElement<CrearPtoductoResponse> createCrearPtoductoResponse(CrearPtoductoResponse value) {
        return new JAXBElement<CrearPtoductoResponse>(_CrearPtoductoResponse_QNAME, CrearPtoductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "crearProveedor")
    public JAXBElement<CrearProveedor> createCrearProveedor(CrearProveedor value) {
        return new JAXBElement<CrearProveedor>(_CrearProveedor_QNAME, CrearProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "buscarProductoResponse")
    public JAXBElement<BuscarProductoResponse> createBuscarProductoResponse(BuscarProductoResponse value) {
        return new JAXBElement<BuscarProductoResponse>(_BuscarProductoResponse_QNAME, BuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "buscaProducto")
    public JAXBElement<BuscaProducto> createBuscaProducto(BuscaProducto value) {
        return new JAXBElement<BuscaProducto>(_BuscaProducto_QNAME, BuscaProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "buscaProductoResponse")
    public JAXBElement<BuscaProductoResponse> createBuscaProductoResponse(BuscaProductoResponse value) {
        return new JAXBElement<BuscaProductoResponse>(_BuscaProductoResponse_QNAME, BuscaProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "buscarProducto")
    public JAXBElement<BuscarProducto> createBuscarProducto(BuscarProducto value) {
        return new JAXBElement<BuscarProducto>(_BuscarProducto_QNAME, BuscarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPtoducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ExamenProveedor1JEE.ups.edu.ec/", name = "crearPtoducto")
    public JAXBElement<CrearPtoducto> createCrearPtoducto(CrearPtoducto value) {
        return new JAXBElement<CrearPtoducto>(_CrearPtoducto_QNAME, CrearPtoducto.class, null, value);
    }

}
