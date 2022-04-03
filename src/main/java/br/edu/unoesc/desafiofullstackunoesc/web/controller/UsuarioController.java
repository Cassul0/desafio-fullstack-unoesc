package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
import br.edu.unoesc.desafiofullstackunoesc.service.UsuarioService;

@Controller
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario ) {
		
		return "cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Usuario usuario, RedirectAttributes attr) {
		
		service.salvarUsuario(usuario);
		attr.addFlashAttribute("sucesso", "Usuario inserido com sucesso");
		return "redirect:/cadastrar";
	}

}
