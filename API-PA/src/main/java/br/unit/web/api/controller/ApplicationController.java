package br.unit.web.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@GetMapping("/")
	public String metodoGet() {
		return "Este endpoint utiliza o verbo GET.";
	}
	
	@PostMapping("/")
	public String metodoPost() {
		return "Este endpoint utiliza o verbo POST.";
	}
	
	@PostMapping("/{estudante}")
	public String metodoPostViaUrl(@PathVariable("estudante") String dado) {
		return "Este endpoint recebe o nome " + dado + " via URL";
	}
	
	@PutMapping("/")
	public String metodoPut() {
		return "Este endpoint utiliza o verbo PUT";
	}
	
	@PutMapping("/estudante")
	public String metodoPutViaCorpo(@RequestBody String dado) {
		return "Este endpoint recebe o nome " + dado + " via Corpo de Requisição";
	}

	@DeleteMapping("/")
	public String metodoDelete() {
		return "Este endpoint utiliza o verbo DELETE";
	}
}
