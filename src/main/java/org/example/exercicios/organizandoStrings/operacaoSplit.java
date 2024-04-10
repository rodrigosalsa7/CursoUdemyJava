package org.example.exercicios.organizandoStrings;

public class operacaoSplit {
    public static void main(String[] args) {
        //SPLIT separa por vetores a string que tem vários nomes

        String nome = "Rodrigo Salsa A da Silva";

        String[] vect = nome.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
        System.out.println(vect[4]);
    }
}
