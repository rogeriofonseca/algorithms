package br.com.rogeriofonseca.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.MessageFormat;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    @DisplayName("It should find the smallest price.")
    void findSmallest(){
        int indexExpected = 3;
        Products[] products = {
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00),
            new Products("Tablet", 450.00),
            new Products("HD Case", 80.90)
        };

        int smallest = SelectionSort.findSmallest(products, 0, products.length - 1);

        assertEquals(indexExpected, smallest);
        assertEquals("HD Case", products[smallest].getModel());
    }

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
            new Products("TV", 900.00),
            new Products("HD Case", 80.90), // Notebook - swaped
            new Products("Tablet", 450.00),
            new Products("Notebook", 1200.00), // HD Case - swaped
        };

        SelectionSort.swapPositions(products, 1, 3);
        assertArrayEquals(expectedProductsSwaped, products);
    }

    @Test
    @DisplayName("Should sort array")
    void sortArray(){
        Products[] arrayInput = {
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00),
            new Products("Tablet", 450.00),
            new Products("HD Case", 80.90),
        };

        Products[] arrayExpected = {
            new Products("HD Case", 80.90), // Notebook - swaped
            new Products("Tablet", 450.00),
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00), // HD Case - swaped
        };

        Products[] arraySorted = SelectionSort.sort(arrayInput);

        // Print array sorted
        // System.out.println("Array sorted: ");
        // Arrays.stream(arraySorted)
        //     .forEach(e-> {
        //         String message = MessageFormat.format("Price: {0}, Model: {1}", e.getPrice(), e.getModel());
        //         System.out.println(message);
        //     });

        assertArrayEquals(arrayExpected, arraySorted);
    }
}
