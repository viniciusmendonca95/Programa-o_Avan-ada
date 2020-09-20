/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton_iterator_adapter;

/**
 *
 * @author vinyj
 */
public class Medico {

    //Variaveis de medico
    private String matricula;
    private String crm;
    private String nome;
    private Integer idade;

    //Construtor padrão de medico
    public Medico() {
    }

    //Construtor com dados de medico
    public Medico(String matricula, String crm, String nome, Integer idade) {
        this.matricula = matricula;
        this.crm = crm;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters and Setters de medico
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //Método para printar os dados do enfermeiro
    @Override
    public String toString() {
        return "Medico{" + "matricula=" + matricula + ", crm=" + crm + ", nome=" + nome + ", idade=" + idade + '}';
    }

    //Método para printar dados do medicos (Com adapter)
    public void printDadosMedico() {
        System.out.println("Nome: " + nome + " Cargo: Médico " + "Matricula: " + matricula + " CRM: " + crm + " Idade: " + idade);
    }
}
