package org.example.exercicios.course;

import org.example.exercicios.course.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    //Programa que mostra o estoque de uma loja, inclui uma quantidade de itens, retira e mostra o valor.

    //operação para transformar a moeda em dolar
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //fazer a interação entre a classe Product
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");

        //parâmetro para poder associar o nome vindo da scanner para o nome
        product.name = sc.nextLine();

        System.out.print("Price: ");
        //parâmetro para poder associar o preço.
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);


        sc.close();
    }
}
