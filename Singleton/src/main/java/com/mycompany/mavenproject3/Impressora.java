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
public class Impressora {
    
    //Variaveis de impressora
    public String marca;
    public String IP;
    public String porta;
    private static Impressora impressora;

    //Construtor com dados de impressora
    private Impressora(String marca, String IP, String porta) {
        this.marca = marca;
        this.IP = IP;
        this.porta = porta;
    }
    
    //Metodo para pegar uma unica instancia da impressora
    public static Impressora getInstance() {
        if (impressora == null) {
            impressora = new Impressora("HP Deskjet F300 Series", "10.211.55.1", "9100");
        }
        return impressora;
    }

    //Metodo para printar os dados
    public void print(String matricula) {
        System.out.println("Matricula do funcionário: " + matricula + "\nEndereço de memória da Impressora: " + this + "\nMarca: " + this.marca + "\nEndereço IP: " + this.IP + "\nPorta: " + this.porta + "\n");

    }

}
