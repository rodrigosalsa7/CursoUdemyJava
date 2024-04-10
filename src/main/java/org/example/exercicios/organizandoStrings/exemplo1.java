package org.example.exercicios.organizandoStrings;

public class exemplo1 {
    public static void main(String[] args) {
        String original = "RODRIGO salsa A da S  ";

        //para deixar todos as letras em minúsculas
        String s01 = original.toLowerCase();
        //converter para letras maiúsculas
        String s02 = original.toUpperCase();
        //converter para ELIMINAR os ESPAÇOS
        String s03 = original.trim();
        //montar uma nova String apontando do caracter desejado, no caso o 2 em diante
        String s04 = original.substring(2);
        //trocar os lugares, troca o primeiro que foi referenciado pelo segundo
        String s05 = original.replace('O','s');
        //para localizar a primeira posição da variável declarada
        int i = original.indexOf("DR");
        //para localizar a última ocorrência da variável
        int j = original.lastIndexOf("sa");

        System.out.println("Frase original: " + original);
        System.out.println("Frase com toLowerCase: " + s01);
        System.out.println("Frase com toUpperCase: " + s02);
        System.out.println("Frase com trim: " + s03);
        System.out.println("Frase com substring: " + s04);
        System.out.println("Frase com replace: " + s05);
        System.out.println("Frase com index0f: " + i);
        System.out.println("Frase com lastIndex0f: " + j);
    }
}
