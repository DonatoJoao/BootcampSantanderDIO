package edu.joao.Collections.Set.Produtos;

public class TesteProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.addProduto(1L, "Guitarra Gibson", 500d, 5);
        cadastroProdutos.addProduto(2L, "Guitarra Ibanez", 400d, 2);
        cadastroProdutos.addProduto(10L, "Trombobe", 700d, 100);
        cadastroProdutos.addProduto(8L, "Cavaco", 5d, 50);
        System.out.println(cadastroProdutos.produtosSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }
}
