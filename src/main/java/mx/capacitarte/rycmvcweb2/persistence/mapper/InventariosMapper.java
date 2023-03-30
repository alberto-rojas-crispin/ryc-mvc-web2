package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.InventarioVO;

@Mapper
public interface InventariosMapper {

	public Integer consultarFolioGenerado();

	public List<InventarioVO> consultarInventario();
	
	public List<InventarioVO> consultaPersonalizada(Integer numeroFolio, Integer idProducto, Date caducidadProducto);	
	
	public Integer agregarInventario(InventarioVO inventarioVO);
	
	public Boolean actualizarInventario(InventarioVO inventarioVO);
	
	public Boolean eliminarInventario(Integer numeroFolio);
	
	
}
