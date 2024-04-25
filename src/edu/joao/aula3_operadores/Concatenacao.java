package edu.joao.aula3_operadores;

public class Concatenacao {
    public static void main(String[] args) {
        String nomeCompleto = "João" + "Donato";
        String primeiroNome = "João";
        String segundoNome = "Donato";
        System.out.println(nomeCompleto);
        System.out.println(primeiroNome + segundoNome);
        System.out.println(primeiroNome + " " + segundoNome);

        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
