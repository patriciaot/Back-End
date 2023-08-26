package org.generation.Colibri.service;

import java.util.List;

import org.generation.Colibri.model.Productos;
import org.generation.Colibri.repository.ProductosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {

	public final ProductosRepository productosRepository;
	@Autowired
	
	public ProductosService(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}//constructor
	
	public List<Productos> getAllProductos() {
		return productosRepository.findAll();
	}//Método getAllProductos
	
	public Productos getProductos(Long id) {
		return productosRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("El producto con el id ["
						+ id + "] no existe") 
				);
	}//Método getProductos
	
	

	public Productos addProductos(Productos productos) {
		Productos tmp=null;
		if(productosRepository.findByNombre(productos.getNombre()).isEmpty()) {
			tmp = productosRepository.save(productos);	
		} else {
			System.out.println("Ya existe el producto con el nombre ["
					+ productos.getNombre()+"]");
		}//else 
		return tmp;
	}//Método addProductos
	
	public Productos deleteProductos(Long id) {
		Productos tmp=null;
		if (productosRepository.existsById(id)) {
			tmp = productosRepository.findById(id).get();
			productosRepository.deleteById(id);
		}//if
		return tmp;
	} //Método deleteProductos


	public Productos updateProductos(Long id, String nombre, String descripcion, Double precio, Integer cantidad,
			String categoria, String imagen) {
		Productos tmp=null;
		
			if(productosRepository.existsById(id)) {
				tmp = productosRepository.findById(id).get();
				if(nombre!=null) tmp.setNombre(nombre);
				if(descripcion!=null)tmp.setDescripcion(descripcion);
		        if(precio!=null) tmp.setPrecio(precio);
		        if(cantidad!=null)tmp.setCantidad(cantidad);
		        if(categoria!=null) tmp.setCategoria(categoria);
		        if(imagen!=null)tmp.setImagen(imagen);
		        productosRepository.save(tmp);
		        
				
			} else {
				System.out.println("Update - El producto con el id ["
						+ id +"] no existe");
			}//else //if
		
		return tmp;
		
	}//UpdateProductos
	
	
}//ProductosService
