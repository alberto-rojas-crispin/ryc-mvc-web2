package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class InsertarPrecioBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idPrecio;
	private Integer idProducto;
	private String estatusAgregar;
	
	
	
	public InsertarPrecioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getEstatusAgregar() {
		return estatusAgregar;
	}
	public void setEstatusAgregar(String estatusAgregar) {
		this.estatusAgregar = estatusAgregar;
	}
	public Integer getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
	}
	
	

}
