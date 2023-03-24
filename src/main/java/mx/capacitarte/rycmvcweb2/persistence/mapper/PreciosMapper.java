package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.PrecioVO;

@Mapper
public interface PreciosMapper {
	
	public List<PrecioVO> consultarPrecios();
	
	public List<PrecioVO> consultarPorIdProductoYNombre(Integer idProducto, String descProducto);
	
	public Integer agregarPrecio(PrecioVO precioVO);
	
	public Integer consultarIdGenerado();
	
	public Boolean actualizarPrecio(PrecioVO precioVO);
	
	public Boolean eliminarPrecio(Integer idPrecio, Integer idProducto);

}
