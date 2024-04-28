package edu.joao.EstruturasCondicionais.CondicionaisComposta;

import java.util.Scanner;

public class CaixaEletronico2 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 25;
        double valorSolicitado;
        System.out.println("Quanto deseja sacar?");
        valorSolicitado = leitura.nextDouble();

        if (saldo >= valorSolicitado && valorSolicitado >0){
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Operação não realizada");
        }

        System.out.println("Saldo: " + saldo);
    }

}
