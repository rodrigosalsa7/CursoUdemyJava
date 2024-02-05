package org.example.exercicios.estruturaCondicional;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scanner.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

        scanner.close();
    }
}
