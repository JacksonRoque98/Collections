package list.Pesquisa.Numero;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Instanciando uma lista de numeros
    private List<Integer> numeros;
    //Instanciando o construtor
    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }
    //Adicionando numeros a lista
    public void adicionarNumero(Integer numero){
        this.numeros.add(numero);
    }
    //Somando todos os numeros da lista
    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }
    //Verificando o maior numero
    public int maiorNumero(){
        int maiorNumero = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }
    //Verificando o menor numero
    public int menorNumero(){
        int menorNumero = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }
    //exibindo os numeros
    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
}
