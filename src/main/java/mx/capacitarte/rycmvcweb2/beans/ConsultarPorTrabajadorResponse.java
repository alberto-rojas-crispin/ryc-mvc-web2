package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;
import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.TrabajadorVO;

public class ConsultarPorTrabajadorResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ConsultarTrabajadoresResponse> trabajadores;
	
	
	
	
	
	public ConsultarPorTrabajadorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsultarPorTrabajadorResponse(List<ConsultarTrabajadoresResponse> trabajadores) {
		super();
		this.trabajadores = trabajadores;
	}
	public List<ConsultarTrabajadoresResponse> getTrabajadores() {
		return trabajadores;
	}
	public void setTrabajadores(List<ConsultarTrabajadoresResponse> trabajadores) {
		this.trabajadores = trabajadores;
	}

	
	
	
	

}
