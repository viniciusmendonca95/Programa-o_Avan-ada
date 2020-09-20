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
public class Enfermeiro {

    //Variaveis de enfermeiro
    private String matricula;
    private String corem;
    private String nome;
    private Integer idade;

    //Construtor padrão de enfermeiro
    public Enfermeiro() {
    }

    //Construtor com dados de enfermeiro
    public Enfermeiro(String matricula, String corem, String nome, Integer idade) {
        this.matricula = matricula;
        this.corem = corem;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters and Setters de enfermeiro
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorem() {
        return corem;
    }

    public void setCorem(String corem) {
        this.corem = corem;
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
        return "Enfermeiro{" + "matricula=" + matricula + ", corem=" + corem + ", nome=" + nome + ", idade=" + idade + '}';
    }

    //Método para printar dados do enfermeiros (Com adapter)
    public void printDadosEnfermeiro() {
        System.out.println("Nome: " + nome + " Cargo: Enfermeiro " + " Matricula: " + matricula + " COREM: " + corem + " Idade: " + idade);
    }
}
