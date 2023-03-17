package mx.capacitarte.rycmvcweb2.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mx.capacitarte.rycmvcweb2.VO.AlumnoVO;
import mx.capacitarte.rycmvcweb2.dao.IAlumnosDAO;

@Repository
public class AlumnosDAOImpl implements IAlumnosDAO {

	private static List<AlumnoVO> alumnos = new ArrayList<AlumnoVO>();
	static int idAlumno = 0;
	static { 
		
		alumnos.add(new AlumnoVO(++idAlumno, "Fernando","Barbosa", "01/12/22"));
		alumnos.add(new AlumnoVO(++idAlumno, "Saul","Garcia", "11/12/22"));

	}
	
	@Override
	public List<AlumnoVO> consultarAlumnos(){
		
		return alumnos;
	}

	@Override
	public Integer agregarAlumno(AlumnoVO alumnoVO) {
		alumnos.add(new AlumnoVO(++idAlumno, alumnoVO.getNombre(),alumnoVO.getApellido(),alumnoVO.getFechaRegistro()));

		return idAlumno;
	}

	@Override
	public Boolean eliminarAlumno(Integer idAlumno) {

		Boolean statusEliminacion = false;

		for (AlumnoVO alumnoVO : alumnos) {
			if (alumnoVO.getId() == idAlumno.intValue()) {
				alumnos.remove(alumnoVO);
				statusEliminacion = true;
				break;
			}
		}

		return statusEliminacion;
	}

}
