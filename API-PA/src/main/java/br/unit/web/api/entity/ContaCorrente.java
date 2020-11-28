package br.unit.web.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContaCorrente {
	private @Id  @GeneratedValue @Column(name="id_conta") long id;
	private Integer numero;
	private double saldo;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(long id, Integer numero, double saldo) {
		super();
		this.id = id;
		this.numero = numero;
		this.saldo = saldo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
