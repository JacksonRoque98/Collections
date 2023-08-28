package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericExempleMap {
    public static void main(String[] args) {
        //Exemplo sem Generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "Valor"); //Permite adicionar qualquer tipo de dados

        //Exemplo com Generics
        Map<String, Integer> mapaComGenerics = new HashMap<>();
        mapaComGenerics.put("Chave 1", 10);
        mapaComGenerics.put("Chave 2", 20);

        //Iterando sobre o mapa com generics
        for(Map.Entry<String, Integer> entry : mapaComGenerics.entrySet()){
            String chave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("A Chave: "+chave+" tem o valor: "+valor);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    //Iterando sobre o mapa sem o Generics
        for(Object obj : mapaSemGenerics.entrySet()){
            Map.Entry entry1 = (Map.Entry) obj;
            String chave1 = (String) entry1.getKey();
            Object valor1 = entry1.getValue();
            System.out.println("Chave: "+chave1+" valor: "+valor1);


        }
    }


}
