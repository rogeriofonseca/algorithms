package br.com.rogeriofonseca.algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static int findSmallest(Products[] products, int begin, int end) {

        int cheaperIndex = begin;
        for(int i = begin; i <= end; i++) {
            if(products[cheaperIndex].getPrice() > products[i].getPrice()) {
                cheaperIndex = i;
            }
        }

        return cheaperIndex;
    }

    public static void swapPositions(Products[] products, int positionA, int positionB) {

        Products produtoA = products[positionA];
        Products produtoB = products[positionB];
        products[positionA]  = produtoB;
        products[positionB]  = produtoA;
    }

    public static Products[] sort(Products[] arrayInput) {
        for(int i = 0; i < arrayInput.length; i++) {
            int smallerIndex = findSmallest(arrayInput, i, arrayInput.length - 1);
            swapPositions(arrayInput, i, smallerIndex);
        }
        return arrayInput;
    }

}
