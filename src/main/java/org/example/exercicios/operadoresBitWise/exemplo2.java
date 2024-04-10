package org.example.exercicios.operadoresBitWise;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mask = 0b00100000; //0b indica um número binário no java e o restante equivale ao número 32 em binário.
        int n = scanner.nextInt();

        if ((n & mask) != 0 ){
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }
        scanner.close();

    }
}

