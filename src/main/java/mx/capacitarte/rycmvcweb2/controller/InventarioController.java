package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.InventarioVO;
import mx.capacitarte.rycmvcweb2.beans.InventarioBean;
import mx.capacitarte.rycmvcweb2.beans.InventarioBeanController;
import mx.capacitarte.rycmvcweb2.service.IInventarioService;

@Controller
public class InventarioController {
	
	@Autowired
	IInventarioService inventarioService;
	
	@RequestMapping("/consultarInventario")
	public String consulta(Model modelo) {
		
		List<InventarioVO> inventariosVOList = new ArrayList<InventarioVO>();
		
		inventariosVOList = inventarioService.consultarInventario();
		
		List<InventarioBean> inventariosBeanList = new ArrayList<InventarioBean>();
		
		for (InventarioVO inventarioVO : inventariosVOList) {
			
			InventarioBean inventarioBean = new InventarioBean(
					inventarioVO.getNumeroFolio(),
					inventarioVO.getIdProducto(),
					inventarioVO.getDescProducto(),
					inventarioVO.getCantidad(),
					inventarioVO.getIdTipoUnidad(),
					inventarioVO.getCaducidadProducto(),
					inventarioVO.getCostoUnitario(),
					inventarioVO.getCostoTotal(),
					inventarioVO.getIdPrecio(),
					inventarioVO.getTipoMovimiento(),
					inventarioVO.getTipoMovimientoDesc(),
					inventarioVO.getVigencia(),
					inventarioVO.getFechaAprobacion(),
					inventarioVO.getUsuarioAprobacion(),
					inventarioVO.getFechaCreacion(),
					inventarioVO.getUsuarioCreacion(),
					inventarioVO.getFechaActualizacion(),
					inventarioVO.getUsuarioActualizacion()
					);
		inventariosBeanList.add(inventarioBean);
		}
		modelo.addAttribute("inventarios" , inventariosBeanList);
		return "consultarInventario";
		
		
		
	}

	
	@RequestMapping("/consultarInventarioTotal")
	public String consultaTotal(Model modelo) {
		
		List<InventarioVO> inventariosVOList = new ArrayList<InventarioVO>();
		
		inventariosVOList = inventarioService.consultarInventarioTotal();
		
		List<InventarioBeanController> inventariosTotalesBeanList = new ArrayList<InventarioBeanController>();
		
		for (InventarioVO inventarioVO : inventariosVOList) {
			
			InventarioBeanController inventarioBeanController = new InventarioBeanController(inventarioVO.getIdProducto(), inventarioVO.getDescProducto(), inventarioVO.getCantidad());

			inventariosTotalesBeanList.add(inventarioBeanController);
		}
		modelo.addAttribute("inventariosTotales" , inventariosTotalesBeanList);
		return "consultarInventarioTotal";
		
		
		
	}
}
