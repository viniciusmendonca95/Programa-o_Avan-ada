/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import cadeira.ICadeira;
import fabrica.IFabricaAbstrata;
import mesa_de_centro.IMesaDeCentro;
import sofa.ISofa;

/**
 *
 * @author vinyj
 */
public class Application {
    
   private ICadeira cardeira;
   private IMesaDeCentro mesaDeCentro;
   private ISofa sofa;
   
   Application(IFabricaAbstrata fabrica){
       this.cardeira = fabrica.createCadeira();
       this.mesaDeCentro = fabrica.createMesaDeCentro();
       this.sofa = fabrica.createSofa();
   }
   
   void print() {
       this.cardeira.print();
       this.mesaDeCentro.print();
       this.sofa.print();
   }
    
}
