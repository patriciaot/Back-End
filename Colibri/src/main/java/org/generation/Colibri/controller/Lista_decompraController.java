package org.generation.Colibri.controller;

import java.util.List;

import org.generation.Colibri.model.Lista_decompra;
import org.generation.Colibri.service.Lista_decompraService;
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

@RestController
@RequestMapping(path="/carritoCompras/") // http://localhost:8080/carritoCompras/


public class Lista_decompraController {

	private final Lista_decompraService Lista_decompraService;

	@Autowired
	public Lista_decompraController(Lista_decompraService Lista_decompraService) {
		this.Lista_decompraService = Lista_decompraService;
	}//constructor

	@GetMapping
	public List<Lista_decompra> getAllLista_decompra(){
		return Lista_decompraService.getAllLista_decompra();
	}//getAllLista_decompra
	
	@PostMapping
	public Lista_decompra addLista_decompra (@RequestBody Lista_decompra Lista_decompra) {
		return Lista_decompraService.addLista_decompra(Lista_decompra);
	}//addLista_decompra
	
	@DeleteMapping(path = "{prodId}")
	public Lista_decompra deleteLista_decompra(@PathVariable ("prodId") Long id){
		return Lista_decompraService.deleteLista_decompra(id);		
	}//deleteProduct
	
	@PutMapping(path="{prodId}")
	public Lista_decompra updateshoppingList(@PathVariable("prodId") Long id,
			@RequestParam(required=false) Integer cantidad) {
		return Lista_decompraService.updateLista_decompra(id,cantidad);
	}//updateProduct
	
	
}//Lista_decompra
