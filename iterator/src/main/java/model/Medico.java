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
public class Medico {

    //Variaveis de médico
    private String nome;
    private String matricula;

    //Construtor com dado de médico
    public Medico(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    //Método para printar dados de medico
    @Override
    public String toString() {
        return "Medico{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }

}
