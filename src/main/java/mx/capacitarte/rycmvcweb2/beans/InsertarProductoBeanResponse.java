package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class InsertarProductoBeanResponse implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer idProducto;
	private Boolean estatusInsercion;

	public InsertarProductoBeanResponse() {
		super();
	}

	

	public Integer getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}



	public Boolean getEstatusInsercion() {
		return estatusInsercion;
	}

	public void setEstatusInsercion(Boolean estatusInsercion) {
		this.estatusInsercion = estatusInsercion;
	}

}
