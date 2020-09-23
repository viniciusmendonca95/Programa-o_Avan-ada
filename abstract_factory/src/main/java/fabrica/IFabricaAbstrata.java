/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import cadeira.ICadeira;
import mesa_de_centro.IMesaDeCentro;
import sofa.ISofa;

/**
 *
 * @author vinyj
 */
public interface IFabricaAbstrata {
    ICadeira createCadeira();
    ISofa createSofa();
    IMesaDeCentro createMesaDeCentro();
   
    
}
