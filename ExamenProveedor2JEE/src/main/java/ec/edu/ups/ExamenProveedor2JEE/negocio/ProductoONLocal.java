package ec.edu.ups.ExamenProveedor2JEE.negocio;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.ExamenProveedor2JEE.modelo.Producto;
import ec.edu.ups.ExamenProveedor2JEE.modelo.Proveedor;



@Local
public interface ProductoONLocal {

	public boolean ingresoProducto(Producto entity) throws Exception ;
	public List<Producto> getProductos();
	public boolean updateProducto(Producto entity) throws Exception;
	public boolean ingresoProveedor(Proveedor entity) throws Exception;
	public List<Proveedor> getProveedor();
	public Producto leerProducto(String nombre) throws Exception;
	
}
