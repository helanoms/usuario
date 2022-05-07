package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	public UsuarioRepository repository;

	
	public List<Usuario> recuperarUsuario(){
		
		return repository.findAll();
	}
	
	public void icluir(Usuario usuario) {
		repository.save(usuario);
		
	}

}
