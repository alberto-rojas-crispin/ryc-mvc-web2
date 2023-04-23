package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mx.capacitarte.rycmvcweb2.VO.InventarioVO;
import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.beans.VentaBean;
import mx.capacitarte.rycmvcweb2.persistence.mapper.InventariosMapper;
import mx.capacitarte.rycmvcweb2.persistence.mapper.VentasMapper;
import mx.capacitarte.rycmvcweb2.service.IVentasService;

@Service("ventasService")
public class VentasServiceImpl implements IVentasService {
	
	@Autowired
	VentasMapper ventasMapper;
	
	@Autowired
	InventariosMapper inventariosMapper;
	
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
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Integer agregarVenta(VentaVO ventaVO) {
		// TODO Auto-generated method stub -- prmeron verifia 

		int diff = 0;
		int cantidad = 0;
		cantidad = ventasMapper.ventaInventario(ventaVO.getIdProducto());
		System.out.println("LA CANTIDAD EN INVENTARIO ES: " + cantidad);
		if( cantidad > 0 && ventaVO.getCantidad() > cantidad) {
			
			  diff = ventaVO.getCantidad() - cantidad;
			 
			 ventaVO.setCantidad(ventaVO.getCantidad() - diff);
				System.out.println("La cantidad excede el inventario, se asignaron " + ventaVO.getCantidad() + " disponibles");

		}else if (cantidad == 0){
			System.out.println("No hay en inventario");
			return 0;
		}
		
		ventasMapper.agregarVenta(ventaVO);
		int folioGenerado = ventasMapper.consultarFolioGenerado();
		
		InventarioVO inventarioVO = new InventarioVO();
		inventarioVO.setNumeroFolio(folioGenerado);
		inventarioVO.setIdProducto(ventaVO.getIdProducto());
		inventarioVO.setCantidad(ventaVO.getCantidad() * -1);
		inventarioVO.setIdTipoUnidad(ventaVO.getIdTipoUnidad());
		inventarioVO.setCaducidadProducto(new Date());
		inventarioVO.setCostoUnitario(ventaVO.getPrecioTotal());
		inventarioVO.setCostoTotal(ventaVO.getPrecioTotal());
		inventarioVO.setIdPrecio(ventaVO.getIdPrecio());
		inventarioVO.setTipoMovimiento(101);
		inventarioVO.setVigencia(ventaVO.getVigencia());
		inventarioVO.setUsuarioCreacion(ventaVO.getUsuarioCreacion());
		
		inventariosMapper.agregarInventarioFolio(inventarioVO);
		
		return folioGenerado;
	
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

	@Override
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Integer agregarVentaFolio(List<VentaVO> ventasVO) {
		// TODO Auto-generated method stub
		int bandera = 0;
		int folioGenerado = 0;
		
		for (VentaVO ventaVO : ventasVO) {
			int cantidad = 0;
			cantidad = ventasMapper.ventaInventario(ventaVO.getIdProducto());
			if(cantidad == 0){
				System.out.println("No hay en inventario");
				return 0;
			}
			
		}
		
		for (VentaVO ventaVO : ventasVO) {
			int diff = 0;
			int cantidad = 0;
			cantidad = ventasMapper.ventaInventario(ventaVO.getIdProducto());
			System.out.println("LA CANTIDAD EN INVENTARIO ES: " + cantidad);
			if( cantidad > 0 && ventaVO.getCantidad() > cantidad) {
				
				  diff = ventaVO.getCantidad() - cantidad;
				 
				 ventaVO.setCantidad(ventaVO.getCantidad() - diff);
					System.out.println("La cantidad excede el inventario, se asignaron " + ventaVO.getCantidad() + " disponibles");

			}
			
			if(bandera == 0){
				ventasMapper.agregarVenta(ventaVO);
				bandera = 1; 
				folioGenerado = ventasMapper.consultarFolioGenerado();
				//continue;
			}else {
				
				ventaVO.setNumeroFolio(folioGenerado);
				ventasMapper.agregarVentaFolio(ventaVO);
				
			}
			
			
			InventarioVO inventarioVO = new InventarioVO();
			inventarioVO.setNumeroFolio(folioGenerado);
			inventarioVO.setIdProducto(ventaVO.getIdProducto());
			inventarioVO.setCantidad(ventaVO.getCantidad() * -1);
			inventarioVO.setIdTipoUnidad(ventaVO.getIdTipoUnidad());
			inventarioVO.setCaducidadProducto(new Date());
			inventarioVO.setCostoUnitario(ventaVO.getPrecioTotal());
			inventarioVO.setCostoTotal(ventaVO.getPrecioTotal());
			inventarioVO.setIdPrecio(ventaVO.getIdPrecio());
			inventarioVO.setTipoMovimiento(101);
			inventarioVO.setVigencia(ventaVO.getVigencia());
			inventarioVO.setUsuarioCreacion(ventaVO.getUsuarioCreacion());
			
			inventariosMapper.agregarInventarioFolio(inventarioVO);
			
		}
		 
		
		return folioGenerado;
		
		
		
	}

	

}
