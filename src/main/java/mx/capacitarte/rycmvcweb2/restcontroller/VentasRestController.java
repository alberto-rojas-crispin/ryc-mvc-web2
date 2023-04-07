package mx.capacitarte.rycmvcweb2.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.VentaVO;
import mx.capacitarte.rycmvcweb2.beans.VentaBean;
import mx.capacitarte.rycmvcweb2.service.IVentasService;

@RestController
@RequestMapping("/rest/ventas")
public class VentasRestController {
	
	@Autowired
	IVentasService ventasService;
	
	@GetMapping("/")
	public List<VentaBean> consultarVentasTotales() {
		
		List<VentaVO> ventasVOList = new ArrayList<VentaVO>();
		
		ventasVOList = ventasService.consultarVentasTotales();
		
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
		return ventaBeanList;
		
		
		
	}

}
