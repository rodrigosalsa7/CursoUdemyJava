package org.example;

import java.util.Scanner;

public class entradaDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String saudacao;
        String nome;
        int idade;
        double altura;
        //char mostra apenas a primeira letra mesmo digitando uma palavra
        char sexo;

        //informando a saudação
        saudacao = sc.nextLine();
        //perguntando o nome ao usuário
        nome = sc.next();
        //perguntando a altura do usuário
        altura = sc.nextDouble();
        //perguntando a idade ao usuário
        idade = sc.nextInt();
        //perguntando o sexo do usuário
        sexo = sc.next().charAt(0);

        System.out.println(saudacao + ",");

        System.out.println("Seu nome é: " + nome + " você tem " + altura +
                " de altura, sua idade é:  " + idade + " anos. Você é do sexo: " + sexo);

        sc.close();
    }
}
