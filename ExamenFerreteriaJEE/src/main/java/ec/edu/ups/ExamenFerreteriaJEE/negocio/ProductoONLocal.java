package ec.edu.ups.ExamenFerreteriaJEE.negocio;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.ExamenFerreteriaJEE.modelo.Producto;
import ec.edu.ups.ExamenFerreteriaJEE.modelo.Proveedor;



@Local
public interface ProductoONLocal {

	public boolean ingresoProducto(Producto entity) throws Exception ;
	public List<Producto> getProductos();
	public boolean updateProducto(Producto entity) throws Exception;
	public boolean ingresoProveedor(Proveedor entity) throws Exception;
	public List<Proveedor> getProveedor();
	public Producto leerProducto(String nombre) throws Exception;
	
}
