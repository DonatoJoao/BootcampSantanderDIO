package edu.joao.Forum.ItensDoForum;

public class ClasseCarro {

    // Definição da classe Carro

        // Atributos
        final String marca;
        final String modelo;
        final int ano;

        // Método construtor
        public ClasseCarro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        // Método para exibir informações do carro
        public void exibirInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
        }
    }

