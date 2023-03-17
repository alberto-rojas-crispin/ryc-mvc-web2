package mx.capacitarte.rycmvcweb2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;
import mx.capacitarte.rycmvcweb2.dao.ITrabajadoresDAO;
import mx.capacitarte.rycmvcweb2.persistence.mapper.TrabajadoresMapper;
import mx.capacitarte.rycmvcweb2.service.ITrabajadoresService;

@Service("trabajadoresService")
public class TrabajadoresServiceImpl implements ITrabajadoresService {

	@Autowired
	ITrabajadoresDAO trabajadoresDAO;

	@Autowired
	TrabajadoresMapper trabajadoresMapper;
	

	@Override
	public List<TrabajadorVO> consultarTrabajadores() {
		// TODO Auto-generated method stub
		return trabajadoresMapper.consultarTrabajadores();
	}

	@Override
	public List<TrabajadorVO> consultaPorTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado) {
		// TODO Auto-generated method stub
		return trabajadoresMapper.consultaPorTrabajador(numeroEmpleado,nombreEmpleado,apellidosEmpleado);
	}

	@Override
	public Integer agregarTrabajador(TrabajadorVO trabajadorVO) {
		// TODO Auto-generated method stub
		//Logica Valor dias y setear 
		
		trabajadorVO.setSalarioTotal(trabajadorVO.getDiasTrabajados() * 870); 
		
		return trabajadoresMapper.agregarTrabajador(trabajadorVO) >= 1 ? trabajadoresMapper.consultarIdGenerado() : 0;
	}

	@Override
	public Boolean actualizarTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado, int diasTrabajados, boolean estatusEmpleado, String usuarioRegistro) {
		// TODO Auto-generated method stub
		//logica daTO final
		
		
		
		return trabajadoresMapper.actualizarTrabajador(numeroEmpleado, nombreEmpleado, apellidosEmpleado, diasTrabajados, estatusEmpleado, usuarioRegistro);
	}

	@Override
	public Boolean eliminarTrabajador(Integer numeroEmpleado) {
		// TODO Auto-generated method stub
		return trabajadoresMapper.eliminarTrabajador(numeroEmpleado);
	}

}
