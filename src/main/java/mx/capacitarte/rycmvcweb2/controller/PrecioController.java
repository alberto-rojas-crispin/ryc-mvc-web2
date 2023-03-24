package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.PrecioVO;
import mx.capacitarte.rycmvcweb2.beans.PrecioBean;
import mx.capacitarte.rycmvcweb2.service.IPreciosService;

@Controller
public class PrecioController {

	@Autowired
	IPreciosService preciosService;
	
	@RequestMapping("/consultarPrecios")
	public String consulta(Model modelo) {
		
		List<PrecioVO> preciosVO = new ArrayList<PrecioVO>();
		
		preciosVO = preciosService.consultarPrecios();

		List<PrecioBean> preciosBean = new ArrayList<PrecioBean>();
		
		for (PrecioVO precioVO : preciosVO) {
		
			PrecioBean precioBean = new PrecioBean (precioVO.getIdPrecio(),precioVO.getIdProducto(), precioVO.getDescProducto(), precioVO.getFechaInicio(), precioVO.getPrecioUnitario(), precioVO.getVigencia(), precioVO.getFechaCreacion(), precioVO.getUsuarioCreacion(), precioVO.getFechaActualizacion(), precioVO.getUsuarioActualizacion(), precioVO.getFechaVenta());
			
			preciosBean.add(precioBean);
			
		 }
		
		modelo.addAttribute("precios", preciosBean);
		return "consultarPrecios";
	}
	
	
}
