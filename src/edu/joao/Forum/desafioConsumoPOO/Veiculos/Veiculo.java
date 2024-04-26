package edu.joao.Forum.desafioConsumoPOO.Veiculos;

public abstract class Veiculo {
        private String marca;
        private ModeloVeiculo modelo;
        private boolean ligado = false;
        private int velocidade = 0;


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

        public boolean isLigado() {
                return ligado;
        }

        public void setLigado(boolean ligado) {
                this.ligado = ligado;
        }

        public int getVelocidade() {
                return velocidade;
        }

        public void setVelocidade(int velocidade) {
                this.velocidade = velocidade;
        }
        //criar:
        // método acelera
        // método freia
        //método ligar
        //método desligar
        //método puxar freio de mão

//        public void calculaConsumoGasolina (double precoGasolina){
//                System.out.println("Gasolina");
//        }
//        public void calculaConsumoEtanol (double precoEtanol){
//                System.out.println("Etanol");
//        }
}
