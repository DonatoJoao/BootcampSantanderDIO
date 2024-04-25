package edu.joao.aula3_operadores;

public class OperadorUnario {
    public static void main(String[] args) {
        /*
            Aplicados junto com outro operador
            para funções de incremento/decremento,
            inverter valores numéricos e booleanos
         */
        int numero = 5;
        System.out.println( - numero);
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        numero = + numero; //não altera o valor para positivo
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //incremento
        numero++; // é o mesmo que numero + 1

        System.out.println(numero++);//aqui ele primeiro imprime a variavel depois incrementa
        System.out.println(numero);
        System.out.println(++numero);//aqui primeiro há o incremente e depois o valor exibido

        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);

        boolean informacao = true;
        System.out.println(!informacao); //apenas imprime o valor, mas não armazena a alteração
        System.out.println(informacao);
        informacao = !informacao; //invertendo o valor lógico
        System.out.println(informacao);
    }
}