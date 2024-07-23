package org.example.exercicios.funcoes;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        /*Fazer um programa para ler as medidas dos lados de dois triângulos. Em seguida, mostrar o valor
        da área de um triângulo a partir das medidas de seus lados, a, b e c.
         */
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as os dados do triângulo X : ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as os dados do triângulo Y : ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        //fórmula para calcular a raiz quadrada dos lados do triângulo X
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB + yC) / 2;
        //fórmula para calcular a raiz quadrada dos lados do triângulo X
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));

        System.out.printf("A área do triângulo X é: %.4f%n", areaX);
        System.out.printf("A área do triângulo Y é: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("O triângulo com a maior área é o triângulo X.");
        } else {
            System.out.println("O triângulo com a maior àrea é o triângulo Y.");
        }

        sc.close();

    }
}
