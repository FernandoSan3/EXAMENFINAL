package ec.edu.ups.ExamenProveedor2JEE.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.ExamenProveedor2JEE.modelo.Producto;
import ec.edu.ups.ExamenProveedor2JEE.modelo.Proveedor;
import ec.edu.ups.ExamenProveedor2JEE.negocio.ProductoONLocal;


@WebService
public class ClienteServiceSOAP {
	
	@Inject
	private ProductoONLocal productoONLocal;
	
	
	private Producto producto = new Producto();

	@WebMethod
	public Producto buscarProducto(String nombre) throws Exception {
		Producto producto = new Producto();
		
		try {
			producto = productoONLocal.leerProducto(nombre);
			return producto;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			producto = null;
			return producto;
		}
		
	}
	
	@WebMethod
	public String crearPtoducto(String nombre, int stock) throws Exception {
		Producto producto = new Producto();
		
		
		producto.setNombre(nombre);
		producto.setStock(stock);
		productoONLocal.ingresoProducto(producto);
		return "OK";
	}
	
	@WebMethod
	public String crearProveedor(String nombre, int cuentaid) throws Exception {
		Proveedor proveedor = new Proveedor();
		proveedor.setNombre(nombre);
		producto.setProducto_id(cuentaid);
		proveedor.setProducto(producto);
		productoONLocal.ingresoProveedor(proveedor);
		return "OK";
	}
	
	@WebMethod
	public Producto buscaProducto( String nombreProducto) throws Exception {
		Producto producto = new Producto();
		
		

		producto = productoONLocal.leerProducto(nombreProducto);

		return producto;
	}
	

}
