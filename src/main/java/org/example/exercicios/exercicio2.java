package org.example.exercicios;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Escreva o seu primeiro número:");
        numero1 = sc.nextInt();
        System.out.println("Escreva o seu segundo número:");
        numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma do primeiro número: " + numero1 +
                " com o segundo número: " + numero2 + ", é igual a: " + soma + ".");

    }
}
