package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ConsultarTrabajadoresResponse implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroEmpleado;
	private String nombreEmpleado;
	private String apellidosEmpleado;
	private String fechaIngreso;
	private int diasTrabajados;
	private double salarioTotal;
	private String estatusEmpleado;
	private String usuarioRegistro;
	public ConsultarTrabajadoresResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsultarTrabajadoresResponse(int numeroEmpleado, String nombreEmpleado, String apellidosEmpleado,
			String fechaIngreso, int diasTrabajados, double salarioTotal, String estatusEmpleado,
			String usuarioRegistro) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidosEmpleado = apellidosEmpleado;
		this.fechaIngreso = fechaIngreso;
		this.diasTrabajados = diasTrabajados;
		this.salarioTotal = salarioTotal;
		this.estatusEmpleado = estatusEmpleado;
		this.usuarioRegistro = usuarioRegistro;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
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
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getDiasTrabajados() {
		return diasTrabajados;
	}
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	public double getSalarioTotal() {
		return salarioTotal;
	}
	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	public String getEstatusEmpleado() {
		return estatusEmpleado;
	}
	public void setEstatusEmpleado(String estatusEmpleado) {
		this.estatusEmpleado = estatusEmpleado;
	}
	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
	
	
	

}
