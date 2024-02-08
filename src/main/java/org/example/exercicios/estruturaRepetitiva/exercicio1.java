package org.example.exercicios.estruturaRepetitiva;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        Scanner scanner = new Scanner(System.in);

        int senha;

        System.out.println("Informe a senha para acessar o Programa: ");
        senha = scanner.nextInt();

        while (senha != 2002){
            System.out.println("Senha incorreta, tente novamente!");
            senha = scanner.nextInt();
        }

        System.out.println("Senha correta!");
        scanner.close();
    }
}
