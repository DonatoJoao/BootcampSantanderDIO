package edu.joao.aula3_operadores;

public class Operadorternario {
    public static void main(String[] args) {
        /*
        Representado pelos síbolos ?: com a seguinte sintaxe
            <expressão condicional> ? <caso condição seja TRUE> :
            <caso condição seja FALSE>
         */

        int a,b;
        a = 5;
        b = 6;
        String resultado = a==b? "verdadeiro" : "falso"; //retornando uma string
        System.out.println(resultado);
        int resultadoInt = a==b? 1 : 0;
        System.out.println(resultadoInt);

        //Operadores RELACIONAIS
        // == , != , < , > , <= , >=

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual numero2: " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente do numero2: " + simNao);
        simNao = numero1<numero2;
        System.out.println("numero1 é menor que numero2: " + simNao);

        if (numero1 > numero2){
            System.out.println("condição verdadeira");
        } else {
            System.out.println("condição falsa");
        }

        String nome = "João";
        String nome2 = "João";
        System.out.println(nome == nome2);
        String nome3 = new String("João");
        System.out.println(nome == nome3); // diferença entre objetos
        System.out.println(nome.equals(nome3)); // método para comparar conteúdo

    }
}
