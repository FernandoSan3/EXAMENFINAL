package ec.edu.ups.ExamenFerreteriaJEE.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.ExamenFerreteriaJEE.modelo.Proveedor;
import ec.edu.ups.ExamenFerreteriaJEE.modelo.Solicitud;

@Stateless
public class SolicitudDAO {

	
	@Inject
	private Connection con;

	@Inject
	private EntityManager em;
	
	
	/**
	 * Metodo para crear un Solicitud utilizando JPA
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public boolean insertSolicitud(Solicitud entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	
	/**
	 * Metodo para buscar un Solicitud mediante la proveedor_id con JPA
	 * 
	 * @param proveedor_id
	 * @return
	 * @throws SQLException
	 */
	public Solicitud readSolicitud(int proveedor_id) throws SQLException {
		Solicitud solicitud = em.find(Solicitud.class, proveedor_id);
		return solicitud;
	}
	
	/**
	 * Metodo para actualizar un Solicitud con JPA
	 * 
	 * @param producto
	 * @return
	 * @throws SQLException
	 */
	public boolean updateSolicitud(Solicitud proveedor) throws SQLException {
		em.merge(proveedor);
		return true;
	}

	/**
	 * Metodo para eliminar un Solicitud mediante el nombre
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteSolicitudr(String nombre) throws SQLException {
		em.remove(nombre);
		return true;
	}
	
	/**
	 * Metodo para buscar un max mediante el producto_id  de Solicitud con JPA
	 * 
	 * @param 
	 * @return
	 * @throws SQLException
	 */
	public int contarSolicitud() throws SQLException {
		int s;
		String sql = "SELECT MAX (solicitud_id) FROM Solicitud";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		res.next();
		s = res.getInt(1) + 1;
		ps.execute();
		ps.close();
		return s;
	}
}
