package list.Ordenacao.OrdenacaoPessoas;

public class OrdemPessoas {
    public static void main(String[] args) {
        //Instanciando a classe Ordenação de Pessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        //Adicionando Pessoas a lista
        ordenacaoPessoas.adicionarPessoas("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoas("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoas("Nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoas("Nome 4", 17, 1.56);

        //Exibindo as pessoas da lista
        System.out.println("Lista de pessoas:");
        ordenacaoPessoas.exibirPessoas();

        //Ordenando pessoas por altura
        System.out.println("Ordenando pessoas por altura:");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        //Ordenando pessoas por idade
        System.out.println("Ordenando pessoas por idade:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

    }
}
