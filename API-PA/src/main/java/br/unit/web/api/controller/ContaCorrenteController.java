package br.unit.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unit.web.api.entity.ContaCorrente;
import br.unit.web.api.repository.ContaCorrenteRepository;

@RestController
public class ContaCorrenteController {
	
	@Autowired
	ContaCorrenteRepository contaCorrenteRepository;
	
	@GetMapping("/conta/saldo/{numero}")
	public ResponseEntity<Object> consultarSaldoConta(@PathVariable("numero") Integer numero){
		try {
			ContaCorrente conta = contaCorrenteRepository.findByNumero(numero);
			return ResponseEntity.ok().body("Saldo: " + conta.getSaldo());
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO AO CONSULTAR SALDO.");
		}
		
	}
	
	@PutMapping("/conta/depositar/{numero}/{valor}")
	public ResponseEntity<Object> depositarValorConta(@PathVariable("numero") Integer numero, @PathVariable("valor") double valor){
		try {
			ContaCorrente conta = contaCorrenteRepository.findByNumero(numero);
			double saldo = conta.getSaldo();
			saldo = saldo + valor;
			conta.setSaldo(saldo);
			conta = contaCorrenteRepository.save(conta);
			return ResponseEntity.ok().body("Saldo atualizado: " + conta.getSaldo());
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO AO CONSULTAR SALDO.");
		}
		
	}
	
	@PutMapping("/conta/sacar/{numero}/{valor}")
	public ResponseEntity<Object> sacarValorConta(@PathVariable("numero") Integer numero, @PathVariable("valor") double valor){
		try {
			ContaCorrente conta = contaCorrenteRepository.findByNumero(numero);
			double saldo = conta.getSaldo();
			if (valor <= saldo) {
				saldo = saldo - valor;
				conta.setSaldo(saldo);
				conta = contaCorrenteRepository.save(conta);
				return ResponseEntity.ok().body("Saldo atualizado: " + conta.getSaldo());
			} else {
				return ResponseEntity.ok().body("SALDO INSUFICIENTE");
			}
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO AO CONSULTAR SALDO.");
		}
		
	}

}
