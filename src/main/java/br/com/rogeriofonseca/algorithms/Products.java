package br.com.rogeriofonseca.algorithms;

public class Products {

    public Products(String model, double price) {
        this.model = model;
        this.price = price;
    }

    double price;
    String model;

    public double getPrice() {
        return this.price;
    }
}
