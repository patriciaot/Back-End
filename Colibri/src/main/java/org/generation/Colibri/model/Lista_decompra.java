package org.generation.Colibri.model;

public class Lista_decompra {
	private Long id;
	private Integer cantidad;
	
	public Lista_decompra(Long id, Integer cantidad) {
		super();
		this.id = id;
		this.cantidad = cantidad;
	
	}//constructor
	
	public Long getId() {
		return id;
	}//getId


	public void setId(Long id) {
		this.id = id;
	}//setId


	public Integer getCantidad() {
		return cantidad;
	}//getCantidad


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}//setCantidad


	@Override
	public String toString() {
		return "Lista_decompra [id=" + id + ", cantidad=" + cantidad + "]";
	}
	
	
	
}//Lista_decompra


