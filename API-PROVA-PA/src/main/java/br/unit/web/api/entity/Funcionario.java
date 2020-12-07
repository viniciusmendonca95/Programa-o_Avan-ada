package br.unit.web.api.entity;

public class Funcionario {
	private long matricula;
	private String nome;
	private double salario;
	
	public Funcionario() {
	}
	
	public Funcionario(long matricula, String nome, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

