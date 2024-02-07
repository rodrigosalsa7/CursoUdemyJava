package org.example.exercicios.estruturaCondicional;

import java.util.Scanner;

public class contagemMinutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutos;
        double conta = 50;

        System.out.println("Informe o número de minutos que utilizou nesse mês: ");
        minutos = scanner.nextInt();

        if (minutos > 100){
            //+= informa que o valor da conta é o valor da conta + alguma coisa (no caso o valor excedente.
            conta += (minutos - 100) * 2.0;
            System.out.println("Sua conta deu R$: " + conta);
        } else {
            System.out.println("Sua conta deu R$: " + conta);
        }

        scanner.close();
    }
}
