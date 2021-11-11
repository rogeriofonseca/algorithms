package br.com.rogeriofonseca.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    
    @Test
    @DisplayName("Should swap positions")
    void swapPostions(){
        Products[] products = {
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00),
            new Products("Tablet", 450.00),
            new Products("HD Case", 80.90),
        };

        Products[] expectedProductsSwaped = {
            new Products("HD Case", 80.90), // Notebook - swaped
            new Products("Tablet", 450.00),
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00), // HD Case - swaped
        };

        InsertionSort.sort(products);
        assertArrayEquals(expectedProductsSwaped, products);
    }
}
