package org.example.exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        Scanner sc = new Scanner(System.in);
        double A, B, C, areaTriangulo, areaCirulo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159;


        System.out.println("Informe o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Informe o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Informe o valor de C: ");
        C = sc.nextDouble();

        areaTriangulo = A * C;
        areaCirulo = pi * C * C;
        areaTrapezio = (A + B) * C/2;
        areaQuadrado = B * A;
        areaRetangulo = B * C;

        System.out.println("A área do triângulo é: " + areaTriangulo);
        System.out.println("A área do circulo é: " + areaCirulo);
        System.out.println("A área do trapézio é: " + areaTrapezio);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("A área do retângulo é: " + areaRetangulo);

    }
}
