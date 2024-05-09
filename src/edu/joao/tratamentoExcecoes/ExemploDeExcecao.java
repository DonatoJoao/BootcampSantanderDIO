package edu.joao.tratamentoExcecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploDeExcecao {

    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
        //System.out.println(valor);

        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}

