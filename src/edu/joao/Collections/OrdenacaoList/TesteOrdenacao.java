package edu.joao.Collections.OrdenacaoList;

public class TesteOrdenacao {

    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.addPessoa("Pri", 31, 1.60);
        ordenacaoPessoa.addPessoa("João",40,1.82);
        ordenacaoPessoa.addPessoa("Frankstein", 200, 2.5);
        ordenacaoPessoa.addPessoa("Masha",3,1.4);

        System.out.println(ordenacaoPessoa.getPessoaList());
        System.out.println(ordenacaoPessoa.ordenarporIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.getPessoaList());
    }
}
