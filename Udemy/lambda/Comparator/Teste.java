package Udemy.lambda.Comparator;

import java.util.*;

public class Teste {
    public static void main(String[] args) throws  NullPointerException {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Tablet", 350.50));

//         opção 1 - criar um classe(comparador) separado e chamá-lo para fazer a ordenação
        list.sort(new MyComparator());

        // opção 2 - atribuir o comparador à uma variável
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
//            }
//        };
//        list.sort(comp);

        // opção 3 - ordenar com funções anônimas(lambdas)
//        Comparator<Product> comp = (o1, o2) -> {return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());};
//        list.sort(comp);

        // opção 4 - ordenar com funções anônimas(sem chaves)
//        Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
//        list.sort(comp);

//        opção 5 - passar a função lambda direto como parâmetro
//        list.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));

        for(Product p : list) {
            System.out.println(p.name);
        }
    }
}
