package map.operacoesBasicas.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaDeContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else{
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos(){
        if(!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        }else{
            System.out.println("Não existe contatos na sua agenda.");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato inexistente!");
            }
        }else{
            System.out.println("Sua lista de contatos está vazia.");
        }
        return numeroPorNome;
    }



}
