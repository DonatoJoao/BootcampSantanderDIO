package edu.joao.Collections.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> tarefaList;

    public ListaDeTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removeTarefa(String descricao){
        //tarefaList.removeAll();
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public String obterDescricoesTarefas(){
        return tarefaList.toString();
    }
}
