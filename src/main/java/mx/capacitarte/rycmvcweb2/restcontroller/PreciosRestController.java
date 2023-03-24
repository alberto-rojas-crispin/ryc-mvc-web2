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

import mx.capacitarte.rycmvcweb2.VO.PrecioVO;
import mx.capacitarte.rycmvcweb2.beans.ActualizarPrecioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.ConsultarPrecioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.EliminarPrecioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.InsertarPrecioBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.PrecioBean;
import mx.capacitarte.rycmvcweb2.persistence.mapper.PreciosMapper;
import mx.capacitarte.rycmvcweb2.service.IPreciosService;

@RestController
@RequestMapping("/rest/precios")
public class PreciosRestController {
	
	@Autowired
	IPreciosService preciosService;
	
	@Autowired
	PreciosMapper preciosMapper;
	
	@GetMapping("/")
	public List<PrecioBean> consultarPrecios(){

		System.out.println("Ejecutando GetMapping - todos");
		
		List<PrecioVO> preciosVO = new ArrayList<PrecioVO>();
		
		preciosVO = preciosService.consultarPrecios();

		List<PrecioBean> preciosBean = new ArrayList<PrecioBean>();
		
		for (PrecioVO precioVO : preciosVO) {
		
			PrecioBean precioBean = new PrecioBean (precioVO.getIdPrecio(),precioVO.getIdProducto(), precioVO.getDescProducto(), precioVO.getFechaInicio(), precioVO.getPrecioUnitario(), precioVO.getVigencia(), precioVO.getFechaCreacion(), precioVO.getUsuarioCreacion(), precioVO.getFechaActualizacion(), precioVO.getUsuarioActualizacion(), precioVO.getFechaVenta());
			
			preciosBean.add(precioBean);
			
		 }
		return preciosBean;
	}
	
	@GetMapping("/consultar")
	public ConsultarPrecioBeanResponse consultarPorIdProductoYNombre(@RequestBody PrecioBean precioBean) {
		ConsultarPrecioBeanResponse beanResponse = new ConsultarPrecioBeanResponse();
		beanResponse.setIdProducto(precioBean.getIdProducto());
		beanResponse.setDescProducto(precioBean.getDescProducto());
		
		System.out.println("Ejecutando GetMapping - individual");
		
		List<PrecioVO> preciosVO = new ArrayList<PrecioVO>();
		
		preciosVO = preciosService.consultarPorIdProductoYNombre(precioBean.getIdProducto(), precioBean.getDescProducto());

		List<PrecioBean> preciosBean = new ArrayList<PrecioBean>();
		
		for (PrecioVO precioVO : preciosVO) {
		
			PrecioBean precio = new PrecioBean (precioVO.getIdPrecio(),precioVO.getIdProducto(), precioVO.getDescProducto(), precioVO.getFechaInicio(), precioVO.getPrecioUnitario(), precioVO.getVigencia(), precioVO.getFechaCreacion(), precioVO.getUsuarioCreacion(), precioVO.getFechaActualizacion(), precioVO.getUsuarioActualizacion(), precioVO.getFechaVenta());
			
			preciosBean.add(precio);
			
		 }
		beanResponse.setProductos(preciosBean);
		
		
		return beanResponse;
	}
	
	
	@PostMapping("/")
	public InsertarPrecioBeanResponse agregarPrecio(@RequestBody PrecioBean precioBean) {
		System.out.println("Ejecutando PostMapping" + precioBean.getFechaInicio());
		
		PrecioVO precioVO = new PrecioVO();
		
		precioVO.setIdProducto(precioBean.getIdProducto());
		precioVO.setFechaInicio(precioBean.getFechaInicio());
		precioVO.setPrecioUnitario(precioBean.getPrecioUnitario());
		precioVO.setVigencia(precioBean.getVigencia());
		precioVO.setUsuarioCreacion(precioBean.getUsuarioCreacion());
		
		Integer idPrecio = preciosService.agregarPrecio(precioVO);
		
		InsertarPrecioBeanResponse BeanResponse = new InsertarPrecioBeanResponse();
		
		BeanResponse.setIdPrecio(idPrecio >= 1 ? preciosMapper.consultarIdGenerado() : 0);
		BeanResponse.setIdProducto(precioBean.getIdProducto());
		BeanResponse.setEstatusAgregar( idPrecio > 0 ? "Se agrego correctamente" : "Hubo un error al agregar");
		
		return BeanResponse;
	}
	
	@PutMapping("/")
	public ActualizarPrecioBeanResponse actualizarPrecio(@RequestBody PrecioBean precioBean) {
		System.out.println("Ejecutando PutMapping");
		
		PrecioVO precioVO = new PrecioVO();
		
		precioVO.setIdPrecio(precioBean.getIdPrecio());
		precioVO.setIdProducto(precioBean.getIdProducto());
		precioVO.setFechaInicio(precioBean.getFechaInicio());
		precioVO.setPrecioUnitario(precioBean.getPrecioUnitario());
		precioVO.setVigencia(precioBean.getVigencia());
		precioVO.setUsuarioActualizacion(precioBean.getUsuarioActualizacion());
		
		Boolean estatusActualizacion = preciosService.actualizarPrecio(precioVO);
		
		ActualizarPrecioBeanResponse beanResponse = new ActualizarPrecioBeanResponse();
		
		beanResponse.setIdPrecio(precioBean.getIdPrecio());
		beanResponse.setIdProducto(precioBean.getIdProducto());
		beanResponse.setEstatusActualizar(estatusActualizacion == true ? "Se actualizo correctamente" : "No existe el registro" );
		
		
		return beanResponse;
	}
	
	@DeleteMapping("/")
	public EliminarPrecioBeanResponse eliminarPrecio(@RequestBody PrecioBean precioBean) {
		System.out.println("Ejecutando DeleteMapping");
		
		EliminarPrecioBeanResponse BeanResponse = new EliminarPrecioBeanResponse();
		
		BeanResponse.setIdPrecio(precioBean.getIdPrecio());
		BeanResponse.setIdProducto(precioBean.getIdProducto());
		BeanResponse.setEstatusEliminacion(preciosService.eliminarPrecio(precioBean.getIdPrecio(), precioBean.getIdProducto()) == true ? "Se elimino correctamente" : "No existe el registro");
		
		
		
		return BeanResponse;
		
	}
	
	
}
