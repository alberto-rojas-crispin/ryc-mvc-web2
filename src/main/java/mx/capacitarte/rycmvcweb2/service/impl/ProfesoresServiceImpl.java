package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;
import mx.capacitarte.rycmvcweb2.dao.IProfesoresDAO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.ProfesoresMapper;
import mx.capacitarte.rycmvcweb2.service.IProfesoresService;

@Service("profesoresService")
public class ProfesoresServiceImpl implements IProfesoresService {
	
	@Autowired
	IProfesoresDAO profesoresDAO;
	
	@Autowired
	ProfesoresMapper profesoresMapper;
	
	@Override
	public List<ProfesorVO> consultarProfesores() {
		// TODO Auto-generated method stub
		return profesoresMapper.consultarProfesores();
	}

	@Override
	public Integer agregarProfesor(ProfesorVO profesorVO) {
		// TODO Auto-generated method stub
		return profesoresMapper.agregarProfesor(profesorVO) >= 1 ? profesoresMapper.consultarIdGenerado() : 0;

	}

	@Override
	public String eliminarProfesor(Integer idProfesor) {
		// TODO Auto-generated method stub
		return profesoresMapper.eliminarProfesor(idProfesor) ? "El profesor  con el Id " + idProfesor + " quedo eliminado"
				: "El profesor con el Id " + idProfesor + " no existe";
	}

}
