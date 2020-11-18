package br.unit.pa.apí;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unit.pa.domain.entity.Cliente;

@RestController
public class ClienteController {
	
	@PostMapping("/estudante2")
	public ResponseEntity<Boolean> salvarCliente(@RequestBody Cliente cliente){
		
		LocalDateTime aux = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		cliente.setDateTime(aux);
		
		try {
			System.out.println(cliente.toString());
			return ResponseEntity.accepted().body(true);
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(false);
		}
	}
	
	@PostMapping("/estudante")
	public ResponseEntity<Object> verificarMarcio(@RequestBody Cliente cliente){
			String nomeCliente = cliente.getNome();
			if(nomeCliente.equals("Marcio")){
				HttpStatus httpStatus = HttpStatus.ACCEPTED;
				return ResponseEntity.status(httpStatus).body("Estudante é Marcio");
			} else {
				return ResponseEntity.badRequest().body(false);
			}
		}

	
	@PutMapping("/estudante")
	public ResponseEntity<Object> testeNulo(@RequestBody Cliente cliente){
			Long idEstudante = cliente.getId();
			System.out.println(idEstudante);
			if(idEstudante == 0){
				HttpStatus httpStatus = HttpStatus.NOT_ACCEPTABLE;
				return ResponseEntity.status(httpStatus).body(false);
			} else {
				return ResponseEntity.ok(true);
			}
		}
}
