package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ConsultarPrecioBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PrecioBean> productos; 
	private Integer idProducto;
	private String descProducto;
    private Date fechaInicio;
	public ConsultarPrecioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<PrecioBean> getProductos() {
		return productos;
	}
	public void setProductos(List<PrecioBean> productos) {
		this.productos = productos;
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
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	
	

}
