package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarTrabajadorBeanRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer numeroEmpleado;

	public EliminarTrabajadorBeanRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EliminarTrabajadorBeanRequest(Integer numeroEmpleado) {
		super();
		this.numeroEmpleado = numeroEmpleado;
	}

	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(Integer numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	

}
