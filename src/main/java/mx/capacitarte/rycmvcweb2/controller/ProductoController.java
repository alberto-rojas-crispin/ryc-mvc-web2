package mx.capacitarte.rycmvcweb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;
import mx.capacitarte.rycmvcweb2.beans.ProductoBean;
import mx.capacitarte.rycmvcweb2.service.IProductosService;

@Controller
public class ProductoController {
	
	@Autowired
	IProductosService productosService;
	
	@RequestMapping("/consultarProductos")
	public String consulta(Model modelo) {
		List<ProductoVO> productosVO = new ArrayList<ProductoVO>();

		productosVO = productosService.consultarProducto();
		
		List<ProductoBean> productosBean = new ArrayList<ProductoBean>();
	
	
		for (ProductoVO productoVO : productosVO) {
			ProductoBean  productoBean = new ProductoBean(productoVO.getIdProducto(), productoVO.getDescProducto(),productoVO.getIdCategoria(),productoVO.getDescCategoria(),productoVO.getIdTipoUnidad(),productoVO.getDescTipoUnidad(),productoVO.getCodigoBarra());
			productosBean.add(productoBean);
		}
		modelo.addAttribute("productos",productosBean);
		return "consultarProductos";
	}
	
	

}
