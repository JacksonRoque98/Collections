package set.OperacoesBasicas.PalavrasUnicas;

public class VerificadorPalavra {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //Adicionando Palavra
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("C#");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("C");

        //Exibindo Palavras
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Verificando se existe a palavra no conjunto
        System.out.println("A palavra Java está no conjunto? "+conjuntoPalavrasUnicas.verificarPalavra("Java"));

        //Removendo uma palavra da coleção
        conjuntoPalavrasUnicas.removerPalavra("C#");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
