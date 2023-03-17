package mx.capacitarte.rycmvcweb2.restcontroller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;
import mx.capacitarte.rycmvcweb2.beans.ActualizarTrabajadoresBeanRequest;
import mx.capacitarte.rycmvcweb2.beans.ActualizarTrabajadoresBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.ConsultarPorTrabajadorRequest;
import mx.capacitarte.rycmvcweb2.beans.ConsultarPorTrabajadorResponse;
import mx.capacitarte.rycmvcweb2.beans.ConsultarTrabajadoresResponse;
import mx.capacitarte.rycmvcweb2.beans.EliminarTrabajadorBeanRequest;
import mx.capacitarte.rycmvcweb2.beans.EliminarTrabajadorBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.InsertarProductoBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.InsertarTrabajadorBeanRequest;
import mx.capacitarte.rycmvcweb2.beans.InsertarTrabajadorBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.TrabajadorBean;
import mx.capacitarte.rycmvcweb2.service.ITrabajadoresService;

@RestController

@RequestMapping("/rest/trabajadores")
public class TrabajadoresRestController {

	Logger logger = LoggerFactory.getLogger(TrabajadoresRestController.class);
	
	@Autowired
	ITrabajadoresService trabajadoresService;

	@GetMapping("/consultar")
	public List<TrabajadorBean> consultarTrabajadores() {
		System.out.println("Iniciando consulta de trabajadores");
		
		logger.info("Iniciando consulta de trabajadores info");
		logger.error("Iniciando consulta de trabajadores error");
		logger.debug("Iniciando consulta de trabajadores debug");
		logger.warn("Iniciando consulta de trabajadores warn");
		
		
		List<TrabajadorVO> trabajadoresVO = new ArrayList<TrabajadorVO>();

		trabajadoresVO = trabajadoresService.consultarTrabajadores();

		List<TrabajadorBean> trabajadoresBeans = new ArrayList<TrabajadorBean>();

		for (TrabajadorVO trabajadorVO : trabajadoresVO) {
			TrabajadorBean trabajadorBean = new TrabajadorBean(trabajadorVO.getNumeroEmpleado(),
					trabajadorVO.getNombreEmpleado(), trabajadorVO.getApellidosEmpleado(),
					trabajadorVO.getFechaIngreso(), trabajadorVO.getDiasTrabajados(), trabajadorVO.getSalarioTotal(),
					trabajadorVO.isEstatusEmpleado(), trabajadorVO.getUsuarioRegistro());
			trabajadoresBeans.add(trabajadorBean);
		}

		return trabajadoresBeans;
	}
	@GetMapping("/consultarTrabajadores")
	public 	List<ConsultarTrabajadoresResponse> consultarTrabajadores2() {
		List<TrabajadorVO> trabajadoresVO = new ArrayList<TrabajadorVO>();
			trabajadoresVO = trabajadoresService.consultarTrabajadores();

			List<ConsultarTrabajadoresResponse> trabajadoresResponse = new ArrayList<ConsultarTrabajadoresResponse>();
			for (TrabajadorVO trabajadorVO : trabajadoresVO) {
				ConsultarTrabajadoresResponse trabajadorResponse = new ConsultarTrabajadoresResponse(trabajadorVO.getNumeroEmpleado(),
						trabajadorVO.getNombreEmpleado(), trabajadorVO.getApellidosEmpleado(),
						trabajadorVO.getFechaIngreso(), trabajadorVO.getDiasTrabajados(), trabajadorVO.getSalarioTotal(),
						trabajadorVO.isEstatusEmpleado() ? "Activo":"Inactivo", trabajadorVO.getUsuarioRegistro());
				trabajadoresResponse.add(trabajadorResponse);
			}
		return trabajadoresResponse;
		
	}

	

	// @GetMapping("/consultarPorTrabajador/")

	// public ConsultarPorTrabajadorResponse
	// consultarPorTrabajador(@RequestParam(name = "numeroEmpleado") Integer
	// numeroEmpleado, @RequestParam(name = "nombreEmpleado") String nombreEmpleado,
	// @RequestParam(name = "apellidosEmpleado") String apellidosEmpleado){
	@GetMapping("/consultarPorTrabajador/")
	public ConsultarPorTrabajadorResponse consultarPorTrabajador(@RequestBody ConsultarPorTrabajadorRequest request) {
		ConsultarPorTrabajadorResponse response = new ConsultarPorTrabajadorResponse();

		
		List<TrabajadorVO> trabajadoresVO = new ArrayList<TrabajadorVO>();

		trabajadoresVO = trabajadoresService.consultaPorTrabajador(request.getNumeroEmpleado(),
				request.getNombreEmpleado(), request.getApellidosEmpleado());

		List<ConsultarTrabajadoresResponse> trabajadoresBean = new ArrayList<ConsultarTrabajadoresResponse>();

		for (TrabajadorVO trabajadorVO : trabajadoresVO) {
			ConsultarTrabajadoresResponse trabajadorResponse = new ConsultarTrabajadoresResponse(trabajadorVO.getNumeroEmpleado(),
					trabajadorVO.getNombreEmpleado(), trabajadorVO.getApellidosEmpleado(),
					trabajadorVO.getFechaIngreso(), trabajadorVO.getDiasTrabajados(), trabajadorVO.getSalarioTotal(),
					trabajadorVO.isEstatusEmpleado() ? "Activo":"Inactivo", trabajadorVO.getUsuarioRegistro());
			trabajadoresBean.add(trabajadorResponse);
		}
		response.setTrabajadores(trabajadoresBean);
		return response;

	}

	@PostMapping("/")
	public InsertarTrabajadorBeanResponse insertarTrabajador(@RequestBody InsertarTrabajadorBeanRequest trabajadorBeanRequest) {
		TrabajadorVO trabajadorVO = new TrabajadorVO();
		
		logger.info("ENTRADA: " + trabajadorBeanRequest.toString());
		
		trabajadorVO.setNombreEmpleado(trabajadorBeanRequest.getNombreEmpleado());
		trabajadorVO.setApellidosEmpleado(trabajadorBeanRequest.getApellidosEmpleado());
		trabajadorVO.setFechaIngreso(trabajadorBeanRequest.getFechaIngreso());
		trabajadorVO.setDiasTrabajados(trabajadorBeanRequest.getDiasTrabajados());
		trabajadorVO.setEstatusEmpleado(trabajadorBeanRequest.getEstatusEmpleado());
		trabajadorVO.setUsuarioRegistro(trabajadorBeanRequest.getUsuarioRegistro());

		Integer numeroEmpleado = trabajadoresService.agregarTrabajador(trabajadorVO);

		InsertarTrabajadorBeanResponse beanResponse = new InsertarTrabajadorBeanResponse();

		beanResponse.setNumeroEmpleado(numeroEmpleado);
		beanResponse.setEstatusAgregar(numeroEmpleado > 0 ? "Exito al insertar" : "Error en insertar");
		logger.info("SALIDA: " + beanResponse.toString());
		
		return beanResponse;

	}

	@PutMapping("/")
	public ActualizarTrabajadoresBeanResponse actualizarTrabajador(@RequestBody ActualizarTrabajadoresBeanRequest request) {
		ActualizarTrabajadoresBeanResponse response = new ActualizarTrabajadoresBeanResponse();

		response.setNumeroEmpleado(request.getNumeroEmpleado());
		response.setEstatusEmpleado(
				trabajadoresService.actualizarTrabajador(request.getNumeroEmpleado(), request.getNombreEmpleado(),
						request.getApellidosEmpleado(), request.getDiasTrabajados(), request.isEstatusEmpleado(), request.getUsuarioRegistro())
								? "Se actualizo correctamente"
								: "Error al actualizar");
		return response;

	}

	@DeleteMapping("/")
	public EliminarTrabajadorBeanResponse eliminarTrabajador(@RequestBody EliminarTrabajadorBeanRequest request) {
		EliminarTrabajadorBeanResponse response = new EliminarTrabajadorBeanResponse();
		response.setNumeroEmpleado(request.getNumeroEmpleado());
		response.setEstatusEmpleado(trabajadoresService.eliminarTrabajador(request.getNumeroEmpleado()) ? "Se elimino correctamente": "Error al eliminar");

		return response;
	}

}
