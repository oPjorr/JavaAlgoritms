package Udemy.lambda.Condicional.application;

import Udemy.lambda.Condicional.entities.Product;
import Udemy.lambda.Condicional.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Tablet", 350.50));

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, product -> product.getName().toLowerCase().charAt(0) == 'm');
        System.out.println(String.format("%.2f", sum));
    }
}
