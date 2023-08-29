package list.OperacaoBasica.ListaDeTarefas;

public class BlocoDeNotas{
    public static void main(String[] args) {

        //Instanciando uma Lista de Tarefas
        ListaTarefa listaTarefa = new ListaTarefa();

        //Adicionando descrição a lista de tarefa
        listaTarefa.adicionarTarefa("Ligar o pc");
        listaTarefa.adicionarTarefa("Verificar conexão com a internet");
        listaTarefa.adicionarTarefa("Retornar ao projeto");

        //Exibindo o número total de tarefas da sua lista
        System.out.println("Você tem "+listaTarefa.obterNumeroTotalTarefas()+" tarefas na lista:");

        //Exibindo lista de tarefa
        listaTarefa.obterDescricaoTarefas();

        //Removendo descrição da lista de tarefas
        String descricaoExcluida = listaTarefa.removerTarefa("Verificar conexão com a internet");

        //Nova lista de tarefas
        System.out.println("Voce completou a tarefa: "+descricaoExcluida);

        //Exibindo novo total de tarefas e a nova lista de tarefas.
        System.out.println("Você tem "+listaTarefa.obterNumeroTotalTarefas()+" tarefas na lista:");
        listaTarefa.obterDescricaoTarefas();

        //Removendo todas as tarefas
        listaTarefa.removerTodasTarefas();
        System.out.println("Você tem "+listaTarefa.obterNumeroTotalTarefas()+" tarefas a serem concluidas!" +
                " Parabens, você concluiu todas suas tarefas!");
    }
}
