package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;
import mx.capacitarte.rycmvcweb2.dao.IAlumnosDAO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.AlumnosMapper;
import mx.capacitarte.rycmvcweb2.service.IAlumnosService;

@Service("alumnosService")
public class AlumnosServiceImpl implements IAlumnosService {
	
	@Autowired
	IAlumnosDAO alumnosDAO;
	
	@Autowired
	AlumnosMapper alumnosMapper;
	
	
	
	@Override
	public List<AlumnoVO> consultarAlumnos() {
			
		return alumnosMapper.consultarAlumnos();
	}

	@Override
	public Integer agregarAlumno(AlumnoVO alumnoVO) {
		
		return alumnosMapper.agregarAlumno(alumnoVO) >= 1 ? alumnosMapper.consultarIdGenerado(): 0;
	}

	@Override
	public String eliminarAlumno(Integer idAlumno) {

		return alumnosMapper.eliminarAlumno(idAlumno) ? "El alumno con el Id " + idAlumno + " quedo eliminado"
				: "El alumno con el Id " + idAlumno + " no existe";
	}

}
