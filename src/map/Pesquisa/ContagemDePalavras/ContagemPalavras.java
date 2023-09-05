package map.Pesquisa.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        contagemPalavrasMap.remove(palavra);
    }
    public int exibirContagemDePalavras(){
        Integer contagemTotal = 0;
        for(int contagem : contagemPalavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        Integer maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

}
