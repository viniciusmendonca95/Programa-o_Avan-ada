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
public class AdaptadorMedico implements IAdapter {

    //Instanciando médico
    Medico medico = new Medico("12345", "228", "Vinicius", 25);
    
    //Printando dados do médico
    @Override
    public void print() {
        medico.printDadosMedico();
    }
}
