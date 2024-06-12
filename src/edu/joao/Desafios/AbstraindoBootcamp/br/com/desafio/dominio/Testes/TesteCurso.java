package edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Testes;

import edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Curso;

public class TesteCurso {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Aula sobre POO");
        curso.setCargaHoraria(80);

        System.out.println(curso.getCargaHoraria());
        System.out.println(curso.getTitulo());
        System.out.println(curso.getDescricao());


        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Spring boot");
        cursoSpring.setDescricao("Aula sobre Spring boot");
        cursoSpring.setCargaHoraria(80);

        System.out.println(cursoSpring.getCargaHoraria());
        System.out.println(cursoSpring.getTitulo());
        System.out.println(cursoSpring.getDescricao());

    }
}
