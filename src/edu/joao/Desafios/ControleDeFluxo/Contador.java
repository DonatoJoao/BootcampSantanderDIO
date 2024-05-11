package edu.joao.Desafios.ControleDeFluxo;

import javax.sound.sampled.SourceDataLine;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        try {
            System.out.println("Digite o primeiro número");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número maior que o primeiro");
            parametroDois = terminal.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Você deve digitar somente números");
        }


        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
               throw new ParametrosInvalidosException(exception);
        }
    }
    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm<parametroDois){
            int contagem = parametroDois-parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("iteração " + (i+1) + " é o numero: " + (i+parametroUm));
            }
        } else {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}


