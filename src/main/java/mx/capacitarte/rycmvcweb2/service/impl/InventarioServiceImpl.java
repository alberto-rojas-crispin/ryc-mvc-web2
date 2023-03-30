package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.InventarioVO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.InventariosMapper;
import mx.capacitarte.rycmvcweb2.service.IInventarioService;

@Service("invenrtarioService")
public class InventarioServiceImpl implements IInventarioService {
	
	@Autowired
	InventariosMapper inventariosMapper;

	@Override
	public List<InventarioVO> consultarInventario() {
		// TODO Auto-generated method stub
		return inventariosMapper.consultarInventario();
	}

	@Override
	public List<InventarioVO> consultaPersonalizada(Integer numeroFolio, Integer idProducto, Date caducidadProducto) {
		// TODO Auto-generated method stub
		/*if(caducidadProducto == null) {
			caducidadProducto = new Date();
			
		}*/
		return inventariosMapper.consultaPersonalizada(numeroFolio,idProducto,caducidadProducto);
	}

	@Override
	public Integer agregarInventario(InventarioVO inventarioVO) {
		// TODO Auto-generated method stub
		return inventariosMapper.agregarInventario(inventarioVO);
	}

	@Override
	public Boolean actualizarInventario(InventarioVO inventarioVO) {
		// TODO Auto-generated method stub
		return inventariosMapper.actualizarInventario(inventarioVO);
	}

	@Override
	public Boolean eliminarInventario(Integer numeroFolio) {
		// TODO Auto-generated method stub
		return inventariosMapper.eliminarInventario(numeroFolio);
	}

	@Override
	public Integer consultarFolioGenerado() {
		// TODO Auto-generated method stub
		return inventariosMapper.consultarFolioGenerado();
	}

}
