package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class InsertarVentaBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer folioGenerado;

	private String estatusAgregar;

	public InsertarVentaBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFolioGenerado() {
		return folioGenerado;
	}

	public void setFolioGenerado(Integer folioGenerado) {
		this.folioGenerado = folioGenerado;
	}

	public String getEstatusAgregar() {
		return estatusAgregar;
	}

	public void setEstatusAgregar(String estatusAgregar) {
		this.estatusAgregar = estatusAgregar;
	}
	
	
}

