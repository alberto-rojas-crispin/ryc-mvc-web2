package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ActualizarProductoBeanResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean estatusAct;
	private Integer idProducto;

	public ActualizarProductoBeanResponse() {
		super();
	}

	public Boolean getEstatusAct() {
		return estatusAct;
	}

	public void setEstatusAct(Boolean estatusAct) {
		this.estatusAct = estatusAct;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

}
