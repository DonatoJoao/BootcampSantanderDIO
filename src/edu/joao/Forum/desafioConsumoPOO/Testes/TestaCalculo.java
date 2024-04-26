package edu.joao.Forum.desafioConsumoPOO.Testes;

import edu.joao.Forum.desafioConsumoPOO.Veiculos.Carro;
import edu.joao.Forum.desafioConsumoPOO.Veiculos.ModeloVeiculo;

public class TestaCalculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        carro.setModelo(modeloVeiculo);
        carro.setMarca("Honda");
        modeloVeiculo.setNomeVeiculo("Civic");
        System.out.println(carro.getModelo().getNomeVeiculo());

        carro.calculaConsumoGasolina(5.69); //Em construção
    }
}
