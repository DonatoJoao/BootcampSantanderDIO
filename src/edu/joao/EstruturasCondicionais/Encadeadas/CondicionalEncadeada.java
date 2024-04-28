package edu.joao.EstruturasCondicionais.Encadeadas;

public class CondicionalEncadeada {

    public static void main(String[] args) {
        int nota = 3;

        if(nota >=7){
            System.out.println("Aprovado");
        } else if (nota >=5 && nota < 7) {
            System.out.println("Racuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
