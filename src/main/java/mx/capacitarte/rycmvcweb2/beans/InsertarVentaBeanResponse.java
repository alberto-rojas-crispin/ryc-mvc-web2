package mx.capacitarte.rycmvcweb2.beans;

import java.io.Serializable;

public class InsertarVentaBeanResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int folioGenerado;

	private String estatusAgregar;

	public InsertarVentaBeanResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFolioGenerado() {
		return folioGenerado;
	}

	public void setFolioGenerado(int folioGenerado) {
		this.folioGenerado = folioGenerado;
	}

	public String getEstatusAgregar() {
		return estatusAgregar;
	}

	public void setEstatusAgregar(String estatusAgregar) {
		this.estatusAgregar = estatusAgregar;
	}
	
	
}

