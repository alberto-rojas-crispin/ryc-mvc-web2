package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;
import mx.capacitarte.rycmvcweb2.beans.ProfesorBean;
import mx.capacitarte.rycmvcweb2.service.IProfesoresService;

@Controller
public class ProfesorController {
	 
	@Autowired
	IProfesoresService profesoresService;
	
	@RequestMapping("/consultarProfesores")
	public String consulta(Model modelo) {
		List<ProfesorVO> profesoresVO = new ArrayList<ProfesorVO>();
		
		profesoresVO =	profesoresService.consultarProfesores();
		
		List<ProfesorBean> profesoresBean = new ArrayList<ProfesorBean>();
		
		
		for (ProfesorVO profesorVO : profesoresVO) {
		ProfesorBean profesorBean = new ProfesorBean(profesorVO.getId(), profesorVO.getNombre(), profesorVO.getApellidoPaterno(),profesorVO.getApellidoMaterno(), profesorVO.getEdad(), profesorVO.getFechaRegistro());
		profesoresBean.add(profesorBean);
		}
		
		modelo.addAttribute("profesores", profesoresBean);
		return "consultarProfesores";

	} 

}
