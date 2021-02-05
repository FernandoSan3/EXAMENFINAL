package cliente.ec.edu.ups.ExamenFerreteriaJEE;

import java.awt.EventQueue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.xml.namespace.QName;

import ec.edu.ups.ExamenFerreteriaJEE.DAO.ProductoDAO;
import ec.edu.ups.ExamenFerreteriaJEE.modelo.Producto;
@ManagedBean
@ViewScoped
public class ProductBean {

	private Producto producto = new Producto();
	
	private List<Producto> listaProducto = new ArrayList<>();
	
	
	@Inject 
	private ProductoDAO productoDAO;
	

	static ClienteServiceSOAPService ss;
	static ClienteServiceSOAP port;

	
    public static final QName SERVICE_NAME = new QName("http://service.ExamenProveedor1JEE.ups.edu.ec/", "ClienteServiceSOAPService");
	
	
public static void main(String args[]) throws java.lang.Exception {
		
		URL wsdlURL = ClienteServiceSOAPService.WSDL_LOCATION;
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

		ss = new ClienteServiceSOAPService(wsdlURL, SERVICE_NAME);
		port = ss.getClienteServiceSOAPPort(); 
}

	@PostConstruct
	public void init() {
		
	}
	
	public void leerProducto() throws Exception_Exception {
		
	        System.out.println("Invoking buscarProducto...");
	        String nombre = producto.getNombre();
	        java.lang.String _buscarProducto_arg0 = nombre;
	        System.out.println(producto.getNombre());
	      
	        	System.out.println("LLEEGA");
	            cliente.ec.edu.ups.ExamenFerreteriaJEE.Producto _buscarProducto__return = port.buscarProducto(_buscarProducto_arg0);
	            producto.setNombre(_buscarProducto__return.nombre);
	            producto.setStock(_buscarProducto__return.stock);
	         
	           

	}
	
	public void leerProduct() {

        System.out.println("Invoking buscarProducto...");
        String nombre = producto.getNombre();
        System.out.println(nombre);
        
	}
	
	
	
	public void registrarProducto() throws SQLException {
		int idProducto = productoDAO.contarProducto();
		producto.setProducto_id(idProducto);
		productoDAO.insertProducto(producto);
		producto = null;
		
	}
	
	public void actualizarProducto(Producto product) throws SQLException {
		
		
		productoDAO.updateProducto(product);
		producto = null;
		
	}
	
	public void listaProducto(String nombre) {
		listaProducto = productoDAO.getListNombre(nombre);

	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "ProductoBean [productoDAO=" + productoDAO + "]";
	}
	
	
}
