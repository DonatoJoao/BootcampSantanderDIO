package edu.joao.aula3_operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /*
        && = E
        || = OU
         */
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("duas condições verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        if (condicao1 && (7>4)){
            System.out.println("duas verdadeiras");
        }
    }
}
