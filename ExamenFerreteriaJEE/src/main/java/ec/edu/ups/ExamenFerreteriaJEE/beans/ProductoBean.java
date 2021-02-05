package ec.edu.ups.ExamenFerreteriaJEE.beans;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.ExamenFerreteriaJEE.DAO.ProductoDAO;
import ec.edu.ups.ExamenFerreteriaJEE.modelo.Producto;

@ManagedBean
@ViewScoped
public class ProductoBean {

	private Producto producto = new Producto();
	
	private List<Producto> listaProducto = new ArrayList<>();
	
	@Inject 
	private ProductoDAO productoDAO;
	
	@PostConstruct
	public void init() {
		
		
	}
	
	
	
	private void registrarProducto() throws SQLException {
		int idProducto = productoDAO.contarProducto();
		producto.setProducto_id(idProducto);
		productoDAO.insertProducto(producto);
		producto = null;
		
	}
	
	private void actualizarProducto(Producto product) throws SQLException {
		
		
		productoDAO.updateProducto(product);
		producto = null;
		
	}
	
	private void listaProducto(String nombre) {
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
