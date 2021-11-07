package br.com.rogeriofonseca.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    @DisplayName("It should find the smallest price.")
    void findSmallets(){
        Products[] products = {
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00),
            new Products("Tablet", 450.00),
            new Products("HD Case", 80.90)
        };

        int smallest = SelectionSort.findSmallest(products);
        int indexExpected = 3;
        assertEquals(indexExpected, smallest);
    }
}
