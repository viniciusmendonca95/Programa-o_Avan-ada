/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author vinyj
 */
public class Funcionario {

    //Variaveis de funcionario
    public String matricula;
    public String nome;

    //Construtor com dados de funcionario
    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    //Getter de funcionario
    public String getMatricula() {
        return matricula;
    }
}
