package br.unit.web.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@GetMapping("/")
	public ResponseEntity<String> home() {
		HttpStatus httpStatus = HttpStatus.ACCEPTED;
		
		
		return ResponseEntity.status(httpStatus).body("Endpoint "
				+ "inicial da API Prova de Programação Avançada <br>"
				+ "<a href='swagger-ui.html'>doc</a>");
	}
}
