package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.PrecioVO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.PreciosMapper;
import mx.capacitarte.rycmvcweb2.service.IPreciosService;

@Service("preciosService")
public class PreciosServiceImpl implements IPreciosService {

@Autowired
PreciosMapper preciosMapper;
	
	@Override
	public List<PrecioVO> consultarPrecios() {
		// TODO Auto-generated method stub
		return preciosMapper.consultarPrecios();
	}
	@Override
		public List<PrecioVO> consultarPorIdProductoYNombre(Integer idProducto, String descProducto) {
			// TODO Auto-generated method stub
			String consulta = "%" + descProducto + "%";
			return preciosMapper.consultarPorIdProductoYNombre(idProducto, descProducto);
		}
	@Override
	public Integer agregarPrecio(PrecioVO precioVO) {
		// TODO Auto-generated method stub
		System.out.println(precioVO.getFechaInicio());
		return preciosMapper.agregarPrecio(precioVO);
	}

	@Override
	public Boolean actualizarPrecio(PrecioVO precioVO) {
		// TODO Auto-generated method stub
		return preciosMapper.actualizarPrecio(precioVO);
	}

	@Override
	public Boolean eliminarPrecio(Integer idPrecio, Integer idProducto) {
		// TODO Auto-generated method stub
		return preciosMapper.eliminarPrecio(idPrecio, idProducto);
	}

	

}
