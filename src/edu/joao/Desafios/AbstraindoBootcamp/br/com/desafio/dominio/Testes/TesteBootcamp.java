package edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Testes;

import edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Bootcamp;
import edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Curso;
import edu.joao.Desafios.AbstraindoBootcamp.br.com.desafio.dominio.Dev;

public class TesteBootcamp {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java Avancado");
        Dev joao = new Dev();
        Bootcamp bootcamp = new Bootcamp();
        Bootcamp bootcamp2 = new Bootcamp();
        Bootcamp bootcamp3 = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Java POO");
        bootcamp.getConteudos().add(curso);
        joao.setNome("João");

        joao.inscreverBootcamp(bootcamp);
        joao.inscreverBootcamp(bootcamp2);
        joao.inscreverBootcamp(bootcamp3);


        System.out.println(joao.getConteudosInscritos());

        joao.progredir();
        joao.progredir();
        System.out.println(joao.calcularTotalXp());

        joao.progredir();
        System.out.println(joao.getConteudosConcluidos());
        System.out.println(joao.getConteudosInscritos());


    }
}
