package edu.joao.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaAlunos {

    private Map<String, String> agendaAlunos;

    public AgendaAlunos() {
        this.agendaAlunos = new HashMap<>();
    }

    public void addAlunoAgenda(String diaSemanaEHorario, String nomeAluno){
        agendaAlunos.put(diaSemanaEHorario,nomeAluno);
    }
    public void removerAluno(String diaSemanaEHorario){
        if (!agendaAlunos.isEmpty()){
            agendaAlunos.remove(diaSemanaEHorario);
        }
    }

    public Map<String, String> exibirAgenda(){
        return agendaAlunos;
    }
    public String pesquisarPorHorarioDaAula(String diaSemanaEHorario){
        String horarioPorAluno = null;
        if (!agendaAlunos.isEmpty()){
            horarioPorAluno = agendaAlunos.get(diaSemanaEHorario);
        }
        return horarioPorAluno;
    }


}
