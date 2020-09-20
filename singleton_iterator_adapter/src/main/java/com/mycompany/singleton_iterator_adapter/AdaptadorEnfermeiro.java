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
public class AdaptadorEnfermeiro implements IAdapter {
    
    //Instanciando enfermeiro
    Enfermeiro enfermeiro = new Enfermeiro("78978", "369", "Maria", 20);
    
    //Printando dados dos enfermeiros
    @Override
    public void print() {
        enfermeiro.printDadosEnfermeiro();
    }
}
