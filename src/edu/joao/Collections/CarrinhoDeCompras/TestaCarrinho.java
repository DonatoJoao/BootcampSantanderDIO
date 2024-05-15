package edu.joao.Collections.CarrinhoDeCompras;

public class TestaCarrinho {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("KIA - Sportage 2023", 370000.00, 2);
        System.out.println(carrinhoDeCompras.exibirItens());
        carrinhoDeCompras.adicionarItem("Guitarra - Ibanez", 12000, 1);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        System.out.println(carrinhoDeCompras.exibirItens());
        carrinhoDeCompras.adicionarItem("produto", 5, 100);
        System.out.println(carrinhoDeCompras.exibirItens());


    }
}
