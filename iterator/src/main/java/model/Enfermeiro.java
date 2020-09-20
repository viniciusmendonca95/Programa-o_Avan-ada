/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinyj
 */
public class Enfermeiro {

    //Variaveis de Enfermeiro
    private String nome;
    private String matricula;

    //Construtor com dados de enfermeiro
    public Enfermeiro(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Método de printar os dados de enfermeiro
    @Override
    public String toString() {
        return "Enfermeiro{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }

}
