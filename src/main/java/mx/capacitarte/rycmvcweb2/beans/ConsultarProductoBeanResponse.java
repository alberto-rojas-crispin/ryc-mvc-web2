package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.List;

public class ConsultarProductoBeanResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ProductoBean> productos; 
	private Integer idProducto;
	private String descProducto;

	public ConsultarProductoBeanResponse() {
		super();
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

	public List<ProductoBean> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoBean> productos) {
		this.productos = productos;
	}
	

}
