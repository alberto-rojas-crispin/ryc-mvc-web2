package mx.capacitarte.rycmvcweb2.VO;

import java.io.Serializable;
import java.util.Date;

public class PrecioVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idPrecio;
	private Integer idProducto;
	private String descProducto;
	private Date fechaInicio;
	private double precioUnitario;
	private Boolean vigencia;
	private String fechaCreacion;
	private String usuarioCreacion;
	private String fechaActualizacion;
	private String usuarioActualizacion;
	private String fechaVenta;
	
	public PrecioVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrecioVO(Integer idPrecio, Integer idProducto, String descProducto,Date fechaInicio, double precioUnitario, Boolean vigencia,
			String fechaCreacion, String usuarioCreacion, String fechaActualizacion, String usuarioActualizacion, String fechaVenta) {
		super();
		this.idPrecio = idPrecio;
		this.idProducto = idProducto;
		this.descProducto = descProducto;
		this.fechaInicio = fechaInicio;
		this.precioUnitario = precioUnitario;
		this.vigencia = vigencia;
		this.fechaCreacion = fechaCreacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.fechaVenta = fechaVenta;

	}
	public Integer getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(Integer idPrecio) {
		this.idPrecio = idPrecio;
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
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
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
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
		
	
}

