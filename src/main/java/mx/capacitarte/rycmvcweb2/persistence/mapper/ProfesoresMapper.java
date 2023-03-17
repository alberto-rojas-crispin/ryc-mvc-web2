package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;

@Mapper
public interface ProfesoresMapper {
	
public List<ProfesorVO> consultarProfesores();
	
	public Integer agregarProfesor(ProfesorVO profesorVO);
	public Integer consultarIdGenerado();
	
	public Boolean eliminarProfesor(Integer idProfesor);

}
