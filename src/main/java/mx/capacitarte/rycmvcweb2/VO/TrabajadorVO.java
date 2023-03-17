package mx.capacitarte.rycmvcweb2.VO;

import java.io.Serializable;

public class TrabajadorVO  implements Serializable {
	
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
	private boolean estatusEmpleado;
	private String usuarioRegistro;
	
	
	
	public TrabajadorVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TrabajadorVO(int numeroEmpleado, String nombreEmpleado, String apellidosEmpleado, String fechaIngreso,
			int diasTrabajados, double salarioTotal, boolean estatusEmpleado, String usuarioRegistro) {
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



	public boolean isEstatusEmpleado() {
		return estatusEmpleado;
	}



	public void setEstatusEmpleado(boolean estatusEmpleado) {
		this.estatusEmpleado = estatusEmpleado;
	}



	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}



	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
	
	
	
	
}
