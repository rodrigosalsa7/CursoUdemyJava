package org.example.exercicios;
import java.util.Locale;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
        // com quatro casas decimais conforme exemplos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, pi = 3.14159;

        System.out.println("Informe o valor do raio: ");
        R = sc.nextDouble();

        A = pi * R * R;

        System.out.printf("A área do círculo é: A=%.4f%n", A);

        sc.close();
    }
}
