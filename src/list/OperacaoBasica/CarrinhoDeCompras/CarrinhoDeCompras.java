package list.OperacaoBasica.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public String removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
        return nome;
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }

    }
    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString(){
        return "CarrinhoDeCompras{"+
                "itens="+itemList+
                "}";
    }

}
