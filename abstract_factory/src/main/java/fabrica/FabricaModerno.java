/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import cadeira.CadeiraModerno;
import cadeira.ICadeira;
import mesa_de_centro.IMesaDeCentro;
import mesa_de_centro.MesaDeCentroModerno;
import sofa.ISofa;
import sofa.SofaModerno;

/**
 *
 * @author vinyj
 */
public class FabricaModerno implements IFabricaAbstrata {

    @Override
    public ICadeira createCadeira() {
        return new CadeiraModerno();
    }

    @Override
    public ISofa createSofa() {
        return new SofaModerno();
    }

    @Override
    public IMesaDeCentro createMesaDeCentro() {
        return new MesaDeCentroModerno();
    }

}
