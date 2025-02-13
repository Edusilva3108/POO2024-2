package br.ufpb.dcx.eduardo;

import org.junit.jupiter.api.Test;

public class SistemaLojaRoupasPOOTest {

    @Test
    public void testaCadastroDeRoupa(){
        try {
            sistema.cadastraRoupa("001", "Camisa polo Azul Masculina", Tamanho.M, 10);
            Roupa r = sistema.pesquisaRoupa("001");
            assertEquals (10, r.getQuantidade());
            //TODO
        } catch (RoupaJaExisteException | RoupaInexistenteException e){
            fail("Não deveria lança exceção");
        }
    }
}
