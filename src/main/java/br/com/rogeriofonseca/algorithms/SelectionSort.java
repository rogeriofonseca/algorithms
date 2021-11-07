package br.com.rogeriofonseca.algorithms;

public class SelectionSort {

    public static int findSmallest(Products[] products) {

        int cheaperIndex = 0;
        for(int i = 0; i < products.length; i++) {
            if(products[cheaperIndex].getPrice() > products[i].getPrice()) {
                cheaperIndex = i;
            }
        }

        return cheaperIndex;
    }
}
