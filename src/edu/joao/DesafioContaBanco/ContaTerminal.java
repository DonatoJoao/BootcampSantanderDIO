package edu.joao.DesafioContaBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoConta;
        try {
            System.out.println("Digite seu nome: ");
            nomeCliente = leitura.next();
            System.out.println("Olá, " + nomeCliente + ". Digite o número para sua conta: ");
            numeroConta = leitura.nextInt();
            System.out.println(nomeCliente+  ", por favor, digite o número da Agência: ");
            agencia = leitura.next();
            System.out.println("Quanto dinheiro vai depositar ao abrir a conta?");
            double saldo = leitura.nextDouble();
            while (saldo<0) {
                saldoConta = saldo;
                System.out.println("Seu saldo está com " + saldoConta + " reais. Faça um deposito maior que R$" + saldoConta * -1 + "reais para sua conta ficar com saldo positivo.");
                double deposito = leitura.nextDouble();
                saldo+=deposito;
            }
                System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +
                        ", conta: " + numeroConta + " e seu saldo de: R$" + saldo + " reais já está disponível para saque.");

        } catch (InputMismatchException e){
            System.out.println("O número da conta deve ser em dígitos.");
        }
    }
}
