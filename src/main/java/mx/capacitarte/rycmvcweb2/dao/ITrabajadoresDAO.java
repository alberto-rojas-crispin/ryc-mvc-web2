package mx.capacitarte.rycmvcweb2.dao;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;

public interface ITrabajadoresDAO {
	
	public List<TrabajadorVO> consultarTrabajadores();

	public List<TrabajadorVO> consultaPorTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado);
	
	public Integer agregarTrabajador(TrabajadorVO trabajadorVO);
	
	public Boolean actualizarTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado, int diasTrabajados, boolean estatusEmpleado);
	
	public Boolean eliminarTrabajador(Integer numeroEmpleado);
}
