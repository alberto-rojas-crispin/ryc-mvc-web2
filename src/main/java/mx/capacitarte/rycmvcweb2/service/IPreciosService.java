package mx.capacitarte.rycmvcweb2.service;

import java.util.Date;
import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.PrecioVO;

public interface IPreciosService {
	
	public List<PrecioVO> consultarPrecios();
	
	public List<PrecioVO> consultarPorIdProductoYNombre(Integer idProducto, String descProducto, Date fechaInicio);	
	
	public Integer agregarPrecio(PrecioVO precioVO);
	
	public Boolean actualizarPrecio(PrecioVO precioVO);
	
	public Boolean eliminarPrecio(Integer idPrecio, Integer idProducto);
	
	

}
