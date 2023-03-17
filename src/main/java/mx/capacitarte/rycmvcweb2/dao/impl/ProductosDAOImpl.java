package mx.capacitarte.rycmvcweb2.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mx.capacitarte.rycmvcweb2.VO.ProductoVO;
import mx.capacitarte.rycmvcweb2.dao.IProductosDAO;

@Repository
public class ProductosDAOImpl implements IProductosDAO {
	
	private static List<ProductoVO> productos = new ArrayList<ProductoVO>();
	
	static int idProducto = 0;
	static {
		productos.add(new ProductoVO(++idProducto, "Jeringas", ++idProducto,"Otros",++idProducto,"Cajas", "0451085141"));
	}
	
	
	
	@Override
	public List<ProductoVO> consultarProductos() {
		// TODO Auto-generated method stub
		return productos;
	}

	@Override
	public Integer agregarProducto(ProductoVO productoVO) {
		// TODO Auto-generated method stub
		Integer idProductoGenerado = ++idProducto;
		productos.add(new ProductoVO(idProductoGenerado, productoVO.getDescProducto(), ++idProducto,productoVO.getDescCategoria(), ++idProducto, productoVO.getDescTipoUnidad(), productoVO.getCodigoBarra()));
		
		return idProductoGenerado;
	}

	@Override
	public Boolean eliminarProducto(Integer idProducto) {
		// TODO Auto-generated method stub
		
		Boolean statusEliminacion = false;
		
		for (ProductoVO productoVO : productos) {
			if (productoVO.getIdProducto() == idProducto.intValue()){
				productos.remove(productoVO);
				statusEliminacion = true;
				break;
				
			}
		}
		
		return statusEliminacion;
	}

	@Override
	public List<ProductoVO> buscarProductoPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		List<ProductoVO> productosVO = new ArrayList<ProductoVO>();
		
		for (ProductoVO productoVO : productos) {
			
			if (productoVO.getIdProducto() == idProducto.intValue()){
				productosVO.add(productoVO);
			}
		}
		return productosVO;
		
	}

	@Override
	public List<ProductoVO> consultarPorNombreYId(Integer idProducto, String descProducto) {
		// TODO Auto-generated method stub
List<ProductoVO> productosVO = new ArrayList<ProductoVO>();
		
		for (ProductoVO productoVO : productos) {
			if (productoVO.getIdProducto() == idProducto && (productoVO.getDescProducto().equals(descProducto))){
				productosVO.add(productoVO);
			}
		}
		return productosVO;
	}

	@Override
	public Boolean actualizarProducto(Integer idProducto, String codigoBarra, String descProducto) {
		// TODO Auto-generated method stub
		Boolean statusActualizacion = false;
		
		for (ProductoVO productoVO : productos) {
			if (productoVO.getIdProducto() == idProducto.intValue()){
				productoVO.setCodigoBarra(codigoBarra);
				productoVO.setDescProducto(descProducto);
				statusActualizacion = true;
				break;
				
			}
		}
		
		return statusActualizacion;
	}

}
