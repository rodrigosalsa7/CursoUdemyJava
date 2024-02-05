package org.example.exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        // o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Scanner sc = new Scanner(System.in);

        int codigo1, numeroDePeca, codigo2, quantidade1, quantidade2;
        double valor1, valor2, valorTotal1, valorTotal2, valorTotal;

        System.out.println("Informe o código da primeira peça: ");
        codigo1 = sc.nextInt();
        System.out.println("Informe o valor da primeira peça: ");
        valor1 = sc.nextDouble();
        System.out.println("Informa a quantidade de peças do produto 1:");
        quantidade1 = sc.nextInt();
        System.out.println("Informe o código da segunda peça: ");
        codigo2 = sc.nextInt();
        System.out.println("Informe o valor da segunda peça: ");
        valor2 = sc.nextDouble();
        System.out.println("Informa a quantidade de peças do produto 2:");
        quantidade2 = sc.nextInt();

        valorTotal1 = valor1 * quantidade1;
        valorTotal2 = valor2 * quantidade2;
        valorTotal = valorTotal1 + valorTotal2;

        System.out.println("Código da peça 1: " + codigo1);
        System.out.println("Valor da peça 1: " + valor1);
        System.out.println("Quantidade da primeira peça: " + quantidade1);
        System.out.println("Valor total da peça 1: " + valorTotal1);
        System.out.println("Código da peça 2: " + codigo2);
        System.out.println("Valor da peça 2: " + valor2);
        System.out.println("Quantidade da segunda peça: " + quantidade2);
        System.out.println("Valor total da peça 2: " + valorTotal2);
        System.out.println("Valor total das compras: " + valorTotal);

    }
}
