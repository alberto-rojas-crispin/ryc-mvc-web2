package mx.capacitarte.rycmvcweb2.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.InventarioVO;
import mx.capacitarte.rycmvcweb2.beans.ActualizarInventarioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.AgregarInventarioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.ConsultarInventarioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.EliminarInventarioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.InventarioBean;
import mx.capacitarte.rycmvcweb2.service.IInventarioService;

@RestController
@RequestMapping("/rest/inventario")
public class InventariosRestController {

	@Autowired
	IInventarioService inventarioService;
	
	@GetMapping("/")
	public List<InventarioBean> consultarInventario(){
		
		System.out.println("Ejecutando GetMapping - todos");
		
		List<InventarioVO> inventariosVOList = new ArrayList<InventarioVO>();
		
		inventariosVOList = inventarioService.consultarInventario();
		
		List<InventarioBean> inventariosBeanList = new ArrayList<InventarioBean>();
		
		for (InventarioVO inventarioVO : inventariosVOList) {
			
			InventarioBean inventarioBean = new InventarioBean(
					inventarioVO.getNumeroFolio(),
					inventarioVO.getIdProducto(),
					inventarioVO.getCantidad(),
					inventarioVO.getIdTipoUnidad(),
					inventarioVO.getCaducidadProducto(),
					inventarioVO.getCostoUnitario(),
					inventarioVO.getCostoTotal(),
					inventarioVO.getIdPrecio(),
					inventarioVO.getTipoMovimiento(),
					inventarioVO.getVigencia(),
					inventarioVO.getFechaAprobacion(),
					inventarioVO.getUsuarioAprobacion(),
					inventarioVO.getFechaCreacion(),
					inventarioVO.getUsuarioCreacion(),
					inventarioVO.getFechaActualizacion(),
					inventarioVO.getUsuarioActualizacion()
					);
		inventariosBeanList.add(inventarioBean);
		}
		
		return inventariosBeanList;
	}
	
	@GetMapping("/consultaPersonalizada")
	public ConsultarInventarioBeanResponse consultaPersonalizada(@RequestBody InventarioBean inventarioBean) {
		ConsultarInventarioBeanResponse beanResponse = new ConsultarInventarioBeanResponse();
		beanResponse.setNumeroFolio(inventarioBean.getNumeroFolio());
		beanResponse.setIdProducto(inventarioBean.getIdProducto());
		beanResponse.setCaducidadProducto(inventarioBean.getCaducidadProducto());	
		 
		List<InventarioVO> inventariosVOList = new ArrayList<InventarioVO>();
		
		inventariosVOList = inventarioService.consultaPersonalizada(inventarioBean.getNumeroFolio(), inventarioBean.getIdProducto(), inventarioBean.getCaducidadProducto());
		
		List<InventarioBean> inventariosBeanList = new ArrayList<InventarioBean>();
		
		for (InventarioVO inventarioVO : inventariosVOList) {
			
			InventarioBean inventario = new InventarioBean(
					inventarioVO.getNumeroFolio(),
					inventarioVO.getIdProducto(),
					inventarioVO.getCantidad(),
					inventarioVO.getIdTipoUnidad(),
					inventarioVO.getCaducidadProducto(),
					inventarioVO.getCostoUnitario(),
					inventarioVO.getCostoTotal(),
					inventarioVO.getIdPrecio(),
					inventarioVO.getTipoMovimiento(),
					inventarioVO.getVigencia(),
					inventarioVO.getFechaAprobacion(),
					inventarioVO.getUsuarioAprobacion(),
					inventarioVO.getFechaCreacion(),
					inventarioVO.getUsuarioCreacion(),
					inventarioVO.getFechaActualizacion(),
					inventarioVO.getUsuarioActualizacion()
					);
		inventariosBeanList.add(inventario);
		}
		
		beanResponse.setInventariosBeanList(inventariosBeanList);
		
		return beanResponse;
	}
	
	@PostMapping("/")
	public AgregarInventarioBeanResponse agregarInventario(@RequestBody InventarioBean inventarioBean) {
		
		AgregarInventarioBeanResponse beanResponse = new AgregarInventarioBeanResponse();
		InventarioVO inventarioVO = new InventarioVO();
		inventarioVO.setIdProducto(inventarioBean.getIdProducto());
		inventarioVO.setCantidad(inventarioBean.getCantidad());
		inventarioVO.setIdTipoUnidad(inventarioBean.getIdTipoUnidad());
		inventarioVO.setCaducidadProducto(inventarioBean.getCaducidadProducto());
		inventarioVO.setCostoUnitario(inventarioBean.getCostoUnitario());
		inventarioVO.setCostoTotal(inventarioBean.getCostoTotal());
		inventarioVO.setIdPrecio(inventarioBean.getIdPrecio());
		inventarioVO.setTipoMovimiento(inventarioBean.getTipoMovimiento());
		inventarioVO.setVigencia(inventarioBean.getVigencia());
		inventarioVO.setFechaCreacion(inventarioBean.getFechaCreacion());
		inventarioVO.setUsuarioCreacion(inventarioBean.getUsuarioCreacion());
		
		Integer estatusAgregar = inventarioService.agregarInventario(inventarioVO);
		
		beanResponse.setFolioGenerado(estatusAgregar > 0 ? inventarioService.consultarFolioGenerado() : 0);
		beanResponse.setEstatusAgregar(estatusAgregar > 0 ? "Se agrego correctamente": "Hubo un error al agregar");
		
		
		
		return beanResponse;
		
	}
	
	@PutMapping("/")
	public ActualizarInventarioBeanResponse actualizarInventario(@RequestBody InventarioBean inventarioBean) {
		ActualizarInventarioBeanResponse beanResponse =  new ActualizarInventarioBeanResponse();
		
		InventarioVO inventarioVO = new InventarioVO();
		
		inventarioVO.setNumeroFolio(inventarioBean.getNumeroFolio());
		inventarioVO.setIdProducto(inventarioBean.getIdProducto());
		inventarioVO.setCantidad(inventarioBean.getCantidad());
		inventarioVO.setIdTipoUnidad(inventarioBean.getIdTipoUnidad());
		inventarioVO.setCaducidadProducto(inventarioBean.getCaducidadProducto());
		inventarioVO.setCostoUnitario(inventarioBean.getCostoUnitario());
		inventarioVO.setCostoTotal(inventarioBean.getCostoTotal());
		inventarioVO.setIdPrecio(inventarioBean.getIdPrecio());
		inventarioVO.setTipoMovimiento(inventarioBean.getTipoMovimiento());
		inventarioVO.setVigencia(inventarioBean.getVigencia());
		inventarioVO.setUsuarioActualizacion(inventarioBean.getUsuarioActualizacion());
		
		Boolean estatusActualizacion = inventarioService.actualizarInventario(inventarioVO);
		
		beanResponse.setNumeroFolio(inventarioBean.getNumeroFolio());
		beanResponse.setIdProducto(inventarioBean.getIdProducto());
		beanResponse.setEstatusActualizacion(estatusActualizacion == true ? "Se actualizo correctamente" : "Hubo un error al actualizar");
		
		
		return beanResponse;
	}
	
	@DeleteMapping("/")
	public EliminarInventarioBeanResponse eliminarInventario(@RequestBody InventarioBean inventarioBean) {
		
		EliminarInventarioBeanResponse beanResponse = new EliminarInventarioBeanResponse();
		
		Boolean estatusEliminacion = inventarioService.eliminarInventario(inventarioBean.getNumeroFolio());
		
		beanResponse.setNumeroFolio(inventarioBean.getNumeroFolio());
		beanResponse.setEstatusActualizar(estatusEliminacion == true ? "Se elimino correctamente" : "Hubo un error al eliminar");
		return beanResponse;
	}
}
