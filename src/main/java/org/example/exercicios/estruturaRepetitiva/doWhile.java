package org.example.exercicios.estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        //transformar a temperatura e perguntar ao usuário se quer inserir uma nova temperatura.

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        char resposta;
        do {
            double C;

            System.out.print("Digite a temperatura em Celsius: ");
            C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("A temperatura em Fahrenheit é: %.2f%n ", F);
            System.out.println("Deseja inserir mais alguma temperatura? (s/n) ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');

        scanner.close();
    }
}
