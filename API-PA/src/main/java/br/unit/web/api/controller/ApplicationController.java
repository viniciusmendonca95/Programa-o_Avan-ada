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
	public String home() {
		return "Hello world!";
	}
	
	@PostMapping("/{dado}")
	public String umMetodoPost(@PathVariable("dado") String umDado) {
		return "O verbo HTTP utilizado foi o POST!" + umDado;
	}
	
	@PutMapping("/")
	public String umMetodoPut(@RequestBody String umDado) {
		return "O verbo HTTP utilizado foi o PUT!" + umDado;
	}
	
	@DeleteMapping("/")
	public String umMetodoDelete() {
		return "O verbo HTTP utilizado foi o Delete!";
	}

}
