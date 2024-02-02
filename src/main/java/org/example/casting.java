package org.example;

public class casting {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double resultado;

        resultado = a / b;
        System.out.println(resultado);

        //precisa passar o (double) antes para que possa ler como inteiro.
        resultado = (double)a / b;
        System.out.println(resultado);
    }
}
