/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.pm.model;

/**
 *
 * @author dhca
 */
public class Veiculo {
    
    //Enumeração dos tipos de Veiculos de publicação
    // R => Revista
    // C => COnferencia
    public enum Tipo_Veiculo {
        R, C
    }
    
    private int idVeiculo;
    private Tipo_Veiculo tv;

    /*********************
     * Metodos de Acesso
     * 
     *********************/
    
    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Tipo_Veiculo getTv() {
        return tv;
    }

    public void setTv(Tipo_Veiculo tv) {
        this.tv = tv;
    }
    
    

    
    
}
