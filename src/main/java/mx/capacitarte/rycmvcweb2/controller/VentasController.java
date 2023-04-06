package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.beans.VentaBean;
import mx.capacitarte.rycmvcweb2.service.IVentasService;

@Controller
public class VentasController {
	
	@Autowired
	IVentasService ventasService;
	
	@RequestMapping("/consultarVentas")
	
public String consulta(Model modelo) {
		
		List<VentaVO> ventasVOList = new ArrayList<VentaVO>();
		
		ventasVOList = ventasService.consultar();
		
		List<VentaBean> ventaBeanList = new ArrayList<VentaBean>();
		
		for (VentaVO ventaVO : ventasVOList) {
			
			VentaBean ventaBean = new VentaBean(
					ventaVO.getNumeroFolio(),
					ventaVO.getIdProducto(),
					ventaVO.getCantidad(),
					ventaVO.getIdTipoUnidad(),
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
	
	
}