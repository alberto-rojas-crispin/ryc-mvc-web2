package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class EliminarProductoBeanResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean EstatusEliminacion;
	private Integer idProducto;

	public EliminarProductoBeanResponse() {
		super();
	}
	

	public EliminarProductoBeanResponse(Boolean estatusAct, Integer idProducto) {
		super();
		this.EstatusEliminacion = estatusAct;
		this.idProducto = idProducto;
	}


	public Boolean getEstatusEliminacion() {
		return EstatusEliminacion;
	}

	public void setEstatusEliminacion(Boolean EstatusEliminacion) {
		this.EstatusEliminacion = EstatusEliminacion;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

}

