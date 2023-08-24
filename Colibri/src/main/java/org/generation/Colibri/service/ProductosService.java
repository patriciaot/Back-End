package org.generation.Colibri.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.Colibri.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {

	public final ArrayList<Productos> lista= new ArrayList <>();
	@Autowired
	public ProductosService() {
		lista.add(new Productos(
		        "Vestido Alebrije",
		        "Vestido blanco con bordados coloridos", 
		        1700.0,
		         1,
		        "vestido artesanal",
		        "./img/1080x1080/vestidos/blancolor.png"));
		lista.add(new Productos(
		        "Vestido Amaro",
		        "Vestido con falda de manta y hombros descubiertos", 
		        1900.0,
		         1,
		        "vestido artesanal",
		        "./img/1080x1080/vestidos/rojoama.png"
				));
		lista.add(new Productos(
		        "Vestido Delicia",
		        "Vestido, 2 piezas de algodón y bordado de rosas", 
		        1500.0,
		         1,
		        "vestido artesanal",
		        "./img/1080x1080/vestidos/azul.png"));
		lista.add(new Productos(
			     "Vestido Siempre Contigo",
			     "Vestido largo, negro, de manta con bordado en el pecho", 
			     2100.0,
			     1,
			     "vestido artesanal",
			     "./img/1080x1080/vestidos/negro.png"
				));
		lista.add(new Productos(
		        "Vestido Mi Bella Oaxaca",
		        "Vestido largo bordado a mano inpirado en la creatividad de lo primeros bordados hechos por mujeres Oaxaqueñas", 
		         2100.0,
		         1,
		        "vestido artesanal",
		        "./img/1080x1080/vestidos/purple.png"
				));
		lista.add(new Productos(
			        "Conjunto Fresita",
			        "Conjunto de  2 piezas, con falda y blusa bordada con hilo brillante", 
			        2500.0,
			        1,
			        "vestido artesanal",
			        "./img/1080x1080/vestidos/rosita.png"
				));
		lista.add(new Productos(
		        "Blusa Girasol",
		        " Bordada a mano con hilo teñido con curcúma", 
		        1300.0,
		        1,
		        "blusa artesanal",
		        "./img/1080x1080/blusas/amarilla.png"
				));
		lista.add(new Productos(
		        "Blusa Cintillo",
		        "Blusa estilo campesina bordada con figuras geometricas a mano", 
		        1300.0,
		        1,
		        "blusa artesanal",
		        "./img/1080x1080/blusas/negro.png"
				));
		lista.add(new Productos(
			        "Blusa El Listón",
			        "Blusa con olanes en las mangas y bordado en el pecho en forma de rombos", 
			        1500.0,
			        1,
			        "blusa artesanal",
			        "./img/1080x1080/blusas/azul.png"));
		lista.add(new Productos(
			        "Blusa Bugambilia",
			        "Blusa con bordado de flores y espalda descubierta", 
			        1500.0,
			        1,
			        "blusa artesanal",
			        "./img/1080x1080/blusas/fiucshia.png"
				));
		lista.add(new Productos(	
			        "Blusa Cuadritos",
			        " Bordada a mano con hilo teñido naturalmente", 
			        1300.0,
			        1,
			        "blusa artesanal",
			        "./img/1080x1080/blusas/cuadros.png"
				));
		lista.add(new Productos(
			        "Guayabera Arcoiris",
			        " Guayabera de manta bordada con hilo tornasol", 
			        1900.0,
			        1,
			        "guayabera artesanal",
			        "./img/1080x1080/guayaberas/arcoiris.png"
				));
		lista.add(new Productos(
			        "Guayabera Azul",
			        " Guayabera de manta azul bordada con hilo de algodón blanco", 
			        1900.0,
			        1,
			        "guayabera artesanal",
			        "./img/1080x1080/guayaberas/azul.png"
				));
		lista.add(new Productos(	
		        "Guayabera Tradicional",
		        "Guayabera de manta bordada con hilo en forma de rombos", 
		        1900.0,
		        1,
		        "guayabera artesanal",
		        "./img/1080x1080/guayaberas/beige.png"
				));
		lista.add(new Productos(
			        "Guayabera Tenoch",
			        "Guayabera de manta bordada con cintillo azul", 
			        1900.0,
			        1,
			        "guayabera artesanal",
			        "./img/1080x1080/guayaberas/citilloazul.png"
				));
		lista.add(new Productos(
		        "Guayabera Flor Del Campo",
		        "Guayabera de manta bordado floreado", 
		        1900.0,
		        1,
		        "guayabera artesanal",
		        "./img/1080x1080/guayaberas/floral.png"));
		lista.add(new Productos(
			        "Guayabera Rosa Espinosa",
			        "Guayabera de manta negra con bordado de rosas", 
			        1900.0,
			        1,
			        "guayabera artesanal",
			        "./img/1080x1080/guayaberas/rosanegro.png"
				));
	}//constructor
	
	public List<Productos> getAllProductos() {
		return this.lista;
	}//Método getAllProductos


	public Productos getProductos(Long id) {
	Productos tmp=null;
	for(Productos productos:lista) {
		if(productos.getId().equals(id)) {
			tmp=productos;
			break;
		}//if
	}//foreach
	return tmp;
	}// Método getProductos

	public Productos addProductos(Productos productos) {
		lista.add(productos);
		return productos;
	}//Método addProductos
	
	public Productos deleteProductos(Long id) {
		Productos tmp=null;
		for (Productos productos:lista) {
			if(productos.getId().equals(id)) {
				tmp = lista.remove(lista.indexOf(productos));
				break;
			}//if
		}//foreach	
		return tmp;
	} //Método deleteProductos


	public Productos updateProductos(Long id, String nombre, String descripcion, Double precio, Integer cantidad,
			String categoria, String imagen) {
		Productos tmp=null;
		for (Productos productos:lista) {
			if(productos.getId().equals(id)) {
				if(nombre!=null) productos.setNombre(nombre);
				if(descripcion!=null)productos.setDescripcion(descripcion);
		        if(precio!=null) productos.setPrecio(precio);
		        if(cantidad!=null)productos.setCantidad(cantidad);
		        if(categoria!=null) productos.setCategoria(categoria);
		        if(imagen!=null)productos.setImagen(imagen);
				tmp = productos;
				break;
			}//if
		}//foreach	
		return tmp;
		
	}//UpdateProductos
	
	
}//ProductosService
