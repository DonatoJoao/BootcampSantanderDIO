package edu.joao.Desafios.DesafioUm;

import java.util.Scanner;
//DESAFIO 1
public class DesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean programaLigado = true;
        while (programaLigado){
            System.out.println("Digite uma opção: \n " +
                    "1. Depositar \n " +
                    "2. Sacar \n " +
                    "3. Consultar Saldo \n " +
                    "0. Encerrar \n ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldo+valorDeposito;
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                        if (saldo < valorSaque){
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo = saldo-valorSaque;
                            System.out.println("Saldo atual: R$" + saldo);
                        }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    programaLigado = !programaLigado;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
