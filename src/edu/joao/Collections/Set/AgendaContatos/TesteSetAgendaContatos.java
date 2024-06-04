package edu.joao.Collections.Set.AgendaContatos;

public class TesteSetAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContato("João", 1234);
        agendaContatos.addContato("Pri", 4321);
        agendaContatos.addContato("Pri Donato", 1235);
        agendaContatos.addContato("João",0); //não foi salvo

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Pri"));
        agendaContatos.atualizarNumeroContato("João", 0);
        agendaContatos.exibirContatos();
    }
}
