package br.ufpb.dcx.eduardo;

import java.util.HashMap;
import java.util.Map;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas {

    private Map<String, Roupa> roupaMap;
    public SistemaLojaRoupasPOO (){
        this.roupaMap = new HashMap<>();
    }
    @Override
    public void cadastraRoupa (String codigoRoupa, String descricao, Tamanho tamanho, int quantidade) throws RoupaJaExisteException{
        if (this.roupaMap.containsKey(codigoRoupa)){
            throw new RoupaJaExisteException ("Roupa já  cadastrada: " + codigoRoupa);
        } else {
            Roupa roupa = new Roupa (codigoRoupa, descricao, tamanho, quantidade);
            this.roupaMap.put(codigoRoupa, roupa);
        }
    }
}
