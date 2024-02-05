package org.example.exercicios.estruturaCondicional;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Qual horário começou a jogar?");
        horaInicial = scanner.nextInt();
        System.out.println("Qual o horário que terminou de jogar?");
        horaFinal = scanner.nextInt();

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou: " + duracao + " hora(s).");

        scanner.close();
    }
}
