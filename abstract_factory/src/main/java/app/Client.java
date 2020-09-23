/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import fabrica.FabricaArtDeco;
import fabrica.FabricaModerno;
import fabrica.FabricaVitoriano;
import fabrica.IFabricaAbstrata;

/**
 *
 * @author vinyj
 */
public class Client {

    public static void main(String[] args) {
        Application app = null;
        IFabricaAbstrata fabrica;

        String modelo = "artDeco";
        //String modelo = "moderno";
        //String modelo = "vitoriano";
        
        if (modelo.equalsIgnoreCase("artDeco")) {
            fabrica = new FabricaArtDeco();
            app = new Application(fabrica);
        } else if (modelo.equalsIgnoreCase("moderno")) {
            fabrica = new FabricaModerno();
            app = new Application(fabrica);
        } else {
            fabrica = new FabricaVitoriano();
            app = new Application(fabrica);
        }
        app.print();
    }
}
