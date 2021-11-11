package br.com.rogeriofonseca.algorithms;

public class InsertionSort {

    public static Products[] sort(Products[] products) {
        int currentIndex = products.length - 1;

        while (currentIndex > 0) {
            int previousIndex = currentIndex -1;
            while (previousIndex >= 0 && products[previousIndex].getPrice() > products[currentIndex].getPrice()) {
                // swap Position
                swapPosition(products, previousIndex, currentIndex);
                previousIndex--;
            }
            currentIndex--;
        }

        return products;
    }
 
    private static void swapPosition(Products[] products, int prev, int current) {
        Products previousItem = products[prev];
        Products currentItem = products[current];
        products[prev] = currentItem;
        products[current] = previousItem;
    }
}
