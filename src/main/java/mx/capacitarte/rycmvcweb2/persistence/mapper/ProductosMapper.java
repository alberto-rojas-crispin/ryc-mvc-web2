package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;

@Mapper
public interface ProductosMapper {
	
	public Integer consultarIdGenerado();
	
	public List<ProductoVO> consultarProducto();
	
	public Integer agregarProducto(ProductoVO productoVO);
	
	public Boolean eliminarProducto(Integer idProducto);
	
	public List<ProductoVO> buscarProductoPorId(Integer idProducto);
	
	public List<ProductoVO> consultarPorNombreYId(Integer idProducto, String descProducto);
	
	public Boolean actualizarProducto(ProductoVO productoVO);
	
	//public Boolean actualizarProducto(Integer idProducto, String codigoBarra, String descProducto);
}
