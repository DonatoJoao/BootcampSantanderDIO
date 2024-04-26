package edu.joao.Forum.ItensDoForum;

// Criando e utilizando objetos da classe Carro
public class Main {
    public static void main(String[] args) {
        // Criando instâncias (objetos) da classe Carro
        ClasseCarro carro1 = new ClasseCarro("Toyota", "Corolla", 2022);
        ClasseCarro carro2 = new ClasseCarro("Ford", "Mustang", 2023);

        // Chamando método para exibir informações dos carros
        carro1.exibirInformacoes();
        System.out.println(); // Adicionando uma linha em branco
        carro2.exibirInformacoes();

        System.out.println(carro1.modelo);
        //carro1.modelo = "Etios"; cannot assign a value to final variable modelo


    }
}
