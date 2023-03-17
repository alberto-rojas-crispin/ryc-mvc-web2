package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ProductoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idProducto;
	private String descProducto;
	private Integer idCategoria;
	private String descCategoria;
	private Integer idTipoUnidad;
	private String descTipoUnidad;
	private String codigoBarra;

	public ProductoBean(Integer idProducto, String descProducto, Integer idCategoria, String descCategoria,
			Integer idTipoUnidad, String descTipoUnidad, String codigoBarra) {
		super();
		this.idProducto = idProducto;
		this.descProducto = descProducto;
		this.idCategoria = idCategoria;
		this.descCategoria = descCategoria;
		this.idTipoUnidad = idTipoUnidad;
		this.descTipoUnidad = descTipoUnidad;
		this.codigoBarra = codigoBarra;
	}

	public ProductoBean() {
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

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescCategoria() {
		return descCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
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

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

}
