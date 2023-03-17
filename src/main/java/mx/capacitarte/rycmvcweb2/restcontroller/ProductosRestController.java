package mx.capacitarte.rycmvcweb2.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;
import mx.capacitarte.rycmvcweb2.beans.ActualizarProductoBeanRequest;
import mx.capacitarte.rycmvcweb2.beans.ActualizarProductoBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.ConsultarProductoBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.EliminarProductoBeanRequest;
import mx.capacitarte.rycmvcweb2.beans.EliminarProductoBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.InsertarProductoBeanResponse;
import mx.capacitarte.rycmvcweb2.beans.ProductoBean;
import mx.capacitarte.rycmvcweb2.service.IProductosService;




@RestController
@RequestMapping("/rest/productos")
public class ProductosRestController {
	
	@Autowired
	IProductosService productosService;

	@GetMapping("/")
	public List<ProductoBean> consultarProductos(){
		System.out.println("Ejecutando GetMapping - todos");
		List<ProductoVO> productosVO = new ArrayList<ProductoVO>();

		productosVO = productosService.consultarProducto();
		
		List<ProductoBean> productosBean = new ArrayList<ProductoBean>();
	
	
		for (ProductoVO productoVO : productosVO) {
			ProductoBean  productoBean = new ProductoBean(productoVO.getIdProducto(), productoVO.getDescProducto(),productoVO.getIdCategoria(),productoVO.getDescCategoria(),productoVO.getIdTipoUnidad(),productoVO.getDescTipoUnidad(),productoVO.getCodigoBarra());
			productosBean.add(productoBean);
		}
		return productosBean;
	}
	
	@GetMapping("/{idProducto}")
	public List<ProductoBean> buscarPorIdProducto(@PathVariable("idProducto") Integer idProducto) {
		List<ProductoVO> productosVO = new ArrayList<ProductoVO>();

		productosVO = productosService.buscarProductoPorId(idProducto);
		
		List<ProductoBean> productosBean = new ArrayList<ProductoBean>();
	
	
		for (ProductoVO productoVO : productosVO) {
			ProductoBean  productoBean = new ProductoBean(productoVO.getIdProducto(), productoVO.getDescProducto(),productoVO.getIdCategoria(),productoVO.getDescCategoria(),productoVO.getIdTipoUnidad(),productoVO.getDescTipoUnidad(),productoVO.getCodigoBarra());
			productosBean.add(productoBean);
		}
		return productosBean;
	}
	@GetMapping("/consultarPorNombreYId/{idProducto}/{descProducto}")
	public List<ProductoBean> consultarPorNombreYId(@PathVariable("idProducto") Integer idProducto, @PathVariable("descProducto") String descProducto) {
		
		List<ProductoVO> productosVO = new ArrayList<ProductoVO>();

		productosVO = productosService.consultarPorNombreYId(idProducto, descProducto);
		
		List<ProductoBean> productosBean = new ArrayList<ProductoBean>();
	
	
		for (ProductoVO productoVO : productosVO) {
			ProductoBean  productoBean = new ProductoBean(productoVO.getIdProducto(), productoVO.getDescProducto(),productoVO.getIdCategoria(),productoVO.getDescCategoria(),productoVO.getIdTipoUnidad(),productoVO.getDescTipoUnidad(),productoVO.getCodigoBarra());
			productosBean.add(productoBean);
		}
		return productosBean;
	}
		
		
	@GetMapping("/consultar")
	public ConsultarProductoBeanResponse consultarNombreProducto(@RequestParam(name = "producto") String producto, @RequestParam(name = "id") Integer id) {
		ConsultarProductoBeanResponse response = new ConsultarProductoBeanResponse();
		response.setIdProducto(id);
		response.setDescProducto(producto);
		
		List<ProductoVO> productosVO = new ArrayList<ProductoVO>();

		productosVO = productosService.consultarPorNombreYId(id, producto);
		
		List<ProductoBean> productosBean = new ArrayList<ProductoBean>();
	
	
		for (ProductoVO productoVO : productosVO) {
			ProductoBean  productoBean = new ProductoBean(productoVO.getIdProducto(), productoVO.getDescProducto(),productoVO.getIdCategoria(),productoVO.getDescCategoria(),productoVO.getIdTipoUnidad(),productoVO.getDescTipoUnidad(),productoVO.getCodigoBarra());
			productosBean.add(productoBean);
		}
		response.setProductos(productosBean);
		return response;
	}
	
	@PostMapping("/")
	public InsertarProductoBeanResponse insertarProducto(@RequestBody ProductoBean productoBean) {
		System.out.println("Ejecutando PostMapping");
		ProductoVO productoVO = new ProductoVO();
		productoVO.setIdProducto(productoBean.getIdProducto());
		productoVO.setDescProducto(productoBean.getDescProducto());
		productoVO.setIdCategoria(productoBean.getIdCategoria());
		productoVO.setDescCategoria(productoBean.getDescCategoria());
		productoVO.setIdTipoUnidad(productoBean.getIdTipoUnidad());
		productoVO.setDescTipoUnidad(productoBean.getDescTipoUnidad());
		productoVO.setCodigoBarra(productoBean.getCodigoBarra());
		
		Integer idProducto = productosService.agregarProducto(productoVO);
		
		
		InsertarProductoBeanResponse beanResponse = new InsertarProductoBeanResponse();
		beanResponse.setIdProducto(productoBean.getIdProducto());
		
		beanResponse.setEstatusInsercion( idProducto > 0 ? true:false);
		
		//Pasar ProductoBean a ProductoVO
		//Boolean estatusInsert = productoService.insertarProducto(ProductoVO);
		return beanResponse;
	}
	
	@PutMapping("/")
	public ActualizarProductoBeanResponse actualizarProducto(@RequestBody ActualizarProductoBeanRequest request) {
		System.out.println("Ejecutando PutMapping: " + request.getCodigoBarra());
		ProductoVO productoVO = new ProductoVO();
		ActualizarProductoBeanResponse beanResponse = new ActualizarProductoBeanResponse();
		productoVO.setIdProducto(request.getIdProducto());
		productoVO.setCodigoBarra(request.getCodigoBarra());
		productoVO.setDescProducto(request.getDescProducto());
		
		beanResponse.setIdProducto(request.getIdProducto());
		beanResponse.setEstatusAct(productosService.actualizarProducto(productoVO));
		
		return beanResponse;
	}
	
	@DeleteMapping("/")
	public EliminarProductoBeanResponse eliminarProducto(@RequestBody EliminarProductoBeanRequest request) {
		System.out.println("Eliminando producto: " + request.getIdProducto());
		
		EliminarProductoBeanResponse beanResponse = new EliminarProductoBeanResponse();
		beanResponse.setIdProducto(request.getIdProducto());
		beanResponse.setEstatusEliminacion(productosService.eliminarProducto(request.getIdProducto()));
		
		return beanResponse;
	}
	
}
