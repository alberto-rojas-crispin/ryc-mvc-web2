package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarPrecioBeanResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idPrecio;
	private Integer idProducto;
	private String estatusEliminacion;
	public EliminarPrecioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
	}
	public String getEstatusEliminacion() {
		return estatusEliminacion;
	}
	public void setEstatusEliminacion(String estatusEliminacion) {
		this.estatusEliminacion = estatusEliminacion;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	

}
