package edu.joao.BancoDeDados.Entidade;

public class Guitarristas {
    private String nome;
    private String modeloGuitarra;
    private int quantidadeGravacoes;
    private int idade;
    private int anosTocandoGuitarra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModeloGuitarra() {
        return modeloGuitarra;
    }

    public void setModeloGuitarra(String modeloGuitarra) {
        this.modeloGuitarra = modeloGuitarra;
    }

    public int getQuantidadeGravacoes() {
        return quantidadeGravacoes;
    }

    public void setQuantidadeGravacoes(int quantidadeGravacoes) {
        this.quantidadeGravacoes = quantidadeGravacoes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnosTocandoGuitarra() {
        return anosTocandoGuitarra;
    }

    public void setAnosTocandoGuitarra(int anosTocandoGuitarra) {
        this.anosTocandoGuitarra = anosTocandoGuitarra;
    }
}
