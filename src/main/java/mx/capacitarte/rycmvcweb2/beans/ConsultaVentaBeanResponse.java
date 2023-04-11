package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.List;

public class ConsultaVentaBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<VentaBean> ventas;
	private Integer idProducto;
	private String vigencia;
	public ConsultaVentaBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<VentaBean> getVentas() {
		return ventas;
	}
	public void setVentas(List<VentaBean> ventas) {
		this.ventas = ventas;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getVigencia() {
		return vigencia;
	}
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	
}
