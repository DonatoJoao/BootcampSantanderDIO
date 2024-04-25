package edu.joao.DominandoJava.aula2_TiposEVariaveis;

public class Main {
    public static void main(String[] args) {
        //variaveis
        byte numero = 123;
        int idade; //variavel do tipo inteiro sem valor atribuído
        int anoDeFabricacao = 2020; // variavel com valor inicializado
        double salarioMinimo = 7500.00; //variavel do tipo double com valor de um sonho :)
        long valorMeuSalario = 9000999876543L; //tipo long deve terminar com L
        String nome = "Donato";
        String cpfDonato = "789456123-00";

        //constantes em Java
        final double PI = 3.14; // valor não alterável e por convenção, usar UPPERCASE para nomear constantes
        final String cpfJoao = "123456789-99";

        //Improvisando e testando "métodos" (?) da classe String
        System.out.println("Quantidade de caracteres desse cpf: " + cpfJoao.length());
        System.out.println(cpfJoao.compareTo("123456789-99")); //
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.concat(cpfDonato));
        System.out.println(nome.contains("D"));
        System.out.println(nome.contains("d"));
        System.out.println(nome.toLowerCase().contains("d"));



    }
}
