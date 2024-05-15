package edu.joao.Collections.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    private List<Item> itemList = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);


    }

//******************************************************************************
//           TENTAR FAZER METODO PRA REMOVER APENAS QUANTIDADES DE UNIDADE
//
//    public void removerQuantidadeItem(int quantidade) {
//        List<Item> QuantidadeParaRemover = new ArrayList<>();
//        if (!itemList.isEmpty()) {
//            for (Item i : itemList) {
//                if (i.getQuantidade() == quantidade) {
//                    QuantidadeParaRemover.add(i);
//                }
//            }
//
//            itemList.removeAll(QuantidadeParaRemover);
//        } else {
//            System.out.println("A lista está vazia!");
//        }
//    }
//******************************************************************************
    public void removerItem(String nome) {  //ESTE MÉTODO ESTÁ REMOVENDO O INTEM E TODA A QUANTIDADE DE ITENS, CRIAR SOLUÇÃO
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public String exibirItens() {
        return itemList.toString();
//        if (!itemList.isEmpty()) {
//            System.out.println(this.itemList);
//        } else {
//            System.out.println("A lista está vazia!");
//        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }


}
