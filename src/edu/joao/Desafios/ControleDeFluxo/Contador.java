package edu.joao.Desafios.ControleDeFluxo;

import java.util.Scanner;

public class Contador {


    //TERMINAR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        //TODO: Implementar dentro do try/catch e capturar/tratar exceção
        contar(parametroUm, parametroDois);

    }

    //Aqui ta ok! Lógica funcionando, agora falta TODO acima
    private static void contar(int parametroUm, int parametroDois) {
        if (parametroUm<parametroDois){
            int contagem = parametroDois-parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("iteração " + (i+1) + " é o numero: " + (i+parametroUm));
            }

        } else {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }

    }


}


