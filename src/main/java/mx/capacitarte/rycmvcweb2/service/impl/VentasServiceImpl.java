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
		ventasMapper.ventaInventarioCantidad(ventaVO.getIdProducto(),ventaVO.getCantidad());
		
		
		
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
