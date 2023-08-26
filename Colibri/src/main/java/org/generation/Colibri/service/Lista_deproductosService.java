package org.generation.Colibri.service;

import java.util.List;

import org.generation.Colibri.model.Lista_deproductos;
import org.generation.Colibri.repository.Lista_deproductosRepository;

public class Lista_deproductosService {
	private final Lista_deproductosRepository lista_deproductosRepository;

	public Lista_deproductosService(Lista_deproductosRepository lista_deproductosRepository) {
		super();
		this.lista_deproductosRepository = lista_deproductosRepository;
	}//constructor
	
	public List<Lista_deproductos> getAllLista_deproductos() {
		return lista_deproductosRepository.findAll();
	}//getAllLista_deproductos
	
	public Lista_deproductos getLista_deproductos (Long id) {
		return lista_deproductosRepository.findById(id).orElseThrow(
		() -> new IllegalArgumentException("El producto con el id ["
				+ id + "] no existe")
		);
	}//getLista_deproductos
	
	public Lista_deproductos deleteLista_deproductos (Long id) {
		Lista_deproductos tmp = null;
		if(lista_deproductosRepository.existsById(id)) {
			tmp = lista_deproductosRepository.findById(id).get();
			lista_deproductosRepository.deleteById(id);
			}//if
		return tmp;
		}//deleteLista_deproductos
	
	public Lista_deproductos addLista_deproductos(Lista_deproductos lista_deproductos) {
		Lista_deproductos tmp = null;
		if(Lista_deproductosRepository.findByNombre(lista_deproductos.getCantidad()).isEmpty()) {
	tmp = lista_deproductos.save(lista_deproductos); 
		} else {
			System.out.println("Ya existe el producto con el nombre ["
					+ producto.getNombre() + "]");
		}//if //else
	}
	
	
	
	
	
	
	
}//classLista_deproductosService
