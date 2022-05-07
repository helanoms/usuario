package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioCotroller {
	
	@Autowired
	public UsuarioService service;
	
	
	
	@GetMapping("/todos")
	public List<Usuario> usuarios(){
		List<Usuario> lista = service.recuperarUsuario();
		
		return lista;
		
		
		
	}
	
	@PostMapping("/incluir")
	public void incluirUsusario (@RequestBody Usuario usuario) {
		service.icluir(usuario);
		
	}
	

}
