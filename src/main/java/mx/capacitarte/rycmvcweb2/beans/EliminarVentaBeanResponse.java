package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarVentaBeanResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
	private String estatusEliminar;
	public EliminarVentaBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNumeroFolio() {
		return numeroFolio;
	}
	public void setNumeroFolio(Integer numeroFolio) {
		this.numeroFolio = numeroFolio;
	}
	public String getEstatusEliminar() {
		return estatusEliminar;
	}
	public void setEstatusEliminar(String estatusEliminar) {
		this.estatusEliminar = estatusEliminar;
	}
	
	

}
