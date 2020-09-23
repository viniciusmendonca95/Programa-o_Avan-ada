/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import cadeira.CadeiraArtDeco;
import cadeira.ICadeira;
import mesa_de_centro.IMesaDeCentro;
import mesa_de_centro.MesaDeCentroArtDeco;
import sofa.ISofa;
import sofa.SofaArtDeco;

/**
 *
 * @author vinyj
 */
public class FabricaArtDeco implements IFabricaAbstrata {

    @Override
    public ICadeira createCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public ISofa createSofa() {
        return new SofaArtDeco();

    }

    @Override
    public IMesaDeCentro createMesaDeCentro() {
        return new MesaDeCentroArtDeco();
    }

}
