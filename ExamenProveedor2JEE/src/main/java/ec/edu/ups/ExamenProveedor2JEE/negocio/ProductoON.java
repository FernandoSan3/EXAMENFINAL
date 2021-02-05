package ec.edu.ups.ExamenProveedor2JEE.negocio;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import ec.edu.ups.ExamenProveedor2JEE.DAO.ProductoDAO;
import ec.edu.ups.ExamenProveedor2JEE.DAO.ProveedorDAO;
import ec.edu.ups.ExamenProveedor2JEE.modelo.Producto;
import ec.edu.ups.ExamenProveedor2JEE.modelo.Proveedor;


public class ProductoON  implements ProductoONLocal{

	@Inject
	private ProveedorDAO proveedorDAO;
	
	@Inject
	private ProductoDAO productoDAO;
	
	
	
	public boolean ingresoProducto(Producto entity) throws Exception {
		if (entity == null)
			throw new Exception("Error en el Objeto Producto Ingresar");
		try {
			entity.setProducto_id(productoDAO.contarProducto());
			productoDAO.insertProducto(entity);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al Ingresar Producto");
		}
		return true;
	}
	
	
	public Producto leerProducto(String nombre) throws Exception {
		Producto producto = productoDAO.buscarNombreP(nombre);
		return producto;
	}
	
	public List<Producto> getProductos() {
		return productoDAO.getList();
	}
	
	public boolean updateProducto(Producto entity) throws Exception {
		if (entity == null)
			throw new Exception("Error en el Objeto Producto Actualizar");
		try {
			
			productoDAO.updateProducto(entity);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al Actualizar Producto");
		}
		return true;
	}
	
	public boolean ingresoProveedor(Proveedor entity) throws Exception {
		//Producto producto = new Producto();
		if (entity == null)
			throw new Exception("Error en el Objeto Producto Ingresar");
		try {
			entity.setProveedor_id(proveedorDAO.contarProveedor());
			//producto = productoDAO.buscarNombreP(entity.getProducto().getNombre());
			//entity.setProducto(producto);
			proveedorDAO.insertProveedor(entity);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al Ingresar Producto");
		}
		return true;
	}
	
	public List<Proveedor> getProveedor() {
		return proveedorDAO.getListProveedor();
	}




	
	
}
