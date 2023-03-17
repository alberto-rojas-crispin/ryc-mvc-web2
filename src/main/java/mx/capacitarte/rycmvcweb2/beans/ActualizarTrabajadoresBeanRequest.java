package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class ActualizarTrabajadoresBeanRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	    private Integer numeroEmpleado;
		private String nombreEmpleado;
		private String apellidosEmpleado;
		private int diasTrabajados;
		private boolean estatusEmpleado;
		private String usuarioRegistro;
		
		public ActualizarTrabajadoresBeanRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ActualizarTrabajadoresBeanRequest(int numeroEmpleado, String nombreEmpleado, String apellidosEmpleado,
				int diasTrabajados, boolean estatusEmpleado, String usuarioRegistro) {
			super();
			this.numeroEmpleado = numeroEmpleado;
			this.nombreEmpleado = nombreEmpleado;
			this.apellidosEmpleado = apellidosEmpleado;
			this.diasTrabajados = diasTrabajados;
			this.estatusEmpleado = estatusEmpleado;
			this.usuarioRegistro = usuarioRegistro;
		}
		public int getNumeroEmpleado() {
			return numeroEmpleado;
		}
		public void setNumeroEmpleado(int numeroEmpleado) {
			this.numeroEmpleado = numeroEmpleado;
		}
		public String getNombreEmpleado() {
			return nombreEmpleado;
		}
		public void setNombreEmpleado(String nombreEmpleado) {
			this.nombreEmpleado = nombreEmpleado;
		}
		public String getApellidosEmpleado() {
			return apellidosEmpleado;
		}
		public void setApellidosEmpleado(String apellidosEmpleado) {
			this.apellidosEmpleado = apellidosEmpleado;
		}
		public int getDiasTrabajados() {
			return diasTrabajados;
		}
		public void setDiasTrabajados(int diasTrabajados) {
			this.diasTrabajados = diasTrabajados;
		}
		public boolean isEstatusEmpleado() {
			return estatusEmpleado;
		}
		public void setEstatusEmpleado(boolean estatusEmpleado) {
			this.estatusEmpleado = estatusEmpleado;
		}
		public String getUsuarioRegistro() {
			return usuarioRegistro;
		}
		public void setUsuarioRegistro(String usuarioRegistro) {
			this.usuarioRegistro = usuarioRegistro;
		}
		
		
		
	

}
