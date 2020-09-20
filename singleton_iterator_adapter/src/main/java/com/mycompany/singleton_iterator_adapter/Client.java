/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton_iterator_adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vinyj
 */
public class Client {

    public static void main(String[] args) {
        
        //Declaração das listas de medicos e enfermeiros
        List<Medico> medicos = new ArrayList<>();
        List<Enfermeiro> enfermeiros = new ArrayList<>();

        //Instanciando os médicos
        Medico medico1 = new Medico("12345", "228", "Vinicius", 25);
        Medico medico2 = new Medico("45678", "123", "Márcio", 30);

        //Adicionando medicos na lista
        medicos.add(medico1);
        medicos.add(medico2);

        //Instanciando os enfermeiros
        Enfermeiro enfermeiro1 = new Enfermeiro("78978", "369", "Maria", 20);
        Enfermeiro enfermeiro2 = new Enfermeiro("36914", "147", "José", 40);

        //Adicionando enfermeiros na lista
        enfermeiros.add(enfermeiro1);
        enfermeiros.add(enfermeiro2);
        
        /*
        
        APLICAÇÃO DO SINGLETON
        
        */
        
        System.out.println("");
        System.out.println("APLICAÇÃO DO SINGLETON\n");  

        //Pegando uma única instancia do prontuario e printando os dados (Singleton)
        Prontuario prontuario1 = Prontuario.getInstance();
        prontuario1.setMedico(medico1);

        Prontuario prontuario2 = Prontuario.getInstance();
        prontuario2.setMedico(medico2);

        Prontuario prontuario3 = Prontuario.getInstance();
        prontuario3.setEnfermeiro(enfermeiro1);

        Prontuario prontuario4 = Prontuario.getInstance();
        prontuario4.setEnfermeiro(enfermeiro2);

        /*
        
        APLICAÇÃO DO ITERATOR
        
        */
        
        System.out.println("");
        System.out.println("APLICAÇÃO DO ITERATOR\n");      

        //Declarando o iterator dos medicos
        Iterator iterator1 = medicos.iterator();

        //Declarando o iterator dos enfermeiros
        Iterator iterator2 = enfermeiros.iterator();

        //Printando os médicos com iterator
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().toString());
        }
        
         //Printando os enfermeiros com iterator
        while (iterator2.hasNext()){
            System.out.println(iterator2.next().toString());
            
        /*
        
        APLICAÇÃO DO ADAPTER
        
        */
        
        System.out.println("");
        System.out.println("APLICAÇÃO DO ADAPTER\n");      
        
        //Declarando o Adapter
        IAdapter objeto;
        
        //Instanciando o Adaptador do médico
        objeto = new AdaptadorMedico();
        
        //Printando os dados dos médico
        objeto.print();
        
        //Instanciando o Adaptador do médico
        objeto = new AdaptadorEnfermeiro();
        
        //Printando os dados dos enfermeiros
        objeto.print();
        }
    }
}
