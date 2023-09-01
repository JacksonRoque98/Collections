package set.OperacoesBasicas;

public class ListaDeConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Jackson", 1);
        conjuntoConvidados.adicionarConvidado("Juan", 2);
        conjuntoConvidados.adicionarConvidado("Jessica", 3);

        System.out.println("'"+conjuntoConvidados.contarConvidados()+"' convidados até o momento");

        conjuntoConvidados.exibirConvidados();

        Integer convidadoRemovido = conjuntoConvidados.removerConvidadoPorCodigoConvite(1);

        System.out.println("O convidado com codigo de convite: '"+convidadoRemovido+"' não irá comparecer a festa");

        System.out.println("'"+conjuntoConvidados.contarConvidados()+"' convidados até o momento");

        conjuntoConvidados.exibirConvidados();

    }
}
