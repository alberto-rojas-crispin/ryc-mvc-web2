package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class InsertarTrabajadorBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroEmpleado;
	private String estatusAgregar;
	public InsertarTrabajadorBeanResponse(Integer numeroEmpleado, String estatusAgregar) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.estatusAgregar = estatusAgregar;
	}
	public InsertarTrabajadorBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(Integer numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getEstatusAgregar() {
		return estatusAgregar;
	}
	public void setEstatusAgregar(String estatusAgregar) {
		this.estatusAgregar = estatusAgregar;
	}
	@Override
	public String toString() {
		return "InsertarTrabajadorBeanResponse [numeroEmpleado=" + numeroEmpleado + ", estatusAgregar=" + estatusAgregar
				+ "]";
	}
	
	
}
