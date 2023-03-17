package mx.capacitarte.rycmvcweb2.VO;

import java.io.Serializable;

public class ProfesorVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String edad;
	private String fechaRegistro;



	public ProfesorVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfesorVO(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String edad,
			String fechaRegistro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
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

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String arrProfesor) {
		this.edad = arrProfesor;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
