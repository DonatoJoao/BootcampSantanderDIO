package edu.joao.StreamAPI.Lamda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Dois", "POO", "abstracao", "bootcamp");
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

    }



}
