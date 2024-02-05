package org.example.exercicios.estruturaCondicional;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigo, quantidade;
        double total;

        System.out.println("Informe o código do seu pedido: ");
        codigo = scanner.nextInt();
        System.out.println("Informe a quantidade de pedidos: ");
        quantidade = scanner.nextInt();

        if (codigo == 1){
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (quantidade == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.println("Total R$: " + total + ".");

        scanner.close();
    }
}
