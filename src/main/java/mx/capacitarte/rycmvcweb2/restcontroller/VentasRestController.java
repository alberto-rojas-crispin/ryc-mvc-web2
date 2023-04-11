package mx.capacitarte.rycmvcweb2.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.beans.ActualizarVentaBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.ConsultaVentaBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.EliminarVentaBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.InsertarVentaBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.VentaBean;
import mx.capacitarte.rycmvcweb2.service.IVentasService;

@RestController
@RequestMapping("/rest/ventas")
public class VentasRestController {
	
	@Autowired
	IVentasService ventasService;
	
	@GetMapping("/")
	public List<VentaBean> consultarVentasTotales() {
		
		List<VentaVO> ventasVOList = new ArrayList<VentaVO>();
		
		ventasVOList = ventasService.consultarVentasTotales();
		
		List<VentaBean> ventaBeanList = new ArrayList<VentaBean>();
		
		for (VentaVO ventaVO : ventasVOList) {
			
			VentaBean ventaBean = new VentaBean(
					ventaVO.getNumeroFolio(),
					ventaVO.getIdProducto(),
					ventaVO.getCantidad(),
					ventaVO.getIdTipoUnidad(),
					ventaVO.getIdPrecio(),
					ventaVO.getPrecioTotal(),
					ventaVO.getVigencia(),
					ventaVO.getFechaCreacion(),
					ventaVO.getUsuarioCreacion(),
					ventaVO.getFechaActualizacion(),
					ventaVO.getUsuarioActualizacion()
					);
			ventaBeanList.add(ventaBean);
		}
		return ventaBeanList;
			
	}
	
	@GetMapping("/consultaPersonalizada")
	public ConsultaVentaBeanResponse consultaPersonalizada(@RequestBody VentaBean ventaBean) {
		
		ConsultaVentaBeanResponse beanResponse = new ConsultaVentaBeanResponse();
		
		beanResponse.setIdProducto(ventaBean.getIdProducto());
		beanResponse.setVigencia(ventaBean.getVigencia() == true ? "Activo" : "Inactivo");
		
		List<VentaVO> ventasVOList = new ArrayList<VentaVO>();
		
		ventasVOList = ventasService.consultarVentaPersonalizada(ventaBean.getNumeroFolio(), ventaBean.getIdProducto(), ventaBean.getVigencia());
		
		List<VentaBean> ventaBeanList = new ArrayList<VentaBean>();
		
		for (VentaVO ventaVO : ventasVOList) {
			
			VentaBean venta = new VentaBean(
					ventaVO.getNumeroFolio(),
					ventaVO.getIdProducto(),
					ventaVO.getCantidad(),
					ventaVO.getIdTipoUnidad(),
					ventaVO.getIdPrecio(),
					ventaVO.getPrecioTotal(),
					ventaVO.getVigencia(),
					ventaVO.getFechaCreacion(),
					ventaVO.getUsuarioCreacion(),
					ventaVO.getFechaActualizacion(),
					ventaVO.getUsuarioActualizacion()
					);
			ventaBeanList.add(venta);
		}
		
		beanResponse.setVentas(ventaBeanList);
		return beanResponse;
		
		
	}
	
	@PostMapping("/")
	public InsertarVentaBeanResponse agregarVenta(@RequestBody VentaBean ventaBean) {
		
		InsertarVentaBeanResponse beanResponse = new InsertarVentaBeanResponse();
		
		
		VentaVO ventaVO = new VentaVO();
		ventaVO.setIdProducto(ventaBean.getIdProducto());
		ventaVO.setCantidad(ventaBean.getCantidad());
		ventaVO.setIdTipoUnidad(ventaBean.getIdTipoUnidad());
		ventaVO.setIdPrecio(ventaBean.getIdPrecio());
		ventaVO.setPrecioTotal(ventaBean.getPrecioTotal());
		ventaVO.setVigencia(ventaBean.getVigencia());
		ventaVO.setFechaCreacion(ventaBean.getFechaCreacion());
		ventaVO.setUsuarioCreacion(ventaBean.getUsuarioCreacion());
		
		Integer estatus = ventasService.agregarVenta(ventaVO);
		
		beanResponse.setFolioGenerado(estatus > 0 ? ventasService.consultarFolioGenerado() : 0);
		beanResponse.setEstatusAgregar(estatus > 0 ? "Se agrego correctamente" : "Hubo un error al agregar");
		
		return beanResponse;
	}
	
	@PutMapping("/")
	public ActualizarVentaBeanResponse actualizarVenta(@RequestBody VentaBean ventaBean){
		
		ActualizarVentaBeanResponse beanResponse = new ActualizarVentaBeanResponse();
		
		VentaVO ventaVO = new VentaVO();
		
		ventaVO.setCantidad(ventaBean.getCantidad());
		ventaVO.setIdTipoUnidad(ventaBean.getIdTipoUnidad());
		ventaVO.setIdPrecio(ventaBean.getIdPrecio());
		ventaVO.setPrecioTotal(ventaBean.getPrecioTotal());
		ventaVO.setVigencia(ventaBean.getVigencia());
		ventaVO.setFechaActualizacion(ventaBean.getFechaActualizacion());
		ventaVO.setUsuarioActualizacion(ventaBean.getUsuarioActualizacion());
		
		Boolean estatus = ventasService.actualizarVenta(ventaVO);
		
		beanResponse.setNumeroFolio(ventaBean.getNumeroFolio());
		beanResponse.setIdProducto(ventaBean.getIdProducto());
		beanResponse.setEstatusActualizar(estatus == true ? "Se actualizo correctamente" : "Hubo un error al actualiza");
		
		return beanResponse;
	}
	
	@DeleteMapping("/")
	public EliminarVentaBeanResponse eliminarVenta(@RequestBody VentaBean ventaBean) {
		EliminarVentaBeanResponse beanResponse = new EliminarVentaBeanResponse();

		beanResponse.setNumeroFolio(ventaBean.getNumeroFolio());
		beanResponse.setEstatusEliminar(ventasService.eliminarVenta(ventaBean.getNumeroFolio()) == true ? "Se elimino correctamente" : "Hubo un error al eliminar");
	
		return beanResponse;
		}
}
