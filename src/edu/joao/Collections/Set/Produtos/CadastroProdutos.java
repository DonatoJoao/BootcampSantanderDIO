package edu.joao.Collections.Set.Produtos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(nome, cod, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtosPoNome = new TreeSet<>(produtosSet);
        return produtosPoNome;
        }
    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }


}
    class ComparatorPorPreco implements Comparator<Produtos>{

        @Override
        public int compare(Produtos p1, Produtos p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

