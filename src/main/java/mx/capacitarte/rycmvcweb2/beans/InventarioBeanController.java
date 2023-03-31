package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class InventarioBeanController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idProducto;

	private String descProducto;

	private int cantidad;

	
	public InventarioBeanController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public InventarioBeanController(Integer idProducto, String descProducto, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.descProducto = descProducto;
		this.cantidad = cantidad;
	}


	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
