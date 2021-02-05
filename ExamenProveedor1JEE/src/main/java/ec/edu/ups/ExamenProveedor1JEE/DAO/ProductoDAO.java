package ec.edu.ups.ExamenProveedor1JEE.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.ExamenProveedor1JEE.modelo.Producto;


@Stateless
public class ProductoDAO {

	@Inject
	private Connection con;

	@Inject
	private EntityManager em;
	
	/**
	 * Metodo para crear un Producto utilizando JPA
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public boolean insertProducto(Producto entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	
	/**
	 * Metodo para buscar un Producto mediante la producto_id con JPA
	 * 
	 * @param producto_id
	 * @return
	 * @throws SQLException
	 */
	public Producto readProducto(int producto_id) throws SQLException {
		Producto producto = em.find(Producto.class, producto_id);
		return producto;
	}
	
	/**
	 * Metodo para actualizar un Producto con JPA
	 * 
	 * @param producto
	 * @return
	 * @throws SQLException
	 */
	public boolean updateProducto(Producto producto) throws SQLException {
		em.merge(producto);
		return true;
	}

	/**
	 * Metodo para eliminar un Producto mediante el nombre
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteProducto(String nombre) throws SQLException {
		em.remove(buscarNombreP(nombre));
		return true;
	}
	
	/**
	 * Metodo para buscar un Producto mediante la nombre con JPA
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public Producto buscarNombreP(String nombre) {

		Producto producto = new Producto();
		String sql = "SELECT * FROM Producto WHERE nombre=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nombre);
			ResultSet res = ps.executeQuery();
			res.next();
			producto.setProducto_id(res.getInt("producto_id"));
			producto.setNombre(res.getString("nombre"));
			producto.setStock(res.getInt("stock"));
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error al buscar el Producto por la Nombre " + e.getMessage());
		}
		return producto;
	}
	
	/**
	 * Metodo para buscar un max mediante el producto_id  de Producto con JPA
	 * 
	 * @param 
	 * @return
	 * @throws SQLException
	 */
	public int contarProducto() throws SQLException {
		int s;
		String sql = "SELECT MAX (producto_id) FROM Producto";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		res.next();
		s = res.getInt(1) + 1;
		ps.execute();
		ps.close();
		return s;
	}
	
	public List<Producto> getList(){
		String jpdl = "SELECT p FROM Producto p ";
		
		Query q = em.createQuery(jpdl, Producto.class);
		List<Producto> aux = (List<Producto>) q.getResultList();
		return aux;
	}
	
	public List<Producto> getListNombre(String nombre){
		String jpdl = "SELECT p FROM Producto p WHERE nombre LIKE ?1";
		
		Query q = em.createQuery(jpdl, Producto.class);
		q.setParameter(1, nombre);
		List<Producto> aux = (List<Producto>) q.getResultList();
		return aux;
	}
}
