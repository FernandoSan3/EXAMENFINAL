package ec.edu.ups.ExamenProveedor2JEE.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedor", schema ="public")
public class Proveedor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "proveedor_id")
	private int proveedor_id;
	
	@Column(name= "nombre")
	private String nombre;
	
	@OneToOne
	@JoinColumn(name = "producto_id")
	private  Producto producto;

	public int getProveedor_id() {
		return proveedor_id;
	}

	public void setProveedor_id(int proveedor_id) {
		this.proveedor_id = proveedor_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Proveedor [proveedor_id=" + proveedor_id + ", nombre=" + nombre + ", producto=" + producto + "]";
	}
	
	
	

}

