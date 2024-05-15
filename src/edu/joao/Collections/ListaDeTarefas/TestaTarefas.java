package edu.joao.Collections.ListaDeTarefas;

public class TestaTarefas {
    public static void main(String[] args) {

        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        System.out.println("Numero de elementos: "+listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.addTarefa("Tarefa 1");
        listaDeTarefas.addTarefa("Tarefa 2");
        System.out.println("Numero de elementos: "+ listaDeTarefas.obterNumeroTotalTarefas());

        System.out.println(listaDeTarefas.obterDescricoesTarefas());
        listaDeTarefas.removeTarefa("Tarefa 1");
        System.out.println("Numero de elementos: "+listaDeTarefas.obterNumeroTotalTarefas());

    }
}
