package edu.joao.Collections.Map;

public class TesteMapAgendaAlunos {

    public static void main(String[] args) {
        AgendaAlunos agendaAlunos = new AgendaAlunos();
        agendaAlunos.addAlunoAgenda("2f às 10h ", " Gabriel");
        agendaAlunos.addAlunoAgenda("2f às  16h ", " Maria de Lourdes");
        agendaAlunos.addAlunoAgenda("2f às 20h ", " Luis");
        agendaAlunos.addAlunoAgenda("4f às  9h ", " Davi");
        agendaAlunos.addAlunoAgenda("4f às  11 ", " Beto");


        System.out.println(agendaAlunos.pesquisarPorHorarioDaAula("2f - 16h"));

        //agendaAlunos.addAlunoAgenda("2f às 10h", "Fulano");
        System.out.println(agendaAlunos.exibirAgenda());
        agendaAlunos.removerAluno("2f às 20h ");
        System.out.println(agendaAlunos.exibirAgenda());
    }


}
