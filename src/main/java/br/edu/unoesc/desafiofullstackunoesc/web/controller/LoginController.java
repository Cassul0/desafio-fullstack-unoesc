package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	// abrir pagina login
	@GetMapping({"/","/login"})
	public String login() {
		
		return "login";
	}	
	
	@GetMapping({"/login-error"})
	public String loginError(ModelMap model) {
		
		model.addAttribute("alerta", "erro");
		model.addAttribute("titulo", "Crendenciais inválidas!");
		model.addAttribute("texto", "Login ou senha incorretos, tente novamente.");
		return "login";
	}	

}