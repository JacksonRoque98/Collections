package set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contatos> contatosSet;

    public AgendaContatos(){
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContatos(){
        if(!contatosSet.isEmpty()){
            System.out.println(contatosSet);
        }else{
            System.out.println("A lista de contatos está vazia.");
        }
    }
    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatoPorNome = new HashSet<>();
        if(!contatosSet.isEmpty()){
            for(Contatos c : contatosSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
            return contatoPorNome;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Contatos atualizarContato(String nome, int novoNumero){
        Contatos contatoAtualizado = null;
        if(!contatosSet.isEmpty()){
            for(Contatos c : contatosSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }


}
