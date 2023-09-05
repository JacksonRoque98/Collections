package list.OperacaoBasica.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public String removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        this.itemList.removeAll(itemParaRemover);
        return nome;
    }

    public double calcularValorTotal(){
        double valorCompra = 0;
        for(Item i : itemList){
            valorCompra = i.getPreco() * i.getQuantidade();
        }
        return valorCompra;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
}
