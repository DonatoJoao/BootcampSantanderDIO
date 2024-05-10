package edu.joao.Desafios.ValidacaoProcessoSeletivo.Aulas;

public class Aula1AnalisandoCandidatos {

    public static void main(String[] args) {

        System.out.println("Processo Seletivo");
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2500);

    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase>salarioPretendido){
            System.out.println("Candidato Selecionado");
        } else if (salarioBase==salarioPretendido) {
            System.out.println("Aguardando demais candidatos");
        } else {
            System.out.println("Candidato Reprovado");
        }

    }

}
