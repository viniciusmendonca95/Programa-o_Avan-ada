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
public class main {

    public static void main(String[] args) {
        
        //Instanciando os funcionarios
        Funcionario f1 = new Funcionario("123", "Vinicius");
        Funcionario f2 = new Funcionario("456", "Santana");
        Funcionario f3 = new Funcionario("789", "Mendonça");

        //Pegando uma unica instancia da impressora e imprimindo os dados
        Impressora impressora = Impressora.getInstance();
        impressora.print(f1.getMatricula());
        
        Impressora impressora2 = Impressora.getInstance();
        impressora2.print(f2.getMatricula());
        
        Impressora impressora3 = Impressora.getInstance();
        impressora3.print(f3.getMatricula());

    }
}
