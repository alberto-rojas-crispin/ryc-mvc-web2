package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;
import mx.capacitarte.rycmvcweb2.beans.ConsultarTrabajadoresResponse;
import mx.capacitarte.rycmvcweb2.beans.TrabajadorBean;
import mx.capacitarte.rycmvcweb2.service.ITrabajadoresService;

@Controller
public class TrabajadorController {

	@Autowired
	ITrabajadoresService TrabajadoresService;

	@RequestMapping("/consultarTrabajadores")
	public String consulta(Model modelo) {
		List<TrabajadorVO> trabajadoresVO = new ArrayList<TrabajadorVO>();

	trabajadoresVO = TrabajadoresService.consultarTrabajadores();
		
	List<ConsultarTrabajadoresResponse> trabajadoresBeans = new ArrayList<ConsultarTrabajadoresResponse>();
		
	
		for (TrabajadorVO trabajadorVO : trabajadoresVO) {
			ConsultarTrabajadoresResponse trabajadorBean = new ConsultarTrabajadoresResponse(trabajadorVO.getNumeroEmpleado(),trabajadorVO.getNombreEmpleado(), trabajadorVO.getApellidosEmpleado(), trabajadorVO.getFechaIngreso(), trabajadorVO.getDiasTrabajados(), trabajadorVO.getSalarioTotal(), trabajadorVO.isEstatusEmpleado() ? "Activo": "Inactivo", trabajadorVO.getUsuarioRegistro());
			trabajadoresBeans.add(trabajadorBean);
		}
		
	
		modelo.addAttribute("trabajadores",trabajadoresBeans);
		return "consultarTrabajadores";
	}

}
