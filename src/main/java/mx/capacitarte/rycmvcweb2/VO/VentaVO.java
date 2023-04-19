package mx.capacitarte.rycmvcweb2.VO;

import java.io.Serializable;

public class VentaVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    

	private Integer numeroFolio;
	private Integer idProducto;
	private String descProducto;
	private int cantidad;
	private Integer idTipoUnidad;
	private String descTipoUnidad;
	private int idPrecio;
	private Double precioTotal;
	private Boolean vigencia;
	private String fechaCreacion;
	private String usuarioCreacion;
	private String fechaActualizacion;
	private String usuarioActualizacion;
	public VentaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VentaVO(Integer numeroFolio, Integer idProducto, String descProducto, int cantidad, Integer idTipoUnidad, String descTipoUnidad, int idPrecio,
			Double precioTotal, Boolean vigencia, String fechaCreacion, String usuarioCreacion,
			String fechaActualizacion, String usuarioActualizacion) {
		super();
		this.numeroFolio = numeroFolio;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.idTipoUnidad = idTipoUnidad;
		this.idPrecio = idPrecio;
		this.precioTotal = precioTotal;
		this.vigencia = vigencia;
		this.fechaCreacion = fechaCreacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
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
	public Integer getIdTipoUnidad() {
		return idTipoUnidad;
	}
	public void setIdTipoUnidad(Integer idTipoUnidad) {
		this.idTipoUnidad = idTipoUnidad;
	}
	
	public String getDescTipoUnidad() {
		return descTipoUnidad;
	}
	public void setDescTipoUnidad(String descTipoUnidad) {
		this.descTipoUnidad = descTipoUnidad;
	}
	public int getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Boolean getVigencia() {
		return vigencia;
	}
	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
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
	public String getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	
	
	
}
