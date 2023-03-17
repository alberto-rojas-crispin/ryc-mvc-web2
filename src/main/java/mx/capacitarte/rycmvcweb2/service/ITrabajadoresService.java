package mx.capacitarte.rycmvcweb2.service;

import java.util.List;


import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;

public interface ITrabajadoresService {
	
	public List<TrabajadorVO> consultarTrabajadores();

	public List<TrabajadorVO> consultaPorTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado);
	
	public Integer agregarTrabajador(TrabajadorVO trabajadorVO);
	
	public Boolean actualizarTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado, int diasTrabajados, boolean estatusEmpleado, String usuarioRegistro);
	
	public Boolean eliminarTrabajador(Integer numeroEmpleado);
}
