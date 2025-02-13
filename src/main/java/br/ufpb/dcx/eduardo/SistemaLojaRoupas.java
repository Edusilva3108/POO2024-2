package br.ufpb.dcx.eduardo;

import java.util.List;

public interface SistemaLojaRoupas {
    public List<Roupa> pesquisaRoupasPorTamanho(Tamanho tamanhoRoupa);
    public List<Roupa> pesquisaRoupaComDescricaoComecandoCom(String prefixoDescricao);
    public Tamanho consultaTamanhoDaRoupa(String codigoRoupa) throws RoupaInexistenteExcetion;
    public void cadastraRoupa (String codigoRoupa, String descricao, Tamanho tamanho, int quantidade) throws RoupaJaExisteException;
    public void alteraQuantidadeDeRoupaNoEstoque(String codigoRoupa, int quantidade) throws RoupaInexistenteExcetion;
    public int pesquisaQuantidadeDeRoupaNoEstoque(String codigoRoupa) throws RoupaInexistenteExcetion;
    public Roupa pesquisaRoupa (String codigoRoupa) throws RoupaInexistenteExcetion;
}
