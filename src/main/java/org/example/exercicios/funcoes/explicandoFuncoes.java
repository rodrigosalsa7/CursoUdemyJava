package org.example.exercicios.funcoes;

import java.util.Scanner;

public class explicandoFuncoes {
    public static void main(String[] args) {

        /*representam um processamento que possui um significado
        - Matc.sqrt(double) calcula a raiz quadrada de um valor.
        -System.out.println(string) - mostra alguma coisa na tela.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        //regra para mostrar a raiz quadrada de "x"
        Math.sqrt(n);

        System.out.println("O valor da raiz quadrada do seu nímero é: " + Math.sqrt(n));
        scanner.close();
        }

    }

