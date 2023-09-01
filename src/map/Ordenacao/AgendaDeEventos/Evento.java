package map.Ordenacao.AgendaDeEventos;

public class Evento {
    private String nomeEvento;
    private String descricaoAtracao;
    public Evento(String nomeEvento, String descricaoAtracao) {
        this.nomeEvento = nomeEvento;
        this.descricaoAtracao = descricaoAtracao;
    }
    public String getNome(){
        return nomeEvento;
    }
    public String getDescricao(){
        return descricaoAtracao;
    }
    public void setDescricao(String descricaoAtracao){
        this.descricaoAtracao = descricaoAtracao;
    }

    @Override
    public String toString(){
        return "Nome do evento "+nomeEvento+
                ". Atrações: "+descricaoAtracao;
    }
}
