package org.generation.Colibri.model;

public class Productos {
	private Long id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Integer cantidad;
	private String categoria; 
	private String imagen;
	private static long total=0;
	


public Productos( String nombre, String descripcion, Double precio, Integer cantidad, String categoria,
		String imagen) {
	super();
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
	this.cantidad = cantidad;
	this.categoria = categoria;
	this.imagen = imagen;
	Productos.total++;
	this.id=Productos.total;
}//constructor

public Productos() {
	Productos.total++;
	this.id=Productos.total;
}//constructor

public Long getId() {
	return id;
}//getId

public void setId(Long id) {
	this.id = id;
}//setId

public String getNombre() {
	return nombre;
}//getNombre

public void setNombre(String nombre) {
	this.nombre = nombre;
}//setNombre

public String getDescripcion() {
	return descripcion;
}//getDescripcion

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}//SetDescripcion

public Double getPrecio() {
	return precio;
}//getPrecio

public void setPrecio(Double precio) {
	this.precio = precio;
}//setPrecio

public Integer getCantidad() {
	return cantidad;
}//getCantidad

public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}//setCantidad

public String getCategoria() {
	return categoria;
}//getCategoria

public void setCategoria(String categoria) {
 this.categoria=categoria;
}//setCategoria

public String getImagen() {
	return imagen;
}//getImage

public void setImagen(String imagen) {
	this.imagen = imagen;
}//setImage


@Override
public String toString() {
	return "Productos [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
			+ ", cantidad=" + cantidad + ", categoria=" + categoria + ", imagen=" + imagen + "]";
}


}//Clase Productos

