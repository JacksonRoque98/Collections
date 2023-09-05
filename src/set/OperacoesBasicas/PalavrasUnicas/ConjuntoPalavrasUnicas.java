package set.OperacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavraUnicaSet;

    ConjuntoPalavrasUnicas(){
        this.palavraUnicaSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavraUnicaSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavraUnicaSet.isEmpty()){
            if(palavraUnicaSet.contains(palavra)){
                palavraUnicaSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto de palavras");
            }
        }else{
            System.out.println("O conjunto está vazio.");
        }
    }
    public boolean verificarPalavra(String palavra){
        return palavraUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraUnicaSet);
    }
}
