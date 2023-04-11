package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ActualizarVentaBeanResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
	private Integer idProducto;
	private String estatusActualizar;
	public ActualizarVentaBeanResponse() {
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
	public String getEstatusActualizar() {
		return estatusActualizar;
	}
	public void setEstatusActualizar(String estatusActualizar) {
		this.estatusActualizar = estatusActualizar;
	}
	
			
}
