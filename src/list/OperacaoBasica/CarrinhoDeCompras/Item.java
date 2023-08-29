package list.OperacaoBasica.CarrinhoDeCompras;

public class Item {

    String nome;
    double preco;
    int quant;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quant;
    }

    public void setNome(String nome1){
        this.nome = nome1;
    }
    public void setPreco(double preco1){
        this.preco = preco1;
    }
    public void setQuantidade(int quantidade1){
        this.quant = quantidade1;
    }
    @Override
    public String toString() {
        return "Produto: Nome= "+getNome()+", Preço= "+
                getPreco()+", Quantidade= "+getQuantidade();
    }

}
