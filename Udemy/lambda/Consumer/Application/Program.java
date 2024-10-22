package Udemy.lambda.Consumer.Application;
import Udemy.lambda.Consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Tablet", 350.50));

//        opção 1 - implementando a interface funcional
//        list.forEach(new PriceUpdate());

//        opção 2 - Reference method com mét odo estático
//        list.forEach(Product::staticPriceUpdate);

//        opção 3 - Reference method com mét odo não estático
//        list.forEach(Product::nonStaticPriceUpdate);

//        opção 4 - Expressão lambda declarada
//        double factor = 1.1;
//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//        list.forEach(cons);

//        opção 5 - lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        for(Product p : list) {
            System.out.println(p);
        }
    }
}
