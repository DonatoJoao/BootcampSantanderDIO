package edu.joao.EstruturasCondicionais.CondicionaisSimples;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 25;
        double valorSolicitado;
        System.out.println("Quanto deseja sacar?");
        valorSolicitado = leitura.nextDouble();

        if (saldo >= valorSolicitado && valorSolicitado >0){
            saldo = saldo - valorSolicitado;
        }
        System.out.println("Saldo: " + saldo);
    }

}
