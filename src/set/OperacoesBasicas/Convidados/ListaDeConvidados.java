package set.OperacoesBasicas.Convidados;

public class ListaDeConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("'"+conjuntoConvidados.contarConvidados()+"' convidados até o momento");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("'"+conjuntoConvidados.contarConvidados()+"' convidados até o momento");


        conjuntoConvidados.exibirConvidados();

        Integer convidadoRemovido = conjuntoConvidados.removerConvidadoPorCodigoConvite(1);

        System.out.println("O convidado com codigo de convite: '"+convidadoRemovido+"' não irá comparecer a festa");

        System.out.println("'"+conjuntoConvidados.contarConvidados()+"' convidados até o momento");

        conjuntoConvidados.exibirConvidados();

    }
}
