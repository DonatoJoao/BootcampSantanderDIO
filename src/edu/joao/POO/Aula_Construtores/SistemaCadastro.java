package edu.joao.POO.Aula_Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {

        //instanciando um objeto sem construtor
        //Pessoa marcos = new Pessoa();
        //marcos.setEndereco("Rua Amazonas");


        //Criando objeto com construtor
        Pessoa joao = new Pessoa("123456789-99", "João");
        System.out.println(joao.getCpf());
        System.out.println(joao.getNome());
    }
}
