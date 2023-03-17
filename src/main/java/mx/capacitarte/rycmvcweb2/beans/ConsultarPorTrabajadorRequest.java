package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.List;

public class ConsultarPorTrabajadorRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroEmpleado;
	private String nombreEmpleado;
	private String apellidosEmpleado;
	public ConsultarPorTrabajadorRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsultarPorTrabajadorRequest(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidosEmpleado = apellidosEmpleado;
	}
	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(Integer numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getApellidosEmpleado() {
		return apellidosEmpleado;
	}
	public void setApellidosEmpleado(String apellidosEmpleado) {
		this.apellidosEmpleado = apellidosEmpleado;
	}
	

}
