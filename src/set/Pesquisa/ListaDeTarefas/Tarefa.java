package set.Pesquisa.ListaDeTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public boolean isConcluida() {
        return concluida;
    }
    @Override
    public String toString(){
        return "Descrição: "+descricao+
                ", concluida= "+concluida;
    }
}
