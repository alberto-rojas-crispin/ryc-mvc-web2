package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarInventarioBeanResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
	private String estatusActualizar;
	public EliminarInventarioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNumeroFolio() {
		return numeroFolio;
	}
	public void setNumeroFolio(Integer numeroFolio) {
		this.numeroFolio = numeroFolio;
	}
	public String getEstatusActualizar() {
		return estatusActualizar;
	}
	public void setEstatusActualizar(String estatusActualizar) {
		this.estatusActualizar = estatusActualizar;
	}
	
	

}
