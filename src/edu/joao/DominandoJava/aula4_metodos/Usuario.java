package edu.joao.DominandoJava.aula4_metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        System.out.println("A TV está no canal: " + tv.canal);
        System.out.println("A TV está ligada? " + tv.ligada);
        System.out.println("A TV está com o volume: " + tv.volume);

        tv.ligarTv();
        System.out.println("A TV está ligada? " + tv.ligada);

        tv.desligarTv();
        System.out.println("A TV está ligada? " + tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        tv.avancarCanal();
        System.out.println("A TV está no canal: " + tv.canal);
        tv.escolherCanal(25);
        System.out.println("A TV está no canal: " + tv.canal);
        tv.escolherCanal(200);
        tv.escolherCanal(-10);
        System.out.println("A TV está no canal: " + tv.canal);



    }
}