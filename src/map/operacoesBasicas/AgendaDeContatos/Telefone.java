package map.operacoesBasicas.AgendaDeContatos;

import map.operacoesBasicas.AgendaDeContatos.AgendaDeContatos;

public class Telefone {
    public static void main(String[] args) {
        //Instanciando a Agenda de Contatos;
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        //Adicionando contatos a agenda
        agendaDeContatos.adicionarContato("Jackson", 123456);
        agendaDeContatos.adicionarContato("Juan", 789123);
        agendaDeContatos.adicionarContato("Felipe", 12312456);
        agendaDeContatos.adicionarContato("Bruno", 123451236);
        agendaDeContatos.adicionarContato("Vito", 1123223456);
        agendaDeContatos.adicionarContato("Renan", 1234578656);
        agendaDeContatos.adicionarContato("Matheus", 12357836);

        //Exibindo agenda de contatos
        agendaDeContatos.exibirContatos();

        //Removendo contatos da agenda
        agendaDeContatos.removerContato("Matheus");
        agendaDeContatos.exibirContatos();

        //Pesquisar numero por nome
        String nomePesquisa = "Jackson";
        Integer numeroPesquisa = agendaDeContatos.pesquisarPorNome("Jackson");
        System.out.println("O número de telefone do " + nomePesquisa + " é: " + numeroPesquisa);

        //Pesquisando contato inexistente
        String nomePesquisaNaoExistente = "Carlos";
        Integer numeroPesquisaInexistente = agendaDeContatos.pesquisarPorNome("Carlos");


    }

}
