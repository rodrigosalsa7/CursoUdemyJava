package org.example.exercicios.estruturaCondicional;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Entre com um número: ");
        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Esse número é negativo.");}
        else if (numero == 0) {
            System.out.println("Esse número não é negativo.");
        } else {
            System.out.println("Esse número é positivo.");
        }
        sc.close();
    }

}
