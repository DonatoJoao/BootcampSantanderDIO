package edu.joao.POO.Aula_ENUM;

public class SistemaIBGE {
    public static void main(String[] args) {

//        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
//            System.out.println(e.getSigla() + " - " + e.getNome());
//        }

        EstadoBrasileiro ebSP = EstadoBrasileiro.SAO_PAULO;
        System.out.println(ebSP.getNome());
        System.out.println(ebSP.getSigla());
        System.out.println(ebSP.getIbge());

        EstadoBrasileiro ebPI = EstadoBrasileiro.PIAUI;
        System.out.println(ebPI.getNome());
        System.out.println(ebPI.getSigla());
        System.out.println(ebPI.getIbge());
    }
}
