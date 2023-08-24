package org.generation.Colibri.model;

@Entity
@Table(name="Usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String correo;
	@Column(nullable=false)
	private String telefono;
	@Column(nullable=false)
	private String contraseña;
		
	public Usuarios(Long id, String nombre, String correo, String telefono, String contraseña) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.contraseña = contraseña;
	}//constructor
	
	public Usuarios() {}//constructor
	
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

	public String getCorreo() {
		return correo;
	}//getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}//setCorreo

	public String getTelefono() {
		return telefono;
	}//getTelefono

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}//setTelefono

	public String getContraseña() {
		return contraseña;
	}//getContraseña

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}//setContraseña

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ ", contraseña=" + contraseña + "]";
	}
		
}//Usuarios
