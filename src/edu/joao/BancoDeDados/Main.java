package edu.joao.BancoDeDados;

import edu.joao.BancoDeDados.DAO.GuitarristasDAO;
import edu.joao.BancoDeDados.Entidade.Guitarristas;

public class Main {
    public static void main(String[] args) throws Exception{
        Guitarristas g = new Guitarristas();
        g.setNome("João");
        g.setIdade(40);
        g.setModeloGuitarra("Semi acustica");
        g.setAnosTocandoGuitarra(25);

        new GuitarristasDAO().cadastrarGuitarristas(g);
    }
}
