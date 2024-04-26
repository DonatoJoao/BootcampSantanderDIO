package edu.joao.Forum.desafioConsumoPOO.Veiculos;

public abstract class Veiculo {
        private String marca;
        private ModeloVeiculo modelo;

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public ModeloVeiculo getModelo() {
                return modelo;
        }

        public void setModelo(ModeloVeiculo modelo) {
                this.modelo = modelo;
        }

        public void calculaConsumoGasolina (double precoGasolina){
                System.out.println("Gasolina");
        }
        public void calculaConsumoEtanol (double precoEtanol){
                System.out.println("Etanol");
        }
}
