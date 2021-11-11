# :dart: algorithms
Algorithms implementation using TDD.

### :pushpin: [Selection Sort](https://en.wikipedia.org/wiki/Selection_sort)

**Business Rules:**
1. [Finding the smallest;](https://github.com/rogeriofonseca/algorithms/blob/a97df4e21c82642aadb79a952d5bafcd6a127b79/src/test/java/br/com/rogeriofonseca/algorithms/SelectionSortTest.java#L12)
```Java
    @Test
    @DisplayName("It should find the smallest price.")
    void findSmallest(){
        int indexExpected = 3;
        Products[] products = {
            new Products("TV", 900.00),
            new Products("Notebook", 1200.00),
            new Products("Tablet", 450.00),
            new Products("HD Case", 80.90) // Smallest price
        };

        int smallest = SelectionSort.findSmallest(products, 0, products.length - 1);

        assertEquals(indexExpected, smallest);
        assertEquals("HD Case", products[smallest].getModel());
    }
```
2. [Swapping array positions](https://github.com/rogeriofonseca/algorithms/blob/a97df4e21c82642aadb79a952d5bafcd6a127b79/src/test/java/br/com/rogeriofonseca/algorithms/SelectionSortTest.java#L27);
```Java
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
```
3. [Sorting positions](https://github.com/rogeriofonseca/algorithms/blob/69aeea357bd0441ed42708c2fc78f74a83cc8de3/src/test/java/br/com/rogeriofonseca/algorithms/SelectionSortTest.java#L53);
```Java
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
        assertArrayEquals(arrayExpected, arraySorted);
    }
```


![Selection Sort gif](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)


### Requirements:
- [**Maven**](https://maven.apache.org/install.html) :gear:
- **Java 8+** :coffee:

## How to use?
**Run the command:** <p>
`mvn clean install`
