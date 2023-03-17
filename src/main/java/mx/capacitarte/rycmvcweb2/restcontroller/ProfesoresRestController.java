package mx.capacitarte.rycmvcweb2.restcontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;
import mx.capacitarte.rycmvcweb2.service.IProfesoresService;

@RestController
public class ProfesoresRestController {
	
	@Autowired
	IProfesoresService profesoresService;
	
	@RequestMapping("/agregarProfesor/{strProfesor}")
	public String agregarAlumno(@PathVariable String strProfesor) {
		
		String[] arrProfesor = strProfesor.split(Pattern.quote("_"));
	
		if(arrProfesor.length >= 4 ) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			ProfesorVO profesorVO = new ProfesorVO();
			profesorVO.setNombre(arrProfesor[0]);
			profesorVO.setApellidoPaterno(arrProfesor[1]);
			profesorVO.setApellidoMaterno(arrProfesor[2]);
			profesorVO.setEdad(arrProfesor[3]);
			profesorVO.setFechaRegistro(sdf.format(new Date()));
			
			Integer idProfesor = profesoresService.agregarProfesor(profesorVO);
			
			return "El profesor se registro con el id " + idProfesor;
		} else {
			return "Parametro de entrada Invalido";
			
		}
		
		
	}
	@RequestMapping("/eliminarProfesor/{idProfesor}")
	public String eliminarProfesor(@PathVariable Integer idProfesor) {
		
		return profesoresService.eliminarProfesor(idProfesor);
	}
}
