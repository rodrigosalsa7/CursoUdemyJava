package org.example.exercicios.estruturaRepetitiva;

import java.util.Scanner;

public class exemploWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int soma = 0;


        System.out.println("Digite um número: ");
        x = scanner.nextInt();

        while (x != 0){
            soma = soma + x;
            System.out.println("Digite outro número: ");
            x = scanner.nextInt();
        }

        System.out.println("A soma dos valores digitados é: " + soma);
        scanner.close();
    }
}
