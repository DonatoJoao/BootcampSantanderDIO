package edu.joao.EstruturasCondicionais.SwitchCase;

public class PlanoAssinatura {

    public static void main(String[] args) {
        String plano = "T"; // M ou T

        switch (plano){
            case "T":{
                System.out.println("5Gb de internet");
            } // usa-se o Break quando as opções abaixo não poderiam contemplar a lógica
                // as vezes podemos deixar um case sem break pra que a opção possa ter mais de um "beneficio", tipo
                // esses planos
            case "M":{
                System.out.println("WhatsApp gratuito");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }

        }

    }
}
