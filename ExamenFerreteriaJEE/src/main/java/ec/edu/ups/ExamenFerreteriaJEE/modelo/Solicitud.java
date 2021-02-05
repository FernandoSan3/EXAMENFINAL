package ec.edu.ups.ExamenFerreteriaJEE.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Solicitud", schema ="public")
public class Solicitud implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "proveedor_id")
	private int solicitud_id;
	
	@Column(name= "unidades")
	private int unidades;

	
	
	public int getSolicitud_id() {
		return solicitud_id;
	}



	public void setSolicitud_id(int solicitud_id) {
		this.solicitud_id = solicitud_id;
	}



	public int getUnidades() {
		return unidades;
	}



	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}



	@Override
	public String toString() {
		return "Solicitud [solicitud_id=" + solicitud_id + ", unidades=" + unidades + "]";
	}
	
	
	
}
