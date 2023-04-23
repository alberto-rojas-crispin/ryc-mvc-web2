package mx.capacitarte.rycmvcweb2.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;

@Mapper
public interface VentasMapper {
	
public Integer consultarFolioGenerado();
	
	public List<VentaVO> consultar();//por id y por fecha creacion 
	
	public List<VentaVO> consultarVentasTotales();//ordenarlo por folio y id producto 
	
	public List<VentaVO> consultarVentaPersonalizada(Integer numeroFolio, Integer idProducto, Boolean vigencia);

	public Integer agregarVenta(VentaVO ventaVO);
	
	public Integer agregarVentaFolio(List<VentaVO> ventasVO);
	
	public Boolean actualizarVenta(VentaVO ventaVO);
	
	public Boolean eliminarVenta(Integer numeroFolio);
	
	public int ventaInventario(int idProducto);

	public void ventaInventarioCantidad(int idProducto, int cantidad);
	
	public Integer agregarVentaFolio(VentaVO ventaVO);

}

