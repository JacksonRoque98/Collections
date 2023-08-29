package list.Ordenacao.OrdenacaoPessoas;

public class OrdemPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoas("Jackson", 25, 1.85);
        ordenacaoPessoas.adicionarPessoas("Juan", 24, 1.83);

        ordenacaoPessoas.exibirPessoas();

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
