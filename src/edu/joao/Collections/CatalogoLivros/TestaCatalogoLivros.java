package edu.joao.Collections.CatalogoLivros;

public class TestaCatalogoLivros {

    public static void main(String[] args) {
        CataloLivros cataloLivros = new CataloLivros();
        cataloLivros.adicionarLivro("Livro 1", "João", 2024);
        cataloLivros.adicionarLivro("Livro 2", "Pri", 2020);
        cataloLivros.adicionarLivro("Antigo Testamento", "Deus", 0);
        cataloLivros.adicionarLivro("Novo Testamento", "Deus", 0);
        System.out.println(cataloLivros.pesquisarAutor("Deus"));
        System.out.println(cataloLivros.pesquisaPorIntervaloAnos(2020,2024));
        System.out.println(cataloLivros.pesquisaPorIntervaloAnos(2020,2021));
        System.out.println(cataloLivros.pesquisarPorTitulo("Novo Testamento"));

    }
}
