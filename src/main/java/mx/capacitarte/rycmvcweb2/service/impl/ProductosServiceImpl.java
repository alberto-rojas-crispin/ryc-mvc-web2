package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;
import mx.capacitarte.rycmvcweb2.dao.IProductosDAO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.ProductosMapper;
import mx.capacitarte.rycmvcweb2.service.IProductosService;

@Service("productosService")
public class ProductosServiceImpl implements IProductosService {

	@Autowired
	IProductosDAO productosDAO;
	
	@Autowired
	ProductosMapper productosMapper;

	@Override
	public List<ProductoVO> consultarProducto() {
		// TODO Auto-generated method stub
		return productosMapper.consultarProducto();
	}

	@Override
	public Integer agregarProducto(ProductoVO productoVO) {
		// TODO Auto-generated method stub
		return productosMapper.agregarProducto(productoVO) >= 1 ? productosMapper.consultarIdGenerado() : 0;
	}

	@Override
	public Boolean eliminarProducto(Integer idProducto) {
		// TODO Auto-generated method stub
		return productosMapper.eliminarProducto(idProducto);
	}

	@Override
	public List<ProductoVO> buscarProductoPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		
		return productosDAO.buscarProductoPorId(idProducto);
	}

	@Override
	public List<ProductoVO> consultarPorNombreYId(Integer idProducto, String descProducto) {
		// TODO Auto-generated method stub
		return productosMapper.consultarPorNombreYId(idProducto, descProducto);
		
	}

	@Override
	public Boolean actualizarProducto(ProductoVO productoVO) {
		// TODO Auto-generated method stub
		return productosMapper.actualizarProducto(productoVO);
	}

	
	
	
	/*@Override
	public Boolean actualizarProducto(Integer idProducto, String codigoBarra, String descProducto) {
		// TODO Auto-generated method stub
		
		return productosDAO.actualizarProducto(idProducto, codigoBarra, descProducto);
	}*/

}
