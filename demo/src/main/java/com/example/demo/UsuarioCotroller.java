package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/usuarios")
public class UsuarioCotroller {
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public List<String> usuarios(){
		return null;
		
	}
	

}
