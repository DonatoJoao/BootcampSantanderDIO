package edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Testes;

import edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class TesteMentoria {

    public static void main(String[] args) {
        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("Java");

        System.out.println(mentoria.getData());
    }

}
