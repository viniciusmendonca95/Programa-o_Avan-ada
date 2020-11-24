package br.unit.web.api.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unit.web.api.entity.Cliente;
import br.unit.web.api.repository.ClienteRepository;



@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@PostMapping("/cliente")
	public ResponseEntity<Object> salvarCliente(@RequestBody Cliente cliente){
		
		LocalDateTime aux = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		cliente.setDateTime(aux);
		
		try {
			Cliente clienteSalvo = clienteRepository.save(cliente);
			return ResponseEntity.accepted().body(clienteSalvo);
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(false);
		}
	}
	
	@GetMapping("/cliente/todos")
	public ResponseEntity<Object> retornarTodosClientes(){
		
		try {
			List<Cliente> clientes = clienteRepository.findAll();
			return ResponseEntity.ok(clientes);
		} catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
		
	}
}
