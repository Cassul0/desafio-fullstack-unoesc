package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;

@RequestMapping("/usuarios")
public class UsuarioController {

	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario ) {
		
		return "usuario/cadastro";
	}
}
