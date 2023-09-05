package list.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //Instanciando uma lista de pessoas
    private List<Pessoa> pessoasList;

    //Instanciando um construtor de pessoas
    public OrdenacaoPessoas(){
        this.pessoasList = new ArrayList<>();
    }
    //Adicionando Pessoas a lista
    public void adicionarPessoas(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }else {
            throw new RuntimeException("A lista está vazia.");
        }
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
            return pessoaPorAltura;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirPessoas() {
        System.out.println(pessoasList);
    }
}
