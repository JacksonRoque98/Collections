package list.OperacaoBasica.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public String removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()){
            for(Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }

        return descricao;
    }

    public void removerTodasTarefas(){
        System.out.println("Excluindo todas as tarefas.");
        tarefaList.removeAll(tarefaList);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else {
            System.out.println("A lista está vazia");
        }
    }
}
