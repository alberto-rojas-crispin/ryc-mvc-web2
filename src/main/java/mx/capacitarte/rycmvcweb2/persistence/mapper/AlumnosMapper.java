package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;

@Mapper
public interface AlumnosMapper {
	public List<AlumnoVO> consultarAlumnos();
	
	public Integer agregarAlumno(AlumnoVO alumnoVO);
	
	public Integer consultarIdGenerado();

	public Boolean eliminarAlumno(Integer idAlumno);

}
