package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class AlumnoBean  implements Serializable{
//
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String apellido; 
	private String fechaRegistro;
	
	public AlumnoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoBean(int id, String nombre, String apellido, String fechaRegistro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaRegistro = fechaRegistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	

}

	


