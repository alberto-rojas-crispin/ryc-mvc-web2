package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ActualizarProductoBeanRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idProducto;
	private String codigoBarra;
	private String descProducto;

	public ActualizarProductoBeanRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActualizarProductoBeanRequest(Integer idProducto, String codigoBarra, String descProducto) {
		super();
		this.idProducto = idProducto;
		this.codigoBarra = codigoBarra;
		this.descProducto = descProducto;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

}
