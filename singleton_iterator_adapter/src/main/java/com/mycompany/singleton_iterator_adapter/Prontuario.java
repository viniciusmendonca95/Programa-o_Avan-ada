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
public class Prontuario {

    //Variaveis do prontuario
    private static Prontuario prontuario = null;
    private Integer codigo;

    //Construtor padrão do prontuario
    private Prontuario() {
        this.codigo = 0;
    }

    //Método de pegar a instância do prontuario
    public static Prontuario getInstance() {
        if (prontuario == null) {
            prontuario = new Prontuario();
        }
        return prontuario;
    }

    //Getter do prontuario
    public Integer getCodigo() {
        return codigo;
    }

    //Setter dos funcionarios
    public void setMedico(Medico medico) {
        codigo+=1;
        System.out.println(print(medico.getMatricula()));
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
           codigo+=1;
        System.out.println(print(enfermeiro.getMatricula()));
    }
    
    //Método de printar os dados
    //@Overide
    public String print(String matricula){
        return "Matricula: " + matricula + " Código prontuario: " + codigo;
    }
}
