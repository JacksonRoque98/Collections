package list.OperacaoBasica.CarrinhoDeCompras;

public class Caixa {
    public static void main(String[] args) {
        //Instanciando Carrinho De Compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lapis", 8d,2);
        carrinhoDeCompras.adicionarItem("Caneta", 12.5d,3);
        carrinhoDeCompras.adicionarItem("Borracha", 5.0d,1);

        //Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        //Removendo um item do carrinho
        String itemRemovido = carrinhoDeCompras.removerItem("Borracha");

        //Exibindo os itens do carrinho atualizado
        System.out.println("Você pediu para remover o item: "+itemRemovido);
        System.out.println("Sua nova lista é: ");
        carrinhoDeCompras.exibirItens();

        //Exibindo o valor total da compra
        System.out.println("O valor total da compra é: R$"+carrinhoDeCompras.calcularValorTotal());

    }
}
