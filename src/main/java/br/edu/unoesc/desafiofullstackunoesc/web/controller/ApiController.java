package br.edu.unoesc.desafiofullstackunoesc.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultaAPI")
public class ApiController {
		
	@GetMapping("/consultar")
	public String listar() throws IOException {
		
		URL url = new URL("https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio?codigoIbge=4209003&mesAno=202101&pagina=1");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("chave-api-dados", "82057c21c09ff20cd18e7257b4a55804");
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String output;

        while ((output = buffer.readLine()) != null) {

            System.out.println(output);

        }

        connection.disconnect();
        return "sucess";
	}
}
