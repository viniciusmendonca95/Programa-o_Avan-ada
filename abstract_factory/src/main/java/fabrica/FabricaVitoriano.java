/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import cadeira.CadeiraVitoriano;
import cadeira.ICadeira;
import mesa_de_centro.IMesaDeCentro;
import mesa_de_centro.MesaDeCentroVitoriano;
import sofa.ISofa;
import sofa.SofaVitoriano;

/**
 *
 * @author vinyj
 */
public class FabricaVitoriano implements IFabricaAbstrata {

    @Override
    public ICadeira createCadeira() {
        return new CadeiraVitoriano();
    }

    @Override
    public ISofa createSofa() {
        return new SofaVitoriano();
    }

    @Override
    public IMesaDeCentro createMesaDeCentro() {
        return new MesaDeCentroVitoriano();
    }

}
