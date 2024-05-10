package edu.joao.Desafios.ValidacaoProcessoSeletivo.Aulas;

import java.util.concurrent.ThreadLocalRandom;

public class Aula2SelecionandoCandidatos {

    public static void main(String[] args) {
            selecaoCandidatos();
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou: " + salarioPretendido + " de salario");
            if (salarioBase>=salarioPretendido){
                System.out.println(candidato + " foi selecionado(a) para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
}
