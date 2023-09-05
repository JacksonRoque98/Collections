package map.operacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String pesquisarPalavra = null;
        pesquisarPalavra = dicionarioMap.get(palavra);
        if(pesquisarPalavra == null){
            System.out.println("Palavra não encontrada");
        }
        return pesquisarPalavra;
    }
}
