package mx.capacitarte.rycmvcweb2.service;

import java.util.Date;
import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.InventarioVO;

public interface IInventarioService {
	public Integer consultarFolioGenerado();
	
	public List<InventarioVO> consultarInventario();
	
	public List<InventarioVO> consultaPersonalizada(Integer numeroFolio, Integer idProducto, Date caducidadProducto);	
	
	public Integer agregarInventario(InventarioVO inventarioVO);
	
	public Boolean actualizarInventario(InventarioVO inventarioVO);
	
	public Boolean eliminarInventario(Integer numeroFolio);
}
