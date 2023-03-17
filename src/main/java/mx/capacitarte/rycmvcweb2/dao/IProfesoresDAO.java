package mx.capacitarte.rycmvcweb2.dao;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;

public interface IProfesoresDAO {
	
	public List<ProfesorVO> consultarProfesores();
	
	public Integer agregarProfesor(ProfesorVO profesorVO);
	
	public Boolean eliminarProfesor(Integer idProfesor);
	

}
