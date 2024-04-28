package edu.joao.EstruturasCondicionais.Ternaria;

public class CondicionalTernaria {

    public static void main(String[] args) {
        int nota = 6;
//        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
//
//        System.out.println(resultado);

        String resultado = nota>= 7 ? "Aprovado": nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }

}
