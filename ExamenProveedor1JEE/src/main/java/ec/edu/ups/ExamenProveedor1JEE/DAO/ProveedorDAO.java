package ec.edu.ups.ExamenProveedor1JEE.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.ExamenProveedor1JEE.modelo.Proveedor;

public class ProveedorDAO {

	@Inject
	private Connection con;

	@Inject
	private EntityManager em;
	
	
	/**
	 * Metodo para crear un Proveedor utilizando JPA
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public boolean insertProveedor(Proveedor entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	
	/**
	 * Metodo para buscar un Proveedor mediante la proveedor_id con JPA
	 * 
	 * @param proveedor_id
	 * @return
	 * @throws SQLException
	 */
	public Proveedor readProveedor(int proveedor_id) throws SQLException {
		Proveedor proveedor = em.find(Proveedor.class, proveedor_id);
		return proveedor;
	}
	
	/**
	 * Metodo para actualizar un Proveedor con JPA
	 * 
	 * @param producto
	 * @return
	 * @throws SQLException
	 */
	public boolean updateProveedor(Proveedor proveedor) throws SQLException {
		em.merge(proveedor);
		return true;
	}

	/**
	 * Metodo para eliminar un Proveedor mediante el nombre
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteProveedor(String nombre) throws SQLException {
		em.remove(buscarNombreP(nombre));
		return true;
	}
	
	/**
	 * Metodo para buscar un Proveedor mediante la nombre con JPA
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public Proveedor buscarNombreP(String nombre) {

		Proveedor proveedor = new Proveedor();
		String sql = "SELECT * FROM Proveedor WHERE nombre=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nombre);
			ResultSet res = ps.executeQuery();
			res.next();
			proveedor.setProveedor_id(res.getInt("proveedor_id"));
			proveedor.setNombre(res.getString("nombre"));
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error al buscar el Producto por la Nombre " + e.getMessage());
		}
		return proveedor;
	}
	
	/**
	 * Metodo para buscar un max mediante el producto_id  de Producto con JPA
	 * 
	 * @param 
	 * @return
	 * @throws SQLException
	 */
	public int contarProveedor() throws SQLException {
		int s;
		String sql = "SELECT MAX (proveedor_id) FROM Proveedor";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		res.next();
		s = res.getInt(1) + 1;
		ps.execute();
		ps.close();
		return s;
	}
	
	public List<Proveedor> getListProveedor(){
		String jpdl = "SELECT p FROM Proveedor p ";
		
		Query q = em.createQuery(jpdl, Proveedor.class);
		List<Proveedor> aux = (List<Proveedor>) q.getResultList();
		return aux;
	}
	
	public List<Proveedor> getListNombreProveedor(String nombre){
		String jpdl = "SELECT p FROM Proveedor p WHERE nombre LIKE ?1";
		
		Query q = em.createQuery(jpdl, Proveedor.class);
		q.setParameter(1, nombre);
		List<Proveedor> aux = (List<Proveedor>) q.getResultList();
		return aux;
	}
}
