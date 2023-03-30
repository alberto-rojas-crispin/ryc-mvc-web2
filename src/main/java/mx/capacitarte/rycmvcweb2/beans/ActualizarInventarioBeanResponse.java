package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ActualizarInventarioBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
	private Integer idProducto;
	private String estatusActualizacion;
	public ActualizarInventarioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNumeroFolio() {
		return numeroFolio;
	}
	public void setNumeroFolio(Integer numeroFolio) {
		this.numeroFolio = numeroFolio;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getEstatusActualizacion() {
		return estatusActualizacion;
	}
	public void setEstatusActualizacion(String estatusActualizacion) {
		this.estatusActualizacion = estatusActualizacion;
	}



}
