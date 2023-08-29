package list.Ordenacao.OrdenacaoNumerica;

public class Numeros {
    public static void main(String[] args) {
        //Instanciando Classe Ordenação de numeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //Adicionando Números a lista
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(150);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(35);
        ordenacaoNumeros.adicionarNumero(21);

        //Exibindo números
        System.out.println("Os números digitados são:");
        ordenacaoNumeros.exibirNumeros();

        //Numeros em ordem crescente
        System.out.println("Números em ordem crescente:\n"+ordenacaoNumeros.ordenarCrescente());

        //Numeros em ordem decrescente
        System.out.println("Números em ordem decrescente:\n"+ordenacaoNumeros.ordenarDecrescente());
    }
}
