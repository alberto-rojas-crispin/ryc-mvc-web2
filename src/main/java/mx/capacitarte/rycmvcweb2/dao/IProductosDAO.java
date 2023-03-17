package mx.capacitarte.rycmvcweb2.dao;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;

public interface IProductosDAO {

	public List<ProductoVO> consultarProductos();
	
	public Integer agregarProducto(ProductoVO productoVO);
	
	public Boolean eliminarProducto(Integer idProducto);
	
	public List<ProductoVO> buscarProductoPorId(Integer idProducto);
	
	public List<ProductoVO> consultarPorNombreYId(Integer idProducto, String descProducto);
	
	public Boolean actualizarProducto(Integer idProducto, String codigoBarra, String descProducto);
}
