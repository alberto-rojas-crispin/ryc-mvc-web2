package mx.capacitarte.rycmvcweb2.service;

import java.util.List;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.beans.VentaBean;

public interface IVentasService {
	
	public Integer consultarFolioGenerado();
	
	public List<VentaVO> consultar();//por id y por fecha creacion 
	
	public List<VentaVO> consultarVentasTotales();//ordenarlo por folio y id producto 
	
	public List<VentaVO> consultarVentaPersonalizada(Integer numeroFolio, Integer idProducto, Boolean vigencia);

	public Integer agregarVenta(VentaVO ventaVO);

	public Boolean actualizarVenta(VentaVO ventaVO);
	
	public Boolean eliminarVenta(Integer numeroFolio);

	public Integer agregarVentaFolio(List<VentaVO> ventasVO);
}
