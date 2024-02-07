package org.example.exercicios.switchCase;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        String dia;

        System.out.println("Informe o número do dia da semana: ");
        x = scanner.nextInt();

        switch (x){
            case 1: dia = "Domingo";
                break;
            case 2: dia = "Segunda" ;
                break;
            case 3: dia = "Terça";
                break;
            case 4: dia = "Quarta";
                break;
            case 5: dia = "Quinta";
                break;
            case 6: dia= "Sexta";
                break;
            case 7: dia = "Sábado";
                break;
            default: dia = "Valor inválido";
        }
        System.out.println("O dia da semana indicado é: " + dia + ".");
        scanner.close();
    }
}
