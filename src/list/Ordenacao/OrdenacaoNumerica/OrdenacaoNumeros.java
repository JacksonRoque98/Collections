package list.Ordenacao.OrdenacaoNumerica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }
    public List<Integer> ordenarCrescente(){
        List<Integer> ordemCrescente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            Collections.sort(ordemCrescente);
            return ordemCrescente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDecrescente(){
        List<Integer> ordemCrescente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            ordemCrescente.sort(Collections.reverseOrder());
            return ordemCrescente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else {
            System.out.println("A lista está vazia");
        }
    }
}
