package classes.lambda.Predicate.application;

import classes.lambda.Predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Tablet", 350.50));

//        opção 1 - lambda direto na função
//        list.removeIf(product -> product.getPrice() >= 100);

//        opção 2 - instanciar um objeto que implementa uma interface funcional
//        list.removeIf(new ProductPredicate());

//        opção 3 - method reference com mét odo estático
//        list.removeIf(Product::staticProductPredicate);

        //opção 4 - method reference com mét odo não estático
//        list.removeIf(Product::nonStaticProductPredicate);

//        opção 5 - expressão lambda declarada
//        Predicate<Product> predicate = product -> product.getPrice() >= 100.0;
//        list.removeIf(predicate);

//        opção 6 - lambda inline
//        list.removeIf(product -> product.getPrice() >= 100.0);
        for(Product p : list) {
            System.out.println(p);
        }
    }
}
