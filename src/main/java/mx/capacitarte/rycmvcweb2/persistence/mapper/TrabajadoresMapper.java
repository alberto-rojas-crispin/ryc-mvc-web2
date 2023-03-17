package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;

@Mapper
public interface TrabajadoresMapper {
	
	public List<TrabajadorVO> consultarTrabajadores();

	public List<TrabajadorVO> consultaPorTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado);
	
	public Integer agregarTrabajador(TrabajadorVO trabajadorVO);
	public Integer consultarIdGenerado();
	
	public Boolean actualizarTrabajador(Integer numeroEmpleado, String nombreEmpleado, String apellidosEmpleado, int diasTrabajados, boolean estatusEmpleado, String usuarioRegistro);
	
	
	
	public Boolean eliminarTrabajador(Integer numeroEmpleado);
	 
}
