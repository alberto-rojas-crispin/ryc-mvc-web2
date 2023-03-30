package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.Date;

public class InventarioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroFolio;
	private Integer idProducto;
	private int cantidad;
	private Integer idTipoUnidad;
	private Date caducidadProducto;
	private Double costoUnitario;
	private Double costoTotal;
	private int idPrecio;
	private int tipoMovimiento;
	private Boolean vigencia;
	private String fechaAprobacion;
	private String usuarioAprobacion;
	private String fechaCreacion;
	private String usuarioCreacion;
	private String fechaActualizacion;
	private String usuarioActualizacion;
	public InventarioBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InventarioBean(Integer numeroFolio, Integer idProducto, int cantidad, Integer idTipoUnidad,
			Date caducidadProducto, Double costoUnitario, Double costoTotal, int idPrecio, int tipoMovimiento,
			Boolean vigencia, String fechaAprobacion, String usuarioAprobacion, String fechaCreacion,
			String usuarioCreacion, String fechaActualizacion, String usuarioActualizacion) {
		super();
		this.numeroFolio = numeroFolio;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.idTipoUnidad = idTipoUnidad;
		this.caducidadProducto = caducidadProducto;
		this.costoUnitario = costoUnitario;
		this.costoTotal = costoTotal;
		this.idPrecio = idPrecio;
		this.tipoMovimiento = tipoMovimiento;
		this.vigencia = vigencia;
		this.fechaAprobacion = fechaAprobacion;
		this.usuarioAprobacion = usuarioAprobacion;
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
	public Date getCaducidadProducto() {
		return caducidadProducto;
	}
	public void setCaducidadProducto(Date caducidadProducto) {
		this.caducidadProducto = caducidadProducto;
	}
	public Double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	public Double getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(Double costoTotal) {
		this.costoTotal = costoTotal;
	}
	public int getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}
	public int getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(int tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public Boolean getVigencia() {
		return vigencia;
	}
	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
	}
	public String getFechaAprobacion() {
		return fechaAprobacion;
	}
	public void setFechaAprobacion(String fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}
	public String getUsuarioAprobacion() {
		return usuarioAprobacion;
	}
	public void setUsuarioAprobacion(String usuarioAprobacion) {
		this.usuarioAprobacion = usuarioAprobacion;
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
