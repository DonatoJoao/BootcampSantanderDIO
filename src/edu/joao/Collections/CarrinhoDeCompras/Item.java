package edu.joao.Collections.CarrinhoDeCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;
    int contador = 0;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        contador++;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() { //colocar numeração de itens add ao X
        return "Item X {" +
                "nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", quantidade: " + quantidade +
                '}';

    }
}
