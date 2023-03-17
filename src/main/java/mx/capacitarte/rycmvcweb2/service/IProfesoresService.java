package mx.capacitarte.rycmvcweb2.service;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;

public interface IProfesoresService {
	
public List<ProfesorVO> consultarProfesores();
	
	public Integer agregarProfesor(ProfesorVO profesorVO);
	
	public String eliminarProfesor(Integer idProfesor);
	

}
