package set.Pesquisa.ListaDeTarefas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaPararRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaPararRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaPararRemover);
        }else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaPararRemover == null){
            System.out.println("Tarefa não encontrada");
        }
    }
    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isConcluida()){
                tarefaConcluida.add(t);
            }
        }
        return tarefaConcluida;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isConcluida()){
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = t;
                break;
            }
        }
        if(tarefaPendente != null){
            tarefaPendente.setConcluida(true);
        }else {
            System.out.println("Tarefa não encontrada na lista");
        }
    }
    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            tarefaSet.clear();
        }
    }
}
