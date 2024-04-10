package org.example.exercicios.operadoresBitWise;

public class exemplo1 {
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 60;

        //"E" bit a bit
        System.out.println(n1 & n2);
        //"OU" bit a bit
        System.out.println(n1 | n2);
        //OU-exclusivo" bit a bit
        System.out.println(n1 ^ n2);
    }
}
