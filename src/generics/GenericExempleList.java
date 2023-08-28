package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExempleList {
    public static void main(String[] args) {
        //Exemplo sem o uso do Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(1); //Permite adicionar qualquer tipo de objeto!

        //Exemplo com o uso do Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");
        //listaGenerics.add(1); //com o uso do generics, só pode ser adicionado determinado tipo de dado.

        for(String elemento : listaGenerics){
            System.out.println(elemento);
        }

        for(Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
