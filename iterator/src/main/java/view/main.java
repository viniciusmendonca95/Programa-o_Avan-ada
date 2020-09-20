/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Enfermeiro;
import model.Medico;

/**
 *
 * @author vinyj
 */
public class main {

    public static void main(String[] args) {

        //Declaração da lista de médicos
        List<Medico> medicos = new ArrayList<>();

        //Instanciando e adicionando médicos
        medicos.add(new Medico("Vinicius", "123456"));
        medicos.add(new Medico("João", "456789"));
        medicos.add(new Medico("José", "159753"));

        //Declaração do iterator
        Iterator iterator;
        iterator = medicos.iterator();

        //Printando dados com o iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        //Declaração da lista de enfermeiros
        List<Enfermeiro> enfermeiros = new ArrayList<>();

        //Instanciando e adicionando enfermeiros
        enfermeiros.add(new Enfermeiro("Maria", "753951"));
        enfermeiros.add(new Enfermeiro("Luiza", "951753"));
        enfermeiros.add(new Enfermeiro("Joana", "369258"));

        //Declaração do iterator
        iterator = enfermeiros.iterator();

        //Printando dados com o iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
