package org.generation.Colibri.model;


public class Administrador {
	private Long id;
	private String correo;
	private String contraseña;
	
	public Administrador(Long id, String correo, String contraseña) {
		super();
		this.id = id;
		this.correo = correo;
		this.contraseña = contraseña;
	}//constructor
	

	public Long getId() {
		return id;
	}//getId

	public void setId(Long id) {
		this.id = id;
	}//setId

	public String getCorreo() {
		return correo;
	}//getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}//setCorreo

	public String getContraseña() {
		return contraseña;
	}//getContraseña

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}//setContraseña


	@Override
	public String toString() {
		return "Administrador [id=" + id + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}
}//Administrador

