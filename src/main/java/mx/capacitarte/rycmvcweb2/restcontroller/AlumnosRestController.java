package mx.capacitarte.rycmvcweb2.restcontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;
import mx.capacitarte.rycmvcweb2.service.IAlumnosService;

@RestController
public class AlumnosRestController {
	
	@Autowired
	IAlumnosService alumnosService;
	
	
	
	
	
	
	@RequestMapping("/agregar/{strAlumno}")
	public String agregarAlumno(@PathVariable String strAlumno) {
		
		String[] arrAlumno = strAlumno.split(Pattern.quote("_"));
			
		if(arrAlumno.length >= 2) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			AlumnoVO alumnoVO = new AlumnoVO();
			alumnoVO.setNombre(arrAlumno[0]);
			alumnoVO.setApellido(arrAlumno[1]);
			alumnoVO.setFechaRegistro(sdf.format(new Date()));
			Integer idAlumno = alumnosService.agregarAlumno(alumnoVO);
			
			return "El alumno se registro con el id " + idAlumno;
		} else {
			return "Parametro de entrada Invalido";
			
		}
		
	}
	
	@RequestMapping("/eliminar/{idAlumno}")
	public String eliminarAlumno(@PathVariable Integer idAlumno) {
		
		return alumnosService.eliminarAlumno(idAlumno);
	}
	
}
