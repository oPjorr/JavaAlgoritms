package Udemy.stream;

import Udemy.lambda.Comparator.Product;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        st1.forEach(System.out::println);
        System.out.println(st1);

        Map<String, Product> mapa = new HashMap<>();
    }
}
