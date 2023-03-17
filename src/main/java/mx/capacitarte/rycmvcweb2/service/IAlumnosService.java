package mx.capacitarte.rycmvcweb2.service;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;

public interface IAlumnosService {
	
	public List<AlumnoVO> consultarAlumnos();

	public Integer agregarAlumno(AlumnoVO alumnoVO);
	
	public String eliminarAlumno(Integer idAlumno);
	

}
