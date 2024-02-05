package org.example.exercicios.estruturaCondicional;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Entre com o seu número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse numero é PAR.");
        } else {
            System.out.println("Esse número é IMPAR.");
        }
        sc.close();
    }
}
