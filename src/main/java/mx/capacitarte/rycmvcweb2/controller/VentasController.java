package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.beans.VentaBean;
import mx.capacitarte.rycmvcweb2.beans.VentaBeanArticulos;
import mx.capacitarte.rycmvcweb2.persistence.mapper.VentasMapper;
import mx.capacitarte.rycmvcweb2.service.IVentasService;

@Controller
public class VentasController {
	
	@Autowired
	IVentasService ventasService;
	@Autowired
	VentasMapper ventasMapper;
	
	@RequestMapping("/consultarVentas")
	public String consulta(Model modelo) {
		
		List<VentaVO> ventasVOList = new ArrayList<VentaVO>();
		
		ventasVOList = ventasService.consultar();
		
		List<VentaBean> ventaBeanList = new ArrayList<VentaBean>();
		
		for (VentaVO ventaVO : ventasVOList) {
			
			VentaBean ventaBean = new VentaBean(
					ventaVO.getNumeroFolio(),
					ventaVO.getIdProducto(),
					ventaVO.getDescProducto(),
					ventaVO.getCantidad(),
					ventaVO.getIdTipoUnidad(),
					ventaVO.getDescTipoUnidad(),
					ventaVO.getIdPrecio(),
					ventaVO.getPrecioTotal(),
					ventaVO.getVigencia(),
					ventaVO.getFechaCreacion(),
					ventaVO.getUsuarioCreacion(),
					ventaVO.getFechaActualizacion(),
					ventaVO.getUsuarioActualizacion()
					);
			ventaBeanList.add(ventaBean);
		}
		modelo.addAttribute("ventas" , ventaBeanList);
		return "consultarVentas";
	}
	
	@RequestMapping("/consultarVentasFolio/{numeroFolio}")
	public String consulta(Model modelo, @PathVariable int numeroFolio, Model modelo2) {
		VentaBeanArticulos ventaArticulos = new VentaBeanArticulos();
		
		List<VentaVO> ventasVOList = new ArrayList<VentaVO>();
		
		ventasVOList = ventasService.consultarVentaPersonalizada(numeroFolio, null, null);
		
		List<VentaBean> ventaBeanList = new ArrayList<VentaBean>();
	
		int bandera = 0;
		
		for (VentaVO ventaVO : ventasVOList) {
			
				VentaBean ventaBean = new VentaBean(
					ventaVO.getNumeroFolio(),
					ventaVO.getIdProducto(),
					ventaVO.getDescProducto(),
					ventaVO.getCantidad(),
					ventaVO.getIdTipoUnidad(),
					ventaVO.getDescTipoUnidad(),
					ventaVO.getIdPrecio(),
					ventaVO.getPrecioTotal(),
					ventaVO.getVigencia(),
					ventaVO.getFechaCreacion(),
					ventaVO.getUsuarioCreacion(),
					ventaVO.getFechaActualizacion(),
					ventaVO.getUsuarioActualizacion()
					);
			ventaBeanList.add(ventaBean);
				
		
			
			if(bandera == 0) {
				ventaArticulos.setNumeroFolio(ventaVO.getNumeroFolio());
				ventaArticulos.setFechaCreacion(ventaVO.getFechaCreacion());
				ventaArticulos.setPrecioTotal(ventasMapper.consultarPrecio(ventaVO));
				ventaArticulos.setUsuarioCreacion(ventaVO.getUsuarioCreacion());
				
				bandera = 1;
			}
			
			
		}
		modelo.addAttribute("ventas" , ventaBeanList);
		modelo2.addAttribute("ventasPrecio", ventaArticulos);
		
		
		return "consultarVentasFolio";
	}
}
