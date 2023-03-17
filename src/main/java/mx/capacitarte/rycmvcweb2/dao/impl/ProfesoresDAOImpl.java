package mx.capacitarte.rycmvcweb2.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mx.capacitarte.rycmvcweb2.VO.ProfesorVO;
import mx.capacitarte.rycmvcweb2.dao.IProfesoresDAO;

@Repository
public class ProfesoresDAOImpl implements IProfesoresDAO {

	private static List<ProfesorVO> profesores = new ArrayList<ProfesorVO>();
	static int idProfesor = 0;
	
	static {
		profesores.add(new ProfesorVO(++idProfesor, "Fernando","Barbosa","Garcia", "20","01/02/25"));
	}
	
	@Override
	public List<ProfesorVO> consultarProfesores() {
		// TODO Auto-generated method stub
		return profesores;
	}

	@Override
	public Integer agregarProfesor(ProfesorVO profesorVO) {
		// TODO Auto-generated method stub
		profesores.add(new ProfesorVO(++idProfesor, profesorVO.getNombre(),profesorVO.getApellidoPaterno(),profesorVO.getApellidoMaterno(),profesorVO.getEdad(),profesorVO.getFechaRegistro()));

		return idProfesor;
	}

	@Override
	public Boolean eliminarProfesor(Integer idProfesor) {
		
		Boolean statusEliminacion = false;
		
		for (ProfesorVO profesorVO : profesores) {
			if(profesorVO.getId() == idProfesor.intValue()) {
				profesores.remove(profesorVO);
				statusEliminacion = true;
				break;
			}
		}
		return statusEliminacion;
	}

}
