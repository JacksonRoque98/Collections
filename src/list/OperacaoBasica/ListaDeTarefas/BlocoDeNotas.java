package list.OperacaoBasica.ListaDeTarefas;

public class BlocoDeNotas{
    public static void main(String[] args) {

        //Instanciando uma Lista de Tarefas
        ListaTarefa listaTarefa = new ListaTarefa();

        //Verificando elementos na lista
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        //Adicionando descrição a lista de tarefa
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        //Verificando elementos na lista
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        //Removendo tarefa da lista (remove todas tarefas com essa descrição!)
        listaTarefa.removerTarefa("Tarefa 1");

        //Verificando elementos na lista
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        //Obter descrição da tarefa
        listaTarefa.obterDescricaoTarefas();
    }
}
