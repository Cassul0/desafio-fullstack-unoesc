package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

//import br.edu.unoesc.desafiofullstackunoesc.model.ConsultaApi;
import br.edu.unoesc.desafiofullstackunoesc.model.DadosApi;

@Controller
@RequestMapping("/api")
public class ApiController {
		
	@GetMapping("/consulta")
	public String listar(){
		return "API/consulta";
	}
	
	@PostMapping("/consultar")
	public String consultar(
							//@ModelAttribute ConsultaApi consultaApi, BindingResult bindingResult, Model model, RedirectAttributes attr) {
							@RequestParam(value = "codIBGE", required = true) Long codIBGE,
							@RequestParam(value = "mesRef", required = true) String mesRef,
							@RequestParam(value = "anoRef", required = true) Long anoRef,
							@RequestParam(value = "pagina", required = true) Long pagina,
							ModelMap model) throws IOException {
		
		//model.addAttribute("consultaApi", consultaApi);
		//model.addAttribute("codIBGE", mesRef);
		//model.addAttribute("mesRef", mesRef);
		//model.addAttribute("anoRef", anoRef);
		//model.addAttribute("pagina", pagina);
		
		URL url = new URL("https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio?codigoIbge=" + codIBGE + "&mesAno="+ anoRef + mesRef +"&pagina=" + pagina);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("chave-api-dados", "82057c21c09ff20cd18e7257b4a55804");
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        ObjectMapper mapper = new ObjectMapper();
        DadosApi dados = mapper.readValue(buffer, DadosApi.class);

        //while ((output = buffer.readLine()) != null) {

        	
          //  System.out.println(output);
           // ObjectMapper mapper = new ObjectMapper();
           // DadosApi dados = mapper.readValue(output, DadosApi.class);

        //}

        connection.disconnect();
        return "API/consulta";
	}
}
