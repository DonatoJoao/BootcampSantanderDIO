package edu.joao.StreamAPI.Lamda.Suplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(3)
                .toList();

    listaSaudacoes.forEach(System.out::println);
    }


}
