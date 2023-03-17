package mx.capacitarte.rycmvcweb2.service;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;

public interface IProductosService {
	
	public List<ProductoVO> consultarProducto();
	
	public Integer agregarProducto(ProductoVO productoVO);
	
	public Boolean eliminarProducto(Integer idProducto);
	
	public List<ProductoVO> buscarProductoPorId(Integer idProducto);
	
	public List<ProductoVO> consultarPorNombreYId(Integer idProducto, String descProducto);
	
	public Boolean actualizarProducto(ProductoVO productoVO);
	
	//public Boolean actualizarProducto(Integer idProducto, String codigoBarra, String descProducto);
	
	

}
