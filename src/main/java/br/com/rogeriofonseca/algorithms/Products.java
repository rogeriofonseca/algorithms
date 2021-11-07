package br.com.rogeriofonseca.algorithms;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Products)) {
            return false;
        }
        Products products = (Products) o;
        return price == products.price && Objects.equals(model, products.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }
}
