package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
import br.edu.unoesc.desafiofullstackunoesc.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	private UsuarioService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario ) {
		
		return "usuario/cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Usuario usuario, BindingResult result, RedirectAttributes attr) {
		if (result.hasErrors()) {
			return "usuario/cadastro";
		}
		String senha = new String(new BCryptPasswordEncoder().encode(usuario.getSenha()));
		usuario.setSenha(senha);
		service.salvar(usuario);
		attr.addFlashAttribute("success", "Cargo inserido com sucesso");
		return "redirect:/usuario/cadastrar";
	}


}
