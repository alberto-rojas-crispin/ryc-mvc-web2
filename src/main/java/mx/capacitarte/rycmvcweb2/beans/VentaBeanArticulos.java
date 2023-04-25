package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class VentaBeanArticulos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
 	private Double precioTotal;
	private String fechaCreacion;
	private String usuarioCreacion;
	public VentaBeanArticulos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VentaBeanArticulos(Integer numeroFolio, Double precioTotal, String fechaCreacion, String usuarioCreacion) {
		super();
		this.numeroFolio = numeroFolio;
		this.precioTotal = precioTotal;
		this.fechaCreacion = fechaCreacion;
		this.usuarioCreacion = usuarioCreacion;
	}
	public Integer getNumeroFolio() {
		return numeroFolio;
	}
	public void setNumeroFolio(Integer numeroFolio) {
		this.numeroFolio = numeroFolio;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	

}
