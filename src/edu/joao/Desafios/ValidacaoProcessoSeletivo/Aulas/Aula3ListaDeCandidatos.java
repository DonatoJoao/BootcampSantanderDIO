package edu.joao.Desafios.ValidacaoProcessoSeletivo.Aulas;

public class Aula3ListaDeCandidatos {
    public static void main(String[] args) {
        imprimirSelecionados();


    }
    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo lista de candidatos");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato de numero: " + (i+1) + " é o: " + candidatos[i]);
        }
    }


}
