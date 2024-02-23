package org.example.exercicios.estruturaRepetitiva;

import java.util.Scanner;

public class exemploFor {
    public static void main(String[] args) {

        //treinando a estrututa FOR(ENQUANTO).

        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.println("Digite a quantidade de vezes que deseja repetir: ");
        //primeiramente informamos a quantidade de vezes que queremos REPETIR = N.
        N = scanner.nextInt();

        int soma = 0;
        //FOR (início; condição ; incremento){ comando 1, comando 2}
        for (int i = 0; i < N; i++ ){
            System.out.println("Informe o número de X: ");
            int x = scanner.nextInt();
            soma = soma + x;
        }

        System.out.println("A soma dos valores é: " + soma);

        scanner.close();
    }
}
