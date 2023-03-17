package mx.capacitarte.rycmvcweb2.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;
import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;
import mx.capacitarte.rycmvcweb2.dao.ITrabajadoresDAO;

@Repository
public class TrabajadoresDAOImpl implements ITrabajadoresDAO {

	public static List<TrabajadorVO> trabajadores = new ArrayList<TrabajadorVO>();
	static int id = 1000;
	
	
	@Override
	public List<TrabajadorVO> consultarTrabajadores() {
		// TODO Auto-generated method stub
		return trabajadores;
	}

	@Override
	public List<TrabajadorVO> consultaPorTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado) {
		// TODO Auto-generated method stub
		List<TrabajadorVO> trabajadoresVO = new ArrayList<TrabajadorVO>();
					int llave =0;

		for (TrabajadorVO trabajadorVO : trabajadores) { 
			    //Por numero
			if (trabajadorVO.getNumeroEmpleado() == numeroEmpleado && nombreEmpleado.equals("") && apellidosEmpleado.equals("")) { 
				llave = 1;
			} 
				//Por numero, nombre y apellido
			if(trabajadorVO.getNumeroEmpleado() == numeroEmpleado && trabajadorVO.getNombreEmpleado().contains(nombreEmpleado) && trabajadorVO.getApellidosEmpleado().contains(apellidosEmpleado)) {
				llave = 2;
			} 
				//Por nombre y apellido
			if(numeroEmpleado == 0 && trabajadorVO.getNombreEmpleado().contains(nombreEmpleado) && trabajadorVO.getApellidosEmpleado().contains(apellidosEmpleado)) {
				llave = 3;
			} 
				//Por numero y apellido
			if(trabajadorVO.getNumeroEmpleado() == numeroEmpleado && nombreEmpleado.equals("") && trabajadorVO.getApellidosEmpleado().contains(apellidosEmpleado)) {
				llave = 4;
			}
				//Por numero y nombre
			if(trabajadorVO.getNumeroEmpleado() == numeroEmpleado && trabajadorVO.getNombreEmpleado().contains(nombreEmpleado) && apellidosEmpleado.equals("")) {
				llave = 5;
			} 
				//Por nombre
			if(numeroEmpleado == 0 && trabajadorVO.getNombreEmpleado().contains(nombreEmpleado) && apellidosEmpleado.equals("")) {
				llave = 6;
			} 
				//Por apellido
			if(numeroEmpleado == 0 && nombreEmpleado.equals("") && trabajadorVO.getApellidosEmpleado().contains(apellidosEmpleado)) {
				llave = 7;
			}
			//Por ninguno
			if (numeroEmpleado == 0 && nombreEmpleado.equals("") && apellidosEmpleado.equals("")) { 
				llave = 0;
			}
			
		switch (llave) {
		
			case 0:
			break;
			
			case 1:
				trabajadoresVO.add(trabajadorVO);
				break;
			case 2:
				trabajadoresVO.add(trabajadorVO);
				break;
			case 3:
				trabajadoresVO.add(trabajadorVO);
				break;
			case 4:
				trabajadoresVO.add(trabajadorVO);
				break;
			case 5:
				trabajadoresVO.add(trabajadorVO);
				break;
			case 6:
				trabajadoresVO.add(trabajadorVO);
				break;
			case 7:
				trabajadoresVO.add(trabajadorVO);
				break;
			
				
			}
		llave = 0;
		}
		return trabajadoresVO;
	}

	@Override
	public Integer agregarTrabajador(TrabajadorVO trabajadorVO) {
		// TODO Auto-generated method stub
	Integer idProductoGenerado = ++id;
	 trabajadores.add(new TrabajadorVO(idProductoGenerado, trabajadorVO.getNombreEmpleado(), trabajadorVO.getApellidosEmpleado(),trabajadorVO.getFechaIngreso(), trabajadorVO.getDiasTrabajados(), trabajadorVO.getSalarioTotal(), trabajadorVO.isEstatusEmpleado(), trabajadorVO.getUsuarioRegistro()));

	
		return idProductoGenerado;
	}

	@Override
	public Boolean actualizarTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado, int diasTrabajados, boolean estatusEmpleado) {
		// TODO Auto-generated method stub
		 Boolean  estatusActualizar = false;
		 
		 for (TrabajadorVO trabajadorVO : trabajadores) {
			if(trabajadorVO.getNumeroEmpleado() == numeroEmpleado.intValue()) {
			
				trabajadorVO.setNombreEmpleado(nombreEmpleado);
				trabajadorVO.setApellidosEmpleado(apellidosEmpleado);
				trabajadorVO.setDiasTrabajados(diasTrabajados);
				trabajadorVO.setSalarioTotal(trabajadorVO.getDiasTrabajados() * 870);
				trabajadorVO.setEstatusEmpleado(estatusEmpleado);

				estatusActualizar = true;
				break;
			}
		}
		 
		return estatusActualizar;
	}

	@Override
	public Boolean eliminarTrabajador(Integer numeroEmpleado) {
		// TODO Auto-generated method stub
		 Boolean  estatusEliminar = false;
		 for (TrabajadorVO trabajadorVO : trabajadores) {
			 if (trabajadorVO.getNumeroEmpleado() == numeroEmpleado.intValue()) {
				 trabajadores.remove(trabajadorVO);
				 estatusEliminar = true;
				 break;
				 
			}
		}
		
		return estatusEliminar;
	}

}
