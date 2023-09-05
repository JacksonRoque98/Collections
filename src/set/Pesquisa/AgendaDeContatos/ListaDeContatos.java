package set.Pesquisa.AgendaDeContatos;

public class ListaDeContatos {
    public static void main(String[] args) {
        //Instanciando Agenda de Contatos
        AgendaContatos agendaContatos = new AgendaContatos();

        //Adicionando contatos a agenda
        agendaContatos.adicionarContato("Jackson", 123456789);
        agendaContatos.adicionarContato("Juan", 1239876543);
        agendaContatos.adicionarContato("Jessica", 12563532);
        agendaContatos.adicionarContato("Joseilton", 457345235);
        agendaContatos.adicionarContato("Maria", 121341253);

        //Exibindo lista de contatos
        agendaContatos.exibirContatos();


        //Atualizando contato
        agendaContatos.atualizarContato("Jackson", 987654321);

        //exibindo lista de contatos atualizada
        agendaContatos.exibirContatos();

        //Pesquisando contato pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Jackson"));
    }
}
