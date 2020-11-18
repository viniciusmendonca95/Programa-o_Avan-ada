package br.unit.pa.apí;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("/home")
	public ResponseEntity<String> home() {
		
		HttpStatus httpStatus = HttpStatus.CREATED;
		return ResponseEntity.status(httpStatus).body("Home da API");
	}

}
