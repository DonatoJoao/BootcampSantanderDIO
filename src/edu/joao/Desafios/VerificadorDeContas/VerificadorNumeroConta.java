package edu.joao.Desafios.VerificadorDeContas;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        try {
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            // TODO: Chamar o método que veritica se o número da conta é valido



        } catch (IllegalArgumentException e) {
            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            System.out.println("Numero de conta valido.");
            // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
        } else {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }


}
