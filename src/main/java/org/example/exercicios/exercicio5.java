package org.example.exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valor, salarioDia, salarioSemana, salarioMes;

        System.out.println("Informe o número do funcionário: ");
        numero = sc.nextInt();
        System.out.println("Informe o valor que recebe por hora: ");
        valor = sc.nextDouble();
        System.out.println("Informe as horas trabalhadas no dia: ");
        horas = sc.nextInt();

        salarioDia = valor * horas;
        salarioSemana = salarioDia * 6;
        salarioMes = salarioDia * 22;

        System.out.println("NUMBER: " + numero);
        System.out.println("SALARY DAY: " + salarioDia);
        System.out.println("SALARY WEEK: " + salarioSemana);
        System.out.println("SALARY MONTH: " + salarioMes);
    }
}

