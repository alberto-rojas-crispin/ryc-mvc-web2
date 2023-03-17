package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarTrabajadorBeanResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroEmpleado;
	private String estatusEmpleado;
	
	
	
	public EliminarTrabajadorBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EliminarTrabajadorBeanResponse(Integer numeroEmpleado, String estatusEmpleado) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.estatusEmpleado = estatusEmpleado;
	}
	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(Integer numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getEstatusEmpleado() {
		return estatusEmpleado;
	}
	public void setEstatusEmpleado(String estatusEmpleado) {
		this.estatusEmpleado = estatusEmpleado;
	}
	
	

}
