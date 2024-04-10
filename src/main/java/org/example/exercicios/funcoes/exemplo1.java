package org.example.exercicios.funcoes;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        //Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números da sua escolha: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // aqui estamos informando como calcular o maior número sem utilizar uma função.
       /* if (a > b && a > c){
            System.out.println("O maior número é: " + a);
        } else if (b > c){
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("O maior número é: " + c);
        }*/

        //calculando o maior número utilizando uma função

        int maiorNumero = max(a,b, c);

        showResult(maiorNumero);

        sc.close();
    }

    public static int max(int a, int b, int c){
        //funcão que recebe 3 valores e mostra o maior deles.
        int aux;
        if ( a > b && a > c){
            aux = a;
        } else if (b > c){
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value){
        //função que retorna o valor na tela
        System.out.println("O maior número é: " + value);
    }
}
