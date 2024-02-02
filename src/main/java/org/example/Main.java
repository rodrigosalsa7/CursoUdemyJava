package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double x = 10.3767632;
        double y = 34.43;
        String nome = "Rodrigo";
        int idade = 30;
        double renda = 2150.45;



        System.out.println(x);
        //imprimindo a variável x apenas com duas casas decimais.
        System.out.printf("%.2f%n", x);
        //imprimindo a variável x apenas com quatro casas decimais.
        System.out.printf("%.4f%n", x);

        //informar que o local é EUA e imprimir o separador com "." e não com ",".
        Locale.setDefault(Locale.US);

        System.out.printf("%.4f%n", x);


        //concatenando elementos.
        System.out.println("O valor é: " + x + " METROS");

        //concatenando usando o PRINTF
        System.out.printf("Resultado = %.2f metros%n", x);
        //concatenando usando o PRINTF com mais de uma variável.
        //%f = ponto flutuante(double) $d = inteiro %s = texto %n = quebra de linha.
        System.out.printf("%s tem %d anos e ganha %.2f reais.%n", nome, idade, renda);


    }
}