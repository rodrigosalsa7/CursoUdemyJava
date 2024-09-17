package org.example.exercicios.estruturaRepetitiva;

import org.example.exercicios.entities.Triangle;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        /*Fazer um programa para ler as medidas dos lados de dois triângulos. Em seguida, mostrar o valor
        da área de um triângulo a partir das medidas de seus lados, a, b e c.
         */
        Scanner sc = new Scanner(System.in);
        //instanciando as classes do triangle.
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Digite as os dados do triângulo X : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as os dados do triângulo Y : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        //chamada da área vinculada ao entities Triangle
        double areaX = x.area();
        double areaY = y.area();

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
