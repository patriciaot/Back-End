package org.generation.Colibri.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.Colibri.model.Lista_decompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Lista_decompraService {

	public final ArrayList<Lista_decompra> lista = new ArrayList <>();
	@Autowired
	public Lista_decompraService() {
		
	//NO TENGO IDEA DE QUE LISTA AGREGAR, NO ENTIENDO ESTO	
	
	}//constructor
	
	public List<Lista_decompra> getAllLista_decompra() {
		return this.lista;
	}//MétodogetAllLista_decompra

	public Lista_decompra addLista_decompra(Lista_decompra lista_decompra) {
		lista.add(lista_decompra);
		return lista_decompra;
	}//MétodogetAllLista_decompra

	public Lista_decompra deleteLista_decompra(Long id) {
		Lista_decompra tmp=null;
		for (Lista_decompra lista_decompra:lista) {
			if(lista_decompra.getId().equals(id)) {
				tmp = lista.remove(lista.indexOf(lista_decompra));
				break;
			}//if
		}//foreach	
		return tmp;
	}//Mpetodo delete Lista_decompra

	public Lista_decompra updateLista_decompra(Long id, Integer cantidad) {
		Lista_decompra tmp=null;
		for (Lista_decompra lista_decompra:lista) {
			if(lista_decompra.getId().equals(id)) {
				if(cantidad!=null) lista_decompra.setCantidad(cantidad);				
				tmp = lista_decompra;
				break;
			}//if
		}//foreach	
		return tmp;
	}//updateLista_decompra

}//Lista_decompraService
