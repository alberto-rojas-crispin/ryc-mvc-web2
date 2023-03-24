package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ActualizarPrecioBeanResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idPrecio;
	private Integer idProducto;
	private String estatusActualizar;
	
	
	
	public ActualizarPrecioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
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
	public Integer getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
	}

}
