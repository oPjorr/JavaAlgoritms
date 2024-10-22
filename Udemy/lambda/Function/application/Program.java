package Udemy.lambda.Function.application;
import Udemy.lambda.Function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Tablet", 350.50));

        // opção 1 - implementação da interface funcional
//        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // opção 2 - Reference method  com méto do estático
//        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

//        opção 3 - Reference method sem méto do estático
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

//        opção 4 - Expressão lambda declarada
        Function<Product, String> up = product -> product.getName().toUpperCase();
        List<String> names = list.stream().map(up).collect(Collectors.toList());


//        opção 5 - lambda inline
//        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
