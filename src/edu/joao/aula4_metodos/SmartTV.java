package edu.joao.aula4_metodos;

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv (){
        this.ligada = true;
    }
    public void desligarTv (){
        this.ligada = false;
    }

    public void aumentarVolume (){
        this.volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public int avancarCanal(){
        return this.canal++;
    }
    public int diminuirCanal(){
        return this.canal--;
    }
    public int escolherCanal(int canal){
        if (canal <= 0 || canal >=101){
            System.out.println("Canal inválido");

        } else {
            return this.canal = canal;
        }
        return this.canal;
    }

}
