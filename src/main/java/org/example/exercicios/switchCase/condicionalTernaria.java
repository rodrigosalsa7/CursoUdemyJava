package org.example.exercicios.switchCase;

import java.util.Scanner;

public class condicionalTernaria {

    public static void main(String[] args) {
    //(condição) ? valor_se_verdadeiro : valor_se_falso

        Scanner scanner = new Scanner(System.in);

        double preco, desconto;

        System.out.println("Informe o valor do produto: ");
        preco = scanner.nextDouble();

        desconto = (preco <= 20) ? preco * 0.01 : preco * 0.05;

        double precoFinal = preco - desconto;

        System.out.println("O valor do seu do seu produto é de R$: " + preco + ".");
        System.out.println("O valor do seu desconto é de R$: " + desconto + ".");
        System.out.println("O valor do seu produto com desconto ficou R$: " + precoFinal + "." );
        scanner.close();
    }
}
