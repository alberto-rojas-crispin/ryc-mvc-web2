package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarProductoBeanRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idProducto;

	public EliminarProductoBeanRequest() {
		super();
	}
	

	public EliminarProductoBeanRequest( Integer idProducto) {
		super();
		this.idProducto = idProducto;
	}


	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

}

