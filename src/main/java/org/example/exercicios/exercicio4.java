package org.example.exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
        // do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Informe o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        b = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        c = sc.nextInt();
        System.out.println("Informe o quarto número: ");
        d = sc.nextInt();

        int resultado = (a * b - c * d);

        System.out.println("A diferença do produto do número 1 e 2 - número 3 e 4 é de: " +  resultado + ".");
    }
}
