package edu.joao.DominandoJava.aula1_AnatomiaDasClasses;

public class PrimeirasAulas {

    public static void main(String[] args) {
        System.out.println("oi");
        System.out.println(welcome("Olá, Deus!")); //imprimindo o retorno do método
        String bemVindo = welcome("Olá, bootcamp"); // chamando o método através de uma variável
        System.out.println(bemVindo);
    }
    public static String welcome(String saudacao){
        return saudacao;
    }
    
}
