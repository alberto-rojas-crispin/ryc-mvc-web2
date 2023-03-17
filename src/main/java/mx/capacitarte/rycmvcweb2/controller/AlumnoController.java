package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.beans.AlumnoBean;
import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;
import mx.capacitarte.rycmvcweb2.service.IAlumnosService;

@Controller
public class AlumnoController {
	
	@Autowired
	IAlumnosService alumnoService;

	@RequestMapping("/consultarAlumnos")
	public String consulta(Model modelo) {
		List<AlumnoVO> alumnosVO = new ArrayList<AlumnoVO>();
		alumnosVO =	alumnoService.consultarAlumnos();
		List<AlumnoBean> alumnosBean = new ArrayList<AlumnoBean>();
		for (AlumnoVO alumnoVO : alumnosVO) {
			AlumnoBean alumnoBean = new AlumnoBean(alumnoVO.getId(), alumnoVO.getNombre(), alumnoVO.getApellido(), alumnoVO.getFechaRegistro());
			alumnosBean.add(alumnoBean);
		}
		System.out.println("HOLA...");
		modelo.addAttribute("alumnos", alumnosBean);
		return "consultarAlumno";

	}

}
