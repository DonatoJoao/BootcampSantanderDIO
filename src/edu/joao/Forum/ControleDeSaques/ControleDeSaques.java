package edu.joao.Forum.ControleDeSaques;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ControleDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = 1000;
        double saque = 0;
        double totalSacado = 0;
        double saldo = 30000;


        while (totalSacado <= limiteDiario){
            System.out.println("Quanto deseja sacar? ");
            saque = scanner.nextDouble();
            if (saldo < saque || saque > limiteDiario) {
                System.out.println("Valor indisponível ou maior que limite diário");
                break;
            } else if ( totalSacado == limiteDiario) {
                System.out.println("Vc atingiu o limite diário");
                break;
            } else {
                saldo = saldo - saque;
                totalSacado = totalSacado + saque;
            }
        }
//        for (double i = limiteDiario; i > totalSacado ; saldo = saldo - saque) {
//            System.out.println("Quanto deseja sacar?");
//            saque = scanner.nextDouble();
//            double limiteParaSacar = limiteDiario - saque;
//            System.out.println("Saldo: " + saldo);
//            System.out.println("limite diário disponível para sacar: " + limiteParaSacar);
//
//        }
    }
}
