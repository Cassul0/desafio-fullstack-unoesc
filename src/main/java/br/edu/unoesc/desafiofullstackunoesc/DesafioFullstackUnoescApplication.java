package br.edu.unoesc.desafiofullstackunoesc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DesafioFullstackUnoescApplication {

	public static void main(String[] args) {
		//System.out.println(new BCryptPasswordEncoder().encode("admin"));

		SpringApplication.run(DesafioFullstackUnoescApplication.class, args);
	}

}
