package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.VentasMapper;
import mx.capacitarte.rycmvcweb2.service.IVentasService;

@Service("ventasService")
public class VentasServiceImpl implements IVentasService {
	
	@Autowired
	VentasMapper ventasMapper;
	
	@Override
	public Integer consultarFolioGenerado() {
		// TODO Auto-generated method stub
		return ventasMapper.consultarFolioGenerado();
	}

	@Override
	public List<VentaVO> consultar() {
		// TODO Auto-generated method stub
		return ventasMapper.consultar();
	}

	@Override
	public List<VentaVO> consultarVentasTotales() {
		// TODO Auto-generated method stub
		return ventasMapper.consultarVentasTotales();
	}

	@Override
	public List<VentaVO> consultarVentaPersonalizada(Integer numeroFolio, Integer idProducto, Boolean vigencia) {
		// TODO Auto-generated method stub
		return ventasMapper.consultarVentaPersonalizada(numeroFolio, idProducto, vigencia);
	}

	@Override
	public Integer agregarVenta(VentaVO ventaVO) {
		// TODO Auto-generated method stub
		return ventasMapper.agregarVenta(ventaVO);
	}

	@Override
	public Boolean actualizarVenta(VentaVO ventaVO) {
		// TODO Auto-generated method stub
		return ventasMapper.actualizarVenta(ventaVO);
	}

	@Override
	public Boolean eliminarVenta(Integer numeroFolio) {
		// TODO Auto-generated method stub
		return ventasMapper.eliminarVenta(numeroFolio);
	}

}
