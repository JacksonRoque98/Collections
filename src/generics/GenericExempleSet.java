package generics;

import java.util.HashSet;
import java.util.Set;

public class GenericExempleSet {
    public static void main(String[] args) {
        //Exemplo sem o Generic
        Set conjuntoSemGeneric = new HashSet();
        conjuntoSemGeneric.add("Elemento 1");
        conjuntoSemGeneric.add(10); /*Permite adicionar qualquer tipo de objeto
        Porém na execução do laço for, irá gerar um erro!
        No laço for, estamos passando String, e não INT.*/

        //Exemplo com uso do Generic
        Set<String> conjuntoComGeneric = new HashSet<>();
        conjuntoComGeneric.add("Elemento 1");
        conjuntoComGeneric.add("Elemento 2"); //Permite adicionar somente objetos do tipo String.

        //Iterando sobre conjunto sem Generics(Necessário realizar o cast)
        for(Object elemento : conjuntoSemGeneric){
            String str = (String) elemento;
            System.out.println(str);
        }
        //Iterando sobre conjunto com o uso do Generic
        for(String elemento : conjuntoComGeneric){
            System.out.println(elemento);
        }
    }
}
