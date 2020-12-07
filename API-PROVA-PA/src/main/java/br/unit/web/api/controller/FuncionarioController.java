package br.unit.web.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unit.web.api.entity.Funcionario;

@RestController
public class FuncionarioController {

	@PostMapping("/funcionario/maiorsalario")
	public ResponseEntity<Object> verificarMaiorSalario(@RequestBody List<Funcionario> funcionarioList) {
		if (funcionarioList.size() == 0) {
			HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
			return ResponseEntity.status(httpStatus).body("A lista de funcionários está vazia!"); 
		} else if (funcionarioList.size() == 1) {
			HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
			return ResponseEntity.status(httpStatus).body("A lista de funcionários só possui 1 funcionário."); 
		} else {
		Funcionario funcionarioMaiorSalario = new Funcionario();
		for (int i = 0; i < funcionarioList.size(); i++) {
			{
				if (i == 0) {
					funcionarioMaiorSalario = funcionarioList.get(i);
				} else {
					if (funcionarioList.get(i).getSalario() > funcionarioMaiorSalario.getSalario()) {
						funcionarioMaiorSalario = funcionarioList.get(i);
					}
				}

			}
		}
		HttpStatus httpStatus = HttpStatus.OK;
		return ResponseEntity.status(httpStatus).body(funcionarioMaiorSalario);
		}
	}
}
