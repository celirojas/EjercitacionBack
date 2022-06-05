package com.example.nuestroPrimerProyectoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Used to build REST API in a declarative way. To mark it as a request handler.
public class NuestroPrimerProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuestroPrimerProyectoSpringApplication.class, args);
	}


	@GetMapping
	public String holaMundo(){
		return "¡Hola, mundo!";
	}
}
