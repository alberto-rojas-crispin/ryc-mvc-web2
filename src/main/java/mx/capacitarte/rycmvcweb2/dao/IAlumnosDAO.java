package mx.capacitarte.rycmvcweb2.dao;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;

public interface IAlumnosDAO {

	public List<AlumnoVO> consultarAlumnos();
	
	public Integer agregarAlumno(AlumnoVO alumnoVO);

	public Boolean eliminarAlumno(Integer idAlumno);

}
