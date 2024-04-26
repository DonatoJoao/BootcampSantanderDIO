package edu.joao.Forum.desafioConsumoFormaSimples;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciando um objeto da classe Scanner pra capturar as informações do usuário
        Scanner leitura =new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.next();
        System.out.println("Olá, " + nome + "! Agora diga quanto você para pelo litro do ETANOL?");
        double valorEtanol = leitura.nextDouble();
        System.out.println(nome + ", quanto você para pelo litro da GASOLINA?");
        double valorGasolina = leitura.nextDouble();
        System.out.println("Quantos km seu carro anda com 1L de ETANOL?");
        double kmPorLitroEtanol = leitura.nextDouble();
        System.out.println("Quantos km seu carro anda com 1L de GASOLINA?");
        double kmPorLitroGasolina = leitura.nextDouble();

        if ((valorEtanol/kmPorLitroEtanol) > (valorGasolina/kmPorLitroGasolina)){
            System.out.println("Pelo consumo do seu carro e preço do combustível: compensa abastecer com ETANOL");
        } else {
            System.out.println("Pelo consumo do seu carro e preço do combustível: compensa abastecer com GASOLINA");
        }
        System.out.println("FIM!");
    }
}
