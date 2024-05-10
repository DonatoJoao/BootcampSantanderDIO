package edu.joao.Desafios.ControleDeFluxo;

public class ParametrosInvalidosException extends Exception {

      //COMO CRIAR E USAR ISSO NO DESAFIO?
        static String validaEntrada(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm>parametroDois){
                throw new ParametrosInvalidosException();
            }
            return "O primeiro parametro deve ser menor que o segundo";
        }

}
