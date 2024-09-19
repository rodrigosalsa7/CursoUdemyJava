package org.example.exercicios.course.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //operação para mostrar o valor do estoque
    public double totalValueInStock(){
        return price * quantity;
    }

    //pegar a quantidade do estoque e somar com o valor digitado em tela
    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    //operação que remove os produtos
    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    //método para ler tudo como string na saída em tela.
    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + " , " + quantity + " units, " + " Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
