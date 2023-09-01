package set.Ordenacao.GerenciamentoAluno;

public class CadastroAluno {
    public static void main(String[] args) {
        GerenciamentoAluno gerenciamentoAluno = new GerenciamentoAluno();

        gerenciamentoAluno.adicionarAluno("Jackson", 123456L, 10); //Colocar L no final para identificar o Long.
        gerenciamentoAluno.adicionarAluno("Juan", 654321L, 8.5);
        gerenciamentoAluno.adicionarAluno("Tony", 189213L, 3.5);
        gerenciamentoAluno.adicionarAluno("Joel", 456789L, 5.5);

        gerenciamentoAluno.exibirAlunoPorNome();

        gerenciamentoAluno.exibirAlunoPorNota();

        gerenciamentoAluno.removerAlunoPorMatricula(000L);
        gerenciamentoAluno.removerAlunoPorMatricula(456789L);
        System.out.println(gerenciamentoAluno.alunosSet);

    }
}
