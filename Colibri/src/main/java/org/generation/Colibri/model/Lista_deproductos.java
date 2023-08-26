package org.generation.Colibri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lista_deproductos")
public class Lista_deproductos {
	//POJO
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) //primaryKey
	@Column (name= "id", unique=true, nullable=false)
	private Long id;
	@Column (nullable=false)
	private Double cantidad;
	
	public Lista_deproductos(Double cantidad) {

		this.cantidad = cantidad;
	}//constructor
	
	public Lista_deproductos() { }//constructor vacío 


	
	public Double getCantidad() {
		return cantidad;
	}//getCantidad

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}//setCantidad

	@Override
	public String toString() {
		return "Lista_deproductos [id=" + id + ", cantidad=" + cantidad + "]";
	
	}//toString
	
	public Long getId() {
		return id;
	}//getId

}//classLista_deproductos
