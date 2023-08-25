package org.generation.Colibri.service;


import java.util.List;

import org.generation.Colibri.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
	
    private final UsuariosRepository usuariosRepository;
    
    @Autowired
	private PasswordEncoder passwordEncoder;

    @Autowired
    public UsuariosServices(UsuariosRepository usuariosRepository) {
    	this.usuariosRepository = usuariosRepository;
    }//constructor

	public List<Usuarios> getAllUsuarios() {
		return usuariosRepository.findAll();
	}//getAllUsuarios

	public Usuarios getUsuarios(Long id) {
	return usuariosRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("Usuario con id " + id + " no existe.")
				);
	}//getUsuarios

	public Usuarios deleteUsuarios(Long id) {
		Usuarios tmp=null;
    	if (usuariosRepository.existsById(id)) {
			tmp=usuariosRepository.findById(id).get();
			usuariosRepository.deleteById(id);
		}//if
		return tmp;
	}//deleteUsuarios

	public Usuarios addUsuarios(Usuarios usuarios) {
		Usuarios tmp=null;
		if(usuariosRepository.findByCorreo(usuarios.getCorreo()).isEmpty()) {
			
			usuarios.setContrasena(passwordEncoder.encode(usuarios.getContrasena()));
			
			tmp= usuariosRepository.save(usuarios);
		}//if
		return tmpUser;
	}//addUsuarios

	public Usuarios updateUsuarios(Long id, String nombre, String telefono, Double correo, Double contraseña, Cambiocontrasena cambiocontraseña) {
		Usuarios tmp= null;
		if (usuariosRepository.existsById(id)) { // busca si existe
			if ( (cambioContrasena.getContraseña() !=null) && (cambioContrasena.getNewContrasena() !=null) ) { //passwords !null
				tmp=uariosRepository.findById(id).get();
				
				if(passwordEncoder.matches(cambioContraseña.getContraseña(), tmp.getContraseña())) {//verifica si es igual
					tmp.setContrasena(passwordEncoder.encode(cambioContrasena.getNewContrasena()));
					usuariosRepository.save(tmpUser);
				}else {
					tmp=null;
				}//if equals
			}// !null
		}else {
			System.out.println("Update - El usuario con id " + id + " no existe." );
		}//else
		return tmp;
	}//updateUsuarios
	
	public boolean validateUsuario(Usuarios usuario) {
		Optional<Usuarios> userByEmail = usuariosRepository.findByCorreo(usuario.getCorreo());
		if (userByEmail.isPresent()) {
			Usuarios user = userByEmail.get();
			
			if (passwordEncoder.matches(usuario.getContrasena(), user.getContrasena())) {
//			if (user.getPassword().equals(usuario.getPassword())) {
				return true;
			} // if equals
		} // if isPresent
		return false;
	}// validateUsuario
    

}//UsuariosService
