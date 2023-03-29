package org.example.lab0;

import java.io.IOException;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "Products.csv";
    public static void main(String[] args) throws IOException {

//        Product product = Product.create(
//                27,
//                "Макароны",
//                "Макароны",
//                50,
//                122,
//                "piece");
//
//        Service.writeData(FILE_PATH, product);

        List<Product> products = Service.readData(FILE_PATH);

        Product linearSearchProduct = Sort.linearSearch(products, 2);
        System.out.println(linearSearchProduct);

        Product binarySearchProduct = Sort.binarySearch(products, 3);
        System.out.println(binarySearchProduct);

        Product interpolationSearchProduct = Sort.interpolationSearch(products, 4);
        System.out.println(interpolationSearchProduct);

        Product fibonacciSearchProduct = Sort.fibonacciSearch(products, 5);
        System.out.println(fibonacciSearchProduct);

        Product treeSearchProduct = Sort.searchInTree(products, 6);
        System.out.println(treeSearchProduct);


    }

}