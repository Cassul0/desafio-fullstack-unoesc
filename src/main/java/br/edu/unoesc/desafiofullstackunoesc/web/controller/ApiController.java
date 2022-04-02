package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.unoesc.desafiofullstackunoesc.model.DadosApi;
import br.edu.unoesc.desafiofullstackunoesc.service.DadosApiService;

@Controller
@RequestMapping("/api")
public class ApiController {
		
	@Autowired
	private DadosApiService dadosApiService;
	
	@GetMapping("/consulta")
	public String listar(){
		return "api/consulta";
	}
	
	@PostMapping("/consultar")
	public String consultar(@RequestParam(value = "codIBGE", required = true) Long codIBGE,
							@RequestParam(value = "mesRef", required = true) String mesRef,
							@RequestParam(value = "anoRef", required = true) Long anoRef,
							@RequestParam(value = "pagina", required = true) Long pagina,
							ModelMap model) throws IOException {
		
		URL url = new URL("https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio?codigoIbge=" + codIBGE + "&mesAno="+ anoRef + mesRef +"&pagina=" + pagina);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("chave-api-dados", "82057c21c09ff20cd18e7257b4a55804");
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        
        ObjectMapper mapper = new ObjectMapper();
        //DadosApi dados[] = mapper.readValue(buffer, DadosApi[].class);
        List<DadosApi> dados = Arrays.asList(mapper.readValue(buffer, DadosApi[].class));
        
        model.addAttribute("dados", dados);
        
        connection.disconnect();
        return "api/consulta";
	}
	
}
