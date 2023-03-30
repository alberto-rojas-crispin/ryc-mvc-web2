package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ConsultarInventarioBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
	private Integer idProducto; 
	private Date caducidadProducto;
	private List<InventarioBean> inventariosBeanList;
	public ConsultarInventarioBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNumeroFolio() {
		return numeroFolio;
	}
	public void setNumeroFolio(Integer numeroFolio) {
		this.numeroFolio = numeroFolio;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Date getCaducidadProducto() {
		return caducidadProducto;
	}
	public void setCaducidadProducto(Date caducidadProducto) {
		this.caducidadProducto = caducidadProducto;
	}
	public List<InventarioBean> getInventariosBeanList() {
		return inventariosBeanList;
	}
	public void setInventariosBeanList(List<InventarioBean> inventariosBeanList) {
		this.inventariosBeanList = inventariosBeanList;
	}
	
	
	
	
	
}
