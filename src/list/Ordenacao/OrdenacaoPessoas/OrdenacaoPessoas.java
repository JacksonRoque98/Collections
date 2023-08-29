package list.Ordenacao.OrdenacaoPessoas;

import list.Ordenacao.OrdenacaoNumerica.ComparatorPorAltura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;
    public OrdenacaoPessoas(){
        this.pessoasList = new ArrayList<>();
    }

    public void exibirPessoas(){
        if(!pessoasList.isEmpty()){
            System.out.println(this.pessoasList);
        }
    }
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
}
